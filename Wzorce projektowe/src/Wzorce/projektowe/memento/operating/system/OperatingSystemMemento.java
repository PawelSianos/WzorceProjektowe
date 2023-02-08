package Wzorce.projektowe.memento.operating.system;

import java.util.Date;

public class OperatingSystemMemento {

    private int backupNumber;
    private Date backupDate;

    OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    int getBackupNumber() {
        return backupNumber;
    }

    Date getBackupDate() {
        return backupDate;
    }
}
