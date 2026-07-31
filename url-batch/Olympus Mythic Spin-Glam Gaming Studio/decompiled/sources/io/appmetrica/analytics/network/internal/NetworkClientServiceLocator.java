package io.appmetrica.analytics.network.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes12.dex */
public class NetworkClientServiceLocator {
    private static volatile NetworkClientServiceLocator b;
    private final Bundle a;

    NetworkClientServiceLocator(Bundle bundle) {
        this.a = bundle;
    }

    @NonNull
    public static NetworkClientServiceLocator getInstance() {
        return b;
    }

    @AnyThread
    public static void init(@NonNull Context context) {
        init(context, new SafePackageManager());
    }

    @Nullable
    public Bundle getApplicationMetaData() {
        return this.a;
    }

    @AnyThread
    public static void init(@NonNull Context context, @NonNull SafePackageManager safePackageManager) {
        if (b == null) {
            synchronized (NetworkClientServiceLocator.class) {
                try {
                    if (b == null) {
                        b = new NetworkClientServiceLocator(safePackageManager.getApplicationMetaData(context));
                    }
                } finally {
                }
            }
        }
    }
}
