package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import internal.org.jni_zero.CalledByNative;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.chromium.base.metrics.RecordHistogram;

/* loaded from: classes5.dex */
public class BundleUtils {
    private static Boolean sHasSplits;
    private static final ArrayMap sCachedClassLoaders = new ArrayMap();
    private static final Map sInflationClassLoaders = Collections.synchronizedMap(new ArrayMap());

    @CalledByNative
    public static boolean hasAnyInstalledSplits() {
        String[] strArr;
        if (sHasSplits == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = ContextUtils.getApplicationContext().getApplicationInfo().splitNames;
                sHasSplits = Boolean.valueOf(strArr != null && strArr.length > 0);
            } else {
                sHasSplits = Boolean.FALSE;
            }
        }
        return sHasSplits.booleanValue();
    }

    private static String getSplitApkPath(String str) {
        String[] strArr;
        int binarySearch;
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static boolean isIsolatedSplitInstalled(String str) {
        return hasAnyInstalledSplits() && getSplitApkPath(str) != null;
    }

    public static Context createIsolatedSplitContext(String str) {
        Context createContextForSplit;
        if (!isIsolatedSplitInstalled(str)) {
            return ContextUtils.getApplicationContext();
        }
        try {
            StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
            try {
                createContextForSplit = ContextUtils.getApplicationContext().createContextForSplit(str);
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                cacheAndValidateSplitClassLoader(createContextForSplit, str);
                return createContextForSplit;
            } finally {
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static void cacheAndValidateSplitClassLoader(Context context, String str) {
        ClassLoader parent = context.getClassLoader().getParent();
        Context applicationContext = ContextUtils.getApplicationContext();
        boolean z = true;
        boolean z2 = (parent.equals(BundleUtils.class.getClassLoader()) || applicationContext == null || parent.equals(applicationContext.getClassLoader())) ? false : true;
        ArrayMap arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            if (z2) {
                try {
                    if (!arrayMap.containsKey(str)) {
                        arrayMap.put(str, new PathClassLoader(getSplitApkPath(str), applicationContext.getClassLoader()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ClassLoader classLoader = (ClassLoader) arrayMap.get(str);
            if (classLoader != null) {
                if (!classLoader.equals(context.getClassLoader())) {
                    replaceClassLoader(context, classLoader);
                }
            } else {
                arrayMap.put(str, context.getClassLoader());
            }
            z = z2;
        }
        RecordHistogram.recordBooleanHistogram("Android.IsolatedSplits.ClassLoaderReplaced." + str, z);
    }

    public static void replaceClassLoader(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            ClassLoader classLoader = ContextUtils.getApplicationContext().getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            String splitApkLibraryPath = getSplitApkLibraryPath(str, str2);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return splitApkLibraryPath;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ClassLoader getOrCreateSplitClassLoader(String str) {
        ClassLoader classLoader;
        if (!isIsolatedSplitInstalled(str)) {
            return BundleUtils.class.getClassLoader();
        }
        ArrayMap arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            classLoader = (ClassLoader) arrayMap.get(str);
        }
        if (classLoader == null) {
            createIsolatedSplitContext(str);
            synchronized (arrayMap) {
                classLoader = (ClassLoader) arrayMap.get(str);
            }
        }
        return classLoader;
    }

    private static String getSplitApkLibraryPath(String str, String str2) {
        String splitApkPath;
        if (Build.VERSION.SDK_INT < 26 || (splitApkPath = getSplitApkPath(str2)) == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
            return splitApkPath + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }
}
