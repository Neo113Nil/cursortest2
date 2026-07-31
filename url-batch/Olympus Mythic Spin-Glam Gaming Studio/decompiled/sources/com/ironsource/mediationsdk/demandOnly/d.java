package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4618e1;
import com.ironsource.C4655g2;
import com.ironsource.C4658g5;
import com.ironsource.C4747l5;
import com.ironsource.C4782n4;
import com.ironsource.C4834q2;
import com.ironsource.C4966x5;
import com.ironsource.G9;
import com.ironsource.InterfaceC4619e2;
import com.ironsource.Kb;
import com.ironsource.M8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class d extends m implements BannerSmashListener, InterfaceC4619e2 {
    private C4658g5 n;
    private C4658g5 o;
    private String p;
    private String q;
    private C4655g2 r;
    private com.ironsource.mediationsdk.e s;
    private ISDemandOnlyBannerLayout t;
    private final M8 u;
    private final M8.a v;

    class a implements Runnable {
        final /* synthetic */ com.ironsource.mediationsdk.h a;

        a(com.ironsource.mediationsdk.h hVar) {
            this.a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.a.s());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.a.s()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            d dVar = d.this;
            dVar.s.a(applicationContext, this.a, dVar);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C4618e1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.u = Kb.Y().s();
        this.v = Kb.Q().i();
        this.f = j;
        this.p = str;
        this.q = str2;
        this.r = new C4655g2();
        this.a.initBannerForBidding(str, str2, this.c, this);
        this.s = eVar;
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.o = new C4658g5();
                this.a.initBannerForBidding(this.p, this.q, this.c, this);
                this.a.loadBannerForDemandOnlyForBidding(this.c, str, this.t, this);
            }
        }
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.r = new C4655g2();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(aVarArr, aVar);
        if (a2 == aVar || a2 == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(buildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new C4747l5());
            C4834q2 a3 = new a.C1370a(aVar2.h()).a(h());
            if (a3 == null) {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(buildLoadFailedError2);
                return;
            }
            String k = a3.k();
            if (k == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.r.a(a3.b());
            this.n = new C4658g5();
            w();
            this.a.initBannerForBidding(this.p, this.q, this.c, this);
            this.a.loadBannerForDemandOnlyForBidding(this.c, k, iSDemandOnlyBannerLayout, this);
        } catch (Exception e) {
            C4782n4.d().a(e);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            if (t()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.j.a(hashMap, this.t.getSize());
            }
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.b.d()));
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put("auctionId", this.g);
            }
            JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                hashMap.put("dynamicDemandSource", this.j);
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e.getMessage());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(b.C1371b.g, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4658g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        M8 m8 = this.u;
        IronSource.a aVar = IronSource.a.BANNER;
        int a2 = m8.a(aVar);
        a(b.c.d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a2)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4658g5.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a2)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4658g5.a(this.n))}});
            this.v.b(aVar);
            a(this.r.c(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.r.a(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    com.ironsource.mediationsdk.h q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(IronSource.a.BANNER);
        hVar.a(arrayList);
        hVar.e(str);
        hVar.c(l());
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.a(this.t.getSize());
        return hVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.t = null;
        AbstractAdapter abstractAdapter = this.a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(aVarArr, aVar);
        if (a2 != aVar && a2 != m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.t = iSDemandOnlyBannerLayout;
            this.n = new C4658g5();
            w();
            if (this.s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(b.c.e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
            return;
        }
        String str = "banner layout in blocking state | state: " + k();
        iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
        a(b.c.e, new Object[][]{new Object[]{"reason", str}});
    }

    @Override // com.ironsource.U1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(b.c.g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C4834q2> list, String str, C4834q2 c4834q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, C4658g5.a(this.n));
            a(this.r.b(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) {
        Map<String, Object> j = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        j.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        G9.i().a(new C4966x5(i, new JSONObject(j)));
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.ironsource.InterfaceC4619e2
    public void a(@Nullable d.a aVar, int i, long j, int i2, @Nullable String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        a.C1370a c1370a = new a.C1370a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        a(b.c.h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        a(b.c.j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c1370a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c1370a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C4834q2 c4834q2 = c1370a.get(0);
            this.r.a(c4834q2.b());
            this.r.c(c4834q2.h());
            this.r.b(c4834q2.g());
            String k = c4834q2.k();
            b(k);
            c(k);
        }
    }
}
