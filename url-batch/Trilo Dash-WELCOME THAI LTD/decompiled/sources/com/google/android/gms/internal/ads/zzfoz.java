package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfoz extends zzfpc {
    final /* synthetic */ zzfpa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfoz(zzfpa zzfpaVar, zzfpe zzfpeVar, CharSequence charSequence) {
        super(zzfpeVar, charSequence);
        this.zza = zzfpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
