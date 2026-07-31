package yads;

import java.util.HashMap;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class y1 {
    public static final Object b = new Object();
    public static volatile y1 c;
    public final HashMap a = new HashMap();

    public final void a(long j, w1 w1Var) {
        synchronized (b) {
            this.a.put(Long.valueOf(j), w1Var);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final w1 a(long j) {
        w1 w1Var;
        synchronized (b) {
            w1Var = (w1) this.a.remove(Long.valueOf(j));
        }
        return w1Var;
    }
}
