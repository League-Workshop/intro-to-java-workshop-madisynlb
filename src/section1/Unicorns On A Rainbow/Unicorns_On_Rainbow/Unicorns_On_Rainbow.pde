PImage rainbow;
PImage unicorn;

void setup() {
rainbow=loadImage("e.g. rainbow.png");
size(800,600);
rainbow.resize(width,height);
 unicorn= loadImage("e.g.unicorn.JPEG");
  unicorn.resize(50,50);
}


void draw() {
  image(unicorn, 150, 400);
  background(rainbow);

  
}
