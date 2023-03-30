package org.example;

public class Radio {
    public int channel;
    public int volume;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (0 < channel) {
            return;
        } else if (channel > 9) {
            return;
        } else {
            this.channel = channel;
        }
    }

    public void next() {
        if (channel == 9) {
            channel = 0;
        } else {
            channel++;
        }
    }

    public void prev() {
        if (channel == 0) {
            channel = 9;
        } else {
            channel = channel - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}