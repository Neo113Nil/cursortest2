package o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044ul implements J00 {
    public final WindowLayoutComponent a;
    public final C0853ce b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public C2044ul(WindowLayoutComponent windowLayoutComponent, C0853ce c0853ce) {
        this.a = windowLayoutComponent;
        this.b = c0853ce;
    }

    @Override // o.J00
    public final void a(C2376zn c2376zn) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
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
                    C0788be c0788be = (C0788be) this.f.remove(c1747qD);
                    if (c0788be != null) {
                        c0788be.a.invoke(c0788be.b, c0788be.c);
                    }
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
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            C1747qD c1747qD = (C1747qD) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
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
                if (!(context instanceof Activity)) {
                    c1747qD2.accept(new WindowLayoutInfo(C1318jk.h));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(c1747qD2, this.b.a(this.a, UM.a.b(WindowLayoutInfo.class), (Activity) context, new C1978tl(1, c1747qD2, C1747qD.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
