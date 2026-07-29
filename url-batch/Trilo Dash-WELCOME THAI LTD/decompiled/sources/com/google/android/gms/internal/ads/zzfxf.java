package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfxf implements zzfxh {
    final /* synthetic */ zzgas zza;
    final /* synthetic */ zzgar zzb;

    zzfxf(zzgas zzgasVar, zzgar zzgarVar) {
        this.zza = zzgasVar;
        this.zzb = zzgarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxc(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zzb() {
        zzgas zzgasVar = this.zza;
        return new zzfxc(zzgasVar, this.zzb, zzgasVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Set zze() {
        return this.zza.zzl();
    }
}
