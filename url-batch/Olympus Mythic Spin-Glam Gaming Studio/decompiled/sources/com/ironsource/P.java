package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class P {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final String g = "0";

    @NotNull
    public static final String h = "0";

    @NotNull
    public static final String i = "0";

    @NotNull
    public static final String j = "0";

    @NotNull
    private final K9 a;

    @NotNull
    private S7 b;

    @NotNull
    private String c;

    @NotNull
    private EnumC4796o0 d;
    private double e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public P(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.a = adInstance;
        this.b = S7.UnknownProvider;
        this.c = "0";
        this.d = EnumC4796o0.LOAD_REQUEST;
        this.e = new Date().getTime() / 1000.0d;
    }

    @NotNull
    public final K9 a() {
        return this.a;
    }

    @NotNull
    public final IronSource.a b() {
        return this.a.i() ? IronSource.a.BANNER : this.a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String e = this.a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        return e;
    }

    @NotNull
    public final K9 d() {
        return this.a;
    }

    @NotNull
    public final S7 e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return Intrinsics.areEqual(c(), p.c()) && Intrinsics.areEqual(g(), p.g()) && b() == p.b() && Intrinsics.areEqual(i(), p.i()) && this.b == p.b && Intrinsics.areEqual(this.c, p.c) && this.d == p.d;
    }

    @NotNull
    public final EnumC4796o0 f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        String c = this.a.c();
        return c == null ? "0" : c;
    }

    @NotNull
    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    @NotNull
    public final String i() {
        String g2 = this.a.g();
        Intrinsics.checkNotNullExpressionValue(g2, "adInstance.name");
        return g2;
    }

    public final double j() {
        return this.e;
    }

    @NotNull
    public String toString() {
        String jSONObject = IronSourceNetworkBridge.jsonObjectInit().put("adId", c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }

    @NotNull
    public final P a(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new P(adInstance);
    }

    public static /* synthetic */ P a(P p, K9 k9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            k9 = p.a;
        }
        return p.a(k9);
    }

    public final void a(@NotNull S7 s7) {
        Intrinsics.checkNotNullParameter(s7, "<set-?>");
        this.b = s7;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(@NotNull EnumC4796o0 enumC4796o0) {
        Intrinsics.checkNotNullParameter(enumC4796o0, "<set-?>");
        this.d = enumC4796o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
