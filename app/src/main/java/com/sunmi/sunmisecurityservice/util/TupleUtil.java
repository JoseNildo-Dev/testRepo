package com.sunmi.sunmisecurityservice.util;

import com.sunmi.sunmisecurityservice.model.Tuple;

/* loaded from: classes.dex */
public final class TupleUtil {
    private TupleUtil() {
        throw new AssertionError();
    }

    public static <A, B> Tuple<A, B> tuple(A a, B b) {
        return new Tuple<>(a, b);
    }
}
