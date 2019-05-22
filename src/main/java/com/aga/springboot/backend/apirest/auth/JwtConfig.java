package com.aga.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String LA_LLAVE_SECRETA = "60591214.Agel";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAw0Gl5cHZADLbefaCcCF7COVXK4LfWX5Q+JXmDABW4Nr53Ht3\r\n" + 
			"FfJqH2el3eJeS+KHxEEpyaJe4/5WOD6TqrGmaK9gv59RfxRwxytIjFV9SsjlIiDj\r\n" + 
			"bF5ft9JZ206CFtIk2mJoyN6c/LKeilBUd64mbl/M23KTW/+gu1WPUERpAIhD8bdw\r\n" + 
			"2youe4IpcVu59ZVOduvUEErzynb0/P+zmqXn3bA6ZJMyBo5etAqESeEQC0DghXSQ\r\n" + 
			"uP5ydOar9+aR+Eid04iy46QwcXw9EAEr073lO/JoPuavJodV8Two/ixs7HAF6ni0\r\n" + 
			"T6M8eTlR48qXWpx6+VA0zTMQCu4bKG5S3pr1KQIDAQABAoIBAQCGU31r6MX+yv4O\r\n" + 
			"k7X8qivYXN5xQqGhEbNmsMkIbJtYKY1HT3EHmjPD0yxaz0aL8hXwv9udqaSaOPjb\r\n" + 
			"zMEN5xVSY4Stj08jm85SVsacNJvzfO2VYwbSIMK81WuX4hTA2mUcECOCPRPHDKLh\r\n" + 
			"CI5zn001FZb7SYFzAxNyjVQApm+OOvysKTWYvSBRq28uzLXjoThZbEX8Fq9XO4QT\r\n" + 
			"hG2xZRPQT92FvHywMrsUTe/97ZkZD/52YVgxTBJrsQoBYLVH7M0dLbR2pLP6/iWM\r\n" + 
			"OVe1WeA1dv1wWpYt82DL7is4nag6ZRdy8+oS4iJcLhgSuEDe6Kd+MaHwr6nb3KJP\r\n" + 
			"kOeWZIJ5AoGBAObXrDEQd6qLJe8/Tqy0+guJqOZkub0Zgd8I+ivwf251rTcqsOXB\r\n" + 
			"9I4fZ3EqkcwuuxbQuGaLbFOCGalxwz1gewaEALfyDVxn75ax9gbaEL8DorLScVRv\r\n" + 
			"3KUCLWMefTIK8VLg+Qv0sZ7XhcbQWm0opLoWOFfJbqbqVor+feq+V6trAoGBANiJ\r\n" + 
			"JwcLt9Xba8qqih+onEiZ54EGSYDV5NEBLjBtpAgQlUqIfZzQDoZ3CYzcNXsgr9p/\r\n" + 
			"36NMWwi/p/fS/et3WNJuNexcS6uTzCw1PHEIyy1gxxE38qGsstoXl+np2sOv6wxu\r\n" + 
			"j1t1b7TgMPVUgbCH7LOkHg04LYIOfNdgayu0T7q7AoGAVT5lZsTm+8JgosWk/t/h\r\n" + 
			"yiruhQ3DDRKDQ+Jjx6AK3rZz3YBVTLLf5S+xmjeXGWhUTCuNPMjVmszbPxg0edDL\r\n" + 
			"/W73ePXYezwiXGqhKIyUTIVCKnjNwtmACCsSqZyTrMwfq3RKY2DbyoVZ8D32doLg\r\n" + 
			"uZsE+V34D4lPpgouY2Ygp7sCgYBTiR3gTvn96+d6yS3+JqscKxuvoABNTrc2lnD+\r\n" + 
			"R94HKnadyWhETdO8tkGd8PpE5QhSkBBzzCo2htHC/sfsxh8jF1eANt8OczdKOsN1\r\n" + 
			"jAHuIK7Lirz0+E4Laxy1Jf26jqxsIF731qdgrTjV/GMH+ngrmX3qdajAytwIru7J\r\n" + 
			"bodvrwKBgA6zFixy74HeK8Z2kPsQKRpbNYGjwWyoqG/fbtlKc+D4LkXPr+iSplAi\r\n" + 
			"RrwodZa/BWmIjCrs7mBKb6lHuXpvtDtsxKTPwltYr8zei/kqnh+1ch/9UxDwvqkm\r\n" + 
			"qTWcnljS5dd5Eljb1t94v2hnVp7Y0klwAKKMekJTuCOsZAu4pAWq\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAw0Gl5cHZADLbefaCcCF7\r\n" + 
			"COVXK4LfWX5Q+JXmDABW4Nr53Ht3FfJqH2el3eJeS+KHxEEpyaJe4/5WOD6TqrGm\r\n" + 
			"aK9gv59RfxRwxytIjFV9SsjlIiDjbF5ft9JZ206CFtIk2mJoyN6c/LKeilBUd64m\r\n" + 
			"bl/M23KTW/+gu1WPUERpAIhD8bdw2youe4IpcVu59ZVOduvUEErzynb0/P+zmqXn\r\n" + 
			"3bA6ZJMyBo5etAqESeEQC0DghXSQuP5ydOar9+aR+Eid04iy46QwcXw9EAEr073l\r\n" + 
			"O/JoPuavJodV8Two/ixs7HAF6ni0T6M8eTlR48qXWpx6+VA0zTMQCu4bKG5S3pr1\r\n" + 
			"KQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
