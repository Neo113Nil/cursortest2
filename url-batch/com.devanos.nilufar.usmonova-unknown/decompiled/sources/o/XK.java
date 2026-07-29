package o;

/* loaded from: classes.dex */
public enum XK implements InterfaceC1854rt {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    public final int h;

    XK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
