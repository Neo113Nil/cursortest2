package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqu;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzrz {
    private static final zzaaj zza;
    private static final zzph<zzqu, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzqp, zzqb> zzd;
    private static final zznt<zzqb> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqp zzb(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsw zza2 = zzsw.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqp.zzc().zza(zzqu.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzqu.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzsc.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzqu.zza.zza;
        }
        if (i == 2) {
            return zzqu.zza.zzb;
        }
        if (i == 3) {
            return zzqu.zza.zzc;
        }
        if (i == 4) {
            return zzqu.zza.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqu zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (!zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
        }
        try {
            zzsz zza2 = zzsz.zza(zzqeVar.zza().zze(), zzaku.zza());
            return zzqu.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzqeVar.zza().zzd())).zza();
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    private static zztc zzb(zzqu zzquVar) {
        return (zztc) ((zzalf) zztc.zzb().zza(zzquVar.zzb()).zze());
    }

    private static zzxz zza(zzqu.zza zzaVar) throws GeneralSecurityException {
        if (zzqu.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzqu.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzqu.zza.zzd.equals(zzaVar)) {
            return zzxz.RAW;
        }
        if (zzqu.zza.zzc.equals(zzaVar)) {
            return zzxz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzry
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsz) ((zzalf) zzsz.zzb().zza(zzrz.zzb(r1)).zza(r1.zzc()).zze())).zzj()).zza(zzrz.zza(((zzqu) zzcbVar).zze())).zze()));
                return zzb3;
            }
        }, zzqu.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzqu zzb3;
                zzb3 = zzrz.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsw) ((zzalf) zzsw.zzb().zza(zzrz.zzb((zzqu) ((zzrn) r1.zza()))).zza(zzajv.zza(r1.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzrz.zza(((zzqu) ((zzrn) r1.zza())).zze()), ((zzqp) zzbiVar).zzb());
                return zza2;
            }
        }, zzqp.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzqp zzb3;
                zzb3 = zzrz.zzb((zzqb) zzqfVar, zzchVar);
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
}
