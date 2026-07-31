package com.ironsource.mediationsdk;

import com.ironsource.Ab;
import com.ironsource.C4573ba;
import com.ironsource.C4834q2;
import com.ironsource.C4866s;
import com.ironsource.W8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class k {
    private HashSet<ImpressionDataListener> a;
    protected C4866s b;
    protected C4573ba c;
    protected AdInfo d;

    public k(HashSet<ImpressionDataListener> hashSet, C4573ba c4573ba) {
        new HashSet();
        this.a = hashSet;
        this.b = new C4866s();
        this.c = c4573ba;
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void a(C4573ba c4573ba) {
        this.c = c4573ba;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(W8 w8, Ab ab) {
        if (w8 != null) {
            this.d = new AdInfo(w8, ab);
        }
    }

    protected void a(C4834q2 c4834q2, String str) {
        HashSet hashSet;
        if (c4834q2 != null) {
            W8 a = c4834q2.a(str);
            if (a != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.a.clone();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a);
                    impressionDataListener.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected void a(JSONObject jSONObject, IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    protected void a(IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
