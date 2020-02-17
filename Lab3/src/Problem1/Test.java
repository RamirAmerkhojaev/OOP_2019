package Problem1;
 

public class Test{


public static void main(String args[]) {

	Animal cat = new Cat(4);
	Animal pig = new Pig(4);
	
    cat.getVoice();
	System.out.println(cat);
	
    pig.getVoice(2);
    System.out.println(pig);
}
	
}
