package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.Du, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101Du extends CancellationException {
    public final transient C0283Ku h;

    public C0101Du(String str, Throwable th, C0283Ku c0283Ku) {
        super(str);
        this.h = c0283Ku;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0101Du)) {
            return false;
        }
        C0101Du c0101Du = (C0101Du) obj;
        return AbstractC0048Bt.h(c0101Du.getMessage(), getMessage()) && AbstractC0048Bt.h(c0101Du.h, this.h) && AbstractC0048Bt.h(c0101Du.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0048Bt.k(message);
        int hashCode = (this.h.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.h;
    }
}
