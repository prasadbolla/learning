/**
 * 
 */
package helloworldspringbootArtifactId;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author PRASADBolla
 *
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
	
	@RequestMapping
	String home() {
		return "Hello World!!";
	}
	
	public static void main(String[] a)throws Exception{
		SpringApplication.run(HelloWorld.class, a);
	}

}
