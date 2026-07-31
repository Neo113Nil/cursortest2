package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> zza = zzt.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            throw new RuntimeException("Invalid idToken " + str);
        }
        try {
            return zzahw.zza(new String(Base64Utils.decodeUrlSafeNoPadding(zza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
