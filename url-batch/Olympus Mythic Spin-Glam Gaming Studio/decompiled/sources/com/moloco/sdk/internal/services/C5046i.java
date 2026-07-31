package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.services.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5046i implements y {
    public static final int c = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final Lazy b;

    public C5046i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.services.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(C5046i.a(C5046i.this));
            }
        });
    }

    public static final boolean a(C5046i c5046i) {
        return c5046i.a.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    @Override // com.moloco.sdk.internal.services.y
    @NotNull
    public x b() {
        String str;
        String str2 = Build.MANUFACTURER;
        String str3 = str2 == null ? "" : str2;
        String str4 = Build.MODEL;
        String str5 = str4 == null ? "" : str4;
        String str6 = Build.HARDWARE;
        String str7 = str6 == null ? "" : str6;
        boolean e = e();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        int i = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.a, TelephonyManager.class);
        if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
            str = "";
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        String str8 = str6 == null ? "" : str6;
        String str9 = Build.BRAND;
        return new x(str3, str5, str7, e, "android", RELEASE, i, language, str, f, currentTimeMillis, str8, str9 == null ? "" : str9);
    }

    @Override // com.moloco.sdk.internal.services.y
    @NotNull
    public String c() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.y
    @Nullable
    public String d() {
        Object systemService = this.a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.y
    @Deprecated
    @NotNull
    public x invoke() {
        return b();
    }

    @Override // com.moloco.sdk.internal.services.y
    @Nullable
    public Boolean a() {
        try {
            Object systemService = this.a.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            return null;
        }
    }
}
