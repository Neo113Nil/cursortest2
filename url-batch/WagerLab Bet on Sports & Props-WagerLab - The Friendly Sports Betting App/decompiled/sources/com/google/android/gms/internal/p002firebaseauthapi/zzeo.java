package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzeo {
    private static final zzps<zzet, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzen
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            zzba zza2;
            zza2 = zzia.zza(zzca.zza(((zzev) ((zzcy) r1.zza())).zzc()).zza(((zzev) ((zzcy) r1.zza())).zzc()), ((zzet) zzbiVar).zzd());
            return zza2;
        }
    }, zzet.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzba.class, zzwx.zzb.REMOTE, zzxn.zze());
    private static final zzor<zzev> zzc = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            zzet zza2;
            zza2 = zzet.zza((zzev) zzcbVar, num);
            return zza2;
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zziv.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        zzex.zza();
        zzpa.zza().zza(zza);
        zzop.zza().zza(zzc, zzev.class);
        zznq.zza().zza((zzbh) zzb, true);
    }
}
