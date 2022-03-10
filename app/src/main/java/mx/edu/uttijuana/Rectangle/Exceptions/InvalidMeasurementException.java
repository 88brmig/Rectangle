package mx.edu.uttijuana.Rectangle.Exceptions;

import androidx.annotation.Nullable;

public class InvalidMeasurementException extends Exception {
    private String message;

    public InvalidMeasurementException(){
        this.message = "Measurement must be greater than zero";
    }

    @Nullable
    @Override
    public String getMessage() {
        return this.message;
    }
}
