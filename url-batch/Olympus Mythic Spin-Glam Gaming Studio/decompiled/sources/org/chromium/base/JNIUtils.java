package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes3.dex */
public class JNIUtils {
    private static final JniClassLoader sJniClassLoader = new JniClassLoader();

    @CalledByNative
    private static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            boolean isIsolatedSplitInstalled = BundleUtils.isIsolatedSplitInstalled(str);
            Log.i("JNIUtils", "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(isIsolatedSplitInstalled));
            if (isIsolatedSplitInstalled) {
                return BundleUtils.getOrCreateSplitClassLoader(str);
            }
        }
        return sJniClassLoader;
    }

    private static class JniClassLoader extends ClassLoader {
        ClassLoader mDelegate;

        JniClassLoader() {
            super(JNIUtils.class.getClassLoader());
        }

        @Override // java.lang.ClassLoader
        public Class findClass(String str) {
            ClassLoader classLoader = this.mDelegate;
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return super.findClass(str);
        }
    }
}
