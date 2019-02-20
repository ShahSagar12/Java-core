package com.sagar;

import com.sagar.model.Context;
import com.sagar.strategy.dev.HeadQuarter;
import com.sagar.strategy.util.ContextType;

public class Program {
	
	public static void main(String args[]) {
		HeadQuarter headQuarter=new HeadQuarter();
		Context context=new Context(headQuarter.get((ContextType.Devastative).toString()));
		context.executePlann();
		
		
		Context context2=new Context(headQuarter.get((ContextType.Winning).toString()));
		context.executePlann();
	}

}
