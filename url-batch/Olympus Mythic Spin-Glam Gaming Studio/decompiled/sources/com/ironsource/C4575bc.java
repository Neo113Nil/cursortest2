package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4575bc extends W {

    @Nullable
    private final String s;

    @Nullable
    private final List<NetworkSettings> t;

    @NotNull
    private final Rb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4575bc(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Rb configs) {
        super(IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new J0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.s = str;
        this.t = list;
        this.u = configs;
    }

    @NotNull
    public final C4575bc a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Rb configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C4575bc(str, list, configs);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4575bc)) {
            return false;
        }
        C4575bc c4575bc = (C4575bc) obj;
        return Intrinsics.areEqual(this.s, c4575bc.s) && Intrinsics.areEqual(this.t, c4575bc.t) && Intrinsics.areEqual(this.u, c4575bc.u);
    }

    public int hashCode() {
        String str = this.s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.u.hashCode();
    }

    @Override // com.ironsource.W
    @Nullable
    public List<NetworkSettings> j() {
        return this.t;
    }

    @Override // com.ironsource.W
    @Nullable
    public String o() {
        return this.s;
    }

    @Nullable
    public final String s() {
        return this.s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.t;
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    @NotNull
    public final Rb u() {
        return this.u;
    }

    @NotNull
    public final Rb v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4575bc a(C4575bc c4575bc, String str, List list, Rb rb, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4575bc.s;
        }
        if ((i & 2) != 0) {
            list = c4575bc.t;
        }
        if ((i & 4) != 0) {
            rb = c4575bc.u;
        }
        return c4575bc.a(str, list, rb);
    }
}
