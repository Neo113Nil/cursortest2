package o;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: o.Wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574Wa {
    public final C0827cE a;
    public final C0705aN b;
    public final Collection c;
    public final InterfaceC2114vp d;
    public final InterfaceC0496Ta[] e;

    public C0574Wa(C0827cE c0827cE, C0705aN c0705aN, Collection collection, InterfaceC2114vp interfaceC2114vp, InterfaceC0496Ta... interfaceC0496TaArr) {
        this.a = c0827cE;
        this.b = c0705aN;
        this.c = collection;
        this.d = interfaceC2114vp;
        this.e = interfaceC0496TaArr;
    }

    public /* synthetic */ C0574Wa(C0827cE c0827cE, InterfaceC0496Ta[] interfaceC0496TaArr) {
        this(c0827cE, interfaceC0496TaArr, I2.s);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0574Wa(C0827cE c0827cE, InterfaceC0496Ta[] interfaceC0496TaArr, InterfaceC2114vp interfaceC2114vp) {
        this(c0827cE, null, null, interfaceC2114vp, (InterfaceC0496Ta[]) Arrays.copyOf(interfaceC0496TaArr, interfaceC0496TaArr.length));
        AbstractC0048Bt.n(c0827cE, "name");
    }

    public /* synthetic */ C0574Wa(Collection collection, InterfaceC0496Ta[] interfaceC0496TaArr) {
        this(collection, interfaceC0496TaArr, I2.u);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0574Wa(Collection collection, InterfaceC0496Ta[] interfaceC0496TaArr, InterfaceC2114vp interfaceC2114vp) {
        this(null, null, collection, interfaceC2114vp, (InterfaceC0496Ta[]) Arrays.copyOf(interfaceC0496TaArr, interfaceC0496TaArr.length));
        AbstractC0048Bt.n(collection, "nameList");
    }
}
