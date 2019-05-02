package com.company;



public class ModifiedCarr {

    private String color;
    private String make;
    private String windows;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getAccelerating() {
        return accelerating;
    }

    public void setAccelerating(String accelerating) {
        this.accelerating = accelerating;
    }

    public String getStopped() {
        return stopped;
    }

    public void setStopped(String stopped) {
        this.stopped = stopped;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getPasses() {
        return passes;
    }

    public void setPasses(String passes) {
        this.passes = passes;
    }

    public String getPassed() {
        return passed;
    }

    public void setPassed(String passed) {
        this.passed = passed;
    }

    private String accelerating;
    private String stopped;
    private String mph;
    private String passes;
    private String passed;


    public ModifiedCarr() {
    }
//method display cars in the app class

  public String getDescription(){
    return "the " + color + " " + make +  " has " + windows + " windows" ;

}

}

