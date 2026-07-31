package com.ironsource;

import android.content.Context;
import com.ironsource.Ce;
import com.ironsource.Kb;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class Ce {

    @NotNull
    public static final b l = new b(null);

    @NotNull
    private static final Lazy m = LazyKt.lazy(a.a);

    @NotNull
    private final He a;

    @NotNull
    private final Se b;

    @NotNull
    private final Ie c;
    private C4560af d;

    @NotNull
    private final Lazy e;
    private final String f;

    @NotNull
    private final List<InterfaceC4921ue> g;

    @Nullable
    private C4810oe h;

    @Nullable
    private C4846qe i;
    private boolean j;
    private long k;

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ce mo4828invoke() {
            return new Ce(null, null, null, 7, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ce a() {
            return (Ce) Ce.m.getValue();
        }

        private b() {
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4749l7 mo4828invoke() {
            return Kb.u.d().k();
        }
    }

    public static final class d implements InterfaceC4921ue {
        final /* synthetic */ Context b;

        d(Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4810oe sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            He he = Ce.this.a;
            final Ce ce = Ce.this;
            final Context context = this.b;
            he.c(new Runnable() { // from class: com.ironsource.Ce$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.d.a(Ce.this, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ce this$0, Context applicationContext, C4810oe sdkConfig) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4846qe error, @Nullable final C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            He he = Ce.this.a;
            final Ce ce = Ce.this;
            he.c(new Runnable() { // from class: com.ironsource.Ce$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Ce.d.a(Ce.this, error, c4608d9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ce this$0, C4846qe error, C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            this$0.a(error, c4608d9);
        }
    }

    public Ce() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ce this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    private final InterfaceC4749l7 c() {
        return (InterfaceC4749l7) this.e.getValue();
    }

    public final void d() {
        this.a.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(Ce.this);
            }
        });
    }

    public Ce(@NotNull He tools, @NotNull Se serverInit, @NotNull Ie sdkServicesInitializer) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.a = tools;
        this.b = serverInit;
        this.c = sdkServicesInitializer;
        this.e = LazyKt.lazy(c.a);
        this.f = Ce.class.getSimpleName();
        this.g = new ArrayList();
    }

    private final void b(C4810oe c4810oe) {
        this.h = c4810oe;
        a(false);
    }

    private final Ee b() {
        if (this.h != null) {
            return Ee.INITIATED;
        }
        if (this.i != null) {
            return Ee.INIT_FAILED;
        }
        if (this.j) {
            return Ee.INIT_IN_PROGRESS;
        }
        return Ee.NOT_INIT;
    }

    private final void a(Context context, U9 u9, We we) {
        u9.i(we.g().h());
        u9.c(we.g().d());
        C1 b2 = we.c().b();
        Intrinsics.checkNotNull(b2);
        u9.a(b2.a());
        u9.d(b2.c().b());
        u9.b(b2.k().b());
        u9.a(Boolean.valueOf(IronSourceUtils.c(context)));
        C1 b3 = we.c().b();
        Intrinsics.checkNotNull(b3);
        u9.b(b3.f().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4921ue listener, C4810oe sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4921ue listener, C4846qe error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC4921ue.a(listener, error, null, 2, null);
    }

    private final void b(Context context, C4810oe c4810oe) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        J1 b2;
        Rb e;
        J1 g;
        U2 c2;
        J1 g2;
        E9 d2;
        J1 i;
        C4649fe f;
        J1 m2;
        J1 b3;
        We d3 = c4810oe.d();
        C1 b4 = d3.c().b();
        if (b4 == null || (b3 = b4.b()) == null) {
            z = false;
            str = null;
        } else {
            z = b3.l();
            str = b3.d();
        }
        N3 c3 = d3.c();
        if (c3 == null || (f = c3.f()) == null || (m2 = f.m()) == null) {
            z2 = false;
            str2 = null;
        } else {
            boolean l2 = m2.l();
            str2 = m2.d();
            z2 = l2;
        }
        N3 c4 = d3.c();
        if (c4 == null || (d2 = c4.d()) == null || (i = d2.i()) == null) {
            z3 = false;
            str3 = null;
        } else {
            boolean l3 = i.l();
            str3 = i.d();
            z3 = l3;
        }
        N3 c5 = d3.c();
        boolean l4 = (c5 == null || (c2 = c5.c()) == null || (g2 = c2.g()) == null) ? false : g2.l();
        N3 c6 = d3.c();
        boolean l5 = (c6 == null || (e = c6.e()) == null || (g = e.g()) == null) ? false : g.l();
        Kb.b bVar = Kb.u;
        bVar.d().q().b(str, context);
        if (z) {
            C1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        C4685he.i().b(str2, context);
        if (z2) {
            N3 c7 = d3.c();
            C4649fe f2 = c7 != null ? c7.f() : null;
            Intrinsics.checkNotNull(f2);
            J1 rewardedVideoConfig = f2.m();
            C4685he i2 = C4685he.i();
            Intrinsics.checkNotNullExpressionValue(i2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, i2, rewardedVideoConfig, context, d3, false, 16, null);
        } else {
            C4685he.i().a(false);
        }
        G9.i().b(str3, context);
        if (z3) {
            N3 c8 = d3.c();
            E9 d4 = c8 != null ? c8.d() : null;
            Intrinsics.checkNotNull(d4);
            J1 interstitialConfig = d4.i();
            G9 i3 = G9.i();
            Intrinsics.checkNotNullExpressionValue(i3, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, i3, interstitialConfig, context, d3, false, 16, null);
        } else if (l4) {
            N3 c9 = d3.c();
            U2 c10 = c9 != null ? c9.c() : null;
            Intrinsics.checkNotNull(c10);
            J1 bannerConfig = c10.g();
            G9 i4 = G9.i();
            Intrinsics.checkNotNullExpressionValue(i4, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, i4, bannerConfig, context, d3, false, 16, null);
        } else if (l5) {
            N3 c11 = d3.c();
            Rb e2 = c11 != null ? c11.e() : null;
            Intrinsics.checkNotNull(e2);
            J1 g3 = e2.g();
            G9 i5 = G9.i();
            Intrinsics.checkNotNullExpressionValue(i5, "getInstance()");
            a(this, i5, g3, context, d3, false, 16, null);
        } else {
            G9.i().a(false);
        }
        N3 c12 = d3.c();
        C1 b6 = c12 != null ? c12.b() : null;
        Intrinsics.checkNotNull(b6);
        C4648fd i6 = b6.i();
        boolean a2 = i6.a();
        String b7 = i6.b();
        boolean c13 = i6.c();
        int d5 = i6.d();
        int[] e3 = i6.e();
        int[] f3 = i6.f();
        C4630ed c4630ed = C4630ed.P;
        c4630ed.a(a2);
        c4630ed.b(b7, context);
        if (a2) {
            c4630ed.b(e3, context);
            c4630ed.c(f3, context);
            c4630ed.b(c13);
            c4630ed.c(d5);
        }
    }

    public final void a(@NotNull final Context context, @NotNull final C4957we initRequest, @NotNull final InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        this.a.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Ce.a(Ce.this, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ce this$0, InterfaceC4921ue listener, Context context, C4957we initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C4810oe c4810oe = this$0.h;
        if (c4810oe != null) {
            this$0.a(listener, c4810oe);
            return;
        }
        this$0.g.add(listener);
        if (this$0.j) {
            return;
        }
        this$0.i = null;
        this$0.a(true);
        this$0.k = new Date().getTime();
        this$0.b.a(context, initRequest, this$0.a, this$0.new d(context2));
    }

    public /* synthetic */ Ce(He he, Se se, Ie ie, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ge() : he, (i & 2) != 0 ? new Re(null, 1, null) : se, (i & 4) != 0 ? new Ie(null, null, null, null, null, 31, null) : ie);
    }

    public final void a(@NotNull final C4975xe serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ce.a(C4975xe.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4975xe serverResponse, Ce this$0) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4810oe c4810oe = new C4810oe(serverResponse, null, null, 6, null);
        this$0.b(c4810oe);
        this$0.a(c4810oe);
    }

    public final void a(@NotNull final C4846qe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.c(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ce.a(Ce.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ce this$0, C4846qe error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.a(error, (C4608d9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4846qe c4846qe, C4608d9 c4608d9) {
        this.i = c4846qe;
        a(false);
        Iterator<InterfaceC4921ue> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4846qe);
        }
        this.g.clear();
        if (c4608d9 != null) {
            c4608d9.b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4846qe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4810oe c4810oe) {
        Te i;
        b(c4810oe);
        M1 a2 = c4810oe.a();
        V4 v4 = V4.a;
        v4.c(a2.g());
        Kb.b bVar = Kb.u;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c4810oe.i()) != null) {
            this.c.a(context, i);
        }
        C4608d9 f = c4810oe.f();
        if (f != null) {
            f.b();
        }
        v4.a(a2.f());
        v4.a(a2.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.h());
        c().a(a2);
        a(context, this.a.g(), c4810oe.d());
        this.a.a(new Date().getTime() - this.k, c4810oe.g());
        C4560af c4560af = new C4560af();
        this.d = c4560af;
        c4560af.a(c());
        IronSourceUtils.e(context, c4810oe.d().toString());
        bVar.d().q().c(true);
        G9.i().c(true);
        C4685he.i().c(true);
        C4630ed c4630ed = C4630ed.P;
        c4630ed.c(true);
        b(context, c4810oe);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4810oe.e().b());
        F1 b2 = c4810oe.b();
        if (b2.f()) {
            this.a.a(b2);
        }
        a(c4810oe);
        c4630ed.i();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Ye.a());
        ironLog.verbose("parameters for init POST data: " + Ye.b());
    }

    private final void a(C4810oe c4810oe) {
        Iterator<InterfaceC4921ue> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4810oe);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.a.a(b());
    }

    private final void a(final InterfaceC4921ue interfaceC4921ue, final C4810oe c4810oe) {
        this.a.a(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(InterfaceC4921ue.this, c4810oe);
            }
        });
    }

    private final void a(final InterfaceC4921ue interfaceC4921ue, final C4846qe c4846qe) {
        this.a.a(new Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ce.b(InterfaceC4921ue.this, c4846qe);
            }
        });
    }

    static /* synthetic */ void a(Ce ce, AbstractC4745l3 abstractC4745l3, J1 j1, Context context, We we, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        ce.a(abstractC4745l3, j1, context, we, z);
    }

    private final void a(AbstractC4745l3 abstractC4745l3, J1 j1, Context context, We we, boolean z) {
        abstractC4745l3.a(z);
        abstractC4745l3.a(j1.c(), context);
        abstractC4745l3.b(j1.d(), context);
        abstractC4745l3.a(j1.f());
        abstractC4745l3.d(j1.e());
        abstractC4745l3.b(j1.a());
        abstractC4745l3.b(j1.i(), context);
        abstractC4745l3.c(j1.h(), context);
        abstractC4745l3.a(j1.j(), context);
        abstractC4745l3.d(j1.g(), context);
        C1 b2 = we.c().b();
        Intrinsics.checkNotNull(b2);
        abstractC4745l3.a(b2.j());
        abstractC4745l3.b(j1.k());
        abstractC4745l3.c(j1.b());
    }
}
