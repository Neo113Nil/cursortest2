package o0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c1.AbstractC0104b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3633A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3634B;

    /* renamed from: C, reason: collision with root package name */
    public int f3635C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3636D;

    /* renamed from: E, reason: collision with root package name */
    public int f3637E;

    @Override // o0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3671c = j2;
        if (j2 < 0 || (arrayList = this.f3633A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).A(j2);
        }
    }

    @Override // o0.m
    public final void B(AbstractC0104b abstractC0104b) {
        this.f3637E |= 8;
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).B(abstractC0104b);
        }
    }

    @Override // o0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3637E |= 1;
        ArrayList arrayList = this.f3633A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3633A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // o0.m
    public final void D(t.n nVar) {
        super.D(nVar);
        this.f3637E |= 4;
        if (this.f3633A != null) {
            for (int i = 0; i < this.f3633A.size(); i++) {
                ((m) this.f3633A.get(i)).D(nVar);
            }
        }
    }

    @Override // o0.m
    public final void E() {
        this.f3637E |= 2;
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).E();
        }
    }

    @Override // o0.m
    public final void F(long j2) {
        this.f3670b = j2;
    }

    @Override // o0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3633A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f3633A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f3633A.add(mVar);
        mVar.i = this;
        long j2 = this.f3671c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3637E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f3637E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3637E & 4) != 0) {
            mVar.D(this.f3687v);
        }
        if ((this.f3637E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // o0.m
    public final void c() {
        super.c();
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).c();
        }
    }

    @Override // o0.m
    public final void d(u uVar) {
        if (t(uVar.f3699b)) {
            Iterator it = this.f3633A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3699b)) {
                    mVar.d(uVar);
                    uVar.f3700c.add(mVar);
                }
            }
        }
    }

    @Override // o0.m
    public final void f(u uVar) {
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).f(uVar);
        }
    }

    @Override // o0.m
    public final void g(u uVar) {
        if (t(uVar.f3699b)) {
            Iterator it = this.f3633A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3699b)) {
                    mVar.g(uVar);
                    uVar.f3700c.add(mVar);
                }
            }
        }
    }

    @Override // o0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0303a c0303a = (C0303a) super.clone();
        c0303a.f3633A = new ArrayList();
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3633A.get(i)).clone();
            c0303a.f3633A.add(clone);
            clone.i = c0303a;
        }
        return c0303a;
    }

    @Override // o0.m
    public final void l(FrameLayout frameLayout, U.v vVar, U.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3670b;
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f3633A.get(i);
            if (j2 > 0 && (this.f3634B || i == 0)) {
                long j3 = mVar.f3670b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, vVar, vVar2, arrayList, arrayList2);
        }
    }

    @Override // o0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).w(viewGroup);
        }
    }

    @Override // o0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // o0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3633A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3633A.get(i)).y(frameLayout);
        }
    }

    @Override // o0.m
    public final void z() {
        if (this.f3633A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3696b = this;
        Iterator it = this.f3633A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3635C = this.f3633A.size();
        if (this.f3634B) {
            Iterator it2 = this.f3633A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3633A.size(); i++) {
            ((m) this.f3633A.get(i - 1)).a(new r((m) this.f3633A.get(i)));
        }
        m mVar = (m) this.f3633A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
