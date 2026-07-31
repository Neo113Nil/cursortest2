package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5223b6 extends BaseRequestConfig.DataSource {

    @NonNull
    public final C5783wm a;

    @NonNull
    public final SdkEnvironmentProvider b;

    public C5223b6(@NonNull C5783wm c5783wm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c5783wm.c(), c5783wm.a(), c5783wm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.a = c5783wm;
        this.b = sdkEnvironmentProvider;
    }
}
