package org.example.appointmentservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.appointmentservice.models.dto.requests.CreateAppointmentRequest;
import org.example.appointmentservice.models.dto.responses.AppointmentResponse;
import org.example.appointmentservice.models.repositories.AppointmentDetailRepository;
import org.example.appointmentservice.models.repositories.AppointmentRepository;
import org.example.appointmentservice.models.services.AppointmentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final AppointmentDetailRepository appointmentDetailRepository;
    private final DoctorGatewayService doctorGatewayService;

    @Override
    public AppointmentResponse createAppointment(CreateAppointmentRequest request) {
        throw new UnsupportedOperationException();
    }
}
