package com.ironsource;

import android.app.Activity;
import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Xd implements InterfaceC4605d6 {

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
    private final Map<String, Xd> i;

    @NotNull
    private RewardedAdInfo j;

    @Nullable
    private Yd k;

    public Xd(@NotNull K9 adInstance, @NotNull InterfaceC4581c0 adNetworkShow, @NotNull Z1 auctionDataReporter, @NotNull InterfaceC4868s1 analytics, @NotNull InterfaceC4772mc networkDestroyAPI, @NotNull InterfaceC4704ig threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor, @NotNull Map<String, Xd> retainer) {
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
        this.j = new RewardedAdInfo(f, e);
        C4569b6 c4569b6 = new C4569b6();
        this.a.a(c4569b6);
        c4569b6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Xd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Yd yd = this$0.k;
        if (yd != null) {
            yd.onRewardedAdShown();
        }
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.j = rewardedAdInfo;
    }

    @NotNull
    public final RewardedAdInfo b() {
        return this.j;
    }

    @Nullable
    public final Yd c() {
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
        this.f.a(new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Xd.b(Xd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4743l1.a.a.a(new InterfaceC4815p1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Xd.c(Xd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
        C4797o1.u uVar = new C4797o1.u("Virtual Item");
        C4797o1.t tVar = new C4797o1.t(1);
        C4797o1.q qVar = new C4797o1.q("DefaultRewardedVideo");
        String a = IronSourceUtils.a(System.currentTimeMillis(), this.a.g());
        Intrinsics.checkNotNullExpressionValue(a, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC4743l1.a.a.c(uVar, tVar, qVar, new C4797o1.y(a)).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Xd.d(Xd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4605d6
    public void onAdInstanceDidShow() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4743l1.a.a.b(new C4797o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Xd.e(Xd.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Xd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Yd yd = this$0.k;
        if (yd != null) {
            yd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Xd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Yd yd = this$0.k;
        if (yd != null) {
            yd.onRewardedAdDismissed();
        }
    }

    public final void a(@Nullable Yd yd) {
        this.k = yd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Xd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Yd yd = this$0.k;
        if (yd != null) {
            yd.onUserEarnedReward();
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
        this.f.a(new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Xd.a(Xd.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Yd yd = this$0.k;
        if (yd != null) {
            yd.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC4704ig.a(this.f, new Runnable() { // from class: com.ironsource.Xd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Xd.a(Xd.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Xd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4743l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ Xd(K9 k9, InterfaceC4581c0 interfaceC4581c0, Z1 z1, InterfaceC4868s1 interfaceC4868s1, InterfaceC4772mc interfaceC4772mc, InterfaceC4704ig interfaceC4704ig, M8 m8, M8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k9, interfaceC4581c0, z1, interfaceC4868s1, (i & 16) != 0 ? new C4790nc() : interfaceC4772mc, (i & 32) != 0 ? R7.a : interfaceC4704ig, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, map);
    }
}
