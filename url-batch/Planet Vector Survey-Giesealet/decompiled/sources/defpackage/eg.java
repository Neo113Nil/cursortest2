package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class eg implements qu, ru, su, tu, uu, vu, wu, xu, cu, du, fu, gu, hu, iu, ju, ku, lu, nu, ou {
    public final int d;
    public final boolean e;
    public yu f;
    public ri0 g;
    public ArrayList h;

    public eg(int i, boolean z, yu yuVar) {
        this.d = i;
        this.e = z;
        this.f = yuVar;
    }

    @Override // defpackage.ru
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return e(obj, (ih) obj2, ((Number) obj3).intValue());
    }

    public final Object d(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(this.d);
        h(qhVar);
        int k = i | (qhVar.f(this) ? a50.k(2, 0) : a50.k(1, 0));
        yu yuVar = this.f;
        px0.k(2, yuVar);
        Object invoke = ((qu) yuVar).invoke(qhVar, Integer.valueOf(k));
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new dg(2, this, eg.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    public final Object e(Object obj, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(this.d);
        h(qhVar);
        int i2 = 1;
        int k = qhVar.f(this) ? a50.k(2, 1) : a50.k(1, 1);
        yu yuVar = this.f;
        px0.k(3, yuVar);
        Object b = ((ru) yuVar).b(obj, qhVar, Integer.valueOf(k | i));
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new d8(i, i2, this, obj);
        }
        return b;
    }

    @Override // defpackage.su
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (ih) obj3, ((Number) obj4).intValue());
    }

    public final Object g(Object obj, Object obj2, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(this.d);
        h(qhVar);
        int k = qhVar.f(this) ? a50.k(2, 2) : a50.k(1, 2);
        yu yuVar = this.f;
        px0.k(4, yuVar);
        Object f = ((su) yuVar).f(obj, obj2, qhVar, Integer.valueOf(k | i));
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new cg(this, obj, obj2, i, 0);
        }
        return f;
    }

    public final void h(ih ihVar) {
        ri0 w;
        if (!this.e || (w = ((qh) ihVar).w()) == null) {
            return;
        }
        w.b |= 1;
        if (a50.F(this.g, w)) {
            this.g = w;
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            arrayList2.add(w);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (a50.F((ri0) arrayList.get(i), w)) {
                arrayList.set(i, w);
                return;
            }
        }
        arrayList.add(w);
    }

    @Override // defpackage.qu
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return d((ih) obj, ((Number) obj2).intValue());
    }
}
