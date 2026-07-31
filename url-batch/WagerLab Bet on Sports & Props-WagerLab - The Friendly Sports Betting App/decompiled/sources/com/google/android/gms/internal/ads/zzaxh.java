package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaxh extends zzaxl {
    public zzaxh(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", zzarwVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzarw zzarwVar = this.zzd;
        zzarwVar.zzae(3);
        boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzarwVar) {
            if (booleanValue) {
                zzarwVar.zzae(2);
            } else {
                zzarwVar.zzae(1);
            }
        }
    }
}
