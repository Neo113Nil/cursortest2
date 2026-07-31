package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: JdkWithJettyBootPlatform.java */
/* loaded from: classes3.dex */
class e extends g {
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class<?> f;
    private final Class<?> g;

    /* compiled from: JdkWithJettyBootPlatform.java */
    private static class a implements InvocationHandler {
        private final List<String> a;
        boolean b;
        String c;

        a(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = com.mbridge.msdk.thrid.okhttp.internal.c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = this.a.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.c = (String) objArr[0];
            return null;
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    public static g h() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f, this.g}, new a(g.a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to set alpn", (Exception) e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                g.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.c;
        } catch (IllegalAccessException e) {
            e = e;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to remove alpn", (Exception) e);
        }
    }
}
