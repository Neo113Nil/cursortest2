package yads;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class sd1 {
    public final Activity a;
    public final t8 b;
    public final d2 c;
    public final z1 d;
    public final int e;
    public final o2 f;
    public final v3 g;
    public final yu2 h;
    public final vw2 i;
    public final td1 j;
    public final ke1 k;
    public final z30 l;

    public sd1(Activity activity, t8 t8Var, d2 d2Var, z1 z1Var, int i, o2 o2Var, v3 v3Var, yu2 yu2Var) {
        vw2 vw2Var;
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
        td1 td1Var = new td1();
        ke1 ke1Var = new ke1(yu2Var);
        io2 b = new cq2().b(v3Var, t8Var);
        yu2Var.getClass();
        z30 z30Var = new z30(ud.a(activity, new dq3(((nt3) yu2Var).a)), b);
        this.a = activity;
        this.b = t8Var;
        this.c = d2Var;
        this.d = z1Var;
        this.e = i;
        this.f = o2Var;
        this.g = v3Var;
        this.h = yu2Var;
        this.i = vw2Var2;
        this.j = td1Var;
        this.k = ke1Var;
        this.l = z30Var;
    }

    public final rd1 a(Activity activity, ViewGroup viewGroup, m12 m12Var, x00 x00Var, s3 s3Var, pr2 pr2Var, x63 x63Var, ai0 ai0Var, ri0 ri0Var, i6 i6Var) {
        a(m12Var);
        md1 a = this.k.a(activity, this.b, this.g, m12Var, x00Var, this.c, s3Var);
        v3 v3Var = this.g;
        yu2 yu2Var = this.h;
        t8 t8Var = this.b;
        o2 o2Var = this.f;
        int i = this.e;
        List a2 = (t8Var.a == e00.f ? new es2(v3Var, yu2Var, o2Var, i) : new ic1(v3Var, yu2Var, o2Var, i)).a(activity, this.b, m12Var, this.c, this.d, this.l, s3Var, pr2Var, x63Var, ai0Var, ri0Var, i6Var);
        td1 td1Var = this.j;
        t8 t8Var2 = this.b;
        d2 d2Var = this.c;
        td1Var.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tx0) it.next()).a(activity, t8Var2, m12Var, d2Var, x00Var));
        }
        return new rd1(activity, viewGroup, CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(a), (Iterable) arrayList));
    }

    public final void a(m12 m12Var) {
        bu2 a = this.i.a(this.a);
        if (a == null || !a.q0) {
            return;
        }
        m12Var.a(new zb() { // from class: yads.sd1$$ExternalSyntheticLambda0
            @Override // yads.zb
            public final void a(boolean z) {
                sd1.a(sd1.this, z);
            }
        });
    }

    public static final void a(sd1 sd1Var, boolean z) {
        if (z) {
            ArrayList arrayList = z5.a;
            zo0 zo0Var = z5.b;
            if (zo0Var != null) {
                zo0Var.k = true;
                zo0Var.c();
            }
            z1 z1Var = sd1Var.d;
            boolean isEmpty = z1Var.c.isEmpty();
            z1Var.c.add("adtune");
            if (isEmpty) {
                Iterator it = z1Var.b.iterator();
                while (it.hasNext()) {
                    ((a2) it.next()).b();
                }
                return;
            }
            return;
        }
        z1 z1Var2 = sd1Var.d;
        z1Var2.c.remove("adtune");
        if (z1Var2.c.isEmpty()) {
            Iterator it2 = z1Var2.b.iterator();
            while (it2.hasNext()) {
                ((a2) it2.next()).a();
            }
        }
        ArrayList arrayList2 = z5.a;
        zo0 zo0Var2 = z5.b;
        if (zo0Var2 != null) {
            zo0Var2.k = false;
        }
        zo0 zo0Var3 = z5.b;
        if (zo0Var3 != null) {
            zo0Var3.e();
        }
    }
}
