package com.sunmi.sunmisecurityservice.model;

/* loaded from: classes.dex */
public class Tuple<A, B> {
    public final A a;
    public final B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Tuple) {
            Tuple tuple = (Tuple) obj;
            return equalsEx(tuple.a, this.a) && equalsEx(tuple.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + hashCodeEx(this.a)) * 31) + hashCodeEx(this.b);
    }

    boolean equalsEx(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    int hashCodeEx(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
