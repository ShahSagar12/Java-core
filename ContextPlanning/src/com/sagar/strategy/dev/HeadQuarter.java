package com.sagar.strategy.dev;

import com.sagar.strategy.Plann;
import com.sagar.strategy.impl.Devastative;
import com.sagar.strategy.impl.Emergency;
import com.sagar.strategy.impl.Normal;
import com.sagar.strategy.impl.Winning;
import com.sagar.strategy.util.ContextType;

public class HeadQuarter {

	public  Plann get(String devastative) {

		if(devastative.equalsIgnoreCase((ContextType.Devastative).toString())) {

			return new Devastative();
		}else if(devastative.equalsIgnoreCase((ContextType.Emergency).toString())){

			return new Emergency();			
		}else if(devastative.equalsIgnoreCase((ContextType.Normal).toString())){

			return new Normal();
		}else if(devastative.equalsIgnoreCase((ContextType.Winning).toString())){

			return new Winning();
		}else {
			System.out.println("Strategy Preparing");
			return null;

		}

	}
}
