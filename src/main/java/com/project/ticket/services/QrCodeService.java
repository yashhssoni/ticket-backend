package com.project.ticket.services;

import com.project.ticket.domain.entities.QrCode;
import com.project.ticket.domain.entities.Ticket;
import java.util.UUID;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);

    byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}
