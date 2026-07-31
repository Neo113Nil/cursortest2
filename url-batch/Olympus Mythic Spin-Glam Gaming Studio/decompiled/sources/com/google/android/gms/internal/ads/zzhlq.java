package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhlq {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhod.zzd(zzhlp.zza, zzhjo.class, zzhot.class);
        zzd = zzhoa.zzd(zzhlm.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhln.zza, zzhji.class, zzhos.class);
        zzf = zzhmx.zzd(zzhlo.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhjo zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            if (zzhvr.zzb(zzhotVar.zzc().zzb(), zziew.zzb()).zza() == 0) {
                return zzhjo.zzb(zzg(zzhotVar.zzd()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhji zzhjiVar, zzhfr zzhfrVar) {
        zzhvo zzd2 = zzhvp.zzd();
        byte[] zzc2 = zzhjiVar.zze().zzc(zzhfrVar);
        zzd2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhvp) zzd2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhjiVar.zzf().zzc()), zzhjiVar.zzb());
    }

    static /* synthetic */ zzhji zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhvp zzc2 = zzhvp.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() == 0) {
                return zzhji.zzd(zzg(zzhosVar.zzd()), zzicj.zza(zzc2.zzb().zzA(), zzhfrVar), zzhosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhfm zzf(zzhjn zzhjnVar) throws GeneralSecurityException {
        if (zzhjnVar.equals(zzhjn.zza)) {
            return zzhfm.zzb;
        }
        if (zzhjnVar.equals(zzhjn.zzb)) {
            return zzhfm.zze;
        }
        if (zzhjnVar.equals(zzhjn.zzc)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhjnVar.toString()));
    }

    private static zzhjn zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhjn.zza;
        }
        if (zzhfmVar == zzhfm.zze || zzhfmVar == zzhfm.zzc) {
            return zzhjn.zzb;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhjn.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
