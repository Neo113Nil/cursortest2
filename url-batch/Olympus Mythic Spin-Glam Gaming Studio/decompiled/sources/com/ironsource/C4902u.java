package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4902u {

    @NotNull
    public static final c d = new c(null);

    @NotNull
    public static final String e = "capping";

    @NotNull
    public static final String f = "pacing";

    @NotNull
    public static final String g = "delivery";

    @NotNull
    public static final String h = "progressiveLoadingConfig";

    @NotNull
    public static final String i = "expiredDurationInMinutes";

    @NotNull
    public static final String j = "reward";

    @NotNull
    public static final String k = "name";

    @NotNull
    public static final String l = "amount";

    @NotNull
    public static final String m = "virtualItemName";

    @NotNull
    public static final String n = "virtualItemCount";
    public static final long o = 60;

    @NotNull
    private final Map<String, d> a;

    @NotNull
    private final d b;

    @NotNull
    private final Map<String, d> c;

    /* renamed from: com.ironsource.u$a */
    static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$b */
    static final class b extends Lambda implements Function1 {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ironsource.u$d */
    public static final class d {

        @Nullable
        private final C3 a;

        @Nullable
        private final C4594cd b;

        @Nullable
        private final M4 c;

        @Nullable
        private final Long d;

        @Nullable
        private final Rd e;

        @Nullable
        private final Rd f;

        @Nullable
        private final Bd g;

        public d(@NotNull JSONObject features) {
            C3 c3;
            C4594cd c4594cd;
            Intrinsics.checkNotNullParameter(features, "features");
            Bd bd = null;
            if (features.has(C4902u.e)) {
                JSONObject jSONObject = features.getJSONObject(C4902u.e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c3 = new C3(jSONObject);
            } else {
                c3 = null;
            }
            this.a = c3;
            if (features.has(C4902u.f)) {
                JSONObject jSONObject2 = features.getJSONObject(C4902u.f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c4594cd = new C4594cd(jSONObject2);
            } else {
                c4594cd = null;
            }
            this.b = c4594cd;
            this.c = features.has("delivery") ? new M4(features.getBoolean("delivery")) : null;
            this.d = features.has(C4902u.i) ? Long.valueOf(features.getLong(C4902u.i)) : null;
            JSONObject optJSONObject = features.optJSONObject("reward");
            this.e = optJSONObject != null ? new Rd(optJSONObject, "name", "amount") : null;
            Rd rd = new Rd(features, C4902u.m, C4902u.n);
            String b = rd.b();
            this.f = (b == null || b.length() == 0 || rd.a() == null) ? null : rd;
            if (features.has(C4902u.h)) {
                JSONObject jSONObject3 = features.getJSONObject(C4902u.h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                bd = new Bd(jSONObject3);
            }
            this.g = bd;
        }

        @Nullable
        public final Rd a() {
            return this.e;
        }

        @Nullable
        public final C3 b() {
            return this.a;
        }

        @Nullable
        public final M4 c() {
            return this.c;
        }

        @Nullable
        public final Long d() {
            return this.d;
        }

        @Nullable
        public final C4594cd e() {
            return this.b;
        }

        @Nullable
        public final Rd f() {
            return this.f;
        }

        @Nullable
        public final Bd g() {
            return this.g;
        }
    }

    public C4902u(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = new C4845qd(configurations).a(b.a);
        this.b = new d(configurations);
        this.c = new C4537a1(configurations).a(a.a);
    }

    @NotNull
    public final Map<String, d> a() {
        return this.c;
    }

    @NotNull
    public final d b() {
        return this.b;
    }

    @NotNull
    public final Map<String, d> c() {
        return this.a;
    }
}
