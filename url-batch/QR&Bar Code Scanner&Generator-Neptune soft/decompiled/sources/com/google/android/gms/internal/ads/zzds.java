package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzds {
    public final Object zza;
    private zzy zzb = new zzy();
    private boolean zzc;
    private boolean zzd;

    public zzds(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzds) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdq zzdqVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzdqVar.zza(this.zza);
    }

    public final void zzb(zzdr zzdrVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzaa zzb = this.zzb.zzb();
        this.zzb = new zzy();
        this.zzc = false;
        zzdrVar.zza(this.zza, zzb);
    }

    public final void zzc(zzdr zzdrVar) {
        this.zzd = true;
        if (this.zzc) {
            zzdrVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
