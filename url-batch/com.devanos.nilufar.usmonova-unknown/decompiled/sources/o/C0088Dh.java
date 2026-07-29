package o;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: o.Dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088Dh extends AbstractC0048Bt {
    public final /* synthetic */ InterfaceC0143Fk h;
    public final /* synthetic */ LinkedHashSet i;
    public final /* synthetic */ boolean j;

    public C0088Dh(InterfaceC0143Fk interfaceC0143Fk, LinkedHashSet linkedHashSet, boolean z) {
        this.h = interfaceC0143Fk;
        this.i = linkedHashSet;
        this.j = z;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.AbstractC0048Bt
    public final void e0(InterfaceC2204x9 interfaceC2204x9, Collection collection) {
        if (interfaceC2204x9 == null) {
            a(3);
            throw null;
        }
        if (!this.j || interfaceC2204x9.M() == 2) {
            interfaceC2204x9.c0(collection);
        }
    }

    @Override // o.AbstractC0048Bt
    public final void f(InterfaceC2204x9 interfaceC2204x9) {
        if (interfaceC2204x9 == null) {
            a(0);
            throw null;
        }
        XG.r(interfaceC2204x9, new C1466m(1, this));
        this.i.add(interfaceC2204x9);
    }

    @Override // o.AbstractC0048Bt
    public final void x(InterfaceC2204x9 interfaceC2204x9, InterfaceC2204x9 interfaceC2204x92) {
        if (interfaceC2204x92 != null) {
            return;
        }
        a(2);
        throw null;
    }
}
