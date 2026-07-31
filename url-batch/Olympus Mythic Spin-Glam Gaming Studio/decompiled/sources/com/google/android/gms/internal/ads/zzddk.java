package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzddk {
    @Nullable
    public static final zzcef zza(Context context, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, zzceb zzcebVar) {
        zzcec zzcecVar = zzfldVar.zzA;
        if (zzcecVar == null) {
            return null;
        }
        zzfli zzfliVar = zzfldVar.zzs;
        return new zzcea(context, versionInfoParcel, zzcecVar, zzfliVar == null ? null : zzfliVar.zzb, zzcebVar);
    }
}
