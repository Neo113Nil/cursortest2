package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4690i1 {

    @NotNull
    private final EnumC4811of a;

    @NotNull
    private final S7 b;

    @NotNull
    private final String c;
    private final long d;

    public C4690i1(@NotNull EnumC4811of recordType, @NotNull S7 adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final S7 b() {
        return this.b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(C4913ua.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to(C4913ua.b, this.c), TuplesKt.to(C4913ua.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)), TuplesKt.to("rt", Integer.valueOf(this.a.ordinal())));
    }

    @NotNull
    public final EnumC4811of e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
