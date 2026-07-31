package sg.bigo.ads.cl;

import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.i;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.cj.p;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.cv.c;

/* loaded from: classes4.dex */
public class f {
    public static boolean b;
    public String a;
    private final int d = 0;
    private final int e = 1;
    private final int f = 2;
    private final int g = 1;
    public long c = 0;

    private String c(d dVar) {
        j jVar = k.a;
        this.a = (jVar == null || jVar.v() != 1) ? d(dVar) : e(dVar);
        this.c = System.currentTimeMillis();
        return this.a;
    }

    @Nullable
    private static String d(d dVar) {
        String str;
        sg.bigo.ads.cv.c unused;
        if (dVar == null) {
            sg.bigo.ads.bn.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String appKey = dVar.a.getAppKey();
        String str2 = dVar.d;
        String str3 = dVar.e;
        int i = dVar.f;
        String channel = dVar.a.getChannel();
        String str4 = Build.VERSION.RELEASE;
        String str5 = dVar.g;
        String str6 = dVar.h;
        String str7 = dVar.i;
        String str8 = dVar.k;
        int i2 = dVar.l;
        String str9 = dVar.m;
        String r = dVar.r();
        String U = dVar.U();
        String A = dVar.A();
        String a = sg.bigo.ads.ap.a.a(dVar.b);
        String G = dVar.c.G();
        String d = r.d(sg.bigo.ads.common.utils.d.a());
        int D = dVar.D();
        String j = dVar.c.j();
        String G2 = dVar.G();
        String R = dVar.R();
        String S = dVar.S();
        String a2 = sg.bigo.ads.cn.d.a(null, dVar);
        String t = sg.bigo.ads.bw.a.t();
        sg.bigo.ads.an.b ac = dVar.ac();
        String valueOf = ac != null ? String.valueOf(ac.c) : "";
        String valueOf2 = ac != null ? String.valueOf(ac.a) : "";
        String valueOf3 = ac != null ? String.valueOf(ac.b) : "";
        int i3 = dVar.s;
        String f = sg.bigo.ads.bg.b.f();
        int q = sg.bigo.ads.bw.a.q();
        int p = sg.bigo.ads.bw.a.p();
        int r2 = sg.bigo.ads.bw.a.r();
        int b2 = sg.bigo.ads.da.b.b();
        String ae = dVar.ae();
        boolean z = dVar.z();
        boolean F = dVar.F();
        boolean ad = dVar.ad();
        boolean k = sg.bigo.ads.bz.b.k(dVar.b);
        int l = sg.bigo.ads.bz.b.l(dVar.b);
        boolean c = sg.bigo.ads.bz.b.c();
        int b3 = i.b();
        int i4 = dVar.u;
        boolean az = dVar.az();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, appKey);
            jSONObject.putOpt("pkg_name", str2);
            jSONObject.putOpt("pkg_ver", str3);
            jSONObject.putOpt("pkg_vc", Integer.valueOf(i));
            jSONObject.putOpt("pkg_ch", channel);
            jSONObject.putOpt("os", "android");
            jSONObject.putOpt("os_ver", str4);
            jSONObject.putOpt("os_lang", str5);
            jSONObject.putOpt(VastAttributes.VENDOR, str6);
            jSONObject.putOpt("model", str7);
            jSONObject.putOpt("resolution", str8);
            jSONObject.putOpt("dpi", Integer.valueOf(i2));
            jSONObject.putOpt("dpi_f", str9);
            jSONObject.putOpt("net", r);
            jSONObject.putOpt("country", U);
            jSONObject.putOpt("sdk_ver", "5.9.0");
            jSONObject.putOpt("sdk_vc", 50900);
            jSONObject.putOpt(O6.X0, A);
            jSONObject.putOpt("af_id", a);
            jSONObject.putOpt("uid", G);
            jSONObject.putOpt("timezone", d);
            jSONObject.putOpt("timestamp", Integer.valueOf(D));
            jSONObject.putOpt("abflags", j);
            jSONObject.putOpt("hw_id", G2);
            jSONObject.putOpt("sim_country", R);
            jSONObject.putOpt("system_country", S);
            jSONObject.putOpt("ad_info", a2);
            jSONObject.putOpt(CommonUrlParts.UUID, t);
            jSONObject.putOpt("bat_stat", valueOf);
            jSONObject.putOpt("bat_num", valueOf2);
            jSONObject.putOpt("bat_scale", valueOf3);
            jSONObject.putOpt("simulator_file", Integer.valueOf(i3));
            jSONObject.putOpt("tc_string", f);
            jSONObject.putOpt("fire_id", ae);
            jSONObject.putOpt("lat_enable", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("hw_lat_enable", Integer.valueOf(F ? 1 : 0));
            jSONObject.putOpt("fire_lat_enable", Integer.valueOf(ad ? 1 : 0));
            jSONObject.putOpt("lgdp", Integer.valueOf(q));
            jSONObject.putOpt("ccpa", Integer.valueOf(p));
            jSONObject.putOpt("coppa", Integer.valueOf(r2));
            jSONObject.putOpt("consent_status", Integer.valueOf(b2));
            jSONObject.putOpt("batsa", Integer.valueOf(k ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(l));
            jSONObject.putOpt("root", Integer.valueOf(c ? 1 : 0));
            jSONObject.putOpt("imp_pattern", Integer.valueOf(dVar.aw()));
            jSONObject.putOpt("gdpr_switch", Integer.valueOf(b3));
            jSONObject.putOpt("gp_vc", Integer.valueOf(i4));
            jSONObject.putOpt("anti_boot_count", Integer.valueOf(dVar.aB()));
            jSONObject.putOpt("anti_sig", dVar.aC());
            jSONObject.putOpt("anti_detect_key", Integer.valueOf(dVar.aD()));
            jSONObject.putOpt("anti_update_time", dVar.aE());
            jSONObject.putOpt("webp_gif", Integer.valueOf(az ? 1 : 0));
            unused = c.a.a;
            jSONObject.putOpt("om_ver", sg.bigo.ads.cv.c.f());
            str = jSONObject.toString();
        } catch (Exception unused2) {
            sg.bigo.ads.bn.a.a(0, "BigoAdSdk", "Failed to generate a token due to unknown error.");
            str = null;
        }
        if (str == null) {
            return null;
        }
        return sg.bigo.ads.bc.a.a(str, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F") + "a2";
    }

    private static String e(d dVar) {
        if (dVar == null) {
            sg.bigo.ads.bn.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String f = f(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", 1);
            jSONObject.put("token", f);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static String f(@NonNull d dVar) {
        sg.bigo.ads.cv.c unused;
        p pVar = new p();
        pVar.a(dVar.a.getAppKey());
        pVar.a(dVar.d);
        pVar.a(dVar.e);
        pVar.a(dVar.f);
        pVar.a(dVar.a.getChannel());
        pVar.a("android");
        pVar.a(Build.VERSION.RELEASE);
        pVar.a(dVar.g);
        pVar.a(dVar.h);
        pVar.a(dVar.i);
        pVar.a(dVar.k);
        pVar.a(dVar.l);
        pVar.a(dVar.m);
        pVar.a(dVar.r());
        pVar.a(dVar.U());
        pVar.a("5.9.0");
        pVar.a(50900);
        pVar.a(dVar.A());
        pVar.a(sg.bigo.ads.ap.a.a(dVar.b));
        pVar.a(dVar.c.G());
        pVar.a(r.d(sg.bigo.ads.common.utils.d.a()));
        pVar.a(dVar.D());
        pVar.a(dVar.c.j());
        pVar.a(dVar.G());
        pVar.a(dVar.R());
        pVar.a(dVar.S());
        pVar.a(sg.bigo.ads.cn.d.a(null, dVar));
        pVar.a(sg.bigo.ads.bw.a.t());
        sg.bigo.ads.an.b ac = dVar.ac();
        String valueOf = ac != null ? String.valueOf(ac.c) : "";
        String valueOf2 = ac != null ? String.valueOf(ac.a) : "";
        String valueOf3 = ac != null ? String.valueOf(ac.b) : "";
        pVar.a(valueOf);
        pVar.a(valueOf2);
        pVar.a(valueOf3);
        pVar.a(dVar.s);
        pVar.a(sg.bigo.ads.bg.b.f());
        pVar.a(dVar.ae());
        pVar.a(dVar.z() ? 1 : 0);
        pVar.a(dVar.F() ? 1 : 0);
        pVar.a(dVar.ad() ? 1 : 0);
        pVar.a(sg.bigo.ads.bw.a.q());
        pVar.a(sg.bigo.ads.bw.a.p());
        pVar.a(sg.bigo.ads.bw.a.r());
        pVar.a(sg.bigo.ads.da.b.b());
        pVar.a(sg.bigo.ads.bz.b.k(dVar.b) ? 1 : 0);
        pVar.a(sg.bigo.ads.bz.b.l(dVar.b));
        pVar.a(sg.bigo.ads.bz.b.c() ? 1 : 0);
        pVar.a("");
        pVar.a("");
        pVar.a("");
        pVar.a(dVar.aw());
        pVar.a(dVar.u);
        pVar.a("");
        pVar.a("");
        pVar.a(i.b());
        pVar.a(dVar.az() ? 1 : 0);
        pVar.a(dVar.aB());
        pVar.a(dVar.aC());
        pVar.a(dVar.aD());
        pVar.a(dVar.aE());
        unused = c.a.a;
        pVar.a(sg.bigo.ads.cv.c.f());
        int i = 0;
        for (int i2 = 0; i2 < pVar.a.size(); i2++) {
            i += pVar.a.get(i2).a();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < pVar.a.size(); i3++) {
            pVar.a.get(i3).a(allocate);
        }
        byte[] array = allocate.array();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(array);
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return encodeToString;
        } catch (IOException unused2) {
            return null;
        }
    }

    public final String a(d dVar) {
        String str = this.a;
        if (str != null) {
            return str;
        }
        synchronized (f.class) {
            try {
                String str2 = this.a;
                if (str2 != null) {
                    return str2;
                }
                String c = c(dVar);
                this.a = c;
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String b(d dVar) {
        String c;
        c = c(dVar);
        this.a = c;
        return c;
    }
}
