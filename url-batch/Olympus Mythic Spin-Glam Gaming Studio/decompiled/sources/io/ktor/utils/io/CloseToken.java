package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;
import kotlinx.coroutines.ExceptionsKt;

/* compiled from: CloseToken.kt */
/* loaded from: classes11.dex */
public final class CloseToken {
    private final Throwable origin;

    public CloseToken(Throwable th) {
        this.origin = th;
    }

    public static /* synthetic */ Throwable wrapCause$default(CloseToken closeToken, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = CloseToken$wrapCause$1.INSTANCE;
        }
        return closeToken.wrapCause(function1);
    }

    public final Throwable wrapCause(Function1 wrap) {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Object obj = this.origin;
        if (obj == null) {
            return null;
        }
        return obj instanceof CopyableThrowable ? ((CopyableThrowable) obj).createCopy() : obj instanceof CancellationException ? ExceptionsKt.CancellationException(((CancellationException) obj).getMessage(), this.origin) : (Throwable) wrap.invoke(obj);
    }

    public final Unit throwOrNull(Function1 wrap) {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Throwable wrapCause = wrapCause(wrap);
        if (wrapCause == null) {
            return null;
        }
        throw wrapCause;
    }
}
