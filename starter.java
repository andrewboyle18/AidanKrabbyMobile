import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		
			KrabbyMobile kMob = new KrabbyMobile(0,0);
			kMob.fill();
			kMob.translate(90,90);
			
		}
		
		public void onMouseClick(double x, double y)
			{
				
			
			}
		
		public void keyPress(String s)
			{
				
			}
}
