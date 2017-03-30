package edu.jalc.everydaythings.bottle.beverage;

import edu.jalc.everydaythings.bottle.Bottle;
import edu.jalc.everydaythings.liquid.beverage.Beverage;
import edu.jalc.everydaythings.Pourable;

abstract public class BeverageBottle extends Bottle {

	BeverageBottle(double capacity, Beverage beverage){
		super(capacity, beverage);
	}

	public Liquid pour(double amt){
		return new Liquid(5);
	}

}
