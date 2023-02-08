package Wzorce.projektowe.memento.operating.system;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup(){
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono nowy backup nr: " + this.backupNumber + " z dnia " + this.backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento){
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}
