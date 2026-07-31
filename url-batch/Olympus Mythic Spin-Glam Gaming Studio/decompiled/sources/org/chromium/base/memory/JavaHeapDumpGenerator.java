package org.chromium.base.memory;

import android.os.Debug;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import org.chromium.base.Log;

/* loaded from: classes.dex */
public final class JavaHeapDumpGenerator {
    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            Log.i("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e.getMessage());
            return false;
        }
    }
}
