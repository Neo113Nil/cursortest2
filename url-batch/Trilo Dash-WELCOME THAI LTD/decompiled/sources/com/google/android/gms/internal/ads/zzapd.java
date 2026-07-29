package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzapd {
    static zzfwl zza;

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0033, code lost:
    
        if (r0 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zza(zzapc zzapcVar) throws IllegalAccessException, InvocationTargetException {
        Method zzj;
        zzfwl zza2;
        if (zza != null) {
            return true;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcs);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzapcVar != null && (zzj = zzapcVar.zzj("kbdrv8tsziKs0Eek7BsM4U0iKocTYc9jJCZMuz5pfY858GShsX2u88zYbIs2mx+G", "XcryxQHEcO2NLi7jWtJQeOEAAGF+i46DQLx722/7X2w=")) != null) {
                str = (String) zzj.invoke(null, new Object[0]);
            }
        }
        try {
            zzfwr zza3 = zzfww.zza(zzamn.zzb(str, true));
            for (zzgfp zzgfpVar : zzfzp.zza.zzd()) {
                if (zzgfpVar.zzf().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzgfpVar.zze().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzgfpVar.zzd().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzgfpVar.zzd().equals("TinkAead") && !zzgfpVar.zzd().equals("TinkMac") && !zzgfpVar.zzd().equals("TinkHybridDecrypt") && !zzgfpVar.zzd().equals("TinkHybridEncrypt") && !zzgfpVar.zzd().equals("TinkPublicKeySign") && !zzgfpVar.zzd().equals("TinkPublicKeyVerify") && !zzgfpVar.zzd().equals("TinkStreamingAead") && !zzgfpVar.zzd().equals("TinkDeterministicAead")) {
                    zzfwg zza4 = zzfxi.zza(zzgfpVar.zzd());
                    zzfxi.zzn(zza4.zza());
                    zzgfpVar.zzf();
                    zzgfpVar.zze();
                    zzgfpVar.zza();
                    zzfxi.zzl(zza4.zzb(), zzgfpVar.zzg());
                }
            }
            zza2 = zzfzs.zza(zza3);
            zza = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
