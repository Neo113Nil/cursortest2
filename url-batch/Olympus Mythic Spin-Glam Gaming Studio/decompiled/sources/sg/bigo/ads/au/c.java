package sg.bigo.ads.au;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.bh.e;

/* loaded from: classes10.dex */
public final class c {
    final LinkedList<Runnable> a = new LinkedList<>();
    final Object b = new Object();
    final e c;

    static class a implements Runnable {
        final CountDownLatch a = new CountDownLatch(1);
        Runnable b = new Runnable() { // from class: sg.bigo.ads.au.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        private final Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.run();
            this.a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}
