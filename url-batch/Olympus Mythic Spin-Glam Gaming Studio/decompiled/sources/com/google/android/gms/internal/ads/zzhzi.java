package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzhzi {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzich zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;
    private static final zzhna zzh;
    private static final zzhmx zzi;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zza2;
        zzich zza3 = zzhpd.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zza3;
        zzd = zzhod.zzd(zzhzh.zza, zzhwh.class, zzhot.class);
        zze = zzhoa.zzd(zzhzc.zza, zza2, zzhot.class);
        zzf = zzhna.zzd(zzhzd.zza, zzhwo.class, zzhos.class);
        zzg = zzhmx.zzd(zzhze.zza, zza3, zzhos.class);
        zzh = zzhna.zzd(zzhzf.zza, zzhwi.class, zzhos.class);
        zzi = zzhmx.zzd(zzhzg.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
        zzhnwVar.zzb(zzh);
        zzhnwVar.zzc(zzi);
    }

    static /* synthetic */ zzhwh zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            if (zzhtf.zzb(zzhotVar.zzc().zzb(), zziew.zzb()).zza() == 0) {
                return zzhwh.zzb(zzi(zzhotVar.zzd()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwo zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhtj zzc2 = zzhtj.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() == 0) {
                return zzhwo.zzc(zzi(zzhosVar.zzd()), zzich.zza(zzc2.zzb().zzA()), zzhosVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ zzhos zzf(zzhwi zzhwiVar, zzhfr zzhfrVar) {
        zzhtg zze2 = zzhth.zze();
        zze2.zzb(zzj(zzhwiVar.zze()));
        byte[] zzc2 = zzhwiVar.zzf().zzc(zzhfrVar);
        zze2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhth) zze2.zzbu()).zzaM(), zzhfl.zzc, zzh(zzhwiVar.zzd().zzc()), zzhwiVar.zze().zzb());
    }

    static /* synthetic */ zzhwi zzg(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhosVar.zzg())));
        }
        try {
            zzhth zzd2 = zzhth.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtj zzc2 = zzd2.zzc();
            if (zzc2.zza() == 0) {
                return zzhwi.zzc(zzhwo.zzc(zzi(zzhosVar.zzd()), zzich.zza(zzc2.zzb().zzA()), zzhosVar.zze()), zzicj.zza(zzd2.zzb().zzA(), zzhfrVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhfm zzh(zzhwg zzhwgVar) throws GeneralSecurityException {
        if (zzhwgVar.equals(zzhwg.zzd)) {
            return zzhfm.zzd;
        }
        if (zzhwgVar.equals(zzhwg.zza)) {
            return zzhfm.zzb;
        }
        if (zzhwgVar.equals(zzhwg.zzb)) {
            return zzhfm.zze;
        }
        if (zzhwgVar.equals(zzhwg.zzc)) {
            return zzhfm.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhwgVar.toString()));
    }

    private static zzhwg zzi(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhwg.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhwg.zza;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhwg.zzb;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhwg.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhtj zzj(zzhwo zzhwoVar) {
        zzhti zzd2 = zzhtj.zzd();
        byte[] zzc2 = zzhwoVar.zzd().zzc();
        zzd2.zza(zziei.zzt(zzc2, 0, zzc2.length));
        return (zzhtj) zzd2.zzbu();
    }
}
