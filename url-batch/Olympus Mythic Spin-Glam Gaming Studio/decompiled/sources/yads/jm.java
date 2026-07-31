package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.O6;
import com.ironsource.X3;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class jm extends j83 {
    public final v3 A;
    public final mt1 B;
    public final String C;
    public final k12 D;
    public final uy2 E;
    public final qy2 F;
    public final s4 G;
    public final Context H;
    public final Lazy I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ jm(Context context, v3 v3Var, mt1 mt1Var, String str, String str2, k12 k12Var, xm xmVar, wm wmVar, r12 r12Var, uy2 uy2Var, int i) {
        this(context, v3Var, mt1Var, str, str2, k12Var, xmVar, wmVar, r12Var, r11, new qy2(r11), new s4(), new l8());
        uy2 a = (i & 512) != 0 ? ty2.a(context) : uy2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0113 A[EDGE_INSN: B:151:0x0113->B:39:0x0113 BREAK  A[LOOP:0: B:33:0x00fc->B:36:0x0110], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e9  */
    @Override // yads.j83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xp2 a(u82 u82Var, int i) {
        Map map;
        Integer valueOf;
        String b;
        Integer valueOf2;
        int length;
        String b2;
        String b3;
        boolean a;
        Object obj;
        vq1 vq1Var;
        String b4;
        Integer valueOf3;
        nz nzVar;
        nv nvVar;
        String b5;
        String b6;
        String b7;
        JSONObject jSONObject;
        Map build;
        if (b(u82Var, i)) {
            Map map2 = u82Var.c;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            Map map3 = map2;
            a(map3);
            if (204 != i) {
                String b8 = xz0.b(map3, a11.e);
                if (b8 == null) {
                    b8 = "";
                }
                e00.c.getClass();
                e00 a2 = d00.a(b8);
                v3 v3Var = this.A;
                if (a2 != v3Var.a) {
                    return new xp2(new z3(f4.k, u82Var));
                }
                x82 x82Var = new x82(v3Var, new aq2(this.D.a));
                int i2 = 0;
                this.F.a(map3, false);
                int i3 = u82Var.a;
                zp2 zp2Var = new zp2(u82Var.b);
                Map map4 = u82Var.c;
                if (map4 == null) {
                    map4 = MapsKt.emptyMap();
                }
                yp2 yp2Var = new yp2(i3, zp2Var, map4);
                int c = xz0.c(map3, a11.c);
                int c2 = xz0.c(map3, a11.d);
                String b9 = xz0.b(map3, a11.I);
                String b10 = xz0.b(map3, a11.J);
                String b11 = xz0.b(map3, a11.f);
                String b12 = xz0.b(map3, a11.L);
                if (b12 != null) {
                    x82Var.h.getClass();
                    map = td.a(b12);
                } else {
                    map = null;
                }
                l03 l03Var = x82Var.a.d.a;
                k03 b13 = l03Var != null ? l03Var.b() : null;
                String b14 = xz0.b(map3, a11.g);
                int i4 = oa.$r8$clinit;
                if (b14 != null) {
                    try {
                        valueOf = Integer.valueOf(b14);
                    } catch (NumberFormatException unused) {
                    }
                    Long valueOf4 = valueOf == null ? Long.valueOf(valueOf.intValue() * x82.j) : null;
                    b = xz0.b(map3, a11.v);
                    int i5 = oa.$r8$clinit;
                    if (b != null) {
                        try {
                            valueOf2 = Integer.valueOf(b);
                        } catch (NumberFormatException unused2) {
                        }
                        Long valueOf5 = valueOf2 != null ? Long.valueOf(valueOf2.intValue() * x82.j) : null;
                        x82Var.g.getClass();
                        String b15 = xz0.b(map3, a11.l);
                        Locale[] availableLocales = Locale.getAvailableLocales();
                        length = availableLocales.length;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (Intrinsics.areEqual(availableLocales[i2].getLanguage(), b15)) {
                                new Locale(b15);
                                break;
                            }
                            i2++;
                        }
                        b2 = xz0.b(map3, a11.A);
                        if (b2 != null) {
                            Boolean.parseBoolean(b2);
                        }
                        b3 = xz0.b(map3, a11.H);
                        if (b3 != null) {
                            Boolean.parseBoolean(b3);
                        }
                        a = xz0.a(map3, a11.o);
                        if (a) {
                            obj = null;
                        } else {
                            aq2 aq2Var = x82Var.b;
                            mm3 mm3Var = aq2Var.b;
                            obj = aq2Var.a.a(new u82(yp2Var.a, yp2Var.b.a, yp2Var.c, true));
                        }
                        if (a) {
                            wq1 wq1Var = x82Var.c;
                            String a3 = wq1Var.a.a(yp2Var);
                            if (a3 != null && a3.length() > 0) {
                                try {
                                    jSONObject = new JSONObject(a3);
                                } catch (JSONException unused3) {
                                }
                                try {
                                    try {
                                        Json json = ad1.a;
                                        JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                                        Map createMapBuilder = MapsKt.createMapBuilder();
                                        for (Iterator<String> keys = jSONObject2.keys(); keys.hasNext(); keys = keys) {
                                            String next = keys.next();
                                            createMapBuilder.put(next, jSONObject2.getString(next));
                                        }
                                        build = MapsKt.build(createMapBuilder);
                                    } catch (JSONException unused4) {
                                        boolean z = ob1.a;
                                        vq1Var = null;
                                        String str = x82Var.a.c.a;
                                        ArrayList d = xz0.d(map3, a11.m);
                                        x82Var.i.getClass();
                                        c a4 = u8.a(map3);
                                        String b16 = xz0.b(map3, a11.k);
                                        xz0.c(map3, a11.r);
                                        int c3 = xz0.c(map3, a11.s);
                                        int c4 = xz0.c(map3, a11.t);
                                        int c5 = xz0.c(map3, a11.y);
                                        String b17 = xz0.b(map3, a11.q);
                                        boolean a5 = xz0.a(map3, a11.i);
                                        String b18 = xz0.b(map3, a11.O);
                                        String b19 = xz0.b(map3, a11.P);
                                        String b20 = xz0.b(map3, a11.Q);
                                        xz0.b(map3, a11.z);
                                        x82Var.e.getClass();
                                        nz nzVar2 = (nz) oz.a.get(xz0.b(map3, a11.p));
                                        x82Var.d.getClass();
                                        Map map5 = yp2Var.c;
                                        b4 = xz0.b(map5, a11.u);
                                        int i6 = oa.$r8$clinit;
                                        if (b4 != null) {
                                        }
                                        valueOf3 = null;
                                        String b21 = xz0.b(map5, a11.w);
                                        if (b21 != null) {
                                        }
                                        if (valueOf3 != null) {
                                        }
                                        nzVar = nzVar2;
                                        nvVar = null;
                                        String str2 = (String) CollectionsKt.firstOrNull((List) xz0.d(map5, a11.x));
                                        sq2 sq2Var = new sq2(xz0.a(map5, a11.C), nvVar, (str2 != null || str2.length() <= 0) ? null : new oy2(str2));
                                        x82Var.f.getClass();
                                        xz0.b(map3, a11.h);
                                        String b22 = xz0.b(map3, a11.K);
                                        boolean a6 = xz0.a(map3, a11.M);
                                        String b23 = xz0.b(map3, a11.E);
                                        if (b23 != null) {
                                        }
                                        String b24 = xz0.b(map3, a11.j);
                                        if (b24 == null) {
                                        }
                                        String b25 = xz0.b(map3, a11.S);
                                        if (b25 == null) {
                                        }
                                        b5 = xz0.b(map3, a11.T);
                                        if (b5 != null) {
                                        }
                                        b6 = xz0.b(map3, a11.U);
                                        if (b6 != null) {
                                        }
                                        b7 = xz0.b(map3, a11.V);
                                        if (b7 != null) {
                                        }
                                        String b26 = xz0.b(map3, a11.W);
                                        if (b26 == null) {
                                        }
                                        String b27 = xz0.b(map3, a11.X);
                                        if (b27 == null) {
                                        }
                                        String b28 = xz0.b(map3, a11.Y);
                                        if (b28 == null) {
                                        }
                                        String b29 = xz0.b(map3, a11.Z);
                                        String b30 = xz0.b(map3, a11.a0);
                                        return new xp2(new t8(a2, b9, b11, b10, str, c, c2, d, a4, valueOf4, b16, b22, nzVar, b13, b17, b18, vq1Var, sq2Var, valueOf5, obj, map, b19, b20, a5, a, c3, c4, c5, a6, r36, r37, r38, r39, r40, r41, b29, b30 == null ? false : Boolean.parseBoolean(b30), 4096, 0), b11.a(u82Var));
                                    }
                                    if (!build.isEmpty()) {
                                        JSONArray jSONArray = jSONObject.getJSONArray(O6.E1);
                                        ArrayList arrayList = new ArrayList();
                                        int length2 = jSONArray.length();
                                        int i7 = 0;
                                        while (i7 < length2) {
                                            int i8 = length2;
                                            JSONArray jSONArray2 = jSONArray;
                                            er1 b31 = wq1Var.b.b(jSONArray.getJSONObject(i7));
                                            if (b31 != null) {
                                                arrayList.add(b31);
                                            }
                                            i7++;
                                            length2 = i8;
                                            jSONArray = jSONArray2;
                                        }
                                        if (!arrayList.isEmpty()) {
                                            vq1Var = new vq1(arrayList, build);
                                            String str3 = x82Var.a.c.a;
                                            ArrayList d2 = xz0.d(map3, a11.m);
                                            x82Var.i.getClass();
                                            c a42 = u8.a(map3);
                                            String b162 = xz0.b(map3, a11.k);
                                            xz0.c(map3, a11.r);
                                            int c32 = xz0.c(map3, a11.s);
                                            int c42 = xz0.c(map3, a11.t);
                                            int c52 = xz0.c(map3, a11.y);
                                            String b172 = xz0.b(map3, a11.q);
                                            boolean a52 = xz0.a(map3, a11.i);
                                            String b182 = xz0.b(map3, a11.O);
                                            String b192 = xz0.b(map3, a11.P);
                                            String b202 = xz0.b(map3, a11.Q);
                                            xz0.b(map3, a11.z);
                                            x82Var.e.getClass();
                                            nz nzVar22 = (nz) oz.a.get(xz0.b(map3, a11.p));
                                            x82Var.d.getClass();
                                            Map map52 = yp2Var.c;
                                            b4 = xz0.b(map52, a11.u);
                                            int i62 = oa.$r8$clinit;
                                            if (b4 != null) {
                                                try {
                                                    valueOf3 = Integer.valueOf(b4);
                                                } catch (NumberFormatException unused5) {
                                                }
                                                String b212 = xz0.b(map52, a11.w);
                                                String a7 = b212 != null ? am.a(b212) : null;
                                                if (valueOf3 != null || a7 == null || a7.length() <= 0) {
                                                    nzVar = nzVar22;
                                                    nvVar = null;
                                                } else {
                                                    nzVar = nzVar22;
                                                    nvVar = new nv(valueOf3.intValue(), a7);
                                                }
                                                String str22 = (String) CollectionsKt.firstOrNull((List) xz0.d(map52, a11.x));
                                                sq2 sq2Var2 = new sq2(xz0.a(map52, a11.C), nvVar, (str22 != null || str22.length() <= 0) ? null : new oy2(str22));
                                                x82Var.f.getClass();
                                                xz0.b(map3, a11.h);
                                                String b222 = xz0.b(map3, a11.K);
                                                boolean a62 = xz0.a(map3, a11.M);
                                                String b232 = xz0.b(map3, a11.E);
                                                bt0 bt0Var = b232 != null ? new bt0(b232) : null;
                                                String b242 = xz0.b(map3, a11.j);
                                                boolean parseBoolean = b242 == null ? true : Boolean.parseBoolean(b242);
                                                String b252 = xz0.b(map3, a11.S);
                                                boolean parseBoolean2 = b252 == null ? false : Boolean.parseBoolean(b252);
                                                b5 = xz0.b(map3, a11.T);
                                                if (b5 != null) {
                                                    Boolean.parseBoolean(b5);
                                                }
                                                b6 = xz0.b(map3, a11.U);
                                                if (b6 != null) {
                                                    Boolean.parseBoolean(b6);
                                                }
                                                b7 = xz0.b(map3, a11.V);
                                                if (b7 != null) {
                                                    Boolean.parseBoolean(b7);
                                                }
                                                String b262 = xz0.b(map3, a11.W);
                                                boolean parseBoolean3 = b262 == null ? true : Boolean.parseBoolean(b262);
                                                String b272 = xz0.b(map3, a11.X);
                                                boolean parseBoolean4 = b272 == null ? false : Boolean.parseBoolean(b272);
                                                String b282 = xz0.b(map3, a11.Y);
                                                boolean parseBoolean5 = b282 == null ? false : Boolean.parseBoolean(b282);
                                                String b292 = xz0.b(map3, a11.Z);
                                                String b302 = xz0.b(map3, a11.a0);
                                                return new xp2(new t8(a2, b9, b11, b10, str3, c, c2, d2, a42, valueOf4, b162, b222, nzVar, b13, b172, b182, vq1Var, sq2Var2, valueOf5, obj, map, b192, b202, a52, a, c32, c42, c52, a62, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b292, b302 == null ? false : Boolean.parseBoolean(b302), 4096, 0), b11.a(u82Var));
                                            }
                                            valueOf3 = null;
                                            String b2122 = xz0.b(map52, a11.w);
                                            if (b2122 != null) {
                                            }
                                            if (valueOf3 != null) {
                                            }
                                            nzVar = nzVar22;
                                            nvVar = null;
                                            String str222 = (String) CollectionsKt.firstOrNull((List) xz0.d(map52, a11.x));
                                            sq2 sq2Var22 = new sq2(xz0.a(map52, a11.C), nvVar, (str222 != null || str222.length() <= 0) ? null : new oy2(str222));
                                            x82Var.f.getClass();
                                            xz0.b(map3, a11.h);
                                            String b2222 = xz0.b(map3, a11.K);
                                            boolean a622 = xz0.a(map3, a11.M);
                                            String b2322 = xz0.b(map3, a11.E);
                                            if (b2322 != null) {
                                            }
                                            String b2422 = xz0.b(map3, a11.j);
                                            if (b2422 == null) {
                                            }
                                            String b2522 = xz0.b(map3, a11.S);
                                            if (b2522 == null) {
                                            }
                                            b5 = xz0.b(map3, a11.T);
                                            if (b5 != null) {
                                            }
                                            b6 = xz0.b(map3, a11.U);
                                            if (b6 != null) {
                                            }
                                            b7 = xz0.b(map3, a11.V);
                                            if (b7 != null) {
                                            }
                                            String b2622 = xz0.b(map3, a11.W);
                                            if (b2622 == null) {
                                            }
                                            String b2722 = xz0.b(map3, a11.X);
                                            if (b2722 == null) {
                                            }
                                            String b2822 = xz0.b(map3, a11.Y);
                                            if (b2822 == null) {
                                            }
                                            String b2922 = xz0.b(map3, a11.Z);
                                            String b3022 = xz0.b(map3, a11.a0);
                                            return new xp2(new t8(a2, b9, b11, b10, str3, c, c2, d2, a42, valueOf4, b162, b2222, nzVar, b13, b172, b182, vq1Var, sq2Var22, valueOf5, obj, map, b192, b202, a52, a, c32, c42, c52, a622, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b2922, b3022 == null ? false : Boolean.parseBoolean(b3022), 4096, 0), b11.a(u82Var));
                                        }
                                        vq1Var = null;
                                        String str32 = x82Var.a.c.a;
                                        ArrayList d22 = xz0.d(map3, a11.m);
                                        x82Var.i.getClass();
                                        c a422 = u8.a(map3);
                                        String b1622 = xz0.b(map3, a11.k);
                                        xz0.c(map3, a11.r);
                                        int c322 = xz0.c(map3, a11.s);
                                        int c422 = xz0.c(map3, a11.t);
                                        int c522 = xz0.c(map3, a11.y);
                                        String b1722 = xz0.b(map3, a11.q);
                                        boolean a522 = xz0.a(map3, a11.i);
                                        String b1822 = xz0.b(map3, a11.O);
                                        String b1922 = xz0.b(map3, a11.P);
                                        String b2022 = xz0.b(map3, a11.Q);
                                        xz0.b(map3, a11.z);
                                        x82Var.e.getClass();
                                        nz nzVar222 = (nz) oz.a.get(xz0.b(map3, a11.p));
                                        x82Var.d.getClass();
                                        Map map522 = yp2Var.c;
                                        b4 = xz0.b(map522, a11.u);
                                        int i622 = oa.$r8$clinit;
                                        if (b4 != null) {
                                        }
                                        valueOf3 = null;
                                        String b21222 = xz0.b(map522, a11.w);
                                        if (b21222 != null) {
                                        }
                                        if (valueOf3 != null) {
                                        }
                                        nzVar = nzVar222;
                                        nvVar = null;
                                        String str2222 = (String) CollectionsKt.firstOrNull((List) xz0.d(map522, a11.x));
                                        sq2 sq2Var222 = new sq2(xz0.a(map522, a11.C), nvVar, (str2222 != null || str2222.length() <= 0) ? null : new oy2(str2222));
                                        x82Var.f.getClass();
                                        xz0.b(map3, a11.h);
                                        String b22222 = xz0.b(map3, a11.K);
                                        boolean a6222 = xz0.a(map3, a11.M);
                                        String b23222 = xz0.b(map3, a11.E);
                                        if (b23222 != null) {
                                        }
                                        String b24222 = xz0.b(map3, a11.j);
                                        if (b24222 == null) {
                                        }
                                        String b25222 = xz0.b(map3, a11.S);
                                        if (b25222 == null) {
                                        }
                                        b5 = xz0.b(map3, a11.T);
                                        if (b5 != null) {
                                        }
                                        b6 = xz0.b(map3, a11.U);
                                        if (b6 != null) {
                                        }
                                        b7 = xz0.b(map3, a11.V);
                                        if (b7 != null) {
                                        }
                                        String b26222 = xz0.b(map3, a11.W);
                                        if (b26222 == null) {
                                        }
                                        String b27222 = xz0.b(map3, a11.X);
                                        if (b27222 == null) {
                                        }
                                        String b28222 = xz0.b(map3, a11.Y);
                                        if (b28222 == null) {
                                        }
                                        String b29222 = xz0.b(map3, a11.Z);
                                        String b30222 = xz0.b(map3, a11.a0);
                                        return new xp2(new t8(a2, b9, b11, b10, str32, c, c2, d22, a422, valueOf4, b1622, b22222, nzVar, b13, b1722, b1822, vq1Var, sq2Var222, valueOf5, obj, map, b1922, b2022, a522, a, c322, c422, c522, a6222, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b29222, b30222 == null ? false : Boolean.parseBoolean(b30222), 4096, 0), b11.a(u82Var));
                                    }
                                } catch (JSONException e) {
                                    boolean z2 = ob1.a;
                                    throw new JSONException(e.getMessage());
                                }
                            }
                        }
                        vq1Var = null;
                        String str322 = x82Var.a.c.a;
                        ArrayList d222 = xz0.d(map3, a11.m);
                        x82Var.i.getClass();
                        c a4222 = u8.a(map3);
                        String b16222 = xz0.b(map3, a11.k);
                        xz0.c(map3, a11.r);
                        int c3222 = xz0.c(map3, a11.s);
                        int c4222 = xz0.c(map3, a11.t);
                        int c5222 = xz0.c(map3, a11.y);
                        String b17222 = xz0.b(map3, a11.q);
                        boolean a5222 = xz0.a(map3, a11.i);
                        String b18222 = xz0.b(map3, a11.O);
                        String b19222 = xz0.b(map3, a11.P);
                        String b20222 = xz0.b(map3, a11.Q);
                        xz0.b(map3, a11.z);
                        x82Var.e.getClass();
                        nz nzVar2222 = (nz) oz.a.get(xz0.b(map3, a11.p));
                        x82Var.d.getClass();
                        Map map5222 = yp2Var.c;
                        b4 = xz0.b(map5222, a11.u);
                        int i6222 = oa.$r8$clinit;
                        if (b4 != null) {
                        }
                        valueOf3 = null;
                        String b212222 = xz0.b(map5222, a11.w);
                        if (b212222 != null) {
                        }
                        if (valueOf3 != null) {
                        }
                        nzVar = nzVar2222;
                        nvVar = null;
                        String str22222 = (String) CollectionsKt.firstOrNull((List) xz0.d(map5222, a11.x));
                        sq2 sq2Var2222 = new sq2(xz0.a(map5222, a11.C), nvVar, (str22222 != null || str22222.length() <= 0) ? null : new oy2(str22222));
                        x82Var.f.getClass();
                        xz0.b(map3, a11.h);
                        String b222222 = xz0.b(map3, a11.K);
                        boolean a62222 = xz0.a(map3, a11.M);
                        String b232222 = xz0.b(map3, a11.E);
                        if (b232222 != null) {
                        }
                        String b242222 = xz0.b(map3, a11.j);
                        if (b242222 == null) {
                        }
                        String b252222 = xz0.b(map3, a11.S);
                        if (b252222 == null) {
                        }
                        b5 = xz0.b(map3, a11.T);
                        if (b5 != null) {
                        }
                        b6 = xz0.b(map3, a11.U);
                        if (b6 != null) {
                        }
                        b7 = xz0.b(map3, a11.V);
                        if (b7 != null) {
                        }
                        String b262222 = xz0.b(map3, a11.W);
                        if (b262222 == null) {
                        }
                        String b272222 = xz0.b(map3, a11.X);
                        if (b272222 == null) {
                        }
                        String b282222 = xz0.b(map3, a11.Y);
                        if (b282222 == null) {
                        }
                        String b292222 = xz0.b(map3, a11.Z);
                        String b302222 = xz0.b(map3, a11.a0);
                        return new xp2(new t8(a2, b9, b11, b10, str322, c, c2, d222, a4222, valueOf4, b16222, b222222, nzVar, b13, b17222, b18222, vq1Var, sq2Var2222, valueOf5, obj, map, b19222, b20222, a5222, a, c3222, c4222, c5222, a62222, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b292222, b302222 == null ? false : Boolean.parseBoolean(b302222), 4096, 0), b11.a(u82Var));
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    x82Var.g.getClass();
                    String b152 = xz0.b(map3, a11.l);
                    Locale[] availableLocales2 = Locale.getAvailableLocales();
                    length = availableLocales2.length;
                    while (true) {
                        if (i2 >= length) {
                        }
                        i2++;
                    }
                    b2 = xz0.b(map3, a11.A);
                    if (b2 != null) {
                    }
                    b3 = xz0.b(map3, a11.H);
                    if (b3 != null) {
                    }
                    a = xz0.a(map3, a11.o);
                    if (a) {
                    }
                    if (a) {
                    }
                    vq1Var = null;
                    String str3222 = x82Var.a.c.a;
                    ArrayList d2222 = xz0.d(map3, a11.m);
                    x82Var.i.getClass();
                    c a42222 = u8.a(map3);
                    String b162222 = xz0.b(map3, a11.k);
                    xz0.c(map3, a11.r);
                    int c32222 = xz0.c(map3, a11.s);
                    int c42222 = xz0.c(map3, a11.t);
                    int c52222 = xz0.c(map3, a11.y);
                    String b172222 = xz0.b(map3, a11.q);
                    boolean a52222 = xz0.a(map3, a11.i);
                    String b182222 = xz0.b(map3, a11.O);
                    String b192222 = xz0.b(map3, a11.P);
                    String b202222 = xz0.b(map3, a11.Q);
                    xz0.b(map3, a11.z);
                    x82Var.e.getClass();
                    nz nzVar22222 = (nz) oz.a.get(xz0.b(map3, a11.p));
                    x82Var.d.getClass();
                    Map map52222 = yp2Var.c;
                    b4 = xz0.b(map52222, a11.u);
                    int i62222 = oa.$r8$clinit;
                    if (b4 != null) {
                    }
                    valueOf3 = null;
                    String b2122222 = xz0.b(map52222, a11.w);
                    if (b2122222 != null) {
                    }
                    if (valueOf3 != null) {
                    }
                    nzVar = nzVar22222;
                    nvVar = null;
                    String str222222 = (String) CollectionsKt.firstOrNull((List) xz0.d(map52222, a11.x));
                    sq2 sq2Var22222 = new sq2(xz0.a(map52222, a11.C), nvVar, (str222222 != null || str222222.length() <= 0) ? null : new oy2(str222222));
                    x82Var.f.getClass();
                    xz0.b(map3, a11.h);
                    String b2222222 = xz0.b(map3, a11.K);
                    boolean a622222 = xz0.a(map3, a11.M);
                    String b2322222 = xz0.b(map3, a11.E);
                    if (b2322222 != null) {
                    }
                    String b2422222 = xz0.b(map3, a11.j);
                    if (b2422222 == null) {
                    }
                    String b2522222 = xz0.b(map3, a11.S);
                    if (b2522222 == null) {
                    }
                    b5 = xz0.b(map3, a11.T);
                    if (b5 != null) {
                    }
                    b6 = xz0.b(map3, a11.U);
                    if (b6 != null) {
                    }
                    b7 = xz0.b(map3, a11.V);
                    if (b7 != null) {
                    }
                    String b2622222 = xz0.b(map3, a11.W);
                    if (b2622222 == null) {
                    }
                    String b2722222 = xz0.b(map3, a11.X);
                    if (b2722222 == null) {
                    }
                    String b2822222 = xz0.b(map3, a11.Y);
                    if (b2822222 == null) {
                    }
                    String b2922222 = xz0.b(map3, a11.Z);
                    String b3022222 = xz0.b(map3, a11.a0);
                    return new xp2(new t8(a2, b9, b11, b10, str3222, c, c2, d2222, a42222, valueOf4, b162222, b2222222, nzVar, b13, b172222, b182222, vq1Var, sq2Var22222, valueOf5, obj, map, b192222, b202222, a52222, a, c32222, c42222, c52222, a622222, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b2922222, b3022222 == null ? false : Boolean.parseBoolean(b3022222), 4096, 0), b11.a(u82Var));
                }
                valueOf = null;
                if (valueOf == null) {
                }
                b = xz0.b(map3, a11.v);
                int i52 = oa.$r8$clinit;
                if (b != null) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                x82Var.g.getClass();
                String b1522 = xz0.b(map3, a11.l);
                Locale[] availableLocales22 = Locale.getAvailableLocales();
                length = availableLocales22.length;
                while (true) {
                    if (i2 >= length) {
                    }
                    i2++;
                }
                b2 = xz0.b(map3, a11.A);
                if (b2 != null) {
                }
                b3 = xz0.b(map3, a11.H);
                if (b3 != null) {
                }
                a = xz0.a(map3, a11.o);
                if (a) {
                }
                if (a) {
                }
                vq1Var = null;
                String str32222 = x82Var.a.c.a;
                ArrayList d22222 = xz0.d(map3, a11.m);
                x82Var.i.getClass();
                c a422222 = u8.a(map3);
                String b1622222 = xz0.b(map3, a11.k);
                xz0.c(map3, a11.r);
                int c322222 = xz0.c(map3, a11.s);
                int c422222 = xz0.c(map3, a11.t);
                int c522222 = xz0.c(map3, a11.y);
                String b1722222 = xz0.b(map3, a11.q);
                boolean a522222 = xz0.a(map3, a11.i);
                String b1822222 = xz0.b(map3, a11.O);
                String b1922222 = xz0.b(map3, a11.P);
                String b2022222 = xz0.b(map3, a11.Q);
                xz0.b(map3, a11.z);
                x82Var.e.getClass();
                nz nzVar222222 = (nz) oz.a.get(xz0.b(map3, a11.p));
                x82Var.d.getClass();
                Map map522222 = yp2Var.c;
                b4 = xz0.b(map522222, a11.u);
                int i622222 = oa.$r8$clinit;
                if (b4 != null) {
                }
                valueOf3 = null;
                String b21222222 = xz0.b(map522222, a11.w);
                if (b21222222 != null) {
                }
                if (valueOf3 != null) {
                }
                nzVar = nzVar222222;
                nvVar = null;
                String str2222222 = (String) CollectionsKt.firstOrNull((List) xz0.d(map522222, a11.x));
                sq2 sq2Var222222 = new sq2(xz0.a(map522222, a11.C), nvVar, (str2222222 != null || str2222222.length() <= 0) ? null : new oy2(str2222222));
                x82Var.f.getClass();
                xz0.b(map3, a11.h);
                String b22222222 = xz0.b(map3, a11.K);
                boolean a6222222 = xz0.a(map3, a11.M);
                String b23222222 = xz0.b(map3, a11.E);
                if (b23222222 != null) {
                }
                String b24222222 = xz0.b(map3, a11.j);
                if (b24222222 == null) {
                }
                String b25222222 = xz0.b(map3, a11.S);
                if (b25222222 == null) {
                }
                b5 = xz0.b(map3, a11.T);
                if (b5 != null) {
                }
                b6 = xz0.b(map3, a11.U);
                if (b6 != null) {
                }
                b7 = xz0.b(map3, a11.V);
                if (b7 != null) {
                }
                String b26222222 = xz0.b(map3, a11.W);
                if (b26222222 == null) {
                }
                String b27222222 = xz0.b(map3, a11.X);
                if (b27222222 == null) {
                }
                String b28222222 = xz0.b(map3, a11.Y);
                if (b28222222 == null) {
                }
                String b29222222 = xz0.b(map3, a11.Z);
                String b30222222 = xz0.b(map3, a11.a0);
                return new xp2(new t8(a2, b9, b11, b10, str32222, c, c2, d22222, a422222, valueOf4, b1622222, b22222222, nzVar, b13, b1722222, b1822222, vq1Var, sq2Var222222, valueOf5, obj, map, b1922222, b2022222, a522222, a, c322222, c422222, c522222, a6222222, bt0Var, parseBoolean, parseBoolean2, parseBoolean3, parseBoolean4, parseBoolean5, b29222222, b30222222 == null ? false : Boolean.parseBoolean(b30222222), 4096, 0), b11.a(u82Var));
            }
        }
        int i9 = z3.d;
        return new xp2(y3.a(u82Var));
    }

    public boolean b(u82 u82Var, int i) {
        byte[] bArr;
        if (200 != i || (bArr = u82Var.b) == null) {
            return false;
        }
        return (bArr.length == 0) ^ true;
    }

    @Override // yads.j83, yads.ro2
    public Map d() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        String a = this.E.a();
        if (a != null) {
            boolean z = ob1.a;
        }
        createMapBuilder.put(a11.F.a(), this.G.b(this.H));
        createMapBuilder.put(a11.G.a(), this.G.a(this.H));
        createMapBuilder.putAll(this.A.b().a());
        return MapsKt.build(createMapBuilder);
    }

    @Override // yads.ro2
    public final String g() {
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(this.C);
        }
        List list = this.A.b.a.b;
        if (sb.length() > 0 && !list.isEmpty()) {
            sb.append(X3.j.c);
        }
        sb.append(CollectionsKt.joinToString$default(list, X3.j.c, null, null, 0, null, hm.b, 30, null));
        return Uri.parse(this.d).buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    @Override // yads.ro2
    public final byte[] b() {
        if (1 == e()) {
            try {
                String str = this.C;
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes;
            } catch (UnsupportedEncodingException unused) {
                boolean z = ob1.a;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(Context context, v3 v3Var, mt1 mt1Var, String str, String str2, k12 k12Var, xm xmVar, wm wmVar, r12 r12Var, uy2 uy2Var, qy2 qy2Var, s4 s4Var, l8 l8Var) {
        super(context, v3Var, 1, str, wmVar, v3Var, r12Var, xmVar, mt1Var);
        int i;
        Integer num;
        vw2 vw2Var;
        v3Var.b().getClass();
        this.A = v3Var;
        this.B = mt1Var;
        this.C = str2;
        this.D = k12Var;
        this.E = uy2Var;
        this.F = qy2Var;
        this.G = s4Var;
        this.H = context.getApplicationContext();
        this.I = LazyKt.lazy(new im(context, this));
        boolean z = ob1.a;
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
        bu2 a = vw2Var2.a(context);
        if (a != null && (num = a.x0) != null) {
            i = num.intValue();
        } else {
            i = v3Var.o;
        }
        this.o = l8Var.a(context, i);
    }

    @Override // yads.j83, yads.co, yads.ro2
    public final hm3 a(hm3 hm3Var) {
        int length;
        boolean z = ob1.a;
        u82 u82Var = hm3Var.b;
        int i = u82Var != null ? u82Var.a : -1;
        sw2 sw2Var = (sw2) this.I.getValue();
        Map d = d();
        byte[] b = b();
        v3 v3Var = this.A;
        sw2Var.getClass();
        if (i == -1 || i == 413 || i == 408) {
            boolean z2 = false;
            if (b != null) {
                try {
                    length = b.length;
                } catch (Exception unused) {
                    boolean z3 = ob1.a;
                }
            } else {
                length = 0;
            }
            if (length > 20971520) {
                bu2 a = sw2Var.c.a(sw2Var.a);
                if (a != null) {
                    z2 = a.P0;
                }
                if (z2) {
                    Map a2 = sw2Var.a(d, length, v3Var, i);
                    fo2 fo2Var = fo2.c;
                    sw2Var.b.a(new ho2("sdk_network_debug", MapsKt.toMutableMap(a2), (c) null));
                }
            }
        }
        int i2 = z3.d;
        return super.a((hm3) y3.a(hm3Var.b));
    }
}
