package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ag, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3867ag {
    public static final boolean a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(permission) == 0;
    }
}
