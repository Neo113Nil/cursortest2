package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdi;
import com.google.android.gms.internal.p002firebaseauthapi.zzwh;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzgg {
    private static final zzaaj zza;
    private static final zzph<zzdi, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzdd, zzqb> zzd;
    private static final zznt<zzqb> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdd zzb(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zztf zza2 = zztf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zza2.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzdd.zze().zza(zzdi.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzf().zzd(), zzch.zza(zzchVar))).zzb(zzaal.zza(zza2.zze().zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzdi.zza zza(zzvy zzvyVar) throws GeneralSecurityException {
        int i = zzgm.zzb[zzvyVar.ordinal()];
        if (i == 1) {
            return zzdi.zza.zza;
        }
        if (i == 2) {
            return zzdi.zza.zzb;
        }
        if (i == 3) {
            return zzdi.zza.zzc;
        }
        if (i == 4) {
            return zzdi.zza.zzd;
        }
        if (i == 5) {
            return zzdi.zza.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzvyVar.zza());
    }

    private static zzdi.zzc zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzgm.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzdi.zzc.zza;
        }
        if (i == 2 || i == 3) {
            return zzdi.zzc.zzb;
        }
        if (i == 4) {
            return zzdi.zzc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdi zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (!zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
        }
        try {
            zzti zza2 = zzti.zza(zzqeVar.zza().zze(), zzaku.zza());
            if (zza2.zzd().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdi.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzqeVar.zza().zzd())).zza();
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    private static zzwh zzb(zzdi zzdiVar) throws GeneralSecurityException {
        zzvy zzvyVar;
        zzwh.zza zza2 = zzwh.zzc().zza(zzdiVar.zze());
        zzdi.zza zzg = zzdiVar.zzg();
        if (zzdi.zza.zza.equals(zzg)) {
            zzvyVar = zzvy.SHA1;
        } else if (zzdi.zza.zzb.equals(zzg)) {
            zzvyVar = zzvy.SHA224;
        } else if (zzdi.zza.zzc.equals(zzg)) {
            zzvyVar = zzvy.SHA256;
        } else if (zzdi.zza.zzd.equals(zzg)) {
            zzvyVar = zzvy.SHA384;
        } else if (zzdi.zza.zze.equals(zzg)) {
            zzvyVar = zzvy.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzg));
        }
        return (zzwh) ((zzalf) zza2.zza(zzvyVar).zze());
    }

    private static zzxz zza(zzdi.zzc zzcVar) throws GeneralSecurityException {
        if (zzdi.zzc.zza.equals(zzcVar)) {
            return zzxz.TINK;
        }
        if (zzdi.zzc.zzb.equals(zzcVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdi.zzc.zzc.equals(zzcVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzti) ((zzalf) zzti.zza().zza((zzto) ((zzalf) zzto.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(r1.zzd()).zze())).zza(r1.zzb()).zze())).zza((zzwe) ((zzalf) zzwe.zzc().zza(zzgg.zzb(r1)).zza(r1.zzc()).zze())).zze())).zzj()).zza(zzgg.zza(((zzdi) zzcbVar).zzh())).zze()));
                return zzb3;
            }
        }, zzdi.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzdi zzb3;
                zzb3 = zzgg.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zztf) ((zzalf) zztf.zzb().zza((zztl) ((zzalf) zztl.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(((zzdi) ((zzcy) r1.zza())).zzd()).zze())).zza(zzajv.zza(r1.zzf().zza(zzch.zza(zzchVar)))).zze())).zza((zzwb) ((zzalf) zzwb.zzb().zza(zzgg.zzb((zzdi) ((zzcy) r1.zza()))).zza(zzajv.zza(r1.zzg().zza(zzch.zza(zzchVar)))).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzgg.zza(((zzdi) ((zzcy) r1.zza())).zzh()), ((zzdd) zzbiVar).zzb());
                return zza2;
            }
        }, zzdd.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzdd zzb3;
                zzb3 = zzgg.zzb((zzqb) zzqfVar, zzchVar);
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
