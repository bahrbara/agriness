package com.test.agriness;

public enum BookStatus {
    AVAIABLE("disponível"),
    BORROWED("emprestado");

    private String description;

    BookStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
