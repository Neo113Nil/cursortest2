package com.ironsource;

import android.app.Activity;
import com.ironsource.C4677h6;
import com.ironsource.C4814p0;
import com.ironsource.F0;
import com.ironsource.InterfaceC4724k0;
import com.ironsource.X0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Ya implements InterfaceC4659g6 {

    @NotNull
    public static final a o = new a(null);

    @NotNull
    public static final String p = "Fullscreen Ad Internal";

    @NotNull
    private final LevelPlay.AdFormat a;

    @NotNull
    private final String b;

    @NotNull
    private final b c;

    @NotNull
    private final C4814p0 d;

    @NotNull
    private final C4641f6 e;

    @NotNull
    private final Z0 f;

    @NotNull
    private final InterfaceC4979y0 g;

    @NotNull
    private final I7 h;

    @NotNull
    private final InterfaceC4818p4 i;

    @NotNull
    private final Lazy j;

    @Nullable
    private Za k;

    @NotNull
    private final UUID l;

    @NotNull
    private InterfaceC4838q6 m;

    @Nullable
    private C4658g5 n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C4814p0 a = C4814p0.a.a(com.unity3d.mediation.a.a(adFormat), F0.b.MEDIATION);
            if (!a.a()) {
                a.f().a().a(placementName, Y0.b, false);
                return false;
            }
            G3 a2 = Kb.u.d().p().a(placementName, adFormat);
            boolean d = a2.d();
            a.f().a().a(placementName, a2.e(), d);
            return d;
        }

        private a() {
        }
    }

    public interface b {
        @Nullable
        Double getBidFloor();
    }

    public static final class c {

        @NotNull
        private final C4814p0 a;

        @NotNull
        private final C4641f6 b;

        @NotNull
        private final I7 c;

        @NotNull
        private final InterfaceC4818p4 d;

        @NotNull
        private final C4950w7 e;

        @NotNull
        private final b f;

        @NotNull
        private final Z0 g;

        public c(@NotNull C4814p0 adTools, @NotNull C4641f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4818p4 currentTimeProvider, @NotNull C4950w7 idFactory, @NotNull b config, @NotNull Z0 adUnitValidator) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
            this.a = adTools;
            this.b = adControllerFactory;
            this.c = provider;
            this.d = currentTimeProvider;
            this.e = idFactory;
            this.f = config;
            this.g = adUnitValidator;
        }

        @NotNull
        public final C4641f6 a() {
            return this.b;
        }

        @NotNull
        public final C4814p0 b() {
            return this.a;
        }

        @NotNull
        public final Z0 c() {
            return this.g;
        }

        @NotNull
        public final b d() {
            return this.f;
        }

        @NotNull
        public final InterfaceC4818p4 e() {
            return this.d;
        }

        @NotNull
        public final C4950w7 f() {
            return this.e;
        }

        @NotNull
        public final I7 g() {
            return this.c;
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4623e6 mo4828invoke() {
            return Ya.this.b();
        }
    }

    public static final class e implements InterfaceC4873s6 {
        final /* synthetic */ C4671h0 b;

        e(C4671h0 c4671h0) {
            this.b = c4671h0;
        }

        @Override // com.ironsource.InterfaceC4873s6
        @NotNull
        public C4855r6 a(boolean z, @NotNull InterfaceC4909u6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC4961x0 a = Ya.this.g().a(z, this.b);
            return new C4855r6(Kb.u.c(), new V0(Ya.this.f(), a, F0.b.MEDIATION), a, listener, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ya(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId, @NotNull b config, @NotNull C4814p0 adTools, @NotNull C4641f6 fullscreenAdControllerFactory, @NotNull Z0 adUnitValidator, @NotNull InterfaceC4979y0 adUnitDataFactory, @NotNull I7 mediationServicesProvider, @NotNull InterfaceC4818p4 currentTimeProvider, @NotNull C4950w7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.a = adFormat;
        this.b = adUnitId;
        this.c = config;
        this.d = adTools;
        this.e = fullscreenAdControllerFactory;
        this.f = adUnitValidator;
        this.g = adUnitDataFactory;
        this.h = mediationServicesProvider;
        this.i = currentTimeProvider;
        this.j = LazyKt.lazy(new d());
        UUID a2 = idFactory.a();
        this.l = a2;
        this.m = new C4677h6(this, null, 2, 0 == true ? 1 : 0);
        adTools.f().a(new C4777n(com.unity3d.mediation.a.a(adFormat), a2, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().f().a();
    }

    private final void p() {
        Double bidFloor = this.c.getBidFloor();
        if (bidFloor != null) {
            this.d.f().f().a(bidFloor.doubleValue());
        }
    }

    @NotNull
    public final C4623e6 c() {
        return (C4623e6) this.j.getValue();
    }

    @NotNull
    public final LevelPlay.AdFormat d() {
        return this.a;
    }

    @NotNull
    public final UUID e() {
        return this.l;
    }

    @NotNull
    public final C4814p0 f() {
        return this.d;
    }

    @NotNull
    public final InterfaceC4979y0 g() {
        return this.g;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    @NotNull
    public final b i() {
        return this.c;
    }

    @NotNull
    public final InterfaceC4818p4 j() {
        return this.i;
    }

    @Nullable
    public final Za k() {
        return this.k;
    }

    @NotNull
    public final I7 l() {
        return this.h;
    }

    public final boolean m() {
        InterfaceC4724k0 c2 = this.m.c();
        this.d.f().e().a(Boolean.valueOf(c2.a()), c2 instanceof InterfaceC4724k0.a ? ((InterfaceC4724k0.a) c2).c() : null);
        return c2.a();
    }

    public final void n() {
        if (this.d.a()) {
            this.n = new C4658g5();
            this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Ya.c(Ya.this);
                }
            });
        } else {
            this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Ya.b(Ya.this);
                }
            });
            String uuid = this.l.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
            a(this, new LevelPlayAdError(uuid, this.b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
        }
    }

    public final void o() {
        a(new C4784n6(this, this.i));
        c().m();
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdClicked() {
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ya.d(Ya.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdClosed() {
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Ya.e(Ya.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdDisplayed(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Ya.b(Ya.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                Ya.c(Ya.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdLoadFailed(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                Ya.c(Ya.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void onAdLoaded(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ya.d(Ya.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().f().a();
        this$0.m.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Ya this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Ya this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.a();
    }

    public final void a(@Nullable Za za) {
        this.k = za;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ya this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ya this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m.onAdClicked();
    }

    public final void a(@NotNull InterfaceC4838q6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.m = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m.onAdLoadFailed(error);
    }

    public final void a(@NotNull final Activity activity, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(activity, this, str);
            }
        });
    }

    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.d.f().h().f("Fullscreen Ad Internal - " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Ya this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.d.f().h().d();
        this$0.m.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4623e6 b() {
        C4671h0 c4671h0 = new C4671h0(com.unity3d.mediation.a.a(this.a), this.l, this.b, null, this.h.A().a(), this.c.getBidFloor(), 8, null);
        e eVar = new e(c4671h0);
        C5002z5 f = this.d.f();
        C4814p0 c4814p0 = this.d;
        f.a(new D0(c4814p0, c4671h0, c4814p0.b(this.a, this.b).b().b()));
        return this.e.a(this, this.d, c4671h0, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ya this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.m.onAdInfoChanged(adInfo);
    }

    public final void a(@NotNull C4677h6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.m = new C4677h6(this, status);
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void a(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Ya.b(Ya.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void a() {
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Ya.f(Ya.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4659g6
    public void a(@NotNull final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C4814p0.a(this.d, "onAdRewarded state.getAdInfo: " + this.m.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Ya this$0, final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        final LevelPlayAdInfo b2 = this$0.m.b();
        IronLog.INTERNAL.verbose(C4814p0.a(this$0.d, "onAdRewarded adInfo: " + b2 + " reward: " + reward, (String) null, 2, (Object) null));
        this$0.d.d(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, reward, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Za za = this$0.k;
        if (za != null) {
            za.onAdRewarded(reward, adInfo);
        }
    }

    public final void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4814p0.a(this.d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long a2 = C4658g5.a(this.n);
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, a2);
            }
        });
        this.d.d(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, adInfo);
            }
        });
    }

    public /* synthetic */ Ya(LevelPlay.AdFormat adFormat, String str, b bVar, C4814p0 c4814p0, C4641f6 c4641f6, Z0 z0, InterfaceC4979y0 interfaceC4979y0, I7 i7, InterfaceC4818p4 interfaceC4818p4, C4950w7 c4950w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c4814p0, c4641f6, z0, interfaceC4979y0, (i & 128) != 0 ? Kb.u.d() : i7, interfaceC4818p4, c4950w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.f().f().a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Za za = this$0.k;
        if (za != null) {
            za.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Ya ya, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ya.a(levelPlayAdError, j);
    }

    public final void a(@Nullable final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C4814p0.a(this.d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, j, levelPlayAdError);
            }
        });
        this.d.d(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(LevelPlayAdError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, long j, LevelPlayAdError levelPlayAdError) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Uc f = this$0.d.f().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (str = levelPlayAdError.getErrorMessage()) == null) {
            str = "";
        }
        f.a(j, errorCode, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Ya this$0) {
        Za za;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (za = this$0.k) == null) {
            return;
        }
        za.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(@NotNull final LevelPlayAdError error, @NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4814p0.a(this.d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.d.c(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, error);
            }
        });
        this.d.d(new Runnable() { // from class: com.ironsource.Ya$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Ya.a(Ya.this, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.d.f().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ya this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Za za = this$0.k;
        if (za != null) {
            za.onAdDisplayFailed(error, adInfo);
        }
    }

    @NotNull
    public final LevelPlayReward a(@Nullable String str) {
        O7 C = this.h.C();
        I8 f = this.h.f();
        Uc f2 = this.d.f().f();
        X0 a2 = this.f.a(this.b, this.a, f);
        if (a2 instanceof X0.a) {
            X0.a aVar = (X0.a) a2;
            IronLog.INTERNAL.warning(C4814p0.a(this.d, "getReward() returned a default reward. Reason: " + aVar.b(), (String) null, 2, (Object) null));
            LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            f2.a(levelPlayReward, str, aVar.b());
            return levelPlayReward;
        }
        LevelPlayReward a3 = C.a(str, this.b);
        Uc.a(f2, a3, str, null, 4, null);
        return a3;
    }
}
