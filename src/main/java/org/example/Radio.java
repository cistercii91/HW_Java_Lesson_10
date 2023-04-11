package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int channel;
    private int numberChannel = 9;
    private int volume;

    public Radio(int numberChannel) {
        if (numberChannel == 0) {
            System.out.println("Некорректный ввод, значение будет выставлено по умолчанию - 10");
            this.numberChannel = 9;
        } else if (numberChannel < 0) {
            System.out.println("Некорректный ввод, значение будет выставлено по умолчанию - 10");
            this.numberChannel = 9;
        } else this.numberChannel = numberChannel - 1;
    }


    public void setChannel(int channel) {
        if (0 > channel) {
            return;
        } else if (channel > numberChannel) {
            return;
        } else {
            this.channel = channel;
        }
    }

    public void next() {
        if (channel == numberChannel) {
            channel = 0;
        } else {
            channel++;
        }
    }

    public void prev() {
        if (channel == 0) {
            channel = numberChannel;
        } else {
            channel = channel - 1;
        }
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