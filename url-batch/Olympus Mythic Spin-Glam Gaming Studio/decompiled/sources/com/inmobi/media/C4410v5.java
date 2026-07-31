package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4410v5 implements InterfaceC4157lg {
    public final /* synthetic */ C4462x5 a;

    public C4410v5(C4462x5 c4462x5) {
        this.a = c4462x5;
    }

    @Override // com.inmobi.media.InterfaceC4157lg
    public final Object a(C4210ng c4210ng, Continuation continuation) {
        WeakReference weakReference = (WeakReference) this.a.b.get(c4210ng.a.h);
        InterfaceC4421vg interfaceC4421vg = weakReference != null ? (InterfaceC4421vg) weakReference.get() : null;
        if (!AbstractC4289qg.a(c4210ng)) {
            Object a = this.a.a(c4210ng, interfaceC4421vg, continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        }
        C4462x5 c4462x5 = this.a;
        c4462x5.getClass();
        AbstractC4500yg.a(c4210ng, interfaceC4421vg);
        Object a2 = c4462x5.a.a.a("pings", "id=?", new String[]{c4210ng.a.b}, continuation);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a2 = Unit.INSTANCE;
        }
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a2 = Unit.INSTANCE;
        }
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
