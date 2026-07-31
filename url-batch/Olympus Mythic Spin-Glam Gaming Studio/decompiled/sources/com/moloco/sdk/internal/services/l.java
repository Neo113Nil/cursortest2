package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class l implements InterfaceC5048k {
    public static final int c = 8;

    @NotNull
    public final Context a;

    @Nullable
    public C5047j b;

    public l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5048k
    @NotNull
    public C5047j invoke() {
        Object m8023constructorimpl;
        C5047j c5047j = this.b;
        if (c5047j != null) {
            return c5047j;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.a;
            String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo a = m.a(this.a);
            String packageName = a.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String versionName = a.versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            C5047j c5047j2 = new C5047j(obj, packageName, versionName);
            this.b = c5047j2;
            m8023constructorimpl = Result.m8023constructorimpl(c5047j2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        C5047j c5047j3 = (C5047j) m8023constructorimpl;
        return c5047j3 == null ? new C5047j("", "", "") : c5047j3;
    }
}
