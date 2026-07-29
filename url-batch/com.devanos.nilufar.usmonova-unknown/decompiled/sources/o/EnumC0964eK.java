package o;

/* renamed from: o.eK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0964eK implements InterfaceC1854rt {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);

    public final int h;

    EnumC0964eK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
