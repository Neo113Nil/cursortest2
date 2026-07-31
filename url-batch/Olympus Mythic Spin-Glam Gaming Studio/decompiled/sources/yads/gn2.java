package yads;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.O6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class gn2 implements Runnable {
    public final c8 b;
    public final /* synthetic */ hn2 c;

    public gn2(hn2 hn2Var, c8 c8Var) {
        this.c = hn2Var;
        this.b = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listOf;
        qh a;
        gn1 d;
        View a2;
        if (this.c.d) {
            return;
        }
        c8 c8Var = this.b;
        a22 a22Var = c8Var.a.a.f;
        boolean z = false;
        if (a22Var != null && (a2 = a22Var.c.a()) != null && hl3.a.a(a2).a >= 1) {
            i22 i22Var = c8Var.b;
            bu2 a3 = i22Var.c.a(i22Var.a);
            if ((a3 == null || !a3.C) ? true : i22Var.b.a(false) instanceof cc3) {
                z = true;
            }
        }
        if (!z) {
            hn2 hn2Var = this.c;
            hn2Var.c.postDelayed(new gn2(hn2Var, this.b), 300L);
            return;
        }
        hn2 hn2Var2 = this.c;
        hn2Var2.d = true;
        kn2 kn2Var = hn2Var2.b;
        mn2 mn2Var = kn2Var.c;
        if (mn2Var != null) {
            mn2Var.a = Long.valueOf(SystemClock.elapsedRealtime());
        }
        jn2 jn2Var = kn2Var.d;
        io2 a4 = jn2Var.f.a(jn2Var.b, jn2Var.a);
        Iterator it = jn2Var.c.iterator();
        while (it.hasNext()) {
            u9.a(jn2Var.d, (String) it.next(), a93.i, a4, 4);
        }
        in2 in2Var = jn2Var.e;
        io2 a5 = in2Var.f.a(in2Var.a, in2Var.b);
        a5.b(do2.a, O6.G1);
        v42 v42Var = in2Var.g;
        if (v42Var != null) {
            Map map = v42Var.a.a().a;
            ni niVar = v42Var.b;
            niVar.getClass();
            HashMap hashMap = new HashMap();
            for (ph phVar : niVar.a) {
                String str = phVar.a;
                a22 a22Var2 = niVar.b;
                if (a22Var2 != null && (a = a22Var2.a(phVar)) != null && a.b()) {
                    HashMap hashMap2 = new HashMap();
                    wk3 c = a.c();
                    if (c != null) {
                        hashMap2.put("width", Integer.valueOf(sa3.a(c.a)));
                        hashMap2.put("height", Integer.valueOf(sa3.a(c.b)));
                    }
                    lj1 lj1Var = a instanceof lj1 ? (lj1) a : null;
                    if (lj1Var != null) {
                        hn1 hn1Var = lj1Var.b;
                        gn1 gn1Var = (hn1Var == null || (d = hn1Var.d()) == null) ? lj1Var.a != null ? gn1.f : null : d;
                        if (gn1Var != null) {
                            hashMap2.put("value_type", gn1Var.b);
                        }
                    }
                    hashMap.put(str, hashMap2);
                }
            }
            a22 a22Var3 = niVar.b;
            View a6 = a22Var3 != null ? a22Var3.c.a() : null;
            Map createMapBuilder = MapsKt.createMapBuilder();
            if (a6 != null) {
                createMapBuilder.put("width", Integer.valueOf(sa3.a(a6.getWidth())));
                createMapBuilder.put("height", Integer.valueOf(sa3.a(a6.getHeight())));
            }
            Map build = MapsKt.build(createMapBuilder);
            if (!build.isEmpty()) {
                hashMap.put("superview", build);
            }
            a5.a.putAll(MapsKt.plus(map, MapsKt.mapOf(TuplesKt.to("assets", MapsKt.mapOf(TuplesKt.to("rendered", hashMap))))));
        }
        l03 l03Var = in2Var.a.d.a;
        if (l03Var != null) {
            a5.b(l03Var.b().b, "size_type");
            a5.b(Integer.valueOf(l03Var.getWidth()), "width");
            a5.b(Integer.valueOf(l03Var.getHeight()), "height");
        }
        bu2 bu2Var = in2Var.e;
        if (bu2Var != null) {
            a5.b(bu2Var.R, "banner_size_calculation_type");
        }
        int ordinal = in2Var.c.ordinal();
        if (ordinal == 0) {
            listOf = CollectionsKt.listOf((Object[]) new fo2[]{fo2.l, fo2.k});
        } else if (ordinal == 1) {
            listOf = CollectionsKt.listOf(fo2.l);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listOf = CollectionsKt.listOf(fo2.k);
        }
        Iterator it2 = listOf.iterator();
        while (it2.hasNext()) {
            in2Var.d.a(new ho2((fo2) it2.next(), a5.a, a5.b));
        }
        v4 v4Var = kn2Var.a;
        String str2 = v4Var.a.a;
        if (str2 != null && str2.length() != 0) {
            u4 u4Var = v4Var.b;
            u4Var.getClass();
            synchronized (u4.c) {
                u4Var.a.remove(str2);
                u4Var.a.add(str2);
            }
        }
        kn2Var.b.f();
    }
}
