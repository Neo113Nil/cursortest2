package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfxe implements zzfxh {
    final /* synthetic */ zzgar zza;

    zzfxe(zzgar zzgarVar) {
        this.zza = zzgarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwo(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zzb() {
        zzgar zzgarVar = this.zza;
        return new zzfwo(zzgarVar, zzgarVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Set zze() {
        return this.zza.zzl();
    }
}
