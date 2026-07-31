package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ByteChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class ByteChannel$readBuffer$1 extends FunctionReferenceImpl implements Function1 {
    public static final ByteChannel$readBuffer$1 INSTANCE = new ByteChannel$readBuffer$1();

    ByteChannel$readBuffer$1() {
        super(1, ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClosedReadChannelException invoke(Throwable th) {
        return new ClosedReadChannelException(th);
    }
}
