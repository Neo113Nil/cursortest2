package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbez {
    private static final zzgkr zza = new zzbex();

    public static int zza(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 1000) {
            return 0;
        }
        return PointerIconCompat.TYPE_CONTEXT_MENU;
    }
}
