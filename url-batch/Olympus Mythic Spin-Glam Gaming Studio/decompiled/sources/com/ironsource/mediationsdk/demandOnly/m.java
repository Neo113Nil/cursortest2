package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C4618e1;
import com.ironsource.C4782n4;
import com.ironsource.Z9;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class m {
    protected AbstractAdapter a;
    protected C4618e1 b;
    protected JSONObject c;
    private a d;
    private Timer e;
    long f;
    protected String g;
    protected JSONObject h;
    protected List<String> i;
    protected String j;
    private final Object k = new Object();
    private final Object l = new Object();
    protected final IronSource.a m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C4618e1 c4618e1, AbstractAdapter abstractAdapter) {
        this.b = c4618e1;
        this.m = c4618e1.b();
        this.a = abstractAdapter;
        JSONObject c = c4618e1.c();
        this.c = c;
        try {
            c.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e) {
            C4782n4.d().a(e);
        }
        this.d = a.NOT_LOADED;
        this.e = null;
        this.g = "";
        this.h = null;
        this.i = new ArrayList();
    }

    boolean a(a aVar, a aVar2) {
        synchronized (this.k) {
            try {
                if (this.d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.b.f() + ": current state=" + this.d + ", new state=" + aVar);
        synchronized (this.k) {
            this.d = aVar;
        }
    }

    public C4618e1 f() {
        return this.b;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.b.f();
    }

    public int i() {
        return this.b.d();
    }

    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
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
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e);
        }
        return hashMap;
    }

    String k() {
        a aVar = this.d;
        return aVar == null ? POBCommonConstants.NULL_VALUE : aVar.toString();
    }

    public String l() {
        return this.b.i();
    }

    public List<String> m() {
        return this.i;
    }

    public boolean n() {
        return this.b.j();
    }

    public boolean o() {
        return this.c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.l) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.k) {
            try {
                aVar2 = this.d;
                if (Arrays.asList(aVarArr).contains(this.d)) {
                    b(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar2;
    }

    public void b(String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    boolean a(a aVar) {
        boolean z;
        synchronized (this.k) {
            z = this.d == aVar;
        }
        return z;
    }

    public void a(boolean z) {
        try {
            this.c.put("isOneFlow", z);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    void a(TimerTask timerTask) {
        synchronized (this.l) {
            p();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(timerTask, this.f);
        }
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(JSONObject jSONObject) {
        this.h = jSONObject;
    }

    protected void a(List<String> list, String str, int i, String str2, String str3) {
        Iterator it = ((List) Z9.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a(str3, str, com.ironsource.mediationsdk.d.b().a((String) it.next(), str, i, str2, "", "", "", ""));
        }
    }
}
