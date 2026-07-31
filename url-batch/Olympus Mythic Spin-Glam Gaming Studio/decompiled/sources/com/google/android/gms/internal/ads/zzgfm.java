package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgfm implements zzgfg {
    private final int zza;
    private final byte[] zzb;

    zzgfm(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfg
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfg
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
