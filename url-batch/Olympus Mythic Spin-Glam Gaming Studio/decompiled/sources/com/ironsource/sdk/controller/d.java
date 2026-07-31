package com.ironsource.sdk.controller;

import com.ironsource.B5;
import com.ironsource.C4622e5;
import com.ironsource.C4703ie;
import com.ironsource.C4782n4;
import com.ironsource.C4857r8;
import com.ironsource.C4951w8;
import com.ironsource.C5005z8;
import com.ironsource.X3;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC1373d d = EnumC1373d.NONE;
    private String e;
    private String f;
    private C4622e5 g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(X3.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC1373d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        EnumC1373d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, C4622e5 c4622e5) {
        int optInt = jSONObject.optInt(X3.a.j, -1);
        this.b = optInt;
        this.c = a(optInt);
        this.e = str;
        this.f = str2;
        this.g = c4622e5;
    }

    private c a(int i2) {
        return i2 != 1 ? i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C5005z8 g = g();
            if (g.exists()) {
                C5005z8 h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                IronSourceStorageUtils.renameFile(g.getPath(), h2.getPath());
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C5005z8 h() {
        return new C5005z8(this.e, "fallback_mobileController.html");
    }

    private C5005z8 i() {
        return new C5005z8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C4857r8 a2 = new C4857r8().a(B5.y, Integer.valueOf(this.b));
        if (this.a > 0) {
            a2.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C4951w8.a(C4703ie.x, a2.a());
    }

    JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    C5005z8 g() {
        return new C5005z8(this.e, X3.f);
    }

    boolean k() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new C5005z8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new C5005z8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                C5005z8 g = g();
                C5005z8 i3 = i();
                if (!i3.exists() && !g.exists()) {
                    a(new C5005z8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!i3.exists() && g.exists()) {
                    EnumC1373d enumC1373d = EnumC1373d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC1373d;
                    a(enumC1373d);
                    a(new C5005z8(this.e, i3.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC1373d enumC1373d2 = EnumC1373d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC1373d2;
                    a(enumC1373d2);
                    d();
                    a(new C5005z8(this.e, i3.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C5005z8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC1373d enumC1373d3 = EnumC1373d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC1373d3;
                a(enumC1373d3);
                a(new C5005z8(this.e, i3.getName()));
                return true;
            } catch (Exception e) {
                C4782n4.d().a(e);
            }
        }
        return false;
    }

    boolean m() {
        return this.d != EnumC1373d.NONE;
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC1373d enumC1373d = EnumC1373d.CONTROLLER_FROM_SERVER;
        this.d = enumC1373d;
        a(enumC1373d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC1373d enumC1373d = EnumC1373d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC1373d;
            a(enumC1373d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C5005z8 c5005z8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c5005z8, this.f);
    }

    void a(C4857r8 c4857r8) {
        c4857r8.a(B5.y, Integer.valueOf(this.b));
        C4951w8.a(C4703ie.v, c4857r8.a());
        this.a = System.currentTimeMillis();
    }

    private void a(EnumC1373d enumC1373d) {
        C4857r8 a2 = new C4857r8().a(B5.y, Integer.valueOf(this.b)).a(B5.z, Integer.valueOf(enumC1373d.b()));
        if (this.a > 0) {
            a2.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C4951w8.a(C4703ie.w, a2.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C4782n4.d().a(e);
            return false;
        }
    }
}
