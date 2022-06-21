import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	PImage imgStar; 
  PImage imgAlien;
  PImage imgRocket;
  PImage imgBackground1;
  PImage imgBackground2;
  PImage imgBackground3;
  PImage imgCurrentBackground;

  public void settings() {
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    imgAlien = loadImage("alien.png"); 
    imgAlien.resize(imgAlien.width/30, imgAlien.height/30);
    imgStar = loadImage("star_small.png");
    
    imgRocket = loadImage("rocket.png");
    imgRocket.resize(imgRocket.width/7, imgRocket.height/7);
    
    imgBackground1 = loadImage("space.png");
    
    imgBackground2 = loadImage("space2.PNG");
    imgBackground2.resize(imgBackground2.width * 2, imgBackground2.height * 2);
    
    imgBackground3 = loadImage("space3.PNG");
    imgBackground3.resize(imgBackground3.width * 2, imgBackground3.height * 2);
    
    background(128);
    imgCurrentBackground = imgBackground1;
    image(imgCurrentBackground,0,0);
    
  }

  
  public void draw() {
    if(keyPressed){
      if(key == '1'){
        imgCurrentBackground = imgBackground1;
        image(imgCurrentBackground,0,0);
      }
        
      else if (key == '2'){
        imgCurrentBackground = imgBackground2;
        image(imgCurrentBackground,0,0);
      }
        
      else if (key == '3'){
        imgCurrentBackground = imgBackground3;
        image(imgCurrentBackground,0,0);
      }
    }
  }
  
  public void mouseClicked(){
    image(imgStar,mouseX, mouseY);
  }
  
  public void mouseDragged(){
    image(imgCurrentBackground,0,0);
    image(imgRocket, mouseX, mouseY);
  }
  
  public void mouseWheel(){
    image(imgAlien, mouseX, mouseY);
  }
  // define other methods down here.
}