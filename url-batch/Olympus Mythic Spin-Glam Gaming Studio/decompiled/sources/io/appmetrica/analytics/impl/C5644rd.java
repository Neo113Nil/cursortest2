package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5644rd extends Q2 {
    public final String b;

    public C5644rd(@NotNull String str, @NotNull Ol ol) {
        super(ol);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.Q2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.b;
    }
}
