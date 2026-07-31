package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a {
    c a;
    Map<String, b> b = new HashMap();
    Map<String, RunnableC1880a> c = new HashMap();

    /* renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    class RunnableC1880a implements Runnable {
        WeakReference<sg.bigo.ads.ay.a> a;

        public RunnableC1880a(sg.bigo.ads.ay.a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.ay.a> weakReference = RunnableC1880a.this.a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC1880a runnableC1880a = RunnableC1880a.this;
                    a.this.c.remove(runnableC1880a.a.get().a);
                    RunnableC1880a runnableC1880a2 = RunnableC1880a.this;
                    a.this.a.c(runnableC1880a2.a.get());
                }
            });
        }
    }

    class b implements Runnable {
        sg.bigo.ads.ay.a a;

        public b(sg.bigo.ads.ay.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    sg.bigo.ads.ay.a aVar = bVar.a;
                    if (aVar != null) {
                        a.this.b.remove(aVar.a);
                        b bVar2 = b.this;
                        a.this.a.b(bVar2.a);
                    }
                }
            });
        }
    }

    interface c {
        void b(sg.bigo.ads.ay.a aVar);

        void c(sg.bigo.ads.ay.a aVar);
    }

    public a(c cVar) {
        this.a = cVar;
    }

    public final void a(sg.bigo.ads.ay.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.c.containsKey(aVar.a)) {
                    sg.bigo.ads.bh.d.a(this.c.remove(aVar.a));
                }
                RunnableC1880a runnableC1880a = new RunnableC1880a(aVar);
                this.c.put(aVar.a, runnableC1880a);
                sg.bigo.ads.bh.d.a(3, runnableC1880a, aVar.f() * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.ay.a aVar) {
        if (this.c.containsKey(aVar.a)) {
            sg.bigo.ads.bh.d.a(this.c.get(aVar.a));
            this.c.remove(aVar.a);
        }
    }

    public final void c(sg.bigo.ads.ay.a aVar) {
        if (this.b.containsKey(aVar.a)) {
            sg.bigo.ads.bh.d.a(this.b.remove(aVar.a));
        }
        b bVar = new b(aVar);
        this.b.put(aVar.a, bVar);
        sg.bigo.ads.bh.d.a(3, bVar, aVar.e() * 1000);
        aVar.e();
    }
}
