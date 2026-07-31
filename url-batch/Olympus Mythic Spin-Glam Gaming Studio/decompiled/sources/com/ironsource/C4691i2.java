package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4691i2 {

    @NotNull
    private final AbstractC4961x0 a;

    @NotNull
    private final Map<String, Object> b;

    @NotNull
    private final List<String> c;

    @NotNull
    private final StringBuilder d;

    @Nullable
    private B e;

    public C4691i2(@NotNull AbstractC4961x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adUnitData;
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new StringBuilder();
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.b;
    }

    @NotNull
    public final List<String> b() {
        return this.c;
    }

    @Nullable
    public final B c() {
        return this.e;
    }

    @NotNull
    public final StringBuilder d() {
        return this.d;
    }

    public final boolean e() {
        return (this.e == null && this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(@Nullable B b) {
        this.e = b;
        if (b != null) {
            StringBuilder sb = this.d;
            sb.append(b.r());
            sb.append(b.p());
            sb.append(StringUtils.COMMA);
        }
    }

    public final void a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.d;
        sb.append(providerSettings.getInstanceType(this.a.b().a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(StringUtils.COMMA);
    }

    public final void a(@NotNull NetworkSettings providerSettings, @NotNull Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.a.b().a()), biddingData);
    }

    public final void a(@NotNull C4906u3 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String c = biddingResponse.c();
        Intrinsics.checkNotNullExpressionValue(c, "biddingResponse.instanceName");
        int d = biddingResponse.d();
        Map<String, Object> a = biddingResponse.a();
        Intrinsics.checkNotNullExpressionValue(a, "biddingResponse.biddingData");
        a(c, d, a);
    }

    private final void a(String str, int i, Map<String, ? extends Object> map) {
        this.b.put(str, map);
        StringBuilder sb = this.d;
        sb.append(i);
        sb.append(str);
        sb.append(StringUtils.COMMA);
    }
}
