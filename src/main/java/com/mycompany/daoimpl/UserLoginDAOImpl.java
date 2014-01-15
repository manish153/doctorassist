//package com.mycompany.daoimpl;
//
//
//import java.util.List;
//import org.hibernate.SessionFactory;
//import org.springframework.orm.hibernate3.HibernateTemplate;
//
//import com.mycompany.dao.UserLoginDAO;
//import com.mycompany.model.Users;
//
//public class UserLoginDAOImpl implements UserLoginDAO {
//
//	
//	private HibernateTemplate hibernateTemplate;
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
//	}
//
//	@Override
//	public Users loadUserByName(String name) {
//		if (name != null && !name.equals("")) {
//			List<Users> usr = hibernateTemplate
//                    .find("from Users where username ='" + name + "'");
//
//			if (usr.size() == 1) {
//				return usr.get(0);
//			} else {
//				return null;
//			}
//		} else {
//			return null;
//		}
//	}
//}
