package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ComponentMetrics.java */
/* loaded from: classes10.dex */
public class a {
    m a;
    x b;
    JSONObject c;

    /* compiled from: ComponentMetrics.java */
    private static final class b {
        static final a a = new a();
    }

    public static a a() {
        return b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.a;
            if (mVar == null) {
                m a = m.a("metrics_component", c.n().d(), b());
                this.a = a;
                if (a != null) {
                    JSONObject jSONObject = this.c;
                    if (jSONObject != null) {
                        a.a(jSONObject);
                    }
                    this.a.h();
                }
            } else {
                JSONObject jSONObject2 = this.c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e) {
            q0.b("ComponentMetrics", e.getMessage());
        }
        return this.a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.c = new JSONObject(map);
            } catch (Exception e) {
                q0.b("ComponentMetrics", e.getMessage());
            }
        }
    }

    public void d() {
        if (this.a == null) {
            this.a = c();
        }
        this.a.a();
    }

    private a() {
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String valueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(valueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th) {
                q0.b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    private x b() {
        if (this.b == null) {
            this.b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.a$$ExternalSyntheticLambda0
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    boolean a;
                    a = a.a(eVar);
                    return a;
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().d, 0)).a();
        }
        return this.b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.b = xVar;
            m mVar = this.a;
            if (mVar != null) {
                mVar.i();
                m.b("metrics_component");
                this.a = null;
            }
            c();
        }
    }
}
