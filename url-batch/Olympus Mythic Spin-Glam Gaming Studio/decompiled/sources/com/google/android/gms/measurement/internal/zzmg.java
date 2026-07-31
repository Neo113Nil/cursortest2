package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes6.dex */
public final class zzmg {
    public static String zzb(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String zzc(Context context, String str, String str2) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = zzig.zza(context);
        }
        return zzig.zzb(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, resources, str2);
    }
}
