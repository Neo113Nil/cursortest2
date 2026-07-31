package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class O8 implements InterfaceC4271po {
    public final /* synthetic */ R8 a;

    public O8(R8 r8) {
        this.a = r8;
    }

    @Override // com.inmobi.media.InterfaceC4271po
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            P8 p8 = (P8) this.a.a.get(view);
            if (p8 == null) {
                this.a.a(view);
            } else {
                P8 p82 = (P8) this.a.b.get(view);
                if (!Intrinsics.areEqual(p8.a, p82 != null ? p82.a : null)) {
                    p8.d = SystemClock.uptimeMillis();
                    this.a.b.put(view, p8);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.a.b.remove((View) it2.next());
        }
        R8 r8 = this.a;
        if (r8.e.hasMessages(0)) {
            return;
        }
        r8.e.postDelayed(r8.f, r8.g);
    }
}
