package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: RewardResponseHandler.java */
/* loaded from: classes9.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String d = "c";
    private int a;
    private String b;
    private com.mbridge.msdk.foundation.same.report.metrics.c c;

    /* compiled from: RewardResponseHandler.java */
    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ String b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* compiled from: RewardResponseHandler.java */
        /* renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        class RunnableC1462a implements Runnable {
            final /* synthetic */ CampaignUnit a;

            RunnableC1462a(CampaignUnit campaignUnit) {
                this.a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.a.getAds().size() > 0) {
                    this.a.setMetricsData(c.this.c);
                    a aVar = a.this;
                    c.this.a(aVar.c, this.a);
                    c.this.saveRequestTime(this.a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.a.optString("msg");
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.d, msg, cVar.c);
            }
        }

        a(JSONObject jSONObject, String str, List list, int i) {
            this.a = jSONObject;
            this.b = str;
            this.c = list;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject optJSONObject = this.a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1462a("v5".equals(this.b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(optJSONObject, c.this.b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, c.this.b)));
        }
    }

    public abstract void a(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(d, "errorCode = " + aVar.a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.b);
        this.c.a(bVar);
        a(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.b) == null) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            b(aVar.b, eVar.c);
        } else if (i == 1) {
            a(aVar.b, eVar.c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(list, jSONObject, optInt, this.c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, optInt));
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit parseCampaignUnit;
        int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.b);
            } else {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.b);
            }
            if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = parseCampaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = parseCampaignUnit != null ? parseCampaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString("msg");
                }
                a(optInt, msg, this.c);
                return;
            }
        }
        a(list, jSONObject, optInt, this.c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b a2;
        String str = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String a3 = gVar.a();
                    if (!TextUtils.isEmpty(a3) && a3.equals("data_res_type")) {
                        str = gVar.b();
                    }
                }
            }
        }
        String str2 = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString("msg");
        if (!TextUtils.isEmpty(str) && str.equals("1")) {
            com.mbridge.msdk.foundation.error.b a4 = com.mbridge.msdk.foundation.error.a.a(880018, str2);
            if (cVar != null) {
                cVar.a(a4);
                cVar.c(true);
                if (TextUtils.isEmpty(str2)) {
                    str2 = a4.l();
                }
            }
            a(i, str2, cVar);
            return;
        }
        if (i == -1) {
            a2 = com.mbridge.msdk.foundation.error.a.a(880017, str2);
        } else {
            a2 = com.mbridge.msdk.foundation.error.a.a(880003, str2);
        }
        if (cVar != null) {
            cVar.a(a2);
            cVar.c(false);
            if (TextUtils.isEmpty(str2)) {
                str2 = a2.l();
            }
        }
        a(i, str2, cVar);
    }
}
