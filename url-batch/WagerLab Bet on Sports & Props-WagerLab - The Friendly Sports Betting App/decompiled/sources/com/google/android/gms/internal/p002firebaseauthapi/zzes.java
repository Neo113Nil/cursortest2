package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzes {
    private static final zzbh<zzba> zza = zzod.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzba.class, zzwx.zzb.SYMMETRIC, zzxt.zze());
    private static final zzor<zzfc> zzb = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzer
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            zzfd zza2;
            zza2 = zzfd.zza((zzfc) zzcbVar, num);
            return zza2;
        }
    };
    private static final zzps<zzfd, zzba> zzc = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzes.zza((zzfd) zzbiVar);
        }
    }, zzfd.class, zzba.class);

    public static /* synthetic */ zzba zza(zzfd zzfdVar) {
        String zzd = ((zzfc) ((zzcy) zzfdVar.zza())).zzd();
        return zzia.zza(zzep.zza(((zzfc) ((zzcy) zzfdVar.zza())).zzb(), zzca.zza(zzd).zza(zzd)), zzfdVar.zzd());
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zziv.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zzfg.zza();
        zzop.zza().zza(zzb, zzfc.class);
        zzpa.zza().zza(zzc);
        zznq.zza().zza((zzbh) zza, true);
    }
}
