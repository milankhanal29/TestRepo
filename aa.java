import java.io.IOException;
import java.util.Map;

public class aa {

    @PostMapping(value = "/github/{email}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> handleGitHubWebhook(
            @RequestBody Map<String, Object> payload) throws IOException {
        System.out.println("Received GitHub webhook with payload: " + payload);
        webhookService.processWebhook(payload, email);
        return new ResponseEntity<>("Webhook received", HttpStatus.OK);
    }
}
