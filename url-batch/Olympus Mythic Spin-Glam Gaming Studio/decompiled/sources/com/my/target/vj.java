package com.my.target;

import android.content.Context;
import android.graphics.Point;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
class vj extends t4 {
    vj() {
    }

    Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        Point c = qi.c(context);
        int i = c.x;
        int i2 = c.y;
        if (i != 0 && i2 != 0) {
            hashMap.put("vpw", String.valueOf(i));
            hashMap.put("vph", String.valueOf(i2));
        }
        return hashMap;
    }
}
