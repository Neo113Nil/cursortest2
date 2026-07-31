package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.xn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4481xn implements FlowCollector {
    public final /* synthetic */ An a;

    public C4481xn(CoroutineScope coroutineScope, An an) {
        this.a = an;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ProgressBar progressBar;
        AbstractC4295qm abstractC4295qm = (AbstractC4295qm) obj;
        An an = this.a;
        an.getClass();
        if (abstractC4295qm instanceof Jn) {
            ProgressBar progressBar2 = an.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC4295qm instanceof C4454wn) {
            int i = ((C4454wn) abstractC4295qm).b;
            ProgressBar progressBar3 = an.e;
            if (progressBar3 != null) {
                P6.a(an.f);
                an.f = X4.a(an.a, new C4533zn(progressBar3, an, i, null));
            }
        } else if ((abstractC4295qm instanceof C4243om) && an.c.b && (progressBar = an.e) != null) {
            progressBar.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
