package com.apollographql.apollo.network.ws;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.apollographql.apollo.api.http.HttpHeader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: WebSocketEngine.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H¦@¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "url", "", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocketEngine {
    Object open(String str, List<HttpHeader> list, Continuation<? super WebSocketConnection> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object open$default(WebSocketEngine webSocketEngine, String str, List list, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return webSocketEngine.open(str, list, continuation);
    }
}
