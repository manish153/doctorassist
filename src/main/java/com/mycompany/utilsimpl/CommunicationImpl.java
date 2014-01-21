package com.mycompany.utilsimpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mycompany.utils.Communication;

@Service("CommunicationImpl")
public class CommunicationImpl implements Communication {
	
	private JavaMailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
	
	@Override
	public void SendEmail(String To) {
		
		MimeMessage message = mailSender.createMimeMessage();
		try{
			MimeMessageHelper helper = new MimeMessageHelper (message, true);
            helper.setFrom(simpleMailMessage.getFrom());
			helper.setTo(To);
			helper.setSubject(simpleMailMessage.getSubject());
			helper.setText("this is a test email", false);

			/* write code for attachment 
			 * if checkbox is checked include attachment
			 * else
			 * no attachment in the email 
			 */
		}
		catch (MessagingException e){
			throw new MailParseException(e);			
		}
		 mailSender.send(message);
	}

	@Override
	public void SendEmail(String To, String Cc) {
		
		MimeMessage message = mailSender.createMimeMessage();
		try{
			MimeMessageHelper helper = new MimeMessageHelper (message, true);
            helper.setFrom(simpleMailMessage.getFrom());
			helper.setTo(To);
	        helper.setCc(Cc);
			
			helper.setSubject(simpleMailMessage.getSubject());
			helper.setText("this is a test email", false);
			/* write code for attachment 
			 * if checkbox is checked include attachment
			 * else
			 * no attachment in the email 
			 */
		}
		catch (MessagingException e){
			throw new MailParseException(e);			
		}
		 mailSender.send(message);
	}

	@Override
	public void SendEmail(String To, String Cc, String Bcc) {
		// TODO Auto-generated method stub
		
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public SimpleMailMessage getSimpleMailMessage() {
		return simpleMailMessage;
	}

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	
}
