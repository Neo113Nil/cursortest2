package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class T8 implements InterfaceC3857a6 {
    public final /* synthetic */ V8 a;

    public T8(V8 v8) {
        this.a = v8;
    }

    public final void a(String expandInput, Z5 inputType, float f, boolean z, long j, C4152lb c4152lb) {
        String str;
        String creativeId;
        String impressionId;
        Y5 y5;
        Intrinsics.checkNotNullParameter(expandInput, "expandInput");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        V8 v8 = this.a;
        Activity activity = (Activity) v8.a.get();
        if (activity == null) {
            return;
        }
        if (v8.e == null) {
            Y5 y52 = new Y5(activity);
            InterfaceC4466x9 interfaceC4466x9 = v8.h;
            if (interfaceC4466x9 != null) {
                y52.setLogger(interfaceC4466x9);
            }
            y52.setId(65518);
            y52.setEmbeddedBrowserUpdateListener(v8.i);
            v8.e = y52;
        }
        C c = v8.b;
        if ((c instanceof GestureDetectorOnGestureListenerC4476xi) && (y5 = v8.e) != null) {
            y5.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC4476xi) c).getListener());
        }
        Y5 y53 = v8.e;
        if (y53 != null) {
            C c2 = v8.b;
            if (c2 == null || (str = ((GestureDetectorOnGestureListenerC4476xi) c2).getAdType()) == null) {
                str = "banner";
            }
            String str2 = str;
            C c3 = v8.b;
            String str3 = (c3 == null || (impressionId = ((GestureDetectorOnGestureListenerC4476xi) c3).getImpressionId()) == null) ? "" : impressionId;
            C c4 = v8.b;
            y53.a(expandInput, inputType, z, j, str2, str3, (c4 == null || (creativeId = ((GestureDetectorOnGestureListenerC4476xi) c4).getCreativeId()) == null) ? "" : creativeId, c4152lb);
        }
        float f2 = 1 - f;
        v8.g = f2;
        C4517z7 c4517z7 = v8.c;
        if (c4517z7 != null) {
            c4517z7.c = f2;
            c4517z7.c();
        }
        v8.b();
    }
}
