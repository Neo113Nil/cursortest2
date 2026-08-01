package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178a extends AbstractC0190m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2767A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2768B;

    /* renamed from: C, reason: collision with root package name */
    public int f2769C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2770D;

    /* renamed from: E, reason: collision with root package name */
    public int f2771E;

    @Override // k0.AbstractC0190m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2805c = j2;
        if (j2 < 0 || (arrayList = this.f2767A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).A(j2);
        }
    }

    @Override // k0.AbstractC0190m
    public final void B(i1.s sVar) {
        this.f2771E |= 8;
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).B(sVar);
        }
    }

    @Override // k0.AbstractC0190m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2771E |= 1;
        ArrayList arrayList = this.f2767A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0190m) this.f2767A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.AbstractC0190m
    public final void D(H0.e eVar) {
        super.D(eVar);
        this.f2771E |= 4;
        if (this.f2767A != null) {
            for (int i = 0; i < this.f2767A.size(); i++) {
                ((AbstractC0190m) this.f2767A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.AbstractC0190m
    public final void E() {
        this.f2771E |= 2;
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).E();
        }
    }

    @Override // k0.AbstractC0190m
    public final void F(long j2) {
        this.f2804b = j2;
    }

    @Override // k0.AbstractC0190m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2767A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((AbstractC0190m) this.f2767A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(AbstractC0190m abstractC0190m) {
        this.f2767A.add(abstractC0190m);
        abstractC0190m.i = this;
        long j2 = this.f2805c;
        if (j2 >= 0) {
            abstractC0190m.A(j2);
        }
        if ((this.f2771E & 1) != 0) {
            abstractC0190m.C(this.d);
        }
        if ((this.f2771E & 2) != 0) {
            abstractC0190m.E();
        }
        if ((this.f2771E & 4) != 0) {
            abstractC0190m.D(this.f2821v);
        }
        if ((this.f2771E & 8) != 0) {
            abstractC0190m.B(null);
        }
    }

    @Override // k0.AbstractC0190m
    public final void c() {
        super.c();
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).c();
        }
    }

    @Override // k0.AbstractC0190m
    public final void d(C0198u c0198u) {
        if (t(c0198u.f2833b)) {
            Iterator it = this.f2767A.iterator();
            while (it.hasNext()) {
                AbstractC0190m abstractC0190m = (AbstractC0190m) it.next();
                if (abstractC0190m.t(c0198u.f2833b)) {
                    abstractC0190m.d(c0198u);
                    c0198u.f2834c.add(abstractC0190m);
                }
            }
        }
    }

    @Override // k0.AbstractC0190m
    public final void f(C0198u c0198u) {
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).f(c0198u);
        }
    }

    @Override // k0.AbstractC0190m
    public final void g(C0198u c0198u) {
        if (t(c0198u.f2833b)) {
            Iterator it = this.f2767A.iterator();
            while (it.hasNext()) {
                AbstractC0190m abstractC0190m = (AbstractC0190m) it.next();
                if (abstractC0190m.t(c0198u.f2833b)) {
                    abstractC0190m.g(c0198u);
                    c0198u.f2834c.add(abstractC0190m);
                }
            }
        }
    }

    @Override // k0.AbstractC0190m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0190m clone() {
        C0178a c0178a = (C0178a) super.clone();
        c0178a.f2767A = new ArrayList();
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0190m clone = ((AbstractC0190m) this.f2767A.get(i)).clone();
            c0178a.f2767A.add(clone);
            clone.i = c0178a;
        }
        return c0178a;
    }

    @Override // k0.AbstractC0190m
    public final void l(FrameLayout frameLayout, T.t tVar, T.t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2804b;
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0190m abstractC0190m = (AbstractC0190m) this.f2767A.get(i);
            if (j2 > 0 && (this.f2768B || i == 0)) {
                long j3 = abstractC0190m.f2804b;
                if (j3 > 0) {
                    abstractC0190m.F(j3 + j2);
                } else {
                    abstractC0190m.F(j2);
                }
            }
            abstractC0190m.l(frameLayout, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.AbstractC0190m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).w(viewGroup);
        }
    }

    @Override // k0.AbstractC0190m
    public final AbstractC0190m x(InterfaceC0188k interfaceC0188k) {
        super.x(interfaceC0188k);
        return this;
    }

    @Override // k0.AbstractC0190m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f2767A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0190m) this.f2767A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.AbstractC0190m
    public final void z() {
        if (this.f2767A.isEmpty()) {
            G();
            m();
            return;
        }
        C0195r c0195r = new C0195r();
        c0195r.f2830b = this;
        Iterator it = this.f2767A.iterator();
        while (it.hasNext()) {
            ((AbstractC0190m) it.next()).a(c0195r);
        }
        this.f2769C = this.f2767A.size();
        if (this.f2768B) {
            Iterator it2 = this.f2767A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0190m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2767A.size(); i++) {
            ((AbstractC0190m) this.f2767A.get(i - 1)).a(new C0195r((AbstractC0190m) this.f2767A.get(i)));
        }
        AbstractC0190m abstractC0190m = (AbstractC0190m) this.f2767A.get(0);
        if (abstractC0190m != null) {
            abstractC0190m.z();
        }
    }
}
