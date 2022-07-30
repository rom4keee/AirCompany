package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class experimentalPlane extends Plane{
public class ExperimentalPlane extends Plane {

    private ExperimentalTypes type;
    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public experimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.experimentalTypes = type;
        this.classificationLevel = classificationLevel;
    }

@Override
    public int hashCode() {

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
        return "ExperimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
