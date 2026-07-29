package o;

/* loaded from: classes.dex */
public enum WK implements InterfaceC1854rt {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final int h;

    WK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
