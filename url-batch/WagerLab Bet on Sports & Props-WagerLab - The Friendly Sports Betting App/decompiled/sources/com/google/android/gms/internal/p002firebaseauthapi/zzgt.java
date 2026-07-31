package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdx;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzgt {
    private static final zzaaj zza;
    private static final zzph<zzdx, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzds, zzqb> zzd;
    private static final zznt<zzqb> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzds zzb(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzud zza2 = zzud.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzds.zze().zza(zzdx.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzdx.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzha.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzdx.zza.zza;
        }
        if (i == 2 || i == 3) {
            return zzdx.zza.zzb;
        }
        if (i == 4) {
            return zzdx.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdx zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (!zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
        }
        try {
            zzug zza2 = zzug.zza(zzqeVar.zza().zze(), zzaku.zza());
            if (zza2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return zzdx.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzqeVar.zza().zzd())).zza();
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzqb zza(zzds zzdsVar, zzch zzchVar) {
        zzb((zzdx) ((zzcy) zzdsVar.zza()));
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzud) ((zzalf) zzud.zzb().zza(zzajv.zza(zzdsVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzdx) ((zzcy) zzdsVar.zza())).zzf()), zzdsVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzdx zzdxVar) {
        zzb(zzdxVar);
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzug) ((zzalf) zzug.zzc().zza(zzdxVar.zzc()).zze())).zzj()).zza(zza(zzdxVar.zzf())).zze()));
    }

    private static zzxz zza(zzdx.zza zzaVar) throws GeneralSecurityException {
        if (zzdx.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzdx.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdx.zza.zzc.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                return zzgt.zza((zzdx) zzcbVar);
            }
        }, zzdx.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzdx zzb3;
                zzb3 = zzgt.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                return zzgt.zza((zzds) zzbiVar, zzchVar);
            }
        }, zzds.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzds zzb3;
                zzb3 = zzgt.zzb((zzqb) zzqfVar, zzchVar);
                return zzb3;
            }
        }, zzb2, zzqb.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    private static void zzb(zzdx zzdxVar) throws GeneralSecurityException {
        if (zzdxVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdxVar.zzd())));
        }
        if (zzdxVar.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdxVar.zzb())));
        }
    }
}
