package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhkm {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhkl.zza, zzhhm.class, zzhot.class);
        zzd = zzhoa.zzd(zzhki.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhkj.zza, zzhhf.class, zzhos.class);
        zzf = zzhmx.zzd(zzhkk.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhhm zzhhmVar) {
        zzhfm zzf2 = zzf(zzhhmVar.zzd());
        zzhsp zzd2 = zzhsq.zzd();
        zzd2.zza(zzhhmVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzf2, ((zzhsq) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhhm zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhsq zzc2 = zzhsq.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhhk zzb2 = zzhhm.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzg(zzhotVar.zzd()));
            return zzb2.zzc();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhhf zzhhfVar, zzhfr zzhfrVar) {
        zzhsn zzd2 = zzhso.zzd();
        byte[] zzc2 = zzhhfVar.zze().zzc(zzhfrVar);
        zzd2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhso) zzd2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhhfVar.zzf().zzd()), zzhhfVar.zzb());
    }

    static /* synthetic */ zzhhf zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhso zzc2 = zzhso.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhhk zzb2 = zzhhm.zzb();
            zzb2.zza(zzc2.zzb().zzb());
            zzb2.zzb(zzg(zzhosVar.zzd()));
            zzhhm zzc3 = zzb2.zzc();
            zzhhe zzd2 = zzhhf.zzd();
            zzd2.zza(zzc3);
            zzd2.zzb(zzicj.zza(zzc2.zzb().zzA(), zzhfrVar));
            zzd2.zzc(zzhosVar.zze());
            return zzd2.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhfm zzf(zzhhl zzhhlVar) throws GeneralSecurityException {
        if (zzhhlVar.equals(zzhhl.zza)) {
            return zzhfm.zzb;
        }
        if (zzhhlVar.equals(zzhhl.zzb)) {
            return zzhfm.zze;
        }
        if (zzhhlVar.equals(zzhhl.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhlVar)));
    }

    private static zzhhl zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhhl.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhhl.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhhl.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
