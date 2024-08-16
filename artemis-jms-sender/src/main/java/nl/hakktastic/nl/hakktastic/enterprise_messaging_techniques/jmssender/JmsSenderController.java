package nl.hakktastic.nl.hakktastic.enterprise_messaging_techniques.jmssender;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/message")
public class JmsSenderController {

    private final JmsSenderService jmsSenderService;

    @PostMapping
    public void senMessage(@RequestBody String message) {

        log.info("REST Controller - Recieved message: {}", message);
        jmsSenderService.sendMessage(message);
    }
}
