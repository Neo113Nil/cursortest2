package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhkf {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhke.zza, zzhhd.class, zzhot.class);
        zzd = zzhoa.zzd(zzhkb.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhkc.zza, zzhgw.class, zzhos.class);
        zzf = zzhmx.zzd(zzhkd.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhhd zzhhdVar) {
        zzhfm zzf2 = zzf(zzhhdVar.zzd());
        zzhsl zzd2 = zzhsm.zzd();
        zzd2.zza(zzhhdVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzf2, ((zzhsm) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhhd zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhsm zzc2 = zzhsm.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhhb zzb2 = zzhhd.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhotVar.zzd()));
            return zzb2.zze();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhgw zzhgwVar, zzhfr zzhfrVar) {
        zzhsj zzd2 = zzhsk.zzd();
        byte[] zzc2 = zzhgwVar.zze().zzc(zzhfrVar);
        zzd2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhsk) zzd2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhgwVar.zzf().zzd()), zzhgwVar.zzb());
    }

    static /* synthetic */ zzhgw zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhsk zzc2 = zzhsk.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhhb zzb2 = zzhhd.zzb();
            zzb2.zza(zzc2.zzb().zzb());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhosVar.zzd()));
            zzhhd zze2 = zzb2.zze();
            zzhgv zzd2 = zzhgw.zzd();
            zzd2.zza(zze2);
            zzd2.zzb(zzicj.zza(zzc2.zzb().zzA(), zzhfrVar));
            zzd2.zzc(zzhosVar.zze());
            return zzd2.zzd();
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhfm zzf(zzhhc zzhhcVar) throws GeneralSecurityException {
        if (zzhhcVar.equals(zzhhc.zza)) {
            return zzhfm.zzb;
        }
        if (zzhhcVar.equals(zzhhc.zzb)) {
            return zzhfm.zze;
        }
        if (zzhhcVar.equals(zzhhc.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhcVar)));
    }

    private static zzhhc zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhhc.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhhc.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhhc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
