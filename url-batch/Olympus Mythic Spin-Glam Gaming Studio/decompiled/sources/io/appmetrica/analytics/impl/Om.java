package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class Om extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nm defaultValue() {
        Nm nm = new Nm();
        nm.i = new Im();
        return nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nm toState(@NonNull byte[] bArr) throws IOException {
        return (Nm) MessageNano.mergeFrom(new Nm(), bArr);
    }
}
