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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.dao.SearchDAO;
import com.mycompany.daoimpl.HibernateDaoImpl;
import com.mycompany.daoimpl.SearchDAOImpl;
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

	@Autowired
	private SearchDAO searchDAO;
	
	@RequestMapping(value = "/newpatient", method = RequestMethod.GET)
	public String newpatient(@ModelAttribute("patient")
    Patient patient, BindingResult result){
		logger.info("patient data in the new PatientDataController controller");
		//ReadXML.convertToXML();
		//readXMLService.convertToXML();	
		
		System.out.println("this is the patientid " + patient.getPid());
		return "newpatient";
	}

	@RequestMapping(value = "/existingpatient", method = RequestMethod.GET)
	public String existingpatient(@ModelAttribute("patient") 
    Patient patient, BindingResult result){
		logger.info("This is the exisiting patient page");
		return "existingpatient";
	}

	
	@RequestMapping(value = "/existingpatient/search", method = RequestMethod.GET)
	public ModelAndView searchpatient(@RequestParam("searchid") int searchid){
		logger.info("this is the search id " + searchid);
		List<Object> patientresult = searchDAO.SearchPatientID(searchid);
		ModelAndView mv = new ModelAndView("/existingpatient");
		mv.addObject("patientresult", patientresult);
		return mv;
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(@ModelAttribute("patient") 
    Patient patient, BindingResult result){
		logger.info("this is the new success page, xml code should be executed now");
		
		System.out.println("this is the patientid in success page " + patient.getPid());
		
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
