package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.videocommon.a;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: RewardMVVideoAdapter.java */
/* loaded from: classes8.dex */
public class c {
    private String C;
    private h D;
    public String K;
    private List<CampaignEx> V;
    private CopyOnWriteArrayList<CampaignEx> W;
    private List<CampaignEx> X;
    private Context a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private String h;
    private com.mbridge.msdk.video.bt.module.orglistener.h i;
    private volatile com.mbridge.msdk.reward.adapter.a j;
    private volatile a.j k;
    private com.mbridge.msdk.videocommon.setting.c l;
    private boolean r;
    private boolean s;
    private String u;
    private int v;
    private int w;
    private int x;
    private CampaignUnit y;
    private CopyOnWriteArrayList<CampaignEx> z;
    private boolean m = false;
    private boolean n = false;
    public Object o = new Object();
    private CopyOnWriteArrayList<CampaignEx> p = new CopyOnWriteArrayList<>();
    private int q = 2;
    private String t = "";
    private boolean A = false;
    private long B = 0;
    private boolean E = false;
    private boolean F = false;
    public String G = "";
    public String H = "";
    public String I = "";
    public int J = 0;
    private Handler L = new a(Looper.getMainLooper());
    private boolean M = false;
    private long N = 0;
    volatile boolean O = false;
    volatile boolean P = false;
    volatile boolean Q = false;
    volatile boolean R = false;
    volatile boolean S = false;
    public volatile boolean T = false;
    private String U = "";

