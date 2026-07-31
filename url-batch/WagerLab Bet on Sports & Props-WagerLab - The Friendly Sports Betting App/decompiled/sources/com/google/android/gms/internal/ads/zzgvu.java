package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgvu {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgvt.zza, zzgsu.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvq.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgvr.zza, zzgsn.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvs.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsu zzgsuVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhde zzd2 = zzhdf.zzd();
        zzd2.zza(zzgsuVar.zzc());
        zze2.zzb(((zzhdf) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgsuVar.zzd()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgsu zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhdf zzc2 = zzhdf.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgss zzb2 = zzgsu.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzg(zzgzkVar.zzc().zzc()));
            return zzb2.zzc();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgsn zzgsnVar, zzgqt zzgqtVar) {
        zzhdc zzd2 = zzhdd.zzd();
        byte[] zzc2 = zzgsnVar.zzd().zzc(zzgqtVar);
        zzd2.zza(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhdd) zzd2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgsnVar.zze().zzd()), zzgsnVar.zzf());
    }

    static /* synthetic */ zzgsn zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhdd zzc2 = zzhdd.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgss zzb2 = zzgsu.zzb();
            zzb2.zza(zzc2.zzb().zzc());
            zzb2.zzb(zzg(zzgzjVar.zzd()));
            zzgsu zzc3 = zzb2.zzc();
            zzgsm zzc4 = zzgsn.zzc();
            zzc4.zza(zzc3);
            zzc4.zzb(zzhgh.zza(zzc2.zzb().zzv(), zzgqtVar));
            zzc4.zzc(zzgzjVar.zze());
            return zzc4.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhep zzf(zzgst zzgstVar) throws GeneralSecurityException {
        if (zzgst.zza.equals(zzgstVar)) {
            return zzhep.TINK;
        }
        if (zzgst.zzb.equals(zzgstVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgst.zzc.equals(zzgstVar)) {
            return zzhep.RAW;
        }
        String valueOf = String.valueOf(zzgstVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzgst zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgst.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgst.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgst.zzb;
    }
}
