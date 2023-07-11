package org;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class Account {

	@JacksonXmlProperty(localName = "Type")
	private String type;
}
