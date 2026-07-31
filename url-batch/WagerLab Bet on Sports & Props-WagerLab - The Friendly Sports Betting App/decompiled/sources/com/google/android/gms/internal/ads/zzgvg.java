package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgvg {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgvf.zza, zzgsc.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvc.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgvd.zza, zzgrw.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgve.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsc zzgscVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhcu zzd2 = zzhcv.zzd();
        zzd2.zza(zzh(zzgscVar));
        zzd2.zzb(zzgscVar.zzc());
        zze2.zzb(((zzhcv) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgscVar.zze()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgsc zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhcv zzc2 = zzhcv.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            zzgsa zzb2 = zzgsc.zzb();
            zzb2.zza(zzc2.zzb());
            zzb2.zzb(zzc2.zza().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzgzkVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgrw zzgrwVar, zzgqt zzgqtVar) {
        zzhcs zze2 = zzhct.zze();
        zze2.zza(zzh(zzgrwVar.zze()));
        byte[] zzc2 = zzgrwVar.zzd().zzc(zzgqtVar);
        zze2.zzb(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhct) zze2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgrwVar.zze().zze()), zzgrwVar.zzf());
    }

    static /* synthetic */ zzgrw zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhct zzd2 = zzhct.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsa zzb2 = zzgsc.zzb();
            zzb2.zza(zzd2.zzc().zzc());
            zzb2.zzb(zzd2.zzb().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzgzjVar.zzd()));
            zzgsc zze2 = zzb2.zze();
            zzgrv zzc2 = zzgrw.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(zzhgh.zza(zzd2.zzc().zzv(), zzgqtVar));
            zzc2.zzc(zzgzjVar.zze());
            return zzc2.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzhep zzf(zzgsb zzgsbVar) throws GeneralSecurityException {
        if (zzgsb.zza.equals(zzgsbVar)) {
            return zzhep.TINK;
        }
        if (zzgsb.zzb.equals(zzgsbVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsb.zzc.equals(zzgsbVar)) {
            return zzhep.RAW;
        }
        String valueOf = String.valueOf(zzgsbVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzgsb zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgsb.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgsb.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsb.zzb;
    }

    private static zzhcx zzh(zzgsc zzgscVar) throws GeneralSecurityException {
        zzhcw zzb2 = zzhcx.zzb();
        zzb2.zza(zzgscVar.zzd());
        return (zzhcx) zzb2.zzbu();
    }
}
