package com.uolinc.commons.adapter.interfaces;

public interface Converter <T> {
   public T convert(String schemaType, String data);
}
