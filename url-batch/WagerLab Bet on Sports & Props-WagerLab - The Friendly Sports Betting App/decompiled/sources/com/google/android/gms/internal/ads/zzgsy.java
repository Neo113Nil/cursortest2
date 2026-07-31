package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgsy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgsx.zza, zzgsv.class, zzgpx.class);
    private static final zzgyd zzc = zzgsw.zza;
    private static final zzgqe zzd = zzgxs.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgpx.class, zzhds.SYMMETRIC, zzhdh.zze());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgwb.zza;
        zzgwb.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyf.zza().zzb(zzc, zzgta.class);
        zzgyk zza2 = zzgyk.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgta.zzb(zzgsz.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgta.zzb(zzgsz.zzc));
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzgxk.zza().zzb(zzd, true);
    }
}
