package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.internal.config.RemoteScreenshotConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class J implements Converter {
    public final V a;

    /* JADX WARN: Multi-variable type inference failed */
    public J() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull RemoteScreenshotConfig remoteScreenshotConfig) {
        O o = new O();
        o.a = remoteScreenshotConfig.getEnabled();
        T config = remoteScreenshotConfig.getConfig();
        o.b = config != null ? this.a.fromModel(config) : null;
        return o;
    }

    public J(@NotNull V v) {
        this.a = v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ J(V v, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v);
        if ((i & 1) != 0) {
            v = new V(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteScreenshotConfig toModel(@NotNull O o) {
        return new RemoteScreenshotConfig(o.a, this.a.toModel(o.b));
    }
}
