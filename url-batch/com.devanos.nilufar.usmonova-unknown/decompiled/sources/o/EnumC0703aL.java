package o;

/* renamed from: o.aL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0703aL implements InterfaceC1854rt {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public final int h;

    EnumC0703aL(int i2) {
        this.h = i2;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
