import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * The Student class sets up the student's introduction.
 *
 * @author Period 3
 * @version 1.0
 */
public abstract class Student extends Actor
{
     //Instance variables
    public String firstName;
    public String lastName;
    public int myRow;         // rows start in the front of class (1), and end in the back of class
    public int mySeat;        // seats are left to right, 1-8
    public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?

   public boolean sitting;   // Is the student sitting or standing (default sitting)

 //  public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+

   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String standingFile2;
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   public String dancingFile;
   public String soundDanceFile;
   public String soundFileAYR;
   // declare period as an integer
   protected int period;
   

   Classroom clas = (Classroom) getWorld();
   public void setRow(int r){
       myRow=r;
    }
    public void setSeat(int s){
       mySeat=s;
    }

   public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
   public abstract void  provideLesson(); // each group should implement their own version of this method.
                                           // See the notes in the assignment instructions for possible implementation.
   public abstract void  answerQuestion(); //This is an abstract method. You will have to implement it
                                            // in your own class file.  It was used in 2019-20 so that students could
                                            // implement methods that would discuss the summer homework lessons.  This year
                                            // you will work in teams of 3 to figure out some way to actually give a short
                                            // Runestone lesson.
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
   
   // set period to desired choice, each student file will have to set their respective period
   public void setPeriod(int p) {
     period = p;
   }
   // returns the period integer for each student
   public int getPeriod() {
       return period;
   }
   
    public int GetRow(){
        return myRow;
    }

    public int GetSeat(){
        return mySeat;
    }
     
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }

    public void sayAreYouReady (String mySoundFile) {
        Greenfoot.playSound(mySoundFile);
    }

    public void sayDance (String myDanceFile) {
        Greenfoot.playSound(myDanceFile);
    }

    public void returnToSeat(){
        setLocation(mySeat,myRow);
   }
   
   public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
}
