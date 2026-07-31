package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzccd extends zzaqo {
    static final zzccd zzb = new zzccd();

    zzccd() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final zzaqs zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzaqu() : "mvhd".equals(str) ? new zzaqv() : new zzaqw(str);
    }
}
