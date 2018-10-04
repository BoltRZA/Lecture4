package Lecture4;

import jade.core.Agent;

public class AgentReceiver extends Agent {
        protected void setup(){
            super.setup();

            addBehaviour (new RecieveMsgBehaviour(this));
        }
}
