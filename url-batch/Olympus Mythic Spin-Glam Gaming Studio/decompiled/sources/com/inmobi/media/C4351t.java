package com.inmobi.media;

import com.squareup.picasso.Picasso;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4351t implements Function1 {
    public final /* synthetic */ C4430w a;

    public C4351t(C4430w c4430w) {
        this.a = c4430w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4493y9 c4493y9 = this.a.d;
        if (c4493y9 != null) {
            c4493y9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C4430w c4430w = this.a;
        C4493y9 c4493y92 = c4430w.d;
        if (c4493y92 != null) {
            c4493y92.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = C4027gg.a;
        C4027gg.b(c4430w.a).cancelTag(c4430w.e);
        return Unit.INSTANCE;
    }
}
