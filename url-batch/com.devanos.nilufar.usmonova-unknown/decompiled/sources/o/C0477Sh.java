package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: o.Sh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477Sh extends AbstractC0048Bt {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractCollection i;

    public /* synthetic */ C0477Sh(AbstractCollection abstractCollection, int i) {
        this.h = i;
        this.i = abstractCollection;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.AbstractC0048Bt
    public final void f(InterfaceC2204x9 interfaceC2204x9) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(interfaceC2204x9, "fakeOverride");
                XG.r(interfaceC2204x9, null);
                ((ArrayList) this.i).add(interfaceC2204x9);
                return;
            default:
                if (interfaceC2204x9 == null) {
                    a(0);
                    throw null;
                }
                XG.r(interfaceC2204x9, null);
                ((LinkedHashSet) this.i).add(interfaceC2204x9);
                return;
        }
    }

    @Override // o.AbstractC0048Bt
    public final void x(InterfaceC2204x9 interfaceC2204x9, InterfaceC2204x9 interfaceC2204x92) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(interfaceC2204x92, "fromCurrent");
                if (interfaceC2204x92 instanceof AbstractC0433Qp) {
                    ((AbstractC0433Qp) interfaceC2204x92).O0(C0633Yh.a, interfaceC2204x9);
                    return;
                }
                return;
            default:
                if (interfaceC2204x92 != null) {
                    return;
                }
                a(2);
                throw null;
        }
    }
}
