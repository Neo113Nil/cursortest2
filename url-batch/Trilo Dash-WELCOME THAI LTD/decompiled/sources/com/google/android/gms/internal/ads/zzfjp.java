package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfjp implements Runnable {
    final /* synthetic */ zzfjq zza;
    private final WebView zzb;

    zzfjp(zzfjq zzfjqVar) {
        WebView webView;
        this.zza = zzfjqVar;
        webView = zzfjqVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
