package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgbu {
    @Nullable
    public static Object zza(String str, String str2, zzgbt... zzgbtVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
    }
}
