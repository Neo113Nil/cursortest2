package o;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class B20 {
    public static final C2002u5 i = new C2002u5(new A20(), new C1623oL(16));
    public final Context a;
    public final String b;
    public final C2002u5 c;
    public final WU d;
    public final G4 e;
    public final int f;
    public final C1097gL g;
    public final C0408Pq h;

    public B20(Context context, C2002u5 c2002u5, C0279Kq c0279Kq) {
        AbstractC1473m3.o(context, "Null context is not permitted.");
        AbstractC1473m3.o(c2002u5, "Api must not be null.");
        AbstractC1473m3.o(c0279Kq, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = c2002u5;
        this.d = WU.a;
        this.e = new G4(c2002u5, str);
        C0408Pq d = C0408Pq.d(this.a);
        this.h = d;
        this.f = d.h.getAndIncrement();
        this.g = c0279Kq.a;
        E20 e20 = d.m;
        e20.sendMessage(e20.obtainMessage(7, this));
    }

    public final p30 a(VU vu) {
        C1818rJ c1818rJ = new C1818rJ(18, false);
        C0300Ll[] c0300LlArr = {AbstractC0868ct.k};
        c1818rJ.i = new C2329z20(vu);
        C1711ph c1711ph = new C1711ph(c1818rJ, c0300LlArr, false);
        NU nu = new NU();
        C0408Pq c0408Pq = this.h;
        c0408Pq.getClass();
        C2131w20 c2131w20 = new C2131w20(c1711ph, nu, this.g);
        E20 e20 = c0408Pq.m;
        e20.sendMessage(e20.obtainMessage(4, new C1867s20(c2131w20, c0408Pq.i.get(), this)));
        return nu.a;
    }
}
