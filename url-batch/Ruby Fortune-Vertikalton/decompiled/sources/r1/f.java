package r1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3577f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3579b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3580c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3581e;

    public f(Class cls) {
        this.f3578a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        X0.e.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3579b = declaredMethod;
        this.f3580c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3581e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3578a.isInstance(sSLSocket);
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3578a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, e1.a.f1909a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && X0.e.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // r1.m
    public final boolean c() {
        boolean z2 = q1.c.f3551e;
        return q1.c.f3551e;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.e.e(list, "protocols");
        if (this.f3578a.isInstance(sSLSocket)) {
            try {
                this.f3579b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3580c.invoke(sSLSocket, str);
                }
                Method method = this.f3581e;
                q1.n nVar = q1.n.f3568a;
                method.invoke(sSLSocket, H0.e.e(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
