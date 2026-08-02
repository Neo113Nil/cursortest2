package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgcj extends zzgfr {
    zzgcj() {
        super(zzgim.class, new zzgch(zzgor.class));
    }

    public static final void zzh(zzgim zzgimVar) throws GeneralSecurityException {
        zzgoz.zzb(zzgimVar.zza(), 0);
        zzgoz.zza(zzgimVar.zzh().zzd());
        zzm(zzgimVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgis zzgisVar) throws GeneralSecurityException {
        if (zzgisVar.zza() < 12 || zzgisVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgci(this, zzgip.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgim.zzf(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzh((zzgim) zzgsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzf() {
        return 3;
    }
}
