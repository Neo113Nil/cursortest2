package yads;

import kotlin.collections.MapsKt;

/* loaded from: classes15.dex */
public abstract class jo2 {
    public static final io2 a(io2 io2Var, io2 io2Var2) {
        if (io2Var2 == null) {
            return new io2(io2Var.a, io2Var.b);
        }
        c cVar = io2Var.b;
        if (cVar == null) {
            cVar = io2Var2.b;
        }
        return new io2(MapsKt.plus(io2Var.a, io2Var2.a), cVar);
    }
}
