package io.bidmachine.iab.utils;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ironsource.C4701ic;
import com.my.target.common.DisclaimerAlias;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.util.network.NetworkUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public class Utils {
    private static final Handler a = new Handler(Looper.getMainLooper());

    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Insets insets;
            int i;
            int i2;
            int i3;
            int i4;
            insets = windowInsets.getInsets(this.a);
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            view.setPadding(i, i2, i3, i4);
            return windowInsets;
        }
    }

    private static float a(float f, float f2) {
        return f / f2;
    }

    public static void applyWindowInsets(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            if (window != null) {
                applyWindowInsets(window.getDecorView());
            } else {
                applyWindowInsets(activity.findViewById(R.id.content));
            }
        }
    }

    public static void cancelOnUiThread(@NonNull Runnable runnable) {
        a.removeCallbacks(runnable);
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                CommonLog.e("Utils", th);
            }
        }
    }

    public static Float convertCssSizeToPx(@NonNull String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int dpToPx(@NonNull Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void flush(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th) {
                CommonLog.e("Utils", th);
            }
        }
    }

    public static int getScreenOrientation(@NonNull Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static boolean isLandscapeOrientation(@NonNull Context context) {
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(@NonNull Context context) {
        NetworkInfo activeNetworkInfo;
        CommonLog.d("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            CommonLog.d("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        CommonLog.d("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean isTablet(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d * d) + (d2 * d2)) >= 6.6d;
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    @Nullable
    public static Float max(@Nullable Float f, @Nullable Float f2) {
        return f == null ? f2 : f2 == null ? f : Float.valueOf(Math.max(f.floatValue(), f2.floatValue()));
    }

    @Nullable
    public static Float min(@Nullable Float f, @Nullable Float f2) {
        return f == null ? f2 : f2 == null ? f : Float.valueOf(Math.min(f.floatValue(), f2.floatValue()));
    }

    @NonNull
    public static MotionEvent obtainMotionEvent(int i, Point point) {
        return obtainMotionEvent(i, point.x, point.y);
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    public static int orientationBySize(int i, int i2) {
        return i > i2 ? 2 : 1;
    }

    public static String orientationToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : DisclaimerAlias.UNDEFINED;
    }

    public static int pixelsToIntDips(float f, float f2) {
        return (int) (a(f, f2) + 0.5f);
    }

    public static void postOnUiThread(@NonNull Runnable runnable) {
        a.post(runnable);
    }

    public static void removeFromParent(@Nullable View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void simpleTrackUrl(@Nullable String str) {
        simpleTrackUrl(str, Executors.newSingleThreadExecutor());
    }

    @NonNull
    public static String stringifyRect(@NonNull Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    @NonNull
    public static String stringifySize(@NonNull Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
        HttpURLConnection httpURLConnection;
        Exception e;
        HttpURLConnection httpURLConnection2 = null;
        try {
            CommonLog.d("Utils", "Connection to URL: %s", str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setRequestMethod(C4701ic.a);
                    String userAgent = Rendering.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty("User-Agent", userAgent);
                    }
                    CommonLog.d("Utils", "Response code: %d, for URL: %s", Integer.valueOf(BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection)), str);
                } catch (Exception e2) {
                    e = e2;
                    CommonLog.e("Utils", "%s: %s: %s", str, e.getMessage(), e.toString());
                    NetworkUtils.disconnectSafely(httpURLConnection);
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                NetworkUtils.disconnectSafely(httpURLConnection2);
                throw th;
            }
        } catch (Exception e3) {
            httpURLConnection = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            NetworkUtils.disconnectSafely(httpURLConnection2);
            throw th;
        }
        NetworkUtils.disconnectSafely(httpURLConnection);
    }

    @NonNull
    public static MotionEvent obtainMotionEvent(int i, int i2, int i3) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i, i2, i3, 0);
    }

    public static void simpleTrackUrl(@Nullable final String str, @NonNull Executor executor) {
        if (TextUtils.isEmpty(str)) {
            CommonLog.d("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: io.bidmachine.iab.utils.Utils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Utils.a(str);
                }
            });
        } catch (Exception e) {
            CommonLog.e("Utils", e);
        }
    }

    public static void onUiThread(@NonNull Runnable runnable, long j) {
        a.postDelayed(runnable, j);
    }

    @RequiresApi
    public static void applyWindowInsets(@NonNull View view) {
        int systemBars;
        int displayCutout;
        systemBars = WindowInsets.Type.systemBars();
        displayCutout = WindowInsets.Type.displayCutout();
        applyWindowInsets(view, systemBars | displayCutout);
    }

    @RequiresApi
    public static void applyWindowInsets(@NonNull View view, int i) {
        view.setOnApplyWindowInsetsListener(new a(i));
        view.requestApplyInsets();
    }
}
