package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: Channel.kt */
/* loaded from: classes12.dex */
public interface ReceiveChannel {
    void cancel(CancellationException cancellationException);

    ChannelIterator iterator();

    Object receive(Continuation continuation);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo8214receiveCatchingJP2dKIU(Continuation continuation);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo8215tryReceivePtdJZtk();
}
