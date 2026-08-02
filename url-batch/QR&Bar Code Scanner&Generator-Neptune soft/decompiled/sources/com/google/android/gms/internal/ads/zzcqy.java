package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcqy {
    private zzcop zza;
    private zzcsl zzb;
    private zzfil zzc;
    private zzcsy zzd;
    private zzfff zze;

    private zzcqy() {
    }

    /* synthetic */ zzcqy(zzcqx zzcqxVar) {
    }

    public final zzcom zza() {
        zzgxq.zzc(this.zza, zzcop.class);
        zzgxq.zzc(this.zzb, zzcsl.class);
        if (this.zzc == null) {
            this.zzc = new zzfil();
        }
        if (this.zzd == null) {
            this.zzd = new zzcsy();
        }
        if (this.zze == null) {
            this.zze = new zzfff();
        }
        return new zzcpw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcqy zzb(zzcop zzcopVar) {
        this.zza = zzcopVar;
        return this;
    }

    public final zzcqy zzc(zzcsl zzcslVar) {
        this.zzb = zzcslVar;
        return this;
    }
}
