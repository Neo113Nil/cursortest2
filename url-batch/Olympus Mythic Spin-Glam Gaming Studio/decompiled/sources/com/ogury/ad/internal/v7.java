package com.ogury.ad.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v7 {
    public final v6 a;
    public final ui b;
    public final y1 c;
    public final le d;
    public final Context e;

    public v7(Context context) {
        v6 mraidCacheStore = v6.a;
        ui webViewLoader = new ui();
        y1 chromeVersionHelper = new y1();
        le profigGateway = le.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidCacheStore, "mraidCacheStore");
        Intrinsics.checkNotNullParameter(webViewLoader, "webViewLoader");
        Intrinsics.checkNotNullParameter(chromeVersionHelper, "chromeVersionHelper");
        Intrinsics.checkNotNullParameter(profigGateway, "profigGateway");
        this.a = mraidCacheStore;
        this.b = webViewLoader;
        this.c = chromeVersionHelper;
        this.d = profigGateway;
        this.e = context.getApplicationContext();
    }
}
