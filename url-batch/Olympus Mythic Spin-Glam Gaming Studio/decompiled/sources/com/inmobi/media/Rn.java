package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes13.dex */
public final class Rn implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ProducerScope a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;

    public Rn(ProducerScope producerScope, View view, ViewGroup viewGroup) {
        this.a = producerScope;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.mo8216trySendJP2dKIU(Boolean.valueOf(Un.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.mo8216trySendJP2dKIU(Boolean.FALSE);
    }
}
