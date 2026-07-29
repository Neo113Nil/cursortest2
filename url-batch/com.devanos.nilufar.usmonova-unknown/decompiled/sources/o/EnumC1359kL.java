package o;

/* renamed from: o.kL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1359kL {
    i("http/1.0"),
    j("http/1.1"),
    k("spdy/3.1"),
    l("h2"),
    m("h2_prior_knowledge"),
    n("quic");

    public final String h;

    EnumC1359kL(String str) {
        this.h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
