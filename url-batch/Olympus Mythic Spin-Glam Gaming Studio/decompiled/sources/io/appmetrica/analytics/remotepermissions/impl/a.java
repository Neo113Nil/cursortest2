package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.remotepermissions.internal.config.FeatureConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class a implements Converter {
    public final b a = new b();

    @NotNull
    public final byte[] a(@NotNull FeatureConfig featureConfig) {
        return MessageNano.toByteArray(this.a.fromModel(featureConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((FeatureConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FeatureConfig toModel(@NotNull byte[] bArr) {
        return this.a.toModel((e) MessageNano.mergeFrom(new e(), bArr));
    }
}
