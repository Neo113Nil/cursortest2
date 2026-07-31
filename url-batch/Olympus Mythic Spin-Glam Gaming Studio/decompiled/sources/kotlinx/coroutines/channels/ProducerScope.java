package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: Produce.kt */
/* loaded from: classes6.dex */
public interface ProducerScope extends CoroutineScope, SendChannel {
    SendChannel getChannel();
}
