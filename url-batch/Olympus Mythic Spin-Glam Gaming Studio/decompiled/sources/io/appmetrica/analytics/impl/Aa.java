package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public enum Aa {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    Aa(int i) {
        this.a = i;
    }

    public static Aa a(Integer num) {
        if (num != null) {
            for (Aa aa : values()) {
                if (aa.a == num.intValue()) {
                    return aa;
                }
            }
        }
        return UNKNOWN;
    }
}
