package o;

/* renamed from: o.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518mm extends AbstractC1584nm {
    public final InterfaceC1854rt[] c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1518mm(int i, InterfaceC1854rt[] interfaceC1854rtArr) {
        super(i, r1);
        if (interfaceC1854rtArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = interfaceC1854rtArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC1854rtArr.getClass());
        }
        this.c = interfaceC1854rtArr;
    }

    public final Object c(int i) {
        int i2 = (1 << this.b) - 1;
        int i3 = this.a;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC1854rt interfaceC1854rt : this.c) {
            if (interfaceC1854rt.getNumber() == i4) {
                return interfaceC1854rt;
            }
        }
        return null;
    }
}
