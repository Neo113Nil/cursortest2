package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public final class wn1 {
    public final v3 a;
    public final yu2 b;
    public final t8 c;
    public final i5 d;
    public final eo1 e;
    public final so1 f;
    public final xn1 g;
    public final gc2 h;
    public final no1 i;
    public final v9 j;
    public final wa k;
    public final lx l;
    public final vw2 m;
    public final Context n;
    public tn1 o;
    public final CoroutineScope p;

    public wn1(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, i5 i5Var, eo1 eo1Var, so1 so1Var, xn1 xn1Var, gc2 gc2Var) {
        vw2 vw2Var;
        no1 no1Var = new no1();
        v9 v9Var = new v9();
        wa waVar = new wa();
        lx lxVar = new lx();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        this.a = v3Var;
        this.b = yu2Var;
        this.c = t8Var;
        this.d = i5Var;
        this.e = eo1Var;
        this.f = so1Var;
        this.g = xn1Var;
        this.h = gc2Var;
        this.i = no1Var;
        this.j = v9Var;
        this.k = waVar;
        this.l = lxVar;
        this.m = vw2Var2;
        this.n = pz.a(context);
        Context context2 = ((nt3) yu2Var).a;
        this.p = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new b20(pr.a(context2, context2))));
    }

    public final void a(Context context) {
        a();
        tn1 tn1Var = this.o;
        if (tn1Var != null) {
            try {
                this.e.a(tn1Var.a);
            } catch (Throwable th) {
                er1 er1Var = tn1Var.b;
                String networkName = tn1Var.c.b().getNetworkName();
                boolean z = ob1.a;
                Map mapOf = MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th.toString()))));
                so1 so1Var = this.f;
                so1Var.getClass();
                so1Var.a(context, fo2.e, er1Var, networkName, mapOf);
            }
        }
    }

    public final void b(Map map) {
        tn1 tn1Var = this.o;
        if (tn1Var != null) {
            er1 er1Var = tn1Var.b;
            String networkName = tn1Var.c.b().getNetworkName();
            List<String> list = er1Var.d;
            if (list != null) {
                for (String str : list) {
                    v9 v9Var = this.j;
                    Context context = this.n;
                    v3 v3Var = this.a;
                    yu2 yu2Var = this.b;
                    v9Var.getClass();
                    u9.a(new u9(context, v3Var, yu2Var), str, a93.g, null, 12);
                }
            }
            so1 so1Var = this.f;
            Context context2 = this.n;
            so1Var.getClass();
            Iterator it = so1.h.iterator();
            while (it.hasNext()) {
                so1Var.a(context2, (fo2) it.next(), er1Var, networkName, map);
            }
        }
    }

    public final void c(Map map) {
        er1 er1Var;
        a();
        io2 a = this.l.a(this.a, this.c);
        tn1 tn1Var = this.o;
        List list = (tn1Var == null || (er1Var = tn1Var.b) == null) ? null : er1Var.f;
        v9 v9Var = this.j;
        Context context = this.n;
        v3 v3Var = this.a;
        yu2 yu2Var = this.b;
        v9Var.getClass();
        u9 u9Var = new u9(context, v3Var, yu2Var);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u9.a(u9Var, (String) it.next(), a93.h, a, 4);
            }
        }
        Map mutableMap = MapsKt.toMutableMap(map);
        mutableMap.put("status", "success");
        a(this.n, mutableMap);
    }

    public final boolean d() {
        yn1 yn1Var;
        Object m8023constructorimpl;
        tn1 tn1Var = this.o;
        if (tn1Var == null || (yn1Var = tn1Var.c) == null) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(yn1Var.a.getShouldTrackImpressionAutomatically()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) m8023constructorimpl).booleanValue();
    }

    public final void c() {
        MediatedAdapterInfo b;
        tn1 tn1Var = this.o;
        String str = null;
        er1 er1Var = tn1Var != null ? tn1Var.b : null;
        if (er1Var != null) {
            so1 so1Var = this.f;
            Context context = this.n;
            if (tn1Var != null && (b = tn1Var.c.b()) != null) {
                str = b.getNetworkName();
            }
            so1Var.getClass();
            Map emptyMap = MapsKt.emptyMap();
            Iterator it = so1.g.iterator();
            while (it.hasNext()) {
                so1Var.a(context, (fo2) it.next(), er1Var, str, emptyMap);
            }
        }
    }

    public final void a(Context context, Object obj) {
        Map map;
        long longValue;
        Long l;
        a();
        tn1 a = this.g.a(context);
        this.o = a;
        if (a != null) {
            v3 v3Var = this.a;
            v3Var.k = a.b;
            v3Var.l = a.c.b().getNetworkName();
            Long l2 = null;
            this.d.a(h5.c, null);
            er1 er1Var = a.b;
            String networkName = a.c.b().getNetworkName();
            so1 so1Var = this.f;
            so1Var.getClass();
            so1Var.a(context, fo2.f, er1Var, networkName, MapsKt.emptyMap());
            bu2 a2 = this.m.a(this.n);
            pq1 pq1Var = a2 != null ? a2.R0 : null;
            e00 e00Var = this.a.a;
            if (networkName != null && networkName.length() != 0 && pq1Var != null) {
                int ordinal = e00Var.ordinal();
                if (ordinal == 0) {
                    map = pq1Var.b;
                } else if (ordinal == 1) {
                    map = pq1Var.c;
                } else if (ordinal == 2) {
                    map = pq1Var.d;
                } else if (ordinal != 3) {
                    map = ordinal != 5 ? null : pq1Var.f;
                } else {
                    map = pq1Var.e;
                }
                if (map == null || (l = (Long) map.get(networkName)) == null) {
                    Long l3 = pq1Var.a;
                    longValue = l3 != null ? l3.longValue() : Long.MAX_VALUE;
                } else {
                    longValue = l.longValue();
                }
                Long valueOf = Long.valueOf(longValue);
                if (longValue != Long.MAX_VALUE) {
                    l2 = valueOf;
                }
            }
            if (l2 != null) {
                z10.a(this.p, new un1(this, obj), new vn1(l2.longValue(), this, obj, null));
            }
            try {
                eo1 eo1Var = this.e;
                com.monetization.ads.mediation.base.a aVar = a.a;
                Map a3 = a.d.a(context);
                ap1 ap1Var = a.d;
                er1 er1Var2 = a.b;
                ap1Var.getClass();
                eo1Var.a(context, aVar, obj, a3, er1Var2.c);
                return;
            } catch (Throwable th) {
                a();
                boolean z = ob1.a;
                Map mapOf = MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th.toString()))));
                so1 so1Var2 = this.f;
                so1Var2.getClass();
                so1Var2.a(context, fo2.e, er1Var, networkName, mapOf);
                b();
                a(context, obj);
                return;
            }
        }
        gc2 gc2Var = this.h;
        qm2 qm2Var = gc2Var.b;
        KProperty kProperty = gc2.c[0];
        wm wmVar = (wm) qm2Var.a.get();
        if (wmVar == null || wmVar.r == l5.b) {
            return;
        }
        hc2 hc2Var = gc2Var.a;
        wmVar.a(l5.d);
        wmVar.a((db3) hc2Var);
    }

    public final void a(Map map) {
        io2 a = this.l.a(this.a, this.c);
        tn1 tn1Var = this.o;
        if (tn1Var != null) {
            er1 er1Var = tn1Var.b;
            String networkName = tn1Var.c.b().getNetworkName();
            List<String> list = er1Var.e;
            if (list != null) {
                for (String str : list) {
                    v9 v9Var = this.j;
                    Context context = this.n;
                    v3 v3Var = this.a;
                    yu2 yu2Var = this.b;
                    v9Var.getClass();
                    u9.a(new u9(context, v3Var, yu2Var), str, a93.c, a, 4);
                }
            }
            Context context2 = this.n;
            Map mutableMap = MapsKt.toMutableMap(map);
            mutableMap.put("click_type", eo2.d);
            so1 so1Var = this.f;
            so1Var.getClass();
            so1Var.a(context2, fo2.r, er1Var, networkName, mutableMap);
        }
    }

    public final void a(Context context, Map map) {
        tn1 tn1Var = this.o;
        if (tn1Var != null) {
            yn1 yn1Var = tn1Var.c;
            this.i.getClass();
            map.putAll(no1.a(yn1Var));
            er1 er1Var = tn1Var.b;
            String networkName = tn1Var.c.b().getNetworkName();
            so1 so1Var = this.f;
            so1Var.getClass();
            so1Var.a(context, fo2.g, er1Var, networkName, map);
        }
    }

    public final void a() {
        JobKt__JobKt.cancelChildren$default(this.p.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public final void b() {
        er1 er1Var;
        tn1 tn1Var = this.o;
        String str = (tn1Var == null || (er1Var = tn1Var.b) == null) ? null : er1Var.b;
        wa waVar = this.k;
        go2 go2Var = go2.d;
        waVar.getClass();
        this.d.a(h5.c, new va(go2Var, str), null);
    }
}
