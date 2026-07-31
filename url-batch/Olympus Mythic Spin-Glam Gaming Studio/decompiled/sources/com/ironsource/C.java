package com.ironsource;

import com.ironsource.C4849r0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C {

    @NotNull
    private final AbstractC4961x0 a;

    @NotNull
    private final NetworkSettings b;

    @NotNull
    private final C4780n2 c;

    @NotNull
    private final C4618e1 d;

    @NotNull
    private C4834q2 e;
    private final int f;
    private final boolean g;

    @NotNull
    private final J h;

    @NotNull
    private final IronSource.a i;

    @Nullable
    private final JSONObject j;

    @NotNull
    private final String k;
    private final int l;

    @NotNull
    private final String m;

    @Nullable
    private final C4834q2 n;

    @NotNull
    private final String o;

    @NotNull
    private final String p;
    private final int q;

    @NotNull
    private final AdData r;

    public C(@NotNull AbstractC4961x0 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C4780n2 auctionData, @NotNull C4618e1 adapterConfig, @NotNull C4834q2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.a = adUnitData;
        this.b = providerSettings;
        this.c = auctionData;
        this.d = adapterConfig;
        this.e = auctionResponseItem;
        this.f = i;
        this.g = z;
        this.h = new J(C4849r0.a.DidntAttemptToLoad);
        IronSource.a a = adUnitData.b().a();
        this.i = a;
        this.j = auctionData.h();
        this.k = auctionData.g();
        this.l = auctionData.i();
        this.m = auctionData.f();
        this.n = auctionData.j();
        String f = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        this.o = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{f, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        this.p = format;
        this.q = adapterConfig.d();
        String k = this.e.k();
        Map<String, Object> a2 = C4699ia.a(this.e.a());
        Intrinsics.checkNotNullExpressionValue(a2, "jsonObjectToMap(auctionResponseItem.adData)");
        a2.put("adUnit", a);
        HashMap hashMap = new HashMap();
        Map<String, Object> a3 = C4699ia.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(a3, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a3);
        a2.put("userId", adUnitData.r());
        a2.put("adUnitId", adUnitData.b().c());
        a2.put("isMultipleAdUnits", Boolean.TRUE);
        this.r = new AdData(k, hashMap, a2);
    }

    @NotNull
    public final AbstractC4961x0 a() {
        return this.a;
    }

    @NotNull
    public final NetworkSettings b() {
        return this.b;
    }

    @NotNull
    public final C4780n2 c() {
        return this.c;
    }

    @NotNull
    public final C4618e1 d() {
        return this.d;
    }

    @NotNull
    public final C4834q2 e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return Intrinsics.areEqual(this.a, c.a) && Intrinsics.areEqual(this.b, c.b) && Intrinsics.areEqual(this.c, c.c) && Intrinsics.areEqual(this.d, c.d) && Intrinsics.areEqual(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    @NotNull
    public final AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public final IronSource.a i() {
        return this.i;
    }

    @NotNull
    public final AbstractC4961x0 j() {
        return this.a;
    }

    @NotNull
    public final C4618e1 k() {
        return this.d;
    }

    @NotNull
    public final C4780n2 l() {
        return this.c;
    }

    @NotNull
    public final String m() {
        return this.m;
    }

    @NotNull
    public final String n() {
        return this.k;
    }

    @NotNull
    public final C4834q2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    @Nullable
    public final C4834q2 q() {
        return this.n;
    }

    @Nullable
    public final JSONObject r() {
        return this.j;
    }

    @NotNull
    public final String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    @NotNull
    public String toString() {
        return "AdInstanceData(adUnitData=" + this.a + ", providerSettings=" + this.b + ", auctionData=" + this.c + ", adapterConfig=" + this.d + ", auctionResponseItem=" + this.e + ", sessionDepth=" + this.f + ", isPreloaded=" + this.g + ")";
    }

    @NotNull
    public final J u() {
        return this.h;
    }

    @NotNull
    public final NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    @NotNull
    public final String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    @NotNull
    public final C a(@NotNull AbstractC4961x0 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C4780n2 auctionData, @NotNull C4618e1 adapterConfig, @NotNull C4834q2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i, z);
    }

    public static /* synthetic */ C a(C c, AbstractC4961x0 abstractC4961x0, NetworkSettings networkSettings, C4780n2 c4780n2, C4618e1 c4618e1, C4834q2 c4834q2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC4961x0 = c.a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        NetworkSettings networkSettings2 = networkSettings;
        if ((i2 & 4) != 0) {
            c4780n2 = c.c;
        }
        C4780n2 c4780n22 = c4780n2;
        if ((i2 & 8) != 0) {
            c4618e1 = c.d;
        }
        C4618e1 c4618e12 = c4618e1;
        if ((i2 & 16) != 0) {
            c4834q2 = c.e;
        }
        C4834q2 c4834q22 = c4834q2;
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        return c.a(abstractC4961x0, networkSettings2, c4780n22, c4618e12, c4834q22, i3, z);
    }

    public final void a(@NotNull C4834q2 c4834q2) {
        Intrinsics.checkNotNullParameter(c4834q2, "<set-?>");
        this.e = c4834q2;
    }

    public final void a(@NotNull C4849r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.h.b(performance);
    }

    public /* synthetic */ C(AbstractC4961x0 abstractC4961x0, NetworkSettings networkSettings, C4780n2 c4780n2, C4618e1 c4618e1, C4834q2 c4834q2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4961x0, networkSettings, c4780n2, c4618e1, c4834q2, i, (i2 & 64) != 0 ? false : z);
    }
}
