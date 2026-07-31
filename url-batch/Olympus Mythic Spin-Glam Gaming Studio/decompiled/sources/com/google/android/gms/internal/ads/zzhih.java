package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhih {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhod zzc;
    private static final zzhoa zzd;
    private static final zzhna zze;
    private static final zzhmx zzf;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzhod.zzd(zzhig.zza, zzhic.class, zzhot.class);
        zzd = zzhoa.zzd(zzhid.zza, zza2, zzhot.class);
        zze = zzhna.zzd(zzhie.zza, zzhia.class, zzhos.class);
        zzf = zzhmx.zzd(zzhif.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzc);
        zzhnwVar.zze(zzd);
        zzhnwVar.zzb(zze);
        zzhnwVar.zzc(zzf);
    }

    static /* synthetic */ zzhot zzb(zzhic zzhicVar) {
        zzhfm zzf2 = zzf(zzhicVar.zzd());
        zzhuj zzc2 = zzhuk.zzc();
        zzc2.zza(zzhicVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzf2, ((zzhuk) zzc2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhic zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            return zzhic.zzb(zzhuk.zzb(zzhotVar.zzc().zzb(), zziew.zzb()).zza(), zzg(zzhotVar.zzd()));
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhia zzhiaVar, zzhfr zzhfrVar) {
        zzhuh zzd2 = zzhui.zzd();
        zzhuj zzc2 = zzhuk.zzc();
        zzc2.zza(zzhiaVar.zze().zzc());
        zzd2.zza((zzhuk) zzc2.zzbu());
        return zzhos.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhui) zzd2.zzbu()).zzaM(), zzhfl.zze, zzf(zzhiaVar.zze().zzd()), zzhiaVar.zzb());
    }

    static /* synthetic */ zzhia zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhui zzc2 = zzhui.zzc(zzhosVar.zzb(), zziew.zzb());
            if (zzc2.zza() == 0) {
                return zzhia.zzd(zzhic.zzb(zzc2.zzb().zza(), zzg(zzhosVar.zzd())), zzhosVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzhfm zzf(zzhib zzhibVar) throws GeneralSecurityException {
        if (zzhibVar.equals(zzhib.zza)) {
            return zzhfm.zzb;
        }
        if (zzhibVar.equals(zzhib.zzb)) {
            return zzhfm.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhibVar.toString()));
    }

    private static zzhib zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzb) {
            return zzhib.zza;
        }
        if (zzhfmVar == zzhfm.zzd) {
            return zzhib.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
