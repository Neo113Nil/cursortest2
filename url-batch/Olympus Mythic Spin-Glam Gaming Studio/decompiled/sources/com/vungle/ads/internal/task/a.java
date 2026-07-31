package com.vungle.ads.internal.task;

import android.os.Bundle;

/* loaded from: classes13.dex */
public final class a {
    public static f a(String str) {
        f fVar = new f("CleanupJob");
        fVar.e = 0;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        f a = fVar.a(bundle);
        a.b = str == null;
        return a;
    }
}
