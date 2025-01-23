package pl.pjatk.technicalSupport;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Service
public class TicketService {

    List<Ticket> tickets = new ArrayList<>();

    public void createTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void setStatus(int ticketId, String status) {
        for(Ticket ticket : tickets) {
            if(ticket.getTicketId() == ticketId) {
                ticket.setStatus(status);
                break;
            }
            else{
                System.out.println("Ticket " + ticket.getTicketId() + "Didnt exist");
            }
        }
    }

    public void setUser(int ticketId, int userId) {
        for(Ticket ticket :tickets){
            if(ticket.getTicketId() == ticketId){
                ticket.setUserId(userId);
            }
        }
    }

    public void setServisant(int ticketId, int servisantId) {
        for(Ticket ticket :tickets){
            if(ticket.getTicketId() == ticketId){
                ticket.setServisantId(servisantId);
            }
        }
    }

    public void printInformation(int ticketId) {
        for(Ticket ticket : tickets) {
            if(ticket.getTicketId() == ticketId) {
                System.out.println(ticket);
            }
        }
    }


}
