package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Lb {
    public final void a(@Nullable Map<String, String> map, boolean z) {
        if (z && TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().k()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.p.h().f(str);
                    return;
                }
            }
        }
    }
}
