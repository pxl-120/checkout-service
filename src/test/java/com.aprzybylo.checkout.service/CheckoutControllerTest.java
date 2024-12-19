import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.aprzybylo.checkout.service.CheckoutServiceApplication;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = CheckoutServiceApplication.class)
public class CheckoutControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void testScanAndResult() {
		/*restTemplate.postForObject("/checkout/scan/A", null, String.class);
		Double total = restTemplate.getForObject("/checkout/total", Double.class);
		assertEquals(40, total, 0.01);*/
	}
}