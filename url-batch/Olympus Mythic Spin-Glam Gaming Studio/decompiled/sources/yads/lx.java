package yads;

import com.ironsource.X3;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public final class lx {
    public final cq2 a;
    public final k8 b;
    public final ty c;

    public lx() {
        cq2 cq2Var = new cq2();
        k8 k8Var = new k8();
        ty tyVar = new ty();
        this.a = cq2Var;
        this.b = k8Var;
        this.c = tyVar;
    }

    public final io2 a(v3 v3Var, t8 t8Var) {
        io2 b = this.a.b(v3Var, t8Var);
        io2 a = this.b.a(v3Var.e);
        this.c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = v3Var.n;
        linkedHashMap.put(X3.i.n, i != 1 ? i != 2 ? "undefined" : "landscape" : "portrait");
        io2 a2 = jo2.a(b, a);
        c cVar = a2.b;
        return new io2(MapsKt.plus(a2.a, linkedHashMap), cVar != null ? cVar : null);
    }
}
