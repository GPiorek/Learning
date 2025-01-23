package pl.pjatk.technicalSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Ticket {
    private int ticketId;
    private String status;
    private int servisantId;
    private int userId;

    public Ticket(int ticketId, String status, int servisantId, int userId) {
        this.ticketId = ticketId;
        this.status = status;
        this.servisantId = servisantId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId =" + ticketId +
                ", status =" + status +
                ", servisantId =" + servisantId +
                ", userId =" + userId +
                '}';
    }
}
