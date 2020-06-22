int xSpot = 0;
int ySpot = 0;
int xSpeed = 5;
int ySpeed = 5;
void setup() {
  size(600,400);  
  
  for(int i = 0; i < 100; i++);{
    println("Hello world");
  }
}

void draw(){
 background(#29EBFF);
 fill(#F791F7);
 ellipse(xSpot,ySpot,100,100);
 
 if(mousePressed){
 xSpot += xSpeed;
 ySpot += ySpeed;
 }
 if(xSpot > width){
 xSpeed = -xSpeed;
 }
  if(xSpot < 0){
 xSpeed = -xSpeed;
 }
   if(ySpot < 0){
 ySpeed = -ySpeed;
 }
    if(ySpot > height){
 ySpeed = -ySpeed;
 }
}
void keyPressed(){
  if(keyCode == UP){
    ySpot -= ySpeed;
}
  if(keyCode == LEFT){
    xSpot += xSpeed;
  }
    if(keyCode == RIGHT){
    xSpot -= xSpeed;
  }
    if(keyCode == DOWN){
    ySpot += ySpeed;
  }
}
