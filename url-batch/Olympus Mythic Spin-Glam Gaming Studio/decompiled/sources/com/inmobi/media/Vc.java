package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Vc {
    public final C4456x a;
    public final Lazy b;

    public Vc(C4456x adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.a = adComponent;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Vc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Vc.a(Vc.this);
            }
        });
    }

    public static final Qc a(Vc vc) {
        C4456x c4456x = vc.a;
        return new Qc(c4456x.b, c4456x.a.d);
    }
}
