package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcko extends zzalm {
    static final zzcko zzb = new zzcko();

    zzcko() {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final zzalq zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzals() : "mvhd".equals(str) ? new zzalt() : new zzalu(str);
    }
}
