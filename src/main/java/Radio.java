public class Radio {
    private int currentStation;  //текущая станция
    private int currentVolume;   //текущий звук
    private int maxStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {  //номер станции
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {                    //переключение станции вперед
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {                    //переключение станции назад
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public Radio() {                    //3 номер радиостанции через указание ее номера
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }


    public int getCurrentVolume() {     //звук
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {  //увеличение звука
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void reductionVolume() {  //уменьшение звука
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}