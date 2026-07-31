package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgtz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgty.zza, zzgtu.class, zzgzk.class);
        zzd = zzgys.zzd(zzgtv.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgtw.zza, zzgtq.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgtx.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgtu zzgtuVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zze2.zzb(zzg(zzgtuVar).zzaM());
        zze2.zzc(zzf(zzgtuVar.zzc()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgtu zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            return zzh(zzheo.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza()), zzgzkVar.zzc().zzc());
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgtq zzgtqVar, zzgqt zzgqtVar) {
        zzhel zzd2 = zzhem.zzd();
        zzd2.zza(zzg(zzgtqVar.zzd()));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhem) zzd2.zzbu()).zzaM(), zzhds.REMOTE, zzf(zzgtqVar.zzd().zzc()), zzgtqVar.zze());
    }

    static /* synthetic */ zzgtq zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhem zzc2 = zzhem.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() == 0) {
                return zzgtq.zzc(zzh(zzc2.zzb(), zzgzjVar.zzd()), zzgzjVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhep zzf(zzgtt zzgttVar) throws GeneralSecurityException {
        if (zzgtt.zza.equals(zzgttVar)) {
            return zzhep.TINK;
        }
        if (zzgtt.zzb.equals(zzgttVar)) {
            return zzhep.RAW;
        }
        String valueOf = String.valueOf(zzgttVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzheo zzg(zzgtu zzgtuVar) throws GeneralSecurityException {
        try {
            zzhdw zzd2 = zzhdw.zzd(zzgqu.zza(zzgtuVar.zzd()), zzhhr.zza());
            zzhen zzd3 = zzheo.zzd();
            zzd3.zza(zzgtuVar.zzb());
            zzd3.zzb(zzd2);
            return (zzheo) zzd3.zzbu();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgtu zzh(zzheo zzheoVar, zzhep zzhepVar) throws GeneralSecurityException {
        zzgts zzgtsVar;
        zzgtt zzgttVar;
        zzhdv zze2 = zzhdw.zze();
        zze2.zza(zzheoVar.zzb().zza());
        zze2.zzb(zzheoVar.zzb().zzb());
        zze2.zzc(zzhep.RAW);
        zzgqs zzb2 = zzgqu.zzb(((zzhdw) zze2.zzbu()).zzaN());
        if (zzb2 instanceof zzgsl) {
            zzgtsVar = zzgts.zza;
        } else if (zzb2 instanceof zzgta) {
            zzgtsVar = zzgts.zzc;
        } else if (zzb2 instanceof zzguw) {
            zzgtsVar = zzgts.zzb;
        } else if (zzb2 instanceof zzgru) {
            zzgtsVar = zzgts.zzd;
        } else if (zzb2 instanceof zzgsc) {
            zzgtsVar = zzgts.zze;
        } else {
            if (!(zzb2 instanceof zzgsu)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzb2.toString()));
            }
            zzgtsVar = zzgts.zzf;
        }
        zzgtr zzgtrVar = new zzgtr(null);
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            zzgttVar = zzgtt.zza;
        } else {
            if (ordinal != 3) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzgttVar = zzgtt.zzb;
        }
        zzgtrVar.zza(zzgttVar);
        zzgtrVar.zzb(zzheoVar.zza());
        zzgtrVar.zzd((zzgrg) zzb2);
        zzgtrVar.zzc(zzgtsVar);
        return zzgtrVar.zze();
    }
}
