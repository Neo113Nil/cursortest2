package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k implements j {
    public final o a;

    public k(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        float parseFloat;
        double parseDouble;
        Long valueOf;
        bVar.a.A = false;
        IAConfigManager.N.w.f = false;
        ImpressionData impressionData = new ImpressionData();
        Map b = this.a.b();
        String a = a(b, n.RETURNED_AD_TYPE);
        a(b, n.ERROR_CODE);
        String a2 = a(b, n.SESSION_ID);
        String a3 = a(b, n.CONTENT_ID);
        a(b, n.PUBLISHER_ID);
        String a4 = a(b, n.WIDTH);
        String a5 = a(b, n.HEIGHT);
        String a6 = a(b, n.SDK_IMPRESSION_URL);
        String a7 = a(b, n.SDK_CLICK_URL);
        String a8 = a(b, n.AD_TIMEOUT);
        String a9 = a(b, n.AD_COMPLETION_URL);
        bVar.b = a(b, n.AD_UNIT_ID);
        a(b, n.AD_UNIT_TYPE);
        String a10 = a(b, n.AD_UNIT_DISPLAY_TYPE);
        String a11 = a(b, n.AD_NETWORK);
        String a12 = a(b, n.AD_NETWORK_ID);
        String a13 = a(b, n.CREATIVE_ID);
        String a14 = a(b, n.AD_DOMAIN);
        String a15 = a(b, n.APP_BUNDLE);
        String a16 = a(b, n.CAMPAIGN_ID);
        String a17 = a(b, n.CPM_VALUE);
        String a18 = a(b, n.CPM_CURRENCY);
        impressionData.setCpmValue(a17);
        impressionData.setCurrency(a18);
        String a19 = a(b, n.BANNER_MRC_PERCENT);
        String a20 = a(b, n.BANNER_MRC_DURATION);
        String a21 = a(b, n.BANNER_MRC_IMPRESSION_URL);
        String a22 = a(b, n.INTERSTITIAL_SKIP_MODE);
        String a23 = a(b, n.IGNITE_INSTALL_URL);
        String a24 = a(b, n.IGNITE_MODE);
        String a25 = a(b, n.APP_BUNDLE_LAUNCHER);
        String a26 = a(b, n.BRAND_BIDDER_SHOW_ENDCARD);
        String a27 = a(b, n.BRAND_BIDDER_CTA_TEXT);
        String a28 = a(b, n.MRAID_VIDEO_SIGNAL);
        String a29 = a(b, n.CREATIVE_TYPE);
        String a30 = a(b, n.SKIP_DELAY);
        String a31 = a(b, n.SKIP_ENDCARD_DELAY);
        if (bVar.b()) {
            bVar.a.p = b;
        }
        bVar.a.a(a8);
        impressionData.setImpressionId(a2);
        impressionData.setDemandSource(a11);
        e eVar = bVar.a;
        eVar.d = a3;
        eVar.x = a15;
        if (!TextUtils.isEmpty(a12)) {
            if (!TextUtils.isEmpty(a12)) {
                try {
                    valueOf = Long.valueOf(a12);
                } catch (NumberFormatException unused) {
                }
                impressionData.setDemandId(valueOf);
            }
            valueOf = null;
            impressionData.setDemandId(valueOf);
        }
        if (!TextUtils.isEmpty(a)) {
            bVar.a.g = Integer.valueOf(a).intValue();
        }
        if (!TextUtils.isEmpty(a4)) {
            bVar.a.e = Integer.valueOf(a4).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar.a.f = Integer.valueOf(a5).intValue();
        }
        e eVar2 = bVar.a;
        eVar2.k = a6;
        eVar2.l = a7;
        eVar2.o = a9;
        eVar2.m = bVar.b;
        try {
            eVar2.n = UnitDisplayType.fromValue(a10);
        } catch (IllegalArgumentException unused2) {
            bVar.a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a13)) {
            impressionData.setCreativeId(a13);
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setAdvertiserDomain(a14);
        }
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setCampaignId(a16);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        e eVar3 = bVar.a;
        eVar3.r = impressionData;
        eVar3.s = v.a(a19, 0);
        e eVar4 = bVar.a;
        if (!TextUtils.isEmpty(a20)) {
            try {
                parseFloat = Float.parseFloat(a20);
            } catch (NumberFormatException unused3) {
            }
            eVar4.t = parseFloat;
            e eVar5 = bVar.a;
            eVar5.u = a21;
            eVar5.v = v.a(a22, -1);
            if (!TextUtils.isEmpty(a23)) {
                bVar.a.D = a23;
            }
            if (!TextUtils.isEmpty(a24)) {
                e eVar6 = bVar.a;
                m a32 = m.a(a24);
                if (a32 == null) {
                    eVar6.getClass();
                    a32 = m.NONE;
                }
                eVar6.E = a32;
            }
            if (!TextUtils.isEmpty(a25)) {
                bVar.a.F = a25;
            }
            if (!TextUtils.isEmpty(a26)) {
                bVar.a.B = a26;
            }
            if (!TextUtils.isEmpty(a27)) {
                bVar.a.C = a27;
            }
            bVar.a.G = !"1".equals(a28) || Boolean.parseBoolean(a28);
            bVar.a.J = CreativeType.fromValue(a29);
            e eVar7 = bVar.a;
            double d = -1.0d;
            if (!TextUtils.isEmpty(a30)) {
                try {
                    parseDouble = Double.parseDouble(a30);
                } catch (NumberFormatException unused4) {
                }
                eVar7.getClass();
                eVar7.L = (int) Math.round(parseDouble);
                e eVar8 = bVar.a;
                if (!TextUtils.isEmpty(a31)) {
                    try {
                        d = Double.parseDouble(a31);
                    } catch (NumberFormatException unused5) {
                    }
                }
                eVar8.getClass();
                eVar8.K = (int) Math.round(d);
            }
            parseDouble = -1.0d;
            eVar7.getClass();
            eVar7.L = (int) Math.round(parseDouble);
            e eVar82 = bVar.a;
            if (!TextUtils.isEmpty(a31)) {
            }
            eVar82.getClass();
            eVar82.K = (int) Math.round(d);
        }
        parseFloat = -1.0f;
        eVar4.t = parseFloat;
        e eVar52 = bVar.a;
        eVar52.u = a21;
        eVar52.v = v.a(a22, -1);
        if (!TextUtils.isEmpty(a23)) {
        }
        if (!TextUtils.isEmpty(a24)) {
        }
        if (!TextUtils.isEmpty(a25)) {
        }
        if (!TextUtils.isEmpty(a26)) {
        }
        if (!TextUtils.isEmpty(a27)) {
        }
        bVar.a.G = !"1".equals(a28) || Boolean.parseBoolean(a28);
        bVar.a.J = CreativeType.fromValue(a29);
        e eVar72 = bVar.a;
        double d2 = -1.0d;
        if (!TextUtils.isEmpty(a30)) {
        }
        parseDouble = -1.0d;
        eVar72.getClass();
        eVar72.L = (int) Math.round(parseDouble);
        e eVar822 = bVar.a;
        if (!TextUtils.isEmpty(a31)) {
        }
        eVar822.getClass();
        eVar822.K = (int) Math.round(d2);
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.a.a().toString();
    }

    public final String a(Map map, n nVar) {
        String lowerCase = nVar.a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.e("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        IAlog.d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }
}
