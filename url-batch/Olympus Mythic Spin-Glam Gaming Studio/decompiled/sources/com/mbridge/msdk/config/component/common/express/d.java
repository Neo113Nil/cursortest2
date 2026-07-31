package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.f;
import com.mbridge.msdk.config.component.common.express.operator.g;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.config.component.common.express.operator.r;
import com.mbridge.msdk.config.component.common.express.operator.s;
import com.mbridge.msdk.config.component.common.express.operator.t;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* compiled from: ExpressionOperator.java */
/* loaded from: classes12.dex */
public class d {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;
    private final com.mbridge.msdk.config.component.common.express.operator.d b;
    private final com.mbridge.msdk.config.component.common.express.operator.e c;
    private final g d;
    private final f e;
    private final r f;
    private final t g;
    private final p h;
    private final n i;
    private final m j;
    private final com.mbridge.msdk.config.component.common.express.operator.b k;
    private final j l;
    private final l m;
    private final com.mbridge.msdk.config.component.common.express.operator.c n;
    private final s o;
    private final k p;
    private final q q;
    private final o r;
    private final i s;
    private final h t;
    private final com.mbridge.msdk.config.component.common.express.operator.a u;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.a = cVar;
        this.b = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.c = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.d = new g(cVar);
        this.e = new f(cVar);
        this.f = new r(cVar);
        this.g = new t(cVar);
        this.h = new p(cVar);
        this.i = new n(cVar);
        this.j = new m(cVar);
        this.k = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.l = new j(cVar);
        this.m = new l(cVar);
        this.n = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.o = new s(cVar);
        this.p = new k();
        this.q = new q(cVar);
        this.r = new o(cVar);
        this.s = new i(cVar);
        this.t = new h(cVar);
        this.u = new com.mbridge.msdk.config.component.common.express.operator.a();
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        try {
            Object a = new a().a(str).a(this, e.OTHER, aVar);
            return a == null ? "" : a;
        } catch (Exception e) {
            q0.a("ExpressionOperator", "execute-e: " + e.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String b = bVar.b();
        Object a = bVar.a();
        List<Object> c = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a b2 = this.r.b(b, a, c, aVar);
            if (b2.b()) {
                return b2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a2 = this.u.a(b, a, c, aVar);
            if (a2.b()) {
                return a2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a3 = this.e.a(b, a, c);
            if (a3.b()) {
                return a3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a4 = this.d.a(b, a, c);
            if (a4.b()) {
                return a4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a5 = this.c.a(b, a, c);
            if (a5.b()) {
                return a5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a6 = this.f.a(b, a, c);
            if (a6.b()) {
                return a6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a7 = this.m.a(b, a, c);
            if (a7.b()) {
                return a7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a8 = this.i.a(b, a, c);
            if (a8.b()) {
                return a8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a9 = this.g.a(b, a, c);
            if (a9.b()) {
                return a9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a i = this.h.i(b, a, c);
            if (i.b()) {
                return i.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a b3 = this.j.b(b, a, c);
            if (b3.b()) {
                return b3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a10 = this.k.a(b, a, c);
            if (a10.b()) {
                return a10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a11 = this.o.a(b, a, c);
            if (a11.b()) {
                return a11.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a12 = this.q.a(b, a, c);
            if (a12.b()) {
                return a12.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a b4 = this.p.b(b, a, c);
            if (b4.b()) {
                return b4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a13 = this.b.a(b, a, c);
            if (a13.b()) {
                return a13.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a14 = this.s.a(b, a, c);
            if (a14.b()) {
                return a14.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a15 = this.t.a(b, a, c);
            if (a15.b()) {
                return a15.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a a16 = this.l.a(b, a, c);
            return a16.b() ? a16.a() : b;
        } catch (Exception e) {
            q0.b("ExpressionOperator", e.getMessage(), e);
            return null;
        }
    }
}
