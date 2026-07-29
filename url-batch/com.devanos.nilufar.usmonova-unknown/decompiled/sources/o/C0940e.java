package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940e extends CancellationException {
    public final transient Object h;

    public C0940e(InterfaceC2309ym interfaceC2309ym) {
        super("Flow was aborted, no more elements needed");
        this.h = interfaceC2309ym;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
