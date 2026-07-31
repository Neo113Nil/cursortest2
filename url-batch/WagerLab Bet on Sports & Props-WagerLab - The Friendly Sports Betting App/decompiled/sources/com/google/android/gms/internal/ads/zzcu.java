package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcu {
    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String zza(String str) {
        zzghc.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
