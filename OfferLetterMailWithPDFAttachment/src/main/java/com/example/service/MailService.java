package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
		
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendOfferLetter(Employee employee){
		
		try {
			MimeMessage message = javaMailSender.createMimeMessage();
		
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setTo(employee.getEmployeeEmail());
			helper.setSubject("Offer Letter : for "+ employee.getDesignation());
			
			   String body =
	                    "Dear " + employee.getEmployeeName() + ",\n\n" +
	                    "Congratulations!\n\n" +
	                    "We are pleased to offer you the position of "
	                    + employee.getDesignation() + ".\n\n" +
	                    "Please find the attached Offer Letter PDF.\n\n" +
	                    "Regards,\n" +
	                    "HR Team\n" +
	                    "ABC Technologies";
			   helper.setText(body);
			   FileSystemResource file = new FileSystemResource("C:\\Users\\Dell\\OneDrive\\Desktop\\Vaibhav_Pekhale_Resume.pdf");
			   helper.addAttachment(file.getFilename(), file);
			   javaMailSender.send(message);
			   IO.println("Send ");
			   
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
