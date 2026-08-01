package t;

import E1.AbstractC0001b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0330c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f4150f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4151a;

    /* renamed from: b, reason: collision with root package name */
    public int f4152b;

    /* renamed from: c, reason: collision with root package name */
    public int f4153c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f4154e;

    public final void a(ArrayList arrayList) {
        int size = this.f4151a.size();
        if (this.f4154e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = (o) arrayList.get(i);
                if (this.f4154e == oVar.f4152b) {
                    c(this.f4153c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0330c c0330c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4151a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).f3972T;
        c0330c.t();
        eVar.b(c0330c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((s.d) arrayList.get(i2)).b(c0330c, false);
        }
        if (i == 0 && eVar.f4035z0 > 0) {
            s.j.a(eVar, c0330c, arrayList, 0);
        }
        if (i == 1 && eVar.f4017A0 > 0) {
            s.j.a(eVar, c0330c, arrayList, 1);
        }
        try {
            c0330c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s.d dVar = (s.d) arrayList.get(i3);
            n nVar = new n();
            new WeakReference(dVar);
            C0330c.n(dVar.f3961I);
            C0330c.n(dVar.f3962J);
            C0330c.n(dVar.f3963K);
            C0330c.n(dVar.f3964L);
            C0330c.n(dVar.f3965M);
            this.d.add(nVar);
        }
        if (i == 0) {
            n2 = C0330c.n(eVar.f3961I);
            n3 = C0330c.n(eVar.f3963K);
            c0330c.t();
        } else {
            n2 = C0330c.n(eVar.f3962J);
            n3 = C0330c.n(eVar.f3964L);
            c0330c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, o oVar) {
        Iterator it = this.f4151a.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            ArrayList arrayList = oVar.f4151a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = oVar.f4152b;
            if (i == 0) {
                dVar.n0 = i2;
            } else {
                dVar.f4004o0 = i2;
            }
        }
        this.f4154e = oVar.f4152b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4153c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4152b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4151a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((s.d) it.next()).f3992h0;
        }
        return AbstractC0001b.g(sb2, " >");
    }
}
