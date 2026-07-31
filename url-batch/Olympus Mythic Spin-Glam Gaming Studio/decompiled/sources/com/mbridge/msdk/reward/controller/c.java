package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RewardVideoControllerInitTask.java */
/* loaded from: classes6.dex */
public class c implements Runnable {
    private final Context a;
    private final String b;

    public c(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> c;
        if (this.a == null || TextUtils.isEmpty(this.b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.report.a.a(this.a, this.b);
            o0.a();
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
            o0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.setting.b.b().b(this.b);
            if (s0.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.b) || (c = com.mbridge.msdk.videocommon.cache.a.a().c(this.b, 1)) == null || c.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.a, this.b, c, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e);
            }
        }
    }
}
