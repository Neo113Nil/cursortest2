package com.mbridge.msdk.mbnative.service.net;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeResponseHandler.java */
/* loaded from: classes12.dex */
public abstract class b extends c<JSONObject> {
    private int a;
    private String b;

    /* compiled from: NativeResponseHandler.java */
    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ String b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* compiled from: NativeResponseHandler.java */
        /* renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        class RunnableC1439a implements Runnable {
            final /* synthetic */ CampaignUnit a;

            RunnableC1439a(CampaignUnit campaignUnit) {
                this.a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.d, aVar.a.optString("msg"));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.c, this.a);
                    b.this.saveRequestTime(this.a.getAds().size());
                }
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
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1439a("v5".equals(this.b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(optJSONObject) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject)));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbnative/service/net/b;->a(Ljava/util/List;Lorg/json/JSONObject;)V");
        BrandSafetyUtils.onMintegralNativeController(this, jSONObject);
        safedk_b_a_2fdb1bea85f44b445bbad20b72619ad3(list, jSONObject);
    }

    private void b(List<g> list, JSONObject jSONObject) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbnative/service/net/b;->b(Ljava/util/List;Lorg/json/JSONObject;)V");
        BrandSafetyUtils.onMintegralNativeController(this, jSONObject);
        safedk_b_b_89595a4281019aa9433291627d9c3c28(list, jSONObject);
    }

    public abstract void a(int i, String str);

    public void a(String str) {
        this.b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
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

    private void safedk_b_b_89595a4281019aa9433291627d9c3c28(List<g> list, JSONObject p1) {
        int optInt = p1.optInt("status");
        if (1 != optInt) {
            a(optInt, p1.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(p1, p1.optString("version"), list, optInt));
    }

    public void a(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    private void safedk_b_a_2fdb1bea85f44b445bbad20b72619ad3(List<g> list, JSONObject p1) {
        CampaignUnit parseCampaignUnit;
        int optInt = p1.optInt("status");
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(p1.optString("version"))) {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(p1.optJSONObject("data"));
            } else {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(p1.optJSONObject("data"));
            }
            if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                List p0 = parseCampaignUnit.getListFrames();
                a((List<Frame>) p0);
                List p02 = parseCampaignUnit.getListFrames();
                saveRequestTime(p02.size());
                return;
            }
            a(optInt, p1.optString("msg"));
            return;
        }
        a(optInt, p1.optString("msg"));
    }
}
