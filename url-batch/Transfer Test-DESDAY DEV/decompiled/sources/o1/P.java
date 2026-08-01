package o1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class P extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient W f3291a;

    public P(String str, Throwable th, W w2) {
        super(str);
        this.f3291a = w2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof P) {
                P p2 = (P) obj;
                if (!g1.f.a(p2.getMessage(), getMessage()) || !g1.f.a(p2.f3291a, this.f3291a) || !g1.f.a(p2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        g1.f.b(message);
        int hashCode = (this.f3291a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3291a;
    }
}
