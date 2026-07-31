package com.apollographql.apollo.network.ws;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.ByteString;

/* compiled from: WebSocketEngine.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "", "receive", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "", "data", "Lokio/ByteString;", TypedValues.Custom.S_STRING, "close", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketConnection {
    void close();

    Object receive(Continuation<? super String> continuation);

    void send(String string);

    void send(ByteString data);
}
