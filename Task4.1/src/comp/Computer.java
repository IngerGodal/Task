package comp;

public class Computer {
    private String computerModel;
    private String cpu;
    private String videoCard;
    private int amountOfRam;

    public Computer(String computerModel, String cpu, String videoCard, int amountOfRam) {
        this.computerModel = computerModel;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.amountOfRam = amountOfRam;
    }

    public Computer(String computerModel) {
        this.computerModel = computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setAmountOfRam(int amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    @Override
    public String toString() {
        return "Модель компьютера : " + "[ " + computerModel + " ]" + '\n' +
                "CPU : " + "[ " + cpu + " ]" + '\n' +
                "Видео карта : " + "[ " + videoCard + " ]" + '\n' +
                "Количество оперативной памяти : " + "[ " + amountOfRam + " ]" + '\n';
    }
}
