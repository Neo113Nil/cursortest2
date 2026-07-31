package com.apollographql.apollo.network.websocket.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscribableWebSocket.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "", "<init>", "(Ljava/lang/String;I)V", "AwaitOpen", "AwaitAck", "Connected", "ShutDown", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SocketState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SocketState[] $VALUES;
    public static final SocketState AwaitOpen = new SocketState("AwaitOpen", 0);
    public static final SocketState AwaitAck = new SocketState("AwaitAck", 1);
    public static final SocketState Connected = new SocketState("Connected", 2);
    public static final SocketState ShutDown = new SocketState("ShutDown", 3);

    private static final /* synthetic */ SocketState[] $values() {
        return new SocketState[]{AwaitOpen, AwaitAck, Connected, ShutDown};
    }

    public static EnumEntries<SocketState> getEntries() {
        return $ENTRIES;
    }

    private SocketState(String str, int i) {
    }

    static {
        SocketState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SocketState valueOf(String str) {
        return (SocketState) Enum.valueOf(SocketState.class, str);
    }

    public static SocketState[] values() {
        return (SocketState[]) $VALUES.clone();
    }
}
