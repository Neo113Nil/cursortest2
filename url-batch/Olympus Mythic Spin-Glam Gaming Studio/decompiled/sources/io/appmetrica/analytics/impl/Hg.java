package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class Hg implements H {
    public final String a;
    public final Ig b;

    public Hg(@NonNull String str) {
        this(str, new Ig());
    }

    @Override // io.appmetrica.analytics.impl.H
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(context, new C5671se());
    }

    public final AdTrackingInfoResult b(Context context) {
        int i = AdvIdentifiersProvider.$r8$clinit;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.a);
        Ig ig = this.b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        ig.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = L5.a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.INSTANCE.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public Hg(String str, Ig ig) {
        this.a = str;
        this.b = ig;
    }

    @Override // io.appmetrica.analytics.impl.H
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Ui ui) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            C5241bo c5241bo = (C5241bo) ui;
            c5241bo.c = 0;
            adTrackingInfoResult = null;
            while (c5241bo.b()) {
                try {
                    return b(context);
                } catch (InvocationTargetException e) {
                    String message = e.getTargetException() != null ? e.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((C5241bo) ui).b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((C5241bo) ui).b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
