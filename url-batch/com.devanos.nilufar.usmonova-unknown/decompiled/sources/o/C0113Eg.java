package o;

import java.util.HashMap;
import java.util.List;

/* renamed from: o.Eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113Eg implements InterfaceC0288Kz {
    public final /* synthetic */ int h = 0;
    public final Object i;
    public final Object j;

    public C0113Eg(InterfaceC0061Cg interfaceC0061Cg, InterfaceC0288Kz interfaceC0288Kz) {
        AbstractC0048Bt.n(interfaceC0061Cg, "defaultLifecycleObserver");
        this.i = interfaceC0061Cg;
        this.j = interfaceC0288Kz;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        switch (this.h) {
            case 0:
                InterfaceC0061Cg interfaceC0061Cg = (InterfaceC0061Cg) this.i;
                switch (AbstractC0087Dg.a[enumC0054Bz.ordinal()]) {
                    case 1:
                        interfaceC0061Cg.getClass();
                        break;
                    case 2:
                        interfaceC0061Cg.b(interfaceC0365Nz);
                        break;
                    case 3:
                        interfaceC0061Cg.c(interfaceC0365Nz);
                        break;
                    case 4:
                        interfaceC0061Cg.getClass();
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        interfaceC0061Cg.k(interfaceC0365Nz);
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        interfaceC0061Cg.getClass();
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0288Kz interfaceC0288Kz = (InterfaceC0288Kz) this.j;
                if (interfaceC0288Kz != null) {
                    interfaceC0288Kz.j(interfaceC0365Nz, enumC0054Bz);
                    return;
                }
                return;
            case 1:
                if (enumC0054Bz == EnumC0054Bz.ON_START) {
                    ((AbstractC0106Dz) this.i).b(this);
                    ((KP) this.j).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C2034ub) this.j).a;
                List list = (List) hashMap.get(enumC0054Bz);
                Object obj = this.i;
                C2034ub.a(list, interfaceC0365Nz, enumC0054Bz, obj);
                C2034ub.a((List) hashMap.get(EnumC0054Bz.ON_ANY), interfaceC0365Nz, enumC0054Bz, obj);
                return;
        }
    }

    public C0113Eg(InterfaceC0339Mz interfaceC0339Mz) {
        this.i = interfaceC0339Mz;
        C2166wb c2166wb = C2166wb.c;
        Class<?> cls = interfaceC0339Mz.getClass();
        C2034ub c2034ub = (C2034ub) c2166wb.a.get(cls);
        this.j = c2034ub == null ? c2166wb.a(cls, null) : c2034ub;
    }

    public C0113Eg(AbstractC0106Dz abstractC0106Dz, KP kp) {
        this.i = abstractC0106Dz;
        this.j = kp;
    }
}
