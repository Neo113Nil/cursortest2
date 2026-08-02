package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsf implements zzgsm {
    private final zzgsm[] zza;

    zzgsf(zzgsm... zzgsmVarArr) {
        this.zza = zzgsmVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final zzgsl zzb(Class cls) {
        zzgsm[] zzgsmVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgsm zzgsmVar = zzgsmVarArr[i];
            if (zzgsmVar.zzc(cls)) {
                return zzgsmVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgsm
    public final boolean zzc(Class cls) {
        zzgsm[] zzgsmVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgsmVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
