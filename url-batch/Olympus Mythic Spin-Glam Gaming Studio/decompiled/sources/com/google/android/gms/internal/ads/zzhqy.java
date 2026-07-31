package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhqy {
    public static final /* synthetic */ int zza = 0;
    private static final zzich zzb;
    private static final zzhmo zzc;
    private static final zzhod zzd;
    private static final zzhoa zze;
    private static final zzhna zzf;
    private static final zzhmx zzg;

    static {
        zzich zza2 = zzhpd.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzhmn zza3 = zzhmo.zza();
        zza3.zza(zzhtl.SHA1, zzhpx.zza);
        zza3.zza(zzhtl.SHA224, zzhpx.zzb);
        zza3.zza(zzhtl.SHA256, zzhpx.zzc);
        zza3.zza(zzhtl.SHA384, zzhpx.zzd);
        zza3.zza(zzhtl.SHA512, zzhpx.zze);
        zzc = zza3.zzb();
        zzd = zzhod.zzd(zzhqx.zza, zzhpz.class, zzhot.class);
        zze = zzhoa.zzd(zzhqu.zza, zza2, zzhot.class);
        zzf = zzhna.zzd(zzhqv.zza, zzhpq.class, zzhos.class);
        zzg = zzhmx.zzd(zzhqw.zza, zza2, zzhos.class);
    }

    public static void zza(zzhnw zzhnwVar) throws GeneralSecurityException {
        zzhnwVar.zzd(zzd);
        zzhnwVar.zze(zze);
        zzhnwVar.zzb(zzf);
        zzhnwVar.zzc(zzg);
    }

    static /* synthetic */ zzhot zzb(zzhpz zzhpzVar) {
        zzhfm zzf2 = zzf(zzhpzVar.zzf());
        zzhto zze2 = zzhtp.zze();
        zze2.zza(zzh(zzhpzVar));
        zze2.zzb(zzhpzVar.zzc());
        return zzhot.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzf2, ((zzhtp) zze2.zzbu()).zzaM());
    }

    static /* synthetic */ zzhpz zzc(zzhot zzhotVar) {
        if (!zzhotVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhotVar.zzc().zza())));
        }
        try {
            zzhtp zzd2 = zzhtp.zzd(zzhotVar.zzc().zzb(), zziew.zzb());
            if (zzd2.zzc() != 0) {
                int zzc2 = zzd2.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(zzc2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhpw zzb2 = zzhpz.zzb();
            zzb2.zza(zzd2.zzb());
            zzb2.zzb(zzd2.zza().zzb());
            zzb2.zzd((zzhpx) zzc.zzc(zzd2.zza().zza()));
            zzb2.zzc(zzg(zzhotVar.zzd()));
            return zzb2.zze();
        } catch (zzige e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhos zzd(zzhpq zzhpqVar, zzhfr zzhfrVar) {
        zzhtm zze2 = zzhtn.zze();
        zze2.zza(zzh(zzhpqVar.zzf()));
        byte[] zzc2 = zzhpqVar.zzd().zzc(zzhfrVar);
        zze2.zzb(zziei.zzt(zzc2, 0, zzc2.length));
        return zzhos.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhtn) zze2.zzbu()).zzaM(), zzhfl.zzb, zzf(zzhpqVar.zzf().zzf()), zzhpqVar.zzb());
    }

    static /* synthetic */ zzhpq zze(zzhos zzhosVar, zzhfr zzhfrVar) {
        if (!zzhosVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhtn zzd2 = zzhtn.zzd(zzhosVar.zzb(), zziew.zzb());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpw zzb2 = zzhpz.zzb();
            zzb2.zza(zzd2.zzc().zzb());
            zzb2.zzb(zzd2.zzb().zzb());
            zzb2.zzd((zzhpx) zzc.zzc(zzd2.zzb().zza()));
            zzb2.zzc(zzg(zzhosVar.zzd()));
            zzhpz zze2 = zzb2.zze();
            zzhpp zzc2 = zzhpq.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(zzicj.zza(zzd2.zzc().zzA(), zzhfrVar));
            zzc2.zzc(zzhosVar.zze());
            return zzc2.zzd();
        } catch (zzige | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhfm zzf(zzhpy zzhpyVar) throws GeneralSecurityException {
        if (zzhpyVar == zzhpy.zzd) {
            return zzhfm.zzd;
        }
        if (zzhpyVar == zzhpy.zza) {
            return zzhfm.zzb;
        }
        if (zzhpyVar == zzhpy.zzc) {
            return zzhfm.zzc;
        }
        if (zzhpyVar == zzhpy.zzb) {
            return zzhfm.zze;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(zzhpyVar)));
    }

    private static zzhpy zzg(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            return zzhpy.zzd;
        }
        if (zzhfmVar == zzhfm.zzb) {
            return zzhpy.zza;
        }
        if (zzhfmVar == zzhfm.zzc) {
            return zzhpy.zzc;
        }
        if (zzhfmVar == zzhfm.zze) {
            return zzhpy.zzb;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(zzhfmVar.toString()));
    }

    private static zzhtr zzh(zzhpz zzhpzVar) throws GeneralSecurityException {
        zzhtq zzc2 = zzhtr.zzc();
        zzc2.zzb(zzhpzVar.zzd());
        zzc2.zza((zzhtl) zzc.zzb(zzhpzVar.zzg()));
        return (zzhtr) zzc2.zzbu();
    }
}
