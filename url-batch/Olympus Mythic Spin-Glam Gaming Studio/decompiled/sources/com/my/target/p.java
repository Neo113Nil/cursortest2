package com.my.target;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.my.target.common.MyTargetManager;
import com.my.target.tb;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public abstract class p {
    static String f = "ad.mail.ru";
    static String g = "https://";
    protected final a a;
    protected final n b;
    protected final tb.a c;
    protected String d;
    private b e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        boolean a();

        z b();

        w c();

        v d();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(x xVar, s sVar);
    }

    public p(a aVar, n nVar, tb.a aVar2) {
        this.a = aVar;
        this.b = nVar;
        this.c = aVar2;
    }

    private static void a(tb tbVar, int i, long j) {
        tbVar.a(i, System.currentTimeMillis() - j);
    }

    private static long b(tb tbVar, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        tbVar.b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    public final p a(b bVar) {
        this.e = bVar;
        return this;
    }

    public p a(final tb tbVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!MyTargetManager.isSdkInitialized()) {
            MyTargetManager.initSdk(applicationContext);
        }
        o0.a(new Runnable() { // from class: com.my.target.p$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                p.this.a(tbVar);
            }
        });
        return this;
    }

    protected x b(x xVar, s sVar) {
        w c;
        this.b.a().b(0, 4000);
        return (xVar == null || (c = this.a.c()) == null) ? xVar : c.a(xVar, this.b, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(tb tbVar) {
        a(tbVar, MyTargetManager.b());
    }

    protected void a(final tb tbVar, jg jgVar) {
        db.a(jgVar);
        if (!jgVar.b()) {
            this.b.a().a(0, 1002);
            a((x) null, s.a(q.d), tbVar);
            return;
        }
        final ve a2 = jgVar.a();
        final ArrayList arrayList = new ArrayList();
        String f2 = a2.f();
        if (!TextUtils.isEmpty(f2)) {
            Collections.addAll(arrayList, f2.split(StringUtils.COMMA));
        }
        arrayList.add(f);
        this.a.b().a((String) arrayList.get(0), this.b, tbVar, jgVar, new d1() { // from class: com.my.target.p$$ExternalSyntheticLambda1
            @Override // com.my.target.d1
            public final void accept(Object obj, Object obj2) {
                p.this.a(tbVar, arrayList, a2, (String) obj, (String) obj2);
            }
        });
    }

    protected a0 a(y yVar, Map map) {
        l5 b2 = g5.a(this.b.a()).b(yVar.b, yVar.a, map);
        if (b2.d()) {
            return new a0(b2, (String) b2.c());
        }
        this.d = b2.a();
        return new a0(b2, null);
    }

    protected x a(List list, x xVar, v vVar, tb tbVar, s sVar) {
        if (list.size() <= 0) {
            return xVar;
        }
        Iterator it = list.iterator();
        x xVar2 = xVar;
        while (it.hasNext()) {
            xVar2 = (x) a((y) it.next(), xVar2, vVar, tbVar, sVar).b;
        }
        return xVar2;
    }

    protected a0 a(y yVar, x xVar, v vVar, tb tbVar, s sVar) {
        l5 l5Var;
        y yVar2;
        int i;
        int i2;
        x xVar2 = xVar;
        long currentTimeMillis = System.currentTimeMillis();
        l5 a2 = g5.a(this.b.a()).a(yVar.b, null);
        a(tbVar, 1, currentTimeMillis);
        if (!a2.d()) {
            return new a0(a2, xVar2);
        }
        wh.a(yVar.a("serviceRequested"), this.b.a(), 0, this.b.c());
        int a3 = xVar2 != null ? xVar.a() : 0;
        String str = (String) a2.c();
        if (str != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            x a4 = vVar.a(str, yVar, xVar, this.b, this.c, tbVar, null, sVar);
            a(tbVar, 2, currentTimeMillis2);
            i = 0;
            i2 = a3;
            l5Var = a2;
            yVar2 = yVar;
            xVar2 = a(yVar.G(), a4, vVar, tbVar, sVar);
        } else {
            l5Var = a2;
            yVar2 = yVar;
            i = 0;
            i2 = a3;
        }
        x xVar3 = xVar2;
        if (i2 == (xVar3 != null ? xVar3.a() : i)) {
            wh.a(yVar2.a("serviceAnswerEmpty"), this.b.a(), i, this.b.c());
            y y = yVar.y();
            if (y != null) {
                xVar3 = (x) a(y, xVar3, vVar, tbVar, sVar).b;
            }
        }
        return new a0(l5Var, xVar3);
    }

    protected void a(final x xVar, final s sVar, tb tbVar) {
        tbVar.d();
        if (this.e == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.e.a(xVar, sVar);
            this.e = null;
        } else {
            o0.e(new Runnable() { // from class: com.my.target.p$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.a(xVar, sVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(x xVar, s sVar) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(xVar, sVar);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, tb tbVar, List list, ve veVar) {
        if (str == null) {
            this.b.a().a(0, 1003, "adService == null");
            a((x) null, s.a(q.o), tbVar);
            return;
        }
        tbVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a(str2, tbVar, list);
        if (a2 == null) {
            return;
        }
        b(tbVar, 1, currentTimeMillis);
        a(str, str2, a2, tbVar, veVar);
    }

    private String a(String str, tb tbVar, List list) {
        String str2;
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        this.b.a().b(0, 2000);
        int size = list.size() - 1;
        l5 l5Var = null;
        for (int i = 0; i <= size; i++) {
            String str3 = (String) list.get(i);
            a0 a2 = a(y.a(g + str3 + "/mobile/" + this.b.j() + "/", str), hashMap);
            l5 l5Var2 = (l5) a2.a;
            if (l5Var2 != null) {
                l5Var = l5Var2;
            }
            str2 = (String) a2.b;
            if (v.a(str2)) {
                break;
            }
            if (i == size) {
                break;
            }
            if (sb.length() != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(str3);
            hashMap.put("X-Failed-Hosts", sb.toString());
        }
        str2 = null;
        if (str2 != null) {
            return str2;
        }
        this.b.a().c(0, 2002, l5Var != null ? "response: code=" + l5Var.b() + ", error=" + l5Var.a() + ", dataForService=" + str : "response==null, dataForService=" + str);
        a(l5Var, tbVar);
        return null;
    }

    protected void a(String str, String str2, String str3, tb tbVar, ve veVar) {
        tb tbVar2;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        v d = this.a.d();
        s c = s.c();
        y a2 = y.a(str, str2);
        x a3 = d.a(str3, a2, null, this.b, this.c, tbVar, arrayList, c);
        b(tbVar, 2, currentTimeMillis);
        if (veVar != null) {
            veVar.f(arrayList.isEmpty() ? null : TextUtils.join(StringUtils.COMMA, arrayList));
        }
        if (this.a.a()) {
            tbVar2 = tbVar;
            a3 = a(a2.G(), a3, d, tbVar, c);
        } else {
            tbVar2 = tbVar;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        x b2 = b(a3, c);
        b(tbVar2, 3, currentTimeMillis2);
        a(b2, c, tbVar2);
    }

    private void a(l5 l5Var, tb tbVar) {
        q qVar;
        if (l5Var == null) {
            a((x) null, s.a(q.c), tbVar);
            return;
        }
        int b2 = l5Var.b();
        String str = b2 + " – " + l5Var.a();
        if (b2 == 403) {
            qVar = q.f;
        } else if (b2 != 404) {
            if (b2 != 408) {
                if (b2 == 500) {
                    qVar = q.h;
                } else if (b2 != 504) {
                    if (b2 == 200) {
                        qVar = q.j;
                    } else {
                        qVar = q.a(1000, str);
                    }
                }
            }
            qVar = q.e;
        } else {
            qVar = q.g;
        }
        a((x) null, s.a(qVar), tbVar);
    }
}