    /* compiled from: RewardMVVideoAdapter.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:162:0x03ae A[Catch: all -> 0x005b, Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:151:0x02e3, B:153:0x02ed, B:155:0x02f5, B:156:0x0303, B:158:0x0311, B:160:0x03a8, B:162:0x03ae, B:164:0x03bd, B:165:0x03c1, B:166:0x03c5, B:169:0x031e, B:171:0x0328, B:173:0x0330, B:174:0x0339, B:176:0x0347, B:177:0x0352, B:179:0x035a, B:180:0x0363, B:182:0x036b, B:188:0x037f, B:189:0x0393), top: B:150:0x02e3 }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x03de A[Catch: all -> 0x005b, Exception -> 0x005f, TryCatch #1 {Exception -> 0x005f, blocks: (B:3:0x000e, B:10:0x0023, B:12:0x0046, B:14:0x0051, B:15:0x0063, B:17:0x006b, B:19:0x0071, B:25:0x0086, B:27:0x008e, B:29:0x0096, B:31:0x00a2, B:33:0x00cc, B:35:0x00f3, B:38:0x0107, B:40:0x0124, B:41:0x0136, B:43:0x013e, B:45:0x014a, B:47:0x015a, B:49:0x0162, B:51:0x016e, B:52:0x017a, B:54:0x0180, B:57:0x0188, B:62:0x0192, B:64:0x01a1, B:65:0x01a4, B:67:0x01bb, B:69:0x01c7, B:70:0x01d2, B:72:0x01d8, B:133:0x02b6, B:136:0x02ba, B:146:0x02c3, B:148:0x02cb, B:192:0x03d6, B:194:0x03de, B:195:0x03e7, B:197:0x041a, B:198:0x0426, B:201:0x0437, B:203:0x043f, B:204:0x044a, B:206:0x0453, B:207:0x0464, B:209:0x046b, B:212:0x0475, B:214:0x047d, B:217:0x048d, B:219:0x0495, B:221:0x049b, B:223:0x04a7), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:197:0x041a A[Catch: all -> 0x005b, Exception -> 0x005f, TryCatch #1 {Exception -> 0x005f, blocks: (B:3:0x000e, B:10:0x0023, B:12:0x0046, B:14:0x0051, B:15:0x0063, B:17:0x006b, B:19:0x0071, B:25:0x0086, B:27:0x008e, B:29:0x0096, B:31:0x00a2, B:33:0x00cc, B:35:0x00f3, B:38:0x0107, B:40:0x0124, B:41:0x0136, B:43:0x013e, B:45:0x014a, B:47:0x015a, B:49:0x0162, B:51:0x016e, B:52:0x017a, B:54:0x0180, B:57:0x0188, B:62:0x0192, B:64:0x01a1, B:65:0x01a4, B:67:0x01bb, B:69:0x01c7, B:70:0x01d2, B:72:0x01d8, B:133:0x02b6, B:136:0x02ba, B:146:0x02c3, B:148:0x02cb, B:192:0x03d6, B:194:0x03de, B:195:0x03e7, B:197:0x041a, B:198:0x0426, B:201:0x0437, B:203:0x043f, B:204:0x044a, B:206:0x0453, B:207:0x0464, B:209:0x046b, B:212:0x0475, B:214:0x047d, B:217:0x048d, B:219:0x0495, B:221:0x049b, B:223:0x04a7), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            com.mbridge.msdk.foundation.error.b a;
            boolean z;
            com.mbridge.msdk.foundation.same.report.metrics.c a2 = c.this.a(message);
            try {
                try {
                    int i = message.what;
                    if (i == 8) {
                        if (c.this.j == null || (campaignEx = (CampaignEx) message.obj) == null || TextUtils.isEmpty(c.this.b)) {
                            return;
                        }
                        com.mbridge.msdk.reward.report.a.a(c.this.a, campaignEx, c.this.b);
                        c.this.l();
                        return;
                    }
                    if (i == 18) {
                        if (c.this.k != null) {
                            c.this.k.a(c.this.C, a2);
                            return;
                        }
                        return;
                    }
                    switch (i) {
                        case 1:
                        case 2:
                            c.this.a((String) message.obj, a2);
                            break;
                        case 3:
                            if (c.this.j != null) {
                                c.this.j.a("campaign is ok", a2);
                            }
                            Message message2 = new Message();
                            message2.what = 5;
                            if (a2 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("metrics_data_lrid", a2.t());
                                message2.setData(bundle);
                            }
                            sendMessageDelayed(message2, com.mbridge.msdk.foundation.same.a.L);
                            break;
                        case 4:
                            if (c.this.j != null) {
                                c cVar = c.this;
                                cVar.a(cVar.b, (List<CampaignEx>) c.this.V, c.this.s, "");
                                try {
                                    com.mbridge.msdk.foundation.error.b a3 = com.mbridge.msdk.foundation.error.a.a(880002, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj == null) {
                                        if (c.this.L != null) {
                                            c.this.L.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================00000");
                                        if (!c.this.S) {
                                            c.this.S = false;
                                            a = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3506 errorMessage: data load failed");
                                            a3 = a;
                                        }
                                        c.this.S = false;
                                        if (a2 != null) {
                                            a2.b(c.this.V);
                                            if (a2.u() == null) {
                                                a2.a(a3);
                                            } else {
                                                a3 = a2.u();
                                            }
                                        }
                                        c.this.j.a(c.this.V, a3, a2);
                                        break;
                                    } else {
                                        String str = (String) obj;
                                        int i2 = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================11111");
                                            if (!c.this.S) {
                                                c.this.S = false;
                                                a = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            }
                                            c.this.S = false;
                                            if (a2 != null) {
                                            }
                                            c.this.j.a(c.this.V, a3, a2);
                                        } else {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            if (i2 == 880021) {
                                                a = com.mbridge.msdk.foundation.error.a.a(880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED");
                                            } else if (i2 == 880003 || i2 == 6 || i2 == 7) {
                                                a = com.mbridge.msdk.foundation.error.a.a(880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            } else {
                                                a = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + str);
                                            }
                                        }
                                        a3 = a;
                                        c.this.S = false;
                                        if (a2 != null) {
                                        }
                                        c.this.j.a(c.this.V, a3, a2);
                                    }
                                } catch (Exception e) {
                                    if (c.this.L != null) {
                                    }
                                    removeMessages(6);
                                    c cVar2 = c.this;
                                    cVar2.a(cVar2.b, (List<CampaignEx>) c.this.V, c.this.s, "");
                                    com.mbridge.msdk.foundation.error.b a4 = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e.getMessage());
                                    if (a2 != null) {
                                    }
                                    c.this.j.a(c.this.V, a4, a2);
                                    return;
                                }
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                }
                                removeMessages(6);
                                c cVar22 = c.this;
                                cVar22.a(cVar22.b, (List<CampaignEx>) c.this.V, c.this.s, "");
                                com.mbridge.msdk.foundation.error.b a42 = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e.getMessage());
                                if (a2 != null) {
                                    a2.b(c.this.V);
                                    a2.a(a42);
                                }
                                c.this.j.a(c.this.V, a42, a2);
                            }
                            break;
                        case 5:
                            if (c.this.j != null) {
                                if (c.this.V != null && c.this.V.size() > 0) {
                                    CampaignEx campaignEx2 = (CampaignEx) c.this.V.get(0);
                                    boolean z2 = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
                                    int nscpt = campaignEx2.getNscpt();
                                    c cVar3 = c.this;
                                    if (cVar3.a((List<CampaignEx>) cVar3.z, z2, nscpt, true, false)) {
                                        c cVar4 = c.this;
                                        cVar4.a(cVar4.b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.s);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!c.this.R) {
                                            c.this.R = true;
                                            c.this.j.a(c.this.z, a2);
                                            break;
                                        }
                                    }
                                }
                                c cVar5 = c.this;
                                cVar5.a(cVar5.b, (List<CampaignEx>) c.this.V, c.this.s, "");
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                    c.this.L.removeMessages(6);
                                }
                                CampaignEx campaignEx3 = (c.this.V == null || c.this.V.size() <= 0) ? null : (CampaignEx) c.this.V.get(0);
                                if (campaignEx3 == null && c.this.W != null && c.this.W.size() > 0) {
                                    campaignEx3 = (CampaignEx) c.this.W.get(0);
                                }
                                if (!c.this.S || (c.this.T && campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getNLRid()))) {
                                    com.mbridge.msdk.foundation.error.b a5 = com.mbridge.msdk.foundation.error.a.a(880010, "errorCode: 3401 errorMessage: resource load timeout");
                                    c.this.S = false;
                                    if (a2 != null) {
                                        a2.a(a5);
                                    }
                                    c.this.j.a(c.this.V, a5, a2);
                                    if (c.this.z != null && c.this.z.size() > 0) {
                                        Iterator it = c.this.z.iterator();
                                        boolean z3 = false;
                                        while (it.hasNext()) {
                                            CampaignEx campaignEx4 = (CampaignEx) it.next();
                                            if (campaignEx4 != null) {
                                                try {
                                                } catch (Exception e2) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("RewardMVVideoAdapter", e2.getMessage());
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(campaignEx4.getVideoUrlEncode()) && !ResDownloadCheckManager.getInstance().containsVideoKey(campaignEx4.getVideoUrlEncode())) {
                                                    z = true;
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getendcard_url()) && !ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getendcard_url())) {
                                                        z = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl())) {
                                                        if (ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                            z = true;
                                                        } else if (!z3 && !z) {
                                                            if (com.mbridge.msdk.videocommon.a.b(c.this.b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                                z3 = true;
                                                            }
                                                        }
                                                    }
                                                    if (campaignEx4 != null && campaignEx4.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx4.getRewardTemplateMode().j()) && !campaignEx4.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getRewardTemplateMode().j()) && TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl()) && !z) {
                                                        com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (campaignEx4 != null) {
                                                z = true;
                                            }
                                            if (campaignEx4 != null) {
                                                if (ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                }
                                            }
                                            if (campaignEx4 != null) {
                                                com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            c cVar6 = c.this;
                            cVar6.a(cVar6.b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.s);
                            if (c.this.j != null) {
                                removeMessages(6);
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                }
                                if (c.this.j != null && !c.this.R) {
                                    c.this.R = true;
                                    c.this.j.a(c.this.z, a2);
                                    break;
                                }
                            }
                            break;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th) {
                q0.a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    class b extends com.mbridge.msdk.reward.request.a {
        final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c e;

        b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.G = campaignUnit.getRequestId();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                if (c.this.z != null && c.this.z.size() > 0 && (campaignEx = (CampaignEx) c.this.z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.z.clear();
                }
                if (c.this.V != null) {
                    c.this.V.clear();
                }
                c.this.O = false;
                c.this.P = false;
                synchronized (c.this.o) {
                    try {
                        if (c.this.Q) {
                            c.this.Q = false;
                        }
                        c.this.S = false;
                        c.this.R = false;
                        c.this.b("exception after load success", this.e);
                        c.this.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i == -1) {
                c.this.B = System.currentTimeMillis();
            }
            if (c.this.z != null && c.this.z.size() > 0 && (campaignEx = (CampaignEx) c.this.z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.z.clear();
            }
            if (c.this.V != null) {
                c.this.V.clear();
            }
            c.this.O = false;
            c.this.P = false;
            synchronized (c.this.o) {
                try {
                    if (c.this.Q) {
                        c.this.Q = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c.this.a(cVar, i);
            c.this.S = false;
            c.this.R = false;
            if (!c.this.M) {
                c.this.a(i, str, cVar);
            }
            c.this.n();
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    class d implements b.n {
        com.mbridge.msdk.foundation.same.report.metrics.c a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ CopyOnWriteArrayList d;
        final /* synthetic */ int e;

