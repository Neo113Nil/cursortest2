package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class RL {
    public final NL a;
    public final ArrayList b;
    public final int c;
    public final C0584Wk d;
    public final FN e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RL(NL nl, ArrayList arrayList, int i, C0584Wk c0584Wk, FN fn, int i2, int i3, int i4) {
        this.a = nl;
        this.b = arrayList;
        this.c = i;
        this.d = c0584Wk;
        this.e = fn;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static RL a(RL rl, int i, C0584Wk c0584Wk, FN fn, int i2) {
        if ((i2 & 1) != 0) {
            i = rl.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c0584Wk = rl.d;
        }
        C0584Wk c0584Wk2 = c0584Wk;
        if ((i2 & 4) != 0) {
            fn = rl.e;
        }
        FN fn2 = fn;
        int i4 = rl.f;
        int i5 = rl.g;
        int i6 = rl.h;
        AbstractC0048Bt.n(fn2, "request");
        return new RL(rl.a, rl.b, i3, c0584Wk2, fn2, i4, i5, i6);
    }

    public final C0968eO b(FN fn) {
        AbstractC0048Bt.n(fn, "request");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        C0584Wk c0584Wk = this.d;
        if (c0584Wk != null) {
            if (!((C0636Yk) c0584Wk.d).b(fn.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        RL a = a(this, i2, null, fn, 58);
        InterfaceC1789qt interfaceC1789qt = (InterfaceC1789qt) arrayList.get(i);
        C0968eO a2 = interfaceC1789qt.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + interfaceC1789qt + " returned null");
        }
        if (c0584Wk != null && i2 < arrayList.size() && a.i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC1789qt + " must call proceed() exactly once").toString());
        }
        if (a2.n != null) {
            return a2;
        }
        throw new IllegalStateException(("interceptor " + interfaceC1789qt + " returned a response with no body").toString());
    }
}
