package com.manipal.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttrController {
	
	@Autowired
	private AttrService attrService;

	@RequestMapping(method = RequestMethod.GET, value = "/ATTR")
	private List<Attr> getAllAttributes() {
		return attrService.getAllAttributes();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/ATTR")
	private List<Attr> updateAttributes() {
		return null;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/ATTR{id}")
	private List<Attr> updateAttribute() {
		return null;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/ATTR{id}")
	private List<Attr> deleteAttributes() {
		return null;
	}

}
