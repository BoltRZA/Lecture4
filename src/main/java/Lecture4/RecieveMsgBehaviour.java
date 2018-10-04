package Lecture4;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class RecieveMsgBehaviour extends Behaviour{
    private Agent agent;

    public RecieveMsgBehaviour(Agent agent) {
        this.agent = agent;
    }

    @Override

    public void action(){
        String name = agent.getLocalName();
        String protocol = "for" + name;
        MessageTemplate mt = MessageTemplate.and(
                MessageTemplate.MatchPerformative(ACLMessage.INFORM),
                MessageTemplate.MatchProtocol(protocol));
        ACLMessage recieveMsg = agent.receive(mt);
        if (recieveMsg != null){
            System.out.println();
        }
    }

    public boolean done(){
        return false ;
    }


}
