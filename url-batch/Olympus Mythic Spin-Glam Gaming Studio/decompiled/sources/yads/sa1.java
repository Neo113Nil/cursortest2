package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sa1 extends co {
    public final Context w;
    public final ap2 x;
    public final Map y;

    public sa1(Context context, String str, ap2 ap2Var, Map map, w51 w51Var) {
        super(context, 0, str, w51Var, null);
        this.w = context;
        this.x = ap2Var;
        this.y = map;
    }

    @Override // yads.co, yads.ro2
    public final hm3 a(hm3 hm3Var) {
        boolean z = ob1.a;
        return hm3Var;
    }

    @Override // yads.ro2
    public final Map d() {
        HashMap hashMap = new HashMap();
        c11.a(this.w, hashMap);
        hashMap.putAll(this.y);
        return hashMap;
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        if (200 != u82Var.a) {
            return new xp2(new z3(f4.e, u82Var));
        }
        s80 s80Var = (s80) this.x.a(u82Var);
        return s80Var != null ? new xp2(s80Var, b11.a(u82Var)) : new xp2(new z3(f4.c, u82Var));
    }
}
