package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdxp {
    final /* synthetic */ zzdxq zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdxp(zzdxq zzdxqVar) {
        this.zza = zzdxqVar;
    }

    static /* bridge */ /* synthetic */ zzdxp zza(zzdxp zzdxpVar) {
        zzdxpVar.zzb.putAll(zzdxpVar.zza.zzc);
        return zzdxpVar;
    }

    public final zzdxp zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdxp zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdxp zzd(zzfdk zzfdkVar) {
        this.zzb.put("aai", zzfdkVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgd)).booleanValue()) {
            zzc("rid", zzfdkVar.zzap);
        }
        return this;
    }

    public final zzdxp zze(zzfdn zzfdnVar) {
        this.zzb.put("gqi", zzfdnVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // java.lang.Runnable
            public final void run() {
                zzdxp.this.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // java.lang.Runnable
            public final void run() {
                zzdxp.this.zzj();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
