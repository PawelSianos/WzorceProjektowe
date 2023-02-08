package Wzorce.projektowe.visitor.transport;

import Wzorce.projektowe.visitor.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
