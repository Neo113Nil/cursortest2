package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzg {
    public static void zza(AudioAttributes.Builder builder, int i) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