        /* compiled from: RewardMVVideoAdapter.java */
        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.a = str;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, (List<CampaignEx>) c.this.V, c.this.s, this.a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.a == null) {
                    dVar.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.a.b(dVar2.d);
                d.this.a.a(this.b);
                c.this.j.a(c.this.V, this.b, d.this.a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        /* compiled from: RewardMVVideoAdapter.java */
        class b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.a = str;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, (List<CampaignEx>) c.this.V, c.this.s, this.a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.a == null) {
                    dVar.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.a.b(dVar2.d);
                d.this.a.a(this.b);
                c.this.j.a(c.this.V, this.b, d.this.a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        d(CampaignEx campaignEx, boolean z, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = copyOnWriteArrayList;
            this.e = i;
            this.a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.c && c.this.j != null && c.this.L != null) {
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.b.getRsIgnoreCheckRule() == null || this.b.getRsIgnoreCheckRule().size() <= 0 || !this.b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.L.post(new a(str2, bVar));
                    return;
                } else {
                    q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.e == 1) {
                if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.j == null || c.this.L == null) {
                    return;
                }
                c.this.L.post(new b(str2, bVar));
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    class f extends c.a {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    class g implements Runnable {
        final /* synthetic */ CampaignUnit a;

        g(CampaignUnit campaignUnit) {
            this.a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.a)).d();
            CampaignUnit campaignUnit = this.a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.a.getAds());
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    public class h implements Runnable {
        private String a;
        private com.mbridge.msdk.foundation.same.report.metrics.c b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.E) {
                    return;
                }
                c.this.F = true;
                if (c.this.L != null) {
                    Message obtainMessage = c.this.L.obtainMessage();
                    obtainMessage.obj = this.a;
                    obtainMessage.what = 2;
                    if (this.b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.b.t());
                        obtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(obtainMessage);
                }
            } catch (Exception e) {
                q0.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* compiled from: RewardMVVideoAdapter.java */
    public class i implements Runnable {
        private String a;
        private com.mbridge.msdk.foundation.same.report.metrics.c b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.u = com.mbridge.msdk.b.a(cVar.b, c.this.a);
                }
                c cVar2 = c.this;
                cVar2.h = v0.a(cVar2.a, c.this.b);
                if (c.this.F) {
                    return;
                }
                if (c.this.D != null && c.this.L != null) {
                    c.this.L.removeCallbacks(c.this.D);
                }
                c.this.E = true;
                if (c.this.L != null) {
                    Message obtainMessage = c.this.L.obtainMessage();
                    obtainMessage.obj = this.a;
                    obtainMessage.what = 1;
                    if (this.b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.b.t());
                        obtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(obtainMessage);
                }
                if (TextUtils.isEmpty(c.this.h)) {
                    return;
                }
                q0.b("RewardMVVideoAdapter", "excludeId : " + c.this.h);
            } catch (Exception e) {
                q0.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.a = context.getApplicationContext();
            this.b = str2;
            this.c = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.o);
        p0.startActivity(p1);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.o);
        p0.startActivity(p1);
    }

    private String k() {
        com.mbridge.msdk.setting.g d2 = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.C, TextUtils.isEmpty(this.C) ? d2.v0() : d2.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (a1.b(this.b)) {
                com.mbridge.msdk.reward.controller.a.a(this.b, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c(String str) {
        this.t = str;
    }

    public void d(boolean z) {
        this.r = z;
    }

    public void e(boolean z) {
        this.s = z;
    }

    public void f(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z || (copyOnWriteArrayList = this.z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.z);
    }

    public boolean g(boolean z) {
        if (z) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<CampaignEx> it = this.z.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(1);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().j(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.z, "load_timeout", 1);
        return true;
    }

    public void h(boolean z) {
        if (z) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<CampaignEx> it = this.z.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(0);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().j(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.z, "load_timeout", 0);
    }

    public String j() {
        return this.b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> c = com.mbridge.msdk.videocommon.cache.a.a().c(this.b, 1, this.s, this.t);
        if (c == null || c.size() <= 0) {
            q0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = c.get(0);
        int a2 = com.mbridge.msdk.videocommon.cache.a.a().a(this.b, 1, this.s, this.t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || c.size() >= a2) {
            return a(c, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.a == null || list == null || list.size() == 0) {
            return;
        }
        j a2 = j.a(com.mbridge.msdk.foundation.db.g.a(this.a));
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (v0.c(this.a, campaignEx.getPackageName())) {
                        com.mbridge.msdk.b.a(campaignEx);
                    } else {
                        a(a2, campaignEx);
                    }
                } else {
                    a(a2, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    public void c(boolean z) {
        this.M = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f));
                eVar.a("hst", k());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.t());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    private String i() {
        try {
            if (a1.b(com.mbridge.msdk.reward.controller.a.c0)) {
                return com.mbridge.msdk.reward.controller.a.c0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return "";
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.W;
    }

    public void b(String str) {
        this.I = str;
    }

    public boolean b(boolean z) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> b2 = com.mbridge.msdk.videocommon.cache.a.a().b(this.b, 1, this.s, this.t);
        if (b2 != null && b2.size() > 0) {
            CampaignEx campaignEx = b2.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            int a2 = com.mbridge.msdk.videocommon.cache.a.a().a(this.b, 1, this.s, this.t);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || b2.size() >= a2) {
                boolean a3 = a(b2, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z);
                if (z) {
                    a(a3, cVar, b2);
                }
                return a3;
            }
            if (z) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("event_name", "is_ready_cltr");
                eVar.a("reason", "nscpt error");
                eVar.a("type", 8);
                a(cVar, eVar, b2);
            }
            return false;
        }
        q0.a("RewardVideoController", "database has not can use data");
        if (z) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("event_name", "is_ready_cse");
            eVar2.a("reason", "no effective campaign list");
            eVar2.a("type", 8);
            a(cVar, eVar2, b2);
        }
        return false;
    }

    /* compiled from: RewardMVVideoAdapter.java */
    class e implements b.n {
        com.mbridge.msdk.foundation.same.report.metrics.c a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ CopyOnWriteArrayList c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;

        e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i) {
            this.b = campaignEx;
            this.c = copyOnWriteArrayList;
            this.d = z;
            this.e = i;
            this.a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.P = true;
            if (!c.this.O || c.this.Q || c.this.L == null) {
                return;
            }
            synchronized (c.this.o) {
                try {
                    if (c.this.Q) {
                        return;
                    }
                    c.this.Q = true;
                    c.this.L.post(new a(str3, str, str2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                if (this.b.getRsIgnoreCheckRule().contains(3)) {
                    q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                    q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.b, (List<CampaignEx>) c.this.V, c.this.s, str2);
            c.this.P = false;
            if (c.this.L != null) {
                c.this.L.removeMessages(5);
            }
            if (c.this.j == null || c.this.S) {
                return;
            }
            c.this.S = false;
            if (bVar != null) {
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.a == null) {
                this.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.a.b(this.c);
            this.a.a(bVar);
            c.this.j.a(c.this.V, bVar, this.a);
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        /* compiled from: RewardMVVideoAdapter.java */
        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            a(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b b = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.A;
                Handler handler = c.this.L;
                boolean z2 = c.this.r;
                boolean z3 = c.this.s;
                String str = this.a;
                String requestIdNotice = e.this.b.getRequestIdNotice();
                String str2 = this.b;
                String str3 = this.c;
                String cMPTEntryUrl = e.this.b.getCMPTEntryUrl();
                int i = c.this.q;
                e eVar = e.this;
                b.a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, eVar.b, eVar.c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.b.getCMPTEntryUrl()), this.c, c.this.l, new C1453a(), false);
            }

            /* compiled from: RewardMVVideoAdapter.java */
            /* renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            class C1453a implements b.o {
                C1453a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C1499a c1499a) {
                    q0.a("HBOPTIMIZE", "模板加载成功 requestId " + str4);
                    e eVar = e.this;
                    if (c.this.a(eVar.c, eVar.d, eVar.e)) {
                        c cVar = c.this;
                        cVar.a(cVar.b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = eVar2.a;
                        if (cVar2 != null) {
                            cVar2.b(eVar2.c);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.j;
                        e eVar3 = e.this;
                        aVar.a(eVar3.c, eVar3.a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.s, a.this.a);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b a = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.a == null) {
                        eVar4.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar5 = e.this;
                    eVar5.a.b(eVar5.c);
                    e.this.a.a(a);
                    c.this.j.a(c.this.V, a, e.this.a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C1499a c1499a, com.mbridge.msdk.foundation.error.b bVar) {
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    q0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.c, (List<CampaignEx>) cVar.V, c.this.s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    e eVar = e.this;
                    if (eVar.a == null) {
                        eVar.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.a.b(eVar2.c);
                    e.this.a.a(bVar);
                    c.this.j.a(c.this.V, bVar, e.this.a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }
            }
        }
    }

    public String a(boolean z) {
        CopyOnWriteArrayList<CampaignEx> b2;
        CampaignEx campaignEx;
        if (z) {
            if (TextUtils.isEmpty(this.H) && (b2 = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.b)) != null && b2.size() > 0 && (campaignEx = b2.get(0)) != null) {
                this.H = campaignEx.getRequestId();
            }
            return this.H;
        }
        return this.G;
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.l.clear();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.a)).a(this.b);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.z;
    }

    public void a(int i2) {
        this.q = i2;
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.z;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.b(this.z);
        }
        return com.mbridge.msdk.foundation.same.c.b(this.X);
    }

    public void a(int i2, String str) {
        this.J = i2;
        this.K = str;
    }

    /* compiled from: RewardMVVideoAdapter.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    class C1450c implements b.h {
        com.mbridge.msdk.foundation.same.report.metrics.c a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ CopyOnWriteArrayList d;
        final /* synthetic */ int e;

        /* compiled from: RewardMVVideoAdapter.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        class RunnableC1452c implements Runnable {
            final /* synthetic */ CopyOnWriteArrayList a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            RunnableC1452c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.a = copyOnWriteArrayList;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, this.a, c.this.s, "");
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.j == null) {
                    return;
                }
                c.this.S = false;
                C1450c c1450c = C1450c.this;
                if (c1450c.a == null) {
                    c1450c.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C1450c c1450c2 = C1450c.this;
                c1450c2.a.b(c1450c2.d);
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C1450c.this.a.a(this.b);
                c.this.j.a(this.a, this.b, C1450c.this.a);
                q0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        C1450c(CampaignEx campaignEx, boolean z, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = copyOnWriteArrayList;
            this.e = i;
            this.a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.O = true;
            if (this.c) {
                if (!c.this.P || c.this.Q || c.this.L == null) {
                    return;
                }
                synchronized (c.this.o) {
                    try {
                        if (c.this.Q) {
                            return;
                        }
                        c.this.Q = true;
                        c.this.L.post(new b(str3, str2, copyOnWriteArrayList));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().j()) && !next.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.L != null) {
                    c.this.L.post(new a(next, str, str2, str3, copyOnWriteArrayList));
                } else if (c.this.a(this.d, this.c, this.e)) {
                    c cVar = c.this;
                    cVar.a(cVar.b, copyOnWriteArrayList, (List<CampaignEx>) c.this.X, c.this.s);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j != null && !c.this.R) {
                        c.this.R = true;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.a;
                        if (cVar2 != null) {
                            cVar2.b(this.d);
                        }
                        c.this.j.a(this.d, this.a);
                    }
                } else {
                    c cVar3 = c.this;
                    cVar3.a(str2, (List<CampaignEx>) cVar3.V, c.this.s, str3);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j != null && !c.this.S) {
                        c.this.S = false;
                        com.mbridge.msdk.foundation.error.b a2 = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                        if (this.a == null) {
                            this.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        }
                        this.a.b(this.d);
                        this.a.a(a2);
                        c.this.j.a(this.d, a2, this.a);
                        q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                    }
                }
            }
        }

        /* compiled from: RewardMVVideoAdapter.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        class a implements Runnable {
            final /* synthetic */ CampaignEx a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ CopyOnWriteArrayList e;

            a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.a = campaignEx;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b b = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.A;
                Handler handler = c.this.L;
                boolean z2 = c.this.r;
                boolean z3 = c.this.s;
                String j = this.a.getRewardTemplateMode().j();
                int i = c.this.q;
                C1450c c1450c = C1450c.this;
                b.a(z, handler, z2, z3, null, j, i, c1450c.b, c1450c.d, H5DownLoadManager.getInstance().getH5ResAddress(this.a.getRewardTemplateMode().j()), this.b, this.c, this.d, this.a.getRequestIdNotice(), c.this.l, new C1451a());
            }

            /* compiled from: RewardMVVideoAdapter.java */
            /* renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            class C1451a implements b.o {
                C1451a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C1499a c1499a) {
                    C1450c c1450c = C1450c.this;
                    if (c.this.a(c1450c.d, c1450c.c, c1450c.e)) {
                        c cVar = c.this;
                        String str6 = cVar.b;
                        a aVar = a.this;
                        cVar.a(str6, aVar.e, (List<CampaignEx>) c.this.X, c.this.s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C1450c c1450c2 = C1450c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c1450c2.a;
                        if (cVar2 != null) {
                            cVar2.b(c1450c2.d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar2 = c.this.j;
                        C1450c c1450c3 = C1450c.this;
                        aVar2.a(c1450c3.d, c1450c3.a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b a = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C1450c c1450c4 = C1450c.this;
                    if (c1450c4.a == null) {
                        c1450c4.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C1450c c1450c5 = C1450c.this;
                    c1450c5.a.b(c1450c5.d);
                    C1450c.this.a.a(a);
                    com.mbridge.msdk.reward.adapter.a aVar3 = c.this.j;
                    C1450c c1450c6 = C1450c.this;
                    aVar3.a(c1450c6.d, a, c1450c6.a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C1499a c1499a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C1450c.this.c);
                    }
                    if (C1450c.this.b.getRsIgnoreCheckRule() != null && C1450c.this.b.getRsIgnoreCheckRule().size() > 0 && C1450c.this.b.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.c, (List<CampaignEx>) cVar.V, c.this.s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C1450c c1450c = C1450c.this;
                    if (c1450c.a == null) {
                        c1450c.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C1450c c1450c2 = C1450c.this;
                    c1450c2.a.b(c1450c2.d);
                    C1450c.this.a.a(bVar);
                    c.this.j.a(c.this.V, bVar, C1450c.this.a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }
            }
        }

        /* compiled from: RewardMVVideoAdapter.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        class b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            final /* synthetic */ CopyOnWriteArrayList c;

            b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.a = str;
                this.b = str2;
                this.c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b b = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.A;
                Handler handler = c.this.L;
                boolean z2 = c.this.r;
                boolean z3 = c.this.s;
                String str = this.a;
                String requestIdNotice = C1450c.this.b.getRequestIdNotice();
                String str2 = c.this.c;
                String str3 = this.b;
                String cMPTEntryUrl = C1450c.this.b.getCMPTEntryUrl();
                int i = c.this.q;
                C1450c c1450c = C1450c.this;
                b.a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, c1450c.b, c1450c.d, H5DownLoadManager.getInstance().getH5ResAddress(C1450c.this.b.getCMPTEntryUrl()), this.b, c.this.l, new a(), false);
            }

            /* compiled from: RewardMVVideoAdapter.java */
            /* renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            class a implements b.o {
                a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C1499a c1499a) {
                    C1450c c1450c = C1450c.this;
                    if (c.this.a(c1450c.d, c1450c.c, c1450c.e)) {
                        c cVar = c.this;
                        String str6 = cVar.b;
                        b bVar = b.this;
                        cVar.a(str6, bVar.c, (List<CampaignEx>) c.this.X, c.this.s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C1450c c1450c2 = C1450c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c1450c2.a;
                        if (cVar2 != null) {
                            cVar2.b(c1450c2.d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.j;
                        C1450c c1450c3 = C1450c.this;
                        aVar.a(c1450c3.d, c1450c3.a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b a = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C1450c c1450c4 = C1450c.this;
                    if (c1450c4.a == null) {
                        c1450c4.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C1450c c1450c5 = C1450c.this;
                    c1450c5.a.b(c1450c5.d);
                    C1450c.this.a.a(a);
                    c.this.j.a(c.this.V, a, C1450c.this.a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C1499a c1499a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C1450c.this.b.getRsIgnoreCheckRule() != null && C1450c.this.b.getRsIgnoreCheckRule().size() > 0 && C1450c.this.b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.b, (List<CampaignEx>) cVar.V, c.this.s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C1450c c1450c = C1450c.this;
                    if (c1450c.a == null) {
                        c1450c.a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C1450c c1450c2 = C1450c.this;
                    c1450c2.a.b(c1450c2.d);
                    C1450c.this.a.a(bVar);
                    c.this.j.a(c.this.V, bVar, C1450c.this.a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.O = false;
            if (c.this.j == null || c.this.L == null) {
                return;
            }
            c.this.L.post(new RunnableC1452c(copyOnWriteArrayList, bVar));
        }
    }

    public boolean a(CampaignEx campaignEx, boolean z, com.mbridge.msdk.foundation.error.b bVar, int i2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.b, this.r);
        boolean z2 = false;
        if (aVar.a(this.C)) {
            return false;
        }
        if (!this.T) {
            this.T = true;
            cVar3 = aVar.a(this.C, cVar, campaignEx, bVar, i2, this);
            if (cVar3 != null && cVar3.g() > com.mbridge.msdk.foundation.cache.c.i) {
                if (cVar3.c() != null && cVar3.c().size() > 0) {
                    a(cVar3.c(), true, true, true);
                } else if (cVar3.g() == com.mbridge.msdk.foundation.cache.c.k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.d(cVar3.e());
                }
            }
            cVar2 = cVar3;
            aVar.a(cVar, this.C, cVar2, (List<a.b>) null, (JSONObject) null, 3);
            return z2;
        }
        cVar3.d("isCandidate:false");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
        cVar2 = cVar3;
        z2 = true;
        aVar.a(cVar, this.C, cVar2, (List<a.b>) null, (JSONObject) null, 3);
        return z2;
    }

    public void c(List<CampaignEx> list) {
        this.X = list;
    }

    public void b(String str, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String str2;
        boolean z2;
        try {
            if (this.a == null) {
                com.mbridge.msdk.foundation.error.b a2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(a2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (a1.a(this.b)) {
                com.mbridge.msdk.foundation.error.b a3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(a3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.l == null) {
                com.mbridge.msdk.foundation.error.b a4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(a4);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.B < this.l.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b a5 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(a5);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            if (cVar == null) {
                str2 = "";
            } else {
                str2 = cVar.t();
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e a6 = new com.mbridge.msdk.reward.adapter.e(this.c, this.b, this.r, this.l, str2).a(this.g, this.h, this.d, i(), e(), this.u, str, z, this.v);
            if (a6 == null) {
                com.mbridge.msdk.foundation.error.b a7 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(a7);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            if (this.J != 0) {
                a6.a("r_index", this.J + "");
            }
            if (!TextUtils.isEmpty(this.K)) {
                a6.a("invalid_ad_ids", this.K);
            }
            this.N = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.b);
            bVar2.setPlacementId(this.c);
            bVar2.setAdType(this.r ? 287 : 94);
            bVar2.a(cVar);
            try {
                z2 = com.mbridge.msdk.videocommon.download.j.a().a(this.r ? 287 : 94);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e2.getMessage());
                }
                z2 = false;
            }
            boolean z3 = z2;
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(a6) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    if (this.J != 0) {
                        eVar.a("r_index", this.J + "");
                    }
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
            if (z3) {
                bVar.getCampaign(1, str, a6, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f * 1000, 30000L));
            } else {
                bVar.choiceV3OrV5BySetting(1, a6, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f * 1000, 30000L));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.l = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.l.o() * 1000;
        } catch (Throwable th) {
            q0.b("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2, boolean z2) {
        return a(list, z, i2, false, z2);
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2) {
        return a(list, z, i2, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.b, list)) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        q0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j())) {
                            q0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        q0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            q0.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2, boolean z2, boolean z3) {
        List<CampaignEx> list2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            boolean a2 = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.b, this.s, list.size(), z, i2, list, z2, eVar);
            eVar.a("event_name", "is_ready_crwtpl_" + a2);
            if (a2) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z3) {
                        eVar.a("event_name", "is_ready_crwtpl_" + a2);
                        eVar.a("reason", "h5 big template checkPreLoadState error");
                        eVar.a("type", 5);
                        list2 = list;
                        a(cVar, eVar, list2);
                    }
                } else {
                    list2 = list;
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        return true;
                    }
                    String str = this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j();
                    if (z3) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z3) {
                        eVar.a("event_name", "is_ready_crwtpl_" + a2);
                        eVar.a("reason", "h5 template checkPreLoadState error");
                        eVar.a("type", 5);
                        a(cVar, eVar, list2);
                    }
                }
            }
            list2 = list;
        } else {
            list2 = list;
            eVar.a("event_name", "is_ready_crwtpl_empty");
            eVar.a("reason", "campaign list is empty error");
            eVar.a("type", 8);
        }
        a(cVar, eVar, list2);
        return false;
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i2, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        boolean z;
        try {
            this.i = hVar;
            if (this.a != null && !a1.a(this.b)) {
                Intent intent = new Intent(this.a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i2);
                intent.putExtra(MBridgeConstans.IS_IV, this.r);
                intent.putExtra(MBridgeConstans.IS_BID, this.s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> b2 = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.b);
                if (b2 != null && b2.size() > 0) {
                    CampaignEx campaignEx = b2.get(0);
                    z = true;
                    if (b2.size() == 1 && !com.mbridge.msdk.foundation.same.c.a(this.a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        com.mbridge.msdk.videocommon.cache.a.a().b(this.b, campaignEx);
                        com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.i;
                        if (hVar2 != null) {
                            hVar2.a(cVar, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.H = campaignEx.getRequestId();
                    }
                    if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z = false;
                    }
                    a();
                } else {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.i;
                    if (hVar3 != null) {
                        hVar3.a(cVar, "load failed");
                        return;
                    }
                    z = false;
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z);
                if (this.r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.c, this.b, this.l);
                try {
                    if (s0.a().a("a_u_a_c_f_s", false) && com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        Activity activity = (Activity) com.mbridge.msdk.foundation.controller.c.n().f();
                        q0.c("RewardMVVideoAdapter", activity.getClass().getSimpleName() + " start MBRewardVideoActivity");
                        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
                        return;
                    }
                } catch (Throwable th) {
                    q0.b("RewardMVVideoAdapter", th.getMessage());
                }
                intent.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.i;
            if (hVar4 != null) {
                hVar4.a(cVar, "context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar5 = this.i;
            if (hVar5 != null) {
                hVar5.a(cVar, "show failed, exception is " + e2.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message obtain = Message.obtain();
            obtain.what = 18;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                obtain.setData(bundle);
            }
            this.L.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                obtain.setData(bundle);
            }
            if (str.contains(TelemetryCategory.EXCEPTION)) {
                this.L.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.L.sendMessage(obtain);
            }
        }
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g f2 = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (f2 == null) {
                    f2 = com.mbridge.msdk.setting.i.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(f2.d0() * 1000, this.b);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b9, code lost:
    
        if (com.mbridge.msdk.foundation.tools.a1.a(r15.getVideoUrlEncode()) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0224, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0233, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0235, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("RewardMVVideoAdapter", r15.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.reward.adapter.d b(CampaignUnit campaignUnit) {
        FileOutputStream fileOutputStream;
        IOException e2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String str;
        File file;
        File file2;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        com.mbridge.msdk.reward.adapter.d dVar = new com.mbridge.msdk.reward.adapter.d();
        dVar.a(copyOnWriteArrayList);
        if (MBridgeConstans.DEBUG && com.mbridge.msdk.util.e.a) {
            return dVar;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                com.mbridge.msdk.videocommon.setting.c cVar2 = this.l;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    this.V = ads;
                    if (campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                        cVar = null;
                    } else {
                        ArrayList<CampaignEx> ads2 = campaignUnit.getAds();
                        for (int i2 = 0; i2 < ads2.size(); i2++) {
                            CampaignEx campaignEx = ads2.get(i2);
                            campaignEx.setCampaignUnitId(this.b);
                            ads2.set(i2, campaignEx);
                        }
                        cVar = campaignUnit.getMetricsData();
                        if (cVar == null) {
                            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            campaignUnit.setMetricsData(cVar);
                        }
                        cVar.b(ads2);
                    }
                    for (int i3 = 0; i3 < ads.size() && i3 < Integer.MAX_VALUE; i3++) {
                        CampaignEx campaignEx2 = ads.get(i3);
                        if (campaignEx2.isMraid()) {
                            if (TextUtils.isEmpty(campaignEx2.getMraid().trim())) {
                                continue;
                            } else {
                                if (campaignEx2.getAdType() == 287) {
                                    str = "3";
                                } else if (campaignEx2.getAdType() == 94) {
                                    str = "1";
                                } else {
                                    str = campaignEx2.getAdType() == 42 ? "2" : "";
                                }
                                try {
                                    try {
                                        com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx2, "", this.b, str);
                                        String b2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                        String md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                        if (TextUtils.isEmpty(md5)) {
                                            md5 = String.valueOf(System.currentTimeMillis());
                                        }
                                        file2 = new File(b2, md5.concat(".html"));
                                        fileOutputStream = MintegralFilesBridge.fileOutputStreamCtor(file2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                                try {
                                    fileOutputStream.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                    fileOutputStream.flush();
                                    campaignEx2.setMraid(file2.getAbsolutePath());
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, "", this.b, str);
                                    try {
                                        fileOutputStream.close();
                                        fileOutputStream2 = fileOutputStream;
                                    } catch (Exception e4) {
                                        e = e4;
                                        fileOutputStream2 = fileOutputStream;
                                        e.printStackTrace();
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (IOException e5) {
                                                e2 = e5;
                                            }
                                        }
                                        return dVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e6) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("RewardMVVideoAdapter", e6.getMessage());
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    fileOutputStream2 = fileOutputStream;
                                    e.printStackTrace();
                                    campaignEx2.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, e.getMessage(), this.b, str);
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    file = new File(campaignEx2.getMraid());
                                    if (file.exists()) {
                                    }
                                    b("mraid resource write fail", cVar);
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream2 = fileOutputStream;
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    throw th;
                                }
                                file = new File(campaignEx2.getMraid());
                                if (file.exists() || !file.isFile() || !file.canRead()) {
                                    b("mraid resource write fail", cVar);
                                }
                            }
                        }
                        if (campaignEx2.getOfferType() != 99) {
                            if (b(campaignEx2)) {
                                if (a1.a(campaignEx2.getendcard_url()) && TextUtils.isEmpty(campaignEx2.getMraid())) {
                                    this.U = "No video campaign";
                                }
                                if (com.mbridge.msdk.util.b.a() && v0.c(campaignEx2)) {
                                    campaignEx2.setRtinsType(v0.c(this.a, campaignEx2.getPackageName()) ? 1 : 2);
                                }
                                if (com.mbridge.msdk.foundation.same.c.a(this.a, campaignEx2)) {
                                    copyOnWriteArrayList.add(campaignEx2);
                                } else {
                                    dVar.a(true);
                                    if (ads.size() == 1 && campaignEx2.getFilterCallBackState() == 1) {
                                        dVar.a(campaignEx2);
                                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                        copyOnWriteArrayList2.add(campaignEx2);
                                        dVar.a(copyOnWriteArrayList2);
                                    } else {
                                        v0.a(this.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                                        this.U = "APP ALREADY INSTALLED";
                                    }
                                }
                                a(campaignEx2, cVar);
                            }
                        }
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        e2 = e8;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e9) {
            e = e9;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:11:0x0027, B:13:0x002d, B:14:0x0072, B:16:0x0078, B:18:0x0080, B:24:0x0044, B:26:0x004a, B:27:0x004e, B:29:0x0054, B:32:0x005c, B:35:0x0066), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a() {
        String d2;
        String b2;
        List<com.mbridge.msdk.foundation.entity.d> a2 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.b, this.H);
        if (a2 == null) {
            return;
        }
        int size = a2.size();
        String d3 = com.mbridge.msdk.foundation.same.buffer.b.d(this.b);
        if (size == 0) {
            return;
        }
        try {
            if (size == 1) {
                if (a2.get(0) != null) {
                    d2 = a2.get(0).d();
                    b2 = a2.get(0).b();
                    if (TextUtils.isEmpty(d2) || !d2.equals(this.H)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(d3, this.b);
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.b, this.H, b2);
                    com.mbridge.msdk.foundation.same.buffer.b.e(this.b);
                    return;
                }
                b2 = "";
                d2 = "";
                if (TextUtils.isEmpty(d2)) {
                    return;
                } else {
                    return;
                }
            }
            if (!TextUtils.isEmpty(d3)) {
                for (com.mbridge.msdk.foundation.entity.d dVar : a2) {
                    if (dVar != null && d3.equals(dVar.a())) {
                        d2 = dVar.d();
                        b2 = dVar.b();
                        break;
                    }
                }
            }
            b2 = "";
            d2 = "";
            if (TextUtils.isEmpty(d2)) {
            }
        } catch (Exception e2) {
            q0.a("RewardMVVideoAdapter", e2.getMessage());
        }
    }

    public void a(int i2, int i3, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i2, i3, z, "", this.A, cVar);
    }

    public void a(int i2, int i3, boolean z, String str, boolean z2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.C = str;
        this.A = z2;
        boolean z3 = false;
        this.T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.z.clear();
        }
        List<CampaignEx> list = this.V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.O = false;
        this.P = false;
        synchronized (this.o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.S = false;
        this.R = false;
        try {
            z3 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
        if (!z3) {
            com.mbridge.msdk.foundation.error.b a2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(a2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.a == null) {
            com.mbridge.msdk.foundation.error.b a3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(a3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (a1.a(this.b)) {
            com.mbridge.msdk.foundation.error.b a4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(a4);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.l == null) {
            com.mbridge.msdk.foundation.error.b a5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (cVar != null) {
                cVar.a(a5);
            }
            b("RewardUnitSetting is null", cVar);
            return;
        }
        d();
        c();
        q0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        b();
        a(str, z2, cVar);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.d += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.l;
        if (cVar == null || this.d > cVar.r()) {
            this.d = 0;
        }
        if (a1.b(this.b)) {
            com.mbridge.msdk.reward.controller.a.a(this.b, this.d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002f, B:17:0x004d, B:19:0x0055, B:21:0x0059, B:24:0x0062, B:25:0x007b, B:26:0x0070, B:27:0x0091, B:31:0x002a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002f, B:17:0x004d, B:19:0x0055, B:21:0x0059, B:24:0x0062, B:25:0x007b, B:26:0x0070, B:27:0x0091, B:31:0x002a), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, int i2) {
        com.mbridge.msdk.foundation.error.b u;
        Object a2;
        if (cVar != null) {
            try {
                if (cVar.F()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (i2 != 3 && i2 != 880023 && i2 != 880041) {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            eVar.a("result", "1");
                            break;
                    }
                    eVar.a("timeout", this.f + "");
                    u = cVar.u();
                    if (u != null && (a2 = u.a("campaign_request_error")) != null && (a2 instanceof com.mbridge.msdk.foundation.same.net.exception.a)) {
                        if (((com.mbridge.msdk.foundation.same.net.exception.a) a2).c == null) {
                            eVar.a("code", Integer.valueOf(((com.mbridge.msdk.foundation.same.net.exception.a) a2).c.d));
                        } else {
                            eVar.a("code", Integer.valueOf(u.g()));
                        }
                        eVar.a("reason", u.l());
                        eVar.a("err_desc", u.i());
                        cVar.a((com.mbridge.msdk.foundation.error.b) null);
                    }
                    eVar.a("hst", k());
                    eVar.a("126_exclude", 1);
                    cVar.a("2000126", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", cVar);
                }
                eVar.a("result", "2");
                eVar.a("timeout", this.f + "");
                u = cVar.u();
                if (u != null) {
                    if (((com.mbridge.msdk.foundation.same.net.exception.a) a2).c == null) {
                    }
                    eVar.a("reason", u.l());
                    eVar.a("err_desc", u.i());
                    cVar.a((com.mbridge.msdk.foundation.error.b) null);
                }
                eVar.a("hst", k());
                eVar.a("126_exclude", 1);
                cVar.a("2000126", eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", cVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                obtain.setData(bundle);
            }
            this.L.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i2;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                obtain.setData(bundle);
            }
            if (str.contains(TelemetryCategory.EXCEPTION)) {
                this.L.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.L.sendMessage(obtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.j = aVar;
    }

    public void a(a.j jVar) {
        this.k = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.reward.adapter.d a(CampaignUnit campaignUnit) {
        boolean z;
        this.y = campaignUnit;
        com.mbridge.msdk.reward.adapter.d b2 = b(campaignUnit);
        new com.mbridge.msdk.reward.candidate.a(this.b, this.r).a(b2.b(), this.C, this, this.b);
        CopyOnWriteArrayList<CampaignEx> b3 = b2.b();
        if (b2.e()) {
            if (b2.d() == 0) {
                b3.clear();
            } else if (b2.a()) {
                b(campaignUnit.getMetricsData());
            }
            if (b2.c() == 0) {
                z = false;
                a(b3, true, false, z);
                return b2;
            }
        }
        z = true;
        a(b3, true, false, z);
        return b2;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z, boolean z2, boolean z3) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        try {
            if (z2) {
                this.V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.W = copyOnWriteArrayList2;
                cVar = a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                cVar = this.y.getMetricsData();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e2.getMessage());
            }
            cVar = null;
        }
        a(this.y, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (z2) {
                    eVar.a("cache", 1);
                } else {
                    eVar.a("cache", 2);
                }
                if (cVar != null) {
                    cVar.a("2000127", eVar);
                    cVar.a("2000048", eVar);
                }
                a(cVar);
            }
            List<CampaignEx> b2 = com.mbridge.msdk.videocommon.cache.a.a().b(this.b, 1, this.s);
            if (b2 != null && b2.size() > 0 && cVar != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                eVar2.a("cid", campaignEx.getId());
                eVar2.a("price", "");
                eVar2.a("bid_tk", this.C);
                eVar2.a("lrid", campaignEx.getLocalRequestId());
                CampaignEx campaignEx2 = b2.get(0);
                eVar2.a("cid_old", com.mbridge.msdk.foundation.same.c.a(b2));
                eVar2.a("price_old", "");
                eVar2.a("bid_tk_old", campaignEx2.getBidToken());
                eVar2.a("lrid_old", campaignEx2.getLocalRequestId());
                cVar.a("m_load_overwrite", eVar2);
                com.mbridge.msdk.reward.report.metrics.a.a().a("m_load_overwrite", cVar);
            }
            if (z3) {
                a(copyOnWriteArrayList);
                return;
            } else {
                this.U = "campaign filtered";
                a(880021, "campaign filtered", cVar);
                return;
            }
        }
        q0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.U)) {
            this.U = "APP ALREADY INSTALLED";
        }
        a(this.U.contains("INSTALL") ? 880021 : 880003, this.U, cVar);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.y;
        if (campaignUnit != null) {
            a(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.c, this.b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.z = copyOnWriteArrayList;
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.z);
        boolean isEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z = !isEmpty;
        int nscpt = campaignEx.getNscpt();
        this.O = false;
        this.P = false;
        synchronized (this.o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.S = false;
        this.R = false;
        if (this.s) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.a, z, nscpt, this.s, this.r ? 287 : 94, this.c, this.b, campaignEx.getRequestId(), copyOnWriteArrayList, new C1450c(campaignEx, z, copyOnWriteArrayList, nscpt), new d(campaignEx, z, copyOnWriteArrayList, nscpt));
        if (isEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.a, campaignEx, this.c, this.b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z, nscpt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    com.mbridge.msdk.videocommon.a.e(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x004f, B:9:0x0055, B:11:0x005e, B:13:0x0064, B:14:0x006b, B:16:0x0071, B:19:0x0079, B:25:0x009b, B:27:0x00a1, B:28:0x00a5, B:30:0x00ab, B:33:0x00b3, B:38:0x00bf), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x004f, B:9:0x0055, B:11:0x005e, B:13:0x0064, B:14:0x006b, B:16:0x0071, B:19:0x0079, B:25:0x009b, B:27:0x00a1, B:28:0x00a5, B:30:0x00ab, B:33:0x00b3, B:38:0x00bf), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x004f, B:9:0x0055, B:11:0x005e, B:13:0x0064, B:14:0x006b, B:16:0x0071, B:19:0x0079, B:25:0x009b, B:27:0x00a1, B:28:0x00a5, B:30:0x00ab, B:33:0x00b3, B:38:0x00bf), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x004f, B:9:0x0055, B:11:0x005e, B:13:0x0064, B:14:0x006b, B:16:0x0071, B:19:0x0079, B:25:0x009b, B:27:0x00a1, B:28:0x00a5, B:30:0x00ab, B:33:0x00b3, B:38:0x00bf), top: B:49:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        CampaignEx campaignEx;
        String requestId;
        int vcn;
        String bidToken;
        String str2 = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    requestId = campaignEx.getRequestId();
                    vcn = campaignEx.getVcn();
                    bidToken = campaignEx.getBidToken();
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        str2 = campaignEx.getLocalRequestId();
                    }
                    if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().c(str, str2);
                        com.mbridge.msdk.videocommon.cache.a.a().b(str);
                        com.mbridge.msdk.videocommon.cache.a.a().a(str, str2);
                    }
                    if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(str, vcn);
                    }
                    if (list != null && list.size() > 0) {
                        com.mbridge.msdk.reward.controller.a.a(requestId, bidToken);
                        for (CampaignEx campaignEx2 : list) {
                            if (campaignEx2 != null) {
                                com.mbridge.msdk.foundation.same.buffer.b.a(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId(), campaignEx2.getId(), campaignEx2.getPlct(), campaignEx2.getPlctb(), campaignEx2.getTimestamp(), campaignEx2.getLocalRequestId());
                            }
                        }
                    }
                    if (list2 != null && list2.size() > 0) {
                        for (CampaignEx campaignEx3 : list2) {
                            if (campaignEx3 != null) {
                                com.mbridge.msdk.foundation.same.buffer.b.c(campaignEx3.getCampaignUnitId(), campaignEx3.getRequestId());
                            }
                        }
                    }
                    com.mbridge.msdk.foundation.same.buffer.b.e(str);
                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).d();
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        vcn = 1;
        requestId = "";
        bidToken = requestId;
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
        }
        if (list != null) {
            com.mbridge.msdk.reward.controller.a.a(requestId, bidToken);
            while (r13.hasNext()) {
            }
        }
        if (list2 != null) {
            while (r13.hasNext()) {
            }
        }
        com.mbridge.msdk.foundation.same.buffer.b.e(str);
        com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z, String str2) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getEcppv()) && !TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z, str2);
                return;
            } else {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z);
                return;
            }
        }
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z, str2);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.a, cVar, new f());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(String str) {
        if (a1.b(str)) {
            com.mbridge.msdk.reward.controller.a.c0 = str;
        }
    }

    public void a(int i2, int i3, int i4) {
        this.v = i2;
        this.w = i3;
        this.x = i4;
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.l != null && TextUtils.isEmpty(str)) {
            int q = this.l.q() * 1000;
            List<CampaignEx> list = this.X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.X.get(0).getTimestamp() < q) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.A, cVar);
    }

    public void a(String str, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.L != null) {
            h hVar = new h(str, cVar);
            this.D = hVar;
            this.L.postDelayed(hVar, 90000L);
            return;
        }
        b(str, z, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message == null) {
            return cVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid")) : cVar;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return cVar;
            }
            e2.printStackTrace();
            return cVar;
        }
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        str = list.get(0).getLocalRequestId();
                    }
                    if (com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(str)) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(str);
                        if (cVar2 == null) {
                            try {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            } catch (Exception e2) {
                                e = e2;
                                cVar = cVar2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                                return cVar;
                            }
                        } else {
                            cVar = cVar2;
                        }
                    }
                    cVar.i(str);
                    cVar.b(list);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("cache", 1);
        eVar.a(CampaignEx.JSON_KEY_HB, 1);
        eVar.a("auto_load", 2);
        cVar.a("2000127", eVar);
        cVar.a("2000048", eVar);
        cVar.a(this.r ? 287 : 94);
        cVar.h("1");
        cVar.f("2");
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar);
        }
        return cVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.i(campaignEx.getLocalRequestId());
                        }
                        cVar.b(list);
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            a(false, cVar, eVar);
        }
    }

    private void a(boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
            }
            cVar.b(list);
        }
        a(z, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.b);
        cVar.a(this.r ? 287 : 94);
        eVar.a("result", Integer.valueOf(z ? 1 : 2));
        eVar.a("bid_tk", this.C);
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.s ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
