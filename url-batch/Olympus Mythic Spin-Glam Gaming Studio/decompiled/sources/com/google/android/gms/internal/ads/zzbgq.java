package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgq extends zzbgi {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbgq(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest zzb = zzb();
                this.zzb = zzb;
                if (zzb == null) {
                    return new byte[0];
                }
                zzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.zzb.digest();
                int length = digest.length;
                int i = this.zzc;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i2 = this.zzd & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
