package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzdm {
    private static final zzps<zzdl, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzyw.zza((zzdl) zzbiVar);
        }
    }, zzdl.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzba.class, zzwx.zzb.SYMMETRIC, zztu.zzf());
    private static final zzor<zzdq> zzc = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzdm.zza((zzdq) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzdl zza(zzdq zzdqVar, Integer num) {
        if (zzdqVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        return zzdl.zze().zza(zzdqVar).zza(num).zza(zzaal.zza(zzdqVar.zzc())).zza();
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zziv.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zzgl.zza();
        zzpa.zza().zza(zza);
        zzox zza2 = zzox.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfm.zzc);
        hashMap.put("AES128_EAX_RAW", zzdq.zze().zza(16).zzb(16).zzc(16).zza(zzdq.zzb.zzc).zza());
        hashMap.put("AES256_EAX", zzfm.zzd);
        hashMap.put("AES256_EAX_RAW", zzdq.zze().zza(16).zzb(32).zzc(16).zza(zzdq.zzb.zzc).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzop.zza().zza(zzc, zzdq.class);
        zznq.zza().zza((zzbh) zzb, true);
    }
}
