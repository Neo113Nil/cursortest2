package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0289c;
import s.C0299d;
import s.C0300e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3770f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3771a;

    /* renamed from: b, reason: collision with root package name */
    public int f3772b;

    /* renamed from: c, reason: collision with root package name */
    public int f3773c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3774e;

    public final void a(ArrayList arrayList) {
        int size = this.f3771a.size();
        if (this.f3774e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0315n c0315n = (C0315n) arrayList.get(i);
                if (this.f3774e == c0315n.f3772b) {
                    c(this.f3773c, c0315n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0289c c0289c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3771a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0300e c0300e = (C0300e) ((C0299d) arrayList.get(0)).f3612T;
        c0289c.t();
        c0300e.b(c0289c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0299d) arrayList.get(i2)).b(c0289c, false);
        }
        if (i == 0 && c0300e.f3676z0 > 0) {
            s.j.a(c0300e, c0289c, arrayList, 0);
        }
        if (i == 1 && c0300e.f3657A0 > 0) {
            s.j.a(c0300e, c0289c, arrayList, 1);
        }
        try {
            c0289c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0299d c0299d = (C0299d) arrayList.get(i3);
            H0.e eVar = new H0.e(27);
            new WeakReference(c0299d);
            C0289c.n(c0299d.f3601I);
            C0289c.n(c0299d.f3602J);
            C0289c.n(c0299d.f3603K);
            C0289c.n(c0299d.f3604L);
            C0289c.n(c0299d.f3605M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0289c.n(c0300e.f3601I);
            n3 = C0289c.n(c0300e.f3603K);
            c0289c.t();
        } else {
            n2 = C0289c.n(c0300e.f3602J);
            n3 = C0289c.n(c0300e.f3604L);
            c0289c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0315n c0315n) {
        Iterator it = this.f3771a.iterator();
        while (it.hasNext()) {
            C0299d c0299d = (C0299d) it.next();
            ArrayList arrayList = c0315n.f3771a;
            if (!arrayList.contains(c0299d)) {
                arrayList.add(c0299d);
            }
            int i2 = c0315n.f3772b;
            if (i == 0) {
                c0299d.f3642n0 = i2;
            } else {
                c0299d.f3644o0 = i2;
            }
        }
        this.f3774e = c0315n.f3772b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3773c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3772b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3771a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0299d) it.next()).f3632h0;
        }
        return V.e(sb2, " >");
    }
}
