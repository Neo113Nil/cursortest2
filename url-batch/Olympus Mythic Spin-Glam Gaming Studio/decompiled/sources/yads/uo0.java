package yads;

import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class uo0 {
    public static final Object b = new Object();
    public static volatile uo0 c;
    public final to0 a;

    public uo0() {
        Integer num;
        vw2 a = uw2.a();
        synchronized (vw2.k) {
            num = a.j;
        }
        this.a = new to0(num != null ? RangesKt.coerceIn(num.intValue(), 1, 4) : 4);
    }

    public final zo0 a(we3 we3Var) {
        return (zo0) this.a.get(we3Var);
    }

    public final void a(we3 we3Var, zo0 zo0Var) {
        this.a.put(we3Var, zo0Var);
    }
}
