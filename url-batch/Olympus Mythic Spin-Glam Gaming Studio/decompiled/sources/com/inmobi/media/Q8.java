package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Q8 implements Runnable {
    public final String a;
    public final ArrayList b;
    public final WeakReference c;

    public Q8(R8 impressionTracker) {
        Intrinsics.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.a = Q8.class.getSimpleName();
        this.b = new ArrayList();
        this.c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String TAG = this.a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        R8 r8 = (R8) this.c.get();
        if (r8 != null) {
            for (Map.Entry entry : r8.b.entrySet()) {
                View view = (View) entry.getKey();
                P8 p8 = (P8) entry.getValue();
                String TAG2 = this.a;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                Objects.toString(p8);
                if (SystemClock.uptimeMillis() - p8.d >= p8.c) {
                    String TAG3 = this.a;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    C4438w7 c4438w7 = r8.h;
                    c4438w7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC4476xi) {
                        InterfaceC4466x9 interfaceC4466x9 = c4438w7.a.f;
                        if (interfaceC4466x9 != null) {
                            ((C4493y9) interfaceC4466x9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC4476xi) view).u();
                    }
                    this.b.add(view);
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                r8.a((View) it.next());
            }
            this.b.clear();
            if (r8.b.isEmpty() || r8.e.hasMessages(0)) {
                return;
            }
            r8.e.postDelayed(r8.f, r8.g);
        }
    }
}
