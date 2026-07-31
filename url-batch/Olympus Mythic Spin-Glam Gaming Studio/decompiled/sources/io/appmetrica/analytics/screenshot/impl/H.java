package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.screenshot.internal.config.RemoteScreenshotConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class H implements Converter {
    public final J a;

    /* JADX WARN: Multi-variable type inference failed */
    public H() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull RemoteScreenshotConfig remoteScreenshotConfig) {
        return MessageNano.toByteArray(this.a.fromModel(remoteScreenshotConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((RemoteScreenshotConfig) obj));
    }

    public H(@NotNull J j) {
        this.a = j;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteScreenshotConfig toModel(@NotNull byte[] bArr) {
        O o;
        try {
            o = (O) MessageNano.mergeFrom(new O(), bArr);
        } catch (Throwable unused) {
            o = new O();
        }
        return this.a.toModel(o);
    }

    public /* synthetic */ H(J j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new J(null, 1, null) : j);
    }
}
