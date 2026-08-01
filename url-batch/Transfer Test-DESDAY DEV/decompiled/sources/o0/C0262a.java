package o0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262a extends AbstractC0274m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3206A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3207B;

    /* renamed from: C, reason: collision with root package name */
    public int f3208C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3209D;

    /* renamed from: E, reason: collision with root package name */
    public int f3210E;

    @Override // o0.AbstractC0274m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3244c = j2;
        if (j2 < 0 || (arrayList = this.f3206A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).A(j2);
        }
    }

    @Override // o0.AbstractC0274m
    public final void B(h0.f fVar) {
        this.f3210E |= 8;
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).B(fVar);
        }
    }

    @Override // o0.AbstractC0274m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3210E |= 1;
        ArrayList arrayList = this.f3206A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0274m) this.f3206A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // o0.AbstractC0274m
    public final void D(O0.e eVar) {
        super.D(eVar);
        this.f3210E |= 4;
        if (this.f3206A != null) {
            for (int i = 0; i < this.f3206A.size(); i++) {
                ((AbstractC0274m) this.f3206A.get(i)).D(eVar);
            }
        }
    }

    @Override // o0.AbstractC0274m
    public final void E() {
        this.f3210E |= 2;
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).E();
        }
    }

    @Override // o0.AbstractC0274m
    public final void F(long j2) {
        this.f3243b = j2;
    }

    @Override // o0.AbstractC0274m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3206A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((AbstractC0274m) this.f3206A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(AbstractC0274m abstractC0274m) {
        this.f3206A.add(abstractC0274m);
        abstractC0274m.i = this;
        long j2 = this.f3244c;
        if (j2 >= 0) {
            abstractC0274m.A(j2);
        }
        if ((this.f3210E & 1) != 0) {
            abstractC0274m.C(this.d);
        }
        if ((this.f3210E & 2) != 0) {
            abstractC0274m.E();
        }
        if ((this.f3210E & 4) != 0) {
            abstractC0274m.D(this.f3260v);
        }
        if ((this.f3210E & 8) != 0) {
            abstractC0274m.B(null);
        }
    }

    @Override // o0.AbstractC0274m
    public final void c() {
        super.c();
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).c();
        }
    }

    @Override // o0.AbstractC0274m
    public final void d(C0282u c0282u) {
        if (t(c0282u.f3272b)) {
            Iterator it = this.f3206A.iterator();
            while (it.hasNext()) {
                AbstractC0274m abstractC0274m = (AbstractC0274m) it.next();
                if (abstractC0274m.t(c0282u.f3272b)) {
                    abstractC0274m.d(c0282u);
                    c0282u.f3273c.add(abstractC0274m);
                }
            }
        }
    }

    @Override // o0.AbstractC0274m
    public final void f(C0282u c0282u) {
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).f(c0282u);
        }
    }

    @Override // o0.AbstractC0274m
    public final void g(C0282u c0282u) {
        if (t(c0282u.f3272b)) {
            Iterator it = this.f3206A.iterator();
            while (it.hasNext()) {
                AbstractC0274m abstractC0274m = (AbstractC0274m) it.next();
                if (abstractC0274m.t(c0282u.f3272b)) {
                    abstractC0274m.g(c0282u);
                    c0282u.f3273c.add(abstractC0274m);
                }
            }
        }
    }

    @Override // o0.AbstractC0274m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0274m clone() {
        C0262a c0262a = (C0262a) super.clone();
        c0262a.f3206A = new ArrayList();
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0274m clone = ((AbstractC0274m) this.f3206A.get(i)).clone();
            c0262a.f3206A.add(clone);
            clone.i = c0262a;
        }
        return c0262a;
    }

    @Override // o0.AbstractC0274m
    public final void l(FrameLayout frameLayout, U.v vVar, U.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3243b;
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0274m abstractC0274m = (AbstractC0274m) this.f3206A.get(i);
            if (j2 > 0 && (this.f3207B || i == 0)) {
                long j3 = abstractC0274m.f3243b;
                if (j3 > 0) {
                    abstractC0274m.F(j3 + j2);
                } else {
                    abstractC0274m.F(j2);
                }
            }
            abstractC0274m.l(frameLayout, vVar, vVar2, arrayList, arrayList2);
        }
    }

    @Override // o0.AbstractC0274m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).w(viewGroup);
        }
    }

    @Override // o0.AbstractC0274m
    public final AbstractC0274m x(InterfaceC0272k interfaceC0272k) {
        super.x(interfaceC0272k);
        return this;
    }

    @Override // o0.AbstractC0274m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3206A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0274m) this.f3206A.get(i)).y(frameLayout);
        }
    }

    @Override // o0.AbstractC0274m
    public final void z() {
        if (this.f3206A.isEmpty()) {
            G();
            m();
            return;
        }
        C0279r c0279r = new C0279r();
        c0279r.f3269b = this;
        Iterator it = this.f3206A.iterator();
        while (it.hasNext()) {
            ((AbstractC0274m) it.next()).a(c0279r);
        }
        this.f3208C = this.f3206A.size();
        if (this.f3207B) {
            Iterator it2 = this.f3206A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0274m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3206A.size(); i++) {
            ((AbstractC0274m) this.f3206A.get(i - 1)).a(new C0279r((AbstractC0274m) this.f3206A.get(i)));
        }
        AbstractC0274m abstractC0274m = (AbstractC0274m) this.f3206A.get(0);
        if (abstractC0274m != null) {
            abstractC0274m.z();
        }
    }
}
