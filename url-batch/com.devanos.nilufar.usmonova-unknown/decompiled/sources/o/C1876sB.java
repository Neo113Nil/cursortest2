package o;

/* renamed from: o.sB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876sB implements DC {
    public DC[] a;

    @Override // o.DC
    public final C2018uL a(Class cls) {
        for (DC dc : this.a) {
            if (dc.b(cls)) {
                return dc.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // o.DC
    public final boolean b(Class cls) {
        for (DC dc : this.a) {
            if (dc.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
