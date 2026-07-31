package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzarc extends zzaft {
    public zzarc(zzfj zzfjVar, long j, long j2) {
        super(new zzafo(), new zzarb(zzfjVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
