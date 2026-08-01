package t;

import Y.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0319c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3755f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3756a;

    /* renamed from: b, reason: collision with root package name */
    public int f3757b;

    /* renamed from: c, reason: collision with root package name */
    public int f3758c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3759e;

    public final void a(ArrayList arrayList) {
        int size = this.f3756a.size();
        if (this.f3759e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3759e == nVar.f3757b) {
                    c(this.f3758c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0319c c0319c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3756a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).f3521T;
        c0319c.t();
        eVar.b(c0319c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((s.d) arrayList.get(i2)).b(c0319c, false);
        }
        if (i == 0 && eVar.f3584z0 > 0) {
            s.j.a(eVar, c0319c, arrayList, 0);
        }
        if (i == 1 && eVar.f3566A0 > 0) {
            s.j.a(eVar, c0319c, arrayList, 1);
        }
        try {
            c0319c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s.d dVar = (s.d) arrayList.get(i3);
            O0.e eVar2 = new O0.e(29);
            new WeakReference(dVar);
            C0319c.n(dVar.f3510I);
            C0319c.n(dVar.f3511J);
            C0319c.n(dVar.f3512K);
            C0319c.n(dVar.f3513L);
            C0319c.n(dVar.f3514M);
            this.d.add(eVar2);
        }
        if (i == 0) {
            n2 = C0319c.n(eVar.f3510I);
            n3 = C0319c.n(eVar.f3512K);
            c0319c.t();
        } else {
            n2 = C0319c.n(eVar.f3511J);
            n3 = C0319c.n(eVar.f3513L);
            c0319c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f3756a.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            ArrayList arrayList = nVar.f3756a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f3757b;
            if (i == 0) {
                dVar.n0 = i2;
            } else {
                dVar.f3553o0 = i2;
            }
        }
        this.f3759e = nVar.f3757b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3758c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3757b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3756a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((s.d) it.next()).f3541h0;
        }
        return V.f(sb2, " >");
    }
}
