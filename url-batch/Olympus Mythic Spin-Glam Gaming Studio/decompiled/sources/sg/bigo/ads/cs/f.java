package sg.bigo.ads.cs;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.j;
import sg.bigo.ads.ct.b;

/* loaded from: classes9.dex */
public class f {
    protected final g a;
    protected final sg.bigo.ads.an.j b;
    protected final long c;
    protected final Context d;
    protected b.AbstractRunnableC1882b e = null;
    protected final a f;

    public interface a {
        void a();

        void b();
    }

    public f(g gVar, sg.bigo.ads.an.j jVar, a aVar, Context context, long j) {
        this.f = aVar;
        this.d = context;
        this.c = j;
        this.a = gVar;
        this.b = jVar;
    }

    protected void a() {
        if (this.a.e()) {
            return;
        }
        d();
    }

    protected final void b() {
        g gVar = this.a;
        if (gVar == null) {
            sg.bigo.ads.bn.a.a("Callback", "sendEventsRightNow but EventStorage null!!");
            return;
        }
        final List<sg.bigo.ads.av.b> c = gVar.c();
        if (c.isEmpty()) {
            return;
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.av.b> it = c.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().c));
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("events", jSONArray);
        this.b.a(hashMap, new j.a() { // from class: sg.bigo.ads.cs.f.1
            @Override // sg.bigo.ads.an.j.a
            public final void a() {
                sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.f.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.a.a(c, true);
                        f.this.a.f();
                        f.this.a();
                        a aVar = f.this.f;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.an.j.a
            public final void a(int i, int i2, String str) {
                sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.f.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.a.a(c, false);
                        f.this.d();
                        a aVar = f.this.f;
                        if (aVar != null) {
                            aVar.b();
                        }
                    }
                });
            }
        });
    }

    protected final void c() {
        sg.bigo.ads.ct.b.a(this.e);
        this.e = null;
    }

    protected final void d() {
        if (this.e != null) {
            return;
        }
        this.e = sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.bz.c.b(f.this.d)) {
                    f.this.b();
                } else {
                    f.this.c();
                    f.this.d();
                }
            }
        }, this.c);
    }
}
