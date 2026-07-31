package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.screenshot.internal.config.ParcelableRemoteScreenshotConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5871h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ParcelableRemoteScreenshotConfig fromBundle(@NotNull Bundle bundle) {
        bundle.setClassLoader(ParcelableRemoteScreenshotConfig.class.getClassLoader());
        ParcelableRemoteScreenshotConfig parcelableRemoteScreenshotConfig = (ParcelableRemoteScreenshotConfig) bundle.getParcelable("config");
        return parcelableRemoteScreenshotConfig == null ? new ParcelableRemoteScreenshotConfig() : parcelableRemoteScreenshotConfig;
    }
}
