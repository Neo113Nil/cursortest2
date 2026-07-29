package o;

/* renamed from: o.ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1843ri extends RuntimeException {
    public final transient InterfaceC0189He h;

    public C1843ri(InterfaceC0189He interfaceC0189He) {
        this.h = interfaceC0189He;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.h.toString();
    }
}
