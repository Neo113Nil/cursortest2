package com.mbridge.msdk.interstitial.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: InterstitialCamapignCache.java */
/* loaded from: classes10.dex */
public class a {
    private static final String b = "com.mbridge.msdk.interstitial.cache.a";
    private static a c;
    private e a;

    private a() {
        try {
            Context d = c.n().d();
            if (d != null) {
                this.a = e.a(g.a(d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void b(CampaignEx campaignEx, String str) {
        try {
            if (this.a == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.a.a(campaignEx, str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CampaignEx> a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.a.a(str, i, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator<CampaignEx> it = a.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.a.e(campaignEx.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(List<CampaignEx> list, String str) {
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), str);
        }
    }

    public void a(String str, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return;
            }
            Iterator<CampaignEx> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void a(long j, String str) {
        try {
            if (this.a != null && j != 0 && !TextUtils.isEmpty(str)) {
                this.a.a(j, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            q0.b(b, e.getMessage());
        }
    }
}
