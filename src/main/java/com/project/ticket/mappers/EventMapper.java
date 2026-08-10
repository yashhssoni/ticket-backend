package com.project.ticket.mappers;

import com.project.ticket.domain.CreateEventRequest;
import com.project.ticket.domain.CreateTicketTypeRequest;
import com.project.ticket.domain.UpdateEventRequest;
import com.project.ticket.domain.UpdateTicketTypeRequest;
import com.project.ticket.domain.dtos.CreateEventRequestDto;
import com.project.ticket.domain.dtos.CreateEventResponseDto;
import com.project.ticket.domain.dtos.CreateTicketTypeRequestDto;
import com.project.ticket.domain.dtos.GetEventDetailsResponseDto;
import com.project.ticket.domain.dtos.GetEventDetailsTicketTypesResponseDto;
import com.project.ticket.domain.dtos.GetPublishedEventDetailsResponseDto;
import com.project.ticket.domain.dtos.GetPublishedEventDetailsTicketTypesResponseDto;
import com.project.ticket.domain.dtos.ListEventResponseDto;
import com.project.ticket.domain.dtos.ListEventTicketTypeResponseDto;
import com.project.ticket.domain.dtos.ListPublishedEventResponseDto;
import com.project.ticket.domain.dtos.UpdateEventRequestDto;
import com.project.ticket.domain.dtos.UpdateEventResponseDto;
import com.project.ticket.domain.dtos.UpdateTicketTypeRequestDto;
import com.project.ticket.domain.dtos.UpdateTicketTypeResponseDto;
import com.project.ticket.domain.entities.Event;
import com.project.ticket.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);

    GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(
            TicketType ticketType);

    GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);

    UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);

    UpdateEventRequest fromDto(UpdateEventRequestDto dto);

    UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType);

    UpdateEventResponseDto toUpdateEventResponseDto(Event event);

    ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event);

    GetPublishedEventDetailsTicketTypesResponseDto toGetPublishedEventDetailsTicketTypesResponseDto(
            TicketType ticketType);

    GetPublishedEventDetailsResponseDto toGetPublishedEventDetailsResponseDto(Event event);
}
