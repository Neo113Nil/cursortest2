package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: SettingRequestDiff.java */
/* loaded from: classes6.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(O6.X0, g.d());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
