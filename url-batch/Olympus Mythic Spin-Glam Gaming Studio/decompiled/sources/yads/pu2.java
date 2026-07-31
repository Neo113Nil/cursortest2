package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class pu2 extends co {
    public final Context w;
    public final ap2 x;
    public final Map y;

    public pu2(Context context, String str, ap2 ap2Var, Map map, ru2 ru2Var, ru2 ru2Var2) {
        super(context, 0, str, ru2Var2, ru2Var);
        this.w = context;
        this.x = ap2Var;
        this.y = map;
        this.n = true;
        this.m = true;
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        f4 f4Var;
        if (200 == u82Var.a) {
            bu2 bu2Var = (bu2) this.x.a(u82Var);
            if (bu2Var != null) {
                Map map = u82Var.c;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                a(map);
                return new xp2(bu2Var, b11.a(u82Var));
            }
            f4Var = f4.c;
        } else {
            f4Var = f4.e;
        }
        return new xp2(new z3(f4Var, u82Var));
    }

    @Override // yads.ro2
    public final Map d() {
        HashMap hashMap = new HashMap();
        c11.a(this.w, hashMap);
        hashMap.putAll(this.y);
        return hashMap;
    }

    @Override // yads.co, yads.ro2
    public final hm3 a(hm3 hm3Var) {
        f4 f4Var;
        boolean z = ob1.a;
        int i = z3.d;
        u82 u82Var = hm3Var.b;
        Integer valueOf = u82Var != null ? Integer.valueOf(u82Var.a) : null;
        if (valueOf == null) {
            if (hm3Var instanceof p92) {
                f4Var = f4.l;
            } else if (hm3Var instanceof i73) {
                f4Var = f4.m;
            } else if (hm3Var instanceof lk) {
                f4Var = f4.n;
            } else if (hm3Var instanceof kv) {
                f4Var = f4.o;
            } else {
                f4Var = hm3Var instanceof ac2 ? f4.p : f4.q;
            }
        } else {
            int intValue = valueOf.intValue();
            f4Var = (500 > intValue || intValue > 599) ? f4.e : f4.f;
        }
        return new z3(f4Var, u82Var);
    }
}
