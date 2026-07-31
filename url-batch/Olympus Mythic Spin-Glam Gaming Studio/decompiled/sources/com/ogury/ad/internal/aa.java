package com.ogury.ad.internal;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class aa {
    public final kf a;
    public final Class b;
    public final ArrayList c;
    public final ArrayList d;

    public aa(kf overlayActivityConfig, Class showActivityClass) {
        Intrinsics.checkNotNullParameter(overlayActivityConfig, "overlayActivityConfig");
        Intrinsics.checkNotNullParameter(showActivityClass, "showActivityClass");
        this.a = overlayActivityConfig;
        this.b = showActivityClass;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (!overlayActivityConfig.e.isEmpty()) {
            arrayList2.addAll(overlayActivityConfig.e);
        }
        if (overlayActivityConfig.d.isEmpty()) {
            return;
        }
        arrayList.addAll(overlayActivityConfig.d);
    }

    public final boolean a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof o8) {
            return false;
        }
        if (!this.a.f && !Intrinsics.areEqual(activity.getClass(), this.b)) {
            return false;
        }
        String a = gb.a((Object) activity);
        ArrayList arrayList = this.d;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (StringsKt.startsWith$default(a, (String) obj, false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        String a2 = gb.a((Object) activity);
        ArrayList arrayList2 = this.c;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                if (StringsKt.startsWith$default(a2, (String) obj2, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
