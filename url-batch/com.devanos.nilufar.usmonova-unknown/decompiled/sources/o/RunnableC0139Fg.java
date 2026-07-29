package o;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: o.Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0139Fg implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ RunnableC0139Fg(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                C0217Ig c0217Ig = (C0217Ig) this.i;
                F7 f7 = (F7) this.j;
                String str = f7.a;
                C2070v7 c2070v7 = (C2070v7) this.k;
                c0217Ig.getClass();
                Logger logger = C0217Ig.f;
                try {
                    InterfaceC2095vW a = c0217Ig.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((C1495mP) c0217Ig.e).q(new C0165Gg(c0217Ig, f7, ((C2033ua) a).a(c2070v7), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                C0985ef c0985ef = (C0985ef) this.i;
                AbstractC0868ct abstractC0868ct = (AbstractC0868ct) this.j;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.k;
                try {
                    C0665Zn k = EB.k(c0985ef.a);
                    if (k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0639Yn c0639Yn = (C0639Yn) k.a;
                    synchronized (c0639Yn.d) {
                        c0639Yn.f = threadPoolExecutor;
                    }
                    k.a.a(new C0323Mj(abstractC0868ct, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0868ct.O(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ((EnhancedIntentService) this.i).lambda$processIntent$0((Intent) this.j, (NU) this.k);
                return;
        }
    }

    public /* synthetic */ RunnableC0139Fg(C0217Ig c0217Ig, F7 f7, C1574nc c1574nc, C2070v7 c2070v7) {
        this.h = 0;
        this.i = c0217Ig;
        this.j = f7;
        this.k = c2070v7;
    }
}
