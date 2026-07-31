package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSCommonDiff.java */
/* loaded from: classes3.dex */
public class l extends d {
    public boolean s = true;

    private com.mbridge.msdk.click.a q() {
        if (this.l == null) {
            this.l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.j);
        }
        return this.l;
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void b(JSONObject jSONObject) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(CampaignEx campaignEx, Context context) {
        int i;
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.m);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            i = Integer.parseInt(queryParameter);
            this.m.a(i == 2);
            q().a(this.m);
            q().a(campaignEx);
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        i = 0;
        this.m.a(i == 2);
        q().a(this.m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }
}
