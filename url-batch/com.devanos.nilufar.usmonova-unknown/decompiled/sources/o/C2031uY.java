package o;

/* renamed from: o.uY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031uY extends UnsupportedOperationException {
    public final C0300Ll h;

    public C2031uY(C0300Ll c0300Ll) {
        this.h = c0300Ll;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.h));
    }
}
