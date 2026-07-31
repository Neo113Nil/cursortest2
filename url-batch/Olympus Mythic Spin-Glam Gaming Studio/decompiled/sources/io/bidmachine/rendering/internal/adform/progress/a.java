package io.bidmachine.rendering.internal.adform.progress;

import android.content.Context;
import android.view.View;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.view.c;
import io.bidmachine.rendering.model.AdElementParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    private final c s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, io.bidmachine.rendering.internal.adform.c adFormListener, b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.s = new c(context);
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.o
    public void a(long j, long j2, float f) {
        this.s.a(j, j2, f);
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        q().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        return this.s;
    }
}
