package o;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: o.pn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717pn {
    public boolean a;
    public C0218Ih b;
    public long c;
    public C0785bb d;
    public FlutterJNI e;
    public ExecutorService f;
    public Future g;

    public static String b(Context context, String str) {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File file = new File(str.substring(26));
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return "--aot-shared-library-name=".concat(canonicalPath);
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public final void a(Context context, String[] strArr) {
        if (this.a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC1568nW.c("FlutterLoader#ensureInitializationComplete");
            try {
                C1651on c1651on = (C1651on) this.g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.d.e) + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String b = b(context, str);
                            if (b != null) {
                                str = b;
                            } else {
                                Log.w("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        }
                        arrayList.add(str);
                    }
                }
                arrayList.add("--aot-shared-library-name=" + ((String) this.d.b));
                arrayList.add("--aot-shared-library-name=" + ((String) this.d.e) + File.separator + ((String) this.d.b));
                StringBuilder sb = new StringBuilder();
                sb.append("--cache-dir-path=");
                sb.append(c1651on.b);
                arrayList.add(sb.toString());
                Object obj = this.d.d;
                arrayList.add("--domain-network-policy=" + ((String) this.d.d));
                this.b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                this.e.init(context, (String[]) arrayList.toArray(new String[0]), null, c1651on.a, c1651on.b, SystemClock.uptimeMillis() - this.c, Build.VERSION.SDK_INT);
                this.a = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    public final void c(Context context) {
        C0218Ih c0218Ih = new C0218Ih(5);
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC1568nW.c("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.b = c0218Ih;
            this.c = SystemClock.uptimeMillis();
            this.d = AbstractC2201x6.a(applicationContext);
            QL b = QL.b((DisplayManager) applicationContext.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION), this.e);
            ((FlutterJNI) b.b).setAsyncWaitForVsyncDelegate((C1818rJ) b.d);
            this.g = this.f.submit(new CallableC1585nn(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
