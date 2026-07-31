package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class vf2 extends e {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final g73[] i;
    public final Object[] j;
    public final HashMap k;

    public vf2(ArrayList arrayList, hz2 hz2Var) {
        super(hz2Var);
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new int[size];
        this.i = new g73[size];
        this.j = new Object[size];
        this.k = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            um1 um1Var = (um1) it.next();
            this.i[i3] = um1Var.b();
            this.h[i3] = i;
            this.g[i3] = i2;
            i += this.i[i3].b();
            i2 += this.i[i3].a();
            this.j[i3] = um1Var.a();
            this.k.put(this.j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.e = i;
        this.f = i2;
    }

    @Override // yads.g73
    public final int a() {
        return this.f;
    }

    @Override // yads.g73
    public final int b() {
        return this.e;
    }
}
