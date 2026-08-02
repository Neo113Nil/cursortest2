package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfvc extends zzfvf {
    zzfvc(zzfvd zzfvdVar, zzfvh zzfvhVar, CharSequence charSequence) {
        super(zzfvhVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
