package com.ironsource;

import com.ironsource.AbstractC4961x0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class C9 extends AbstractC4961x0 {

    @NotNull
    public static final a z = new a(null);

    @NotNull
    private final C4671h0 t;
    private final boolean u;

    @NotNull
    private final C4943w0 v;

    @NotNull
    private final E9 w;

    @NotNull
    private final String x;

    @NotNull
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C9 a(@NotNull C4671h0 adProperties, @Nullable Va va, boolean z) {
            List<C5009zc> emptyList;
            We d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4961x0.a aVar = AbstractC4961x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            E9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (va == null || (emptyList = va.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5009zc) it.next()).f());
            }
            C4770ma b = C4770ma.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new C9(adProperties, z, new C4943w0(f, arrayList, b), d2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9(@NotNull C4671h0 adProperties, boolean z2, @NotNull C4943w0 adUnitCommonData, @NotNull E9 configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.c(), configs.d(), configs.f(), configs.b(), -1, new O0(O0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C4770ma e = adUnitCommonData.e();
        C4869s2 g = configs.g();
        Intrinsics.checkNotNullExpressionValue(g, "configs.interstitialAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Wa.c;
    }

    @NotNull
    public final C4943w0 A() {
        return this.v;
    }

    @NotNull
    public final E9 B() {
        return this.w;
    }

    @NotNull
    public final C9 a(@NotNull C4671h0 adProperties, boolean z2, @NotNull C4943w0 adUnitCommonData, @NotNull E9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public C4671h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public String c() {
        return this.x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9)) {
            return false;
        }
        C9 c9 = (C9) obj;
        return Intrinsics.areEqual(this.t, c9.t) && this.u == c9.u && Intrinsics.areEqual(this.v, c9.v) && Intrinsics.areEqual(this.w, c9.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public String j() {
        return this.y;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4961x0
    public boolean u() {
        return this.u;
    }

    @NotNull
    public final C4671h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    @NotNull
    public final C4943w0 y() {
        return this.v;
    }

    @NotNull
    public final E9 z() {
        return this.w;
    }

    public static /* synthetic */ C9 a(C9 c9, C4671h0 c4671h0, boolean z2, C4943w0 c4943w0, E9 e9, int i, Object obj) {
        if ((i & 1) != 0) {
            c4671h0 = c9.t;
        }
        if ((i & 2) != 0) {
            z2 = c9.u;
        }
        if ((i & 4) != 0) {
            c4943w0 = c9.v;
        }
        if ((i & 8) != 0) {
            e9 = c9.w;
        }
        return c9.a(c4671h0, z2, c4943w0, e9);
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
