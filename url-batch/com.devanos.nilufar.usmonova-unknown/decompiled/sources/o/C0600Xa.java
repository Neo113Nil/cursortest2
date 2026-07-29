package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.Xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600Xa extends CancellationException {
    public final /* synthetic */ int h = 1;

    public /* synthetic */ C0600Xa(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.h) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    public C0600Xa() {
        super("The coroutine scope left the composition");
    }
}
