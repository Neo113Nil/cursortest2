package yads;

import android.content.Context;
import android.net.Uri;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class lw1 implements ya2 {
    public final vb2 a;
    public final ew1 b;
    public final sw1 c;
    public final kl3 d;
    public final mb3 e;
    public final jp0 f;
    public final bu2 g;
    public String h;
    public boolean i;
    public final mp0 j;
    public final String k;
    public tw1 l;
    public lv1 m;
    public kv1 n;
    public xa2 o;
    public gi3 p;
    public jw1 q;
    public dl3 r;
    public ip0 s;

    public lw1(vb2 vb2Var, ew1 ew1Var, sw1 sw1Var, kl3 kl3Var, mb3 mb3Var, jp0 jp0Var, bu2 bu2Var, List list) {
        this.a = vb2Var;
        this.b = ew1Var;
        this.c = sw1Var;
        this.d = kl3Var;
        this.e = mb3Var;
        this.f = jp0Var;
        this.g = bu2Var;
        p01 ft2Var = new ft2(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, new gt2() { // from class: yads.lw1$$ExternalSyntheticLambda0
            @Override // yads.gt2
            public final String a() {
                return lw1.a(lw1.this);
            }
        });
        q01 q01Var = new q01(new kw1(this));
        if (!list.isEmpty()) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(ft2Var);
            spreadBuilder.addSpread(list.toArray(new p01[0]));
            ft2Var = new qy((p01[]) spreadBuilder.toArray(new p01[spreadBuilder.size()]));
        }
        q01Var.c = ft2Var;
        this.r = dl3.d;
        vb2Var.setWebViewClient(q01Var);
        this.j = new mp0(vb2Var, jp0Var, this);
        int i = oa.$r8$clinit;
        String obj = toString();
        this.k = obj == null ? "" : obj;
    }

    public static final String a(lw1 lw1Var) {
        return lw1Var.h;
    }

    public final void b(final String str) {
        Context context = this.a.getContext();
        sw1 sw1Var = this.c;
        String str2 = this.k;
        rw1 rw1Var = new rw1() { // from class: yads.lw1$$ExternalSyntheticLambda1
            @Override // yads.rw1
            public final void a(String str3) {
                lw1.b(lw1.this, str, str3);
            }
        };
        sw1Var.getClass();
        sw1.a(context, str2, rw1Var);
    }

    public final void c(String str) {
        this.e.getClass();
        if (!mb3.a(str)) {
            boolean z = ob1.a;
            this.b.a(qw1.d, "Mraid command sent an invalid URL");
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!Intrinsics.areEqual("mraid", scheme) && !Intrinsics.areEqual("mobileads", scheme)) {
            a(MapsKt.mapOf(TuplesKt.to("url", str)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : parse.getQueryParameterNames()) {
            linkedHashMap.put(str2, parse.getQueryParameter(str2));
        }
        qw1.c.getClass();
        qw1 a = pw1.a(host);
        try {
            a(a, linkedHashMap);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.b.a(a, message);
        }
        this.b.a(a);
    }

    public final void a(final String str) {
        Context context = this.a.getContext();
        sw1 sw1Var = this.c;
        String str2 = this.k;
        rw1 rw1Var = new rw1() { // from class: yads.lw1$$ExternalSyntheticLambda2
            @Override // yads.rw1
            public final void a(String str3) {
                lw1.a(lw1.this, str, str3);
            }
        };
        sw1Var.getClass();
        sw1.a(context, str2, rw1Var);
    }

    public static final void b(lw1 lw1Var, String str, String str2) {
        lw1Var.h = str2;
        YandexNetworkBridge.webviewLoadUrl(lw1Var.b.a, str);
    }

    public static final void a(lw1 lw1Var, String str, String str2) {
        lw1Var.h = str2;
        vb2 vb2Var = lw1Var.b.a;
        YandexNetworkBridge.webviewLoadDataWithBaseURL(vb2Var, "https://yandex.ru", vb2Var.a(str), POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
    }

    public final void a(xw1 xw1Var, Map map) {
        vb2 vb2Var = this.a;
        j53 j53Var = new j53(vb2Var);
        this.d.getClass();
        ol3 ol3Var = new ol3(kl3.a(vb2Var));
        ip0 a = this.f.a(this.a);
        kp0 kp0Var = new kp0(a.a, a.b);
        dl3 dl3Var = dl3.c;
        this.r = dl3Var;
        this.b.a(dl3Var, ol3Var, kp0Var, j53Var);
        this.b.b("notifyReadyEvent();");
        tw1 tw1Var = this.l;
        if (tw1Var != null) {
            tw1Var.a(xw1Var, map);
        }
    }

    public final void a(boolean z) {
        this.b.a(new ol3(z));
        if (z) {
            mp0 mp0Var = this.j;
            if (mp0Var.e == null) {
                lp0 lp0Var = new lp0(mp0Var.a, mp0Var.c, mp0Var.d, mp0Var.b);
                mp0Var.e = lp0Var;
                mp0Var.d.post(lp0Var);
                return;
            }
            return;
        }
        mp0 mp0Var2 = this.j;
        mp0Var2.d.removeCallbacksAndMessages(null);
        mp0Var2.e = null;
        ip0 a = this.f.a(this.a);
        if (Intrinsics.areEqual(a, this.s)) {
            return;
        }
        this.s = a;
        this.b.a(new kp0(a.a, a.b));
    }

    public final void a() {
        this.i = true;
        tw1 tw1Var = this.l;
        if (tw1Var != null) {
            tw1Var.a();
        }
    }

    public final void a(qw1 qw1Var, LinkedHashMap linkedHashMap) {
        if (this.l != null) {
            switch (qw1Var.ordinal()) {
                case 0:
                    gi3 gi3Var = this.p;
                    if (gi3Var != null) {
                        gi3Var.onVideoComplete();
                        return;
                    }
                    return;
                case 1:
                    kv1 kv1Var = this.n;
                    if (kv1Var != null) {
                        kv1Var.e();
                        return;
                    }
                    return;
                case 2:
                    kv1 kv1Var2 = this.n;
                    if (kv1Var2 != null) {
                        kv1Var2.b();
                        return;
                    }
                    return;
                case 3:
                    if (dl3.c == this.r) {
                        dl3 dl3Var = dl3.e;
                        this.r = dl3Var;
                        this.b.a(dl3Var);
                        xa2 xa2Var = this.o;
                        if (xa2Var != null) {
                            xa2Var.c();
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    a(linkedHashMap);
                    return;
                case 5:
                    lv1 lv1Var = this.m;
                    if (lv1Var != null) {
                        lv1Var.a();
                        return;
                    }
                    return;
                case 6:
                    boolean parseBoolean = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                    xa2 xa2Var2 = this.o;
                    if (xa2Var2 != null) {
                        xa2Var2.a(parseBoolean);
                        return;
                    }
                    return;
                case 7:
                default:
                    throw new hw1("Unspecified MRAID Javascript command");
                case 8:
                    jw1 jw1Var = this.q;
                    if (jw1Var != null) {
                        jw1Var.a();
                    }
                    bu2 bu2Var = this.g;
                    if (bu2Var == null || !bu2Var.D0) {
                        return;
                    }
                    this.a.a();
                    return;
            }
        }
        throw new hw1("Invalid state to execute this command");
    }

    public final void a(Map map) {
        if (this.l != null) {
            bu2 bu2Var = this.g;
            if (bu2Var == null || !bu2Var.F0 || this.i) {
                String str = (String) map.get("url");
                if (str != null && str.length() > 0) {
                    tw1 tw1Var = this.l;
                    if (tw1Var != null) {
                        tw1Var.a(str);
                    }
                    boolean z = ob1.a;
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new hw1(format);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1(vb2 vb2Var, List list, int i) {
        this(vb2Var, r2, r3, r4, r5, r6, r0.a(vb2Var.b), (i & 128) != 0 ? CollectionsKt.emptyList() : list);
        vw2 vw2Var;
        ew1 ew1Var = new ew1(vb2Var);
        sw1 sw1Var = new sw1();
        kl3 kl3Var = new kl3();
        mb3 mb3Var = new mb3();
        jp0 jp0Var = new jp0();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
    }
}
