package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcjf extends zzauz {
    static final zzcjf zzb = new zzcjf();

    zzcjf() {
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final zzavd zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzavf() : "mvhd".equals(str) ? new zzavg() : new zzavh(str);
    }
}
