package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: UnitCacheControllerRefactor.java */
/* loaded from: classes8.dex */
public final class k {
    private com.mbridge.msdk.videocommon.listener.a a;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;
    private final Context c;
    private final String d;
    private com.mbridge.msdk.videocommon.setting.c e;
    private final int f;
    private final CopyOnWriteArrayList<CampaignEx> g;
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> h;

    /* compiled from: UnitCacheControllerRefactor.java */
    private static final class a implements com.mbridge.msdk.videocommon.listener.a {
        private final String a;
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;
        private final com.mbridge.msdk.videocommon.listener.a c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.a = str;
            this.b = concurrentHashMap;
            this.c = aVar;
        }

        private void b(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadDone error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadDone error: " + e2.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            b(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            b(str, str2);
        }

        private void b(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadFailed error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadFailed error: " + e2.getMessage());
                        }
                    }
                }
            }
        }
    }

    public k(List<CampaignEx> list, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.g = copyOnWriteArrayList;
        this.h = new ConcurrentHashMap<>();
        this.c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.d = str;
        this.f = i;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String b(CampaignEx campaignEx) {
        return campaignEx == null ? "" : campaignEx.getendcard_url();
    }

    private int c() {
        com.mbridge.msdk.videocommon.setting.c b = b(h());
        if (b == null) {
            return 0;
        }
        try {
            return b.g();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            q0.a("RewardVideoRefactorManager", h() + " getCDRate error " + e.getMessage());
            return 0;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            q0.a("RewardVideoRefactorManager", h() + " getVideoCtnType error " + e.getMessage());
            return 1;
        }
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            if (this.h.containsKey(str)) {
                return;
            }
            a(campaignEx, str, (com.mbridge.msdk.videocommon.download.a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " handlerCampaignLoadEvent error", e);
            }
        }
    }

    private boolean g(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.a("RewardVideoRefactorManager", h() + " isPlayerAbleAds error:" + th.getMessage());
            return false;
        }
    }

    public void a() {
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.a = aVar;
    }

    public void h(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.g.add(campaignEx);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e);
                }
            }
        }
    }

    public com.mbridge.msdk.videocommon.download.a i() {
        List<com.mbridge.msdk.videocommon.download.a> list;
        if (this.g.size() == 0) {
            q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
            return null;
        }
        try {
            list = a((List<CampaignEx>) this.g, false);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e);
            }
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public void j() {
        a(this.g);
    }

    public void k() {
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, aVar);
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        try {
            if (this.e == null) {
                this.e = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, b() == 287);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getRewardUnitSetting error " + e.getMessage());
            }
        }
        return this.e;
    }

    private String e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.j();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " getVideoTemplateUrl error", e);
            }
        }
        return "";
    }

    public com.mbridge.msdk.videocommon.download.a d() {
        try {
            return i();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTask error:" + th.getMessage());
            return null;
        }
    }

    public String h() {
        return this.d;
    }

    private int g() {
        try {
            return b(this.d).w();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.a("RewardVideoRefactorManager", h() + " getRewardReadyRate error:" + th.getMessage());
            return 100;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.g.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e);
                }
            }
        }
    }

    private int f() {
        if (TextUtils.isEmpty(h())) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c b = b(h());
            if (b != null) {
                return b.l();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getDlnet error " + e.getMessage());
            }
        }
        return 1;
    }

    public void c(String str) {
        com.mbridge.msdk.videocommon.download.a remove;
        CampaignEx h;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.h.containsKey(str) || (remove = this.h.remove(str)) == null || (h = remove.h()) == null) {
                return;
            }
            this.g.remove(h);
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask campaign name: " + h.getAppName());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask error:" + e.getMessage());
            }
        }
    }

    public k(CampaignEx campaignEx, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.g = copyOnWriteArrayList;
        this.h = new ConcurrentHashMap<>();
        this.c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.d = str;
        this.f = i;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null) {
                    f(next);
                }
            }
            return;
        }
        q0.a("RewardVideoRefactorManager", h() + " load campaignExes is null");
    }

    public int b() {
        return this.f;
    }

    private boolean b(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if ((aVar == null || !aVar.x()) && !campaignEx.isDynamicView()) {
            return ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) && campaignEx.getLoadTimeoutState() == 0 && g.a(str) == null) ? false : true;
        }
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> e() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.h);
            return copyOnWriteArrayList;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTaskList error:" + e.getMessage());
            return null;
        }
    }

    public List<com.mbridge.msdk.videocommon.download.a> a(List<CampaignEx> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    a(z, arrayList, size, campaignEx);
                }
            }
            return arrayList;
        }
        q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
        return arrayList;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    private void a(boolean z, List<com.mbridge.msdk.videocommon.download.a> list, int i, CampaignEx campaignEx) {
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            a(z, list, campaignEx, a(campaignEx, str, this.h.get(str)), i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e);
            }
        }
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a a2 = a(campaignEx);
        a2.C();
        this.h.put(str, a2);
        return a2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:5|(2:6|7)|(2:9|(17:11|12|13|(2:15|(13:17|(2:20|21)|46|(2:48|(8:50|(2:53|54)|27|(1:45)(1:32)|33|(1:35)|36|(4:38|(1:40)|41|42)(1:44)))|58|(2:53|54)|27|(0)|45|33|(0)|36|(0)(0)))|60|(2:20|21)|46|(0)|58|(0)|27|(0)|45|33|(0)|36|(0)(0)))|65|12|13|(0)|60|(0)|46|(0)|58|(0)|27|(0)|45|33|(0)|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0050, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0051, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0037, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: Exception -> 0x0050, TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:13:0x003a, B:15:0x0043), top: B:12:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #1 {Exception -> 0x005c, blocks: (B:21:0x0058, B:46:0x005f, B:48:0x0065), top: B:20:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z, List<com.mbridge.msdk.videocommon.download.a> list, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int loadTimeoutState;
        if (list == null || campaignEx == null || aVar == null) {
            return;
        }
        try {
            loadTimeoutState = campaignEx.getLoadTimeoutState();
        } catch (Exception e) {
            e = e;
            z2 = false;
            z3 = false;
        }
        if (!aVar.w()) {
            if (!a(campaignEx, aVar, c(campaignEx), z, f())) {
                z2 = false;
                aVar.e(z2);
                if (!aVar.u()) {
                    if (!a(b(campaignEx), campaignEx, aVar)) {
                        z3 = false;
                        if (loadTimeoutState == 0 && z3) {
                            try {
                                aVar.c(true);
                            } catch (Exception e2) {
                                e = e2;
                                z4 = false;
                                if (MBridgeConstans.DEBUG) {
                                }
                                if (aVar.s()) {
                                }
                                aVar.a(z5);
                                if (z5) {
                                }
                                if (MBridgeConstans.DEBUG) {
                                }
                            }
                        }
                        if (!aVar.x()) {
                            if (!b(campaignEx, e(campaignEx), aVar)) {
                                z4 = false;
                                if (loadTimeoutState == 0 && z4) {
                                    try {
                                        aVar.f(true);
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (MBridgeConstans.DEBUG) {
                                        }
                                        if (aVar.s()) {
                                        }
                                        aVar.a(z5);
                                        if (z5) {
                                        }
                                        if (MBridgeConstans.DEBUG) {
                                        }
                                    }
                                }
                                z5 = !aVar.s() || (z2 && z3 && z4);
                                aVar.a(z5);
                                if (z5) {
                                    list.add(aVar);
                                }
                                if (MBridgeConstans.DEBUG) {
                                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                                    if (rsIgnoreCheckRule == null) {
                                        rsIgnoreCheckRule = new ArrayList<>();
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(h());
                                    sb.append("  campaign name = ");
                                    sb.append(campaignEx.getAppName());
                                    sb.append("\n\t\tcampaign id = ");
                                    sb.append(campaignEx.getId());
                                    sb.append("\n\t\trequest id = ");
                                    sb.append(campaignEx.getRequestId());
                                    sb.append("\n\t\tadType = ");
                                    sb.append(b());
                                    sb.append("\n\t\tunitID = ");
                                    sb.append(h());
                                    sb.append("\n\t\tisReady = ");
                                    sb.append(z5);
                                    sb.append("\n\t\tisDynamicView = ");
                                    sb.append(campaignEx.isDynamicView());
                                    sb.append("\n\t\tisTPL = ");
                                    sb.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                                    sb.append("\n\t\tcurrentSuccessSize = ");
                                    sb.append(list.size());
                                    sb.append("\n\t\tisReadyCheckSize = ");
                                    sb.append(i);
                                    sb.append("\n\t\ttotalCampaignSize = ");
                                    sb.append(this.g.size());
                                    sb.append("\n\t\tlinkType = ");
                                    sb.append(campaignEx.getLinkType());
                                    sb.append("\n\t\tloadTimeoutState = ");
                                    sb.append(campaignEx.getLoadTimeoutState());
                                    sb.append("\n\t\tisVideoReady = ");
                                    sb.append(z2);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(0));
                                    sb.append("\n\t\t\treadyRate == ");
                                    sb.append(c(campaignEx));
                                    sb.append("\n\t\t\tCDRate = ");
                                    sb.append(c());
                                    sb.append("\n\t\t\tdlnet = ");
                                    sb.append(f());
                                    sb.append("\n\t\t\tctn = ");
                                    sb.append(d(campaignEx));
                                    sb.append("\n\t\t\tdownloadState = ");
                                    sb.append(a(aVar.o()));
                                    sb.append("\n\t\tisTemplateReady = ");
                                    sb.append(z4);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(1));
                                    sb.append("\n\t\tisEndCardReady = ");
                                    sb.append(z3);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(2));
                                    sb.append("\n\t\t\tisOnlyPlayable = ");
                                    sb.append(g(campaignEx));
                                    sb.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                                    sb.append(v0.l(campaignEx.getendcard_url()));
                                    q0.b("RewardVideoRefactorManager", sb.toString());
                                    return;
                                }
                                return;
                            }
                        }
                        z4 = true;
                        if (loadTimeoutState == 0) {
                            aVar.f(true);
                        }
                        if (aVar.s()) {
                        }
                        aVar.a(z5);
                        if (z5) {
                        }
                        if (MBridgeConstans.DEBUG) {
                        }
                    }
                }
                z3 = true;
                if (loadTimeoutState == 0) {
                    aVar.c(true);
                }
                if (!aVar.x()) {
                }
                z4 = true;
                if (loadTimeoutState == 0) {
                }
                if (aVar.s()) {
                }
                aVar.a(z5);
                if (z5) {
                }
                if (MBridgeConstans.DEBUG) {
                }
            }
        }
        z2 = true;
        aVar.e(z2);
        if (!aVar.u()) {
        }
        z3 = true;
        if (loadTimeoutState == 0) {
        }
        if (!aVar.x()) {
        }
        z4 = true;
        if (loadTimeoutState == 0) {
        }
        if (aVar.s()) {
        }
        aVar.a(z5);
        if (z5) {
        }
        if (MBridgeConstans.DEBUG) {
        }
    }

    private String a(int i) {
        if (i == 0) {
            return "DOWNLOAD_READY";
        }
        if (i == 1) {
            return "DOWNLOAD_RUN";
        }
        if (i == 2) {
            return "DOWNLOAD_PAUSE";
        }
        if (i == 4) {
            return "DOWNLOAD_STOP";
        }
        if (i != 5) {
            return "Unknown";
        }
        return "DOWNLOAD_DONE";
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar;
        com.mbridge.msdk.videocommon.download.a aVar2 = null;
        try {
            aVar = new com.mbridge.msdk.videocommon.download.a(this.c, campaignEx, h(), f());
        } catch (Exception e) {
            e = e;
        }
        try {
            aVar.e(campaignEx);
            aVar.a(b());
            aVar.d(c(campaignEx));
            aVar.b(c());
            aVar.e(d(campaignEx));
            aVar.a((c) null);
            aVar.a(new a(h(), this.b, this.a));
            return aVar;
        } catch (Exception e2) {
            e = e2;
            aVar2 = aVar;
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " createAndStartCampaignDownloadTask error " + e.getMessage());
            }
            return aVar2;
        }
    }

    private boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i) {
        if (aVar == null || TextUtils.isEmpty(aVar.i())) {
            return true;
        }
        return i == 0 ? (aVar.h() == null || TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) ? false : true : Utils.getDownloadRate(aVar.j(), aVar.m()) >= i;
    }

    private boolean a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i, boolean z, int i2) {
        if (aVar == null || campaignEx == null) {
            return false;
        }
        if (aVar.w() || g(campaignEx) || TextUtils.isEmpty(aVar.i()) || i2 == 3) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
            return true;
        }
        if (campaignEx.getIsTimeoutCheckVideoStatus() == 1 && campaignEx.getVideoCheckType() == 1) {
            return true;
        }
        long m = aVar.m();
        long j = aVar.j();
        if (z && campaignEx.getVideoCheckType() == 1) {
            if (i == 0) {
                return true;
            }
            if ((j != 0 || m != 0) && m >= (i / 100) * j) {
                campaignEx.setIsTimeoutCheckVideoStatus(1);
                return true;
            }
        }
        return a(aVar, i);
    }

    private boolean a(String str, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar) {
        if (campaignEx != null && aVar != null) {
            try {
                if (aVar.u()) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || a(str, campaignEx)) {
                    return true;
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardDownload error " + th.getMessage());
                }
            }
        }
        return false;
    }

    private boolean a(String str, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !g(campaignEx)) {
            return true;
        }
        if ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) && !a1.b(g.a(str))) {
            return a1.b(g.b(str));
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }
}
