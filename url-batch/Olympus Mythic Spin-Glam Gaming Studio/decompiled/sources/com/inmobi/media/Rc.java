package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Rc {
    public final C4456x a;
    public final InMobiJsonResponse b;
    public final Nc c;
    public final Vc d;
    public Kl e;
    public final Lazy f;
    public final Lazy g;

    public Rc(C4456x adComponent, InMobiJsonResponse inMobiJsonResponse, Nc adUnitCallback) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a = adComponent;
        this.b = inMobiJsonResponse;
        this.c = adUnitCallback;
        this.d = new Vc(adComponent);
        this.f = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Rc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Rc.b(Rc.this);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Rc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Rc.a(Rc.this);
            }
        });
    }

    public static final C4496yc a(Rc rc) {
        C4248p1 c4248p1 = rc.d.a.a;
        return new C4496yc(c4248p1.b, c4248p1.e, c4248p1.c);
    }

    public static final Qc b(Rc rc) {
        return (Qc) rc.d.b.getValue();
    }
}
