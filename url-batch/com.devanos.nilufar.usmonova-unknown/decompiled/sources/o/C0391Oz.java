package o;

/* renamed from: o.Oz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391Oz {
    public EnumC0080Cz a;
    public InterfaceC0288Kz b;

    public final void a(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        EnumC0080Cz a = enumC0054Bz.a();
        EnumC0080Cz enumC0080Cz = this.a;
        AbstractC0048Bt.n(enumC0080Cz, "state1");
        if (a.compareTo(enumC0080Cz) < 0) {
            enumC0080Cz = a;
        }
        this.a = enumC0080Cz;
        this.b.j(interfaceC0365Nz, enumC0054Bz);
        this.a = a;
    }
}
