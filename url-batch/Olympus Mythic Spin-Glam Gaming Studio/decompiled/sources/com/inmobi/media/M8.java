package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes12.dex */
public final class M8 implements InterfaceC4157lg {
    public final /* synthetic */ N8 a;

    public M8(N8 n8) {
        this.a = n8;
    }

    @Override // com.inmobi.media.InterfaceC4157lg
    public final Object a(C4210ng c4210ng, Continuation continuation) {
        WeakReference weakReference = (WeakReference) this.a.b.get(c4210ng.a.h);
        InterfaceC4421vg interfaceC4421vg = weakReference != null ? (InterfaceC4421vg) weakReference.get() : null;
        if (!AbstractC4289qg.a(c4210ng)) {
            Object a = this.a.a(c4210ng, interfaceC4421vg, continuation);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
        }
        N8 n8 = this.a;
        n8.getClass();
        AbstractC4500yg.a(c4210ng, interfaceC4421vg);
        Object a2 = n8.a.a.a("pings", "id=?", new String[]{c4210ng.a.b}, continuation);
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a2 = Unit.INSTANCE;
        }
        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a2 = Unit.INSTANCE;
        }
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
