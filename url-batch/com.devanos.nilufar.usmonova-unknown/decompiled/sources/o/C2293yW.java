package o;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: o.yW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2293yW {
    public static volatile C1051ff e;
    public final InterfaceC0212Ib a;
    public final InterfaceC0212Ib b;
    public final ZP c;
    public final AY d;

    public C2293yW(InterfaceC0212Ib interfaceC0212Ib, InterfaceC0212Ib interfaceC0212Ib2, ZP zp, AY ay, M10 m10) {
        this.a = interfaceC0212Ib;
        this.b = interfaceC0212Ib2;
        this.c = zp;
        this.d = ay;
        m10.a.execute(new D1(13, m10));
    }

    public static C2293yW a() {
        C1051ff c1051ff = e;
        if (c1051ff != null) {
            return (C2293yW) c1051ff.m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (C2293yW.class) {
                try {
                    if (e == null) {
                        C0985ef c0985ef = new C0985ef();
                        context.getClass();
                        c0985ef.a = context;
                        e = c0985ef.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C2227xW c(InterfaceC1714pk interfaceC1714pk) {
        byte[] bytes;
        Set unmodifiableSet = interfaceC1714pk != null ? Collections.unmodifiableSet(C1479m9.d) : Collections.singleton(new C1845rk("proto"));
        C0950e6 a = F7.a();
        interfaceC1714pk.getClass();
        a.i = "cct";
        C1479m9 c1479m9 = (C1479m9) interfaceC1714pk;
        String str = c1479m9.a;
        String str2 = c1479m9.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a.j = bytes;
        return new C2227xW(unmodifiableSet, a.l(), this);
    }
}
