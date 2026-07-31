package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes14.dex */
public final class Yo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ProducerScope a;

    public Yo(ProducerScope producerScope) {
        this.a = producerScope;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.mo8216trySendJP2dKIU(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.mo8216trySendJP2dKIU(Boolean.FALSE);
    }
}
