package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzoi {
    private zzok zzc;
    private zznd zzb = zznd.zza;
    final zzoh zza = zzoh.zza;

    public final zzoi zzb(zznd zzndVar) {
        this.zzb = zzndVar;
        return this;
    }

    public final zzoi zzc(zzng[] zzngVarArr) {
        this.zzc = new zzok(zzngVarArr);
        return this;
    }

    public final zzou zzd() {
        if (this.zzc == null) {
            this.zzc = new zzok(new zzng[0]);
        }
        return new zzou(this, null);
    }
}
