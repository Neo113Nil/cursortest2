package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzco {
    private static final zznp zza = zzb();

    public static /* synthetic */ zzba zza(zzgb zzgbVar) {
        return zzik.zza() ? zzik.zza(zzgbVar) : zzaak.zza(zzgbVar);
    }

    public static /* synthetic */ zzba zza(zzej zzejVar) {
        if (zzhh.zzb()) {
            return zzhh.zza(zzejVar);
        }
        return zzzc.zza(zzejVar);
    }

    public static zzbb zza() throws GeneralSecurityException {
        if (zziv.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zza;
    }

    private static zznp zzb() {
        try {
            zzpy zza2 = zzpw.zza();
            zzcx.zza(zza2);
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcn
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzzk.zza((zzdd) zzbiVar);
                }
            }, zzdd.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcq
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzyy.zza((zzds) zzbiVar);
                }
            }, zzds.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcp
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzip.zza((zzdz) zzbiVar);
                }
            }, zzdz.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcs
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzyw.zza((zzdl) zzbiVar);
                }
            }, zzdl.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcr
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzco.zza((zzej) zzbiVar);
                }
            }, zzej.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcu
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzco.zza((zzgb) zzbiVar);
                }
            }, zzgb.class, zzba.class));
            zza2.zza(zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzct
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
                public final Object zza(zzbi zzbiVar) {
                    return zzib.zza((zzfw) zzbiVar);
                }
            }, zzfw.class, zzba.class));
            return zznp.zza(zza2.zza());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
