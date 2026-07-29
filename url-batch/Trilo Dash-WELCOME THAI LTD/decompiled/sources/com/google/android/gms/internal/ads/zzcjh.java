package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcjh extends zzakk {
    static final zzcjh zzb = new zzcjh();

    zzcjh() {
    }

    @Override // com.google.android.gms.internal.ads.zzakk
    public final zzako zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzakq() : "mvhd".equals(str) ? new zzakr() : new zzaks(str);
    }
}
