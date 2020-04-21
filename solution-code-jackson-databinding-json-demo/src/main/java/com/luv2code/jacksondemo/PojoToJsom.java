package com.luv2code.jacksondemo;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class PojoToJsom {

	public static void main(String[] args) {
		Jsonb jsonb = JsonbBuilder.create();
		String result=jsonb.toJson(new Customer(1,"John","Doe",true,new Address(),new String[3]));
		System.out.println(result);
		

	}

}
