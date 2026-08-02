package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgcg extends zzgfr {
    zzgcg() {
        super(zzgig.class, new zzgce(zzgak.class));
    }

    static /* bridge */ /* synthetic */ zzgfp zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgio zzc = zzgip.zzc();
        zzgir zzc2 = zzgis.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgis) zzc2.zzam());
        zzc.zza(i);
        zzgip zzgipVar = (zzgip) zzc.zzam();
        zzglc zzc3 = zzgld.zzc();
        zzglf zzc4 = zzglg.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzglg) zzc4.zzam());
        zzc3.zza(32);
        zzgld zzgldVar = (zzgld) zzc3.zzam();
        zzgii zza = zzgij.zza();
        zza.zza(zzgipVar);
        zza.zzb(zzgldVar);
        return new zzgfp((zzgij) zza.zzam(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final zzgfq zza() {
        return new zzgcf(this, zzgij.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgig.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgig zzgigVar = (zzgig) zzgsoVar;
        zzgoz.zzb(zzgigVar.zza(), 0);
        new zzgcj();
        zzgcj.zzh(zzgigVar.zzf());
        new zzghd();
        zzghd.zzh(zzgigVar.zzg());
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
