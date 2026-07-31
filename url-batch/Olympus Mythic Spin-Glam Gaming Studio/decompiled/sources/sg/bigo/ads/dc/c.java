package sg.bigo.ads.dc;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes4.dex */
public final class c {
    public Set<sg.bigo.ads.av.c> a;
    public Set<sg.bigo.ads.av.c> b;
    private final sg.bigo.ads.db.a c;

    public c(@NonNull sg.bigo.ads.db.a aVar) {
        this.c = aVar;
        this.a = q.a(aVar.a);
        this.b = q.a(aVar.a);
        sg.bigo.ads.dd.a.a(new Runnable() { // from class: sg.bigo.ads.dc.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                sg.bigo.ads.au.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(System.currentTimeMillis())), null);
                cVar.a.addAll(cVar.e());
            }
        });
    }

    final synchronized List<sg.bigo.ads.av.c> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.a);
            Iterator<sg.bigo.ads.av.c> it = this.b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.a.clear();
            this.b.addAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    final synchronized void a(List<sg.bigo.ads.av.c> list, boolean z) {
        try {
            this.b.removeAll(list);
            if (!z) {
                this.a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.av.c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().a));
            }
            sg.bigo.ads.aw.c.a(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void a(sg.bigo.ads.av.c cVar) {
        try {
            this.a.add(cVar);
            cVar.toString();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_id", cVar.b);
            contentValues.put("event_info", cVar.c);
            contentValues.put("expired_ts", Long.valueOf(cVar.d));
            contentValues.put("ext", cVar.e);
            long j = cVar.f;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            contentValues.put("ctime", Long.valueOf(j));
            long j2 = cVar.g;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            contentValues.put("mtime", Long.valueOf(j2));
            cVar.a = sg.bigo.ads.au.a.a("tb_stat", contentValues);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized int b() {
        return this.a.size();
    }

    final synchronized boolean c() {
        return this.a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.a.isEmpty()) {
                List<sg.bigo.ads.av.c> e = e();
                Iterator<sg.bigo.ads.av.c> it = this.b.iterator();
                while (it.hasNext()) {
                    e.remove(it.next());
                }
                this.a.addAll(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final List<sg.bigo.ads.av.c> e() {
        return sg.bigo.ads.aw.c.a(this.c.a());
    }

    public final synchronized void f() {
        this.b.clear();
        this.a.clear();
    }
}
