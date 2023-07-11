package org;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class WebResponse {

	@JacksonXmlProperty(localName = "RequestId")
	private String requestId;
	
	@JacksonXmlProperty(localName = "Items")
	private List<Item> items;
	
	@JacksonXmlProperty(localName = "Customer")
	private Customer customer;
}
