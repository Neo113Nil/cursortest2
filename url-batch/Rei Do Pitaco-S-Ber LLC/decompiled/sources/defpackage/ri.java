package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ri extends q00 {
    public final HashMap j = new HashMap();

    @Override // defpackage.q00
    public final n00 a(Object obj) {
        return (n00) this.j.get(obj);
    }

    @Override // defpackage.q00
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
