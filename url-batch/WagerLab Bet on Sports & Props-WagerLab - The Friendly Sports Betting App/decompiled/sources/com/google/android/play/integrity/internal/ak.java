package com.google.android.play.integrity.internal;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class ak extends aj {
    public static boolean a(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
