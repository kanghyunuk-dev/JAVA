package Ch20;

import java.util.List;

import Ch20.building.Barrack;
import Ch20.unit.Marine;
import Ch20.unit.Medic;
import Ch20.unit.Unit;

public class Main_02 {

	public static void main(String[] args) throws ClassNotFoundException {
		Barrack barrack = new Barrack();
		Marine m1 = barrack.genMarine();
		Medic m2 = barrack.genMedic();
		
		System.out.println(m1);
		System.out.println(m2);
		
		List<Unit> li1 = barrack.genUnit(Class.forName("Ch20.unit.Marine"), 5);
		li1.forEach((el)->{System.out.println((Marine)el);});
	}

}
