package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: o.Au, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023Au extends C0897dI {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public C0023Au(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // o.C0897dI
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // o.C0897dI
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1359kL) obj) != EnumC1359kL.i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1359kL) it.next()).h);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(C0897dI.class.getClassLoader(), new Class[]{this.f, this.g}, new C2383zu(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // o.C0897dI
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            AbstractC0048Bt.l(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C2383zu c2383zu = (C2383zu) invocationHandler;
            boolean z = c2383zu.b;
            if (!z && c2383zu.c == null) {
                C0897dI.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z) {
                return null;
            }
            return c2383zu.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
