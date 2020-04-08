package com.example.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Message;
import com.example.repository.MessageDTO;

@Service
public class MessageService {
	
	@Autowired
	private MessageDTO mdto;
	String line = "";
	
	public void saveData() throws IOException {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/cunique.csv"));
			br.readLine();
			while((line=br.readLine())!=null) {
				String data[] = line.split(",");
				Message msg = new Message();
				System.out.println(data[0]);
				System.out.println(data[1]);
				msg.setID(data[0]);
				msg.setMessage(data[1]);
				mdto.save(msg);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
