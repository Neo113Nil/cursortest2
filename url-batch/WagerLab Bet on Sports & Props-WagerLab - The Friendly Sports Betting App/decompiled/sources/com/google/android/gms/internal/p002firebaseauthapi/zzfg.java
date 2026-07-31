package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfc;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzfg {
    private static final zzaaj zza;
    private static final zzph<zzfc, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzfd, zzqb> zzd;
    private static final zznt<zzqb> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfd zzb(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzxt zza2 = zzxt.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzfd.zza(zza(zza2.zzd(), zzqbVar.zzb()), zzqbVar.zze());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfc zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (!zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
        }
        try {
            return zza(zzxw.zza(zzqeVar.zza().zze(), zzaku.zza()), zzqeVar.zza().zzd());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzfc zza(zzxw zzxwVar, zzxz zzxzVar) throws GeneralSecurityException {
        zzfc.zza zzaVar;
        zzfc.zzc zzcVar;
        zzcb zza2 = zzcj.zza(((zzxb) ((zzalf) zzxb.zza().zza(zzxwVar.zza().zzf()).zza(zzxwVar.zza().zze()).zza(zzxz.RAW).zze())).zzk());
        if (zza2 instanceof zzdx) {
            zzaVar = zzfc.zza.zza;
        } else if (zza2 instanceof zzem) {
            zzaVar = zzfc.zza.zzc;
        } else if (zza2 instanceof zzge) {
            zzaVar = zzfc.zza.zzb;
        } else if (zza2 instanceof zzdi) {
            zzaVar = zzfc.zza.zzd;
        } else if (zza2 instanceof zzdq) {
            zzaVar = zzfc.zza.zze;
        } else if (zza2 instanceof zzeg) {
            zzaVar = zzfc.zza.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + String.valueOf(zza2));
        }
        zzfc.zzb zzbVar = new zzfc.zzb();
        int i = zzfj.zza[zzxzVar.ordinal()];
        if (i == 1) {
            zzcVar = zzfc.zzc.zza;
        } else if (i == 2) {
            zzcVar = zzfc.zzc.zzb;
        } else {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
        }
        return zzbVar.zza(zzcVar).zza(zzxwVar.zze()).zza((zzcy) zza2).zza(zzaVar).zza();
    }

    private static zzxw zzb(zzfc zzfcVar) throws GeneralSecurityException {
        try {
            return (zzxw) ((zzalf) zzxw.zzb().zza(zzfcVar.zzd()).zza(zzxb.zza(zzcj.zza(zzfcVar.zzb()), zzaku.zza())).zze());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzxz zza(zzfc.zzc zzcVar) throws GeneralSecurityException {
        if (zzfc.zzc.zza.equals(zzcVar)) {
            return zzxz.TINK;
        }
        if (zzfc.zzc.zzb.equals(zzcVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzff
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb3;
                zzb3 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzfg.zzb(r1).zzj()).zza(zzfg.zza(((zzfc) zzcbVar).zzc())).zze()));
                return zzb3;
            }
        }, zzfc.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzfc zzb3;
                zzb3 = zzfg.zzb((zzqe) zzqfVar);
                return zzb3;
            }
        }, zzb2, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzxt) ((zzalf) zzxt.zzb().zza(zzfg.zzb((zzfc) ((zzcy) r1.zza()))).zze())).zzj(), zzwx.zzb.REMOTE, zzfg.zza(((zzfc) ((zzcy) r1.zza())).zzc()), ((zzfd) zzbiVar).zzb());
                return zza2;
            }
        }, zzfd.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzfd zzb3;
                zzb3 = zzfg.zzb((zzqb) zzqfVar, zzchVar);
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
