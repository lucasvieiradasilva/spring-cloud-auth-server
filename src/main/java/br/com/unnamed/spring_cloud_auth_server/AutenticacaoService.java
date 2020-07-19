package br.com.unnamed.spring_cloud_auth_server;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.unnamed.spring_cloud_auth_server.temp.Usuario;
import br.com.unnamed.spring_cloud_auth_server.temp.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService  {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(username);
		
		if(usuario.isPresent()) {
			return usuario.get();
		}
		throw new UsernameNotFoundException("Dados inválidos!");
	}
}

