package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgza implements zzgzh {
    private final zzgzh[] zza;

    zzgza(zzgzh... zzgzhVarArr) {
        this.zza = zzgzhVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final zzgzg zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgzh zzgzhVar = this.zza[i];
            if (zzgzhVar.zzc(cls)) {
                return zzgzhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
