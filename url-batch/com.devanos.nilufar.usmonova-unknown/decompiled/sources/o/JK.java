package o;

/* loaded from: classes.dex */
public enum JK implements InterfaceC1854rt {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);

    public final int h;

    JK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
