package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import android.webkit.WebView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class j {
    public volatile Function2 a;

    public static final /* synthetic */ void a(j jVar, Window window, Rect rect, Bitmap bitmap, Function1 function1) {
        jVar.getClass();
        a(window, rect, bitmap, function1);
    }

    public final void a(WebView view, int i, com.vungle.ads.internal.ui.q callback) {
        Activity activity;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a = callback;
        if (view == null) {
            boolean z = u.a;
            t.c("BlackScreenDetector", "Black screen detection failed: View not available");
            Function2 function2 = this.a;
            if (function2 != null) {
                function2.invoke(-1, "View not available");
            }
            this.a = null;
            return;
        }
        i onComplete = new i(view, this, i);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (this.a == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            Window window = activity != null ? activity.getWindow() : null;
            if (window == null) {
                boolean z2 = u.a;
                t.c("BlackScreenDetector", "Activity/Window not found for PixelCopy");
                onComplete.invoke(null);
                return;
            } else {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new f(context2));
                Handler handler = y.a;
                y.a(new g(view, lazy, this, window, onComplete));
                return;
            }
        }
        Handler handler2 = y.a;
        y.a(new e(view, onComplete));
    }

    public static final com.vungle.ads.internal.executor.a a(Lazy lazy) {
        return (com.vungle.ads.internal.executor.a) lazy.getValue();
    }

    public static void a(Window window, Rect rect, final Bitmap bitmap, final Function1 function1) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.j$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    j.a(Function1.this, bitmap, i);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "PixelCopy request failed", th);
            bitmap.recycle();
            function1.invoke(null);
        }
    }

    public static final void a(Function1 onComplete, Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "PixelCopy failed: " + i);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    public static Pair a(Bitmap bitmap, int i) {
        if (bitmap != null) {
            int a = a(bitmap, 0.1d, i, 0.5d);
            return new Pair(Integer.valueOf(a), a == -1 ? "Internal calculation error" : "");
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "Black screen detection failed: Snapshot capture failure");
        return new Pair(-1, "Snapshot capture failure");
    }

    public static int a(Bitmap bitmap, double d, int i, double d2) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = (int) (width * d);
        int i5 = (int) (height * d);
        int i6 = width - (i4 * 2);
        int i7 = height - (i5 * 2);
        if (i6 <= 0 || i7 <= 0) {
            return -1;
        }
        long j = i6 * i7;
        if (j > 2147483647L) {
            if (d >= d2) {
                return -1;
            }
            return a(bitmap, d * 2, i, d2);
        }
        int i8 = (int) j;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, i6, i4, i5, i6, i7);
        int i9 = i8 - 1;
        if (i > 0) {
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, i9, i);
            if (progressionLastElement >= 0) {
                int i10 = 0;
                i2 = 0;
                i3 = 0;
                while (true) {
                    i2++;
                    int i11 = iArr[i10];
                    int i12 = (i11 >> 24) & 255;
                    int i13 = (i11 >> 16) & 255;
                    int i14 = (i11 >> 8) & 255;
                    int i15 = i11 & 255;
                    if (i12 > 0 && i13 < 10 && i14 < 10 && i15 < 10) {
                        i3++;
                    }
                    if (i10 == progressionLastElement) {
                        break;
                    }
                    i10 += i;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (i2 > 0) {
                return (int) ((i3 * 100) / i2);
            }
            return 0;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + i + '.');
    }
}
