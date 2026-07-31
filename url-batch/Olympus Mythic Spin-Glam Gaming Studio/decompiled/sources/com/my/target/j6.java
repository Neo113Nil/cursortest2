package com.my.target;

import com.my.target.tb;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j6 extends v {
    private j6() {
    }

    public static v a() {
        return new j6();
    }

    private static l6 a(String str, y yVar, l6 l6Var, n nVar, s sVar) {
        vi a = vi.a(nVar, yVar);
        a.c(str);
        String w = yVar.w();
        if (w == null) {
            w = "preroll";
        }
        if (l6Var == null) {
            l6Var = l6.f();
        }
        hb a2 = l6Var.a(w);
        if (a2 != null) {
            if (!a.c().isEmpty()) {
                a(a, a2, yVar);
                return l6Var;
            }
            sVar.b(q.l);
            y d = a.d();
            if (d != null) {
                d.f(a2.h());
                int C = yVar.C();
                if (C >= 0) {
                    d.d(C);
                } else {
                    d.d(a2.a());
                }
                a2.a(d);
            }
        }
        return l6Var;
    }

    private static void a(vi viVar, hb hbVar, y yVar) {
        int C = yVar.C();
        ArrayList c = viVar.c();
        int size = c.size();
        int i = 0;
        while (i < size) {
            Object obj = c.get(i);
            i++;
            eb ebVar = (eb) obj;
            Boolean d = yVar.d();
            if (d != null) {
                ebVar.f(d.booleanValue());
            }
            Boolean f = yVar.f();
            if (f != null) {
                ebVar.g(f.booleanValue());
            }
            Boolean r = yVar.r();
            if (r != null) {
                ebVar.b(r.booleanValue());
            }
            Boolean z = yVar.z();
            if (z != null) {
                ebVar.d(z.booleanValue());
            }
            Boolean g = yVar.g();
            if (g != null) {
                ebVar.h(g.booleanValue());
            }
            float e = yVar.e();
            if (e >= 0.0f) {
                ebVar.c(e);
            }
            ebVar.B("Close");
            ebVar.e(yVar.A());
            ebVar.f(yVar.B());
            if (C >= 0) {
                hbVar.a(ebVar, C);
                C++;
            } else {
                hbVar.a(ebVar);
            }
        }
    }

    private static l6 a(String str, y yVar, l6 l6Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar, u uVar) {
        JSONObject a = v.a(str, aVar, tbVar, list, sVar, uVar);
        if (a == null) {
            sVar.b(q.j);
            return l6Var;
        }
        u a2 = uVar.a(nVar.i());
        JSONObject optJSONObject = a.optJSONObject(nVar.i());
        if (optJSONObject == null) {
            sVar.b(q.m);
            a2.a(3006, "Section-format is not found");
            return l6Var;
        }
        l6 f = l6Var == null ? l6.f() : l6Var;
        m6.a().a(optJSONObject, f);
        f0 a3 = f0.a(yVar, nVar);
        u a4 = a2.a("sections");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
        if (optJSONObject2 == null) {
            sVar.b(q.i);
            a4.a(3006);
            return f;
        }
        String w = yVar.w();
        if (w != null) {
            hb a5 = f.a(w);
            if (a5 != null) {
                a(optJSONObject2, a3, a5, b3.a(yVar, nVar), a3.a(yVar, nVar), yVar, sVar, a4, (sh) null);
                return f;
            }
        } else {
            ArrayList c = f.c();
            int size = c.size();
            int i = 0;
            while (i < size) {
                a(optJSONObject2, a3, (hb) c.get(i), b3.a(yVar, nVar), a3.a(yVar, nVar), yVar, sVar, a4, (sh) null);
                i++;
                size = size;
                c = c;
            }
        }
        return f;
    }

    private static void a(JSONObject jSONObject, f0 f0Var, hb hbVar, b3 b3Var, a3 a3Var, y yVar, s sVar, u uVar, sh shVar) {
        int i;
        JSONArray optJSONArray = jSONObject.optJSONArray(hbVar.h());
        if (optJSONArray == null) {
            return;
        }
        u a = uVar.a(hbVar.h());
        int C = yVar.C();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = C;
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            u c = a.c(i3);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            if (optJSONObject == null) {
                c.d(3007);
            } else {
                w0 a2 = b3Var.a().a(b3Var.a(optJSONObject, c, "<no-banner-id" + i3 + ">"));
                x0 a3 = c.a(a2);
                String optString = optJSONObject.optString("type");
                if ("additionalData".equals(optString)) {
                    a(yVar, f0Var, optJSONObject, hbVar, arrayList2, arrayList, sVar, a3);
                } else {
                    if ("video-motion".equals(optString)) {
                        hj a4 = hj.a(a3.c());
                        if (a3Var.a(optJSONObject, a4, a3, shVar)) {
                            float A = yVar.A();
                            if (A >= 0.0f) {
                                a4.e(A);
                            }
                            float B = yVar.B();
                            if (B >= 0.0f) {
                                a4.f(B);
                            }
                            if (i2 >= 0) {
                                i = i2 + 1;
                                hbVar.a(a4, i2);
                                i2 = i;
                            } else {
                                hbVar.a(a4);
                            }
                        }
                    } else {
                        eb b = eb.b(a2, null);
                        if (b3Var.a(optJSONObject, b, a3)) {
                            float A2 = yVar.A();
                            if (A2 >= 0.0f) {
                                b.e(A2);
                            }
                            float B2 = yVar.B();
                            if (B2 >= 0.0f) {
                                b.f(B2);
                            }
                            if (i2 >= 0) {
                                i = i2 + 1;
                                hbVar.a(b, i2);
                                i2 = i;
                            } else {
                                hbVar.a(b);
                            }
                        }
                    }
                }
            }
        }
        a(arrayList2, arrayList);
    }

    private static void a(y yVar, f0 f0Var, JSONObject jSONObject, hb hbVar, ArrayList arrayList, ArrayList arrayList2, s sVar, x0 x0Var) {
        y a = f0Var.a(jSONObject, sVar, x0Var);
        if (a == null) {
            return;
        }
        a.f(hbVar.h());
        a.a(yVar.a());
        if (a.s() != -1) {
            arrayList2.add(a);
            return;
        }
        arrayList.add(a);
        if (!a.K() && !a.I()) {
            yVar.a(a);
            int C = yVar.C();
            if (C >= 0) {
                a.d(C);
            } else {
                a.d(hbVar.a());
            }
        }
        hbVar.a(a);
    }

    private static void a(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            y yVar = (y) obj;
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    y yVar2 = (y) obj2;
                    if (yVar.s() == yVar2.u()) {
                        yVar2.b(yVar);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.my.target.v
    public l6 a(String str, y yVar, l6 l6Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        u a = u.a(nVar.a());
        a.b(3000);
        if (v.b(str)) {
            return a(str, yVar, l6Var, nVar, sVar);
        }
        return a(str, yVar, l6Var, nVar, aVar, tbVar, list, sVar, a);
    }
}
