package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhs {
    public final String zza;
    public final zzu zzb;
    public final zzu zzc;
    public final int zzd;
    public final int zze;

    public zzhs(String str, zzu zzuVar, zzu zzuVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            i2 = i2 == 0 ? 0 : i2;
            zzghc.zza(z);
            zzghc.zza(true ^ TextUtils.isEmpty(str));
            this.zza = str;
            this.zzb = zzuVar;
            zzuVar2.getClass();
            this.zzc = zzuVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzghc.zza(z);
        zzghc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzuVar;
        zzuVar2.getClass();
        this.zzc = zzuVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zzd == zzhsVar.zzd && this.zze == zzhsVar.zze && this.zza.equals(zzhsVar.zza) && this.zzb.equals(zzhsVar.zzb) && this.zzc.equals(zzhsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
