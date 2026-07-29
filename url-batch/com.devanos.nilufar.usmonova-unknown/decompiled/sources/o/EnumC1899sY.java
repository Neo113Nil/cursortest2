package o;

/* renamed from: o.sY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1899sY {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(C1639ob.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(C1639ob.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(C1639ob.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(C1639ob.e("kotlin/ULong", false));

    public final C1639ob h;
    public final C0827cE i;
    public final C1639ob j;

    EnumC1899sY(C1639ob c1639ob) {
        this.h = c1639ob;
        C0827cE i = c1639ob.i();
        AbstractC0048Bt.m(i, "classId.shortClassName");
        this.i = i;
        this.j = new C1639ob(c1639ob.g(), C0827cE.e(i.b() + "Array"));
    }
}
