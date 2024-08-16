package nl.hakktastic.nl.hakktastic.enterprise_messaging_techniques.jmsreceiver;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JmsReceiverService {

    @JmsListener(destination = "training")
    public void recieveMessage(Message message) throws JMSException {

        log.info("RECEIVED MESSAGE: {}", message);
        message.acknowledge();
    }
}
