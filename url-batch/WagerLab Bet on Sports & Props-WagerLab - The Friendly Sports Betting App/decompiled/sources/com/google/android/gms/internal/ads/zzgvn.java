package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgvn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgvm.zza, zzgsl.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvj.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgvk.zza, zzgse.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvl.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsl zzgslVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhda zzd2 = zzhdb.zzd();
        zzd2.zza(zzgslVar.zzc());
        zze2.zzb(((zzhdb) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgslVar.zzd()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgsl zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhdb zzc2 = zzhdb.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgsj zzb2 = zzgsl.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzgzkVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgse zzgseVar, zzgqt zzgqtVar) {
        zzhcy zzd2 = zzhcz.zzd();
        byte[] zzc2 = zzgseVar.zzd().zzc(zzgqtVar);
        zzd2.zza(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhcz) zzd2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgseVar.zze().zzd()), zzgseVar.zzf());
    }

    static /* synthetic */ zzgse zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhcz zzc2 = zzhcz.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsj zzb2 = zzgsl.zzb();
            zzb2.zza(zzc2.zzb().zzc());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzgzjVar.zzd()));
            zzgsl zze2 = zzb2.zze();
            zzgsd zzc3 = zzgse.zzc();
            zzc3.zza(zze2);
            zzc3.zzb(zzhgh.zza(zzc2.zzb().zzv(), zzgqtVar));
            zzc3.zzc(zzgzjVar.zze());
            return zzc3.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhep zzf(zzgsk zzgskVar) throws GeneralSecurityException {
        if (zzgsk.zza.equals(zzgskVar)) {
            return zzhep.TINK;
        }
        if (zzgsk.zzb.equals(zzgskVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsk.zzc.equals(zzgskVar)) {
            return zzhep.RAW;
        }
        String valueOf = String.valueOf(zzgskVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzgsk zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgsk.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgsk.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsk.zzb;
    }
}
