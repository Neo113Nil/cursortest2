package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzftf extends zzfti {
    final /* synthetic */ zzftg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzftf(zzftg zzftgVar, zzftk zzftkVar, CharSequence charSequence) {
        super(zzftkVar, charSequence);
        this.zza = zzftgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
