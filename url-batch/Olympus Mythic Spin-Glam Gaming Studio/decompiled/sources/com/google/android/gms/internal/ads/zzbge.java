package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzbge implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbfw zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbgg zze;

    zzbge(zzbgg zzbggVar, final zzbfw zzbfwVar, final WebView webView, final boolean z) {
        this.zzb = zzbfwVar;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzbggVar);
        this.zze = zzbggVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbgd
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                zzbge.this.zze.zzd(zzbfwVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
