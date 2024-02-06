package ylab.project.service;

import ylab.project.model.Measurement;

import java.util.ArrayList;
import java.util.List;

public class MeasurementService {
    private List<Measurement> measurements = new ArrayList<>();

    public List<Measurement> getMeasurements(){
        return measurements;
    }
}
