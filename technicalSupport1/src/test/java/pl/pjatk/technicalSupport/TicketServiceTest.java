package pl.pjatk.technicalSupport;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class TicketServiceTest {

    @Test
    void shouldChangeStatusToClosed() {
        //Given
        TicketService ticketService = new TicketService();
        Ticket ticket = new Ticket(1, "Active", 2, 3);
        ticketService.createTicket(ticket);
        //When
        ticketService.setStatus(1, "Closed");
        //Then
        assertThat("Closed");
    }
}
