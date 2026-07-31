package net.pubnative.lite.sdk.vpaid.helpers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes3.dex */
public class FileLockManager {
    private static final String TAG = "FileLockManager";
    private static FileLockManager sInstance;
    private final Map<String, Integer> mFileReferences = new ConcurrentHashMap();

    private FileLockManager() {
    }

    public static synchronized FileLockManager getInstance() {
        FileLockManager fileLockManager;
        synchronized (FileLockManager.class) {
            try {
                if (sInstance == null) {
                    sInstance = new FileLockManager();
                }
                fileLockManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLockManager;
    }

    public synchronized void acquire(String str) {
        if (str == null) {
            return;
        }
        Integer num = this.mFileReferences.get(str);
        int intValue = (num == null ? 0 : num.intValue()) + 1;
        this.mFileReferences.put(str, Integer.valueOf(intValue));
        Logger.d(TAG, "File locked: " + str + " (refCount=" + intValue + ")");
    }

    public synchronized void forceRelease(String str) {
        if (str != null) {
            Integer num = this.mFileReferences.get(str);
            if (num != null && num.intValue() > 0) {
                this.mFileReferences.remove(str);
                Logger.w(TAG, "Force released lock on expired file: " + str + " (was refCount=" + num + ")");
            }
        }
    }

    public synchronized boolean isLocked(String str) {
        if (str == null) {
            return false;
        }
        Integer num = this.mFileReferences.get(str);
        if (num != null) {
            if (num.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    public synchronized void release(String str) {
        if (str == null) {
            return;
        }
        Integer num = this.mFileReferences.get(str);
        if (num != null && num.intValue() > 0) {
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.mFileReferences.remove(str);
                Logger.d(TAG, "File unlocked: " + str);
                return;
            }
            this.mFileReferences.put(str, Integer.valueOf(intValue));
            Logger.d(TAG, "File reference released: " + str + " (refCount=" + intValue + ")");
            return;
        }
        Logger.w(TAG, "Attempted to release unlocked file: " + str);
    }
}
