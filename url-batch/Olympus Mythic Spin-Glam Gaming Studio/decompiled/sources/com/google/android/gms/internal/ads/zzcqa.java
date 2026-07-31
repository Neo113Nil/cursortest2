package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcqa {
    private zzcod zza;
    private zzcqx zzb;
    private zzfqm zzc;
    private zzcrl zzd;
    private zzfmz zze;

    private zzcqa() {
        throw null;
    }

    /* synthetic */ zzcqa(byte[] bArr) {
    }

    public final zzcqa zza(zzcod zzcodVar) {
        this.zza = zzcodVar;
        return this;
    }

    public final zzcqa zzb(zzcqx zzcqxVar) {
        this.zzb = zzcqxVar;
        return this;
    }

    public final zzcob zzc() {
        zzioe.zzc(this.zza, zzcod.class);
        zzioe.zzc(this.zzb, zzcqx.class);
        if (this.zzc == null) {
            this.zzc = new zzfqm();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrl();
        }
        if (this.zze == null) {
            this.zze = new zzfmz();
        }
        return new zzcpp(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
