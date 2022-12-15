package com.masai.exceptions;

//import org.apache.logging.log4j.message.Message;

public class PlayerNotFount extends Exception{

	public PlayerNotFount(){
		
	}
	
	public PlayerNotFount(String Message ){
		super(Message);
	}
	
}
