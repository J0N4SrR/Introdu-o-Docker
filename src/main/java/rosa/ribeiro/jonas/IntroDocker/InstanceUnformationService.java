package rosa.ribeiro.jonas.IntroDocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InstanceUnformationService {
    private static final String HOST_NAME = "HOSTNAME";
    private static final String DEFAULR_ENV_INSRANCE_GUID = "LOCAL";
    @Value("${"+ HOST_NAME +":"+ DEFAULR_ENV_INSRANCE_GUID +"}")
    private String hostName;
    public String retrieveInstanceInfo(){
        return hostName.substring(hostName.length()-5);
    }
}
