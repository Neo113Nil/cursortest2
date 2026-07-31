package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public abstract class zzbgi {

    @Nullable
    private static MessageDigest zzb;
    protected final Object zza = new Object();

    abstract byte[] zza(String str);

    @Nullable
    protected final MessageDigest zzb() {
        synchronized (this.zza) {
            MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }
}
