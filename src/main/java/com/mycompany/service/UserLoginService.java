//package com.mycompany.service;
//
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import com.mycompany.dao.UserLoginDAO;
//import com.mycompany.model.CustomUser;
//
//import com.mycompany.model.UserGrantedAuthority;
//import com.mycompany.model.Users;
//
//public class UserLoginService implements UserDetailsService {
//
//	private UserLoginDAO userDao;
//
//	public void setUserDAO(UserLoginDAO u) {
//		userDao = u;
//	}
//
//	public UserDetails loadUserByUsername(String username) {
//		if (username != null && !username.equals("")) {
//			Users user = userDao.loadUserByName(username);
//			if (user == null) {
//				return null;
//			}
//	
//			GrantedAuthority grantedAuth = new UserGrantedAuthority(user.getRole());
//			CustomUser cu = new CustomUser(user.getId(), user.getUsername(), user.getPassword(),
//										   new GrantedAuthority[]{ grantedAuth });
//			return cu;
//		} else {
//			return null;
//		}
//	}
//
//}
