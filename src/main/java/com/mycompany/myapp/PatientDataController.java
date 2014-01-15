package com.mycompany.myapp;

import java.util.List;
import java.util.Locale;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.daoimpl.HibernateDaoImpl;
import com.mycompany.model.Patient;

@Controller
public class PatientDataController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientDataController.class);
	
//	@Autowired
//	public ReadXMLService readXMLService;
	
	@Autowired
	private HibernateDaoImpl hibernateDaoImpl;
	
	@RequestMapping(value = "/patientdata", method = RequestMethod.GET)
	public String patientdata(Locale locale, Model model){
		logger.info("patient data in the new PatientDataController controller");
		//ReadXML.convertToXML();
		//readXMLService.convertToXML();		
		
		
		Patient patient = new Patient();
		//patient.setPid(2);    //THIS IS NOW AUTO_INCREMENT IN THE DATABASE .. not working though.. lol 
		patient.setFirst_name("smith");
		patient.setLast_name("lastName");
		patient.setAge(66);
		
		
		Session session = hibernateDaoImpl.getSessionFactory().openSession();
		session.beginTransaction();
		//session.save(patient);
		Query q = session.createQuery("from Patient");
		@SuppressWarnings("unchecked")
		List<Patient> p1 = q.list();
		System.out.println("data loaded here");
		
		
		for(Patient p2 : p1){
			System.out.println(p2.getPid());
//			System.out.println(p2.getFirst_name());
//			System.out.println(p2.getLast_name());
//			System.out.println(p2.getAge());
//						
		}
		
		session.flush();
		session.close();
						
		return "patientdata";
	}
	
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(Locale locale, Model model){
		logger.info("this is the new success page, xml code should be executed now");
		
		return "success";
	}
	
	

}
