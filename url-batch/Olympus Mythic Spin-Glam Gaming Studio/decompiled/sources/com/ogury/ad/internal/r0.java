package com.ogury.ad.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import java.util.MissingResourceException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r0 {
    public final Context a;
    public final ke b;

    public r0(Context context) {
        ke profigDao = ke.d.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(profigDao, "profigDao");
        this.a = context;
        this.b = profigDao;
    }

    public final boolean b() {
        return this.a.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public final int d() {
        try {
            return this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).targetSdkVersion;
        } catch (Exception unused) {
            return 21;
        }
    }

    public final String e() {
        return "5.2.2/" + this.b.a() + "/" + Build.VERSION.RELEASE;
    }

    public final String f() {
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.a);
        Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "getDefaultUserAgent(...)");
        return defaultUserAgent;
    }

    public final String a() {
        try {
            String country = this.a.getResources().getConfiguration().getLocales().get(0).getCountry();
            Intrinsics.checkNotNull(country);
            return country;
        } catch (MissingResourceException unused) {
            return "ZZ";
        }
    }

    public final String c() {
        String language = this.a.getResources().getConfiguration().getLocales().get(0).getLanguage();
        Intrinsics.checkNotNull(language);
        return language;
    }
}
