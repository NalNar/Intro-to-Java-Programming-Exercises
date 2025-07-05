public class TV{
    // instance variables 
    int channel = 1; // default value for channel to predefined with 1 
    int volumeLevel = 1; // default value for volume level
    boolean on = false; // by default tv is off

    // default constructor 
    public TV(){

    }

    // turn on method
    public void turnOn (){
        on = true;
    }
    
    // turn off method
    public void turnOff(){
        on = false;
    }

    // set new channel 
    public void setChannel (int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120 ) { // channel limits at 120
            channel = newChannel;
        }
    } 

    // volume method
    public void setVolume(int newVolumeLevel){
        if ( on && newVolumeLevel >= 1 && newVolumeLevel <=7){
            volumeLevel = newVolumeLevel;
        }
    }

    // channel up method 
    public void channelUp(){
        if (on && channel < 120){
            channel++; // increment by 1
        }
    }

    // channel down method 
    public channelDown(){
        if (on && channel > 1){
        channel-- ; // decrement by 1
        }
    }

    // volume up 
    public void volumeUp(){
        if (on && volumeLevel < 7){
            volume++;
        }
    }

     public void volumeDown(){
        if (on && volumeLevel > 1){
            volume--;
        }
    }

}