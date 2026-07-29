package o;

/* renamed from: o.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049fd extends IllegalStateException {
    public final String h;

    public C1049fd(String str) {
        this.h = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.h;
    }
}
