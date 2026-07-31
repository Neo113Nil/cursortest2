package com.google.android.gms.internal.mlkit_code_scanner;

/* compiled from: com.google.android.gms:play-services-code-scanner@@16.1.0 */
/* loaded from: classes5.dex */
public final class zzoj {
    private static zzoi zza;

    public static synchronized zzny zza(zznt zzntVar) {
        zzny zznyVar;
        synchronized (zzoj.class) {
            if (zza == null) {
                zza = new zzoi(null);
            }
            zznyVar = (zzny) zza.get(zzntVar);
        }
        return zznyVar;
    }

    public static synchronized zzny zzb(String str) {
        zzny zza2;
        synchronized (zzoj.class) {
            zza2 = zza(zznt.zzd("play-services-code-scanner").zzd());
        }
        return zza2;
    }
}
