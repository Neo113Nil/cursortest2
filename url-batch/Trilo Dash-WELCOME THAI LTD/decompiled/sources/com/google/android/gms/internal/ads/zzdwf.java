package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdwf {
    final /* synthetic */ zzdwg zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdwf(zzdwg zzdwgVar) {
        this.zza = zzdwgVar;
    }

    static /* bridge */ /* synthetic */ zzdwf zza(zzdwf zzdwfVar) {
        zzdwfVar.zzb.putAll(zzdwfVar.zza.zzc);
        return zzdwfVar;
    }

    public final zzdwf zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdwf zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdwf zzd(zzfbg zzfbgVar) {
        this.zzb.put("aai", zzfbgVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            zzc("rid", zzfbgVar.zzap);
        }
        return this;
    }

    public final zzdwf zze(zzfbj zzfbjVar) {
        this.zzb.put("gqi", zzfbjVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // java.lang.Runnable
            public final void run() {
                zzdwf.this.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // java.lang.Runnable
            public final void run() {
                zzdwf.this.zzj();
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
