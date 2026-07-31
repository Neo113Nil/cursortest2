package com.my.target.internal.api.internalnativead;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.d2;
import com.my.target.internal.api.InternalNativeAdFactory;
import com.my.target.r7;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class InternalAdFactoryProvider {
    @Nullable
    public static <T> T getFactory(@NonNull Context context, @NonNull Class<T> cls) {
        if (!d2.a(cls.getName())) {
            Log.d("InternalAdFactoryProv", "Partner dependency doesn't exist");
            return null;
        }
        try {
            if (cls == InternalNativeAdFactory.class) {
                return cls.cast(new r7(context));
            }
            Log.d("InternalAdFactoryProv", "Requested factory doesn't supported");
            return null;
        } catch (Exception unused) {
            Log.d("InternalAdFactoryProv", "Partner dependency doesn't exist");
            return null;
        }
    }
}
