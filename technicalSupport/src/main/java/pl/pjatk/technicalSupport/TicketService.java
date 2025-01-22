package pl.pjatk.technicalSupport;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Getter
@Setter

@Service
public class TicketService {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Ticket createTicket(int id, boolean status, int servisantId, int userId) {
        Ticket ticket = new Ticket(id, status, servisantId, userId);
        tickets.add(ticket);
        return ticket;
    }

    public boolean setStatus(int id, boolean status) {
        Ticket ticket = getTicket(id);
        ticket.setStatus(status);
        return true;
    }

    public void setUser(int ticketId, int userId) {
        Ticket ticket = getTicket(ticketId);
        ticket.setUserId(userId);
    }

    public Ticket getTicket(int id) {
        return tickets.stream().filter(ticket -> ticket.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("b"));
    }

    public void setServisant(int ticketId, int servisantId) {
        Ticket ticket = getTicket(ticketId);
        ticket.setServisantId(servisantId);
    }
}





