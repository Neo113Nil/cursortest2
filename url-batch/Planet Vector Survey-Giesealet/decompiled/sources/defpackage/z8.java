package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z8 {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public z8(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    public final void d(boolean z) {
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ya0 ya0Var = (ya0) obj;
            ya0Var.f(ya0Var.e && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(int i, Object obj) {
        this(false);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z8(h4 h4Var) {
        this(true);
        this.d = 2;
        this.e = h4Var;
    }

    public final void a() {
    }

    public final void b(x8 x8Var) {
    }

    public final void c(x8 x8Var) {
    }
}
