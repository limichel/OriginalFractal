import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	size(800, 800, P3D);
	noLoop();
}
public void draw()
{
	background(255);
	translate(width/2, height/2);
	myFractal(3*width/4);
}
public void myFractal(int siz)
{
	if(siz >= 5)
	{
		myFractal(3*siz/4);
		stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), 100);
		noFill();
		pushMatrix();
		rotate((float)(Math.random() * 2 * Math.PI));
		sphere(siz);
		popMatrix();
		//myFractal(3*siz/4);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
