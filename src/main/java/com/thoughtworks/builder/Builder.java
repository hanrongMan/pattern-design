package com.thoughtworks.builder;

public abstract class Builder {
    private Computer pc ;
    public abstract void buildCpu();
    public abstract void buildRam();
    public abstract void buildMonitor();
    
    
    public void createComputer(){
        this.pc = new Computer();
    }
    public Computer getComputer(){
        return this.pc;
    }
}