package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzk {
    public static final zzk zza = new zzk(0, 0, 1, 1, 0, null);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zze
    };
    public final int zzc = 1;
    private zzi zzd;

    /* synthetic */ zzk(int i, int i2, int i3, int i4, int i5, zzj zzjVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final zzi zza() {
        if (this.zzd == null) {
            this.zzd = new zzi(this, null);
        }
        return this.zzd;
    }
}
