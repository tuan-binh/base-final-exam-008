package org.example.appointmentservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.appointmentservice.clients.DoctorClient;
import org.example.appointmentservice.models.dto.responses.DoctorResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorGatewayService {
    private final DoctorClient doctorClient;

    public DoctorResponse getDoctorById(Long doctorId) {
        throw new UnsupportedOperationException();
    }
}
