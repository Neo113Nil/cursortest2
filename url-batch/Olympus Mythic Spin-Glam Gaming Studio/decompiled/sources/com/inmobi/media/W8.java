package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class W8 extends ObservableProperty {
    public final /* synthetic */ X8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(Tf tf, X8 x8) {
        super(tf);
        this.a = x8;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Tf tf = (Tf) obj2;
        if (Uf.a((Tf) obj) == Uf.a(tf)) {
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((Wf) it.next()).a(tf);
        }
    }
}
