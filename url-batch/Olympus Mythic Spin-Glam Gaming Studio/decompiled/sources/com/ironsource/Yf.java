package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Yf {

    @NotNull
    private final Tf a;

    public static final class c implements Ba {
        c() {
        }

        @Override // com.ironsource.Ba
        public void b(@Nullable IronSourceError ironSourceError) {
            Yf.this.a(Zf.b, LevelPlay.AdFormat.BANNER, C4597cg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Ba
        public void d(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.f, LevelPlay.AdFormat.BANNER, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void e(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.j, LevelPlay.AdFormat.BANNER, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void f(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.m, LevelPlay.AdFormat.BANNER, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void g(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.k, LevelPlay.AdFormat.BANNER, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void h(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.l, LevelPlay.AdFormat.BANNER, C4597cg.a.a(adInfo));
        }
    }

    public Yf(@NotNull Tf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.a = javaScriptEvaluator;
    }

    private final void b() {
        Xf xf = Xf.a;
        xf.a((InterfaceC4646fb) null);
        xf.a((InterfaceC4860rb) null);
        xf.a((Ba) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.b().c(false);
        Xf.a.e();
    }

    public final void d() {
        Xf xf = Xf.a;
        xf.a(new a());
        xf.a(new b());
        xf.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    public static final class a implements InterfaceC4646fb {
        a() {
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void a(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.a, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void b(@Nullable IronSourceError ironSourceError) {
            Yf.this.a(Zf.b, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void c(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.c, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void d(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.f, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void e(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.d, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Yf.this.a(Zf.e, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4646fb
        public void b(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.g, LevelPlay.AdFormat.INTERSTITIAL, C4597cg.a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC4896tb, InterfaceC4878sb {
        b() {
        }

        @Override // com.ironsource.InterfaceC4896tb
        public void a(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.a, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4896tb
        public void b(@Nullable IronSourceError ironSourceError) {
            Yf.this.a(Zf.b, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4860rb
        public void c(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.c, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4878sb
        public void d(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.h, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4878sb
        public void a() {
            Yf.this.a(Zf.n, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4860rb
        public void b(@Nullable C4684hd c4684hd, @Nullable AdInfo adInfo) {
            Yf.this.a(Zf.i, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(Xf.a.a(c4684hd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4860rb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Yf.this.a(Zf.e, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4860rb
        public void a(@Nullable C4684hd c4684hd, @Nullable AdInfo adInfo) {
            Yf.this.a(Zf.f, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(Xf.a.a(c4684hd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4860rb
        public void b(@Nullable AdInfo adInfo) {
            Yf.this.a(Zf.g, LevelPlay.AdFormat.REWARDED, C4597cg.a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.a.a(str, adFormat, list);
    }
}
