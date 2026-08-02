package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgss implements zzgth {
    private final zzgso zza;
    private final zzgty zzb;
    private final boolean zzc;
    private final zzgqr zzd;

    private zzgss(zzgty zzgtyVar, zzgqr zzgqrVar, zzgso zzgsoVar) {
        this.zzb = zzgtyVar;
        this.zzc = zzgqrVar.zzh(zzgsoVar);
        this.zzd = zzgqrVar;
        this.zza = zzgsoVar;
    }

    static zzgss zzc(zzgty zzgtyVar, zzgqr zzgqrVar, zzgso zzgsoVar) {
        return new zzgss(zzgtyVar, zzgqrVar, zzgsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final int zza(Object obj) {
        zzgty zzgtyVar = this.zzb;
        int zzb = zzgtyVar.zzb(zzgtyVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final Object zze() {
        return this.zza.zzaM().zzao();
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzg(Object obj, Object obj2) {
        zzgtj.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgtj.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzh(Object obj, zzgsz zzgszVar, zzgqq zzgqqVar) throws IOException {
        boolean zzO;
        zzgty zzgtyVar = this.zzb;
        zzgqr zzgqrVar = this.zzd;
        Object zzc = zzgtyVar.zzc(obj);
        zzgqv zzb = zzgqrVar.zzb(obj);
        while (zzgszVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgszVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgqrVar.zzc(zzgqqVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgqrVar.zzf(zzgszVar, zzc2, zzgqqVar, zzb);
                        } else {
                            zzO = zzgtyVar.zzp(zzc, zzgszVar);
                        }
                    } else {
                        zzO = zzgszVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj2 = null;
                    zzgpw zzgpwVar = null;
                    while (zzgszVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgszVar.zzd();
                        if (zzd2 == 16) {
                            i = zzgszVar.zzj();
                            obj2 = zzgqrVar.zzc(zzgqqVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgqrVar.zzf(zzgszVar, obj2, zzgqqVar, zzb);
                            } else {
                                zzgpwVar = zzgszVar.zzp();
                            }
                        } else if (!zzgszVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgszVar.zzd() != 12) {
                        throw zzgrq.zzb();
                    }
                    if (zzgpwVar != null) {
                        if (obj2 != null) {
                            zzgqrVar.zzg(zzgpwVar, obj2, zzgqqVar, zzb);
                        } else {
                            zzgtyVar.zzk(zzc, i, zzgpwVar);
                        }
                    }
                }
            } finally {
                zzgtyVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgpi zzgpiVar) throws IOException {
        zzgre zzgreVar = (zzgre) obj;
        if (zzgreVar.zzc == zzgtz.zzc()) {
            zzgreVar.zzc = zzgtz.zze();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzn(Object obj, zzgqm zzgqmVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
