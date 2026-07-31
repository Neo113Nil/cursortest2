package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CloseToken.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public /* synthetic */ class CloseToken$wrapCause$1 extends FunctionReferenceImpl implements Function1 {
    public static final CloseToken$wrapCause$1 INSTANCE = new CloseToken$wrapCause$1();

    CloseToken$wrapCause$1() {
        super(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClosedByteChannelException invoke(Throwable th) {
        return new ClosedByteChannelException(th);
    }
}
