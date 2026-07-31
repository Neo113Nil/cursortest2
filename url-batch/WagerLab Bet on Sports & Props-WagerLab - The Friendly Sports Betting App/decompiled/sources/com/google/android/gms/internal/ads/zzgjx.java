package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgjx extends zzgib {
    private final zzgjz zza;

    zzgjx(zzgjz zzgjzVar, int i) {
        super(zzgjzVar.size(), i);
        this.zza = zzgjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgib
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
