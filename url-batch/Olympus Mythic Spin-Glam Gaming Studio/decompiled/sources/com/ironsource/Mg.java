package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Mg {

    @NotNull
    public static final a c = new a(null);

    @Nullable
    private final Double a;

    @Nullable
    private final Double b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        @NotNull
        public final Mg b() {
            return a().a();
        }

        private a() {
        }
    }

    public static final class b {

        @Nullable
        private Double a;

        @Nullable
        private Double b;

        public final void a(@Nullable Double d) {
            this.b = d;
        }

        public final void b(@Nullable Double d) {
            this.a = d;
        }

        @Nullable
        public final Double c() {
            return this.a;
        }

        @NotNull
        public final b a(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        @Nullable
        public final Double b() {
            return this.b;
        }

        @NotNull
        public final Mg a() {
            return new Mg(this, null);
        }

        @NotNull
        public final b b(double d) {
            this.a = Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ Mg(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @NotNull
    public static final b a() {
        return c.a();
    }

    @NotNull
    public static final Mg b() {
        return c.b();
    }

    @Nullable
    public final Double c() {
        return this.b;
    }

    @Nullable
    public final Double d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("ceiling", this.b);
            jsonObjectInit.put("floor", this.a);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject = jsonObjectInit.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString()");
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    private Mg(b bVar) {
        this.a = bVar.c();
        this.b = bVar.b();
    }
}
