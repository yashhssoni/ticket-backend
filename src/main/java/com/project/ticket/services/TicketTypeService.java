package com.project.ticket.services;

import com.project.ticket.domain.entities.Ticket;
import java.util.UUID;

public interface TicketTypeService {
    Ticket purchaseTicket(UUID userId, UUID ticketTypeId);
}