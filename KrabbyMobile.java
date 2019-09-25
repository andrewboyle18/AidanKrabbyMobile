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
	
	//wheels
	private Ellipse w1;
	private Ellipse w1L;
	private Ellipse w2;
	private Ellipse w2L;
	
	//colors of the pieces of the burger
	private Color BROWN;
	private Color SEED;
	private Color PURPLE;
	
	//dimensions of krabby mobile
	private double xx;
	private double yy;
	private double w;
	private double h;
	private Rectangle bound;
	
	public KrabbyMobile(double x, double y){
		  //x starts at 100 goes off of the bun
		  //y starts at 100
		  
		  xx = x;
		  yy = y;
		  
		  w = 400;
		  h = 250;
		  
		  bound = new Rectangle(xx,yy,w,h+40);
		  bound.draw();
		  
		  lettuce = new Rectangle(xx-25,yy+75,w+50,h-235);
		
		  tomato = new Ellipse(xx-25,yy+90,w+50,h-225);
		
		  onion = new Ellipse(xx-25,yy+115,w+50,h-225);
		  onionlayer = new Ellipse(xx-25,yy+115,w+50,h-225);
		  oL2 = new Ellipse(xx-50,yy+115,w+30,h-225);
		
		  cheese = new Rectangle(xx-25,yy+140,w+50,h-240);
		  cL = new Rectangle(xx-25,yy+140,w+50,h-225);
		
		  patty = new Ellipse(xx-25,yy+150,w+50,h-200);
		
		  bun = new Ellipse(xx,yy,w,h);
		
		  seed1 = new Ellipse(xx+95,yy+25,w-390,h-243);
		  seed1L = new Ellipse(xx+95,yy+25,w-390,h-243);
		  seed2 = new Ellipse(xx+125,yy+35,w-390,h-243);
		  seed2L = new Ellipse(xx+125,yy+35,w-390,h-243);
		  seed3 = new Ellipse(xx+155,yy+25,w-390,h-243);
		  seed3L = new Ellipse(xx+155,yy+25,w-390,h-243);
		  seed4 = new Ellipse(xx+185,yy+35,w-390,h-243);
		  seed4L = new Ellipse(xx+185,yy+35,w-390,h-243);
		  seed5 = new Ellipse(xx+205,yy+25,w-390,h-243);
		  seed5L = new Ellipse(xx+205,yy+25,w-390,h-243);
		  seed6 = new Ellipse(xx+235,yy+35,w-390,h-243);
		  seed6L = new Ellipse(xx+235,yy+35,w-390,h-243);
		  seed7 = new Ellipse(xx+265,yy+25,w-390,h-243);
		  seed7L = new Ellipse(xx+265,yy+25,w-390,h-243);
		  seed8 = new Ellipse(xx+295,yy+35,w-390,h-243);
		  seed8L = new Ellipse(xx+295,yy+35,w-390,h-243);
		
		  w1 = new Ellipse(xx+230,yy+240,w-350,h-200);
		  w1L= new Ellipse(xx+230,yy+240,w-350,h-200);
		  w2 = new Ellipse(xx+120,yy+240,w-350,h-200);
		  w2L = new Ellipse(xx+120,yy+240,w-350,h-200);
		 
		 BROWN = new Color(117, 64, 18);
		 SEED = new Color(255, 246, 161);
		 PURPLE = new Color(222, 168, 247);
	}
	
	public void translate(double xxx, double yyy){
		  bound.translate(xxx,yyy);
		  lettuce.translate(xxx,yyy);
		  tomato.translate(xxx,yyy);
		  onion.translate(xxx,yyy);
		  onionlayer.translate(xxx,yyy);
		  oL2.translate(xxx,yyy);
		  cheese.translate(xxx,yyy);
		  cL.translate(xxx,yyy);
		  patty.translate(xxx,yyy);
		  bun.translate(xxx,yyy);
		  seed1.translate(xxx,yyy);
		  seed1L.translate(xxx,yyy);
		  seed2.translate(xxx,yyy);
		  seed2L.translate(xxx,yyy);
		  seed3.translate(xxx,yyy);
		  seed3L.translate(xxx,yyy);
		  seed4.translate(xxx,yyy);
		  seed4L.translate(xxx,yyy);
		  seed5.translate(xxx,yyy);
		  seed5L.translate(xxx,yyy);
		  seed6.translate(xxx,yyy);
		  seed6L.translate(xxx,yyy);
		  seed7.translate(xxx,yyy);
		  seed7L.translate(xxx,yyy);
		  seed8.translate(xxx,yyy);
		  seed8L.translate(xxx,yyy);
		  w1.translate(xxx,yyy);
		  w1L.translate(xxx,yyy);
		  w2.translate(xxx,yyy);
		  w2L.translate(xxx,yyy);
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
	
	public void grow(double ww, double hh){
		//grows by a factor of ww and hh
		w = w*ww;
		h = h*hh;
	}
		
		
		
}
