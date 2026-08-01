package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179a extends AbstractC0191m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2773A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2774B;

    /* renamed from: C, reason: collision with root package name */
    public int f2775C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2776D;

    /* renamed from: E, reason: collision with root package name */
    public int f2777E;

    @Override // k0.AbstractC0191m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2811c = j2;
        if (j2 < 0 || (arrayList = this.f2773A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).A(j2);
        }
    }

    @Override // k0.AbstractC0191m
    public final void B(i1.s sVar) {
        this.f2777E |= 8;
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).B(sVar);
        }
    }

    @Override // k0.AbstractC0191m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2777E |= 1;
        ArrayList arrayList = this.f2773A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0191m) this.f2773A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.AbstractC0191m
    public final void D(H0.e eVar) {
        super.D(eVar);
        this.f2777E |= 4;
        if (this.f2773A != null) {
            for (int i = 0; i < this.f2773A.size(); i++) {
                ((AbstractC0191m) this.f2773A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.AbstractC0191m
    public final void E() {
        this.f2777E |= 2;
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).E();
        }
    }

    @Override // k0.AbstractC0191m
    public final void F(long j2) {
        this.f2810b = j2;
    }

    @Override // k0.AbstractC0191m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2773A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((AbstractC0191m) this.f2773A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(AbstractC0191m abstractC0191m) {
        this.f2773A.add(abstractC0191m);
        abstractC0191m.i = this;
        long j2 = this.f2811c;
        if (j2 >= 0) {
            abstractC0191m.A(j2);
        }
        if ((this.f2777E & 1) != 0) {
            abstractC0191m.C(this.d);
        }
        if ((this.f2777E & 2) != 0) {
            abstractC0191m.E();
        }
        if ((this.f2777E & 4) != 0) {
            abstractC0191m.D(this.f2827v);
        }
        if ((this.f2777E & 8) != 0) {
            abstractC0191m.B(null);
        }
    }

    @Override // k0.AbstractC0191m
    public final void c() {
        super.c();
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).c();
        }
    }

    @Override // k0.AbstractC0191m
    public final void d(C0199u c0199u) {
        if (t(c0199u.f2839b)) {
            Iterator it = this.f2773A.iterator();
            while (it.hasNext()) {
                AbstractC0191m abstractC0191m = (AbstractC0191m) it.next();
                if (abstractC0191m.t(c0199u.f2839b)) {
                    abstractC0191m.d(c0199u);
                    c0199u.f2840c.add(abstractC0191m);
                }
            }
        }
    }

    @Override // k0.AbstractC0191m
    public final void f(C0199u c0199u) {
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).f(c0199u);
        }
    }

    @Override // k0.AbstractC0191m
    public final void g(C0199u c0199u) {
        if (t(c0199u.f2839b)) {
            Iterator it = this.f2773A.iterator();
            while (it.hasNext()) {
                AbstractC0191m abstractC0191m = (AbstractC0191m) it.next();
                if (abstractC0191m.t(c0199u.f2839b)) {
                    abstractC0191m.g(c0199u);
                    c0199u.f2840c.add(abstractC0191m);
                }
            }
        }
    }

    @Override // k0.AbstractC0191m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0191m clone() {
        C0179a c0179a = (C0179a) super.clone();
        c0179a.f2773A = new ArrayList();
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0191m clone = ((AbstractC0191m) this.f2773A.get(i)).clone();
            c0179a.f2773A.add(clone);
            clone.i = c0179a;
        }
        return c0179a;
    }

    @Override // k0.AbstractC0191m
    public final void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2810b;
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0191m abstractC0191m = (AbstractC0191m) this.f2773A.get(i);
            if (j2 > 0 && (this.f2774B || i == 0)) {
                long j3 = abstractC0191m.f2810b;
                if (j3 > 0) {
                    abstractC0191m.F(j3 + j2);
                } else {
                    abstractC0191m.F(j2);
                }
            }
            abstractC0191m.l(frameLayout, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.AbstractC0191m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).w(viewGroup);
        }
    }

    @Override // k0.AbstractC0191m
    public final AbstractC0191m x(InterfaceC0189k interfaceC0189k) {
        super.x(interfaceC0189k);
        return this;
    }

    @Override // k0.AbstractC0191m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f2773A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0191m) this.f2773A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.AbstractC0191m
    public final void z() {
        if (this.f2773A.isEmpty()) {
            G();
            m();
            return;
        }
        C0196r c0196r = new C0196r();
        c0196r.f2836b = this;
        Iterator it = this.f2773A.iterator();
        while (it.hasNext()) {
            ((AbstractC0191m) it.next()).a(c0196r);
        }
        this.f2775C = this.f2773A.size();
        if (this.f2774B) {
            Iterator it2 = this.f2773A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0191m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2773A.size(); i++) {
            ((AbstractC0191m) this.f2773A.get(i - 1)).a(new C0196r((AbstractC0191m) this.f2773A.get(i)));
        }
        AbstractC0191m abstractC0191m = (AbstractC0191m) this.f2773A.get(0);
        if (abstractC0191m != null) {
            abstractC0191m.z();
        }
    }
}
