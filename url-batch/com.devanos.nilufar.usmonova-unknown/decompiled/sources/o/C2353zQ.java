package o;

import java.util.List;

/* renamed from: o.zQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353zQ {
    public final C2023uQ a;
    public final AD b;

    public C2353zQ(C2287yQ c2287yQ, C2340zD c2340zD) {
        List g;
        this.a = c2287yQ.d;
        int[] iArr = AbstractC1393kt.a;
        this.b = new AD();
        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        int size = g.size();
        for (int i = 0; i < size; i++) {
            C2287yQ c2287yQ2 = (C2287yQ) g.get(i);
            if (c2340zD.b(c2287yQ2.g)) {
                this.b.a(c2287yQ2.g);
            }
        }
    }
}
