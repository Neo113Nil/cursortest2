package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfvl extends zzftp {
    private final zzfvn zza;

    zzfvl(zzfvn zzfvnVar, int i) {
        super(zzfvnVar.size(), i);
        this.zza = zzfvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
