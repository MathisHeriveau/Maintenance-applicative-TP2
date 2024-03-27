package org.example;

public class Visitor {
    public int age; // years counter
    public TicketType ticketType; // type of ticket

    public Visitor (int age, TicketType ticketType) {
        this.age = age;
        this.ticketType = ticketType;
    }

    public int getAge() {
        return age;
    }

    public TicketType getTicketType() {
        return ticketType;
    }


}
