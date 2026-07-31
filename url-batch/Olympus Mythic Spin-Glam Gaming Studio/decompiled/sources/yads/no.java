package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public abstract class no extends j83 {
    public final uy2 A;
    public final qy2 B;
    public final rc3 C;

    public no(Context context, v3 v3Var, mt1 mt1Var, String str, qm3 qm3Var, Object obj, hp2 hp2Var, dd3 dd3Var, uy2 uy2Var, qy2 qy2Var, rc3 rc3Var) {
        super(context, v3Var, 0, str, qm3Var, obj, hp2Var, dd3Var, mt1Var);
        this.A = uy2Var;
        this.B = qy2Var;
        this.C = rc3Var;
        boolean z = ob1.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    @Override // yads.j83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xp2 a(u82 u82Var, int i) {
        byte[] bArr;
        nc3 nc3Var;
        ic3 a;
        String b;
        if (200 != i || (bArr = u82Var.b) == null || bArr.length == 0) {
            int i2 = z3.d;
            return new xp2(new hm3(g4.a(null, y3.a(u82Var).c).b));
        }
        Map map = u82Var.c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        this.B.a(map, true);
        rc3 rc3Var = this.C;
        nm3 nm3Var = rc3Var.a;
        nm3Var.a.getClass();
        int i3 = u82Var.a;
        zp2 zp2Var = new zp2(u82Var.b);
        Map map2 = u82Var.c;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        String a2 = nm3Var.b.a(new yp2(i3, zp2Var, map2));
        Map map3 = u82Var.c;
        if (map3 == null) {
            map3 = MapsKt.emptyMap();
        }
        dm dmVar = new dm(map3);
        wz0 wz0Var = rc3Var.c;
        Map map4 = u82Var.c;
        if (map4 == null) {
            map4 = MapsKt.emptyMap();
        }
        wz0Var.getClass();
        String b2 = xz0.b(map4, a11.L);
        Map a3 = b2 != null ? td.a(b2) : null;
        ArrayList d = xz0.d(map4, a11.m);
        c a4 = u8.a(map4);
        if (a2 != null && a2.length() != 0) {
            try {
                a = rc3Var.b.a(a2, dmVar);
            } catch (Exception unused) {
            }
            if (a != null) {
                Map map5 = u82Var.c;
                boolean z = false;
                if (map5 != null && (b = xz0.b(map5, a11.B)) != null) {
                    z = Boolean.parseBoolean(b);
                }
                String str = null;
                nc3Var = new nc3(a, str, d, a4, a3);
                return nc3Var == null ? !nc3Var.a.b.isEmpty() ? new xp2(nc3Var, null) : new xp2(new em0()) : new xp2(new zb2("Can't parse VAST response."));
            }
        }
        nc3Var = null;
        if (nc3Var == null) {
        }
    }

    @Override // yads.j83, yads.ro2
    public final Map d() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        String a = this.A.a();
        if (a != null) {
            boolean z = ob1.a;
        }
        createMapBuilder.putAll(super.d());
        return MapsKt.build(createMapBuilder);
    }
}
