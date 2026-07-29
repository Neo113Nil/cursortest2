package o;

import java.util.HashMap;

/* renamed from: o.El, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118El extends C2088vP {
    public final HashMap l = new HashMap();

    @Override // o.C2088vP
    public final C1890sP j(Object obj) {
        return (C1890sP) this.l.get(obj);
    }

    @Override // o.C2088vP
    public final Object k(Object obj) {
        Object k = super.k(obj);
        this.l.remove(obj);
        return k;
    }
}
