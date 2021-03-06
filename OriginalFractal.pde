void setup()
{
	size(800, 800, P3D);
	noLoop();
}
void draw()
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