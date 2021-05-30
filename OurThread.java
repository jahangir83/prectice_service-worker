
public class OurThread extends Thread{


    private String threadName;
    private int startingPoint;
    private int counter;
    private int adder;
    private int timeDifference;

    private boolean threadAliveFlag;


    //==============Constructor================

    public OurThread(String threaName, int startingPoint, int adder, int timeDifference, boolean threadAliveFlag){
        this.threadName =  threaName;
        this.startingPoint = startingPoint;
        //this.counter = counter;
        this.adder = adder;
        this.timeDifference= timeDifference;
        this.threadAliveFlag = threadAliveFlag;
    }
    

    // TODO: Auto-generated method stub ------------ Run method
    @Override
    public void run() {
        
    }

//-------------------Geter and Seter-----------

    //TODO: Get name thread
    public String getThreadName(){
        return threadName;
    }

    public void setThreadNmae(){
        this.threadName = threadName;
    }
    //TODO: Stating Point
    public int getStatingPoint(){
        return startingPoint;
    }

    public void setStatingPoint(){
        this.startingPoint = startingPoint;
    }
    //TODO: counter
    public int getCounter(){
        return counter;
    }

    public void setCounter(){
        this.counter = counter;
    }
    //TODO: adder
    public int getAdder(){
        return adder;
    }

    public void setAdder(){
        this.adder = adder;
    }
    //TODO: TimeDifference
    public int getTimeDifference(){
        return timeDifference;
    }

    public void setTimeDifference(){
        this.timeDifference = timeDifference;
    }

    //TODO: ThreadAlive Flag
    public boolean getThreadAliveFlag(){
        return threadAliveFlag;
    }
    public void setThreadAliveFlag(){
        this.threadAliveFlag = threadAliveFlag;
    }
}