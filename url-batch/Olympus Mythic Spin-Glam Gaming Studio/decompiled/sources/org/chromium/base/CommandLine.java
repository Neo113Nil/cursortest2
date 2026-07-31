package org.chromium.base;

import android.text.TextUtils;
import internal.org.chromium.build.NullUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CommandLine {
    private static final CommandLine sInstance = new CommandLine();
    private ArrayList mArgs;
    private volatile int mArgsBegin;
    private Map mSwitches;

    interface Natives {
        void appendSwitchWithValue(String str, String str2);

        String getSwitchValue(String str);

        boolean hasSwitch(String str);

        void init(List list);
    }

    public static boolean isInitialized() {
        return sInstance.mArgsBegin != 0;
    }

    public static boolean hasSwitchedToNative() {
        return sInstance.mArgs == null;
    }

    public static CommandLine getInstance() {
        return sInstance;
    }

    public static void init(String[] strArr) {
        sInstance.initInternal(strArr);
    }

    public synchronized void switchToNativeImpl() {
        if (hasSwitchedToNative()) {
            return;
        }
        CommandLineJni.get().init((List) NullUtil.assumeNonNull(this.mArgs));
        this.mArgs = null;
        this.mSwitches = null;
        Log.v("CommandLine", "Switched to native command-line", new Object[0]);
    }

    private synchronized void initInternal(String[] strArr) {
        String str;
        try {
            this.mArgs = new ArrayList();
            this.mSwitches = new HashMap();
            this.mArgsBegin = 1;
            if (strArr != null && strArr.length != 0 && (str = strArr[0]) != null) {
                this.mArgs.add(str);
                appendSwitchesInternalLocked(strArr, 1);
            }
            this.mArgs.add("");
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean hasSwitch(String str) {
        boolean containsKey;
        Map map = this.mSwitches;
        if (map == null) {
            return CommandLineJni.get().hasSwitch(str);
        }
        synchronized (this) {
            containsKey = map.containsKey(str);
        }
        return containsKey;
    }

    public String getSwitchValue(String str) {
        String str2;
        Map map = this.mSwitches;
        if (map == null) {
            str2 = CommandLineJni.get().getSwitchValue(str);
        } else {
            synchronized (this) {
                str2 = (String) map.get(str);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public synchronized void appendSwitchWithValue(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            Map map = this.mSwitches;
            if (map == null) {
                CommandLineJni.get().appendSwitchWithValue(str, str2);
                return;
            }
            map.put(str, str2);
            String str3 = "--" + str;
            if (!str2.isEmpty()) {
                str3 = str3 + "=" + str2;
            }
            NullUtil.assumeNonNull(this.mArgs);
            ArrayList arrayList = this.mArgs;
            int i = this.mArgsBegin;
            this.mArgsBegin = i + 1;
            arrayList.add(i, str3);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void appendSwitchesInternalLocked(String[] strArr, int i) {
        boolean z = true;
        for (String str : strArr) {
            if (i > 0) {
                i--;
            } else {
                if (str.equals("--")) {
                    z = false;
                }
                if (z && str.startsWith("--")) {
                    String[] split = str.split("=", 2);
                    appendSwitchWithValue(split[0].substring(2), split.length > 1 ? split[1] : null);
                } else {
                    this.mArgs.add(str);
                }
            }
        }
    }
}
