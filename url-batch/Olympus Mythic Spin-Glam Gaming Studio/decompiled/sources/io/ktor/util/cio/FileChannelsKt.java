package io.ktor.util.cio;

import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: FileChannels.kt */
/* loaded from: classes14.dex */
public abstract class FileChannelsKt {
    public static /* synthetic */ ByteWriteChannel writeChannel$default(File file, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return writeChannel(file, coroutineContext);
    }

    public static final ByteWriteChannel writeChannel(File file, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return ByteReadChannelOperationsKt.reader((CoroutineScope) GlobalScope.INSTANCE, new CoroutineName("file-writer").plus(coroutineContext), true, (Function2) new FileChannelsKt$writeChannel$1(file, null)).getChannel();
    }
}
