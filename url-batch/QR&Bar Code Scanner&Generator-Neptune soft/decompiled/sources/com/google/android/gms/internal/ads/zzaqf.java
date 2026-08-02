package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaqf {
    static zzgas zza;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0033, code lost:
    
        if (r0 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zza(zzaqe zzaqeVar) throws IllegalAccessException, InvocationTargetException {
        Method zzj;
        zzgas zza2;
        if (zza != null) {
            return true;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcv);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzaqeVar != null && (zzj = zzaqeVar.zzj("hwvIMOeohSBrCWT4pVkQok22g/l0cZbbqOTmNbjObWwcwhLlaFMNibQmd2cIB1Vb", "24f7+wNdQe8HQwz0gPH2QIzxUp8iQNA20yBU7Dg74Sc=")) != null) {
                str = (String) zzj.invoke(null, new Object[0]);
            }
        }
        try {
            zzgbf zza3 = zzgbk.zza(zzanp.zzb(str, true));
            for (zzgmf zzgmfVar : zzgef.zza.zzd()) {
                if (zzgmfVar.zzf().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzgmfVar.zze().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzgmfVar.zzd().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzgmfVar.zzd().equals("TinkAead") && !zzgmfVar.zzd().equals("TinkMac") && !zzgmfVar.zzd().equals("TinkHybridDecrypt") && !zzgmfVar.zzd().equals("TinkHybridEncrypt") && !zzgmfVar.zzd().equals("TinkPublicKeySign") && !zzgmfVar.zzd().equals("TinkPublicKeyVerify") && !zzgmfVar.zzd().equals("TinkStreamingAead") && !zzgmfVar.zzd().equals("TinkDeterministicAead")) {
                    zzgan zza4 = zzgby.zza(zzgmfVar.zzd());
                    zzgby.zzo(zza4.zza());
                    zzgmfVar.zzf();
                    zzgmfVar.zze();
                    zzgmfVar.zza();
                    zzgby.zzm(zza4.zzb(), zzgmfVar.zzg());
                }
            }
            zza2 = zzgei.zza(zza3);
            zza = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
