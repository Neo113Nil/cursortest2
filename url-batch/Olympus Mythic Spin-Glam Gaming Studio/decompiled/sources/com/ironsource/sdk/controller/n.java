package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4782n4;
import com.ironsource.C4822p8;
import com.ironsource.InterfaceC4871s4;
import com.ironsource.InterfaceC4889t4;
import com.ironsource.InterfaceC4907u4;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class n implements l {
    private final R7 a;
    private final String b;

    class a implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        a(l.a aVar, f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.a == null) {
                    return;
                }
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put("success", false);
                jsonObjectInit.put("reason", n.this.b);
                this.a.a(new f.a(this.b.f(), jsonObjectInit));
            } catch (JSONException e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ InterfaceC4907u4 a;
        final /* synthetic */ T4 b;

        b(InterfaceC4907u4 interfaceC4907u4, T4 t4) {
            this.a = interfaceC4907u4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4822p8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ InterfaceC4907u4 a;
        final /* synthetic */ JSONObject b;

        c(InterfaceC4907u4 interfaceC4907u4, JSONObject jSONObject) {
            this.a = interfaceC4907u4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class d implements Runnable {
        final /* synthetic */ InterfaceC4889t4 a;
        final /* synthetic */ T4 b;

        d(InterfaceC4889t4 interfaceC4889t4, T4 t4) {
            this.a = interfaceC4889t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4822p8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ InterfaceC4889t4 a;
        final /* synthetic */ String b;

        e(InterfaceC4889t4 interfaceC4889t4, String str) {
            this.a = interfaceC4889t4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, n.this.b);
        }
    }

    class f implements Runnable {
        final /* synthetic */ InterfaceC4889t4 a;
        final /* synthetic */ T4 b;

        f(InterfaceC4889t4 interfaceC4889t4, T4 t4) {
            this.a = interfaceC4889t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b.h(), n.this.b);
        }
    }

    class g implements Runnable {
        final /* synthetic */ InterfaceC4889t4 a;
        final /* synthetic */ JSONObject b;

        g(InterfaceC4889t4 interfaceC4889t4, JSONObject jSONObject) {
            this.a = interfaceC4889t4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class h implements Runnable {
        final /* synthetic */ InterfaceC4889t4 a;
        final /* synthetic */ T4 b;

        h(InterfaceC4889t4 interfaceC4889t4, T4 t4) {
            this.a = interfaceC4889t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.h(), n.this.b);
        }
    }

    class i implements Runnable {
        final /* synthetic */ InterfaceC4871s4 a;
        final /* synthetic */ Map b;

        i(InterfaceC4871s4 interfaceC4871s4, Map map) {
            this.a = interfaceC4871s4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    class j implements Runnable {
        final /* synthetic */ InterfaceC4871s4 a;
        final /* synthetic */ JSONObject b;

        j(InterfaceC4871s4 interfaceC4871s4, JSONObject jSONObject) {
            this.a = interfaceC4871s4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    n(String str, R7 r7) {
        this.a = r7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C4822p8.c h() {
        return C4822p8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4) {
        if (interfaceC4889t4 != null) {
            a(new f(interfaceC4889t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4907u4 interfaceC4907u4) {
        if (interfaceC4907u4 != null) {
            a(new b(interfaceC4907u4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4907u4 interfaceC4907u4) {
        if (interfaceC4907u4 != null) {
            a(new c(interfaceC4907u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4889t4 interfaceC4889t4) {
        if (interfaceC4889t4 != null) {
            a(new d(interfaceC4889t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4889t4 interfaceC4889t4) {
        if (interfaceC4889t4 != null) {
            a(new e(interfaceC4889t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4889t4 interfaceC4889t4) {
        if (interfaceC4889t4 != null) {
            a(new g(interfaceC4889t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4) {
        if (interfaceC4889t4 != null) {
            a(new h(interfaceC4889t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4871s4 interfaceC4871s4) {
        if (interfaceC4871s4 != null) {
            interfaceC4871s4.a(C4822p8.e.Banner, t4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4871s4 interfaceC4871s4) {
        if (interfaceC4871s4 != null) {
            a(new i(interfaceC4871s4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4871s4 interfaceC4871s4) {
        if (interfaceC4871s4 != null) {
            a(new j(interfaceC4871s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        a(new a(aVar, cVar));
    }

    void a(Runnable runnable) {
        R7 r7 = this.a;
        if (r7 != null) {
            r7.c(runnable);
        }
    }
}
