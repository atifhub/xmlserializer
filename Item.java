package org;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class Item {

	@JacksonXmlProperty(localName = "Id")
	private String id;
	
	@JacksonXmlProperty(localName = "Name")
	private String name;
}
