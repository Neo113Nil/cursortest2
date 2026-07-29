package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbhf extends zzgkk implements zzglz {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzbhf() {
        super(r0);
        zzbhg zzbhgVar;
        zzbhgVar = zzbhg.zzb;
    }

    public final zzbhf zza(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbhg.zzd((zzbhg) this.zza, z);
        return this;
    }

    public final zzbhf zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbhg.zze((zzbhg) this.zza, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbhg) this.zza).zzf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzbhf(zzbds zzbdsVar) {
        super(r1);
        zzbhg zzbhgVar;
        zzbhgVar = zzbhg.zzb;
    }
}
