package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v1 {
    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        Intrinsics.checkNotNullParameter(context, "context");
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator == null) {
            synchronized (this) {
                serviceLocator = ServiceLocator.INSTANCE;
                if (serviceLocator == null) {
                    serviceLocator = new ServiceLocator(context, 0);
                    ServiceLocator.INSTANCE = serviceLocator;
                }
            }
        }
        return serviceLocator;
    }
}
