package o;

/* loaded from: classes.dex */
public enum EK implements InterfaceC1854rt {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);

    public final int h;

    EK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
