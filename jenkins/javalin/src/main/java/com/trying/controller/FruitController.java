package com.trying.controller;

import java.util.ArrayList;
import java.util.List;

import com.trying.Fruit;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.http.HttpCode;

public class FruitController {
	
	public static List<Fruit> fruitList = new ArrayList<>();

	public static void getFruitByName(Context ctx) {
			
			String name = ctx.pathParam("name");
			Fruit outgoingFruit = null;
			
			
			for(Fruit f: fruitList) {
				if(f.getName().equals(name)) {
					outgoingFruit =f;
					
				}
			}
			if(outgoingFruit == null) {
				ctx.status(HttpCode.NOT_FOUND);
			}else {
				ctx.json(outgoingFruit);
			}
			
		}



	public static void createFruit(Context ctx) {
		System.out.println(ctx.body());
		
		//fruit to be sent
		
		Fruit f= ctx.bodyAsClass(Fruit.class);
		System.out.println(f);
		fruitList.add(f);
		
		
		ctx.result("creating a fruit");
		ctx.status(HttpCode.CREATED);

	}

	public static void getFruiById(Context ctx) {
		// TODO Auto-generated method stub
		
	}

	public static void getAllFruits(Context ctx) {
		// TODO Auto-generated method stub
		ctx.json(fruitList);
	}

}
