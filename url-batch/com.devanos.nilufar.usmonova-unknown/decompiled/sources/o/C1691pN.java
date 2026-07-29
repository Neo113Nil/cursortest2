package o;

/* renamed from: o.pN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691pN extends EnumC1822rN {
    public C1691pN() {
        super("HTML", 1);
    }

    @Override // o.EnumC1822rN
    public final String a(String str) {
        AbstractC0048Bt.n(str, "string");
        return AbstractC0778bU.z(AbstractC0778bU.z(str, "<", "&lt;"), ">", "&gt;");
    }
}
