package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbbj implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbbb zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbl zze;

    zzbbj(zzbbl zzbblVar, final zzbbb zzbbbVar, final WebView webView, final boolean z) {
        this.zze = zzbblVar;
        this.zzb = zzbbbVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbi
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbbj zzbbjVar = zzbbj.this;
                zzbbb zzbbbVar2 = zzbbbVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzbbjVar.zze.zzd(zzbbbVar2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
