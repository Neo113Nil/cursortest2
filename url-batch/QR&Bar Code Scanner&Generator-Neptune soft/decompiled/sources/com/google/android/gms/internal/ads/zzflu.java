package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzflu implements Runnable {
    final /* synthetic */ zzflv zza;
    private final WebView zzb;

    zzflu(zzflv zzflvVar) {
        WebView webView;
        this.zza = zzflvVar;
        webView = zzflvVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
