package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhjt {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhjs.zza, zzhgm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhjp.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhjq.zza, zzhge.class, zzhos.class);
        zzf = zzhmx.zzd(zzhjr.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhgm zzhgmVar) {
        zzhfm zzf2 = zzf(zzhgmVar.zzg());
        zzhrv zzd2 = zzhrw.zzd();
        zzhrz zzc2 = zzhsa.zzc();
        zzhsb zzb2 = zzhsc.zzb();
        zzb2.zza(zzhgmVar.zzf());
        zzc2.zza((zzhsc) zzb2.zzbu());
        zzc2.zzb(zzhgmVar.zzc());
        zzd2.zza((zzhsa) zzc2.zzbu());
        zzhto zze2 = zzhtp.zze();
        zze2.zza(zzi(zzhgmVar));
        zze2.zzb(zzhgmVar.zzd());
        zzd2.zzb((zzhtp) zze2.zzbu());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzf2, ((zzhrw) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhgm zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhrw zzc2 = zzhrw.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzc2.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgj zzb2 = zzhgm.zzb();
            zzb2.zza(zzc2.zza().zzb());
            zzb2.zzb(zzc2.zzb().zzb());
            zzb2.zzc(zzc2.zza().zza().zza());
            zzb2.zzd(zzc2.zzb().zza().zzb());
            zzb2.zzf(zzh(zzc2.zzb().zza().zza()));
            zzb2.zze(zzg(zzhotVar.zzd()));
            return zzb2.zzg();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhge zzhgeVar, zzhfr zzhfrVar) {
        zzhrt zze2 = zzhru.zze();
        zzhrx zzd2 = zzhry.zzd();
        zzhsb zzb2 = zzhsc.zzb();
        zzb2.zza(zzhgeVar.zzg().zzf());
        zzd2.zza((zzhsc) zzb2.zzbu());
        byte[] zzc2 = zzhgeVar.zze().zzc(zzhfrVar);
        zzd2.zzb(zziei.zzt(zzc2, 0, zzc2.length));
        zze2.zza((zzhry) zzd2.zzbu());
        zzhtm zze3 = zzhtn.zze();
        zze3.zza(zzi(zzhgeVar.zzg()));
        byte[] zzc3 = zzhgeVar.zzf().zzc(zzhfrVar);
        zze3.zzb(zziei.zzt(zzc3, 0, zzc3.length));
        zze2.zzb((zzhtn) zze3.zzbu());
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhru) zze2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgeVar.zzg().zzg()), zzhgeVar.zzb());
    }

    static /* synthetic */ zzhge zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhru zzd2 = zzhru.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhgj zzb2 = zzhgm.zzb();
            zzb2.zza(zzd2.zzb().zzc().zzb());
            zzb2.zzb(zzd2.zzc().zzc().zzb());
            zzb2.zzc(zzd2.zzb().zzb().zza());
            zzb2.zzd(zzd2.zzc().zzb().zzb());
            zzb2.zzf(zzh(zzd2.zzc().zzb().zza()));
            zzb2.zze(zzg(zzhosVar.zzd()));
            zzhgm zzg = zzb2.zzg();
            zzhgd zzd3 = zzhge.zzd();
            zzd3.zza(zzg);
            zzd3.zzb(zzicj.zza(zzd2.zzb().zzc().zzA(), zzhfrVar));
            zzd3.zzc(zzicj.zza(zzd2.zzc().zzc().zzA(), zzhfrVar));
            zzd3.zzd(zzhosVar.zze());
            return zzd3.zze();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhfm zzf(zzhgl zzhglVar) throws GeneralSecurityException {
        if (zzhglVar.equals(zzhgl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhglVar.equals(zzhgl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhglVar.equals(zzhgl.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhglVar)));
    }

    private static zzhgl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhgl.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhgl.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhgl.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhgk zzh(zzhtl zzhtlVar) throws GeneralSecurityException {
        int ordinal = zzhtlVar.ordinal();
        if (ordinal == 1) {
            return zzhgk.zza;
        }
        if (ordinal == 2) {
            return zzhgk.zzd;
        }
        if (ordinal == 3) {
            return zzhgk.zzc;
        }
        if (ordinal == 4) {
            return zzhgk.zze;
        }
        if (ordinal == 5) {
            return zzhgk.zzb;
        }
        int zza2 = zzhtlVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhtr zzi(zzhgm zzhgmVar) throws GeneralSecurityException {
        zzhtl zzhtlVar;
        zzhtq zzc2 = zzhtr.zzc();
        zzc2.zzb(zzhgmVar.zze());
        zzhgk zzh = zzhgmVar.zzh();
        if (zzh.equals(zzhgk.zza)) {
            zzhtlVar = zzhtl.SHA1;
        } else if (zzh.equals(zzhgk.zzb)) {
            zzhtlVar = zzhtl.SHA224;
        } else if (zzh.equals(zzhgk.zzc)) {
            zzhtlVar = zzhtl.SHA256;
        } else if (zzh.equals(zzhgk.zzd)) {
            zzhtlVar = zzhtl.SHA384;
        } else {
            if (!zzh.equals(zzhgk.zze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzh)));
            }
            zzhtlVar = zzhtl.SHA512;
        }
        zzc2.zza(zzhtlVar);
        return (zzhtr) zzc2.zzbu();
    }
}
