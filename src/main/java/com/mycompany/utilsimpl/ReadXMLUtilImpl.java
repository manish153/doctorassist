package com.mycompany.utilsimpl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.XmlElementServiceImpl;
import com.mycompany.utils.ReadXMLUtil;

@Service("ReadXMLService")
public class ReadXMLUtilImpl implements ReadXMLUtil{
	
	public void convertToXML(){
		
		XmlElementServiceImpl patient = new XmlElementServiceImpl();
		patient.setId(100);
		patient.setAge(35);
		patient.setName("John");
		
		
		
		try {
			 
			File file = new File("M:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(XmlElementServiceImpl.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(patient, file);
			jaxbMarshaller.marshal(patient, System.out);
	 
		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
		
		
		
	}
	
	
	public void convertXmlToJava(){
		
		try {
			 
			File file = new File("M:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(XmlElementServiceImpl.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			XmlElementServiceImpl patient1 = (XmlElementServiceImpl) jaxbUnmarshaller.unmarshal(file);
			System.out.println(patient1);
			System.out.println(patient1.getAge());
			System.out.println(patient1.getId());
			System.out.println(patient1.getName());
			
	 
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	 
		
	}
	

}
