package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC5431j8 {
    public final Yc a;

    public AbstractC5431j8() {
        Yc yc = new Yc(0);
        yc.a(EnumC5483l8.c, 0);
        yc.a(EnumC5483l8.d, 1);
        yc.a(EnumC5483l8.e, 2);
        yc.a(EnumC5483l8.f, 3);
        this.a = yc;
    }

    @NotNull
    public final Yc a() {
        return this.a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
