package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4464x7 implements InterfaceC4271po {
    public final /* synthetic */ C4491y7 a;

    public C4464x7(C4491y7 c4491y7) {
        this.a = c4491y7;
    }

    @Override // com.inmobi.media.InterfaceC4271po
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            InterfaceC4165lo interfaceC4165lo = (InterfaceC4165lo) this.a.i.get(view);
            if (interfaceC4165lo != null) {
                C4001fi c4001fi = (C4001fi) interfaceC4165lo;
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof GestureDetectorOnGestureListenerC4476xi) {
                    if (c4001fi.a.hasWindowFocus()) {
                        c4001fi.a.d(true);
                    } else {
                        c4001fi.a.d(false);
                    }
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            InterfaceC4165lo interfaceC4165lo2 = (InterfaceC4165lo) this.a.i.get(view2);
            if (interfaceC4165lo2 != null) {
                C4001fi c4001fi2 = (C4001fi) interfaceC4165lo2;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (view2 instanceof GestureDetectorOnGestureListenerC4476xi) {
                    if (c4001fi2.a.hasWindowFocus()) {
                        c4001fi2.a.d(false);
                    } else {
                        c4001fi2.a.d(false);
                    }
                }
            }
        }
    }
}
