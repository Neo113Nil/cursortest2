package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzpy {
    public static void zza(AudioTrack audioTrack, zzon zzonVar) {
        audioTrack.setPreferredDevice(zzonVar == null ? null : zzonVar.zza);
    }
}
