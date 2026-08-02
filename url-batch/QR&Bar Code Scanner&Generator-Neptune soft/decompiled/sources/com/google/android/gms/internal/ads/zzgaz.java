package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgaz implements zzgba {
    final /* synthetic */ zzggg zza;
    final /* synthetic */ zzgfr zzb;

    zzgaz(zzggg zzgggVar, zzgfr zzgfrVar) {
        this.zza = zzgggVar;
        this.zzb = zzgfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzgbw(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zzb() {
        zzggg zzgggVar = this.zza;
        return new zzgbw(zzgggVar, this.zzb, zzgggVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Set zze() {
        return this.zza.zzl();
    }
}
