package com.uolinc.commons.adapter.implementation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.uolinc.commons.adapter.SchemaAdapter;
import com.uolinc.commons.adapter.interfaces.Converter;

public class GenericSchemaConverter<T> implements Converter<T> {

	private Class<T> clazz;
	SchemaAdapter<T> schemaAdapter; 
	
	public GenericSchemaConverter(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}

	public T convert(String mediaType, String data) {

		T user = null;
		if (mediaType.equalsIgnoreCase("xml")) {
			XmlMapper xmlMapper = new XmlMapper();
			try {
				user = xmlMapper.readValue(data, clazz);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (mediaType.equalsIgnoreCase("json")) {
			schemaAdapter = new SchemaAdapter<T>(mediaType, clazz);
			user = (T) schemaAdapter.convert(mediaType, data);
		} else {
			System.out.println("Invalid media. " + mediaType
					+ " format not supported");
		}
		return user;
	} 
	}