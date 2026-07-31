package com.ironsource;

import android.app.Activity;
import com.ironsource.F0;
import com.ironsource.Gf;
import com.ironsource.InterfaceC4807ob;
import com.ironsource.InterfaceC4818p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4855r6 implements InterfaceC4730k6 {

    @NotNull
    private final Kb a;

    @NotNull
    private final V0 b;

    @NotNull
    private final AbstractC4961x0 c;

    @NotNull
    private InterfaceC4909u6 d;

    @Nullable
    private final Function2 e;

    @NotNull
    private final Gf f;

    @NotNull
    private final InterfaceC4818p4 g;

    @Nullable
    private C4748l6 h;

    @Nullable
    private b i;

    @Nullable
    private a j;

    @NotNull
    private final Lg k;

    @Nullable
    private Gf.a l;

    @Nullable
    private Long m;

    /* renamed from: com.ironsource.r6$a */
    public interface a {
        void a(@NotNull C4855r6 c4855r6, @Nullable IronSourceError ironSourceError);

        void a(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.r6$b */
    public interface b {
        void a(@NotNull C4855r6 c4855r6);

        void b(@NotNull C4855r6 c4855r6, @Nullable IronSourceError ironSourceError);

        void b(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

        void c(@NotNull C4855r6 c4855r6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* renamed from: com.ironsource.r6$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.r6$e */
    /* synthetic */ class e extends FunctionReferenceImpl implements Function2 {
        e(Object obj) {
            super(2, obj, C4855r6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4712j6 invoke(@NotNull C p0, @NotNull I p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((C4855r6) this.receiver).a(p0, p1);
        }
    }

    /* renamed from: com.ironsource.r6$f */
    static final class f extends Lambda implements Function1 {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final void a(@NotNull C4855r6 weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            b bVar = weak.i;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.k.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4855r6) obj);
            return Unit.INSTANCE;
        }
    }

    public C4855r6(@NotNull Kb mediationServices, @NotNull V0 adUnitTools, @NotNull AbstractC4961x0 adUnitData, @NotNull InterfaceC4909u6 fullscreenListener, @Nullable Ng ng, @Nullable Function2 function2, @NotNull Gf taskScheduler, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = function2;
        this.f = taskScheduler;
        this.g = currentTimeProvider;
        this.k = a(ng);
    }

    private final void i() {
        String c2 = c();
        if (c2.length() > 0) {
            this.a.b().b(c2, b());
            G3 a2 = this.a.p().a(c2, b());
            if (a2.d()) {
                this.b.f().a().b(c2, a2.e());
            }
        }
    }

    protected final void finalize() {
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Gf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C4855r6 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function2 function2 = this$0.e;
        if (function2 == null) {
            function2 = new e(this$0);
        }
        C4712j6 c4712j6 = (C4712j6) function2.invoke(instanceData, adInstancePayload);
        c4712j6.a(this$0);
        return c4712j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC4974xd f() {
        int i = c.a[b().ordinal()];
        if (i == 1) {
            return this.a.B();
        }
        if (i != 2) {
            return null;
        }
        return this.a.F();
    }

    private final InterfaceC4807ob<Unit> g() {
        if (!this.k.h()) {
            return new InterfaceC4807ob.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.a.p().a(c(), b()).d()) {
            return new InterfaceC4807ob.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.a.g().a(this.c.b().c()).d()) {
            return new InterfaceC4807ob.b(Unit.INSTANCE);
        }
        return new InterfaceC4807ob.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Gf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long b2 = this.b.b(b());
        Gf gf = this.f;
        Gf.b a2 = Hf.a(this, f.a);
        Duration.Companion companion = Duration.Companion;
        this.l = gf.a(a2, DurationKt.toDuration(b2, DurationUnit.MILLISECONDS));
    }

    @NotNull
    public final InterfaceC4909u6 d() {
        return this.d;
    }

    @Nullable
    public final LevelPlayAdInfo e() {
        B e2 = this.k.e();
        if (e2 != null) {
            return e2.e();
        }
        return null;
    }

    public final void a(@NotNull InterfaceC4909u6 interfaceC4909u6) {
        Intrinsics.checkNotNullParameter(interfaceC4909u6, "<set-?>");
        this.d = interfaceC4909u6;
    }

    public final void a(@NotNull b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.i = loadListener;
        this.m = Long.valueOf(this.g.a());
        this.b.a(new C4867s0(this.c.b()));
        E e2 = new E() { // from class: com.ironsource.r6$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c2, I i) {
                B b2;
                b2 = C4855r6.b(C4855r6.this, c2, i);
                return b2;
            }
        };
        this.b.f().e().a(this.c.u());
        this.k.a(e2);
    }

    @Override // com.ironsource.F
    public void b(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k.d(instance);
        this.b.f().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    /* renamed from: com.ironsource.r6$d */
    public static final class d implements Tg {
        d() {
        }

        @Override // com.ironsource.Tg
        public void a(int i, @NotNull String errorReason) {
            Long l;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l2 = C4855r6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C4855r6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C4855r6.this.b.f().e().a(l != null ? l.longValue() : 0L, i, errorReason, C4855r6.this.c.u());
            b bVar = C4855r6.this.i;
            if (bVar != null) {
                bVar.b(C4855r6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.Tg
        public void b(@NotNull B instance) {
            Long l;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l2 = C4855r6.this.m;
            if (l2 != null) {
                l = Long.valueOf(C4855r6.this.g.a() - l2.longValue());
            } else {
                l = null;
            }
            C4855r6.this.b.f().e().a(l != null ? l.longValue() : 0L, C4855r6.this.c.u());
            C4855r6.this.h();
            b bVar = C4855r6.this.i;
            if (bVar != null) {
                bVar.b(C4855r6.this, instance.e());
            }
        }

        @Override // com.ironsource.Tg
        public void a(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C4855r6.this.b.f().a().e(C4855r6.this.c());
            C4855r6.this.h();
            b bVar = C4855r6.this.i;
            if (bVar != null) {
                bVar.c(C4855r6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC4730k6
    public void b(@NotNull C4712j6 fullscreenInstance) {
        InterfaceC4974xd f2;
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        if (fullscreenInstance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        this.b.f().a().b(c());
        this.k.c();
        this.h = null;
        this.d.onClosed();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C4855r6(Kb kb, V0 v0, AbstractC4961x0 abstractC4961x0, InterfaceC4909u6 interfaceC4909u6, Ng ng, Function2 function2, Gf gf, InterfaceC4818p4 interfaceC4818p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kb, v0, abstractC4961x0, interfaceC4909u6, r8, r9, r10, (i & 128) != 0 ? new InterfaceC4818p4.a() : interfaceC4818p4);
        Gf gf2;
        If r2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Ng ng2 = (i & 16) != 0 ? null : ng;
        Function2 function22 = (i & 32) != 0 ? null : function2;
        if ((i & 64) != 0) {
            gf2 = new Ff(r2, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            gf2 = gf;
        }
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public final void a(@NotNull Activity activity, @NotNull a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4814p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = displayListener;
        this.b.f().a().a(activity, c());
        InterfaceC4807ob<Unit> g = g();
        if (g instanceof InterfaceC4807ob.a) {
            IronSourceError b2 = ((InterfaceC4807ob.a) g).b();
            ironLog.verbose(C4814p0.a(this.b, b2.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.f().a().a(c(), b2.getErrorCode(), b2.getErrorMessage(), this.k.g());
            displayListener.a(this, b2);
            return;
        }
        Gf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        C4748l6 c4748l6 = new C4748l6(activity);
        this.h = c4748l6;
        this.k.a((K) c4748l6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4712j6 a(C c2, I i) {
        return new C4712j6(new V0(this.b, F0.b.PROVIDER), c2, i);
    }

    private final Lg a(Ng ng) {
        Tg a2 = a();
        if (ng != null) {
            return ng.a(a2, this);
        }
        return new Lg(this.b, this.c, Kb.u.c().h().u(), a2, f(), this);
    }

    private final Tg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC4730k6
    public void a(@NotNull C4712j6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.k.c();
        this.h = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        i();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(@NotNull B instance, @NotNull IronSourceError error) {
        InterfaceC4974xd f2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, error.toString(), (String) null, 2, (Object) null));
        if (instance.A() && (f2 = f()) != null) {
            f2.a(this.c.b().c(), true);
        }
        C4748l6 c4748l6 = this.h;
        Od g = this.k.g();
        a(g);
        if (g == Od.CAN_RECOVER && c4748l6 != null) {
            this.k.a((K) c4748l6, true);
            return;
        }
        this.k.c();
        this.h = null;
        this.b.f().a().a(c(), error.getErrorCode(), error.getErrorMessage(), g);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(Od od) {
        if (od == Od.CAN_RECOVER || od == Od.NO_LOADED_ADS) {
            this.b.f().h().a(od);
        }
    }

    @Override // com.ironsource.InterfaceC4730k6
    public void a(@NotNull C4712j6 fullscreenInstance, @NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.f().a().a(c());
        this.d.e();
    }
}
