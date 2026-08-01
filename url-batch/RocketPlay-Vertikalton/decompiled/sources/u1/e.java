package u1;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Z0.i f4181a;

    public e(Z0.i iVar) {
        this.f4181a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f4181a.toString();
    }
}
