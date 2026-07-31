package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import com.ironsource.C4701ic;
import com.ogury.ad.async.Completable;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.network.NetworkClient;
import com.ogury.core.internal.network.NetworkRequest;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements b3 {
    public final z8 a;
    public final s7 b;
    public final g5 c;
    public final u5 d;
    public final l e;
    public boolean f;
    public b g;
    public a3 h;

    public f(Application context, l adQualityManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adQualityManager, "adQualityManager");
        Intrinsics.checkNotNullParameter(context, "context");
        if (z8.c == null) {
            int millis = (int) TimeUnit.SECONDS.toMillis(le.b.b.a);
            Context context2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Context applicationContext = context2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            z8.c = new z8(new m3(applicationContext), new NetworkClient(millis, millis * 5));
        }
        z8 oguryApi = z8.c;
        Intrinsics.checkNotNull(oguryApi);
        s7 mraidEventBus = s7.a;
        g5 measurementsEventLogger = g5.a;
        r5 r5Var = u5.e;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        u5 monitoringEventLogger = r5Var.a(applicationContext2);
        Intrinsics.checkNotNullParameter(oguryApi, "oguryApi");
        Intrinsics.checkNotNullParameter(mraidEventBus, "mraidEventBus");
        Intrinsics.checkNotNullParameter(measurementsEventLogger, "measurementsEventLogger");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        Intrinsics.checkNotNullParameter(adQualityManager, "adQualityManager");
        this.a = oguryApi;
        this.b = mraidEventBus;
        this.c = measurementsEventLogger;
        this.d = monitoringEventLogger;
        this.e = adQualityManager;
    }

    public final void a(y7 webview, float f) {
        Object obj;
        Object obj2;
        Integer num;
        Object obj3;
        Object obj4;
        Integer num2;
        Object obj5;
        Object obj6;
        Integer num3;
        Intrinsics.checkNotNullParameter(webview, "webview");
        b bVar = this.g;
        if (bVar == null || this.f || f < 50.0f) {
            return;
        }
        this.f = true;
        Logger.INSTANCE.d(LogTag.MRAID, SourceTag.ADS, "new impression: " + bVar.g);
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a(null);
        }
        u5 u5Var = this.d;
        ob obVar = ob.t;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        Pair pair2 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
        Pair pair3 = TuplesKt.to("exposure", Float.valueOf(f));
        b5 b5Var = bVar.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            obj = POBConstants.KEY_FORMAT;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "sdk";
        }
        Pair pair4 = TuplesKt.to("loaded_source", obj);
        Pair pair5 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
        int i = bVar.K;
        if (i > 0) {
            num = Integer.valueOf(i);
            obj2 = "reload";
        } else {
            obj2 = "reload";
            num = null;
        }
        u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, pair4, pair5, TuplesKt.to("webview_termination", num)));
        this.e.a(bVar, webview);
        if (bVar.e.length() > 0) {
            z8 z8Var = this.a;
            String url = bVar.e;
            z8Var.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            Completable.INSTANCE.fromAction(new u8(z8Var, new NetworkRequest(url, C4701ic.a, "", z8Var.a.b))).doOnError(s8.a).subscribe(t8.a);
        } else {
            g5 g5Var = this.c;
            th thVar = new th("shown", bVar);
            g5Var.getClass();
            g5.a(thVar);
        }
        s7 s7Var = this.b;
        r7 r7Var = new r7(bVar.b, "adDisplayed");
        s7Var.getClass();
        s7.a(r7Var);
        if (bVar.z.b == o3.b) {
            u5 u5Var2 = this.d;
            ob obVar2 = ob.v;
            Pair pair6 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
            Pair pair7 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
            Pair pair8 = TuplesKt.to("is_paid", Boolean.valueOf(bVar.z.a));
            b5 b5Var2 = bVar.A.a;
            Intrinsics.checkNotNullParameter(b5Var2, "<this>");
            int ordinal2 = b5Var2.ordinal();
            if (ordinal2 == 0) {
                obj3 = POBConstants.KEY_FORMAT;
            } else {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                obj3 = "sdk";
            }
            Pair pair9 = TuplesKt.to("loaded_source", obj3);
            Object obj7 = obj2;
            Pair pair10 = TuplesKt.to(obj7, Boolean.valueOf(bVar.J));
            int i2 = bVar.K;
            if (i2 > 0) {
                num2 = Integer.valueOf(i2);
                obj4 = "webview_termination";
            } else {
                obj4 = "webview_termination";
                num2 = null;
            }
            Object obj8 = obj4;
            u5Var2.a(obVar2, bVar, pb.a(pair6, pair7, pair8, pair9, pair10, TuplesKt.to(obj4, num2)));
            if (bVar.z.a) {
                u5 u5Var3 = this.d;
                ob obVar3 = ob.w;
                Pair pair11 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                Pair pair12 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
                b5 b5Var3 = bVar.A.a;
                Intrinsics.checkNotNullParameter(b5Var3, "<this>");
                int ordinal3 = b5Var3.ordinal();
                if (ordinal3 == 0) {
                    obj5 = POBConstants.KEY_FORMAT;
                } else {
                    if (ordinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj5 = "sdk";
                }
                Pair pair13 = TuplesKt.to("loaded_source", obj5);
                Pair pair14 = TuplesKt.to(obj7, Boolean.valueOf(bVar.J));
                int i3 = bVar.K;
                if (i3 > 0) {
                    num3 = Integer.valueOf(i3);
                    obj6 = obj8;
                } else {
                    obj6 = obj8;
                    num3 = null;
                }
                u5Var3.a(obVar3, bVar, pb.a(pair11, pair12, pair13, pair14, TuplesKt.to(obj6, num3)));
                s7 s7Var2 = this.b;
                r7 r7Var2 = new r7(bVar.b, "adImpression");
                s7Var2.getClass();
                s7.a(r7Var2);
            }
        }
    }
}
