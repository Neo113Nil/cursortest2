package com.fyber.inneractive.sdk.util.viewtime;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.c0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class c extends a {
    public final x b;
    public final com.fyber.inneractive.sdk.util.a c;
    public boolean d;

    public c(x xVar, com.fyber.inneractive.sdk.util.a aVar, boolean z) {
        this.b = xVar;
        this.c = aVar;
        this.d = z;
    }

    public final void a(boolean z) {
        Object obj;
        r rVar;
        long j = this.a;
        String format = String.format(Locale.US, "%d.%03d", Integer.valueOf((int) (j / 1000)), Integer.valueOf((int) (j % 1000)));
        u uVar = u.VAST_WATCHED_DURATION_AND_SKIP_ACTION;
        x xVar = this.b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.a : null;
        e eVar = xVar != null ? xVar.b : null;
        JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
        w wVar = new w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = b;
        Boolean valueOf = Boolean.valueOf(this.d);
        if (z) {
            com.fyber.inneractive.sdk.util.a aVar = this.c;
            aVar.getClass();
            obj = c0.a(System.currentTimeMillis(), aVar.d, aVar.f);
        } else {
            obj = -1;
        }
        wVar.a(IronSourceConstants.EVENTS_DURATION, format, "is_skip_clickable", valueOf, "skip_action_latency", obj);
        wVar.a((String) null);
    }
}
