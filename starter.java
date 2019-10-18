import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
	private static Car kMob;
	private static Emoji face;
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			kMob = new KrabbyMobile(100,200,1);
			kMob.fill();
			face = new Emoji();
			face.fill();
			System.out.println(kMob.getHeight());
			System.out.println(kMob.getWidth());
			System.out.println(kMob.getY());
			System.out.println(kMob.getX());
		
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
				
				
				if(face.crash(kMob)){
					System.out.println("hit");
				}
				else{
					System.out.println("poop");
				}
			}
}
