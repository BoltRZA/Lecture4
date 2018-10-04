package Lecture4;

import jade.core.AID;
import jade.core.Agent;

import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class SendMessageByAgent extends TickerBehaviour {
    private Agent agent;
    private int counter;

    public SendMessageByAgent(Agent a, long period) {
        super(a, period);
        agent = a;
    }

    protected void onTick(){
    counter++;
    int ost = counter%2;
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent("Content");
        if (ost ==0){
            System.out.println(ost + " - Это четное число!");
        }
        else {
            System.out.println(ost + " - Это нечетное число!");
        }
        msg.addReceiver(new AID("Agent1", false));
        msg.addReceiver(new AID("Agent2", false));
        agent.send(msg);
        System.out.println(agent.getLocalName() + ": I have sent message!");
    }
}



