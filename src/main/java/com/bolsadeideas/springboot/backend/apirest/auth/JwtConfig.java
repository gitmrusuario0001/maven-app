package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAuPn+/9C3Era1vn/r/j0AgNyR0ZH3fCgH3YA4c3EsYbPaFAEY\r\n" + 
			"gcDNp3RH/ZhqO1AJXvycypDglFfxJdlSGuqrcM9ySyguHrGRyiM+qJLRNSRHXH9A\r\n" + 
			"pjSr8W0DibLiYB5ohjAPojEVa4qwRKPTQgHX0Tv/c0rXYBl7Q2TvBHuj0J3Igjjd\r\n" + 
			"X5hecvvQQlkPAiUfp4yveJd4wIveUQChXVa5jXhUOkyLpfXPDcLzMokpdPxiJfM2\r\n" + 
			"MZO4ZdRG1X9b4OaC7PqwsiFoxuSoTRz4uaGlrC3r1rk5gRRgrV79Jz6xcC0QEUU3\r\n" + 
			"OEU41m1Z667H14MZ3hyJy3Qi0yK6IX+ihBuRJQIDAQABAoIBAGDrC8K5dtKlTMCN\r\n" + 
			"gfbpu3PJHdXyZvt0dfqGjg1ehOSEOYU1tcN2Y8qTUIz86Nw+6UoNjZFNK35OPZmZ\r\n" + 
			"Lj3QKxemeboLSW7nlv2UTeZBVsBDS+iY/CSZgGW0up/RTG8UP6vfTrGqihCY0BaG\r\n" + 
			"x8/T62JDz2p3EjXV5BHBtsJgjcplnXnmbAaatlFTaxjKrpy0ZtAX5bfV/QFKW4gX\r\n" + 
			"wFHNibyzbXosmTYa0YNfsrGz72DA9ySRZGdiwobKc47CuOh9iFLWssKytj4bZUen\r\n" + 
			"AcrPk8MS2xSAy6Otm40XC6+6X2GuwlcE7RyhjBszqKZADbuSyjtXpKJRB2b5gHTj\r\n" + 
			"PS38kUECgYEA2fBywVJleW+Uz7JqtEiU6CcE8FHrivyqcvkBIHflNrmVyVcLxVQG\r\n" + 
			"/K2212xxqNmNcniD+EXgLhe5bJEyYdSgBcSVgwsy81SR0dsH6zjl9LxAEwxB15Qv\r\n" + 
			"6qROJl0kILin+51pg1APUj07a6lnreRyVfObTQlN8xlMOQV5tkt9qM0CgYEA2Ufc\r\n" + 
			"4Oxj1tVBiytnzj3m+GG/3x8Rwwlp1IjdjIt1grETLffE+gKE00Dj2XDnI6Y9r/P8\r\n" + 
			"y7rFX70bYwSKeHNwP1XwgYOF0vmBd7nI/3ktnmYEMllEGpq9nByjkYJS39UDDzDX\r\n" + 
			"LxJnEgcDaScXKfdbGJeh911iyQG+thV6yp5S6bkCgYBZuhsk6K2Kj5vu3v/7dZ6I\r\n" + 
			"7fekkbWuJVRvvYDvQy2FmGbI3COmfG/b/BE5JBavc9I+fMuonewsTewzfJwHlyjC\r\n" + 
			"9yqvJx80+26Fve3GtEhIuHCQ5wz8mrAXpMngFZzYM+5FM4vLWlzUeQ1LyBU9jL5e\r\n" + 
			"EMuxrdD/8zxkhZKUsQPtSQKBgQC64p2v9IMXOEvs2QOrGAE+qEzxK3cKi2E0hhgR\r\n" + 
			"F66WH5pAknkhFOOMFKcl0n9sYUNzwOcxkE7Nvwj8TN6RJbFpOJDpxOdpBGQAR5MD\r\n" + 
			"cgXz1QlNCQyT2X629McXk8GWdk/wU/DxsuFmVxPu8MlytifrahjMe81I2LBhSu5X\r\n" + 
			"sn/cOQKBgBwp3L14P1cTZzR+nCn+T613X8T0Bgc7yb8qutDX4WjlQvyzhlHIaXQf\r\n" + 
			"WTkBFktjqbVteTe8qm2KopVui5MD1AumtoYs2vZN4Ur0gVtMcj58FLvxlEFrPqtS\r\n" + 
			"4+s8+QEZd+VwxKRHkoAz2bCMAd99mtcq5xsPdneHHcBrrdw4M1v8\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuPn+/9C3Era1vn/r/j0A\r\n" + 
			"gNyR0ZH3fCgH3YA4c3EsYbPaFAEYgcDNp3RH/ZhqO1AJXvycypDglFfxJdlSGuqr\r\n" + 
			"cM9ySyguHrGRyiM+qJLRNSRHXH9ApjSr8W0DibLiYB5ohjAPojEVa4qwRKPTQgHX\r\n" + 
			"0Tv/c0rXYBl7Q2TvBHuj0J3IgjjdX5hecvvQQlkPAiUfp4yveJd4wIveUQChXVa5\r\n" + 
			"jXhUOkyLpfXPDcLzMokpdPxiJfM2MZO4ZdRG1X9b4OaC7PqwsiFoxuSoTRz4uaGl\r\n" + 
			"rC3r1rk5gRRgrV79Jz6xcC0QEUU3OEU41m1Z667H14MZ3hyJy3Qi0yK6IX+ihBuR\r\n" + 
			"JQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
