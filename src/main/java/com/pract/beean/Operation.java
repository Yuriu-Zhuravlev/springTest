package com.pract.beean;

public class Operation {
    int value;
    String operationType;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Operation() {
    }

    public Operation(int value, String operationType) {
        this.value = value;
        this.operationType = operationType;
    }
}
