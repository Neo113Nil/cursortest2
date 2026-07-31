package yads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g11 extends sn {
    public final eu1 a;
    public final pb3 b;

    public g11(eu1 eu1Var) {
        pb3 pb3Var = new pb3();
        this.a = eu1Var;
        this.b = pb3Var;
    }

    public final e11 a(ro2 ro2Var, Map map) {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        a11 a11Var = a11.c;
        hashMap.put("User-Agent", this.b.a.a());
        eu1 eu1Var = this.a;
        eu1Var.getClass();
        synchronized (su1.a) {
            z = su1.b;
        }
        return z ? (e11) new du1(eu1Var, hashMap).invoke(ro2Var) : eu1Var.a(ro2Var, hashMap);
    }
}
