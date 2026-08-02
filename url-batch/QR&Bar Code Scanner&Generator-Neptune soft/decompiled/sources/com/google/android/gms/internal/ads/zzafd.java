package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzafd implements zzafa {
    private final zzef zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzafd(zzaew zzaewVar) {
        zzef zzefVar = zzaewVar.zza;
        this.zza = zzefVar;
        zzefVar.zzF(12);
        this.zzc = zzefVar.zzn() & 255;
        this.zzb = zzefVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzk();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzk = this.zza.zzk();
        this.zze = zzk;
        return (zzk & 240) >> 4;
    }
}
