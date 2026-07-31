package io.bidmachine.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Size;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4701ic;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.SimpleContextProvider;
import io.bidmachine.UserAgentManager;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ThrowableRunnable;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Utils {

    @NonNull
    private static final Handler BACKGROUND_HANDLER;

    @NonNull
    private static final LazyCachedValue<Integer> CURRENT_YEAR;
    private static String appName;
    private static String appVersion;

    @NonNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    @NonNull
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    @NonNull
    private static final char[] UPPER_HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        BACKGROUND_HANDLER = new Handler(handlerThread.getLooper());
        CURRENT_YEAR = new LazyCachedValue<>(new LazyValue() { // from class: io.bidmachine.core.Utils$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                Integer lambda$static$0;
                lambda$static$0 = Utils.lambda$static$0();
                return lambda$static$0;
            }
        });
    }

    public static boolean canAddWindowToActivity(@Nullable Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    public static boolean canUseExternalFilesDir() {
        return isExternalMemoryAvailable();
    }

    public static void cancelBackgroundThreadTask(@NonNull Runnable runnable) {
        BACKGROUND_HANDLER.removeCallbacks(runnable);
    }

    public static void cancelUiThreadTask(@NonNull Runnable runnable) {
        UI_HANDLER.removeCallbacks(runnable);
    }

    @NonNull
    public static String capitalize(@NonNull String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @NonNull
    public static String checkIfEmpty(@Nullable String str, @NonNull String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Logger.w(e);
            }
        }
    }

    @Nullable
    public static Float convertToFloatOrDefault(@Nullable Object obj, @Nullable Float f) {
        return obj == null ? f : obj instanceof Number ? Float.valueOf(((Number) obj).floatValue()) : parseFloatOrDefault(obj.toString(), f);
    }

    @Nullable
    public static Integer convertToIntOrDefault(@Nullable Object obj, @Nullable Integer num) {
        return obj == null ? num : obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : parseIntOrDefault(obj.toString(), num);
    }

    @NonNull
    public static Context findDialogContext(@NonNull Context context) {
        return findDialogContext(context, null);
    }

    public static void flush(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e) {
                Logger.w(e);
            }
        }
    }

    @NonNull
    public static String generateFileName(@NonNull String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    @NonNull
    public static String generateTag(@NonNull String str, @NonNull Object obj) {
        return str + " @" + Integer.toHexString(obj.hashCode());
    }

    @Nullable
    @RequiresApi
    public static NetworkCapabilities getActiveNetworkCapabilities(@NonNull Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th) {
            Logger.w(th);
            return null;
        }
    }

    @Nullable
    public static NetworkInfo getActiveNetworkInfo(@NonNull Context context) {
        try {
            ConnectivityManager connectivityManager = getConnectivityManager(context);
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            Logger.w(th);
            return null;
        }
    }

    public static String getAppName(@NonNull Context context) {
        if (appName == null) {
            appName = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return appName;
    }

    @Nullable
    public static String getAppVersion(@NonNull Context context) {
        if (appVersion == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    appVersion = str;
                }
            } catch (Exception e) {
                Logger.w(e);
            }
        }
        return appVersion;
    }

    @Nullable
    public static Location getBestLocation(@NonNull Context context, @Nullable Location location, @Nullable Location location2) {
        Location location3 = (Location) oneOf(location, location2);
        Location location4 = io.bidmachine.util.Utils.getLocation(context);
        return location4 != null ? (location3 == null || location4.getTime() >= location3.getTime()) ? location4 : location3 : location3;
    }

    @Nullable
    public static File getCacheDir(@NonNull Context context, @NonNull String str) {
        File file = new File(context.getCacheDir(), str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static ConnectivityManager getConnectivityManager(@NonNull Context context) {
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.core.Utils$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$getConnectivityManager$1;
                    lambda$getConnectivityManager$1 = Utils.lambda$getConnectivityManager$1();
                    return lambda$getConnectivityManager$1;
                }
            });
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            Logger.w(th);
            return null;
        }
    }

    @Nullable
    public static File getExternalFilesDir(@NonNull Context context) {
        return context.getExternalFilesDir(null);
    }

    @Nullable
    public static File getExternalFilesDirDirty(@NonNull Context context) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            Logger.w(e);
            return null;
        }
    }

    public static float getOrDefault(float f, float f2, float f3) {
        return f == f2 ? f3 : f;
    }

    public static long getOrDefault(long j, long j2, long j3) {
        return j == j2 ? j3 : j;
    }

    public static float getScreenDensity(@NonNull Context context) {
        return DeviceUtils.getDisplayMetrics(context).density;
    }

    @NonNull
    public static Size getScreenSize(@NonNull Context context) {
        DisplayMetrics displayMetrics = DeviceUtils.getDisplayMetrics(context);
        return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    @NonNull
    public static Rect getViewRectangle(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static void ifNotEmpty(@Nullable String str, @NonNull Executable<String> executable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executable.execute(str);
    }

    public static <T> void ifNotNull(@Nullable T t, @NonNull Executable<T> executable) {
        if (t != null) {
            executable.execute(t);
        }
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        return invokeMethodByName(obj, obj.getClass(), str, pairArr);
    }

    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isHttpUrl(@NonNull String str) {
        return str.startsWith(d.v) || str.startsWith(d.u);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isPermissionGranted(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isUrlValid(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isViewTransparent(@NonNull View view) {
        return view.getAlpha() == 0.0f;
    }

    public static boolean isYearValid(int i) {
        return i >= 1900 && i <= CURRENT_YEAR.get().intValue();
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list) {
        return join(list, ", ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getConnectivityManager$1() {
        return String.format("Manifest permission not found: %s. Check the integration.", "android.permission.ACCESS_NETWORK_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$simpleTrackUrl$2(String str) {
        Throwable th;
        ?? r3;
        Exception e;
        HttpURLConnection httpURLConnection;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setRequestMethod(C4701ic.a);
                    String userAgent = UserAgentManager.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty("User-Agent", userAgent);
                    }
                    BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    try {
                        close(BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                    } catch (Exception e2) {
                        Logger.w(e2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    Logger.w(e);
                    if (httpURLConnection != null) {
                        try {
                            close(BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                        } catch (Exception e4) {
                            Logger.w(e4);
                        }
                    }
                    NetworkUtils.disconnectSafely(httpURLConnection);
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = str;
                if (r3 != 0) {
                    try {
                        close(BidMachineNetworkBridge.urlConnectionGetInputStream(r3));
                    } catch (Exception e5) {
                        Logger.w(e5);
                    }
                }
                NetworkUtils.disconnectSafely(r3);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            r3 = 0;
            if (r3 != 0) {
            }
            NetworkUtils.disconnectSafely(r3);
            throw th;
        }
        NetworkUtils.disconnectSafely(httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0() {
        return Integer.valueOf(safeCalendarGetInstance().get(1));
    }

    public static void onBackgroundThread(@NonNull Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = BACKGROUND_HANDLER;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        if (isUiThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t, @Nullable T t2, @Nullable T t3) {
        return t != null ? t : t2 != null ? t2 : t3;
    }

    @Nullable
    public static Float parseFloatOrDefault(@Nullable String str, @Nullable Float f) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    @Nullable
    @SuppressLint({"RtlHardcoded"})
    public static Integer parseHorizontalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    public static int parseIntOrDefault(@Nullable String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Nullable
    public static Integer parseVerticalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void putAll(@Nullable Map<K, V> map, @Nullable Map<K, V> map2) {
        if (map == null || map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    @Nullable
    public static String readFile(@NonNull File file) {
        try {
            return streamToString(new FileInputStream(file));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static File retrieveAndSaveFrame(@NonNull Context context, @NonNull Uri uri, @NonNull String str) {
        Bitmap frameAtTime;
        Throwable th;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        FileOutputStream fileOutputStream2 = null;
        if (extractMetadata != null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(extractMetadata), 2)) != null) {
            try {
                File file = new File(getCacheDir(context, str), generateFileName(uri.toString()));
                fileOutputStream = BidMachineFilesBridge.fileOutputStreamCtor(file);
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    flush(fileOutputStream);
                    close(fileOutputStream);
                    return file;
                } catch (Exception e) {
                    e = e;
                    try {
                        Logger.w(e);
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        fileOutputStream = fileOutputStream2;
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    flush(fileOutputStream);
                    close(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
                flush(fileOutputStream);
                close(fileOutputStream);
                throw th;
            }
        }
        return null;
    }

    public static void runCatching(@NonNull ThrowableRunnable throwableRunnable) {
        try {
            throwableRunnable.run();
        } catch (Throwable unused) {
        }
    }

    @NonNull
    private static Calendar safeCalendarGetInstance() {
        try {
            try {
                return Calendar.getInstance();
            } catch (Throwable unused) {
                return Calendar.getInstance(Locale.US);
            }
        } catch (Throwable unused2) {
            return Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static void simpleTrackUrl(@Nullable final String str, @Nullable Executor executor) {
        if (TextUtils.isEmpty(str) || executor == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: io.bidmachine.core.Utils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Utils.lambda$simpleTrackUrl$2(str);
                }
            });
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void sort(@NonNull CopyOnWriteArrayList<T> copyOnWriteArrayList, @Nullable Comparator<? super T> comparator) {
        Object[] array = copyOnWriteArrayList.toArray();
        Arrays.sort(array, comparator);
        for (int i = 0; i < array.length; i++) {
            copyOnWriteArrayList.set(i, array[i]);
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    @Nullable
    public static String streamToString(@NonNull InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    flush(byteArrayOutputStream);
                    close(byteArrayOutputStream);
                    close(inputStream);
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable unused2) {
            flush(byteArrayOutputStream);
            close(byteArrayOutputStream);
            close(inputStream);
            return null;
        }
    }

    @Nullable
    public static String toHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static Map<String, String> toMap(@NonNull JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                hashMap.put(next, opt.toString());
            }
        }
        return hashMap;
    }

    @Nullable
    public static String toSignatureHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr2 = UPPER_HEX_ARRAY;
            cArr[i] = cArr2[i3 >>> 4];
            int i4 = i + 2;
            cArr[i + 1] = cArr2[b & 15];
            if (i2 < bArr.length - 1) {
                i += 3;
                cArr[i4] = ':';
            } else {
                i = i4;
            }
        }
        return new String(cArr);
    }

    @VisibleForTesting
    static boolean writePermissionGranted(@NonNull Context context) {
        return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean canUseCleartextTraffic() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @NonNull
    public static Context findDialogContext(@NonNull Context context, @Nullable View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View findContentOrRootView = ViewUtils.findContentOrRootView(view);
        return findContentOrRootView != null ? findContentOrRootView.getContext() : view.getContext();
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @Nullable Class<?> cls, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        Class<?>[] clsArr;
        Object[] objArr;
        if (pairArr != null) {
            clsArr = new Class[pairArr.length];
            objArr = new Object[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                clsArr[i] = (Class) pairArr[i].first;
                objArr[i] = pairArr[i].second;
            }
        } else {
            clsArr = null;
            objArr = null;
        }
        for (int i2 = 10; i2 > 0 && cls != null; i2--) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            } catch (NoSuchMethodException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static boolean isEmpty(@Nullable Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence) {
        return join(list, charSequence, new Function() { // from class: io.bidmachine.core.Utils$$ExternalSyntheticLambda1
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t, @Nullable T t2) {
        return (T) oneOf(t, t2, null);
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence, @NonNull Function<T, String> function) {
        String apply;
        if (isEmpty(list)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(list.size());
            for (T t : list) {
                if (t != null && (apply = function.apply(t)) != null) {
                    if (sb.length() > 0) {
                        sb.append(charSequence);
                    }
                    sb.append(apply);
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Integer parseIntOrDefault(@Nullable String str, @Nullable Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static void onBackgroundThread(@NonNull Runnable runnable, long j) {
        BACKGROUND_HANDLER.postDelayed(runnable, j);
    }

    public static void onUiThread(@NonNull Runnable runnable, long j) {
        UI_HANDLER.postDelayed(runnable, j);
    }
}
