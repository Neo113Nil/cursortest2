package com.my.target;

import android.content.Context;
import com.my.target.p;
import com.my.target.tb;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class g6 extends p {
    private final List h;
    private final zf i;
    private Runnable j;
    private final String k;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements p.a {
        private a() {
        }

        @Override // com.my.target.p.a
        public boolean a() {
            return true;
        }

        @Override // com.my.target.p.a
        public z b() {
            return z.a();
        }

        @Override // com.my.target.p.a
        public w c() {
            return k6.a();
        }

        @Override // com.my.target.p.a
        public v d() {
            return j6.a();
        }
    }

    private g6(List list, n nVar, tb.a aVar, int i, String str) {
        super(new a(), nVar, aVar);
        this.h = list;
        this.i = zf.a(i * 1000);
        this.k = str;
    }

    public static p a(n nVar, tb.a aVar, int i) {
        return new g6(null, nVar, aVar, i, null);
    }

    public static p a(n nVar, tb.a aVar, String str) {
        return new g6(null, nVar, aVar, 1, str);
    }

    public static p a(List list, n nVar, tb.a aVar, int i) {
        return new g6(list, nVar, aVar, i, null);
    }

    static String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        return (!jSONObject.has("version") || jSONObject.isNull("version")) ? new JSONObject().put("version", POBConstants.ORTB_VERSION).put(str2, jSONObject).toString() : str;
    }

    @Override // com.my.target.p
    public p a(final tb tbVar, Context context) {
        if (this.k == null) {
            if (this.j == null) {
                this.j = new Runnable() { // from class: com.my.target.g6$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g6.this.a(tbVar);
                    }
                };
            }
            this.i.a(this.j);
        }
        return super.a(tbVar, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(tb tbVar) {
        this.i.b(this.j);
        a((x) null, s.a(q.o), tbVar);
    }

    @Override // com.my.target.p
    protected void a(tb tbVar, jg jgVar) {
        String str = this.k;
        if (str != null) {
            try {
                a("s2s", this.a.b().a(this.b, new HashMap(), tbVar, jgVar), a(str, this.b.i()), tbVar, (ve) null);
                return;
            } catch (Throwable th) {
                mi.a("InstreamAdFactory: invalid json-data, error: " + th.getMessage());
                a((x) null, s.a(q.k), tbVar);
                return;
            }
        }
        if (this.h != null) {
            s c = s.c();
            l6 l6Var = (l6) b((l6) a(this.h, (x) null, this.a.d(), tbVar, c), c);
            if (l6Var != null) {
                c = s.c();
            }
            a(l6Var, c, tbVar);
            return;
        }
        super.a(tbVar, jgVar);
    }
}
