void setup() {
  size(600,600);
    background(#FFFFFF);
}

void draw() {
  
  if (mousePressed) {
   fill(#F7E328); 
  }
  else {
   fill(#0C87F0); 
  }
  ellipse(400,200,150,150);
}
