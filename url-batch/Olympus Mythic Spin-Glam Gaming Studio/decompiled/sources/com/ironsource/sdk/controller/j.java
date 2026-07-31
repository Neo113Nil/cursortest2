package com.ironsource.sdk.controller;

import com.ironsource.C4782n4;
import com.ironsource.C4806oa;
import com.ironsource.C4824pa;
import com.ironsource.C4840q8;
import com.ironsource.C5005z8;
import com.ironsource.InterfaceC4788na;
import com.ironsource.Pc;
import com.ironsource.V5;
import com.ironsource.X5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes14.dex */
class j {
    private final String a;
    private final X5 b;

    j(String str, X5 x5) {
        this.a = str;
        this.b = x5;
    }

    private C5005z8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(V5.c.c) || !jSONObject.has(V5.c.b)) {
            throw new Exception(V5.a.a);
        }
        String string = jSONObject.getString(V5.c.c);
        return new C5005z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(V5.c.b));
    }

    void a(JSONObject jSONObject, InterfaceC4788na interfaceC4788na) {
        char c;
        C4806oa c4806oa = new C4806oa(jSONObject);
        C4824pa c4824pa = new C4824pa(interfaceC4788na);
        try {
            String b = c4806oa.b();
            JSONObject c2 = c4806oa.c();
            C5005z8 b2 = b(c2, this.a);
            IronSourceStorageUtils.ensurePathSafety(b2, this.a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(V5.b.a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137024519:
                    if (b.equals("deleteFolder")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -318115535:
                    if (b.equals(V5.b.e)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 537556755:
                    if (b.equals(V5.b.f)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1764172231:
                    if (b.equals("deleteFile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953259713:
                    if (b.equals(V5.b.d)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(b2, c2.optString(V5.c.a), c2.optInt("connectionTimeout"), c2.optInt("readTimeout"), a(c4806oa, c4824pa));
                return;
            }
            if (c == 1) {
                this.b.a(b2);
                c4824pa.b(c4806oa, a(c4806oa, b2.a()));
                return;
            }
            if (c == 2) {
                this.b.b(b2);
                c4824pa.b(c4806oa, a(c4806oa, b2.a()));
                return;
            }
            if (c == 3) {
                c4824pa.b(c4806oa, a(c4806oa, this.b.c(b2)));
                return;
            }
            if (c == 4) {
                c4824pa.b(c4806oa, a(c4806oa, this.b.d(b2)));
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(b2, c2.optJSONObject(V5.c.g));
                c4824pa.b(c4806oa, a(c4806oa, b2.a()));
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            c4824pa.a(c4806oa, a(c4806oa, e.getMessage()));
        }
    }

    class a implements Pc {
        final /* synthetic */ C4824pa a;
        final /* synthetic */ C4806oa b;

        a(C4824pa c4824pa, C4806oa c4806oa) {
            this.a = c4824pa;
            this.b = c4806oa;
        }

        @Override // com.ironsource.Pc
        public void a(C5005z8 c5005z8) {
            try {
                C4824pa c4824pa = this.a;
                C4806oa c4806oa = this.b;
                c4824pa.b(c4806oa, j.this.a(c4806oa, c5005z8.a()));
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Pc
        public void a(C5005z8 c5005z8, C4840q8 c4840q8) {
            try {
                C4824pa c4824pa = this.a;
                C4806oa c4806oa = this.b;
                c4824pa.a(c4806oa, j.this.a(c4806oa, c4840q8.b()));
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Pc a(C4806oa c4806oa, C4824pa c4824pa) {
        return new a(c4824pa, c4806oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4806oa c4806oa, JSONObject jSONObject) {
        try {
            return c4806oa.e().put("result", jSONObject);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    private JSONObject a(C4806oa c4806oa, long j) {
        try {
            return c4806oa.e().put("result", j);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4806oa c4806oa, String str) {
        try {
            return c4806oa.e().put("errMsg", str);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    private C5005z8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(V5.c.d)) {
            return new C5005z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(V5.c.d)));
        }
        throw new Exception(V5.a.b);
    }
}
