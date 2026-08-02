package v;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import w.InterfaceC0112a;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0104g f1280a = new C0104g();

    /* renamed from: b, reason: collision with root package name */
    public static final U.e f1281b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0098a f1282c;

    static {
        e0.l.a(InterfaceC0105h.class).b();
        f1281b = new U.e(C0103f.f1279c);
        f1282c = C0098a.f1261a;
    }

    public static C0099b a(Context context) {
        e0.h.e(context, "context");
        InterfaceC0112a interfaceC0112a = (InterfaceC0112a) f1281b.a();
        if (interfaceC0112a == null) {
            y.k kVar = y.k.f1324c;
            if (y.k.f1324c == null) {
                ReentrantLock reentrantLock = y.k.f1325d;
                reentrantLock.lock();
                try {
                    if (y.k.f1324c == null) {
                        y.i iVar = null;
                        try {
                            s.i c2 = y.g.c();
                            if (c2 != null) {
                                s.i iVar2 = s.i.f1252g;
                                e0.h.e(iVar2, "other");
                                Object a2 = c2.f1257f.a();
                                e0.h.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar2.f1257f.a();
                                e0.h.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    y.i iVar3 = new y.i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        y.k.f1324c = new y.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0112a = y.k.f1324c;
            e0.h.b(interfaceC0112a);
        }
        int i2 = C0111n.f1294b;
        C0099b c0099b = new C0099b(interfaceC0112a);
        f1282c.getClass();
        return c0099b;
    }
}
