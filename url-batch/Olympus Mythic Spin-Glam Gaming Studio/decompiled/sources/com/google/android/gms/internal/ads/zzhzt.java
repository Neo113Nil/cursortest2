package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzhzt {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;
    private static final zzhmo zzj;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zza2;
        zzich zza3 = zzhpd.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zza3;
        zzd = zzhod.zzd(zzhzs.zza, zzhxq.class, zzhot.class);
        zze = zzhoa.zzd(zzhzn.zza, zza2, zzhot.class);
        zzf = zzhna.zzd(zzhzo.zza, zzhxu.class, zzhos.class);
        zzg = zzhmx.zzd(zzhzp.zza, zza3, zzhos.class);
        zzh = zzhna.zzd(zzhzq.zza, zzhxs.class, zzhos.class);
        zzi = zzhmx.zzd(zzhzr.zza, zza2, zzhos.class);
        zzhmn zza4 = zzhmo.zza();
        zza4.zza(zzhtl.SHA256, zzhxo.zza);
        zza4.zza(zzhtl.SHA384, zzhxo.zzb);
        zza4.zza(zzhtl.SHA512, zzhxo.zzc);
        zzj = zza4.zzb();
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    static /* synthetic */ zzhot zzb(zzhxq zzhxqVar) {
        zzhfm zzh2 = zzh(zzhxqVar.zze());
        zzhus zze2 = zzhut.zze();
        zze2.zza(zzj(zzhxqVar));
        zze2.zzb(zzhxqVar.zzc());
        byte[] zza2 = zzhma.zza(zzhxqVar.zzd());
        zziei zzieiVar = zziei.zza;
        zze2.zzc(zziei.zzt(zza2, 0, zza2.length));
        return zzhot.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzh2, ((zzhut) zze2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhxq zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhut zzd2 = zzhut.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            zzhxn zzb2 = zzhxq.zzb();
            zzb2.zzd((zzhxo) zzj.zzc(zzd2.zza().zza()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzA()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzc(zzi(zzhotVar.zzd()));
            return zzb2.zze();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhxu zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhuz zze2 = zzhuz.zze(zzhosVar.zzb(), zziew.zzb());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            zzhxn zzb2 = zzhxq.zzb();
            zzb2.zzd((zzhxo) zzj.zzc(zze2.zzb().zza()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzA()));
            zzb2.zza(bitLength);
            zzb2.zzc(zzi(zzhosVar.zzd()));
            zzhxq zze3 = zzb2.zze();
            zzhxt zzc2 = zzhxu.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhosVar.zze());
            return zzc2.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ zzhos zzf(zzhxs zzhxsVar, zzhfr zzhfrVar) {
        zzhuw zzk = zzhux.zzk();
        zzk.zza(0);
        zzk.zzb(zzk(zzhxsVar.zze()));
        byte[] zza2 = zzhma.zza(zzhxsVar.zzi().zzb(zzhfrVar));
        zziei zzieiVar = zziei.zza;
        zzk.zzc(zziei.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhma.zza(zzhxsVar.zzf().zzb(zzhfrVar));
        zzk.zzd(zziei.zzt(zza3, 0, zza3.length));
        byte[] zza4 = zzhma.zza(zzhxsVar.zzh().zzb(zzhfrVar));
        zzk.zze(zziei.zzt(zza4, 0, zza4.length));
        byte[] zza5 = zzhma.zza(zzhxsVar.zzj().zzb(zzhfrVar));
        zzk.zzf(zziei.zzt(zza5, 0, zza5.length));
        byte[] zza6 = zzhma.zza(zzhxsVar.zzk().zzb(zzhfrVar));
        zzk.zzg(zziei.zzt(zza6, 0, zza6.length));
        byte[] zza7 = zzhma.zza(zzhxsVar.zzl().zzb(zzhfrVar));
        zzk.zzh(zziei.zzt(zza7, 0, zza7.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhux) zzk.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhxsVar.zzd().zze()), zzhxsVar.zze().zzb());
    }

    static /* synthetic */ zzhxs zzg(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhux zzj2 = zzhux.zzj(zzhosVar.zzb(), zziew.zzb());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhuz zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzA());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzA());
            zzhxn zzb3 = zzhxq.zzb();
            zzb3.zzd((zzhxo) zzj.zzc(zzb2.zzb().zza()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzc(zzi(zzhosVar.zzd()));
            zzhxq zze2 = zzb3.zze();
            zzhxt zzc2 = zzhxu.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhosVar.zze());
            zzhxu zzd2 = zzc2.zzd();
            zzhxr zzc3 = zzhxs.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzl(zzj2.zzd(), zzhfrVar), zzl(zzj2.zze(), zzhfrVar));
            zzc3.zzc(zzl(zzj2.zzc(), zzhfrVar));
            zzc3.zzd(zzl(zzj2.zzg(), zzhfrVar), zzl(zzj2.zzh(), zzhfrVar));
            zzc3.zze(zzl(zzj2.zzi(), zzhfrVar));
            return zzc3.zzf();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhxp zzhxpVar) throws GeneralSecurityException {
        if (zzhxpVar.equals(zzhxp.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhxpVar.equals(zzhxp.zza)) {
            return zzhfm.zzb;
        }
        if (zzhxpVar.equals(zzhxp.zzb)) {
            return zzhfm.zze;
        }
        if (zzhxpVar.equals(zzhxp.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhxpVar)));
    }

    private static zzhxp zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhxp.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhxp.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhxp.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhxp.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhuv zzj(zzhxq zzhxqVar) throws GeneralSecurityException {
        zzhuu zzb2 = zzhuv.zzb();
        zzb2.zza((zzhtl) zzj.zzb(zzhxqVar.zzf()));
        return (zzhuv) zzb2.zzbu();
    }

    private static zzhuz zzk(zzhxu zzhxuVar) throws GeneralSecurityException {
        zzhuy zzg2 = zzhuz.zzg();
        zzg2.zza(zzj(zzhxuVar.zzf()));
        byte[] zza2 = zzhma.zza(zzhxuVar.zzd());
        zziei zzieiVar = zziei.zza;
        zzg2.zzb(zziei.zzt(zza2, 0, zza2.length));
        byte[] zza3 = zzhma.zza(zzhxuVar.zzf().zzd());
        zzg2.zzc(zziei.zzt(zza3, 0, zza3.length));
        return (zzhuz) zzg2.zzbu();
    }

    private static zzici zzl(zziei zzieiVar, zzhfr zzhfrVar) {
        return zzici.zza(new BigInteger(1, zzieiVar.zzA()), zzhfrVar);
    }
}
