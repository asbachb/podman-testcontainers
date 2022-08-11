package it.impl.podman;



import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public class TestcontainerIT {
    
    @Container
    GenericContainer container = new GenericContainer(DockerImageName.parse("localhost/aaa/hello-world:1.0"));
    
    
    @Test
    public void blubb() throws Exception {
        System.out.println("blubb");
    }
}
