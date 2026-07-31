package com.safedk.android.analytics.brandsafety.creatives;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.o;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes15.dex */
public class ScreenshotHelper {
    private static final String a = "ScreenshotHelper";
    private static final ScheduledExecutorService b = Executors.newScheduledThreadPool(1);

    public static class DefaultOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        final Activity activity;
        com.safedk.android.analytics.brandsafety.c adInfo;
        Bitmap bitmap;

        private DefaultOnPixelCopyFinishedListener(Bitmap bitmap, com.safedk.android.analytics.brandsafety.c adInfo, Activity activity) {
            this.bitmap = bitmap;
            this.adInfo = adInfo;
            this.activity = activity;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int copyResult) {
            if (copyResult == 0 && this.adInfo != null) {
                com.safedk.android.analytics.brandsafety.a a = SafeDK.getInstance().a(this.adInfo.p);
                if (a != null) {
                    Logger.d(ScreenshotHelper.a, "PC finished - Calling ", this.adInfo.p, " finder handleScreenshotCompleted");
                    a.a(this.bitmap, this.adInfo);
                    return;
                }
                return;
            }
            Logger.d(ScreenshotHelper.a, "PC finished NOT successfully. result= ", Integer.valueOf(copyResult));
        }
    }

    public static class ImprovedOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        private static int surfaceViewCount;
        private final com.safedk.android.analytics.brandsafety.c adInfo;
        private Bitmap bitmap;
        private final Object onPixelCopyFinishedLock;
        private final float scalingFactor;
        private final Bitmap topViewBitmap;
        private final View view;

        private ImprovedOnPixelCopyFinishedListener(Bitmap bitmap, com.safedk.android.analytics.brandsafety.c adInfo, View view, float scalingFactor, Bitmap topViewBitmap) {
            this.onPixelCopyFinishedLock = new Object();
            this.bitmap = bitmap;
            this.adInfo = adInfo;
            this.view = view;
            this.scalingFactor = scalingFactor;
            this.topViewBitmap = topViewBitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int copyResult) {
            if (this.adInfo == null || this.bitmap == null) {
                Logger.d(ScreenshotHelper.a, "PC finished successfully. adInfo: ", this.adInfo, ", bitmap: ", this.bitmap);
                return;
            }
            synchronized (this.onPixelCopyFinishedLock) {
                try {
                    com.safedk.android.analytics.brandsafety.a a = SafeDK.getInstance().a(this.adInfo.p);
                    if (a != null) {
                        if (copyResult == 0) {
                            if (this.topViewBitmap == null) {
                                surfaceViewCount = handleSurfaceViews(this.view, this.bitmap, this.adInfo);
                            } else {
                                surfaceViewCount--;
                                ScreenshotHelper.b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper.ImprovedOnPixelCopyFinishedListener.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ImprovedOnPixelCopyFinishedListener.this.combineSurfaceViewAndTopViewBitmaps();
                                    }
                                });
                            }
                            Logger.d(ScreenshotHelper.a, "PC finished successfully. surface view count: ", Integer.valueOf(surfaceViewCount), ", bitmap: ", Integer.valueOf(this.bitmap.getWidth()), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(this.bitmap.getHeight()));
                        } else {
                            surfaceViewCount--;
                            Logger.d(ScreenshotHelper.a, "PC finished NOT successfully. result= ", Integer.valueOf(copyResult), ", surface view count: ", Integer.valueOf(surfaceViewCount));
                        }
                        if (surfaceViewCount <= 0) {
                            surfaceViewCount = 0;
                            scaleBitmap();
                            Logger.d(ScreenshotHelper.a, "PC finished - Calling ", this.adInfo.p, " finder handleScreenshotCompleted");
                            a.a(this.bitmap, this.adInfo);
                        }
                    }
                } finally {
                }
            }
        }

        private int handleSurfaceViews(View topView, Bitmap topViewBitmap, com.safedk.android.analytics.brandsafety.c adInfo) {
            if (!(topView instanceof ViewGroup)) {
                return 0;
            }
            ViewGroup viewGroup = (ViewGroup) topView;
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof SurfaceView) {
                    Logger.d(ScreenshotHelper.a, "handle SV - found: ", childAt);
                    i++;
                    ScreenshotHelper.a(adInfo, (SurfaceView) childAt, this.scalingFactor, topViewBitmap);
                } else if (childAt instanceof ViewGroup) {
                    i += handleSurfaceViews(childAt, topViewBitmap, adInfo);
                }
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void combineSurfaceViewAndTopViewBitmaps() {
            Logger.d(ScreenshotHelper.a, "process screenshot, combine bitmap (", Integer.valueOf(this.bitmap.getWidth()), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(this.bitmap.getHeight()), ") with bitmap (", Integer.valueOf(this.topViewBitmap.getWidth()), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf(this.topViewBitmap.getHeight()), ")");
            Canvas canvas = new Canvas(this.topViewBitmap);
            int[] iArr = new int[2];
            this.view.getLocationInWindow(iArr);
            canvas.drawBitmap(this.bitmap, (Rect) null, new Rect(iArr[0], iArr[1], iArr[0] + this.view.getWidth(), iArr[1] + this.view.getHeight()), (Paint) null);
        }

        private void scaleBitmap() {
            Bitmap bitmap = this.topViewBitmap;
            if (bitmap == null) {
                bitmap = this.bitmap;
            }
            Pair<Bitmap, Float> a = ScreenshotHelper.a(bitmap.getWidth(), bitmap.getHeight(), this.scalingFactor);
            this.bitmap = (Bitmap) a.first;
            float floatValue = ((Float) a.second).floatValue();
            Canvas canvas = new Canvas(this.bitmap);
            float f = 1.0f / floatValue;
            canvas.scale(f, f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public static Bitmap a(View view, int i, com.safedk.android.analytics.brandsafety.c cVar) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(a, "Cannot save view to bitmap! view: ", view);
            return null;
        }
        Pair<Bitmap, Float> a2 = a(view, i);
        Bitmap bitmap = (Bitmap) a2.first;
        float floatValue = ((Float) a2.second).floatValue();
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            float f = 1.0f / floatValue;
            canvas.scale(f, f);
            try {
                view.draw(canvas);
            } catch (IllegalArgumentException e) {
                if (cVar != null) {
                    Logger.d(a, "take screenshot - could not draw bit map. ad has hardware rendered view: ", cVar);
                    cVar.d("image=no,husrd");
                    return null;
                }
            }
        }
        return bitmap;
    }

    public static Pair<Bitmap, Float> a(float f, float f2, float f3) {
        if (f3 > 0.0f) {
            f /= f3;
            f2 /= f3;
            Logger.d(a, "create bitmap for portrait view: (", Integer.valueOf((int) f), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf((int) f2), "), scale: ", Float.valueOf(f3));
        } else {
            Logger.d(a, "create bitmap: ", Integer.valueOf((int) f), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf((int) f2), ", scale: ", Float.valueOf(1.0f));
            f3 = 1.0f;
        }
        return new Pair<>(Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888), Float.valueOf(f3));
    }

    public static Pair<Bitmap, Float> a(float f, float f2, int i) {
        float f3 = 1.0f;
        if (i <= 0) {
            Logger.d(a, "create bitmap: ", Integer.valueOf((int) f), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf((int) f2), ", scale: ", Float.valueOf(1.0f));
        } else if (f > f2) {
            float f4 = i;
            if (f > f4) {
                f3 = f / f4;
                f2 = (f2 * f4) / f;
                f = f4;
            }
            Logger.d(a, "create bitmap for landscape view: (", Integer.valueOf((int) f), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf((int) f2), "), scale: ", Float.valueOf(f3));
        } else {
            float f5 = i;
            if (f2 > f5) {
                f3 = f2 / f5;
                f = (f * f5) / f2;
                f2 = f5;
            }
            Logger.d(a, "create bitmap for portrait view: (", Integer.valueOf((int) f), VastAttributes.HORIZONTAL_POSITION, Integer.valueOf((int) f2), "), scale: ", Float.valueOf(f3));
        }
        return new Pair<>(Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888), Float.valueOf(f3));
    }

    private static Pair<Bitmap, Float> a(View view, int i) {
        Logger.d(a, "create bitmap of view ", view);
        return a(view.getWidth(), view.getHeight(), i);
    }

    public static boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        if (Build.VERSION.SDK_INT < 26) {
            Logger.d(a, "canTakeScreenshotWithPixelCopy - OS API version too low: ", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (com.safedk.android.internal.b.getInstance().isInBackground()) {
            Logger.d(a, "canTakeScreenshotWithPixelCopy - app is in background, skipping");
            return false;
        }
        Activity a2 = o.a((com.safedk.android.analytics.brandsafety.o) cVar);
        if (a2 == null && CreativeInfoManager.a(cVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
            Logger.d(a, "canTakeScreenshotWithPixelCopy - ad not in an activity, skipping activity checks.");
        } else {
            if (a2 == null || a2.isFinishing() || a2.isDestroyed()) {
                Logger.d(a, "canTakeScreenshotWithPixelCopy - activity is null, finishing, or destroyed, skipping");
                return false;
            }
            View peekDecorView = a2.getWindow() != null ? a2.getWindow().peekDecorView() : null;
            if (peekDecorView == null || peekDecorView.getWindowToken() == null) {
                Logger.d(a, "canTakeScreenshotWithPixelCopy - window has no valid surface (decor view: ", peekDecorView, "), skipping");
                return false;
            }
            if (!peekDecorView.isAttachedToWindow() || peekDecorView.getWidth() <= 0 || peekDecorView.getHeight() <= 0) {
                Logger.d(a, "canTakeScreenshotWithPixelCopy - decor view not attached or has no size (attached: ", Boolean.valueOf(peekDecorView.isAttachedToWindow()), ", width: ", Integer.valueOf(peekDecorView.getWidth()), ", height: ", Integer.valueOf(peekDecorView.getHeight()), "), skipping");
                return false;
            }
            if ((peekDecorView instanceof ViewGroup) && !a((ViewGroup) peekDecorView)) {
                Logger.d(a, "canTakeScreenshotWithPixelCopy - decor view has no child views, skipping");
                return false;
            }
            if (!a(peekDecorView)) {
                Logger.d(a, "canTakeScreenshotWithPixelCopy - window surface is not valid, skipping");
                return false;
            }
        }
        return true;
    }

    private static boolean a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(View view) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(view, new Object[0]);
            if (invoke == null) {
                Logger.d(a, "isWindowSurfaceValid - ViewRootImpl is null");
                return false;
            }
            Field declaredField = invoke.getClass().getDeclaredField("mSurface");
            declaredField.setAccessible(true);
            Surface surface = (Surface) declaredField.get(invoke);
            if (surface != null && surface.isValid()) {
                return true;
            }
            Logger.d(a, "isWindowSurfaceValid - surface is null or invalid");
            return false;
        } catch (Throwable th) {
            Logger.d(a, "isWindowSurfaceValid - reflection failed: ", th.getMessage());
            return true;
        }
    }

    public static void a(Activity activity, com.safedk.android.analytics.brandsafety.c cVar, View view, float f) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(a, "Cannot save view to bitmap! view: ", view);
            return;
        }
        try {
            boolean z = CreativeInfoManager.a(cVar.c(), AdNetworkConfiguration.SHOULD_CAPTURE_SURFACE_VIEW_WHEN_USING_PIXELCOPY, false) && SafeDK.getInstance().O();
            Bitmap bitmap = (Bitmap) a(view.getWidth(), view.getHeight(), z ? -1.0f : f).first;
            if (activity != null && bitmap != null) {
                PixelCopy.OnPixelCopyFinishedListener defaultOnPixelCopyFinishedListener = new DefaultOnPixelCopyFinishedListener(bitmap, cVar, activity);
                if (z) {
                    Logger.d(a, "take screenshot using PC - support improved capturing");
                    defaultOnPixelCopyFinishedListener = new ImprovedOnPixelCopyFinishedListener(bitmap, cVar, view, f, null);
                }
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                Object[] objArr = new Object[8];
                objArr[0] = "take screenshot using PC - window attributes : ";
                objArr[1] = activity.getWindow() != null ? activity.getWindow().getAttributes() : "";
                objArr[2] = ", Decor View : ";
                objArr[3] = activity.getWindow() != null ? activity.getWindow().getDecorView() : "";
                objArr[4] = ", rect : ";
                objArr[5] = rect;
                objArr[6] = ", bitmap : ";
                objArr[7] = Integer.valueOf(bitmap.getHeight());
                Logger.d(a, objArr);
                PixelCopy.request(activity.getWindow(), rect, bitmap, defaultOnPixelCopyFinishedListener, new Handler(Looper.getMainLooper()));
                return;
            }
            Logger.d(a, "take screenshot using PC - activity or bitmap is null, exiting");
        } catch (Throwable th) {
            Logger.d(a, "take screenshot using PC - throwable on request: ", th);
        }
    }

    public static void a(com.safedk.android.analytics.brandsafety.c cVar, SurfaceView surfaceView, float f, Bitmap bitmap) {
        if (surfaceView == null || surfaceView.getWidth() <= 0 || surfaceView.getHeight() <= 0) {
            Logger.d(a, "Cannot save view to bitmap! view: ", surfaceView);
            return;
        }
        try {
            Bitmap bitmap2 = (Bitmap) a(surfaceView, 0).first;
            if (bitmap2 != null) {
                if (a(cVar)) {
                    Logger.d(a, "take screenshot using PC - surface view : ", surfaceView, ", bitmap : ", Integer.valueOf(bitmap2.getHeight()));
                    PixelCopy.request(surfaceView, bitmap2, new ImprovedOnPixelCopyFinishedListener(bitmap2, cVar, surfaceView, f, bitmap), new Handler(Looper.getMainLooper()));
                } else {
                    Logger.d(a, "take screenshot using PC - cannot take screenshot, exiting");
                }
            }
        } catch (Throwable th) {
            Logger.d(a, "take screenshot using PC - throwable on PC request: ", th);
        }
    }
}
