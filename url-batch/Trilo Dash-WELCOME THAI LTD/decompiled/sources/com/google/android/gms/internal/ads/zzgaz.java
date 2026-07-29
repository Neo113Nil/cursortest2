package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgaz extends zzgar {
    public zzgaz() {
        super(zzgek.class, new zzgax(zzfwv.class));
    }

    public static final void zzh(zzgek zzgekVar) throws GeneralSecurityException {
        zzgik.zzb(zzgekVar.zza(), 0);
        if (zzgekVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzn(zzgekVar.zzg());
    }

    static /* bridge */ /* synthetic */ zzgao zzm(int i, int i2, int i3, int i4) {
        zzgem zzc = zzgen.zzc();
        zzgep zzc2 = zzgeq.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzgeq) zzc2.zzaj());
        zzc.zza(i);
        return new zzgao((zzgen) zzc.zzaj(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgeq zzgeqVar) throws GeneralSecurityException {
        if (zzgeqVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzgeqVar.zzg() - 2;
        if (zzg == 1) {
            if (zzgeqVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 2) {
            if (zzgeqVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 3) {
            if (zzgeqVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzgeqVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (zzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzgeqVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgay(this, zzgen.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgek.zzf(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzh((zzgek) zzglyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
