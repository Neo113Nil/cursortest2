package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public final class M1 implements ReadOnlyProperty {
    public final Function0 a;
    public final boolean b;
    public volatile Object c;
    public final AtomicBoolean d;
    public boolean e;

    public /* synthetic */ M1(Integer num, Function0 function0, int i) {
        this(num, function0, (i & 4) == 0, false);
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.e = true;
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new L1(this, null), 3, null);
        }
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.b || !this.e) {
            a();
        }
        return this.c;
    }

    public M1(Object obj, Function0 refreshLogic, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.a = refreshLogic;
        this.b = z;
        this.c = obj;
        this.d = new AtomicBoolean(false);
        if (z2) {
            a();
        }
    }
}
