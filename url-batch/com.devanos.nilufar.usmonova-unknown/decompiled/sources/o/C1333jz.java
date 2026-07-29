package o;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: o.jz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333jz implements InterfaceC1569nX {
    public int h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;

    public C1333jz(C1216i8 c1216i8, InterfaceC1249ig interfaceC1249ig, InterfaceC1855ru interfaceC1855ru, int i) {
        AbstractC0048Bt.n(c1216i8, "c");
        AbstractC0048Bt.n(interfaceC1855ru, "typeParameterOwner");
        this.i = c1216i8;
        this.j = interfaceC1249ig;
        this.h = i;
        ArrayList typeParameters = interfaceC1855ru.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.k = linkedHashMap;
        this.l = ((VA) ((C1198hu) ((C1216i8) this.i).i).a).c(new C1400l(24, this));
    }

    public void a(C1028fI c1028fI) {
        Window window = ((Activity) this.i).getWindow();
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        PO c1404l10 = i >= 30 ? new C1404l10(window) : i >= 26 ? new C1272j10(window) : new C1208i10(window);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i3 = c1028fI.b;
        if (i3 != 0) {
            int v = AbstractC1888sN.v(i3);
            if (v == 0) {
                c1404l10.l(false);
            } else if (v == 1) {
                c1404l10.l(true);
            }
        }
        Integer num = c1028fI.a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c1028fI.c;
        if (bool != null && i2 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i2 >= 26) {
            int i4 = c1028fI.e;
            if (i4 != 0) {
                int v2 = AbstractC1888sN.v(i4);
                if (v2 == 0) {
                    c1404l10.k(false);
                } else if (v2 == 1) {
                    c1404l10.k(true);
                }
            }
            Integer num2 = c1028fI.d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c1028fI.f;
        if (num3 != null && i2 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c1028fI.g;
        if (bool2 != null && i2 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.l = c1028fI;
    }

    public void b() {
        ((Activity) this.i).getWindow().getDecorView().setSystemUiVisibility(this.h);
        C1028fI c1028fI = (C1028fI) this.l;
        if (c1028fI != null) {
            a(c1028fI);
        }
    }

    @Override // o.InterfaceC1569nX
    public InterfaceC1437lX h(LM lm) {
        AbstractC0048Bt.n(lm, "javaTypeParameter");
        C1267iz c1267iz = (C1267iz) ((TA) this.l).invoke(lm);
        return c1267iz != null ? c1267iz : ((InterfaceC1569nX) ((C1216i8) this.i).j).h(lm);
    }

    public C1333jz(AbstractActivityC0560Vm abstractActivityC0560Vm, C0208Hx c0208Hx, AbstractActivityC0560Vm abstractActivityC0560Vm2) {
        C1590ns c1590ns = new C1590ns(20, this);
        this.i = abstractActivityC0560Vm;
        this.j = c0208Hx;
        c0208Hx.j = c1590ns;
        this.k = abstractActivityC0560Vm2;
        this.h = 1280;
    }
}
