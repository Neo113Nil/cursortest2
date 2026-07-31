package io.bidmachine.iab.utils;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Deprecated(since = "3.6.0")
/* loaded from: classes15.dex */
public class Logger {
    private static LogLevel c = LogLevel.error;
    private final String a;
    private final List b = new CopyOnWriteArrayList();

    @Deprecated(since = "3.6.0")
    public enum LogLevel {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);

        private final int a;

        LogLevel(int i) {
            this.a = i;
        }

        public static LogLevel fromLogLevel(int i) {
            return i != 3 ? i != 4 ? i != 5 ? i != 6 ? none : error : warning : info : debug;
        }

        public static int toLogLevel(LogLevel logLevel) {
            int i = a.a[logLevel.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 6;
            }
            if (i != 3) {
                return i != 4 ? Integer.MAX_VALUE : 4;
            }
            return 5;
        }

        public int getValue() {
            return this.a;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            a = iArr;
            try {
                iArr[LogLevel.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LogLevel.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LogLevel.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LogLevel.info.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Logger(@NonNull String str) {
        this.a = str;
    }

    private void a(LogLevel logLevel, String str) {
        int i = a.a[logLevel.ordinal()];
        if (i == 1) {
            Log.d(this.a, str);
        } else if (i == 2) {
            Log.e(this.a, str);
        } else {
            if (i != 3) {
                return;
            }
            Log.w(this.a, str);
        }
    }

    private void b(LogLevel logLevel, String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((LogListener) it.next()).onLog(logLevel, this.a, str);
        }
    }

    public void addLogListener(@Nullable LogListener logListener) {
        if (logListener != null) {
            this.b.add(logListener);
        }
    }

    public boolean canSendDLog() {
        return a(LogLevel.debug);
    }

    public boolean canSendELog() {
        return a(LogLevel.error);
    }

    public boolean canSendWLog() {
        return a(LogLevel.warning);
    }

    public void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.debug, str, str2, objArr);
    }

    public void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.error, str, str2, objArr);
    }

    @Nullable
    public LogLevel getLoggingLevel() {
        return c;
    }

    public boolean removeLogListener(@Nullable LogListener logListener) {
        return logListener != null && this.b.remove(logListener);
    }

    public void setLoggingLevel(@Nullable LogLevel logLevel) {
        Log.d(this.a, String.format("Changing logging level. From: %s, To: %s", c, logLevel));
        c = logLevel;
    }

    public void w(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.warning, str, str2, objArr);
    }

    public void e(@NonNull String str, @NonNull Throwable th) {
        a(LogLevel.error, str, th.toString(), new Object[0]);
    }

    private boolean b(LogLevel logLevel) {
        LogLevel logLevel2 = c;
        return logLevel2 != null && logLevel2.getValue() <= logLevel.getValue();
    }

    private void a(LogLevel logLevel, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean b = b(logLevel);
        boolean a2 = a();
        if (b || a2) {
            String a3 = a(str, str2, objArr);
            if (b) {
                a(logLevel, a3);
            }
            if (a2) {
                b(logLevel, a3);
            }
        }
    }

    private boolean a(LogLevel logLevel) {
        return b(logLevel) || a();
    }

    private boolean a() {
        return !this.b.isEmpty();
    }

    private static String a(String str, String str2, Object... objArr) {
        String a2 = a(str, str2);
        if (objArr == null || objArr.length == 0) {
            return a2;
        }
        try {
            return String.format(a2, objArr);
        } catch (Throwable unused) {
            return a2;
        }
    }

    private static String a(String str, String str2) {
        return String.format("[%s] %s", str, str2);
    }
}
