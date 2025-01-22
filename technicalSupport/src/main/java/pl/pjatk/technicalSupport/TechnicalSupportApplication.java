package pl.pjatk.technicalSupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalSupportApplication.class, args);
        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.createTicket(1, true, 2, 3);
        System.out.println(ticket);
    }



}
