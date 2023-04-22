package own.cfb.ribbon.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRest {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/tr")
    public String testExample(@RequestParam("name") String name){
        return restTemplate.getForObject("http://CLIENT/tc?name="+name,String.class);
    }
}
