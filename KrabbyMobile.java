import pkg.*;
public class KrabbyMobile
{
	private Rectangle lettuce;
	private Ellipse tomato;
	private Ellipse onion;
	private Ellipse onionlayer;
	private Ellipse oL2;
	private Rectangle cheese;
	private Rectangle cL;
	private Ellipse patty;
	private Ellipse bun;
	
	//Sesame seeds
	private Ellipse seed1;
	private Ellipse seed1L;
	private Ellipse seed2;
	private Ellipse seed2L;
	private Ellipse seed3;
	private Ellipse seed3L;
	private Ellipse seed4;
	private Ellipse seed4L;
	private Ellipse seed5;
	private Ellipse seed5L;
	private Ellipse seed6;
	private Ellipse seed6L;
	private Ellipse seed7;
	private Ellipse seed7L;
	private Ellipse seed8;
	private Ellipse seed8L;
	
	private Ellipse w1;
	private Ellipse w1L;
	private Ellipse w2;
	private Ellipse w2L;
	
	private Color BROWN;
	private Color SEED;
	private Color PURPLE;
	 
	public KrabbyMobile(double x, double y){
		  lettuce = new Rectangle(75,175,450,15);
		
		  tomato = new Ellipse(75,190,450,25);
		
		  onion = new Ellipse(75,215,450,25);
		  onionlayer = new Ellipse(75,215,450,25);
		  oL2 = new Ellipse(50,215,430,25);
		
		  cheese = new Rectangle(75,240,450,10);
		  cL = new Rectangle(75,240,450,10);
		
		  patty = new Ellipse(75,250,450,50);
		
		  bun = new Ellipse(100,100,400,250);
		
		  seed1 = new Ellipse(195,125,10,7);
		  seed1L = new Ellipse(195,125,10,7);
		  seed2 = new Ellipse(225,135,10,7);
		  seed2L = new Ellipse(225,135,10,7);
		  seed3 = new Ellipse(255,125,10,7);
		  seed3L = new Ellipse(255,125,10,7);
		  seed4 = new Ellipse(285,135,10,7);
		  seed4L = new Ellipse(285,135,10,7);
		  seed5 = new Ellipse(305,125,10,7);
		  seed5L = new Ellipse(305,125,10,7);
		  seed6 = new Ellipse(335,135,10,7);
		  seed6L = new Ellipse(335,135,10,7);
		  seed7 = new Ellipse(365,125,10,7);
		  seed7L = new Ellipse(365,125,10,7);
		  seed8 = new Ellipse(395,135,10,7);
		  seed8L = new Ellipse(395,135,10,7);
		
		  w1 = new Ellipse(330,340,50,50);
		  w1L= new Ellipse(330,340,50,50);
		  w2 = new Ellipse(220,340,50,50);
		  w2L = new Ellipse(220,340,50,50);
		 
		 BROWN = new Color(117, 64, 18);
		 SEED = new Color(255, 246, 161);
		 PURPLE = new Color(222, 168, 247);
	}
	
	public void fill(){
		
		
		bun.fill();
		bun.setColor(Color.ORANGE);
		
		seed1.fill();
		seed1.setColor(SEED);
		seed1L.draw();
		seed2.fill();
		seed2.setColor(SEED);
		seed2L.draw();
		seed3.fill();
		seed3.setColor(SEED);
		seed3L.draw();
		seed4.fill();
		seed4.setColor(SEED);
		seed4L.draw();
		seed5.fill();
		seed5.setColor(SEED);
		seed5L.draw();
		seed6.fill();
		seed6.setColor(SEED);
		seed6L.draw();
		seed7.fill();
		seed7.setColor(SEED);
		seed7L.draw();
		seed8.fill();
		seed8.setColor(SEED);
		seed8L.draw();
		
		lettuce.fill();
		lettuce.setColor(Color.GREEN);
		
		tomato.fill();
		tomato.setColor(Color.RED);
		
		onion.fill();
		onion.setColor(PURPLE);
		onionlayer.draw();
		oL2.setColor(PURPLE);
		
		cheese.fill();
		cheese.setColor(Color.YELLOW);
		cL.draw();
		
		patty.fill();
		patty.setColor(BROWN);
		
		w1.fill();
		w1.setColor(Color.GREEN);
		w1L.draw();
		w2.fill();
		w2.setColor(Color.GREEN);
		w2L.draw();
	}
	
	
		 // Rectangle lettuce = new Rectangle(75,175,450,15);
		
