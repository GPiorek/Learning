package pl.pjatk.technicalSupport;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = TechnicalSupportApplication.class)
public class TicketServiceTest {
    @Autowired
    private TicketService ticketService;

    @Test
    public void testCreateTicket() {
        //GIVEN

        //WHEN
        Ticket ticket = ticketService.createTicket(1,true,2,3);
        //THEN
        assertNotNull(ticket);
        assertEquals(1,ticket.getId());
        assertTrue(ticket.isStatus());
        assertEquals(2, ticket.getServisantId());
        assertEquals(3, ticket.getUserId());
    }

    @Test
    public void contextLoads() {}
}