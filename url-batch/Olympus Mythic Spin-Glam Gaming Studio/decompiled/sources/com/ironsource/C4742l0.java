package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi33Ext5Impl$$ExternalSyntheticApiModelOutline0;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi33Ext5Impl$$ExternalSyntheticApiModelOutline1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4742l0 {

    @NotNull
    public static final C4742l0 a = new C4742l0();

    private C4742l0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        } catch (Exception e) {
            C4782n4.d().a(e);
            return 0;
        }
    }

    public static /* synthetic */ void b() {
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30 || a() < 4) {
            return null;
        }
        try {
            return MeasurementManagerApi33Ext5Impl$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(MeasurementManagerApi33Ext5Impl$$ExternalSyntheticApiModelOutline0.m()));
        } catch (Exception unused) {
            return null;
        }
    }
}
