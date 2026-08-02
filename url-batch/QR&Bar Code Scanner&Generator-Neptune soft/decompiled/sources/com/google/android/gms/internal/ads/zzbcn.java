package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbcn implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbcf zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbcp zze;

    zzbcn(zzbcp zzbcpVar, final zzbcf zzbcfVar, final WebView webView, final boolean z) {
        this.zze = zzbcpVar;
        this.zzb = zzbcfVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbcm
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbcn zzbcnVar = zzbcn.this;
                zzbcf zzbcfVar2 = zzbcfVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzbcnVar.zze.zzd(zzbcfVar2, webView2, (String) obj, z2);
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
