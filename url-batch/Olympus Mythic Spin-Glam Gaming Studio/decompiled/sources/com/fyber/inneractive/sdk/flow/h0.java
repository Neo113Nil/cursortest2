package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h0 implements i0, r0 {
    public final String a;
    public InneractiveAdSpot.RequestListener b;
    public InneractiveAdRequest c;
    public e0 d;
    public x e;
    public s0 f;
    public final HashSet g;
    public m h;
    public g0 i;
    public p l;
    public com.fyber.inneractive.sdk.rtb.watermark.b m;
    public boolean j = true;
    public boolean k = false;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final Object o = new Object();

    public h0() {
        String uuid = UUID.randomUUID().toString();
        this.a = uuid;
        this.g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), uuid);
    }

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.g.size() > 0) {
                Iterator it = new HashSet(this.g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.g.add(s0Var);
            if (this.e != null) {
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    s0 s0Var2 = (s0) it2.next();
                    if (s0Var2.supports(this)) {
                        this.f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        Bitmap bitmap;
        this.n.set(true);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.g.clear();
        a((x) null);
        this.b = null;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.m;
        if (bVar != null) {
            IAlog.a("%s destroy called", "InneractiveWatermark");
            ImageView imageView = bVar.a;
            if (imageView != null) {
                Drawable background = imageView.getBackground();
                if ((background instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) background).getBitmap()) != null) {
                    try {
                        bitmap.recycle();
                    } catch (Throwable unused) {
                    }
                }
            }
            com.fyber.inneractive.sdk.util.v.a(bVar.a);
            bVar.a = null;
            this.m = null;
        }
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.N.m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.N.l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.N.n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        boolean z;
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        Long valueOf;
        Long valueOf2;
        x xVar2 = this.e;
        if (xVar2 == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.e eVar2 = xVar2.b;
        if (eVar2 != null) {
            if (eVar2.a < System.currentTimeMillis()) {
                z = true;
                if (z && (xVar = this.e) != null) {
                    eVar = xVar.b;
                    if (!this.k && eVar != null) {
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - eVar.c);
                        long j = eVar.b;
                        long j2 = minutes - j;
                        IAlog.a("Firing Event 802 - AdExpired - time passed- " + j2 + ", sessionTimeOut - " + j, new Object[0]);
                        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                        InneractiveAdRequest inneractiveAdRequest = xVar.a;
                        JSONArray b = xVar.c.b();
                        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                        wVar.b = tVar;
                        wVar.a = inneractiveAdRequest;
                        wVar.d = b;
                        JSONObject jSONObject = new JSONObject();
                        valueOf = Long.valueOf(j2);
                        try {
                            jSONObject.put("time_passed", valueOf);
                        } catch (Exception unused) {
                            IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                        }
                        valueOf2 = Long.valueOf(j);
                        try {
                            jSONObject.put("timeout", valueOf2);
                        } catch (Exception unused2) {
                            IAlog.f("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                        }
                        wVar.f.put(jSONObject);
                        wVar.a((String) null);
                        this.k = true;
                    }
                }
                return !z && this.e.d();
            }
        }
        z = false;
        if (z) {
            eVar = xVar.b;
            if (!this.k) {
                long minutes2 = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - eVar.c);
                long j3 = eVar.b;
                long j22 = minutes2 - j3;
                IAlog.a("Firing Event 802 - AdExpired - time passed- " + j22 + ", sessionTimeOut - " + j3, new Object[0]);
                com.fyber.inneractive.sdk.network.t tVar2 = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest2 = xVar.a;
                JSONArray b2 = xVar.c.b();
                com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar2.b = tVar2;
                wVar2.a = inneractiveAdRequest2;
                wVar2.d = b2;
                JSONObject jSONObject2 = new JSONObject();
                valueOf = Long.valueOf(j22);
                jSONObject2.put("time_passed", valueOf);
                valueOf2 = Long.valueOf(j3);
                jSONObject2.put("timeout", valueOf2);
                wVar2.f.put(jSONObject2);
                wVar2.a((String) null);
                this.k = true;
            }
        }
        if (z) {
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.n.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.c()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.d.a(this.a).c();
        String str2 = this.a;
        this.l = new p(str2);
        if (this.d == null) {
            this.d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r a = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, a, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        if (IAConfigManager.g()) {
            Application application = com.fyber.inneractive.sdk.util.o.a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.config.a0(IAConfigManager.N, application));
        }
        IAConfigManager.N.E.a();
        com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, a));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f.destroy();
                this.f = null;
            }
            this.g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        if (IAConfigManager.c()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.c;
        String str = this.a;
        inneractiveAdRequest2.b = str;
        com.fyber.inneractive.sdk.metrics.d.d.a(str).c();
        if (this.g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.c;
                }
                a(inneractiveAdRequest, null);
                this.b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        m mVar = this.h;
        if (mVar != null) {
            boolean z = inneractiveAdRequest != null || this.c == null;
            l lVar = mVar.g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.d = null;
            }
            mVar.a(z);
            mVar.b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.c = inneractiveAdRequest;
            x xVar = this.e;
            if (xVar != null) {
                xVar.destroy();
                this.j = true;
            }
            Iterator it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.c.a = false;
                    break;
                } else if (((s0) it.next()) instanceof InneractiveFullscreenUnitController) {
                    break;
                }
            }
        }
        this.h = new m(this.a);
        if (this.d == null) {
            this.d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        if (IAConfigManager.g()) {
            Application application = com.fyber.inneractive.sdk.util.o.a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.config.a0(IAConfigManager.N, application));
        }
        IAConfigManager.N.E.a();
        m mVar3 = this.h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.c;
            mVar3.b = this.d;
            if (IAConfigManager.d()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.a);
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.b.post(new d0(this));
        } else {
            b();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar;
        JSONArray b;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.e;
        if (xVar2 != null) {
            if (xVar2.b() && (xVar = this.e) != null && !xVar.e) {
                String arrays = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", arrays);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.a;
                com.fyber.inneractive.sdk.response.e eVar = xVar3.b;
                m mVar = this.h;
                p pVar = this.l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.c : null;
                if (mVar != null && (rVar = mVar.c) != null) {
                    b = rVar.b();
                } else {
                    b = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.b = tVar;
                wVar.a = inneractiveAdRequest;
                wVar.d = b;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack_trace", arrays);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", arrays);
                }
                wVar.f.put(jSONObject);
                wVar.a((String) null);
            }
            this.e.destroy();
            this.e = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.response.e eVar3;
        if (inneractiveAdRequest != null && inneractiveAdRequest.getSelectedUnitConfig() != null) {
            if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).c != null) {
                unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).c.b;
            } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f != null) {
                unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f.j;
            }
            x xVar = this.e;
            eVar2 = (xVar != null || (eVar3 = xVar.b) == null) ? eVar : eVar3;
            String str = this.a;
            if (unitDisplayType == null && eVar2 != null) {
                unitDisplayType = eVar2.n;
            }
            UnitDisplayType unitDisplayType2 = unitDisplayType;
            x xVar2 = this.e;
            new com.fyber.inneractive.sdk.metrics.c(eVar2, inneractiveAdRequest, str, unitDisplayType2, xVar2 != null ? xVar2.c.b() : null).a();
        }
        unitDisplayType = null;
        x xVar3 = this.e;
        if (xVar3 != null) {
        }
        String str2 = this.a;
        if (unitDisplayType == null) {
            unitDisplayType = eVar2.n;
        }
        UnitDisplayType unitDisplayType22 = unitDisplayType;
        x xVar22 = this.e;
        new com.fyber.inneractive.sdk.metrics.c(eVar2, inneractiveAdRequest, str2, unitDisplayType22, xVar22 != null ? xVar22.c.b() : null).a();
    }

    public final void a(x xVar) {
        synchronized (this.o) {
            try {
                p pVar = this.l;
                if (pVar != null) {
                    pVar.a(true);
                    pVar.b = null;
                    this.l = null;
                }
                m mVar = this.h;
                if (mVar != null) {
                    l lVar = mVar.g;
                    if (lVar != null) {
                        IAConfigManager.removeListener(lVar);
                    }
                    com.fyber.inneractive.sdk.network.m mVar2 = mVar.d;
                    if (mVar2 != null) {
                        mVar2.a();
                        mVar.d = null;
                    }
                    mVar.a(true);
                    mVar.b = null;
                    this.h = null;
                }
                if (xVar != null) {
                    xVar.destroy();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str, String str2) {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        com.fyber.inneractive.sdk.config.i iVar = iAConfigManager.u;
        com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.t;
        if (sVar != null && sVar.b.a(true, "ext_wm") && iVar != null && !TextUtils.isEmpty(str2)) {
            this.m = new com.fyber.inneractive.sdk.rtb.watermark.b(iVar.a(), str2);
        }
        loadAd(str);
    }
}
