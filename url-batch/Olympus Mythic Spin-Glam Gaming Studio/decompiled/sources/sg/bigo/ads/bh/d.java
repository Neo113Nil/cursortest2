package sg.bigo.ads.bh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes11.dex */
public final class d {
    public static List<sg.bigo.ads.bh.a> a;
    private static HandlerThread b;
    private static b c;
    private static HandlerThread d;
    private static b e;
    private static HandlerThread f;
    private static b g;
    private static b h;
    private static b i;
    private static final WeakHashMap<Object, a> j = new WeakHashMap<>();
    private static boolean k = false;

    static class a {
        final Runnable a;
        final Integer b;

        public a(Runnable runnable, Integer num) {
            this.a = runnable;
            this.b = num;
        }
    }

    static {
        u.a();
    }

    public static void a(int i2, Runnable runnable) {
        a(i2, null, runnable, 0L);
    }

    public static void a(int i2, Runnable runnable, long j2) {
        a(i2, null, runnable, j2);
    }

    private static synchronized void a(int i2, final Runnable runnable, final Runnable runnable2, long j2) {
        final b bVar;
        synchronized (d.class) {
            if (runnable2 == null) {
                return;
            }
            try {
                if (h == null) {
                    j();
                }
                if (i2 == 0) {
                    if (b == null) {
                        g();
                    }
                    bVar = c;
                } else if (i2 == 1) {
                    if (d == null) {
                        h();
                    }
                    bVar = e;
                } else if (i2 != 3) {
                    bVar = h;
                } else {
                    if (f == null) {
                        i();
                    }
                    bVar = g;
                }
                if (bVar == null) {
                    return;
                }
                final Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = h.getLooper();
                }
                final Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.bh.d.1
                    final /* synthetic */ Runnable b = null;
                    final /* synthetic */ boolean c = false;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable4 = d.i != null ? new Runnable() { // from class: sg.bigo.ads.bh.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.h.post(new Runnable() { // from class: sg.bigo.ads.bh.d.1.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        sg.bigo.ads.bn.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                    }
                                });
                            }
                        } : null;
                        if (d.i != null) {
                            d.i.postDelayed(runnable4, 30000L);
                        }
                        synchronized (d.j) {
                            d.j.remove(runnable2);
                        }
                        if (d.k) {
                            runnable2.run();
                        } else {
                            try {
                                runnable2.run();
                            } catch (Throwable th) {
                                sg.bigo.ads.bn.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th));
                                List<sg.bigo.ads.bh.a> list = d.a;
                                if (list != null) {
                                    Iterator<sg.bigo.ads.bh.a> it = list.iterator();
                                    while (it.hasNext()) {
                                        it.next().a(th);
                                    }
                                }
                            }
                        }
                        if (d.i != null) {
                            d.i.removeCallbacks(runnable4);
                        }
                        if (this.b != null) {
                            if (this.c || myLooper == d.h.getLooper()) {
                                d.h.post(this.b);
                            } else {
                                new Handler(myLooper).post(this.b);
                            }
                        }
                    }
                };
                Runnable runnable4 = new Runnable() { // from class: sg.bigo.ads.bh.d.2
                    final /* synthetic */ boolean b = false;

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (runnable == null) {
                            runnable3.run();
                        } else if (this.b || myLooper == d.h.getLooper()) {
                            d.h.post(new Runnable() { // from class: sg.bigo.ads.bh.d.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    runnable.run();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    bVar.post(runnable3);
                                }
                            });
                        } else {
                            new Handler(myLooper).post(new Runnable() { // from class: sg.bigo.ads.bh.d.2.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    runnable.run();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    bVar.post(runnable3);
                                }
                            });
                        }
                    }
                };
                WeakHashMap<Object, a> weakHashMap = j;
                synchronized (weakHashMap) {
                    weakHashMap.put(runnable2, new a(runnable4, Integer.valueOf(i2)));
                }
                bVar.postDelayed(runnable4, j2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0035, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void a(Runnable runnable) {
        b bVar;
        synchronized (d.class) {
            if (runnable == null) {
                return;
            }
            try {
                WeakHashMap<Object, a> weakHashMap = j;
                a aVar = weakHashMap.get(runnable);
                if (aVar == null) {
                    return;
                }
                Runnable runnable2 = aVar.a;
                if (runnable2 == null) {
                    return;
                }
                int intValue = aVar.b.intValue();
                if (intValue == 0) {
                    bVar = c;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    synchronized (weakHashMap) {
                    }
                } else if (intValue == 1) {
                    bVar = e;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    synchronized (weakHashMap) {
                    }
                } else {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            bVar = g;
                        } else if (intValue == 1024) {
                            runnable2.run();
                        }
                        synchronized (weakHashMap) {
                            weakHashMap.remove(runnable);
                        }
                        return;
                    }
                    bVar = h;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                    synchronized (weakHashMap) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Runnable runnable, Runnable runnable2) {
        a(3, runnable, runnable2, 0L);
    }

    public static synchronized void a(@NonNull sg.bigo.ads.bh.a aVar) {
        synchronized (d.class) {
            try {
                if (a == null) {
                    a = new ArrayList();
                }
                a.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a() {
        return d == Thread.currentThread();
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            a(2, null, runnable, 0L);
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static synchronized void g() {
        synchronized (d.class) {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
                b = handlerThread;
                handlerThread.start();
                c = new b("BGAd-Background", b.getLooper());
            }
        }
    }

    private static synchronized void h() {
        synchronized (d.class) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
                d = handlerThread;
                handlerThread.start();
                e = new b("BGAd-Work", d.getLooper());
            }
        }
    }

    private static synchronized void i() {
        synchronized (d.class) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
                f = handlerThread;
                handlerThread.start();
                g = new b("BGAd-Normal", f.getLooper());
            }
        }
    }

    private static synchronized void j() {
        synchronized (d.class) {
            if (h == null) {
                h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
            }
        }
    }
}
