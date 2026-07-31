package io.ktor.utils.io.jvm.javaio;

import com.inmobi.media.core.config.models.AdConfig;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Job;

/* compiled from: Blocking.kt */
/* loaded from: classes13.dex */
public abstract class BlockingKt {
    public static final InputStream toInputStream(final ByteReadChannel byteReadChannel, Job job) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return new InputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1
            @Override // java.io.InputStream
            public int read() {
                if (ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                if (ByteReadChannel.this.getReadBuffer().exhausted()) {
                    blockingWait();
                }
                if (ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                return ByteReadChannel.this.getReadBuffer().readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }

            @Override // java.io.InputStream
            public int read(byte[] b, int i, int i2) {
                Intrinsics.checkNotNullParameter(b, "b");
                if (ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                if (ByteReadChannel.this.getReadBuffer().exhausted()) {
                    blockingWait();
                }
                int readAtMostTo = ByteReadChannel.this.getReadBuffer().readAtMostTo(b, i, Math.min(ByteReadChannelOperationsKt.getAvailableForRead(ByteReadChannel.this), i2) + i);
                return readAtMostTo >= 0 ? readAtMostTo : ByteReadChannel.this.isClosedForRead() ? -1 : 0;
            }

            private final void blockingWait() {
                BuildersKt__BuildersKt.runBlocking$default(null, new BlockingKt$toInputStream$1$blockingWait$1(ByteReadChannel.this, null), 1, null);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ByteReadChannelKt.cancel(ByteReadChannel.this);
            }
        };
    }
}
