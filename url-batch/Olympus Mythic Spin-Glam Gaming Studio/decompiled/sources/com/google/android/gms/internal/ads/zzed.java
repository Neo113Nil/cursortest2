package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzed {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    public zzed(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzed.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzed) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzeb zzebVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzebVar.zza(this.zza);
    }

    public final void zzb(zzec zzecVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzc = this.zzb.zzc();
        this.zzb = new zzr();
        this.zzc = false;
        zzecVar.zza(this.zza, zzc);
    }

    final /* synthetic */ void zzc(zzec zzecVar) {
        this.zzd = true;
        if (zzecVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzecVar.zza(this.zza, this.zzb.zzc());
    }
}
