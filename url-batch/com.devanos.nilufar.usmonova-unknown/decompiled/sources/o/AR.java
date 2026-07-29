package o;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class AR implements J00 {
    public static volatile AR c;
    public static final ReentrantLock d = new ReentrantLock();
    public final InterfaceC1385kl a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public AR(C2288yR c2288yR) {
        this.a = c2288yR;
        if (c2288yR != null) {
            c2288yR.d(new C1818rJ(14, this));
        }
    }

    @Override // o.J00
    public final void a(C2376zn c2376zn) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    C2354zR c2354zR = (C2354zR) it.next();
                    if (c2354zR.b == c2376zn) {
                        arrayList.add(c2354zR);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C2354zR) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C2354zR) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC1385kl interfaceC1385kl = this.a;
                    if (interfaceC1385kl != null) {
                        ((C2288yR) interfaceC1385kl).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.J00
    public final void b(Context context, ExecutorC2280yJ executorC2280yJ, C2376zn c2376zn) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0782bY c0782bY = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C1318jk c1318jk = C1318jk.h;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                InterfaceC1385kl interfaceC1385kl = this.a;
                if (interfaceC1385kl == null) {
                    c2376zn.accept(new C1470m10(c1318jk));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((C2354zR) it.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                C2354zR c2354zR = new C2354zR(activity, executorC2280yJ, c2376zn);
                copyOnWriteArrayList.add(c2354zR);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((C2354zR) obj).a)) {
                                break;
                            }
                        }
                    }
                    C2354zR c2354zR2 = (C2354zR) obj;
                    C1470m10 c1470m10 = c2354zR2 != null ? c2354zR2.c : null;
                    if (c1470m10 != null) {
                        c2354zR.c = c1470m10;
                        c2354zR.b.accept(c1470m10);
                    }
                } else {
                    C2288yR c2288yR = (C2288yR) interfaceC1385kl;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        c2288yR.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2222xR(c2288yR, activity));
                    }
                }
                reentrantLock.unlock();
                c0782bY = C0782bY.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0782bY == null) {
            c2376zn.accept(new C1470m10(c1318jk));
        }
    }
}
