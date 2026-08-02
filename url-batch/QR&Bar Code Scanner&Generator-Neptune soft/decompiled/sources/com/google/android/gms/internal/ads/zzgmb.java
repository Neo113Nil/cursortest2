package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmb extends zzgra implements zzgsp {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgmb() {
        super(r0);
        zzgmc zzgmcVar;
        zzgmcVar = zzgmc.zzb;
    }

    public final zzgmb zza(String str) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        zzgmc.zzg((zzgmc) this.zza, str);
        return this;
    }

    public final zzgmb zzb(zzgpw zzgpwVar) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        ((zzgmc) this.zza).zzf = zzgpwVar;
        return this;
    }

    public final zzgmb zzc(int i) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        ((zzgmc) this.zza).zzg = zzgnd.zza(i);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzgmb(zzgma zzgmaVar) {
        super(r1);
        zzgmc zzgmcVar;
        zzgmcVar = zzgmc.zzb;
    }
}
