package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public abstract class f42 {
    public final ni A;
    public final w83 B;
    public final q82 C;
    public final x20 D;
    public final i02 E;
    public final String F;
    public final jx1 G;
    public final q83 H;
    public final r3 I;
    public final cv J;
    public final uh K;
    public a22 L;
    public final c42 M;
    public final String N;
    public final List O;
    public final p42 P;
    public final Context a;
    public final sz1 b;
    public final v72 c;
    public final z12 d;
    public final x72 e;
    public final yu2 f;
    public final l02 g;
    public final v3 h;
    public final t8 i;
    public final s12 j;
    public final bz2 k;
    public final x32 l;
    public final j10 m;
    public final d63 n;
    public final t41 o;
    public final eq p;
    public final b22 q;
    public final rn1 r;
    public final bi s;
    public final w41 t;
    public final ln2 u;
    public final rp v;
    public final dp0 w;
    public final ty1 x;
    public final om2 y;
    public final ep0 z;

    public f42(Context context, np npVar, sz1 sz1Var) {
        x32 x32Var;
        b22 b22Var;
        d82 d82Var;
        j62 j62Var;
        q92 zz2Var;
        b22 b22Var2;
        v72 v72Var = npVar.d;
        z12 z12Var = npVar.b;
        x72 x72Var = npVar.c;
        dz1 dz1Var = npVar.a;
        yu2 yu2Var = npVar.h;
        l02 l02Var = npVar.e;
        v32 v32Var = npVar.f;
        i22 i22Var = npVar.g;
        ry1 ry1Var = npVar.i;
        r9 r9Var = npVar.j;
        v3 v3Var = dz1Var.c;
        e00 e00Var = v3Var.a;
        t8 t8Var = dz1Var.b;
        s12 s12Var = dz1Var.a;
        List list = x72Var.a;
        String str = x72Var.d;
        bz2 bz2Var = s12Var.i;
        x32 x32Var2 = new x32();
        j10 j10Var = new j10(x32Var2);
        d63 d63Var = new d63();
        t41 t41Var = new t41();
        r92 r92Var = new r92();
        id2 a = id2.h.a(context);
        mn2 mn2Var = new mn2();
        eq eqVar = new eq();
        c5 c5Var = l02Var.a;
        b22 b22Var3 = b22.c;
        if (b22Var3 == null) {
            synchronized (b22.b) {
                b22Var2 = b22.c;
                if (b22Var2 == null) {
                    b22Var2 = new b22();
                    b22.c = b22Var2;
                }
            }
            x32Var = x32Var2;
            b22Var = b22Var2;
        } else {
            x32Var = x32Var2;
            b22Var = b22Var3;
        }
        rn1 rn1Var = new rn1(context, v3Var, yu2Var);
        c8 c8Var = new c8(new l22(z12Var), i22Var);
        bi biVar = new bi(list);
        w41 w41Var = new w41(context, t8Var, v3Var, yu2Var, x72Var.e);
        ln2 ln2Var = new ln2(list);
        Context context2 = ((nt3) yu2Var).a;
        rp rpVar = new rp(c5Var, e00Var, t8Var, str, pr.a(context2, context2));
        dp0 dp0Var = new dp0(context, yu2Var, c5Var, e00Var, t8Var, str);
        ty1 ty1Var = new ty1(context, yu2Var, c5Var, e00Var, str);
        om2 om2Var = new om2(context, yu2Var, c5Var, e00Var, t8Var, str);
        ep0 ep0Var = new ep0(list);
        ni niVar = new ni(list);
        v4 v4Var = new v4(new r02(str));
        w83 w83Var = new w83();
        q82 q82Var = new q82(v3Var, t8Var, list);
        x20 x20Var = new x20(context, v3Var, yu2Var, t8Var, ry1Var != null ? ry1Var.f : null);
        this.a = context;
        this.b = sz1Var;
        this.c = v72Var;
        this.d = z12Var;
        this.e = x72Var;
        this.f = yu2Var;
        this.g = l02Var;
        this.h = v3Var;
        this.i = t8Var;
        this.j = s12Var;
        this.k = bz2Var;
        this.l = x32Var;
        this.m = j10Var;
        this.n = d63Var;
        this.o = t41Var;
        this.p = eqVar;
        this.q = b22Var;
        this.r = rn1Var;
        this.s = biVar;
        this.t = w41Var;
        this.u = ln2Var;
        this.v = rpVar;
        this.w = dp0Var;
        this.x = ty1Var;
        this.y = om2Var;
        this.z = ep0Var;
        this.A = niVar;
        this.B = w83Var;
        this.C = q82Var;
        this.D = x20Var;
        i02 a2 = l02Var.b.a(context, v3Var, t8Var);
        this.E = a2;
        int i = oa.$r8$clinit;
        String obj = toString();
        String str2 = obj == null ? "" : obj;
        this.F = str2;
        this.M = new c42(this);
        d42 d42Var = new d42(this);
        String str3 = t8Var.e;
        if (str3 == null && (str3 = v3Var.c.a) == null) {
            str3 = "";
        }
        this.N = str3;
        this.O = s12Var.f;
        Object obj2 = biVar.a.get("media");
        dn1 dn1Var = obj2 instanceof dn1 ? (dn1) obj2 : null;
        if (dn1Var != null) {
            j62Var = dn1Var.b != null ? new j62() : null;
            d82Var = dn1Var.a != null ? new d82() : null;
        } else {
            d82Var = null;
            j62Var = null;
        }
        this.P = new p42(j62Var, d82Var);
        u41 u41Var = new u41(context, a2, w41Var, v4Var);
        t41Var.c.add(u41Var);
        t41Var.d.add(u41Var);
        t41Var.b.add(u41Var);
        t41Var.e.add(u41Var);
        ArrayList arrayList = x72Var.b;
        y4 y4Var = x72Var.e;
        u41Var.e = arrayList;
        u41Var.f = y4Var;
        v41 v41Var = u41Var.c;
        v41Var.c = false;
        v41Var.d = false;
        r3 r3Var = new r3(context, yu2Var, t8Var, v3Var, a2, d63Var, mn2Var);
        this.I = r3Var;
        this.J = new cv(r3Var, mn2Var, t41Var);
        int ordinal = r9Var.ordinal();
        if (ordinal == 0) {
            z41 z41Var = r92Var.a;
            r9 r9Var2 = r9.d;
            z41Var.getClass();
            y41 a3 = z41.a(r9Var2);
            z41 z41Var2 = r92Var.a;
            r9 r9Var3 = r9.c;
            z41Var2.getClass();
            zz2Var = new zz2(new u83(w41Var, a3), new u83(w41Var, z41.a(r9Var3)));
        } else {
            if (ordinal != 1 && ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r92Var.a.getClass();
            zz2Var = new u83(w41Var, z41.a(r9Var));
        }
        jx1 jx1Var = new jx1(context, v3Var, yu2Var, t8Var, zz2Var, d42Var, str2, r9Var);
        this.G = jx1Var;
        v32Var.a(t41Var);
        t41Var.a.add(new s92(jx1Var));
        q83 a4 = l02Var.e.a(jx1Var, new kn2(context, c8Var, t8Var, v3Var, yu2Var, r9Var, v4Var, t41Var, mn2Var, x72Var.c), new f51(z12Var, arrayList), a);
        this.H = a4;
        a4.a(t41Var);
        a4.a(t8Var, arrayList);
        this.K = new uh(list, r3Var, mn2Var, t41Var, ry1Var != null ? ry1Var.f : null);
    }

    public final void a(View view, ri2 ri2Var, o22 o22Var, ku kuVar) {
        b22 b22Var;
        b22 b22Var2 = b22.c;
        if (b22Var2 == null) {
            synchronized (b22.b) {
                b22Var = b22.c;
                if (b22Var == null) {
                    b22Var = new b22();
                    b22.c = b22Var;
                }
            }
            b22Var2 = b22Var;
        }
        f42 a = b22Var2.a(view);
        if (Intrinsics.areEqual(this, a)) {
            return;
        }
        if (a != null) {
            a.h();
        }
        a(this, b22Var2);
        b22Var2.a(view, this);
        a22 a22Var = new a22(o22Var, this.h, this.f, ri2Var, this.o, this.g, this.s, this.P, this.l, this.i, this.e, this.b, this.r, this.k, this.D, kuVar.a);
        a22Var.a();
        this.L = a22Var;
        this.A.b = a22Var;
        this.d.a(a22Var);
        this.c.a(a22Var);
        uh uhVar = this.K;
        kuVar.b = new th(uhVar.a, uhVar.b, a22Var, uhVar.c, uhVar.d, uhVar.e);
        b(a22Var);
        a(view);
    }

    public final s12 b() {
        return this.j;
    }

    public final p42 d() {
        return this.P;
    }

    public final void destroy() {
        a22 a22Var = this.L;
        if (a22Var != null) {
            for (qh qhVar : a22Var.d.values()) {
                if (qhVar != null) {
                    qhVar.destroy();
                }
            }
        }
    }

    public final List f() {
        return this.O;
    }

    public final l52 g() {
        return this.d;
    }

    public final void h() {
        j();
        w83 w83Var = this.B;
        Context context = this.a;
        x83 x83Var = w83Var.a;
        if (x83Var != null) {
            x83Var.b.b(context, x83Var);
        }
        w83Var.a = null;
        j22 j22Var = w83Var.b;
        if (j22Var != null) {
            j22Var.b();
        }
        w83Var.b = null;
        a22 a22Var = this.L;
        if (a22Var != null) {
            this.c.a(a22Var);
            this.H.a(a22Var);
            this.A.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.isAttachedToWindow() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        a22 a22Var = this.L;
        boolean z = (a22Var == null || (r0 = a22Var.b()) == null) ? false : true;
        boolean z2 = ob1.a;
        if (z) {
            this.H.a(this.a, this.M, this.L);
        }
    }

    public final void j() {
        boolean z = ob1.a;
        this.H.a(this.M);
    }

    public abstract void loadImages();

    public final void b(a22 a22Var) {
        this.c.a(a22Var, this.J);
        boolean z = Intrinsics.areEqual(this.i.b(), g42.c.a()) || Intrinsics.areEqual(this.i.b(), g42.d.a());
        if (this.C.a() && !z) {
            loadImages();
        }
        List list = this.u.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            qh a = a22Var.a((ph) obj);
            if (a != null ? a.b() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ph) it.next()).a);
        }
        this.x.a(arrayList2, fo2.v);
        boolean z2 = ob1.a;
        i();
    }

    public void a(x00 x00Var) {
        this.E.a.b = x00Var;
    }

    public void a(zb zbVar) {
        this.I.k = zbVar;
    }

    public final void a(View view, ri2 ri2Var, o22 o22Var) {
        f42 a = this.q.a(view);
        if (Intrinsics.areEqual(this, a)) {
            return;
        }
        if (a != null) {
            a.h();
        }
        a(this, this.q);
        this.q.a(view, this);
        a(new a22(o22Var, this.h, this.f, ri2Var, this.o, this.g, this.s, this.P, this.l, this.i, this.e, this.b, this.r, this.k, this.D, gg0.b));
        a(view);
    }

    public final void a(w22 w22Var) {
        this.I.g.e = w22Var;
        this.t.h = w22Var;
        d1 d1Var = this.E.b;
        d1Var.g = w22Var;
        d1Var.f.b.k = w22Var;
        this.H.a(new v42(w22Var, this.A));
        this.v.c.e = w22Var;
        this.w.b.e = w22Var;
        this.x.b.e = w22Var;
        this.y.c.e = w22Var;
    }

    public static void a(f42 f42Var, b22 b22Var) {
        boolean z;
        b22Var.getClass();
        synchronized (b22.b) {
            Iterator it = b22Var.a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (((f42) ((Map.Entry) it.next()).getValue()) == f42Var) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            f42Var.h();
        }
    }

    public final void a(a22 a22Var) {
        a22Var.a();
        this.y.a();
        this.p.getClass();
        HashMap hashMap = a22Var.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            qh qhVar = (qh) entry.getValue();
            if (qhVar != null ? qhVar.b() : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        this.x.a(arrayList, fo2.u);
        List list = this.z.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((ph) obj).f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            qh a = a22Var.a((ph) next);
            if (a == null || !a.b()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((ph) it4.next()).a);
        }
        if (!arrayList4.isEmpty()) {
            dp0 dp0Var = this.w;
            io2 a2 = dp0Var.b.a();
            a2.b("no_view_for_asset", "reason");
            a2.b(arrayList4, "assets");
            Map map = dp0Var.a.u;
            if (map != null) {
                a2.a.putAll(map);
            }
            c cVar = dp0Var.a.i;
            a2.b = cVar;
            fo2 fo2Var = fo2.c;
            dp0Var.c.a(new ho2("expected_view_missing", MapsKt.toMutableMap(a2.a), cVar));
        }
        this.L = a22Var;
        this.A.a(a22Var);
        this.d.a(a22Var);
        mp2 b = this.d.b();
        if (b.a()) {
            this.c.a(a22Var);
            b(a22Var);
            return;
        }
        String b2 = b.b();
        this.v.a(b2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("Resource for required view " + b2 + " is not present", Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        throw new v02(format, b2);
    }

    public final void a(View view) {
        w83 w83Var = this.B;
        e42 e42Var = new e42(this);
        w83Var.getClass();
        Context context = view.getContext();
        x83 x83Var = w83Var.a;
        if (x83Var != null) {
            x83Var.b.b(context, x83Var);
        }
        Activity activity = null;
        w83Var.a = null;
        j22 j22Var = w83Var.b;
        if (j22Var != null) {
            j22Var.b();
        }
        w83Var.b = null;
        Context context2 = view.getContext();
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i2;
            }
        }
        if (activity != null) {
            x83 x83Var2 = new x83(activity, e42Var);
            w83Var.a = x83Var2;
            x83Var2.b.a(activity, x83Var2);
        }
        j22 j22Var2 = new j22(view, e42Var);
        w83Var.b = j22Var2;
        j22Var2.a();
    }
}
