package com.example;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MessageService;

@RestController
public class Controller {
	
	@Autowired
	private MessageService ms;
	
	@RequestMapping(path="feedMessageData")
	public void setDataInDB() {
		try {
			ms.saveData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
