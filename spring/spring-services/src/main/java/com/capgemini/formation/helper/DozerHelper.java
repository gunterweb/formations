package com.capgemini.formation.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

public class DozerHelper implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8511163816274644321L;

    private DozerHelper() {
        super();
    }

    public static <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {

        final List<U> dest = new ArrayList<>();

        for (T element : source) {
            if (element == null) {
                continue;
            }
            dest.add(mapper.map(element, destType));
        }

        List<U> s1 = new ArrayList<>();
        s1.add(null);
        dest.removeAll(s1);

        return dest;
    }

}