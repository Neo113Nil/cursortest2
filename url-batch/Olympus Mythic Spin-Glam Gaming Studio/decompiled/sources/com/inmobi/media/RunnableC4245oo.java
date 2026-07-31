package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.oo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC4245oo implements Runnable {
    public final AtomicBoolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final WeakReference d;

    public RunnableC4245oo(AbstractC4349so visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.a = isPaused;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new WeakReference(visibilityTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.get()) {
            return;
        }
        AbstractC4349so abstractC4349so = (AbstractC4349so) this.d.get();
        if (abstractC4349so != null) {
            abstractC4349so.k = false;
            for (Map.Entry entry : abstractC4349so.a.entrySet()) {
                View view = (View) entry.getKey();
                C4297qo c4297qo = (C4297qo) entry.getValue();
                int i = c4297qo.a;
                View view2 = c4297qo.c;
                byte b = abstractC4349so.c;
                boolean z = true;
                if (b == 1) {
                    C4412v7 c4412v7 = C4491y7.k;
                    if (c4412v7.b(view2, view, i) && c4412v7.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else if (b == 2) {
                    C4412v7 c4412v72 = C4491y7.k;
                    Intrinsics.checkNotNull(c4412v72, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    boolean b2 = c4412v72.b(view2, view, i);
                    boolean a = c4412v72.a(view, view, i);
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (view instanceof GestureDetectorOnGestureListenerC4476xi) {
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) view;
                            int[] iArr = new int[2];
                            gestureDetectorOnGestureListenerC4476xi.getLocationInWindow(iArr);
                            int[] viewableFrameArray = gestureDetectorOnGestureListenerC4476xi.getViewableFrameArray();
                            int i2 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                            int i3 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                            if (rect.intersect(new Rect(i2, i3, i2 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i3))) {
                                Bitmap createBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC4476xi.getWidth(), gestureDetectorOnGestureListenerC4476xi.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                                gestureDetectorOnGestureListenerC4476xi.draw(canvas);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, N3.b(gestureDetectorOnGestureListenerC4476xi.getWidth() / R5.b()), N3.b(gestureDetectorOnGestureListenerC4476xi.getHeight() / R5.b()), true);
                                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC4476xi.getViewableFrameArray();
                                int min = Math.min(createScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                                int min2 = Math.min(createScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                                int min3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, createScaledBitmap.getWidth() - min);
                                int min4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, createScaledBitmap.getHeight() - min2);
                                Bitmap createBitmap2 = (min3 <= 0 || min4 <= 0) ? null : Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                if (createBitmap2 != null) {
                                    int height = createBitmap2.getHeight() * createBitmap2.getWidth();
                                    int[] iArr2 = new int[height];
                                    createBitmap2.getPixels(iArr2, 0, createBitmap2.getWidth(), 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < height; i5++) {
                                        int i6 = iArr2[i5];
                                        if (i6 > -16777216 && i6 < 0 && (i4 = i4 + 1) >= gestureDetectorOnGestureListenerC4476xi.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (b2 && a && z) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    C4412v7 c4412v73 = C4491y7.k;
                    if (c4412v73.b(view2, view, i) && c4412v73.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                }
            }
        }
        InterfaceC4271po interfaceC4271po = abstractC4349so != null ? abstractC4349so.h : null;
        if (interfaceC4271po != null) {
            interfaceC4271po.a(this.b, this.c);
        }
        this.b.clear();
        this.c.clear();
        if (abstractC4349so != null) {
            abstractC4349so.d();
        }
    }
}
