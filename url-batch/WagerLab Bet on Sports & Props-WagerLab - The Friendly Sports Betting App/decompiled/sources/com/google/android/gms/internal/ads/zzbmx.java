package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbmx implements Runnable {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzbmk zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnp zze;

    zzbmx(zzbnp zzbnpVar, zzbno zzbnoVar, zzbmk zzbmkVar, ArrayList arrayList, long j) {
        this.zza = zzbnoVar;
        this.zzb = zzbmkVar;
        this.zzc = arrayList;
        this.zzd = j;
        Objects.requireNonNull(zzbnpVar);
        this.zze = zzbnpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbnp zzbnpVar = this.zze;
        synchronized (zzbnpVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            zzbno zzbnoVar = this.zza;
            if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzij)).booleanValue()) {
                    zzbnoVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    zzbnoVar.zzg();
                }
                zzgpd zzgpdVar = zzbzh.zzf;
                final zzbmk zzbmkVar = this.zzb;
                Objects.requireNonNull(zzbmkVar);
                zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbmk.this.zzj();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzd));
                int zzi = zzbnoVar.zzi();
                int zzj = zzbnpVar.zzj();
                ArrayList arrayList = this.zzc;
                if (arrayList.isEmpty()) {
                    sb = ". Still waiting for the engine to be loaded";
                } else {
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 88);
                    sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                    sb2.append(valueOf2);
                    sb = sb2.toString();
                }
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 107 + String.valueOf(zzi).length() + 36 + String.valueOf(zzj).length() + sb.length() + 39 + String.valueOf(currentTimeMillis).length() + 26);
                sb3.append("Could not finish the full JS engine loading in ");
                sb3.append(valueOf);
                sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                sb3.append(zzi);
                sb3.append(". Update status(fullLoadTimeout) is ");
                sb3.append(zzj);
                sb3.append(sb);
                sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                sb3.append(currentTimeMillis);
                sb3.append(" ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
