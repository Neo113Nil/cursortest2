package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0284c;
import s.C0296d;
import s.C0297e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3796f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3797a;

    /* renamed from: b, reason: collision with root package name */
    public int f3798b;

    /* renamed from: c, reason: collision with root package name */
    public int f3799c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3800e;

    public final void a(ArrayList arrayList) {
        int size = this.f3797a.size();
        if (this.f3800e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0312n c0312n = (C0312n) arrayList.get(i);
                if (this.f3800e == c0312n.f3798b) {
                    c(this.f3799c, c0312n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0284c c0284c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3797a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0297e c0297e = (C0297e) ((C0296d) arrayList.get(0)).f3639T;
        c0284c.t();
        c0297e.b(c0284c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0296d) arrayList.get(i2)).b(c0284c, false);
        }
        if (i == 0 && c0297e.z0 > 0) {
            s.j.a(c0297e, c0284c, arrayList, 0);
        }
        if (i == 1 && c0297e.f3684A0 > 0) {
            s.j.a(c0297e, c0284c, arrayList, 1);
        }
        try {
            c0284c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0296d c0296d = (C0296d) arrayList.get(i3);
            J0.e eVar = new J0.e(27);
            new WeakReference(c0296d);
            C0284c.n(c0296d.f3628I);
            C0284c.n(c0296d.f3629J);
            C0284c.n(c0296d.f3630K);
            C0284c.n(c0296d.f3631L);
            C0284c.n(c0296d.f3632M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0284c.n(c0297e.f3628I);
            n3 = C0284c.n(c0297e.f3630K);
            c0284c.t();
        } else {
            n2 = C0284c.n(c0297e.f3629J);
            n3 = C0284c.n(c0297e.f3631L);
            c0284c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0312n c0312n) {
        Iterator it = this.f3797a.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            ArrayList arrayList = c0312n.f3797a;
            if (!arrayList.contains(c0296d)) {
                arrayList.add(c0296d);
            }
            int i2 = c0312n.f3798b;
            if (i == 0) {
                c0296d.f3669n0 = i2;
            } else {
                c0296d.f3671o0 = i2;
            }
        }
        this.f3800e = c0312n.f3798b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3799c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3798b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3797a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0296d) it.next()).f3659h0;
        }
        return V.e(sb2, " >");
    }
}
