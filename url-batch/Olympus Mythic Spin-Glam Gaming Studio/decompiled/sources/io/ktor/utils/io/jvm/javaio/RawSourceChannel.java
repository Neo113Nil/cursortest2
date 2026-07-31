package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;
import kotlinx.io.Source;

/* compiled from: Reading.kt */
/* loaded from: classes12.dex */
public final class RawSourceChannel implements ByteReadChannel {
    private final Buffer buffer;
    private CloseToken closedToken;
    private final CoroutineContext coroutineContext;
    private final CompletableJob job;
    private final CoroutineContext parent;
    private final RawSource source;

    public RawSourceChannel(RawSource source, CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.source = source;
        this.parent = parent;
        this.buffer = new Buffer();
        CompletableJob Job = JobKt.Job((Job) parent.get(Job.Key));
        this.job = Job;
        this.coroutineContext = parent.plus(Job).plus(new CoroutineName("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.exhausted();
    }

    public final CompletableJob getJob() {
        return this.job;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Source getReadBuffer() {
        return this.buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitContent(int i, Continuation continuation) {
        RawSourceChannel$awaitContent$1 rawSourceChannel$awaitContent$1;
        int i2;
        if (continuation instanceof RawSourceChannel$awaitContent$1) {
            rawSourceChannel$awaitContent$1 = (RawSourceChannel$awaitContent$1) continuation;
            int i3 = rawSourceChannel$awaitContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rawSourceChannel$awaitContent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rawSourceChannel$awaitContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = rawSourceChannel$awaitContent$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.closedToken != null) {
                        return Boxing.boxBoolean(true);
                    }
                    CoroutineContext coroutineContext = this.coroutineContext;
                    RawSourceChannel$awaitContent$2 rawSourceChannel$awaitContent$2 = new RawSourceChannel$awaitContent$2(this, i, null);
                    rawSourceChannel$awaitContent$1.I$0 = i;
                    rawSourceChannel$awaitContent$1.label = 1;
                    if (BuildersKt.withContext(coroutineContext, rawSourceChannel$awaitContent$2, rawSourceChannel$awaitContent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = rawSourceChannel$awaitContent$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
            }
        }
        rawSourceChannel$awaitContent$1 = new RawSourceChannel$awaitContent$1(this, continuation);
        Object obj2 = rawSourceChannel$awaitContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = rawSourceChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable th) {
        String str;
        String message;
        if (this.closedToken != null) {
            return;
        }
        CompletableJob completableJob = this.job;
        String str2 = "Channel was cancelled";
        if (th == null || (str = th.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        JobKt.cancel(completableJob, str, th);
        this.source.close();
        if (th != null && (message = th.getMessage()) != null) {
            str2 = message;
        }
        this.closedToken = new CloseToken(new IOException(str2, th));
    }
}
