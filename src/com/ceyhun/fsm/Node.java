package com.ceyhun.fsm;

import java.util.HashMap;

public class Node {

    private final String node_naam;
    private final HashMap<String, Node> nodelist = new HashMap<>();

    public Node(String node_naam) {
        this.node_naam = node_naam;
    }

    public String getNode_naam() {
        return node_naam;
    }

    public void setNode(Node a, Node b) {
        nodelist.put("a", a);
        nodelist.put("b", b);
    }

    public void checknodeconnection(Node next) {
        if(next == null) {
            System.out.println("Verbinding niet mogelijk:" + getNode_naam());
        }
    }

    public void getinput(String input) {
        Node next = nodelist.get(input.substring(0, 1));
        checknodeconnection(next);

        if(input.length() > 1) {
            next.getinput(input.substring(1));
        } else {
            System.out.println("eindigt op: " + next.getNode_naam());
        }
    }
}