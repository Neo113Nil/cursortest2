package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class T2 {

    @NotNull
    private final b a;

    @NotNull
    private final Map<String, b> b;

    static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    public static final class b {

        @Nullable
        private final JSONObject a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;

        @NotNull
        private final List<String> f;

        public b(@NotNull JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(V2.a) ? features : null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(V2.a) : null;
            this.a = optJSONObject;
            int optInt = optJSONObject != null ? optJSONObject.optInt("refreshInterval", 25000) : 25000;
            this.b = optInt;
            this.c = optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true;
            this.d = (optJSONObject == null || !optJSONObject.has(V2.d) || optJSONObject.isNull(V2.d)) ? optInt : optJSONObject.optLong(V2.d);
            this.e = features.has(V2.e) ? features.optInt(V2.e) / 100.0f : 0.15f;
            List<String> b = features.has(V2.f) ? C4699ia.b(features.getJSONArray(V2.f)) : CollectionsKt.listOf((Object[]) new String[]{"BANNER", com.ironsource.mediationsdk.j.d});
            Intrinsics.checkNotNullExpressionValue(b, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f = b;
        }

        @NotNull
        public final List<String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }
    }

    public T2(@NotNull JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.a = new b(bannerConfigurations);
        this.b = new C4537a1(bannerConfigurations).a(a.a);
    }

    @NotNull
    public final Map<String, b> a() {
        return this.b;
    }

    @NotNull
    public final b b() {
        return this.a;
    }
}
