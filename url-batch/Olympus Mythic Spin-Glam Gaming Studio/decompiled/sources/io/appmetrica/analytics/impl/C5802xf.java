package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5802xf implements InterfaceC5406i8 {

    @NonNull
    public final Kf a;

    @NonNull
    public final List<C5776wf> b;

    public C5802xf(@NonNull Kf kf, @NonNull List<C5776wf> list) {
        this.a = kf;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5406i8
    @NonNull
    public final List<C5776wf> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5406i8
    @Nullable
    public final Object b() {
        return this.a;
    }

    @Nullable
    public final Kf c() {
        return this.a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.a + ", candidates=" + this.b + '}';
    }
}
