package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzff implements zzew {
    private zzfz zzb;
    private String zzc;
    private boolean zzf;
    private final zzft zza = new zzft();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzff zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzff zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzff zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzff zze(zzfz zzfzVar) {
        this.zzb = zzfzVar;
        return this;
    }

    public final zzff zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzfk zza() {
        zzfk zzfkVar = new zzfk(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzfz zzfzVar = this.zzb;
        if (zzfzVar != null) {
            zzfkVar.zzf(zzfzVar);
        }
        return zzfkVar;
    }
}
