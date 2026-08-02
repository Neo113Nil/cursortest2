package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghd extends zzgfr {
    public zzghd() {
        super(zzgla.class, new zzghb(zzgbj.class));
    }

    public static final void zzh(zzgla zzglaVar) throws GeneralSecurityException {
        zzgoz.zzb(zzglaVar.zza(), 0);
        if (zzglaVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzn(zzglaVar.zzg());
    }

    static /* bridge */ /* synthetic */ zzgfp zzm(int i, int i2, int i3, int i4) {
        zzglc zzc = zzgld.zzc();
        zzglf zzc2 = zzglg.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzglg) zzc2.zzam());
        zzc.zza(i);
        return new zzgfp((zzgld) zzc.zzam(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzglg zzglgVar) throws GeneralSecurityException {
        if (zzglgVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzglgVar.zzg() - 2;
        if (zzg == 1) {
            if (zzglgVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 2) {
            if (zzglgVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 3) {
            if (zzglgVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzglgVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (zzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzglgVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzghc(this, zzgld.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgla.zzf(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzh((zzgla) zzgsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
