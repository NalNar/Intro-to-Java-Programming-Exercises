public class testTV {
    public static void main(String[]args){
        TV tv = new TV();
        tv.turnOff();
        tv.setChannel(111);
        tv.setVolume(5);
        System.out.println("tv channel is " + tv.channel + " Volume is " + tv.volumeLevel);

    }
}
