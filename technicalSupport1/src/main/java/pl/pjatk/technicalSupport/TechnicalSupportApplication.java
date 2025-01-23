package pl.pjatk.technicalSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalSupportApplication {
	private final TicketService ticketService;

	@Autowired
	public TechnicalSupportApplication(TicketService ticketService) {
		this.ticketService = ticketService;
		startApp();
	}

	public void startApp(){
		Ticket ticket1 = new Ticket(1,"active",2,3);
		Ticket ticket2 = new Ticket(2,"active",3,4);
		ticketService.createTicket(ticket1);
		ticketService.setStatus(1,"closed");
		ticket1.setServisantId(5);
		ticket1.setUserId(2);
		System.out.println(ticket1);
		ticketService.printInformation(2);
	}

	public static void main(String[] args) {
		SpringApplication.run(TechnicalSupportApplication.class, args);
	}

}
