package com.my.target;

import com.my.target.tb;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class r6 extends v {
    @Override // com.my.target.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l6 a(String str, y yVar, l6 l6Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        return v.b(str) ? a(str, yVar, l6Var, nVar, sVar) : a(str, yVar, l6Var, nVar, aVar, tbVar, list, sVar);
    }

    public static v a() {
        return new r6();
    }

    private static l6 a(String str, y yVar, l6 l6Var, n nVar, s sVar) {
        vi a = vi.a(nVar, yVar);
        a.c(str);
        String w = yVar.w();
        if (w == null) {
            w = "preroll";
        }
        if (l6Var == null) {
            l6Var = l6.e();
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
            float e = yVar.e();
            if (e >= 0.0f) {
                ebVar.c(e);
            }
            e a = yVar.a();
            if (a != null) {
                ebVar.a(a);
            }
            String b = yVar.b();
            if (b != null) {
                ebVar.a(b);
            }
            Boolean d = yVar.d();
            if (d != null) {
                ebVar.f(d.booleanValue());
            }
            Boolean f = yVar.f();
            if (f != null) {
                ebVar.g(f.booleanValue());
            }
            Boolean h = yVar.h();
            if (h != null) {
                ebVar.i(h.booleanValue());
            }
            Boolean i2 = yVar.i();
            if (i2 != null) {
                ebVar.j(i2.booleanValue());
            }
            Boolean j = yVar.j();
            if (j != null) {
                ebVar.k(j.booleanValue());
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
            ebVar.B("Close");
            float A = yVar.A();
            if (A >= 0.0f) {
                ebVar.e(A);
            }
            float B = yVar.B();
            if (B >= 0.0f) {
                ebVar.f(B);
            }
            if (C >= 0) {
                hbVar.a(ebVar, C);
                C++;
            } else {
                hbVar.a(ebVar);
            }
        }
    }

    private static l6 a(String str, y yVar, l6 l6Var, n nVar, tb.a aVar, tb tbVar, List list, s sVar) {
        JSONObject a = v.a(str, aVar, tbVar, list, sVar);
        if (a == null) {
            sVar.b(q.j);
            return l6Var;
        }
        JSONObject optJSONObject = a.optJSONObject(nVar.i());
        if (optJSONObject == null) {
            sVar.b(q.m);
            return l6Var;
        }
        if (l6Var == null) {
            l6Var = l6.e();
        }
        t6.a().a(optJSONObject, l6Var);
        f0 a2 = f0.a(yVar, nVar);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
        if (optJSONObject2 == null) {
            sVar.b(q.i);
            return l6Var;
        }
        String w = yVar.w();
        if (w != null) {
            hb a3 = l6Var.a(w);
            if (a3 != null) {
                a(optJSONObject2, a2, a3, p0.a(yVar, nVar), yVar, sVar);
                return l6Var;
            }
        } else {
            ArrayList c = l6Var.c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                a(optJSONObject2, a2, (hb) c.get(i), p0.a(yVar, nVar), yVar, sVar);
            }
        }
        return l6Var;
    }

    private static void a(JSONObject jSONObject, f0 f0Var, hb hbVar, p0 p0Var, y yVar, s sVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(hbVar.h());
        if (optJSONArray == null) {
            return;
        }
        int C = yVar.C();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = C;
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                if ("additionalData".equals(optJSONObject.optString("type"))) {
                    a(yVar, f0Var, optJSONObject, hbVar, arrayList2, arrayList, sVar);
                } else {
                    eb B0 = eb.B0();
                    if (p0Var.b(optJSONObject, B0)) {
                        if (yVar.K()) {
                            B0.e(yVar.A());
                            B0.f(yVar.B());
                        }
                        if (i >= 0) {
                            hbVar.a(B0, i);
                            i++;
                        } else {
                            hbVar.a(B0);
                        }
                    }
                }
            }
        }
        a(arrayList2, arrayList);
    }

    private static void a(y yVar, f0 f0Var, JSONObject jSONObject, hb hbVar, ArrayList arrayList, ArrayList arrayList2, s sVar) {
        y a = f0Var.a(jSONObject, sVar, x0.e);
        if (a == null) {
            return;
        }
        a.f(hbVar.h());
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
}
