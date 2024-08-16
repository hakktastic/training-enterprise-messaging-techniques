package nl.hakktastic.nl.hakktastic.enterprise_messaging_techniques.jmssender;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class JmsSenderService {

    private final JmsTemplate jmsTemplate;

    public void sendMessage(String message) {
        log.info("Sending message: {}", message);
        jmsTemplate.convertAndSend("training", message);
    }
}
