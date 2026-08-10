package com.project.ticket.services;

import com.project.ticket.domain.entities.TicketValidation;
import java.util.UUID;

public interface TicketValidationService {
    TicketValidation validateTicketByQrCode(UUID qrCodeId);
    TicketValidation validateTicketManually(UUID ticketId);
}
