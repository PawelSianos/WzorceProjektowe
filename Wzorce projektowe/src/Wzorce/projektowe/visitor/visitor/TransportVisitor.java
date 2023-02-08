package Wzorce.projektowe.visitor.visitor;

import Wzorce.projektowe.visitor.transport.Animal;
import Wzorce.projektowe.visitor.transport.Person;
import Wzorce.projektowe.visitor.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
