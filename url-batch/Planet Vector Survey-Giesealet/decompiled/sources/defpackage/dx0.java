package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dx0 {
    public final xq a;
    public final boolean b;
    public final Map c;

    public /* synthetic */ dx0(xq xqVar, ch0 ch0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : xqVar, (i & 8) != 0 ? null : ch0Var, (i & 16) == 0, (i & 32) != 0 ? xp.d : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0)) {
            return false;
        }
        dx0 dx0Var = (dx0) obj;
        return nz.l(this.a, dx0Var.a) && nz.l(null, null) && this.b == dx0Var.b && nz.l(this.c, dx0Var.c);
    }

    public final int hashCode() {
        xq xqVar = this.a;
        return this.c.hashCode() + ((((((xqVar == null ? 0 : xqVar.hashCode()) * 29791) + 0) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.b + ", effectsMap=" + this.c + ')';
    }

    public dx0(xq xqVar, ch0 ch0Var, boolean z, Map map) {
        this.a = xqVar;
        this.b = z;
        this.c = map;
    }
}
