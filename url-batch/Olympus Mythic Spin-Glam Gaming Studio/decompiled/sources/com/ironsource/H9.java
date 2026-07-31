package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class H9 implements InterfaceC4769m9 {

    @NotNull
    private final C4618e1 a;

    @NotNull
    private final E9 b;

    public H9(@NotNull C4618e1 adapterConfig, @NotNull E9 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4636f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4924v
    public long b() {
        return this.b.e();
    }

    @Override // com.ironsource.InterfaceC4636f1
    @NotNull
    public String c() {
        String f = this.a.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC4636f1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC4636f1
    @NotNull
    public String e() {
        String a = this.a.a();
        Intrinsics.checkNotNullExpressionValue(a, "adapterConfig.adSourceNameForEvents");
        return a;
    }

    @Override // com.ironsource.InterfaceC4636f1
    @NotNull
    public EnumC4823p9 f() {
        return EnumC4823p9.b.a(this.a.d());
    }
}
