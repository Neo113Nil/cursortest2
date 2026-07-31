package com.ogury.ad.internal;

import android.content.Context;
import android.util.Base64;
import com.ogury.ad.common.OguryMediation;
import com.ogury.core.internal.network.NetworkClient;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o {
    public final z8 a;
    public final l7 b;
    public final o7 c;
    public final h d;
    public final u5 e;
    public final u f;

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        z8 z8Var = z8.c;
        Intrinsics.checkNotNull(z8Var);
        l7 a = l7.b.a(context);
        o7 o7Var = o7.a;
        h hVar = h.a;
        r5 r5Var = u5.e;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        u5 a2 = r5Var.a(applicationContext2);
        u uVar = new u(context);
        this.a = z8Var;
        this.b = a;
        this.c = o7Var;
        this.d = hVar;
        this.e = a2;
        this.f = uVar;
    }

    public static final void a(o oVar, c cVar, String str, OguryMediation oguryMediation, Throwable th, boolean z, boolean z2, int i) {
        oVar.getClass();
        oVar.e.a(z ? nb.n : nb.o, cVar.a, str, oguryMediation, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z)), TuplesKt.to("reload", Boolean.valueOf(z2)), TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)), new JSONObject().put("stacktrace", th.getMessage()), new v2(cVar.f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (((java.lang.String) r14).length() == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q a(o oVar, x xVar, c cVar, da daVar, String str, OguryMediation oguryMediation, boolean z, boolean z2, String str2) {
        String str3;
        Object obj;
        Object runBlocking$default;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Integer num;
        Object runBlocking$default2;
        b bVar;
        Object obj6;
        Object obj7;
        a5 a5Var;
        b5 b5Var;
        oVar.e.a(ob.n, cVar.a, str, oguryMediation, pb.a(TuplesKt.to("from_ad_markup", Boolean.valueOf(z2)), TuplesKt.to("reload", Boolean.valueOf(z))), new v2(cVar.f));
        if (z2) {
            byte[] decode = Base64.decode(str2, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            str3 = new String(decode, Charsets.UTF_8);
        } else {
            str3 = str2;
        }
        h hVar = oVar.d;
        String str4 = cVar.a;
        hh hhVar = cVar.f;
        hVar.getClass();
        q a = h.a(str3, xVar, str4, daVar, str, z2, z, oguryMediation, hhVar);
        o7 o7Var = oVar.c;
        u5 monitoringEventLogger = oVar.e;
        ArrayList ads = a.a;
        l7 mraidDao = oVar.b;
        z8 oguryApi = oVar.a;
        o7Var.getClass();
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(mraidDao, "mraidDao");
        Intrinsics.checkNotNullParameter(oguryApi, "oguryApi");
        int size = ads.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = ads.get(i);
            i++;
            if (((b) obj).l.length() > 0) {
                break;
            }
        }
        b bVar2 = (b) obj;
        if (bVar2 != null) {
            String str5 = bVar2.l;
            mraidDao.getClass();
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new c7(mraidDao, null), 1, null);
            if (Intrinsics.areEqual(str5, (String) runBlocking$default)) {
                runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new g7(mraidDao, null), 1, null);
            }
            ob obVar = ob.p;
            b5 b5Var2 = bVar2.A.a;
            Intrinsics.checkNotNullParameter(b5Var2, "<this>");
            int ordinal = b5Var2.ordinal();
            if (ordinal == 0) {
                obj2 = POBConstants.KEY_FORMAT;
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = "sdk";
            }
            Pair pair = TuplesKt.to("loaded_source", obj2);
            Pair pair2 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar2.H));
            Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(bVar2.J));
            obj3 = POBConstants.KEY_FORMAT;
            obj4 = "sdk";
            Pair pair4 = TuplesKt.to("url", bVar2.l);
            int i2 = bVar2.K;
            if (i2 > 0) {
                num = Integer.valueOf(i2);
                obj5 = "loaded_source";
            } else {
                obj5 = "loaded_source";
                num = null;
            }
            monitoringEventLogger.a(obVar, bVar2, pb.a(pair, pair2, pair3, pair4, TuplesKt.to("webview_termination", num)));
            o7.a(bVar2.l, true, mraidDao, oguryApi);
            u5 u5Var = oVar.e;
            ob obVar2 = ob.o;
            b bVar3 = (b) CollectionsKt.first((List) a.a);
            Pair pair5 = TuplesKt.to("from_ad_markup", Boolean.valueOf(z2));
            Pair pair6 = TuplesKt.to("reload", Boolean.valueOf(z));
            bVar = (b) CollectionsKt.firstOrNull((List) a.a);
            if (bVar != null || (a5Var = bVar.A) == null || (b5Var = a5Var.a) == null) {
                obj6 = obj5;
                obj7 = null;
            } else {
                Intrinsics.checkNotNullParameter(b5Var, "<this>");
                int ordinal2 = b5Var.ordinal();
                if (ordinal2 == 0) {
                    obj7 = obj3;
                } else {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj7 = obj4;
                }
                obj6 = obj5;
            }
            u5Var.a(obVar2, bVar3, pb.a(pair5, pair6, TuplesKt.to(obj6, obj7)));
            return a;
        }
        obj3 = POBConstants.KEY_FORMAT;
        obj4 = "sdk";
        obj5 = "loaded_source";
        u5 u5Var2 = oVar.e;
        ob obVar22 = ob.o;
        b bVar32 = (b) CollectionsKt.first((List) a.a);
        Pair pair52 = TuplesKt.to("from_ad_markup", Boolean.valueOf(z2));
        Pair pair62 = TuplesKt.to("reload", Boolean.valueOf(z));
        bVar = (b) CollectionsKt.firstOrNull((List) a.a);
        if (bVar != null) {
        }
        obj6 = obj5;
        obj7 = null;
        u5Var2.a(obVar22, bVar32, pb.a(pair52, pair62, TuplesKt.to(obj6, obj7)));
        return a;
    }
}
