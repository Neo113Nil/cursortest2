package yads;

import java.util.Map;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class xx0 {
    public final CoroutineScope a;
    public final Map b;
    public final td0 c;
    public final ki2 d;
    public final v0 e;

    public xx0(CoroutineScope coroutineScope, Map map) {
        td0 td0Var = td0.a;
        ki2 ki2Var = new ki2();
        if (v0.d == null) {
            synchronized (v0.c) {
                try {
                    if (v0.d == null) {
                        v0.d = new v0();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v0 v0Var = v0.d;
        if (v0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = coroutineScope;
        this.b = map;
        this.c = td0Var;
        this.d = ki2Var;
        this.e = v0Var;
    }
}
