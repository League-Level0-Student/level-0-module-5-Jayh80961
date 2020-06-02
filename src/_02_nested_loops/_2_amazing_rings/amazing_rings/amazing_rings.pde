
void setup() {
  
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  for(int j=0;j>10000;j++){
      for(int i=8;i>=0;i--){
          if(i % 2 == 0){
           fill(#FF0000);
           }
           else{
           fill(#000000);
           }
           ellipse(250+j,250,60,60);  
           ellipse(250+j,250,60,60);  
      }
    }
  }
