void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
 //Draw Zoog's body 
  stroke(0);
 fill(150);
 rect(100,100,20,100);
  
 //Draw Zoog's head
 fill(255);
 ellipse(100,70,60,60);

 //Draw Zoog's eyes
 fill(0);
 ellipse(81,70,16,32);
 ellipse(119,70,16,32);

 //Draw Zoog's legs
 stroke(0);
 line(90,150,80,160);
 line(110,150,120,160);
	

}