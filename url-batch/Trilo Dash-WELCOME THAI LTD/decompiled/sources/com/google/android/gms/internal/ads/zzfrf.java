package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfrf extends zzfpj {
    private final zzfrh zza;

    zzfrf(zzfrh zzfrhVar, int i) {
        super(zzfrhVar.size(), i);
        this.zza = zzfrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
