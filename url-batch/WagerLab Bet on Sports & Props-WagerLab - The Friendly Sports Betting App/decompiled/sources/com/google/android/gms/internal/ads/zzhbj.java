package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhbj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzhbi.zza, zzhad.class, zzgzk.class);
        zzd = zzgys.zzd(zzhbf.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzhbg.zza, zzgzw.class, zzgzj.class);
        zzf = zzgxn.zzd(zzhbh.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzhad zzhadVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhce zzd2 = zzhcf.zzd();
        zzd2.zzb(zzh(zzhadVar));
        zzd2.zza(zzhadVar.zzc());
        zze2.zzb(((zzhcf) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhadVar.zzf()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzhad zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhcf zzc2 = zzhcf.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            zzhab zzb2 = zzhad.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzc2.zzb().zza());
            zzb2.zzc(zzg(zzgzkVar.zzc().zzc()));
            return zzb2.zzd();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgzw zzgzwVar, zzgqt zzgqtVar) {
        zzhcc zze2 = zzhcd.zze();
        zze2.zzb(zzh(zzgzwVar.zze()));
        byte[] zzc2 = zzgzwVar.zzc().zzc(zzgqtVar);
        zze2.zza(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhcd) zze2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgzwVar.zze().zzf()), zzgzwVar.zzf());
    }

    static /* synthetic */ zzgzw zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhcd zzd2 = zzhcd.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhab zzb2 = zzhad.zzb();
            zzb2.zza(zzd2.zzb().zzc());
            zzb2.zzb(zzd2.zzc().zza());
            zzb2.zzc(zzg(zzgzjVar.zzd()));
            zzhad zzd3 = zzb2.zzd();
            zzgzv zzb3 = zzgzw.zzb();
            zzb3.zza(zzd3);
            zzb3.zzb(zzhgh.zza(zzd2.zzb().zzv(), zzgqtVar));
            zzb3.zzc(zzgzjVar.zze());
            return zzb3.zzd();
        } catch (zzhiw | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhep zzf(zzhac zzhacVar) throws GeneralSecurityException {
        if (zzhac.zza.equals(zzhacVar)) {
            return zzhep.TINK;
        }
        if (zzhac.zzb.equals(zzhacVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzhac.zzd.equals(zzhacVar)) {
            return zzhep.RAW;
        }
        if (zzhac.zzc.equals(zzhacVar)) {
            return zzhep.LEGACY;
        }
        String valueOf = String.valueOf(zzhacVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhac zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzhac.zza;
        }
        if (ordinal == 2) {
            return zzhac.zzc;
        }
        if (ordinal == 3) {
            return zzhac.zzd;
        }
        if (ordinal == 4) {
            return zzhac.zzb;
        }
        int zza2 = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhch zzh(zzhad zzhadVar) {
        zzhcg zzb2 = zzhch.zzb();
        zzb2.zza(zzhadVar.zzd());
        return (zzhch) zzb2.zzbu();
    }
}
