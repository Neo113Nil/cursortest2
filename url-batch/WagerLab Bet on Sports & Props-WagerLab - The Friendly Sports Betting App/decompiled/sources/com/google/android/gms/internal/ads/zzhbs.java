package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhbs {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgxh zzc;
    private static final zzgxh zzd;
    private static final zzgyv zze;
    private static final zzgys zzf;
    private static final zzgxq zzg;
    private static final zzgxn zzh;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzgxg zza3 = zzgxh.zza();
        zza3.zza(zzhep.RAW, zzhaq.zzd);
        zza3.zza(zzhep.TINK, zzhaq.zza);
        zza3.zza(zzhep.LEGACY, zzhaq.zzc);
        zza3.zza(zzhep.CRUNCHY, zzhaq.zzb);
        zzc = zza3.zzb();
        zzgxg zza4 = zzgxh.zza();
        zza4.zza(zzhdk.SHA1, zzhap.zza);
        zza4.zza(zzhdk.SHA224, zzhap.zzb);
        zza4.zza(zzhdk.SHA256, zzhap.zzc);
        zza4.zza(zzhdk.SHA384, zzhap.zzd);
        zza4.zza(zzhdk.SHA512, zzhap.zze);
        zzd = zza4.zzb();
        zze = zzgyv.zzd(zzhbr.zza, zzhar.class, zzgzk.class);
        zzf = zzgys.zzd(zzhbo.zza, zza2, zzgzk.class);
        zzg = zzgxq.zzd(zzhbp.zza, zzhai.class, zzgzj.class);
        zzh = zzgxn.zzd(zzhbq.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zze);
        zzgyoVar.zze(zzf);
        zzgyoVar.zzb(zzg);
        zzgyoVar.zzc(zzh);
    }

    static /* synthetic */ zzgzk zzb(zzhar zzharVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhdn zze3 = zzhdo.zze();
        zze3.zza(zzf(zzharVar));
        zze3.zzb(zzharVar.zzc());
        zze2.zzb(((zzhdo) zze3.zzbu()).zzaM());
        zze2.zzc((zzhep) zzc.zzb(zzharVar.zzf()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzhar zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhdo zzd2 = zzhdo.zzd(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzd2.zzc() != 0) {
                int zzc2 = zzd2.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(zzc2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhao zzb2 = zzhar.zzb();
            zzb2.zza(zzd2.zzb());
            zzb2.zzb(zzd2.zza().zzb());
            zzb2.zzd((zzhap) zzd.zzc(zzd2.zza().zza()));
            zzb2.zzc((zzhaq) zzc.zzc(zzgzkVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzhai zzhaiVar, zzgqt zzgqtVar) {
        zzhdl zze2 = zzhdm.zze();
        zze2.zza(zzf(zzhaiVar.zze()));
        byte[] zzc2 = zzhaiVar.zzc().zzc(zzgqtVar);
        zze2.zzb(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhdm) zze2.zzbu()).zzaM(), zzhds.SYMMETRIC, (zzhep) zzc.zzb(zzhaiVar.zze().zzf()), zzhaiVar.zzf());
    }

    static /* synthetic */ zzhai zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhdm zzd2 = zzhdm.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhao zzb2 = zzhar.zzb();
            zzb2.zza(zzd2.zzc().zzc());
            zzb2.zzb(zzd2.zzb().zzb());
            zzb2.zzd((zzhap) zzd.zzc(zzd2.zzb().zza()));
            zzb2.zzc((zzhaq) zzc.zzc(zzgzjVar.zzd()));
            zzhar zze2 = zzb2.zze();
            zzhah zzb3 = zzhai.zzb();
            zzb3.zza(zze2);
            zzb3.zzb(zzhgh.zza(zzd2.zzc().zzv(), zzgqtVar));
            zzb3.zzc(zzgzjVar.zze());
            return zzb3.zzd();
        } catch (zzhiw | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhdq zzf(zzhar zzharVar) throws GeneralSecurityException {
        zzhdp zzc2 = zzhdq.zzc();
        zzc2.zzb(zzharVar.zzd());
        zzc2.zza((zzhdk) zzd.zzb(zzharVar.zzg()));
        return (zzhdq) zzc2.zzbu();
    }
}
