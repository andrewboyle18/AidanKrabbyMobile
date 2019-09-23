import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		static Rectangle lettuce = new Rectangle(75,175,450,15);
		
		static Ellipse tomato = new Ellipse(75,190,450,25);
		
		static Ellipse onion = new Ellipse(75,215,450,25);
		static Ellipse onionlayer = new Ellipse(75,215,450,25);
		static Ellipse oL2 = new Ellipse(50,215,430,25);
		
		static Rectangle cheese = new Rectangle(75,240,450,10);
		static Rectangle cL = new Rectangle(75,240,450,10);
		
		static Ellipse patty = new Ellipse(75,250,450,50);
		
		static Ellipse bun = new Ellipse(100,100,400,250);
		
		static Ellipse seed1 = new Ellipse(195,125,10,7);
		static Ellipse seed1L = new Ellipse(195,125,10,7);
		static Ellipse seed2 = new Ellipse(225,135,10,7);
		static Ellipse seed2L = new Ellipse(225,135,10,7);
		static Ellipse seed3 = new Ellipse(255,125,10,7);
		static Ellipse seed3L = new Ellipse(255,125,10,7);
		static Ellipse seed4 = new Ellipse(285,135,10,7);
		static Ellipse seed4L = new Ellipse(285,135,10,7);
		static Ellipse seed5 = new Ellipse(305,125,10,7);
		static Ellipse seed5L = new Ellipse(305,125,10,7);
		static Ellipse seed6 = new Ellipse(335,135,10,7);
		static Ellipse seed6L = new Ellipse(335,135,10,7);
		static Ellipse seed7 = new Ellipse(365,125,10,7);
		static Ellipse seed7L = new Ellipse(365,125,10,7);
		static Ellipse seed8 = new Ellipse(395,135,10,7);
		static Ellipse seed8L = new Ellipse(395,135,10,7);
		
		static Ellipse w1 = new Ellipse(330,340,50,50);
		static Ellipse w1L= new Ellipse(330,340,50,50);
		static Ellipse w2 = new Ellipse(220,340,50,50);
		static Ellipse w2L = new Ellipse(220,340,50,50);
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		Color BROWN = new Color(117, 64, 18);
		Color SEED = new Color(255, 246, 161);
		Color PURPLE = new Color(222, 168, 247);
		
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
		
		public void onMouseClick(double x, double y)
			{
				
			bun.translate(5,0);
			
			seed1.translate(5,0);
			seed1L.translate(5,0);
			seed2.translate(5,0);
			seed2L.translate(5,0);
			seed3.translate(5,0);
			seed3L.translate(5,0);
			seed4.translate(5,0);
			seed4L.translate(5,0);
			seed5.translate(5,0);
			seed5L.translate(5,0);
			seed6.translate(5,0);
			seed6L.translate(5,0);
			seed7.translate(5,0);
			seed7L.translate(5,0);
			seed8.translate(5,0);
			seed8L.translate(5,0);
			
			w1.translate(5,0);
			w1L.translate(5,0);
			w2.translate(5,0);
			w2L.translate(5,0);
			
			lettuce.translate(5,0);
			
			tomato.translate(5,0);
			
			onion.translate(5,0);
			
			oL2.translate(5,0);
			onionlayer.translate(5,0);
			
			cheese.translate(5,0);
			cL.translate(5,0);
			
			patty.translate(5,0);
			}
		
		public void keyPress(String s)
				{
				// temp holds the enter character
			
				char done = (char)10;
				String temp = Character.toString(done);
			
				}
}
