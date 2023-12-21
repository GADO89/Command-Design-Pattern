package org.command;

public class Executor {

     final static int TV_SLOT=0;


    public static void main(String[] args) {
        //System.out.println("Hello world!");

        RemoteControl remoteControl=new RemoteControl();
        Television tv=new Television();

        TurnOnTelevision turnOnTelevision=new TurnOnTelevision(tv);
        TurnOffTelevision turnOffTelevision=new TurnOffTelevision(tv);

        remoteControl.addCommand(0,turnOffTelevision,turnOffTelevision);

        remoteControl.onButtonPressed(TV_SLOT);
        remoteControl.offButtonPressed(TV_SLOT);


    }
}