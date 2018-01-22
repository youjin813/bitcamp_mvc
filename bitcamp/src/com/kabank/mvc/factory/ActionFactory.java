package com.kabank.mvc.factory;

import com.kabank.mvc.enums.Action;

public class ActionFactory {
	public static Action create(String x) {
		Action action = null;
		
		if(x==null || x.equals("") == true) {x="move";}
		System.out.println("ACTION FACTORY move 입력 x:"+ x);
		switch (x) {
		case "move":
			action=Action.MOVE;
			break;
		
		case "mypage":
			action=Action.MOVE;
			break;
		
		case "login":
			action=Action.LOGIN;
			break;
		
		case "logout":
			action=Action.LOGOUT;
			break;
	
		case "change_pass":
			action=Action.CHANGE_PASS;
			break;
		
		case "delete":
			action=Action.DELETE;
			break;
		
		case "add":
			action=Action.ADD;
			break;
			
		case "create_account":
			action=Action.CREATE_ACCOUNT;
			break;
		
		case "open_phone":
			action=Action.OPEN_PHONE;
			break;
		
		default:
			action=Action.MOVE;
			break;
		}
		System.out.println("ACTION IS:"+action.toString());
		return action;
	}
}
