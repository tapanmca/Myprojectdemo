package com.airdit.rest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/airdit")
@RestController
public class Helloworldcontroler {
	@RequestMapping(method=RequestMethod.GET)
	public String getProcess()
	{
		return "Hello world: ";
	}
}