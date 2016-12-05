package br.com.erudio.adapter;

import br.com.erudio.adapter.implementation.JsonConverter;
import br.com.erudio.adapter.interfaces.AdvancedSchemaConverter;
import br.com.erudio.adapter.interfaces.Converter;

public class SchemaAdapter<T> implements Converter<T> {

    AdvancedSchemaConverter<T> advancedSchemaConverter;

    public SchemaAdapter(String mediaType, Class<T> clazz) {

        if (mediaType.equalsIgnoreCase("json")) {
            advancedSchemaConverter = new JsonConverter<T>(clazz);
        }
    }

    public T convert(String mediaType, String fileName) {
        T user = null;
        if (mediaType.equalsIgnoreCase("json")) {
            user = (T) advancedSchemaConverter.convertJson(fileName);
        }
        return user;
    }
}
