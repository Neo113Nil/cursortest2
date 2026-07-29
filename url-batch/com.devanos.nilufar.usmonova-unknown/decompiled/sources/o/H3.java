package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class H3 implements ES {
    public static final C1623oL f = new C1623oL(15);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public H3(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC0048Bt.m(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // o.ES
    public final String a(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC0470Sa.a);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC0048Bt.h(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // o.ES
    public final boolean b() {
        boolean z = G3.e;
        return G3.e;
    }

    @Override // o.ES
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // o.ES
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                C0897dI c0897dI = C0897dI.a;
                method.invoke(sSLSocket, C0140Fh.u(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
