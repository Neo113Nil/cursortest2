package com.ironsource;

import android.app.Activity;
import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4952w9 implements InterfaceC4605d6 {

    @NotNull
    private K9 a;

    @NotNull
    private InterfaceC4581c0 b;

    @NotNull
    private Z1 c;

    @NotNull
    private InterfaceC4868s1 d;

    @NotNull
    private InterfaceC4772mc e;

    @NotNull
    private InterfaceC4704ig f;

    @NotNull
    private M8 g;

    @NotNull
    private M8.a h;

    @NotNull
    private final Map<String, C4952w9> i;

    @NotNull
    private InterstitialAdInfo j;

    @Nullable
    private InterfaceC4970x9 k;

    public C4952w9(@NotNull K9 adInstance, @NotNull InterfaceC4581c0 adNetworkShow, @NotNull Z1 auctionDataReporter, @NotNull InterfaceC4868s1 analytics, @NotNull InterfaceC4772mc networkDestroyAPI, @NotNull InterfaceC4704ig threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor, @NotNull Map<String, C4952w9> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = this.a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new InterstitialAdInfo(f, e);
        C4569b6 c4569b6 = new C4569b6();
        this.a.a(c4569b6);
        c4569b6.a(this);
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.j = interstitialAdInfo;
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.j;
    }

    @Nullable
    public final InterfaceC4970x9 c() {
        return this.k;
    }

    public final boolean d() {
        boolean a = this.b.a(this.a);
        InterfaceC4743l1.a.a.a(a).a(this.d);
        return a;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4743l1.a.a.f(new InterfaceC4815p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidClick() {
        InterfaceC4743l1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.w9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4952w9.b(C4952w9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4743l1.a.a.a(new InterfaceC4815p1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.w9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4952w9.c(C4952w9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4743l1.a.a.b(new C4797o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.w9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4952w9.d(C4952w9.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4952w9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4970x9 interfaceC4970x9 = this$0.k;
        if (interfaceC4970x9 != null) {
            interfaceC4970x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4952w9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4970x9 interfaceC4970x9 = this$0.k;
        if (interfaceC4970x9 != null) {
            interfaceC4970x9.onAdInstanceDidDismiss();
        }
    }

    public final void a(@Nullable InterfaceC4970x9 interfaceC4970x9) {
        this.k = interfaceC4970x9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4952w9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4970x9 interfaceC4970x9 = this$0.k;
        if (interfaceC4970x9 != null) {
            interfaceC4970x9.onAdInstanceDidShow();
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C4908u5.a.t());
        } else {
            InterfaceC4743l1.a.a.d(new InterfaceC4815p1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void a(@Nullable String str) {
        a(C4908u5.a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4743l1.a.a.a(new C4797o1.j(ironSourceError.getErrorCode()), new C4797o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.w9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4952w9.a(C4952w9.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4952w9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC4970x9 interfaceC4970x9 = this$0.k;
        if (interfaceC4970x9 != null) {
            interfaceC4970x9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC4704ig.a(this.f, new Runnable() { // from class: com.ironsource.w9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4952w9.a(C4952w9.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4952w9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4743l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ C4952w9(K9 k9, InterfaceC4581c0 interfaceC4581c0, Z1 z1, InterfaceC4868s1 interfaceC4868s1, InterfaceC4772mc interfaceC4772mc, InterfaceC4704ig interfaceC4704ig, M8 m8, M8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k9, interfaceC4581c0, z1, interfaceC4868s1, (i & 16) != 0 ? new C4790nc() : interfaceC4772mc, (i & 32) != 0 ? R7.a : interfaceC4704ig, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, map);
    }
}
