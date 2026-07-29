package o;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: o.nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1585nn implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C1717pn b;

    public CallableC1585nn(C1717pn c1717pn, Context context) {
        this.b = c1717pn;
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1717pn c1717pn = this.b;
        Context context = this.a;
        AbstractC1568nW.c("FlutterLoader initTask");
        int i = 0;
        try {
            try {
                FlutterJNI flutterJNI = c1717pn.e;
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                c1717pn.f.execute(new D1(9, this));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(context.getDataDir().getPath(), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                C1651on c1651on = new C1651on(path, path2);
                Trace.endSection();
                return c1651on;
            } catch (UnsatisfiedLinkError e) {
                if (!e.toString().contains("couldn't find \"libflutter.so\"") && !e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) c1717pn.d.e);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = strArr[i2];
                    StringBuilder sb = new StringBuilder();
                    sb.append("!");
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("lib");
                    sb.append(str2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                    ArrayList arrayList2 = new ArrayList();
                    if (strArr2 != null) {
                        int length2 = strArr2.length;
                        for (int i3 = i; i3 < length2; i3++) {
                            arrayList2.add(strArr2[i3] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i2++;
                    i = 0;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb3.append(property);
                sb3.append(", and the native libraries directory (with path ");
                sb3.append(file.getAbsolutePath());
                sb3.append(") ");
                sb3.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                sb3.append(".");
                throw new UnsupportedOperationException(sb3.toString(), e);
            }
        } finally {
        }
    }
}
