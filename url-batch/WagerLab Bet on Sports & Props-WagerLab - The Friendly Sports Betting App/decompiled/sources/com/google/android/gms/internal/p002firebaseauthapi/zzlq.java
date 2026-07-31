package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import com.google.android.gms.internal.p002firebaseauthapi.zzvn;
import com.google.android.gms.internal.p002firebaseauthapi.zzvt;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzlq {
    private static final zzaaj zza;
    private static final zzaaj zzb;
    private static final zzph<zzkb, zzqe> zzc;
    private static final zzpd<zzqe> zzd;
    private static final zznx<zzkh, zzqb> zze;
    private static final zznt<zzqb> zzf;
    private static final zznx<zzke, zzqb> zzg;
    private static final zznt<zzqb> zzh;
    private static final zznl<zzxz, zzkb.zzd> zzi;
    private static final zznl<zzvy, zzkb.zzb> zzj;
    private static final zznl<zzvw, zzkb.zzc> zzk;
    private static final zznl<zzvb, zzkb.zze> zzl;

    private static int zza(zzkb.zzc zzcVar) throws GeneralSecurityException {
        if (zzkb.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzkb.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzkb.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzcVar));
    }

    private static zzkb zza(zzxz zzxzVar, zzvk zzvkVar) throws GeneralSecurityException {
        zzkb.zza zza2 = zzkb.zzc().zza(zzi.zza((zznl<zzxz, zzkb.zzd>) zzxzVar)).zza(zzk.zza((zznl<zzvw, zzkb.zzc>) zzvkVar.zzf().zzd())).zza(zzj.zza((zznl<zzvy, zzkb.zzb>) zzvkVar.zzf().zze())).zza(zzcj.zza(((zzxb) ((zzalf) zzxb.zza().zza(zzvkVar.zzb().zzd().zzf()).zza(zzxz.RAW).zza(zzvkVar.zzb().zzd().zze()).zze())).zzk())).zza(zzaaj.zza(zzvkVar.zzf().zzf().zzd()));
        if (!zzvkVar.zzf().zzd().equals(zzvw.CURVE25519)) {
            zza2.zza(zzl.zza((zznl<zzvb, zzkb.zze>) zzvkVar.zza()));
        } else if (!zzvkVar.zza().equals(zzvb.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkb zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (!zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
        }
        try {
            return zza(zzqeVar.zza().zzd(), zzvh.zza(zzqeVar.zza().zze(), zzaku.zza()).zzc());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzke zzc(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzqbVar.zzf());
        }
        try {
            zzvn zza2 = zzvn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvq zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zza3 = zza(zzqbVar.zzb(), zzd2.zzb());
            if (zza3.zzd().equals(zzkb.zzc.zzd)) {
                return zzke.zza(zzkh.zza(zza3, zzaaj.zza(zzd2.zzf().zzd()), zzqbVar.zze()), zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar)));
            }
            return zzke.zza(zzkh.zza(zza3, new ECPoint(zzne.zza(zzd2.zzf().zzd()), zzne.zza(zzd2.zzg().zzd())), zzqbVar.zze()), zzaam.zza(zzne.zza(zza2.zze().zzd()), zzch.zza(zzchVar)));
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkh zzd(zzqb zzqbVar, @Nullable zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzqbVar.zzf());
        }
        try {
            zzvq zza2 = zzvq.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zza3 = zza(zzqbVar.zzb(), zza2.zzb());
            if (zza3.zzd().equals(zzkb.zzc.zzd)) {
                if (zza2.zzg().zzb() != 0) {
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                }
                return zzkh.zza(zza3, zzaaj.zza(zza2.zzf().zzd()), zzqbVar.zze());
            }
            return zzkh.zza(zza3, new ECPoint(zzne.zza(zza2.zzf().zzd()), zzne.zza(zza2.zzg().zzd())), zzqbVar.zze());
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzqb zza(zzke zzkeVar, zzch zzchVar) {
        zzvn.zza zza2 = zzvn.zzb().zza(0).zza(zza((zzkh) ((zzli) zzkeVar.zzc())));
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            zza2.zza(zzajv.zza(zzkeVar.zzg().zza(zzch.zza(zzchVar))));
        } else {
            zza2.zza(zzajv.zza(zzne.zza(zzkeVar.zzf().zza(zzch.zza(zzchVar)), zza(((zzkb) ((zzlg) zzkeVar.zza())).zzd()))));
        }
        return zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzvn) ((zzalf) zza2.zze())).zzj(), zzwx.zzb.ASYMMETRIC_PRIVATE, zzi.zza((zznl<zzxz, zzkb.zzd>) ((zzkb) ((zzlg) zzkeVar.zza())).zzg()), zzkeVar.zzb());
    }

    private static zzvk zzb(zzkb zzkbVar) throws GeneralSecurityException {
        zzvt.zza zza2 = zzvt.zza().zza(zzk.zza((zznl<zzvw, zzkb.zzc>) zzkbVar.zzd())).zza(zzj.zza((zznl<zzvy, zzkb.zzb>) zzkbVar.zze()));
        if (zzkbVar.zzh() != null && zzkbVar.zzh().zza() > 0) {
            zza2.zza(zzajv.zza(zzkbVar.zzh().zzb()));
        }
        zzvt zzvtVar = (zzvt) ((zzalf) zza2.zze());
        try {
            zzxb zza3 = zzxb.zza(zzcj.zza(zzkbVar.zzb()), zzaku.zza());
            zzve zzveVar = (zzve) ((zzalf) zzve.zza().zza((zzxb) ((zzalf) zzxb.zza().zza(zza3.zzf()).zza(zzxz.TINK).zza(zza3.zze()).zze())).zze());
            zzkb.zze zzf2 = zzkbVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzkb.zze.zza;
            }
            return (zzvk) ((zzalf) zzvk.zzc().zza(zzvtVar).zza(zzveVar).zza(zzl.zza((zznl<zzvb, zzkb.zze>) zzf2)).zze());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    private static zzvq zza(zzkh zzkhVar) throws GeneralSecurityException {
        if (((zzkb) ((zzlg) zzkhVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzkhVar.zze().zzb())).zzb(zzajv.zza).zze());
        }
        int zza2 = zza(((zzkb) ((zzlg) zzkhVar.zza())).zzd());
        ECPoint zzf2 = zzkhVar.zzf();
        if (zzf2 == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzne.zza(zzf2.getAffineX(), zza2))).zzb(zzajv.zza(zzne.zza(zzf2.getAffineY(), zza2))).zze());
    }

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzaaj zzb3 = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqe zzb4;
                zzb4 = zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzvh) ((zzalf) zzvh.zza().zza(zzlq.zzb(r1)).zze())).zzj()).zza(zzlq.zzi.zza((zznl<zzxz, zzkb.zzd>) ((zzkb) zzcbVar).zzg())).zze()));
                return zzb4;
            }
        }, zzkb.class, zzqe.class);
        zzd = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzls
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                zzkb zzb4;
                zzb4 = zzlq.zzb((zzqe) zzqfVar);
                return zzb4;
            }
        }, zzb2, zzqe.class);
        zze = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqb zza2;
                zza2 = zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzlq.zza(r1).zzj(), zzwx.zzb.ASYMMETRIC_PUBLIC, zzlq.zzi.zza((zznl<zzxz, zzkb.zzd>) ((zzkb) ((zzlg) r1.zza())).zzg()), ((zzkh) zzbiVar).zzb());
                return zza2;
            }
        }, zzkh.class, zzqb.class);
        zzf = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzkh zzd2;
                zzd2 = zzlq.zzd((zzqb) zzqfVar, zzchVar);
                return zzd2;
            }
        }, zzb3, zzqb.class);
        zzg = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                return zzlq.zza((zzke) zzbiVar, zzchVar);
            }
        }, zzke.class, zzqb.class);
        zzh = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                zzke zzc2;
                zzc2 = zzlq.zzc((zzqb) zzqfVar, zzchVar);
                return zzc2;
            }
        }, zzb2, zzqb.class);
        zzi = zznl.zza().zza(zzxz.RAW, zzkb.zzd.zzc).zza(zzxz.TINK, zzkb.zzd.zza).zza(zzxz.LEGACY, zzkb.zzd.zzb).zza(zzxz.CRUNCHY, zzkb.zzd.zzb).zza();
        zzj = zznl.zza().zza(zzvy.SHA1, zzkb.zzb.zza).zza(zzvy.SHA224, zzkb.zzb.zzb).zza(zzvy.SHA256, zzkb.zzb.zzc).zza(zzvy.SHA384, zzkb.zzb.zzd).zza(zzvy.SHA512, zzkb.zzb.zze).zza();
        zzk = zznl.zza().zza(zzvw.NIST_P256, zzkb.zzc.zza).zza(zzvw.NIST_P384, zzkb.zzc.zzb).zza(zzvw.NIST_P521, zzkb.zzc.zzc).zza(zzvw.CURVE25519, zzkb.zzc.zzd).zza();
        zzl = zznl.zza().zza(zzvb.UNCOMPRESSED, zzkb.zze.zzb).zza(zzvb.COMPRESSED, zzkb.zze.zza).zza(zzvb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzkb.zze.zzc).zza();
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }
}
