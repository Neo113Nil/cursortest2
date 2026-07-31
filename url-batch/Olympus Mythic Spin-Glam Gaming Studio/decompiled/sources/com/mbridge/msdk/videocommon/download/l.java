package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: UnitCacheCtroller.java */
/* loaded from: classes8.dex */
public class l {
    private com.mbridge.msdk.videocommon.listener.a c;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> e;
    private Context h;
    private String j;
    private com.mbridge.msdk.videocommon.setting.c k;
    private int m;
    private k p;
    private boolean q;
    private List<CampaignEx> a = new ArrayList();
    private boolean b = true;
    private String d = "";
    private c f = new a();
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> g = new CopyOnWriteArrayList<>();
    private long i = 3600;
    private int l = 1;
    m n = null;
    m o = null;

    /* compiled from: UnitCacheCtroller.java */
    class a implements c {
        a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j, int i) {
            if (i == 5 || i == 4) {
                l.this.b = true;
                l.this.d();
            }
            if (i == 2) {
                l.this.b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i) {
        this.m = 1;
        try {
            boolean b2 = j.a().b(i);
            this.q = b2;
            if (b2) {
                this.j = str;
                this.m = i;
                this.p = new k(list, str, i);
                return;
            }
        } catch (Exception unused) {
            this.p = null;
            this.q = false;
        }
        this.h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.j = str;
        this.m = i;
        a(this.a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.q || (kVar = this.p) == null) ? this.g : kVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0042 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003a, B:22:0x0042, B:24:0x0048, B:27:0x0058, B:30:0x005f, B:32:0x0065, B:33:0x0067, B:36:0x0073, B:37:0x0083, B:39:0x0094, B:41:0x0098, B:42:0x00a0, B:43:0x00a4, B:49:0x00b9, B:51:0x00bd, B:52:0x00d1, B:54:0x00d5, B:55:0x00db, B:57:0x00df, B:59:0x00e3, B:60:0x00f7, B:62:0x00fb, B:63:0x0129, B:65:0x012e, B:66:0x0134, B:70:0x016b, B:71:0x016f, B:73:0x0174, B:78:0x017c, B:82:0x0182, B:84:0x0186, B:85:0x018f, B:87:0x0193, B:91:0x019d, B:92:0x01a1, B:95:0x01c3, B:99:0x01c9, B:101:0x01cd, B:106:0x01db, B:112:0x01e4, B:114:0x01ef, B:117:0x01f3, B:120:0x01f7, B:123:0x01fd, B:136:0x0208, B:141:0x0210, B:126:0x0215, B:131:0x0222, B:134:0x021f, B:155:0x0100, B:157:0x0104, B:160:0x0119, B:162:0x011f, B:164:0x0123, B:178:0x0227), top: B:11:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003a, B:22:0x0042, B:24:0x0048, B:27:0x0058, B:30:0x005f, B:32:0x0065, B:33:0x0067, B:36:0x0073, B:37:0x0083, B:39:0x0094, B:41:0x0098, B:42:0x00a0, B:43:0x00a4, B:49:0x00b9, B:51:0x00bd, B:52:0x00d1, B:54:0x00d5, B:55:0x00db, B:57:0x00df, B:59:0x00e3, B:60:0x00f7, B:62:0x00fb, B:63:0x0129, B:65:0x012e, B:66:0x0134, B:70:0x016b, B:71:0x016f, B:73:0x0174, B:78:0x017c, B:82:0x0182, B:84:0x0186, B:85:0x018f, B:87:0x0193, B:91:0x019d, B:92:0x01a1, B:95:0x01c3, B:99:0x01c9, B:101:0x01cd, B:106:0x01db, B:112:0x01e4, B:114:0x01ef, B:117:0x01f3, B:120:0x01f7, B:123:0x01fd, B:136:0x0208, B:141:0x0210, B:126:0x0215, B:131:0x0222, B:134:0x021f, B:155:0x0100, B:157:0x0104, B:160:0x0119, B:162:0x011f, B:164:0x0123, B:178:0x0227), top: B:11:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        int g;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.j();
            return;
        }
        b();
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.g)) {
                        this.b = true;
                    }
                    Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.g.iterator();
                    while (it.hasNext()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                if (value != null && !value.t()) {
                                    if (this.m == 95) {
                                        this.b = true;
                                    }
                                    int o = value.o();
                                    CampaignEx h = value.h();
                                    if (h != null && o == 0) {
                                        o = com.mbridge.msdk.videocommon.download.b.getInstance().b(h.getId(), h.getVideoUrlEncode());
                                    }
                                    int i = o;
                                    value.a(new b(h));
                                    int b2 = b(h);
                                    if (this.m == 1) {
                                        if (this.n == null) {
                                            this.n = m.i(this.j);
                                        }
                                        b2 = a(h);
                                    }
                                    int i2 = b2;
                                    value.d(i2);
                                    int i3 = this.m;
                                    if (i3 != 94 && i3 != 287 && i3 != 95) {
                                        if (i3 == 298) {
                                            if (this.o == null) {
                                                this.o = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                                            }
                                            m mVar = this.o;
                                            if (mVar != null) {
                                                g = mVar.i();
                                                if (this.m == 1) {
                                                    if (this.n == null) {
                                                        this.n = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                                                    }
                                                    m mVar2 = this.n;
                                                    if (mVar2 != null) {
                                                        g = mVar2.i();
                                                    }
                                                }
                                                value.b(g);
                                                int videoCtnType = h != null ? h.getVideoCtnType() : 1;
                                                value.e(videoCtnType);
                                                q0.b("UnitCacheCtroller", "ready_rate : " + i2 + " cd_rate : " + g + " videoCtnType : " + videoCtnType);
                                                if (a(value, b(h))) {
                                                    String videoUrlEncode = h != null ? h.getVideoUrlEncode() : "";
                                                    com.mbridge.msdk.videocommon.listener.a aVar = this.c;
                                                    if (aVar != null) {
                                                        int i4 = this.m;
                                                        if (i4 == 297 || i4 == 298) {
                                                            try {
                                                                aVar.a(videoUrlEncode);
                                                            } catch (Exception e) {
                                                                if (MBridgeConstans.DEBUG) {
                                                                    q0.b("UnitCacheCtroller", e.getMessage());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.e;
                                                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                                        String requestId = h != null ? h.getRequestId() : "";
                                                        com.mbridge.msdk.videocommon.listener.a aVar2 = this.e.get(requestId + "_" + h.getSecondRequestIndex());
                                                        if (aVar2 != null) {
                                                            try {
                                                                aVar2.a(videoUrlEncode);
                                                            } catch (Exception e2) {
                                                                if (MBridgeConstans.DEBUG) {
                                                                    q0.b("UnitCacheCtroller", e2.getMessage());
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i != 1 && (i != 5 || !a(value, i2))) {
                                                    if (i == 4) {
                                                        continue;
                                                    } else {
                                                        if (m0.s(this.h) != 9 && this.l == 2) {
                                                            return;
                                                        }
                                                        if (i == 2 || this.b) {
                                                            value.a(this.f);
                                                            if (a(value, i2)) {
                                                                int i5 = this.m;
                                                                if (i5 == 94 || i5 == 287) {
                                                                    value.B();
                                                                }
                                                            } else {
                                                                int i6 = this.m;
                                                                if (i6 == 1 || i6 == 95 || i6 == 298) {
                                                                    this.b = false;
                                                                }
                                                                value.B();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        g = 0;
                                        if (this.m == 1) {
                                        }
                                        value.b(g);
                                        if (h != null) {
                                        }
                                        value.e(videoCtnType);
                                        q0.b("UnitCacheCtroller", "ready_rate : " + i2 + " cd_rate : " + g + " videoCtnType : " + videoCtnType);
                                        if (a(value, b(h))) {
                                        }
                                        if (i != 1) {
                                            continue;
                                        } else if (i == 4) {
                                        }
                                    }
                                    if (this.k == null) {
                                        this.k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j, this.m == 287);
                                    }
                                    com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                                    g = cVar != null ? cVar.g() : 0;
                                    value.b(g);
                                    if (h != null) {
                                    }
                                    value.e(videoCtnType);
                                    q0.b("UnitCacheCtroller", "ready_rate : " + i2 + " cd_rate : " + g + " videoCtnType : " + videoCtnType);
                                    if (a(value, b(h))) {
                                    }
                                    if (i != 1) {
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void e() {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.g.iterator();
                        while (it.hasNext()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                            if (next != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = next.entrySet().iterator();
                                while (it2.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                    if (value != null && value.o() == 1) {
                                        value.c("playing and stop download");
                                        value.g();
                                        this.g.remove(next);
                                        return;
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.a);
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(aVar);
        } else {
            this.c = aVar;
        }
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.o == null) {
                    this.o = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                }
                return this.o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.k == null) {
                this.k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j, false);
            }
            return this.k.w();
        } catch (Throwable th) {
            q0.b("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, aVar);
    }

    /* compiled from: UnitCacheCtroller.java */
    class b implements com.mbridge.msdk.videocommon.listener.a {
        final /* synthetic */ CampaignEx a;

        b(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.c != null) {
                l.this.c.a(str);
            }
            if (l.this.e == null || l.this.e.size() <= 0 || this.a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.e.get(this.a.getRequestId() + "_" + this.a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.e.remove(this.a.getRequestId() + "_" + this.a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.c != null) {
                l.this.c.a(str, str2);
            }
            CampaignEx campaignEx = this.a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.a.getRsIgnoreCheckRule().size() <= 0 || !this.a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.e == null || l.this.e.size() <= 0 || this.a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.e.get(this.a.getRequestId() + "_" + this.a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.e.remove(this.a.getRequestId() + "_" + this.a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            q0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (currentTimeMillis - value.n() > this.i * 1000 && value.o() == 1) {
                                    value.c("download timeout");
                                    value.c(this.l);
                                    value.g();
                                    this.g.remove(map);
                                    i--;
                                }
                                if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                    value.g();
                                    this.g.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:56|57|58|59|(1:61)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0204, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("UnitCacheCtroller", r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0213, code lost:
    
        throw r12;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.d = list.get(0).getCurrentLocalRid();
        }
        a();
        b();
        int i = this.m;
        if (i != 1) {
            if (i != 287) {
                if (i == 298) {
                    m a2 = com.mbridge.msdk.setting.i.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                    this.o = a2;
                    if (a2 == null) {
                        this.o = com.mbridge.msdk.setting.i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                    }
                    m mVar = this.o;
                    if (mVar != null) {
                        this.i = mVar.p();
                        this.l = this.o.q();
                    }
                } else if (i != 94) {
                    if (i == 95) {
                        try {
                            if (!TextUtils.isEmpty(this.j)) {
                                m e = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                                if (e == null) {
                                    e = m.j(this.j);
                                }
                                if (e != null) {
                                    this.i = e.p();
                                    this.l = e.q();
                                }
                            }
                        } catch (Exception unused) {
                            q0.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                            return;
                        }
                    }
                }
            }
            try {
                com.mbridge.msdk.videocommon.setting.a c = com.mbridge.msdk.videocommon.setting.b.b().c();
                if (c == null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a();
                }
                if (c != null) {
                    this.i = c.c();
                }
                if (!TextUtils.isEmpty(this.j)) {
                    this.k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                }
                com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                if (cVar != null) {
                    this.l = cVar.l();
                }
            } catch (Exception unused2) {
                q0.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    m e2 = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                    this.n = e2;
                    if (e2 == null) {
                        this.n = m.i(this.j);
                    }
                    m mVar2 = this.n;
                    if (mVar2 != null) {
                        this.i = mVar2.p();
                        this.l = this.n.q();
                    }
                }
            } catch (Exception unused3) {
                q0.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                int i3 = this.m;
                String str = (i3 != 94 && i3 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i4 = 0;
                        while (true) {
                            if (i4 < this.g.size()) {
                                Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i4);
                                if (map == null || !map.containsKey(str)) {
                                    i4++;
                                } else {
                                    com.mbridge.msdk.videocommon.download.a aVar = map.get(str);
                                    if (aVar != null) {
                                        aVar.e(campaignEx);
                                        aVar.c(this.l);
                                        aVar.b(false);
                                        map.remove(str);
                                        map.put(str, aVar);
                                        this.g.set(i4, map);
                                    }
                                    e(campaignEx);
                                }
                            } else {
                                com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.h, campaignEx, this.j, this.l);
                                aVar2.c(this.l);
                                aVar2.a(this.m);
                                HashMap hashMap = new HashMap();
                                hashMap.put(str, aVar2);
                                this.g.add(hashMap);
                                break;
                            }
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.a.clear();
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x021d A[Catch: all -> 0x0033, Exception -> 0x0036, TRY_ENTER, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0019, B:16:0x0025, B:20:0x0075, B:21:0x007a, B:23:0x0082, B:24:0x0092, B:26:0x0098, B:28:0x00a6, B:30:0x00b2, B:31:0x00bc, B:33:0x00c2, B:45:0x00e4, B:54:0x00ec, B:58:0x00f3, B:60:0x0103, B:61:0x010b, B:65:0x0166, B:67:0x0178, B:74:0x0189, B:77:0x018f, B:78:0x023b, B:83:0x019d, B:91:0x01a7, B:93:0x01ad, B:100:0x01b9, B:102:0x01c6, B:104:0x01d0, B:106:0x01de, B:112:0x0206, B:154:0x020c, B:156:0x0212, B:114:0x021d, B:122:0x0233, B:126:0x0240, B:128:0x024b, B:130:0x024f, B:132:0x0259, B:134:0x025f, B:139:0x0267, B:142:0x0271, B:144:0x027b, B:146:0x0281, B:161:0x0119, B:163:0x011f, B:165:0x0129, B:168:0x0136, B:170:0x013c, B:187:0x0142, B:172:0x0146, B:174:0x014c, B:179:0x0154, B:181:0x015e, B:198:0x0039, B:200:0x0045, B:203:0x005b, B:204:0x02a3, B:209:0x004f), top: B:11:0x0019, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0019, B:16:0x0025, B:20:0x0075, B:21:0x007a, B:23:0x0082, B:24:0x0092, B:26:0x0098, B:28:0x00a6, B:30:0x00b2, B:31:0x00bc, B:33:0x00c2, B:45:0x00e4, B:54:0x00ec, B:58:0x00f3, B:60:0x0103, B:61:0x010b, B:65:0x0166, B:67:0x0178, B:74:0x0189, B:77:0x018f, B:78:0x023b, B:83:0x019d, B:91:0x01a7, B:93:0x01ad, B:100:0x01b9, B:102:0x01c6, B:104:0x01d0, B:106:0x01de, B:112:0x0206, B:154:0x020c, B:156:0x0212, B:114:0x021d, B:122:0x0233, B:126:0x0240, B:128:0x024b, B:130:0x024f, B:132:0x0259, B:134:0x025f, B:139:0x0267, B:142:0x0271, B:144:0x027b, B:146:0x0281, B:161:0x0119, B:163:0x011f, B:165:0x0129, B:168:0x0136, B:170:0x013c, B:187:0x0142, B:172:0x0146, B:174:0x014c, B:179:0x0154, B:181:0x015e, B:198:0x0039, B:200:0x0045, B:203:0x005b, B:204:0x02a3, B:209:0x004f), top: B:11:0x0019, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.mbridge.msdk.videocommon.download.a b(int i, boolean z) {
        int i2;
        char c;
        int i3;
        boolean z2;
        List<CampaignEx> b2;
        int i4;
        boolean z3;
        long j;
        char c2;
        k kVar;
        int i5 = i;
        boolean z4 = z;
        if (this.q && (kVar = this.p) != null) {
            return kVar.i();
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                i2 = this.m;
                c = 287;
                i3 = 94;
                z2 = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i2 != 94 && i2 != 287) {
                b2 = com.mbridge.msdk.videocommon.cache.a.a().c(this.j, 1);
                if (b2 == null) {
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                i4 = 0;
                while (i4 < this.g.size()) {
                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i4);
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                        if (value == null || value.h() == null) {
                            z3 = z2;
                            j = currentTimeMillis;
                        } else {
                            CampaignEx h = value.h();
                            Iterator<CampaignEx> it2 = b2.iterator();
                            boolean z5 = false;
                            while (it2.hasNext()) {
                                if (h.getId().equals(it2.next().getId())) {
                                    z5 = true;
                                }
                            }
                            if (z5 && ((!z4 || h.isBidCampaign()) && (z4 || !h.isBidCampaign()))) {
                                String str = h.getendcard_url();
                                String videoUrlEncode = h.getVideoUrlEncode();
                                String str2 = "";
                                if (h.getRewardTemplateMode() != null) {
                                    str2 = h.getRewardTemplateMode().j();
                                }
                                String str3 = str2;
                                CampaignEx.c rewardTemplateMode = h.getRewardTemplateMode();
                                if (this.m == i3 || i5 == 287) {
                                    if (TextUtils.isEmpty(str3) || str3.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(this.m, h, str3)) {
                                        if (b(str, h)) {
                                            if (value.t()) {
                                                value.y();
                                            } else if (a1.a(videoUrlEncode)) {
                                                if (a(rewardTemplateMode)) {
                                                    return value;
                                                }
                                            } else if (a(value, b(h)) && a(rewardTemplateMode)) {
                                                return value;
                                            }
                                        }
                                    }
                                    j = currentTimeMillis;
                                    z3 = true;
                                    i3 = 94;
                                    c2 = 287;
                                    z4 = z;
                                    z2 = z3;
                                    c = c2;
                                    currentTimeMillis = j;
                                    i5 = i;
                                }
                                boolean isEmpty = TextUtils.isEmpty(value.k());
                                int o = value.o();
                                if (this.m == 298 && a(value, b(h))) {
                                    return value;
                                }
                                if (o == 5) {
                                    if (value.t()) {
                                        value.y();
                                        this.g.remove(map);
                                        j = currentTimeMillis;
                                    } else if (!isEmpty) {
                                        value.a(0, 0);
                                        if (this.m == 95) {
                                            return value;
                                        }
                                        j = currentTimeMillis;
                                        z3 = true;
                                        i3 = 94;
                                        c2 = 287;
                                        z4 = z;
                                        z2 = z3;
                                        c = c2;
                                        currentTimeMillis = j;
                                        i5 = i;
                                    } else {
                                        if (a(str, h) && a(rewardTemplateMode)) {
                                            return value;
                                        }
                                        return null;
                                    }
                                } else {
                                    if (!s0.a().a("u_n_c_e_d", true)) {
                                        long n = value.n();
                                        if (value.o() == 1) {
                                            j = currentTimeMillis;
                                            if (currentTimeMillis - n > this.i * 1000) {
                                                value.c("download timeout");
                                                value.g();
                                                this.g.remove(map);
                                                i4--;
                                                int i6 = this.m;
                                                if (i6 != 1) {
                                                    if (i6 == 94) {
                                                    }
                                                }
                                                i5 = i;
                                                z4 = z;
                                                currentTimeMillis = j;
                                                c = 287;
                                                i3 = 94;
                                                z2 = true;
                                            }
                                            if (this.m != 95) {
                                                if (!value.t()) {
                                                    return value;
                                                }
                                                value.y();
                                                this.g.remove(map);
                                            } else {
                                                if (s0.a().a("u_n_c_e_d", true) || (o != 4 && o != 2)) {
                                                    z3 = true;
                                                    if (o == 1) {
                                                        if (!value.t()) {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && a(value, b(h)) && a(str, h) && a(rewardTemplateMode)) {
                                                                return value;
                                                            }
                                                        }
                                                        i3 = 94;
                                                        c2 = 287;
                                                        z4 = z;
                                                        z2 = z3;
                                                        c = c2;
                                                        currentTimeMillis = j;
                                                        i5 = i;
                                                    }
                                                    int i7 = this.m;
                                                    i3 = 94;
                                                    c2 = 287;
                                                    if ((i7 == 94 || i7 == 287) && a(value, b(h)) && a(str, h) && a(rewardTemplateMode)) {
                                                        return value;
                                                    }
                                                    z4 = z;
                                                    z2 = z3;
                                                    c = c2;
                                                    currentTimeMillis = j;
                                                    i5 = i;
                                                }
                                                this.g.remove(map);
                                                value.g();
                                            }
                                        }
                                    }
                                    j = currentTimeMillis;
                                    if (this.m != 95) {
                                    }
                                }
                                i4--;
                                i5 = i;
                                z4 = z;
                                currentTimeMillis = j;
                                c = 287;
                                i3 = 94;
                                z2 = true;
                            }
                            j = currentTimeMillis;
                            z3 = true;
                        }
                        c2 = c;
                        z4 = z;
                        z2 = z3;
                        c = c2;
                        currentTimeMillis = j;
                        i5 = i;
                    }
                    i4++;
                    z4 = z;
                    currentTimeMillis = currentTimeMillis;
                    i5 = i;
                }
                return null;
            }
            b2 = com.mbridge.msdk.videocommon.cache.a.a().b(this.j, 1, z4);
            if ((b2 == null || b2.size() == 0) && (i5 == 94 || i5 == 287)) {
                b2 = com.mbridge.msdk.videocommon.cache.a.a().c(this.j, 1, z4);
            }
            if (b2 != null) {
                q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = " + b2.size());
                long currentTimeMillis2 = System.currentTimeMillis();
                i4 = 0;
                while (i4 < this.g.size()) {
                }
                return null;
            }
            q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
            return null;
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i) {
        this.m = 1;
        try {
            boolean b2 = j.a().b(i);
            this.q = b2;
            if (b2) {
                this.j = str;
                this.m = i;
                this.p = new k(campaignEx, str, i);
                return;
            }
        } catch (Exception unused) {
            this.p = null;
            this.q = false;
        }
        this.h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.j = str;
        this.m = i;
        a(this.a);
    }

    private boolean d(CampaignEx campaignEx) {
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

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.h() != null && value.t()) {
                                    value.y();
                                    this.g.remove(map);
                                    i--;
                                }
                            }
                            i++;
                        } finally {
                        }
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<com.mbridge.msdk.videocommon.download.a> a(String str, int i, boolean z, List<CampaignEx> list, boolean z2, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        ArrayList arrayList;
        long j;
        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.a(list, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        String str6 = "";
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i3 = 0;
                        while (i3 < this.g.size()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i3);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = map.entrySet().iterator();
                            while (it2.hasNext()) {
                                try {
                                    com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                    if (value != null && value.h() != null) {
                                        CampaignEx h = value.h();
                                        boolean z3 = false;
                                        for (CampaignEx campaignEx : list) {
                                            if (h != null && campaignEx != null && !TextUtils.isEmpty(h.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && h.getId().equals(campaignEx.getId()) && h.getRequestId().equals(campaignEx.getRequestId())) {
                                                if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                    h.setNLRid(campaignEx.getNLRid());
                                                }
                                                z3 = true;
                                            }
                                        }
                                        if (!z3) {
                                            arrayList = arrayList2;
                                            str6 = "campaign is not available";
                                            j = currentTimeMillis;
                                            it = it2;
                                        } else if ((!z || h.isBidCampaign()) && (z || !h.isBidCampaign())) {
                                            String str7 = h.getendcard_url();
                                            String videoUrlEncode = h.getVideoUrlEncode();
                                            String str8 = "";
                                            if (h.getRewardTemplateMode() != null) {
                                                str8 = h.getRewardTemplateMode().j();
                                            }
                                            String str9 = str8;
                                            String str10 = str6;
                                            try {
                                                CampaignEx.c rewardTemplateMode = h.getRewardTemplateMode();
                                                it = it2;
                                                if (i == 94 || i == 287) {
                                                    if (!TextUtils.isEmpty(str9) && !str9.contains(CampaignEx.KEY_IS_CMPT_ENTRY) && !a(i, h, str9)) {
                                                        str4 = "template is null or download is not ready";
                                                    } else {
                                                        if (b(str7, h)) {
                                                            if (value.t()) {
                                                                value.y();
                                                                str4 = "task is displayed";
                                                            } else if (a1.a(videoUrlEncode)) {
                                                                if (a(rewardTemplateMode)) {
                                                                    arrayList2.add(value);
                                                                    arrayList = arrayList2;
                                                                    j = currentTimeMillis;
                                                                    str6 = str10;
                                                                } else {
                                                                    str3 = "image list is downloading or fail";
                                                                }
                                                            } else if (a(value, b(h), z2) && a(rewardTemplateMode)) {
                                                                arrayList2.add(value);
                                                                arrayList = arrayList2;
                                                                j = currentTimeMillis;
                                                                str6 = str10;
                                                            } else {
                                                                str3 = "video and image list is downloading or fail";
                                                            }
                                                        } else {
                                                            str3 = "endcard is downloading or fail";
                                                        }
                                                        str10 = str3;
                                                    }
                                                    str6 = str4;
                                                    arrayList = arrayList2;
                                                    j = currentTimeMillis;
                                                }
                                                boolean isEmpty = TextUtils.isEmpty(value.k());
                                                int o = value.o();
                                                if (o == 5) {
                                                    if (value.t()) {
                                                        value.y();
                                                        this.g.remove(map);
                                                        i3--;
                                                        str4 = "task is displayed";
                                                        str6 = str4;
                                                        arrayList = arrayList2;
                                                        j = currentTimeMillis;
                                                    } else {
                                                        if (!isEmpty) {
                                                            value.a(0, 0);
                                                            if (i == 95) {
                                                                arrayList2.add(value);
                                                            } else {
                                                                arrayList = arrayList2;
                                                                str6 = "resource path is not effective";
                                                                j = currentTimeMillis;
                                                            }
                                                        } else {
                                                            if (!a(str7, h) || !a(rewardTemplateMode)) {
                                                                return null;
                                                            }
                                                            arrayList2.add(value);
                                                        }
                                                        arrayList = arrayList2;
                                                        j = currentTimeMillis;
                                                        str6 = str10;
                                                    }
                                                } else {
                                                    ArrayList arrayList3 = arrayList2;
                                                    try {
                                                        if (s0.a().a("u_n_c_e_d", true)) {
                                                            j = currentTimeMillis;
                                                        } else {
                                                            try {
                                                                long n = value.n();
                                                                if (value.o() == 1) {
                                                                    long j2 = currentTimeMillis - n;
                                                                    j = currentTimeMillis;
                                                                    if (j2 > this.i * 1000) {
                                                                        value.c("download timeout");
                                                                        value.g();
                                                                        this.g.remove(map);
                                                                        i3--;
                                                                        if (i != 1 && i != 94) {
                                                                            str10 = "video download time over dlct";
                                                                        }
                                                                        str6 = "video download time over dlct";
                                                                        arrayList2 = arrayList3;
                                                                        it2 = it;
                                                                        currentTimeMillis = j;
                                                                    }
                                                                } else {
                                                                    j = currentTimeMillis;
                                                                }
                                                                i2 = (o == 4 || o == 2) ? 1 : 1;
                                                                this.g.remove(map);
                                                                value.g();
                                                                i3--;
                                                                str5 = "video download stop or pause";
                                                                str6 = str5;
                                                                arrayList = arrayList3;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                str6 = str10;
                                                                arrayList = arrayList3;
                                                                e.printStackTrace();
                                                                if (arrayList.size() == 0) {
                                                                    eVar.a("is_ready_fail_reason", str6);
                                                                }
                                                                return arrayList;
                                                            }
                                                        }
                                                        if (o == i2) {
                                                            if (value.t()) {
                                                                str5 = "video was displayed";
                                                                str6 = str5;
                                                                arrayList = arrayList3;
                                                            } else if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (a(value, b(h), z2) && a(str7, h) && a(rewardTemplateMode)) {
                                                                    arrayList = arrayList3;
                                                                    try {
                                                                        arrayList.add(value);
                                                                        str6 = str10;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        str6 = str10;
                                                                        e.printStackTrace();
                                                                        if (arrayList.size() == 0) {
                                                                        }
                                                                        return arrayList;
                                                                    }
                                                                } else {
                                                                    arrayList = arrayList3;
                                                                    str10 = "video or endcard or image list is downloading or fail";
                                                                    if (i != 94 && i != 287) {
                                                                        arrayList2 = arrayList;
                                                                        str6 = str10;
                                                                        it2 = it;
                                                                        currentTimeMillis = j;
                                                                    }
                                                                    if (!a(value, b(h), z2) && a(str7, h) && a(rewardTemplateMode)) {
                                                                        arrayList.add(value);
                                                                        str6 = str10;
                                                                    } else {
                                                                        str2 = "video or endcard or image list is downloading or fail";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList = arrayList3;
                                                        if (i != 94) {
                                                            arrayList2 = arrayList;
                                                            str6 = str10;
                                                            it2 = it;
                                                            currentTimeMillis = j;
                                                        }
                                                        if (!a(value, b(h), z2)) {
                                                        }
                                                        str2 = "video or endcard or image list is downloading or fail";
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        arrayList = arrayList3;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                arrayList = arrayList2;
                                            }
                                        }
                                        arrayList2 = arrayList;
                                        it2 = it;
                                        currentTimeMillis = j;
                                    } else {
                                        arrayList = arrayList2;
                                        j = currentTimeMillis;
                                        it = it2;
                                        str2 = "task or task's campaign is NULL";
                                    }
                                    str6 = str2;
                                    arrayList2 = arrayList;
                                    it2 = it;
                                    currentTimeMillis = j;
                                } catch (Exception e5) {
                                    e = e5;
                                    arrayList = arrayList2;
                                }
                            }
                            i3++;
                        }
                        arrayList = arrayList2;
                    } finally {
                    }
                } catch (Exception e6) {
                    e = e6;
                    arrayList = arrayList2;
                }
            }
        } else {
            arrayList = arrayList2;
        }
        try {
            if (arrayList.size() == 0 && eVar != null) {
                eVar.a("is_ready_fail_reason", str6);
            }
        } catch (Throwable th) {
            q0.b("UnitCacheCtroller", th.getMessage());
        }
        return arrayList;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.g) != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.g.iterator();
                        while (it.hasNext()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                            if (next != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : next.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.g.remove(next);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i) {
        long m = aVar.m();
        long j = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j > 0 && m * 100 >= j * i) {
            if (i != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i, boolean z) {
        long m = aVar.m();
        long j = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx h = aVar.h();
        if (h != null) {
            if (h.getRsIgnoreCheckRule() != null && h.getRsIgnoreCheckRule().size() > 0 && h.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (h.getIsTimeoutCheckVideoStatus() == 1 && h.getVideoCheckType() == 1) {
                return true;
            }
            if (z && h.getVideoCheckType() == 1) {
                if (i == 0) {
                    return true;
                }
                if ((j != 0 || m != 0) && m >= (i / 100) * j) {
                    h.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th) {
            q0.b("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    private boolean a(int i, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i, boolean z) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.d();
        }
        try {
            return b(i, z);
        } catch (Throwable th) {
            q0.b("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.g.iterator();
                    while (it.hasNext()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                        if (next != null && next.containsKey(str)) {
                            return next.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } finally {
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            m mVar = this.n;
            if (mVar != null) {
                return mVar.C();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e.getMessage());
            }
        }
        return 100;
    }
}
