package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzxo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzxo(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzxo(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzxo(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxo)) {
            return false;
        }
        zzxo zzxoVar = (zzxo) obj;
        return zzc(zzxoVar) && this.zze == zzxoVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzxo zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzxo(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public final boolean zzc(zzxo zzxoVar) {
        if (zzxoVar == null) {
            return false;
        }
        if (this == zzxoVar) {
            return true;
        }
        return this.zza.equals(zzxoVar.zza) && this.zzb == zzxoVar.zzb && this.zzc == zzxoVar.zzc && this.zzd == zzxoVar.zzd;
    }

    public zzxo(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