		 // Ellipse tomato = new Ellipse(75,190,450,25);
		
		 // Ellipse onion = new Ellipse(75,215,450,25);
		 // Ellipse onionlayer = new Ellipse(75,215,450,25);
		 // Ellipse oL2 = new Ellipse(50,215,430,25);
		
		 // Rectangle cheese = new Rectangle(75,240,450,10);
		 // Rectangle cL = new Rectangle(75,240,450,10);
		
		 // Ellipse patty = new Ellipse(75,250,450,50);
		
		 // Ellipse bun = new Ellipse(100,100,400,250);
		
		 // Ellipse seed1 = new Ellipse(195,125,10,7);
		 // Ellipse seed1L = new Ellipse(195,125,10,7);
		 // Ellipse seed2 = new Ellipse(225,135,10,7);
		 // Ellipse seed2L = new Ellipse(225,135,10,7);
		 // Ellipse seed3 = new Ellipse(255,125,10,7);
		 // Ellipse seed3L = new Ellipse(255,125,10,7);
		 // Ellipse seed4 = new Ellipse(285,135,10,7);
		 // Ellipse seed4L = new Ellipse(285,135,10,7);
		 // Ellipse seed5 = new Ellipse(305,125,10,7);
		 // Ellipse seed5L = new Ellipse(305,125,10,7);
		 // Ellipse seed6 = new Ellipse(335,135,10,7);
		 // Ellipse seed6L = new Ellipse(335,135,10,7);
		 // Ellipse seed7 = new Ellipse(365,125,10,7);
		 // Ellipse seed7L = new Ellipse(365,125,10,7);
		 // Ellipse seed8 = new Ellipse(395,135,10,7);
		 // Ellipse seed8L = new Ellipse(395,135,10,7);
		
		 // Ellipse w1 = new Ellipse(330,340,50,50);
		 // Ellipse w1L= new Ellipse(330,340,50,50);
		 // Ellipse w2 = new Ellipse(220,340,50,50);
		 // Ellipse w2L = new Ellipse(220,340,50,50);
        // public static void main(String args[])
        // {
			// following line is necessary for onMouseClick, don't change
			// MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			// KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		// Color BROWN = new Color(117, 64, 18);
		// Color SEED = new Color(255, 246, 161);
		// Color PURPLE = new Color(222, 168, 247);
		
		// bun.fill();
		// bun.setColor(Color.ORANGE);
		
		// seed1.fill();
		// seed1.setColor(SEED);
		// seed1L.draw();
		// seed2.fill();
		// seed2.setColor(SEED);
		// seed2L.draw();
		// seed3.fill();
		// seed3.setColor(SEED);
		// seed3L.draw();
		// seed4.fill();
		// seed4.setColor(SEED);
		// seed4L.draw();
		// seed5.fill();
		// seed5.setColor(SEED);
		// seed5L.draw();
		// seed6.fill();
		// seed6.setColor(SEED);
		// seed6L.draw();
		// seed7.fill();
		// seed7.setColor(SEED);
		// seed7L.draw();
		// seed8.fill();
		// seed8.setColor(SEED);
		// seed8L.draw();
		
		// lettuce.fill();
		// lettuce.setColor(Color.GREEN);
		
		// tomato.fill();
		// tomato.setColor(Color.RED);
		
		// onion.fill();
		// onion.setColor(PURPLE);
		// onionlayer.draw();
		// oL2.setColor(PURPLE);
		
		// cheese.fill();
		// cheese.setColor(Color.YELLOW);
		// cL.draw();
		
		// patty.fill();
		// patty.setColor(BROWN);
		
		// w1.fill();
		// w1.setColor(Color.GREEN);
		// w1L.draw();
		// w2.fill();
		// w2.setColor(Color.GREEN);
		// w2L.draw();
		// }
		
		
}
