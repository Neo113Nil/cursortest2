package o;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2110vl implements J00 {
    public final WindowLayoutComponent a;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public C2110vl(WindowLayoutComponent windowLayoutComponent) {
        this.a = windowLayoutComponent;
    }

    @Override // o.J00
    public final void a(C2376zn c2376zn) {
        LinkedHashMap linkedHashMap = this.c;
        LinkedHashMap linkedHashMap2 = this.d;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(c2376zn);
            if (context == null) {
                return;
            }
            C1747qD c1747qD = (C1747qD) linkedHashMap.get(context);
            if (c1747qD == null) {
                return;
            }
            LinkedHashSet linkedHashSet = c1747qD.d;
            ReentrantLock reentrantLock2 = c1747qD.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(c2376zn);
                reentrantLock2.unlock();
                linkedHashMap2.remove(c2376zn);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(c1747qD);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.J00
    public final void b(Context context, ExecutorC2280yJ executorC2280yJ, C2376zn c2376zn) {
        C0782bY c0782bY;
        LinkedHashMap linkedHashMap = this.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            C1747qD c1747qD = (C1747qD) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.d;
            if (c1747qD != null) {
                c1747qD.b(c2376zn);
                linkedHashMap2.put(c2376zn, context);
                c0782bY = C0782bY.a;
            } else {
                c0782bY = null;
            }
            if (c0782bY == null) {
                C1747qD c1747qD2 = new C1747qD(context);
                linkedHashMap.put(context, c1747qD2);
                linkedHashMap2.put(c2376zn, context);
                c1747qD2.b(c2376zn);
                this.a.addWindowLayoutInfoListener(context, c1747qD2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
