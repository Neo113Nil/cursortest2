package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* compiled from: ByteReadChannel.kt */
/* loaded from: classes10.dex */
public interface ByteReadChannel {
    public static final Companion Companion = Companion.$$INSTANCE;

    Object awaitContent(int i, Continuation continuation);

    void cancel(Throwable th);

    Throwable getClosedCause();

    Source getReadBuffer();

    boolean isClosedForRead();

    /* compiled from: ByteReadChannel.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitContent$default(ByteReadChannel byteReadChannel, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return byteReadChannel.awaitContent(i, continuation);
        }
    }

    /* compiled from: ByteReadChannel.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ByteReadChannel Empty = new ByteReadChannel() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$1
            private final Throwable closedCause;
            private final Source readBuffer = new Buffer();

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public void cancel(Throwable th) {
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public boolean isClosedForRead() {
                return true;
            }

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public Throwable getClosedCause() {
                return this.closedCause;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public Source getReadBuffer() {
                return this.readBuffer;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public Object awaitContent(int i, Continuation continuation) {
                return Boxing.boxBoolean(false);
            }
        };

        private Companion() {
        }

        public final ByteReadChannel getEmpty() {
            return Empty;
        }
    }
}
