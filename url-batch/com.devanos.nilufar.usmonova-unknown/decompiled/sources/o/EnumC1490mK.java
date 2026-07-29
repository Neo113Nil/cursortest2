package o;

/* renamed from: o.mK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1490mK implements InterfaceC1854rt {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    public final int h;

    EnumC1490mK(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
