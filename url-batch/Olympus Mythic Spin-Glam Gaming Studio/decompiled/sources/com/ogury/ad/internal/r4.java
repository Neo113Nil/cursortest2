package com.ogury.ad.internal;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class r4 extends k2 {
    public final r0 a;

    public r4(Context context, r0 app, h2 coreWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(coreWrapper, "coreWrapper");
        this.a = app;
    }

    @Override // com.ogury.ad.internal.k2, com.ogury.core.internal.network.HeadersLoader
    @NotNull
    public Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("Device-OS", "android");
        loadHeaders.put("User-Agent", this.a.e());
        String packageName = this.a.a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        loadHeaders.put("Package-Name", packageName);
        return loadHeaders;
    }
}
