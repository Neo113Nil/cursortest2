package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5421io {
    public final Yn a;
    public final X b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public C5421io(Yn yn, X x, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.a = yn;
        this.b = x;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Yn yn = this.a;
        if (yn != null) {
            for (Ul ul : yn.c) {
                sb.append("at " + ul.a + "." + ul.e + "(" + ul.b + ":" + ul.c + ":" + ul.d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.a + "\n" + sb.toString() + '}';
    }
}
