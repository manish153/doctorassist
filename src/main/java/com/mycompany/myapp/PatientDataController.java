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
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.daoimpl.HibernateDaoImpl;
import com.mycompany.model.Patient;
import com.mycompany.utilsimpl.CommunicationImpl;

@Controller
public class PatientDataController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientDataController.class);
	
//	@Autowired
//	public ReadXMLService readXMLService;
	
	@Autowired
	public CommunicationImpl communicationImpl;
	
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
	
	
	@RequestMapping(value = "/personal", method = RequestMethod.GET)
	public String personal(Locale locale, Model model){
		logger.info("personal");
	//	communicationImpl.SendEmail("luminary153@gmail.com");
	//	communicationImpl.SendEmail("Luminary153@gmail.com", "");
		
		return "personal";
	}
	
	
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public ModelAndView table(Locale locale, ModelAndView model){
		logger.info("table");
		
		Session session = hibernateDaoImpl.getSessionFactory().openSession();
		session.beginTransaction();		
		Query q = session.createQuery("from Patient");
		@SuppressWarnings("unchecked")
		List<Patient> p1 = q.list();
		
		session.flush();
		session.close();
		
		ModelAndView mv = new ModelAndView("/table");
		mv.addObject("p1", p1);
		
		return mv;
	}
	

}
