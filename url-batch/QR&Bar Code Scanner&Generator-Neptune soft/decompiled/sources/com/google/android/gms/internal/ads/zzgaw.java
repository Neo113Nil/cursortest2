package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
class zzgaw implements zzgau {
    private final zzgfr zza;
    private final Class zzb;

    public zzgaw(zzgfr zzgfrVar, Class cls) {
        if (!zzgfrVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgfrVar.toString(), cls.getName()));
        }
        this.zza = zzgfrVar;
        this.zzb = cls;
    }

    private final zzgav zzg() {
        return new zzgav(this.zza.zza());
    }

    private final Object zzh(zzgso zzgsoVar) throws GeneralSecurityException {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zzd(zzgsoVar);
        return this.zza.zzk(zzgsoVar, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final zzglx zza(zzgpw zzgpwVar) throws GeneralSecurityException {
        try {
            zzgso zza = zzg().zza(zzgpwVar);
            zzglw zza2 = zzglx.zza();
            zza2.zza(this.zza.zzc());
            zza2.zzb(zza.zzat());
            zza2.zzc(this.zza.zzf());
            return (zzglx) zza2.zzam();
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final zzgso zzb(zzgpw zzgpwVar) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgpwVar);
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final Object zzd(zzgpw zzgpwVar) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzb(zzgpwVar));
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final Object zze(zzgso zzgsoVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzj().getName()));
        if (this.zza.zzj().isInstance(zzgsoVar)) {
            return zzh(zzgsoVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final String zzf() {
        return this.zza.zzc();
    }
}
