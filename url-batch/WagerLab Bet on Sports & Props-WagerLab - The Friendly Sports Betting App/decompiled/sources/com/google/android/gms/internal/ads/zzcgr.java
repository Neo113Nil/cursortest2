package com.google.android.gms.internal.ads;

import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcgr {
    private final zzcgj zza;
    private final zzdsm zzb;

    zzcgr(zzcgj zzcgjVar, zzdsm zzdsmVar) {
        this.zza = zzcgjVar;
        this.zzb = zzdsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzox)).booleanValue()) {
            Executor executor = zzbzh.zza;
            final ?? r2 = 0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoA)).booleanValue()) {
                zzcgq zzcgqVar = new zzcgq(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoC)).intValue(), null);
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoB)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcgqVar);
                r2 = executor;
            }
            final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            WebViewCompat.WebViewStartUpCallback webViewStartUpCallback = new WebViewCompat.WebViewStartUpCallback() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final /* synthetic */ void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                    zzcgr.this.zzb(elapsedRealtime, r2, webViewStartUpResult);
                }
            };
            this.zza.zzd(executor, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoz)).booleanValue(), webViewStartUpCallback);
        }
    }

    final /* synthetic */ void zzb(long j, ThreadPoolExecutor threadPoolExecutor, WebViewStartUpResult webViewStartUpResult) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoy)).booleanValue()) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
            zzdsl zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length());
            sb.append(elapsedRealtime);
            zza.zzc("webview_startup_l", sb.toString());
            Long totalTimeInUiThreadMillis = webViewStartUpResult.getTotalTimeInUiThreadMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(totalTimeInUiThreadMillis).length());
            sb2.append(totalTimeInUiThreadMillis);
            zza.zzc("webview_startup_uil", sb2.toString());
            zza.zzd();
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoF)).booleanValue()) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgr.this.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzf(new zzcgm(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ zzdsm zzd() {
        return this.zzb;
    }
}
