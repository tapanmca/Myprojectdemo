package com.airdit.rest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RequestMapping("/airdit/**")
@RestController
public class Helloworldcontroler {
	@RequestMapping(method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE},value="/{_param}")
	public String getProcess(@PathVariable String _param)
	{
		return "Hello : "+_param;
	}
}
