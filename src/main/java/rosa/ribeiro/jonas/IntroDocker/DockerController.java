package rosa.ribeiro.jonas.IntroDocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {
    Logger logger = LoggerFactory.getLogger(DockerController.class);

    @Autowired
    private InstanceUnformationService service;

    @GetMapping(path = "/")
    public String imUpAndRunning(){return "{healthy:true}";}

    @RequestMapping("/hello")
    public HelloDockerRecord greeting(){
        logger.info("Endpoint/hello is called!!!");
        return new HelloDockerRecord("Hello, Docker", service.retrieveInstanceInfo());
    }
}
