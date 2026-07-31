package com.inmobi.media;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Uk {
    public final GestureDetectorOnGestureListenerC4476xi a;

    public Uk(GestureDetectorOnGestureListenerC4476xi mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.a = mListener;
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a.b(event.getX(), event.getY());
        }
    }
}
