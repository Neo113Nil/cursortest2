package com.mbridge.msdk.video.module.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;

/* compiled from: RewardDynamicViewReporter.java */
/* loaded from: classes12.dex */
public final class a {
    public static void a(String str, CampaignEx campaignEx, e eVar) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str) || campaignEx == null || eVar == null) {
            return;
        }
        try {
            String mof_template_url = campaignEx.getMof_template_url();
            String str4 = "";
            if (TextUtils.isEmpty(mof_template_url)) {
                str2 = "";
                str3 = str2;
            } else {
                str3 = c1.a(mof_template_url, "cltp");
                str2 = c1.a(mof_template_url, "xt");
            }
            if (!TextUtils.isEmpty(str3)) {
                eVar.a("cltp", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a("xt", str2);
            }
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                String j = rewardTemplateMode.j();
                if (!TextUtils.isEmpty(j)) {
                    str4 = c1.a(j, "alecfc");
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                eVar.a("alecfc", str4);
            }
            d.b().a(str, campaignEx, eVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
