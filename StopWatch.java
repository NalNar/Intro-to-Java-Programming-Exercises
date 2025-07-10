public class StopWatch {
    private long startTime;
    private long endTime;

    // no arg constuctor
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    
    // getter method 
    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    // start method
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    // stop method
    public void stop(){
        endTime = System.currentTimeMillis();

        
    }

    // elapsed time
    public long getElapsedTime(){
        return endTime - startTime;

    }

}
