package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Db implements S5<Cb> {

    @NotNull
    private final String a;

    @NotNull
    private final Fd b;

    @NotNull
    private final InterfaceC4654g1 c;
    private final boolean d;

    public Db(@NotNull String adm, @NotNull Fd providerName, @NotNull InterfaceC4654g1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.S5
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cb a() throws C4881se, Exception {
        InterfaceC4769m9 a = this.c.a(this.b);
        new U(this.a, a, this.d).a();
        if (a != null) {
            return new Cb(a.f(), a.e(), a.b(), a.d(), false, 16, null);
        }
        return null;
    }
}
