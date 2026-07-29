package o;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class C3 extends Handler {
    public static final C3 a = new C3();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        AbstractC0048Bt.n(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = B3.a;
        String loggerName = logRecord.getLoggerName();
        AbstractC0048Bt.m(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC0048Bt.m(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) B3.b.get(loggerName);
        if (str == null) {
            str = UT.S(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int H = UT.H(message, '\n', i2, 4);
                if (H == -1) {
                    H = length;
                }
                while (true) {
                    min = Math.min(H, i2 + 4000);
                    String substring = message.substring(i2, min);
                    AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= H) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
