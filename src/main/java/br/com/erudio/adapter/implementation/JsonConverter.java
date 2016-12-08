package br.com.erudio.adapter.implementation;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import br.com.erudio.adapter.interfaces.AdvancedSchemaConverter;

public class JsonConverter<T> implements AdvancedSchemaConverter<T> {

    private Class<T> clazz;

    public JsonConverter(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    public T convertJson(String data) {
        ObjectMapper mapper = new ObjectMapper();
        T user = null;
        try {
            user = mapper.readValue(data, clazz);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
