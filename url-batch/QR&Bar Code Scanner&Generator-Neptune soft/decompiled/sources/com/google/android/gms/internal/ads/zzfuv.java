package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfuv extends zzfuj {
    final /* synthetic */ zzfux zza;
    private final Object zzb;
    private int zzc;

    zzfuv(zzfux zzfuxVar, int i) {
        this.zza = zzfuxVar;
        this.zzb = zzfux.zzg(zzfuxVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzv;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfss.zza(this.zzb, zzfux.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuj, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfux.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfuj, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzfux.zzj(this.zza, i);
        zzfux.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
