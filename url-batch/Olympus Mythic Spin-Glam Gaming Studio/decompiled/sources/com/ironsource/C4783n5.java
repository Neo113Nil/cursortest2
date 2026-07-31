package com.ironsource;

import com.ironsource.A7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.n5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4783n5 implements A7, A7.a {

    @NotNull
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private final Lazy b = LazyKt.lazy(new g());

    @NotNull
    private final Lazy c = LazyKt.lazy(new j());

    @NotNull
    private final Lazy d = LazyKt.lazy(new e());

    @NotNull
    private final Lazy e = LazyKt.lazy(new d());

    @NotNull
    private final Lazy f = LazyKt.lazy(new c());

    @NotNull
    private final Lazy g = LazyKt.lazy(new i());

    @NotNull
    private final Lazy h = LazyKt.lazy(new f());

    @NotNull
    private final Lazy i = LazyKt.lazy(new h());

    @NotNull
    private final Lazy j = LazyKt.lazy(new b());

    @NotNull
    private final Lazy k = LazyKt.lazy(new a());

    /* renamed from: com.ironsource.n5$a */
    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.v, false));
        }
    }

    /* renamed from: com.ironsource.n5$b */
    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.p, false));
        }
    }

    /* renamed from: com.ironsource.n5$c */
    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.w, false));
        }
    }

    /* renamed from: com.ironsource.n5$d */
    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.A, false));
        }
    }

    /* renamed from: com.ironsource.n5$e */
    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.z, false));
        }
    }

    /* renamed from: com.ironsource.n5$f */
    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.r, false));
        }
    }

    /* renamed from: com.ironsource.n5$g */
    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.x, false));
        }
    }

    /* renamed from: com.ironsource.n5$h */
    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.q, false));
        }
    }

    /* renamed from: com.ironsource.n5$i */
    static final class i extends Lambda implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.s, false));
        }
    }

    /* renamed from: com.ironsource.n5$j */
    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(C4783n5.this.V().optBoolean(C4837q5.y, false));
        }
    }

    private final boolean L() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final boolean M() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean N() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean O() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean P() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean Q() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean R() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean T() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean U() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject V() {
        JSONObject optJSONObject = this.a.optJSONObject(C4801o5.a);
        return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int A() {
        String optString = V().optString(C4837q5.t);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD_PARALLEL_LOAD_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean B() {
        return V().optBoolean(C4837q5.J, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int C() {
        String optString = V().optString(C4837q5.a);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean D() {
        return V().optBoolean(C4837q5.m, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean E() {
        return V().optBoolean(C4837q5.o, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean F() {
        return V().optBoolean(C4837q5.I, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean G() {
        return Q();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean H() {
        return T();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public long I() {
        String optString = V().optString(C4837q5.c);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_TIME)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean J() {
        return M();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int K() {
        String optString = V().optString(C4837q5.u);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD…RALLEL_LOAD_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean b() {
        return N();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int c() {
        String optString = V().optString(C4837q5.b);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_ATTEMPTS)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.A7
    @NotNull
    public JSONObject config() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean d() {
        return V().optBoolean(C4837q5.i, true);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean e() {
        return V().optBoolean(C4837q5.D, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public long f() {
        String optString = V().optString(C4837q5.d);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean g() {
        return V().optBoolean(C4837q5.H, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean h() {
        return V().optBoolean(C4837q5.E, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int i() {
        String optString = V().optString(C4837q5.g);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…C_INSTANCES_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean j() {
        return V().optBoolean(C4837q5.k, true);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean k() {
        return P();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean l() {
        return V().optBoolean(C4837q5.f, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean m() {
        return L();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public long n() {
        String optString = V().optString(C4837q5.e);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean o() {
        return R();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean p() {
        return O();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean q() {
        return U();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean r() {
        return S();
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean s() {
        return V().optBoolean(C4837q5.n, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean t() {
        return V().optBoolean(C4837q5.F, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean u() {
        return V().optBoolean(C4837q5.B, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean v() {
        return V().optBoolean(C4837q5.l, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean w() {
        return V().optBoolean(C4837q5.j, false);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public int x() {
        String optString = V().optString(C4837q5.h);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…TATIC_INSTANCES_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean y() {
        return V().optBoolean(C4837q5.G, true);
    }

    @Override // com.ironsource.InterfaceC4819p5
    public boolean z() {
        return V().optBoolean(C4837q5.K, false);
    }

    @Override // com.ironsource.A7.a
    public void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4819p5
    @NotNull
    public String a() {
        String optString = V().optString("controllerUrl", "");
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CONTROLLER_URL, \"\")");
        return optString;
    }
}
