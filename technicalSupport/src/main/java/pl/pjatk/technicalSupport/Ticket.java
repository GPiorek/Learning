package pl.pjatk.technicalSupport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Ticket {
    int id;
    boolean status;
    int servisantId;
    int userId;

    public Ticket(int id, boolean status, int servisantId, int userId) {
        this.id = id;
        this.status = status;
        this.servisantId = servisantId;
        this.userId = userId;
    }

}
