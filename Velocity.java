package com.node;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Velocity {

	public static void main(String[] args) {

		VelocityEngine velocityObject = new VelocityEngine();
		velocityObject.init();
		Template t = velocityObject.getTemplate("file.vm");
		VelocityContext context = new VelocityContext();
		context.put("name", "Sam");
		ArrayList<Object> list = new ArrayList<Object>();
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("cars", "Aston Martin");
		obj.put("bikes", "Ducati");
		list.add(obj);
		obj = new HashMap<String, String>();
		obj.put("cars", "Audi");
		obj.put("bikes", "BMW");
		list.add(obj);
		obj = new HashMa<String, String>();
		obj.put("cars", "Tesla");
		obj.put("bikes", "Suzuki");
		list.add(obj);
		obj = new HashMap<String, String>();
		obj.put("cars", "Hummer");
		obj.put("bikes", "Kawasaki");
		list.add(obj);
		context.put("items", list);
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		System.out.println(writer.toString());

	}

}