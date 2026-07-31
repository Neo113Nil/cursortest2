package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes6.dex */
public abstract class j83 extends co {
    public final v3 w;
    public final Object x;
    public final hp2 y;
    public final mt1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(Context context, v3 v3Var, int i, String str, bo boVar, Object obj, hp2 hp2Var, wo2 wo2Var, mt1 mt1Var) {
        super(context, i, str, boVar, wo2Var);
        Integer num;
        vw2 vw2Var;
        od odVar = new od(context);
        l8 l8Var = new l8();
        this.w = v3Var;
        this.x = obj;
        this.y = hp2Var;
        this.z = mt1Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        this.o = l8Var.a(context, (a == null || (num = a.x0) == null) ? d11.a : num.intValue());
        this.n = true;
        this.m = true;
        ho2 a2 = hp2Var.a(obj);
        mt1Var.a(a2);
        String str2 = a2.a;
        fo2 fo2Var = fo2.j;
        if (Intrinsics.areEqual(str2, "ad_request")) {
            odVar.a(fo2Var, a2.b, null, null);
        }
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        try {
            int i = u82Var.a;
            xp2 a = a(u82Var, i);
            a(u82Var, a, i);
            return a;
        } catch (Throwable th) {
            this.z.reportError("Failed to parse network response", th);
            return new xp2(new z3(f4.p));
        }
    }

    public abstract xp2 a(u82 u82Var, int i);

    @Override // yads.ro2
    public Map d() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(this.w.b.a.c);
        return MapsKt.build(createMapBuilder);
    }

    @Override // yads.co, yads.ro2
    public hm3 a(hm3 hm3Var) {
        try {
            u82 u82Var = hm3Var.b;
            this.z.a(this.y.a(null, u82Var != null ? u82Var.a : -1, this.x, hm3Var));
            return hm3Var;
        } catch (Throwable th) {
            this.z.reportError("Failed to parse network error", th);
            return new z3(f4.p);
        }
    }

    public final void a(u82 u82Var, xp2 xp2Var, int i) {
        ho2 a = this.y.a(xp2Var, i, this.x, null);
        Map map = a.b;
        Map map2 = TypeIntrinsics.isMutableMap(map) ? map : null;
        if (map2 == null) {
            map2 = new LinkedHashMap();
        }
        String b = xz0.b(u82Var.c, a11.q);
        if (b != null) {
            map2.put("server_log_id", b);
        }
        Map map3 = u82Var.c;
        if (map3 != null) {
            u8.a(map3);
        }
        this.z.a(a);
    }
}
