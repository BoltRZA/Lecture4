package Lecture4;

import jade.core.Agent;

public class Sender extends Agent {
    protected void setup(){
        super.setup();

        addBehaviour(new SendMessageByAgent(this, 5000));
    }
}
