package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcnu {
    private final zzcnl zza;
    private final zzeaj zzb;

    zzcnu(zzcnl zzcnlVar, zzeaj zzeajVar) {
        this.zza = zzcnlVar;
        this.zzb = zzeajVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpJ)).booleanValue()) {
            Executor executor = zzcgj.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpL)).booleanValue()) {
                zzcnt zzcntVar = new zzcnt(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpN)).intValue(), null);
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpM)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcntVar);
            }
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcnu.this.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpK)).booleanValue()) {
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            zzeai zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpQ)).booleanValue()) {
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcnu.this.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcnp(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ zzeaj zzd() {
        return this.zzb;
    }
}
