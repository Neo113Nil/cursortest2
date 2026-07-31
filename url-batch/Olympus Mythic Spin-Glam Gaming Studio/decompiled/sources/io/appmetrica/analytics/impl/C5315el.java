package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5315el extends BaseProtobufStateSerializer {
    @NotNull
    public final C5264cl a() {
        return new C5264cl();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final MessageNano defaultValue() {
        return new C5264cl();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5264cl toState(@NotNull byte[] bArr) {
        return (C5264cl) MessageNano.mergeFrom(new C5264cl(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C5264cl();
    }
}
