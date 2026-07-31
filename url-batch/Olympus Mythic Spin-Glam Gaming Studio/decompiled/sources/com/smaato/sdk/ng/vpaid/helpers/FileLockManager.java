package com.smaato.sdk.ng.vpaid.helpers;

import com.smaato.sdk.ng.utils.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class FileLockManager {
    private static final String b = "FileLockManager";
    private static FileLockManager c;
    private final Map<String, Integer> a = new ConcurrentHashMap();

    private FileLockManager() {
    }

    public static synchronized FileLockManager getInstance() {
        FileLockManager fileLockManager;
        synchronized (FileLockManager.class) {
            try {
                if (c == null) {
                    c = new FileLockManager();
                }
                fileLockManager = c;
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
        Integer num = this.a.get(str);
        int intValue = (num == null ? 0 : num.intValue()) + 1;
        this.a.put(str, Integer.valueOf(intValue));
        Logger.d(b, "File locked: " + str + " (refCount=" + intValue + ")");
    }

    public synchronized void forceRelease(String str) {
        if (str != null) {
            Integer num = this.a.get(str);
            if (num != null && num.intValue() > 0) {
                this.a.remove(str);
                Logger.w(b, "Force released lock on expired file: " + str + " (was refCount=" + num + ")");
            }
        }
    }

    public synchronized boolean isLocked(String str) {
        if (str == null) {
            return false;
        }
        Integer num = this.a.get(str);
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
        Integer num = this.a.get(str);
        if (num != null && num.intValue() > 0) {
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.a.remove(str);
                Logger.d(b, "File unlocked: " + str);
                return;
            }
            this.a.put(str, Integer.valueOf(intValue));
            Logger.d(b, "File reference released: " + str + " (refCount=" + intValue + ")");
            return;
        }
        Logger.w(b, "Attempted to release unlocked file: " + str);
    }
}
