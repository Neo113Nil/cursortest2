package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@Deprecated
/* loaded from: classes13.dex */
public final class zzbjm {
    public static final void zza(zzbjl zzbjlVar, @Nullable zzbjj zzbjjVar) {
        if (zzbjjVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbjjVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbjlVar.zza(zzbjjVar.zzb(), zzbjjVar.zzc(), zzbjjVar.zza(), zzbjjVar.zzd());
    }
}
