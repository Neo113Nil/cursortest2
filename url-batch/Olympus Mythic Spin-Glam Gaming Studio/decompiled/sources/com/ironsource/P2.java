package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class P2 implements G2 {

    @NotNull
    private final K9 a;

    @NotNull
    private final C4661g8 b;

    @NotNull
    private final Y1 c;

    @NotNull
    private final InterfaceC4868s1 d;

    @NotNull
    private final InterfaceC4772mc e;

    @NotNull
    private final InterfaceC4704ig f;

    @NotNull
    private final M8 g;

    @NotNull
    private final M8.a h;
    private final boolean i;

    @NotNull
    private BannerAdInfo j;

    @NotNull
    private WeakReference<Q2> k;

    @Nullable
    private View.OnAttachStateChangeListener l;

    @NotNull
    private WeakReference<FrameLayout> m;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C4625e8 size = P2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (P2.this.i) {
                ViewParent parent = P2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(P2.this.d());
                }
            }
            ((FrameLayout) v).addView(P2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public P2(@NotNull K9 adInstance, @NotNull C4661g8 container, @NotNull Y1 auctionDataReporter, @NotNull InterfaceC4868s1 analytics, @NotNull InterfaceC4772mc networkDestroyAPI, @NotNull InterfaceC4704ig threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor, @NotNull A7 epService) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.a = adInstance;
        this.b = container;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = epService.m();
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new BannerAdInfo(f, e);
        this.k = new WeakReference<>(null);
        this.m = new WeakReference<>(null);
        Kc kc = new Kc();
        adInstance.a(kc);
        kc.a(this);
    }

    public final void b(@NotNull WeakReference<FrameLayout> value) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(value, "value");
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.m = value;
        a a2 = a();
        this.l = a2;
        FrameLayout frameLayout2 = value.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(a2);
        }
    }

    @NotNull
    public final BannerAdInfo c() {
        return this.j;
    }

    @NotNull
    public final C4661g8 d() {
        return this.b;
    }

    @NotNull
    public final WeakReference<Q2> e() {
        return this.k;
    }

    @NotNull
    public final WeakReference<FrameLayout> f() {
        return this.m;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.G2
    public void onBannerClick() {
        InterfaceC4743l1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                P2.c(P2.this);
            }
        });
    }

    @Override // com.ironsource.G2
    public void onBannerShowSuccess() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4743l1.a.a.f(new C4797o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                P2.d(P2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdShown();
        }
    }

    public final void a(@NotNull BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.j = bannerAdInfo;
    }

    public final void a(@NotNull WeakReference<Q2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.k = weakReference;
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        InterfaceC4704ig.a(this.f, new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                P2.b(P2.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4743l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ P2(K9 k9, C4661g8 c4661g8, Y1 y1, InterfaceC4868s1 interfaceC4868s1, InterfaceC4772mc interfaceC4772mc, InterfaceC4704ig interfaceC4704ig, M8 m8, M8.a aVar, A7 a7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k9, c4661g8, y1, interfaceC4868s1, (i & 16) != 0 ? new C4790nc() : interfaceC4772mc, (i & 32) != 0 ? R7.a : interfaceC4704ig, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, (i & 256) != 0 ? Kb.u.d().h() : a7);
    }
}
