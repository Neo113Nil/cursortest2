package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class l extends Lambda implements Function0 {
    public final /* synthetic */ r a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, long j, long j2) {
        super(0);
        this.a = rVar;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        com.vungle.ads.internal.ui.z zVar = this.a.d;
        long j = this.b;
        long j2 = this.c;
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j + '-' + j2 + ')');
        }
        return Unit.INSTANCE;
    }
}
