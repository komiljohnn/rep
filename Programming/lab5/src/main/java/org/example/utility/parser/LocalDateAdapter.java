package org.example.utility.parser;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

/**
 * Класс который парсит даты
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    public LocalDate unmarshal(String v) {
        return LocalDate.parse(v);
    }

    public String marshal(LocalDate v) {
        return v.toString();
    }
}