package com.aga.springboot.backend.apirest.models.services;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aga.springboot.backend.apirest.models.dao.IUsuarioDao;
import com.aga.springboot.backend.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService, UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);

		if(usuario == null) {
			logger.error("Error en el login: no existe el uusuario {0} '", username, "' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el uusuario '" + username + "' en el sistema!");
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(autority -> logger.info("Role: " + autority.getAuthority()))
				.collect(Collectors.toList());

		
		return new User(usuario.getUsername(), usuario.getPassword(), authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

}
