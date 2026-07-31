package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5186d implements Converter {
    public final C5187e a;

    public C5186d(@NotNull C5187e c5187e) {
        this.a = c5187e;
    }

    @NotNull
    public final byte[] a(@NotNull IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull byte[] bArr) {
        return this.a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
