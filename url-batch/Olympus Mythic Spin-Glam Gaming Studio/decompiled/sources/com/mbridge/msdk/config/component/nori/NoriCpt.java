package com.mbridge.msdk.config.component.nori;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.monitor.b;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class NoriCpt extends com.mbridge.msdk.config.component.base.a {
    private com.mbridge.msdk.config.component.nori.model.a h;

    class a implements com.mbridge.msdk.config.component.common.network.a {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            q0.a("NoriCpt", "Request started: " + this.a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.c(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.a(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void d(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.b(aVar);
        }
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("<htm") || str.contains("<body") || str.contains("<div");
    }

    private void f(String str) {
        if (d(str)) {
            g(str);
        } else {
            c(str);
        }
    }

    private void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("500"), "1");
        hashMap.put(c.c("state_code"), "200");
        hashMap.put(c.c("545"), str);
        hashMap.put(c.c("is_html"), e(str) ? "1" : "2");
        hashMap.put(c.c("request_type"), this.h.f());
        a(a("906002", (Map<String, Object>) hashMap));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.nori.model.a aVar = this.h;
        if (aVar == null || aVar.l() == null || this.h.l().isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("code"), "500001");
            hashMap.put(c.c("reason"), "Network request model or URLs is null/empty");
            a(a("906002", (Map<String, Object>) hashMap));
            return;
        }
        for (String str : this.h.l()) {
            if (!TextUtils.isEmpty(str)) {
                f(c.a(str, this.h.d()));
            }
        }
        a("906003", (HashMap<String, Object>) null);
    }

    private void c(String str) {
        com.mbridge.msdk.config.component.nori.monitor.a aVar = new com.mbridge.msdk.config.component.nori.monitor.a();
        com.mbridge.msdk.config.component.common.network.result.a aVar2 = new com.mbridge.msdk.config.component.common.network.result.a();
        aVar2.a(aVar);
        a aVar3 = new a(str);
        b bVar = new b(this.h.k());
        aVar2.a(bVar);
        bVar.a(aVar2);
        bVar.a(aVar3);
        bVar.d();
        com.mbridge.msdk.config.component.common.network.c cVar = new com.mbridge.msdk.config.component.common.network.c(this.h, aVar2);
        cVar.a(str, aVar3);
        cVar.b();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f = "906001";
        this.h = new com.mbridge.msdk.config.component.nori.model.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            hashMap.put(c.c("500"), aVar.e() + "");
            hashMap.put(c.c("state_code"), aVar.g() + "");
            hashMap.put(c.c("545"), aVar.f());
            hashMap.put(c.c("is_html"), e(aVar.f()) ? "1" : "2");
        }
        hashMap.put(c.c("request_type"), this.h.f());
        a(a("906002", (Map<String, Object>) hashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("500"), "0");
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            hashMap.put(c.c("state_code"), aVar.g() + "");
            hashMap.put(c.c("reason"), aVar.d());
            hashMap.put(c.c("code"), Integer.valueOf(aVar.c()));
        }
        hashMap.put(c.c("request_type"), this.h.f());
        a(a("906002", (Map<String, Object>) hashMap));
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.h.c() != null) {
            try {
                return this.h.c().contains(Uri.parse(str).getHost());
            } catch (Exception e) {
                q0.b("NoriCpt", "Error checking host: " + e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        String f = aVar.f();
        if (TextUtils.isEmpty(f)) {
            return;
        }
        if (d(f)) {
            g(f);
            aVar.a().b();
        } else {
            c(f);
        }
    }
}
