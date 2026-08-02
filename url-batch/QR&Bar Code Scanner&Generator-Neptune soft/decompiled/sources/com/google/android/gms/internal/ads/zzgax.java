package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgax implements zzgba {
    final /* synthetic */ zzgau zza;

    zzgax(zzgau zzgauVar) {
        this.zza = zzgauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zza(Class cls) throws GeneralSecurityException {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgau zzb() {
        return this.zza;
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
        return Collections.singleton(this.zza.zzc());
    }
}
