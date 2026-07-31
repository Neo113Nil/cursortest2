package com.apollographql.apollo.network.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DataClientMessage;", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "data", "", "<init>", "([B)V", "getData", "()[B", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataClientMessage implements ClientMessage {
    private final byte[] data;

    public DataClientMessage(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final byte[] getData() {
        return this.data;
    }
}
