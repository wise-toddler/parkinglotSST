package org.example.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.example.models.Gate.Gate;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}