package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import kotlin.Metadata;
import okio.Buffer;

/* compiled from: ClientMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toClientMessage", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClientMessageKt {
    public static final ClientMessage toClientMessage(Object obj) {
        Buffer buffer = new Buffer();
        JsonWriters.writeAny(new BufferedSinkJsonWriter(buffer, null), obj);
        return new TextClientMessage(buffer.readUtf8());
    }
}
