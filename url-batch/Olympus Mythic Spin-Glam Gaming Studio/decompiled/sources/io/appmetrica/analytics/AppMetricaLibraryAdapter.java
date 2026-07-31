package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C5243c0;
import io.appmetrica.analytics.impl.C5269d0;
import io.appmetrica.analytics.impl.C5661s4;
import io.appmetrica.analytics.impl.H0;
import io.appmetrica.analytics.impl.Xb;
import io.appmetrica.analytics.impl.Yb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes6.dex */
public class AppMetricaLibraryAdapter {
    private static H0 a = new H0();

    public static void activate(@NonNull Context context) {
        H0 h0 = a;
        if (!h0.a.a.a(context).a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Yb yb = h0.b;
        Context applicationContext = context.getApplicationContext();
        yb.getClass();
        C5661s4.l().g.a(applicationContext);
        C5661s4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        H0 h0 = a;
        if (h0.a.c.a((Void) null).a) {
            h0.b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    @VisibleForTesting
    public static void setProxy(@NonNull H0 h0) {
        a = h0;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        H0 h0 = a;
        h0.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Xb xb = h0.a;
        if (xb.g.a(str).a && xb.a.a(context).a) {
            h0.b.getClass();
            C5661s4.l().g.a(context);
            C5269d0 b = C5661s4.l().b();
            b.c.a().executeDelayed(new C5243c0(b, context), b.d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        H0 h0 = a;
        Xb xb = h0.a;
        if (xb.a.a(context).a && xb.b.a(appMetricaLibraryAdapterConfig).a) {
            Yb yb = h0.b;
            Context applicationContext = context.getApplicationContext();
            yb.getClass();
            C5661s4.l().g.a(applicationContext);
            C5661s4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
