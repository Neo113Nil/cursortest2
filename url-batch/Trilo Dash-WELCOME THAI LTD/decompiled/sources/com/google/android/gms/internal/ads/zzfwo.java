package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
class zzfwo implements zzfwm {
    private final zzgar zza;
    private final Class zzb;

    public zzfwo(zzgar zzgarVar, Class cls) {
        if (!zzgarVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgarVar.toString(), cls.getName()));
        }
        this.zza = zzgarVar;
        this.zzb = cls;
    }

    private final zzfwn zzg() {
        return new zzfwn(this.zza.zza());
    }

    private final Object zzh(zzgly zzglyVar) throws GeneralSecurityException {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zzd(zzglyVar);
        return this.zza.zzk(zzglyVar, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final zzgfh zza(zzgjg zzgjgVar) throws GeneralSecurityException {
        try {
            zzgly zza = zzg().zza(zzgjgVar);
            zzgfg zza2 = zzgfh.zza();
            zza2.zza(this.zza.zzc());
            zza2.zzb(zza.zzaq());
            zza2.zzc(this.zza.zzf());
            return (zzgfh) zza2.zzaj();
        } catch (zzgla e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final zzgly zzb(zzgjg zzgjgVar) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgjgVar);
        } catch (zzgla e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final Object zzd(zzgjg zzgjgVar) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzb(zzgjgVar));
        } catch (zzgla e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final Object zze(zzgly zzglyVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzj().getName()));
        if (this.zza.zzj().isInstance(zzglyVar)) {
            return zzh(zzglyVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final String zzf() {
        return this.zza.zzc();
    }
}
