package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5477l2 extends BaseProtobufStateSerializer {
    @NonNull
    public final C5451k2 a() {
        return new C5451k2();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final MessageNano defaultValue() {
        return new C5451k2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5451k2 toState(@NonNull byte[] bArr) throws IOException {
        return (C5451k2) MessageNano.mergeFrom(new C5451k2(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C5451k2();
    }
}
