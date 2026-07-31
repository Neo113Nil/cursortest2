package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.MyTargetConfig;
import com.my.tracker.MyTracker;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
final class qc extends t4 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        public static final String a;

        static {
            String str;
            try {
                str = MyTracker.getTrackerConfig().getId();
            } catch (Throwable th) {
                mi.a("MyTrackerHelper: Error occurred while working with myTracker, " + th.getMessage());
            }
            if (TextUtils.isEmpty(str)) {
                mi.a("MyTrackerHelper: myTracker id is empty");
                str = null;
            }
            a = str;
        }
    }

    qc() {
    }

    Map a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        String str = a.a;
        if (str != null) {
            hashMap.put("mtr_id", str);
        }
        return hashMap;
    }
}
