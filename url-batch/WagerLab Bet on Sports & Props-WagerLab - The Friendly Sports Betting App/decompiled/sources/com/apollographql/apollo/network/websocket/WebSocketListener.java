package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.exception.ApolloException;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import kotlin.Metadata;

/* compiled from: WebSocketEngine.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J!\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "", "onOpen", "", "onMessage", "text", "", "data", "", "onError", "cause", "Lcom/apollographql/apollo/exception/ApolloException;", "onClosed", UniversalFirebaseFunctionsModule.CODE_KEY, "", "reason", "(Ljava/lang/Integer;Ljava/lang/String;)V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketListener {
    void onClosed(Integer code, String reason);

    void onError(ApolloException cause);

    void onMessage(String text);

    void onMessage(byte[] data);

    void onOpen();
}
