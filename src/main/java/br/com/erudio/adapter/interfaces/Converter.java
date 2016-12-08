package br.com.erudio.adapter.interfaces;

public interface Converter<T> {
    public T convert(String schemaType, String data);
}
