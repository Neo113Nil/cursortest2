package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public final class e30 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final rb3 i;
    public final py2 j;
    public final Uri k;
    public final kj2 l;
    public final List m;

    public e30(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, kj2 kj2Var, rb3 rb3Var, py2 py2Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = kj2Var;
        this.i = rb3Var;
        this.k = uri;
        this.j = py2Var;
        this.m = arrayList;
    }

    public final long a(int i) {
        long j;
        long j2;
        if (i == this.m.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((sc2) this.m.get(i)).b;
        } else {
            j = ((sc2) this.m.get(i + 1)).b;
            j2 = ((sc2) this.m.get(i)).b;
        }
        return j - j2;
    }

    public final e30 a(List list) {
        e30 e30Var = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new g43(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= e30Var.m.size()) {
                break;
            }
            if (((g43) linkedList.peek()).b != i) {
                long a = e30Var.a(i);
                if (a != -9223372036854775807L) {
                    j += a;
                }
            } else {
                sc2 sc2Var = (sc2) e30Var.m.get(i);
                List list2 = sc2Var.c;
                g43 g43Var = (g43) linkedList.poll();
                int i2 = g43Var.b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = g43Var.c;
                    ta taVar = (ta) list2.get(i3);
                    List list3 = taVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((oo2) list3.get(g43Var.d));
                        g43Var = (g43) linkedList.poll();
                        if (g43Var.b != i2) {
                            break;
                        }
                    } while (g43Var.c == i3);
                    List list4 = list2;
                    arrayList2.add(new ta(taVar.a, taVar.b, arrayList3, taVar.d, taVar.e, taVar.f));
                    if (g43Var.b != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(g43Var);
                arrayList.add(new sc2(sc2Var.a, sc2Var.b - j, arrayList2, sc2Var.d));
            }
            i++;
            e30Var = this;
        }
        long j2 = e30Var.b;
        return new e30(e30Var.a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, e30Var.c, e30Var.d, e30Var.e, e30Var.f, e30Var.g, e30Var.h, e30Var.l, e30Var.i, e30Var.j, e30Var.k, arrayList);
    }
}
