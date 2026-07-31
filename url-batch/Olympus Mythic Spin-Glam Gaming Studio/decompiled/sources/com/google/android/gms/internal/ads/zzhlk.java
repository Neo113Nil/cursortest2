package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhlk {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhlj.zza, zzhjh.class, zzhot.class);
        zzd = zzhoa.zzd(zzhlg.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhlh.zza, zzhjc.class, zzhos.class);
        zzf = zzhmx.zzd(zzhli.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhjh zzhjhVar) {
        zzhfm zzf2 = zzf(zzhjhVar.zzc());
        zzhvk zzd2 = zzhvl.zzd();
        zzhvm zzb2 = zzhvn.zzb();
        zzb2.zza(zzhjhVar.zzd());
        zzd2.zza((zzhvn) zzb2.zzbu());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", zzf2, ((zzhvl) zzd2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhjh zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhvl zzc2 = zzhvl.zzc(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzc2.zza() == 0) {
                return zzhjh.zzb(zzg(zzhotVar.zzd()), zzc2.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhjc zzhjcVar, zzhfr zzhfrVar) {
        zzhvi zze2 = zzhvj.zze();
        byte[] zzc2 = zzhjcVar.zze().zzc(zzhfrVar);
        zze2.zzb(zziei.zzt(zzc2, 0, zzc2.length));
        zzhvm zzb2 = zzhvn.zzb();
        zzb2.zza(zzhjcVar.zzf().zzd());
        zze2.zza((zzhvn) zzb2.zzbu());
        return zzhos.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhvj) zze2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhjcVar.zzf().zzc()), zzhjcVar.zzb());
    }

    static /* synthetic */ zzhjc zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhvj zzd2 = zzhvj.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzc().zzb() == 32) {
                return zzhjc.zzd(zzhjh.zzb(zzg(zzhosVar.zzd()), zzd2.zzb().zza()), zzicj.zza(zzd2.zzc().zzA(), zzhfrVar), zzhosVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhfm zzf(zzhjg zzhjgVar) throws GeneralSecurityException {
        if (Objects.equals(zzhjgVar, zzhjg.zza)) {
            return zzhfm.zzb;
        }
        if (Objects.equals(zzhjgVar, zzhjg.zzb)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhjgVar.toString()));
    }

    private static zzhjg zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhjg.zza;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhjg.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
