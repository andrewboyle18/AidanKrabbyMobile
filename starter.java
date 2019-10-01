import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	public static KrabbyMobile kMob;
	
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			kMob = new KrabbyMobile(0,0,1);
			kMob.fill();
		}
		
		public void onMouseClick(double x, double y)
			{
				
			}
		
		public void keyPress(String s)
			{
				
				if (s.equals("w"))
					kMob.translate(0,-10);
				if (s.equals("s"))
					kMob.translate(0,10);
				if (s.equals("a"))
					kMob.translate(-10,0);
				if (s.equals("d"))
					kMob.translate(10,0);
				
			}
}
