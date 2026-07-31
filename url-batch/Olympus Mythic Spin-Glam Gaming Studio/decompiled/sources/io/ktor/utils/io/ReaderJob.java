package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ByteReadChannelOperations.kt */
/* loaded from: classes15.dex */
public final class ReaderJob implements ChannelJob {
    private final ByteWriteChannel channel;
    private final Job job;

    public ReaderJob(ByteWriteChannel channel, Job job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.channel = channel;
        this.job = job;
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public Job getJob() {
        return this.job;
    }
}
