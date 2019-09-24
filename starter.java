import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		
			KrabbyMobile kMob = new KrabbyMobile(10,10);
			kMob.fill();
		}
		
		public void onMouseClick(double x, double y)
			{
				
			// bun.translate(5,0);
			
			// seed1.translate(5,0);
			// seed1L.translate(5,0);
			// seed2.translate(5,0);
			// seed2L.translate(5,0);
			// seed3.translate(5,0);
			// seed3L.translate(5,0);
			// seed4.translate(5,0);
			// seed4L.translate(5,0);
			// seed5.translate(5,0);
			// seed5L.translate(5,0);
			// seed6.translate(5,0);
			// seed6L.translate(5,0);
			// seed7.translate(5,0);
			// seed7L.translate(5,0);
			// seed8.translate(5,0);
			// seed8L.translate(5,0);
			
			// w1.translate(5,0);
			// w1L.translate(5,0);
			// w2.translate(5,0);
			// w2L.translate(5,0);
			
			// lettuce.translate(5,0);
			
			// tomato.translate(5,0);
			
			// onion.translate(5,0);
			
			// oL2.translate(5,0);
			// onionlayer.translate(5,0);
			
			// cheese.translate(5,0);
			// cL.translate(5,0);
			
			// patty.translate(5,0);
			}
		
		public void keyPress(String s)
				{
				// temp holds the enter character
			
				char done = (char)10;
				String temp = Character.toString(done);
			
				}
}
