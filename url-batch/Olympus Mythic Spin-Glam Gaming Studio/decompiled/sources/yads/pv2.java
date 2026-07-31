package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ironsource.Bd;
import com.ironsource.O6;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pv2 {
    public static final Object w = new Object();
    public static volatile boolean x;
    public final Context a;
    public final yu2 b;
    public final CoroutineScope c;
    public final i5 d;
    public final pm0 e;
    public final ic f;
    public final vw2 g;
    public final Context h;
    public final e21 i;
    public final wc j;
    public final ku2 k;
    public final xg l;
    public final a4 m;
    public final fx2 n;
    public final rv2 o;
    public final vd p;
    public final pj0 q;
    public final md r;
    public final com.monetization.ads.mediation.base.initialize.a s;
    public final ew0 t;
    public final ve1 u;
    public final d21 v;

    public pv2(Context context, yu2 yu2Var, CoroutineScope coroutineScope, i5 i5Var, pm0 pm0Var, ic icVar, int i) {
        pm0 pm0Var2;
        pm0 pm0Var3;
        if ((i & 16) != 0) {
            pm0 pm0Var4 = pm0.c;
            if (pm0Var4 == null) {
                synchronized (pm0.d) {
                    pm0Var3 = pm0.c;
                    if (pm0Var3 == null) {
                        pm0Var3 = new pm0(context.getApplicationContext());
                        pm0.c = pm0Var3;
                    }
                }
                pm0Var2 = pm0Var3;
            } else {
                pm0Var2 = pm0Var4;
            }
        } else {
            pm0Var2 = pm0Var;
        }
        ic icVar2 = (i & 32) != 0 ? new ic() : icVar;
        vw2 a = uw2.a();
        Context applicationContext = context.getApplicationContext();
        e21 e21Var = new e21(pm0Var2);
        wc wcVar = new wc();
        nt3 nt3Var = (nt3) yu2Var;
        Context context2 = nt3Var.a;
        ku2 ku2Var = new ku2(applicationContext, i5Var, icVar2, pm0Var2, pr.a(context2, context2));
        xg xgVar = new xg(applicationContext, yu2Var);
        a4 a4Var = new a4();
        fx2 fx2Var = new fx2(applicationContext);
        Context context3 = nt3Var.a;
        mt1 a2 = pr.a(context3, context3);
        Boolean bool = (Boolean) rh1.a(context, sh1.j.b);
        rv2 rv2Var = new rv2(a2, bool != null ? bool.booleanValue() : false, i5Var);
        vd vdVar = new vd();
        pj0 pj0Var = new pj0(context, i5Var);
        md mdVar = new md(context);
        com.monetization.ads.mediation.base.initialize.a aVar = new com.monetization.ads.mediation.base.initialize.a(yu2Var);
        Context context4 = nt3Var.a;
        ew0 ew0Var = new ew0(applicationContext, pr.a(context4, context4));
        Context context5 = nt3Var.a;
        ve1 ve1Var = new ve1(applicationContext, pr.a(context5, context5), 110);
        this.a = context;
        this.b = yu2Var;
        this.c = coroutineScope;
        this.d = i5Var;
        this.e = pm0Var2;
        this.f = icVar2;
        this.g = a;
        this.h = applicationContext;
        this.i = e21Var;
        this.j = wcVar;
        this.k = ku2Var;
        this.l = xgVar;
        this.m = a4Var;
        this.n = fx2Var;
        this.o = rv2Var;
        this.p = vdVar;
        this.q = pj0Var;
        this.r = mdVar;
        this.s = aVar;
        this.t = ew0Var;
        this.u = ve1Var;
        this.v = new d21(pm0Var2.a, new r4());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r5 = yads.ob1.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(pv2 pv2Var, bu2 bu2Var, ContinuationImpl continuationImpl) {
        nv2 nv2Var;
        int i;
        pv2Var.getClass();
        if (continuationImpl instanceof nv2) {
            nv2Var = (nv2) continuationImpl;
            int i2 = nv2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nv2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = nv2Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nv2Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    b23 b23Var = new b23(bu2Var, new ov2(new ue0(pv2Var.h, pv2Var.b, pv2Var.c)));
                    nv2Var.d = 1;
                    if (b23Var.a(nv2Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        nv2Var = new nv2(pv2Var, continuationImpl);
        Object obj2 = nv2Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nv2Var.d;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(k51 k51Var, ContinuationImpl continuationImpl) {
        lv2 lv2Var;
        int i;
        i5 i5Var;
        h5 h5Var;
        if (continuationImpl instanceof lv2) {
            lv2Var = (lv2) continuationImpl;
            int i2 = lv2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lv2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = lv2Var.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lv2Var.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i5 i5Var2 = this.d;
                    h5 h5Var2 = h5.k;
                    i5Var2.a(h5Var2, null);
                    ku2 ku2Var = this.k;
                    lv2Var.b = i5Var2;
                    lv2Var.c = h5Var2;
                    lv2Var.f = 1;
                    ku2Var.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ju2(ku2Var, k51Var, null), lv2Var);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i5Var = i5Var2;
                    obj = withContext;
                    h5Var = h5Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5Var = lv2Var.c;
                    i5Var = lv2Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                wu2 wu2Var = (wu2) obj;
                i5Var.a(h5Var);
                return wu2Var;
            }
        }
        lv2Var = new lv2(this, continuationImpl);
        Object obj2 = lv2Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lv2Var.f;
        if (i != 0) {
        }
        wu2 wu2Var2 = (wu2) obj2;
        i5Var.a(h5Var);
        return wu2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0476 A[Catch: all -> 0x041e, TRY_LEAVE, TryCatch #3 {all -> 0x041e, blocks: (B:54:0x041a, B:64:0x0421, B:67:0x0436, B:69:0x0442, B:87:0x0447, B:73:0x0460, B:75:0x0476), top: B:53:0x041a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0493 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x048d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k51 k51Var, ContinuationImpl continuationImpl) {
        hv2 hv2Var;
        Object coroutine_suspended;
        int i;
        k51 k51Var2;
        i5 i5Var;
        bu2 a;
        Job launch$default;
        h5 h5Var;
        k51 k51Var3;
        Job job;
        tv0 tv0Var;
        bw0 bw0Var;
        h5 h5Var2;
        i5 i5Var2;
        k51 k51Var4;
        wu2 wu2Var;
        d4 d4Var;
        Object bv2Var;
        String str;
        wu2 wu2Var2;
        xg xgVar;
        bu2 a2;
        Iterator<T> it;
        Iterator it2;
        iq0 iq0Var;
        hq0 hq0Var;
        int length;
        int i2;
        f1 f1Var;
        ap apVar;
        boolean z;
        if (continuationImpl instanceof hv2) {
            hv2Var = (hv2) continuationImpl;
            int i3 = hv2Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hv2Var.h = i3 - Integer.MIN_VALUE;
                Object obj = hv2Var.f;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hv2Var.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    wd wdVar = this.p.a;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    iv2 iv2Var = new iv2(this, null);
                    hv2Var.b = k51Var;
                    hv2Var.h = 1;
                    if (BuildersKt.withContext(io2, iv2Var, hv2Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    k51Var2 = k51Var;
                } else if (i == 1) {
                    k51Var2 = (k51) hv2Var.b;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    job = hv2Var.e;
                    h5Var = hv2Var.d;
                    i5Var = hv2Var.c;
                    k51Var3 = (k51) hv2Var.b;
                    ResultKt.throwOnFailure(obj);
                    hv2Var.b = k51Var3;
                    hv2Var.c = i5Var;
                    hv2Var.d = h5Var;
                    hv2Var.e = null;
                    hv2Var.h = 3;
                    if (job.join(hv2Var) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    h5Var2 = h5Var;
                    i5Var2 = i5Var;
                    k51Var4 = k51Var3;
                    hv2Var.b = k51Var4;
                    hv2Var.c = i5Var2;
                    hv2Var.d = h5Var2;
                    hv2Var.h = 4;
                    obj = b(k51Var4, hv2Var);
                    if (obj == coroutine_suspended) {
                    }
                    wu2Var = (wu2) obj;
                    i5Var2.a(h5Var2);
                    if (wu2Var instanceof vu2) {
                    }
                } else if (i == 3) {
                    h5Var2 = hv2Var.d;
                    i5 i5Var3 = hv2Var.c;
                    k51 k51Var5 = (k51) hv2Var.b;
                    ResultKt.throwOnFailure(obj);
                    i5Var2 = i5Var3;
                    k51Var4 = k51Var5;
                    hv2Var.b = k51Var4;
                    hv2Var.c = i5Var2;
                    hv2Var.d = h5Var2;
                    hv2Var.h = 4;
                    obj = b(k51Var4, hv2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wu2Var = (wu2) obj;
                    i5Var2.a(h5Var2);
                    if (wu2Var instanceof vu2) {
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wu2Var2 = (wu2) hv2Var.b;
                        ResultKt.throwOnFailure(obj);
                        Context context = this.a;
                        bu2 bu2Var = ((vu2) wu2Var2).a;
                        com.monetization.ads.mediation.base.initialize.a aVar = this.s;
                        CoroutineScope coroutineScope = this.c;
                        aVar.getClass();
                        apVar = bu2Var.d0;
                        if (apVar != null) {
                            if (bu2Var.b0) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new aq1(aVar, context, apVar, null), 3, null);
                            }
                            if (bu2Var.c0) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new bq1(aVar, context, apVar, null), 3, null);
                            }
                        }
                        synchronized (w) {
                            if (x) {
                                z = false;
                            } else {
                                x = true;
                                z = true;
                            }
                        }
                        if (z) {
                            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new jv2(this, wu2Var2, null), 3, null);
                        }
                        bv2Var = new cv2(this.f, this.e.a);
                        xgVar = this.l;
                        a2 = xgVar.c.a(xgVar.a);
                        if ((a2 == null ? a2.J : false) && !xg.f.getAndSet(true)) {
                            lq0 lq0Var = xgVar.e;
                            Set<String> keySet = ((SharedPreferences) ((qg1) lq0Var.a).d.getValue()).getAll().keySet();
                            ArrayList arrayList = new ArrayList();
                            it = keySet.iterator();
                            while (it.hasNext()) {
                                String c = ((qg1) lq0Var.a).c((String) it.next());
                                if (c != null) {
                                    arrayList.add(c);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                lq0Var.b.getClass();
                                if (str2 != null) {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    d00 d00Var = e00.c;
                                    String string = jSONObject.getString("ad_type");
                                    d00Var.getClass();
                                    e00 a3 = d00.a(string);
                                    if (a3 != null) {
                                        long j = jSONObject.getLong("start_time");
                                        String optString = jSONObject.optString("false_click");
                                        if (optString != null) {
                                            JSONObject jSONObject2 = new JSONObject(optString);
                                            hq0Var = new hq0(jSONObject2.getString("url"), jSONObject2.getLong("interval"));
                                            HashMap a4 = jq0.a(jSONObject);
                                            c a5 = d.a(jSONObject.optString("ab_experiments"));
                                            f1[] values = f1.values();
                                            length = values.length;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                }
                                                i2++;
                                            }
                                            if (f1Var != null) {
                                            }
                                            iq0Var = null;
                                            if (iq0Var == null) {
                                            }
                                        } else {
                                            hq0Var = null;
                                            HashMap a42 = jq0.a(jSONObject);
                                            c a52 = d.a(jSONObject.optString("ab_experiments"));
                                            f1[] values2 = f1.values();
                                            length = values2.length;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                    f1Var = null;
                                                    break;
                                                }
                                                f1 f1Var2 = values2[i2];
                                                if (Intrinsics.areEqual(f1Var2.b, jSONObject.getString("type"))) {
                                                    f1Var = f1Var2;
                                                    break;
                                                }
                                                i2++;
                                            }
                                            if (f1Var != null) {
                                                try {
                                                    iq0Var = new iq0(a3, j, f1Var, hq0Var, a42, a52);
                                                } catch (Throwable unused) {
                                                }
                                                if (iq0Var == null) {
                                                    arrayList2.add(iq0Var);
                                                }
                                            }
                                            iq0Var = null;
                                            if (iq0Var == null) {
                                            }
                                        }
                                    }
                                }
                                iq0Var = null;
                                if (iq0Var == null) {
                                }
                            }
                            for (iq0 iq0Var2 : CollectionsKt.toList(arrayList2)) {
                                hq0 hq0Var2 = iq0Var2.d;
                                if (hq0Var2 != null) {
                                    u9 u9Var = new u9(xgVar.a, new v3(iq0Var2.a), xgVar.b);
                                    long j2 = hq0Var2.c;
                                    if (j2 <= j2) {
                                        u9.a(u9Var, hq0Var2.b, a93.d, null, 12);
                                        ((qg1) xgVar.e.a).d(String.valueOf(iq0Var2.b));
                                        long currentTimeMillis = System.currentTimeMillis() - iq0Var2.b;
                                        Map mutableMap = MapsKt.toMutableMap(iq0Var2.e);
                                        mutableMap.put("interval", lc1.a(currentTimeMillis));
                                        fo2 fo2Var = fo2.c;
                                        xgVar.d.a(new ho2("returned_to_app", MapsKt.toMutableMap(mutableMap), iq0Var2.f));
                                    }
                                }
                                ((qg1) xgVar.e.a).d(String.valueOf(iq0Var2.b));
                                long currentTimeMillis2 = System.currentTimeMillis() - iq0Var2.b;
                                Map mutableMap2 = MapsKt.toMutableMap(iq0Var2.e);
                                mutableMap2.put("interval", lc1.a(currentTimeMillis2));
                                fo2 fo2Var2 = fo2.c;
                                xgVar.d.a(new ho2("returned_to_app", MapsKt.toMutableMap(mutableMap2), iq0Var2.f));
                            }
                            ((qg1) xgVar.e.a).a();
                        }
                        return bv2Var;
                    }
                    h5Var2 = hv2Var.d;
                    i5Var2 = hv2Var.c;
                    k51Var4 = (k51) hv2Var.b;
                    ResultKt.throwOnFailure(obj);
                    wu2Var = (wu2) obj;
                    i5Var2.a(h5Var2);
                    if (wu2Var instanceof vu2) {
                        rv2 rv2Var = this.o;
                        vu2 vu2Var = (vu2) wu2Var;
                        bu2 bu2Var2 = vu2Var.a;
                        uy uyVar = vu2Var.b;
                        mt1 mt1Var = rv2Var.a;
                        fo2 fo2Var3 = fo2.c;
                        rv2Var.c.getClass();
                        Pair pair = TuplesKt.to("creation_date", Long.valueOf(System.currentTimeMillis()));
                        Pair pair2 = TuplesKt.to("startup_version", bu2Var2.e0);
                        Pair pair3 = TuplesKt.to("user_consent", bu2Var2.N);
                        Pair pair4 = TuplesKt.to("ad_host", bu2Var2.X);
                        zq1 zq1Var = rv2Var.d;
                        boolean z2 = rv2Var.b;
                        zq1Var.getClass();
                        if (z2) {
                            str = "ads-mediation";
                        } else {
                            str = Bd.d;
                        }
                        String str3 = dr1.d;
                        ArrayList a6 = zq1Var.a.a(br1.a());
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = a6.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (rr1.a((qr1) next)) {
                                arrayList3.add(next);
                            }
                        }
                        Pair pair5 = TuplesKt.to("integration_type", str);
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        for (Iterator it4 = arrayList3.iterator(); it4.hasNext(); it4 = it4) {
                            arrayList4.add(MapsKt.mapOf(TuplesKt.to("name", ((qr1) it4.next()).a)));
                        }
                        mt1Var.a(new ho2("sdk_configuration_success", MapsKt.toMutableMap(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("integrated_mediation", MapsKt.mapOf(pair5, TuplesKt.to(O6.E1, arrayList4))), TuplesKt.to("call_source", k51Var4.b), TuplesKt.to("configuration_source", uyVar != null ? uyVar.b : null), TuplesKt.to("durations", rv2Var.e.a()), TuplesKt.to("kotlin_stdlib_version", KotlinVersion.CURRENT.toString()))), (c) null));
                        this.n.a();
                        mv1.a();
                        if (vu2Var.a.A) {
                            ve1 ve1Var = this.u;
                            hv2Var.b = wu2Var;
                            hv2Var.c = null;
                            hv2Var.d = null;
                            hv2Var.h = 5;
                            if (ve1Var.a(hv2Var) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        wu2Var2 = wu2Var;
                        Context context2 = this.a;
                        bu2 bu2Var3 = ((vu2) wu2Var2).a;
                        com.monetization.ads.mediation.base.initialize.a aVar2 = this.s;
                        CoroutineScope coroutineScope2 = this.c;
                        aVar2.getClass();
                        apVar = bu2Var3.d0;
                        if (apVar != null) {
                        }
                        synchronized (w) {
                        }
                    } else {
                        if (wu2Var instanceof uu2) {
                            a4 a4Var = this.m;
                            uu2 uu2Var = (uu2) wu2Var;
                            hm3 hm3Var = uu2Var.a;
                            a4Var.getClass();
                            if (hm3Var instanceof z3) {
                                d4Var = g4.a(null, ((z3) hm3Var).c);
                            } else {
                                d4Var = e8.b;
                            }
                            rv2 rv2Var2 = this.o;
                            uy uyVar2 = uu2Var.b;
                            mt1 mt1Var2 = rv2Var2.a;
                            fo2 fo2Var4 = fo2.c;
                            mt1Var2.a(new ho2("sdk_configuration_failure", MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("failure_reason", d4Var.b), TuplesKt.to("call_source", k51Var4.b), TuplesKt.to("configuration_source", uyVar2 != null ? uyVar2.b : null), TuplesKt.to("durations", rv2Var2.e.a()), TuplesKt.to("kotlin_stdlib_version", KotlinVersion.CURRENT.toString()))), (c) null));
                            bv2Var = new bv2(d4Var);
                            xgVar = this.l;
                            a2 = xgVar.c.a(xgVar.a);
                            if (a2 == null ? a2.J : false) {
                                lq0 lq0Var2 = xgVar.e;
                                Set<String> keySet2 = ((SharedPreferences) ((qg1) lq0Var2.a).d.getValue()).getAll().keySet();
                                ArrayList arrayList5 = new ArrayList();
                                it = keySet2.iterator();
                                while (it.hasNext()) {
                                }
                                ArrayList arrayList22 = new ArrayList();
                                it2 = arrayList5.iterator();
                                while (it2.hasNext()) {
                                }
                                while (r3.hasNext()) {
                                }
                                ((qg1) xgVar.e.a).a();
                            }
                            return bv2Var;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                bu2 a7 = this.g.a(this.h);
                boolean z3 = a7 == null && a7.C0;
                i5Var = this.d;
                h5 h5Var3 = h5.i;
                i5Var.a(h5Var3, null);
                this.r.a(this.h);
                Context context3 = this.h;
                Context context4 = ((nt3) this.b).a;
                ua3.a(context3, ud.a(context4, new dq3(context4)));
                Context context5 = this.h;
                Context context6 = ((nt3) this.b).a;
                pe.a(context5, ud.a(context6, new dq3(context6)));
                if (Build.VERSION.SDK_INT >= 30) {
                    AtomicBoolean atomicBoolean = kh.a;
                    Context context7 = this.a;
                    Context context8 = ((nt3) this.b).a;
                    kh.a(context7, ud.a(context8, new dq3(context8)));
                }
                a = this.g.a(this.h);
                if (a != null && (tv0Var = a.K0) != null && (bw0Var = tv0Var.a) != null) {
                    ew0 ew0Var = this.t;
                    ew0Var.getClass();
                    BuildersKt__Builders_commonKt.launch$default(ew0Var.b, null, null, new dw0(ew0Var, CollectionsKt.listOf((Object[]) new fn2[]{new fn2(qv0.b, bw0Var.b), new fn2(qv0.c, bw0Var.c), new fn2(qv0.d, bw0Var.d), new fn2(qv0.e, bw0Var.a)}), null), 3, null);
                }
                launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new kv2(z3, this, null), 3, null);
                a();
                hv2Var.b = k51Var2;
                hv2Var.c = i5Var;
                hv2Var.d = h5Var3;
                hv2Var.e = launch$default;
                hv2Var.h = 2;
                if (a(hv2Var) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                h5Var = h5Var3;
                k51Var3 = k51Var2;
                job = launch$default;
                hv2Var.b = k51Var3;
                hv2Var.c = i5Var;
                hv2Var.d = h5Var;
                hv2Var.e = null;
                hv2Var.h = 3;
                if (job.join(hv2Var) != coroutine_suspended) {
                }
            }
        }
        hv2Var = new hv2(this, continuationImpl);
        Object obj2 = hv2Var.f;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hv2Var.h;
        if (i != 0) {
        }
        bu2 a72 = this.g.a(this.h);
        if (a72 == null) {
        }
        i5Var = this.d;
        h5 h5Var32 = h5.i;
        i5Var.a(h5Var32, null);
        this.r.a(this.h);
        Context context32 = this.h;
        Context context42 = ((nt3) this.b).a;
        ua3.a(context32, ud.a(context42, new dq3(context42)));
        Context context52 = this.h;
        Context context62 = ((nt3) this.b).a;
        pe.a(context52, ud.a(context62, new dq3(context62)));
        if (Build.VERSION.SDK_INT >= 30) {
        }
        a = this.g.a(this.h);
        if (a != null) {
            ew0 ew0Var2 = this.t;
            ew0Var2.getClass();
            BuildersKt__Builders_commonKt.launch$default(ew0Var2.b, null, null, new dw0(ew0Var2, CollectionsKt.listOf((Object[]) new fn2[]{new fn2(qv0.b, bw0Var.b), new fn2(qv0.c, bw0Var.c), new fn2(qv0.d, bw0Var.d), new fn2(qv0.e, bw0Var.a)}), null), 3, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new kv2(z3, this, null), 3, null);
        a();
        hv2Var.b = k51Var2;
        hv2Var.c = i5Var;
        hv2Var.d = h5Var32;
        hv2Var.e = launch$default;
        hv2Var.h = 2;
        if (a(hv2Var) != coroutine_suspended) {
        }
    }

    public final void a() {
        String a;
        String str;
        String str2;
        i5 i5Var = this.d;
        h5 h5Var = h5.h;
        i5Var.a(h5Var, null);
        f21 f21Var = this.i.a.b;
        jf jfVar = f21Var.b.d;
        if (jfVar == null) {
            bg bgVar = f21Var.a;
            bgVar.getClass();
            try {
                str = AppMetrica.getUuid(bgVar.b.a);
            } catch (Throwable unused) {
                boolean z = ob1.a;
                str = null;
            }
            bg bgVar2 = f21Var.a;
            bgVar2.getClass();
            try {
                str2 = AppMetrica.getDeviceId(bgVar2.b.a);
            } catch (Throwable unused2) {
                boolean z2 = ob1.a;
                str2 = null;
            }
            jf jfVar2 = new jf(null, str2, str);
            mf mfVar = f21Var.b;
            BuildersKt__Builders_commonKt.launch$default(mfVar.c, null, null, new lf(mfVar, f21Var.c, null), 3, null);
            jfVar = jfVar2;
        }
        String str3 = f21Var.e;
        g21 g21Var = f21Var.d;
        d21 d21Var = this.v;
        Context context = this.h;
        d21Var.getClass();
        r4 r4Var = d21Var.b;
        int ordinal = g21Var.ordinal();
        if (ordinal == 0) {
            a = r4Var.a(context);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a = jfVar.a;
            if (a == null) {
                a = r4Var.a(context);
            }
        }
        om0 om0Var = d21Var.a;
        om0Var.e = a;
        om0Var.a = jfVar.b;
        String str4 = jfVar.c;
        synchronized (om0.h) {
            if (str4 != null) {
                try {
                    if (str4.length() != 0) {
                        om0Var.g = str4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        d21Var.a.d = str3;
        i5Var.a(h5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        mv2 mv2Var;
        int i;
        h5 h5Var;
        i5 i5Var;
        oc ocVar;
        if (continuationImpl instanceof mv2) {
            mv2Var = (mv2) continuationImpl;
            int i2 = mv2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mv2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = mv2Var.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mv2Var.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i5 i5Var2 = this.d;
                    h5 h5Var2 = h5.d;
                    i5Var2.a(h5Var2, null);
                    wc wcVar = this.j;
                    Context context = this.h;
                    mv2Var.b = i5Var2;
                    mv2Var.c = h5Var2;
                    mv2Var.f = 1;
                    wcVar.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new vc(context, null), mv2Var);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    h5Var = h5Var2;
                    i5Var = i5Var2;
                    obj = withContext;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5Var = mv2Var.c;
                    i5Var = mv2Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                ocVar = (oc) obj;
                if (ocVar != null) {
                    ic icVar = this.f;
                    mc mcVar = ocVar.a;
                    icVar.a = mcVar;
                    icVar.b = ocVar.b;
                    icVar.c = ocVar.c;
                    icVar.d = ocVar.d;
                    if (mcVar != null) {
                        this.e.a.f = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                i5Var.a(h5Var);
                return unit;
            }
        }
        mv2Var = new mv2(this, continuationImpl);
        Object obj2 = mv2Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mv2Var.f;
        if (i != 0) {
        }
        ocVar = (oc) obj2;
        if (ocVar != null) {
        }
        Unit unit2 = Unit.INSTANCE;
        i5Var.a(h5Var);
        return unit2;
    }
}
