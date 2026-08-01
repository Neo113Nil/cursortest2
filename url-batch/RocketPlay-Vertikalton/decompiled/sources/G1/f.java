package G1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f526f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f527a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f528b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f529c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f530e;

    public f(Class cls) {
        this.f527a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        i1.f.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f528b = declaredMethod;
        this.f529c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f530e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // G1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f527a.isInstance(sSLSocket);
    }

    @Override // G1.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f527a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, p1.a.f3802a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && i1.f.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // G1.n
    public final boolean c() {
        boolean z2 = F1.c.f407e;
        return F1.c.f407e;
    }

    @Override // G1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i1.f.e(list, "protocols");
        if (this.f527a.isInstance(sSLSocket)) {
            try {
                this.f528b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f529c.invoke(sSLSocket, str);
                }
                Method method = this.f530e;
                F1.n nVar = F1.n.f424a;
                method.invoke(sSLSocket, M0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
