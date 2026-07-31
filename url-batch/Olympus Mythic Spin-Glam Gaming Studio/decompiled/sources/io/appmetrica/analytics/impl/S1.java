package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S1 {
    public final C5771wa a;
    public boolean b;

    public S1() {
        this(new C5771wa());
    }

    public final synchronized long a(Context context) {
        String a;
        try {
            this.a.getClass();
            a = AbstractC5409ib.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a) ? 0L : new JSONObject(a).optLong(POBCTAOverlayData.KEY_CTA_DELAY);
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.b) {
            return;
        }
        long a = a(context);
        if (a > 0) {
            try {
                Thread.sleep(a);
            } catch (Throwable unused) {
            }
        }
        this.b = true;
    }

    public S1(C5771wa c5771wa) {
        this.b = false;
        this.a = c5771wa;
    }
}
