package o;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.qD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747qD implements InterfaceC0655Zd, Consumer {
    public final Context a;
    public C1470m10 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public C1747qD(Context context) {
        this.a = context;
    }

    @Override // o.InterfaceC0655Zd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        AbstractC0048Bt.n(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = AbstractC2242xl.b(this.a, windowLayoutInfo);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0655Zd) it.next()).accept(this.c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C2376zn c2376zn) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            C1470m10 c1470m10 = this.c;
            if (c1470m10 != null) {
                c2376zn.accept(c1470m10);
            }
            this.d.add(c2376zn);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
