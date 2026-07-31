package com.ironsource;

import com.ironsource.AbstractC4961x0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
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

/* renamed from: com.ironsource.gc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C4665gc extends AbstractC4961x0 {

    @NotNull
    public static final a y = new a(null);

    @NotNull
    private final C4671h0 t;

    @NotNull
    private final C4943w0 u;

    @NotNull
    private final Rb v;

    @NotNull
    private final String w;

    @NotNull
    private final String x;

    /* renamed from: com.ironsource.gc$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4665gc a(@NotNull C4671h0 adProperties, @Nullable Va va) {
            List<C5009zc> emptyList;
            We d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4961x0.a aVar = AbstractC4961x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            Rb e = c != null ? c.e() : null;
            if (e == null) {
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
            return new C4665gc(adProperties, new C4943w0(f, arrayList, b), e);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4665gc(@NotNull C4671h0 adProperties, @NotNull C4943w0 adUnitCommonData, @NotNull Rb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = Wa.e;
    }

    @NotNull
    public final Rb A() {
        return this.v;
    }

    @NotNull
    public final C4665gc a(@NotNull C4671h0 adProperties, @NotNull C4943w0 adUnitCommonData, @NotNull Rb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C4665gc(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public C4671h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public String c() {
        return this.w;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4665gc)) {
            return false;
        }
        C4665gc c4665gc = (C4665gc) obj;
        return Intrinsics.areEqual(this.t, c4665gc.t) && Intrinsics.areEqual(this.u, c4665gc.u) && Intrinsics.areEqual(this.v, c4665gc.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public String j() {
        return this.x;
    }

    @NotNull
    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    @NotNull
    public final C4671h0 w() {
        return this.t;
    }

    @NotNull
    public final C4943w0 x() {
        return this.u;
    }

    @NotNull
    public final Rb y() {
        return this.v;
    }

    @NotNull
    public final C4943w0 z() {
        return this.u;
    }

    public static /* synthetic */ C4665gc a(C4665gc c4665gc, C4671h0 c4671h0, C4943w0 c4943w0, Rb rb, int i, Object obj) {
        if ((i & 1) != 0) {
            c4671h0 = c4665gc.t;
        }
        if ((i & 2) != 0) {
            c4943w0 = c4665gc.u;
        }
        if ((i & 4) != 0) {
            rb = c4665gc.v;
        }
        return c4665gc.a(c4671h0, c4943w0, rb);
    }

    @Override // com.ironsource.AbstractC4961x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
