package com.ironsource;

import android.content.Context;
import com.ironsource.C4613de;
import com.ironsource.C4914ub;
import com.ironsource.C9;
import com.ironsource.F0;
import com.ironsource.I8;
import com.ironsource.K7;
import com.ironsource.Kb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4914ub {

    @NotNull
    public static final C4914ub a = new C4914ub();

    @NotNull
    private static final C4936vb b = new C4936vb();

    /* renamed from: com.ironsource.ub$a */
    public static final class a implements InterfaceC4921ue {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C4658g5 c;
        final /* synthetic */ LevelPlayInitListener d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4658g5 c4658g5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c4658g5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4810oe sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C4936vb c4936vb = C4914ub.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.a;
            final Context context = this.b;
            final C4658g5 c4658g5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c4936vb.c(new Runnable() { // from class: com.ironsource.ub$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4914ub.a.a(C4810oe.this, levelPlayInitRequest, context, c4658g5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4810oe sdkConfig, LevelPlayInitRequest initRequest, Context context, C4658g5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C4590c9 a;
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C4608d9 f = sdkConfig.f();
            if (f != null && (a = f.a()) != null) {
                new C4698i9().a(a.f(), a.e().d(), a.e().e(), a.e().f(), a.d());
            }
            C4914ub.a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull final C4846qe error, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4936vb c4936vb = C4914ub.b;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            final C4658g5 c4658g5 = this.c;
            c4936vb.c(new Runnable() { // from class: com.ironsource.ub$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4914ub.a.a(LevelPlayInitListener.this, c4658g5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4658g5 initDuration, C4846qe error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C4914ub.a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* renamed from: com.ironsource.ub$b */
    static final class b extends Lambda implements Function0 {
        final /* synthetic */ Va a;
        final /* synthetic */ C4658g5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Va va, C4658g5 c4658g5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = va;
            this.b = c4658g5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C4914ub.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.ub$c */
    static final class c extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private C4914ub() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C4658g5 c4658g5 = new C4658g5();
        C4936vb c4936vb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        De.a.a(context, new C4957we(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c4936vb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4658g5, levelPlayInitListener));
    }

    public final void b(@NotNull LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.h().a(a(segment));
    }

    public final void b(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().a(new C4547ab(listener));
    }

    public static /* synthetic */ void a(C4914ub c4914ub, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4914ub.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(@NotNull final Context context, @NotNull final LevelPlayInitRequest initRequest, @Nullable final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.c(new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4914ub.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void b(@NotNull Function0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Kb.u.c().h().D()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC4756le.a.a(task), 0L, 2, null);
        } else {
            task.mo4828invoke();
        }
    }

    public final void a(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().b(new C4547ab(listener));
    }

    private final C4573ba a(LevelPlaySegment levelPlaySegment) {
        C4573ba c4573ba = new C4573ba();
        c4573ba.a(levelPlaySegment.getLevel());
        c4573ba.a(levelPlaySegment.getIapTotal());
        c4573ba.a(levelPlaySegment.isPaying());
        c4573ba.a(levelPlaySegment.getUserCreationDate());
        c4573ba.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c4573ba.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c4573ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4810oe c4810oe, Context context, C4658g5 c4658g5, LevelPlayInitListener levelPlayInitListener) {
        Kb.b bVar = Kb.u;
        I8.a E = bVar.a().E();
        C4876s9.a.a();
        Va va = new Va(c4810oe);
        if (va.n()) {
            b.a(context);
        }
        K7.a b2 = bVar.a().b();
        C4936vb c4936vb = b;
        va.b(c4936vb).a(b2);
        va.a(c4936vb).a(bVar.a().l());
        va.c(c4936vb).a(bVar.a().v());
        C4914ub c4914ub = a;
        c4914ub.a(levelPlayInitRequest, va);
        bVar.d().B().a(va);
        bVar.d().F().a(va);
        long n = bVar.d().h().n();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        IronSourceThreadManager ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
        ironSourceThreadManager.changeToUISchedulerIfNeeded();
        com.ironsource.mediationsdk.c.b().g();
        c4914ub.a(n, new b(va, c4658g5, n, levelPlayInitListener));
        E.a(va);
        if (c4810oe.a().e()) {
            new Pd(null, null, null, ironSourceThreadManager.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(long j, final Function0 function0) {
        if (!Kb.u.d().f().c() && j > 0) {
            Ff ff = new Ff(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            Runnable runnable = new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C4914ub.a(Function0.this);
                }
            };
            Duration.Companion companion = Duration.Companion;
            ff.a(runnable, DurationKt.toDuration(j, DurationUnit.MILLISECONDS));
            return;
        }
        function0.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Va va, C4658g5 c4658g5, long j, final LevelPlayInitListener levelPlayInitListener) {
        Kb.u.a().E().d();
        long a2 = C4658g5.a(c4658g5);
        C4936vb c4936vb = b;
        C4936vb.a(c4936vb, a2, va.g(), j, null, 8, null);
        c4936vb.d(new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4914ub.a(LevelPlayInitListener.this, va);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Va levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m(), levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Va va) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && va.d().c().f() != null) {
            C4613de.a aVar = C4613de.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C4613de a2 = aVar.a(new C4671h0(aVar2, C4950w7.a.a(), "", null, null, null, 56, null), va, true);
            List<C5009zc> d = va.d(adFormat);
            F0.b bVar = F0.b.MEDIATION;
            new Ed(new V0(new C4814p0(aVar2, bVar), a2, bVar), adFormat, d, a2).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && va.d().c().d() != null) {
            C9.a aVar3 = C9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            C9 a3 = aVar3.a(new C4671h0(aVar4, C4950w7.a.a(), "", null, null, null, 56, null), va, true);
            List<C5009zc> d2 = va.d(adFormat2);
            F0.b bVar2 = F0.b.MEDIATION;
            new Ed(new V0(new C4814p0(aVar4, bVar2), a3, bVar2), adFormat2, d2, a3).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || va.d().c().c() == null) {
            return;
        }
        M2 a4 = M2.z.a(new J2(), va, true);
        List<C5009zc> d3 = va.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        F0.b bVar3 = F0.b.MEDIATION;
        new Ed(new V0(new C4814p0(aVar5, bVar3), a4, bVar3), adFormat3, d3, a4).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C4658g5 c4658g5, final C4846qe c4846qe) {
        long a2 = C4658g5.a(c4658g5);
        C4936vb c4936vb = b;
        final C4846qe b2 = c4936vb.b(c4846qe);
        C4936vb.a(c4936vb, b2, a2, null, 4, null);
        c4936vb.d(new Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4914ub.a(C4846qe.this, levelPlayInitListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4846qe error, LevelPlayInitListener levelPlayInitListener, C4846qe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(eventError)));
        }
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        b(new c(key, values));
    }
}
