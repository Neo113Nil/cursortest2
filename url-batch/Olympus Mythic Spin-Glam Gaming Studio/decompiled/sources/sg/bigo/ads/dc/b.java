package sg.bigo.ads.dc;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.g;
import sg.bigo.ads.an.j;
import sg.bigo.ads.db.a;
import sg.bigo.ads.dd.a;

/* loaded from: classes4.dex */
public final class b {
    final sg.bigo.ads.db.a a;
    a.b b = null;

    @NonNull
    public final c c;
    final g d;
    final Context e;
    private final j f;

    public b(Context context, sg.bigo.ads.db.a aVar, j jVar, g gVar) {
        this.e = context;
        this.c = new c(aVar);
        this.a = aVar;
        this.f = jVar;
        this.d = gVar;
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.c.b() >= bVar.a.a) {
            bVar.a();
        } else {
            bVar.b();
        }
    }

    public static a b(String str, Map<String, String> map) {
        return new a(str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        sg.bigo.ads.dd.a.a(this.b);
        this.b = null;
        final List<sg.bigo.ads.av.c> a = this.c.a();
        if (a.isEmpty()) {
            sg.bigo.ads.bn.a.a("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (sg.bigo.ads.av.c cVar : a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", cVar.b);
                jSONObject.put("event_info", cVar.c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_events", jSONArray);
        this.f.a(hashMap, new j.a() { // from class: sg.bigo.ads.dc.b.3
            @Override // sg.bigo.ads.an.j.a
            public final void a() {
                sg.bigo.ads.dd.a.a(new Runnable() { // from class: sg.bigo.ads.dc.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.c.a(a, true);
                        b.this.c.d();
                        b.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.an.j.a
            public final void a(int i, int i2, String str) {
                sg.bigo.ads.dd.a.a(new Runnable() { // from class: sg.bigo.ads.dc.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.c.a(a, false);
                        b.this.b();
                    }
                });
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final Map<String, String> map) {
        sg.bigo.ads.dd.a.a(new Runnable() { // from class: sg.bigo.ads.dc.b.1
            @Override // java.lang.Runnable
            public final void run() {
                a.C1887a c1887a = b.this.a.c.get(str);
                boolean z = c1887a == null ? true : c1887a.c;
                long currentTimeMillis = (b.this.a.c.get(str) == null ? 3600000 : r1.d) + System.currentTimeMillis();
                a b = b.b(str, map);
                b bVar = b.this;
                bVar.c.a(b.a(bVar.d, currentTimeMillis));
                if (z) {
                    Objects.toString(map);
                    b.a(b.this);
                } else {
                    Objects.toString(map);
                    b.this.a();
                }
            }
        });
    }

    final void b() {
        if (this.b == null && !this.c.c()) {
            this.b = sg.bigo.ads.dd.a.a(new Runnable() { // from class: sg.bigo.ads.dc.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.bz.c.b(b.this.e)) {
                        b.this.a();
                        return;
                    }
                    b bVar = b.this;
                    bVar.b = null;
                    bVar.b();
                }
            }, this.a.b);
        }
    }
}
