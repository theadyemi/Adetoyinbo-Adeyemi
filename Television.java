package Television;

import java.util.Scanner;

public class Television {
    public boolean isOn;
    public int channel;
    public int volume = 0;


    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public void changeChannel(){
        if (channel <= 105) channel++;
    }

    public void toggleChannel(){
        Scanner channel = new Scanner(System.in);
        System.out.println("Enter Channel");
        int newChannel = channel.nextInt();
        System.out.println(newChannel);
    }

    public void increaseVolume(){

        if (volume <= 30) volume++;
    }

    public int getVolume(){
        return volume;
    }

    public void decreaseVolume(){
        if (volume <= 30) {
            volume--;
        }else {
            System.out.print ("Default volume is 0");
        }
    }

    public void scanChannels(){
        if (channel <= 105) {
            channel++;
        } else channel--;
    }

    public int getChannel(){
        return channel;
    }
}