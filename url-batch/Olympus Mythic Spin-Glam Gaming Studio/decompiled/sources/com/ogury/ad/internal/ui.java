package com.ogury.ad.internal;

import android.os.Handler;
import android.os.Looper;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.viewer.AdsCallback;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ui {
    public final LinkedList a;
    public final ti b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final Handler h;
    public y4 i;
    public b j;
    public Long k;
    public l0 l;
    public String m;

    public ui() {
        z4 loadStrategyFactory = new z4();
        Intrinsics.checkNotNullParameter(loadStrategyFactory, "loadStrategyFactory");
        this.a = new LinkedList();
        this.b = new ti(this);
        this.c = new ArrayList();
        this.h = new Handler(Looper.getMainLooper());
        this.m = "";
    }

    public final void a(b bVar) {
        a5 a5Var;
        b5 b5Var;
        a5 a5Var2;
        b5 b5Var2;
        this.a.clear();
        this.h.removeCallbacksAndMessages(null);
        l0 l0Var = this.l;
        if (l0Var != null) {
            o0 o0Var = l0Var.a;
            o0Var.q = false;
            o0Var.o = true;
            if (o0Var.t == null) {
                o0Var.b("No ad listener registered");
            }
            o0 o0Var2 = l0Var.a;
            if (o0Var2.z == 0) {
                o0Var2.b("Ads successfully loaded!");
                l0Var.a.b("Triggering onAdLoaded() callback");
                String str = POBConstants.KEY_FORMAT;
                if (bVar != null) {
                    o0 o0Var3 = l0Var.a;
                    u5 u5Var = o0Var3.e;
                    ob obVar = ob.k;
                    Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var3.y != null));
                    b bVar2 = (b) CollectionsKt.firstOrNull(l0Var.a.s);
                    if (bVar2 == null || (a5Var2 = bVar2.A) == null || (b5Var2 = a5Var2.a) == null) {
                        str = null;
                    } else {
                        Intrinsics.checkNotNullParameter(b5Var2, "<this>");
                        int ordinal = b5Var2.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "sdk";
                        }
                    }
                    Pair pair2 = TuplesKt.to("loaded_source", str);
                    Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(l0Var.a.p));
                    int i = l0Var.a.z;
                    u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
                } else {
                    o0 o0Var4 = l0Var.a;
                    u5 u5Var2 = o0Var4.e;
                    ob obVar2 = ob.k;
                    String str2 = o0Var4.b.a;
                    String str3 = o0Var4.m;
                    OguryMediation oguryMediation = o0Var4.n;
                    Pair pair4 = TuplesKt.to("from_ad_markup", Boolean.valueOf(o0Var4.y != null));
                    b bVar3 = (b) CollectionsKt.firstOrNull(l0Var.a.s);
                    if (bVar3 == null || (a5Var = bVar3.A) == null || (b5Var = a5Var.a) == null) {
                        str = null;
                    } else {
                        Intrinsics.checkNotNullParameter(b5Var, "<this>");
                        int ordinal2 = b5Var.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "sdk";
                        }
                    }
                    Pair pair5 = TuplesKt.to("loaded_source", str);
                    Pair pair6 = TuplesKt.to("reload", Boolean.valueOf(l0Var.a.p));
                    int i2 = l0Var.a.z;
                    u5Var2.a(obVar2, str2, str3, oguryMediation, pb.a(pair4, pair5, pair6, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)), l0Var.a.B);
                }
                AdsCallback adsCallback = l0Var.a.t;
                if (adsCallback != null) {
                    adsCallback.onAdLoaded();
                }
            }
        }
    }

    public final void a(final long j) {
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "load timeout " + j);
        this.h.postDelayed(new Runnable() { // from class: com.ogury.ad.internal.ui$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ui.a(ui.this, j);
            }
        }, j);
    }

    public static final void a(ui this$0, long j) {
        l0 l0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "load ad failed, destroying webView");
        for (ri riVar : this$0.a) {
            if (!riVar.a() && !(riVar instanceof x4)) {
                Iterator it = this$0.a.iterator();
                while (it.hasNext()) {
                    ((ri) it.next()).destroy();
                }
                b bVar = this$0.j;
                if (bVar == null || (l0Var = this$0.l) == null) {
                    return;
                }
                lb lbVar = lb.a;
                ArrayList arrayList = this$0.c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Long valueOf = Long.valueOf(timeUnit.toSeconds(j));
                long currentTimeMillis = System.currentTimeMillis();
                Long l = this$0.k;
                Intrinsics.checkNotNull(l);
                l0Var.a(bVar, lbVar, arrayList, valueOf, Long.valueOf(timeUnit.toSeconds(currentTimeMillis - l.longValue())), this$0.m);
                return;
            }
        }
        for (ri riVar2 : this$0.a) {
            if (riVar2 instanceof x4) {
                ((x4) riVar2).destroy();
            }
        }
        this$0.a(this$0.j);
    }
}
