package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes13.dex */
public class Y3 {
    public final Wf a;
    public final CounterConfiguration b;

    public Y3(Wf wf, CounterConfiguration counterConfiguration) {
        this.a = wf;
        this.b = counterConfiguration;
    }

    @Nullable
    public static Y3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Wf wf;
        CounterConfiguration fromBundle;
        String str = Wf.c;
        if (bundle != null) {
            try {
                wf = (Wf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && wf != null && context.getPackageName().equals(wf.a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && wf.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new Y3(wf, fromBundle);
            }
            return null;
        }
        wf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.a + ", mCounterConfiguration=" + this.b + '}';
    }

    @NonNull
    public final Wf a() {
        return this.a;
    }
}
