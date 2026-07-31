package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes10.dex */
public final class Hb implements Converter {
    public final C5385hd a;

    public Hb() {
        this(new C5385hd(new C5447jo()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull C5421io c5421io) {
        return MessageNano.toByteArray((MessageNano) this.a.a.fromModel(c5421io));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hb(C5385hd c5385hd) {
        this.a = c5385hd;
    }

    @NonNull
    public final C5421io a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
