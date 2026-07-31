package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class I7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ V7 b;

    public I7(View view, V7 v7) {
        this.a = view;
        this.b = v7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.removeOnAttachStateChangeListener(this);
        InterfaceC4466x9 interfaceC4466x9 = this.b.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.b.a(C4492y8.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
