package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzglp implements zzglw {
    private final zzglw[] zza;

    zzglp(zzglw... zzglwVarArr) {
        this.zza = zzglwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final zzglv zzb(Class cls) {
        zzglw[] zzglwVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzglw zzglwVar = zzglwVarArr[i];
            if (zzglwVar.zzc(cls)) {
                return zzglwVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final boolean zzc(Class cls) {
        zzglw[] zzglwVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzglwVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
