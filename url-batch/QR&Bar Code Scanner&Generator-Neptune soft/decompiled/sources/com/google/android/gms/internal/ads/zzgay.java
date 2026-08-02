package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgay implements zzgba {
    final /* synthetic */ zzgfr zza;

    zzgay(zzgfr zzgfrVar) {
        this.zza = zzgfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzgaw(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zzb() {
        zzgfr zzgfrVar = this.zza;
        return new zzgaw(zzgfrVar, zzgfrVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final Set zze() {
        return this.zza.zzl();
    }
}
