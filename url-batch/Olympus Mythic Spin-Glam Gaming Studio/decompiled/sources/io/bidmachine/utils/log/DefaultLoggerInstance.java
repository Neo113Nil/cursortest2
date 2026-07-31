package io.bidmachine.utils.log;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes14.dex */
public class DefaultLoggerInstance implements LoggerInstance {
    private static final int MAX_CHAR_COUNT = 1000;

    @NonNull
    private final String tag;

    public DefaultLoggerInstance(@NonNull String str) {
        this.tag = str;
    }

    @NonNull
    private static String buildStackTraceString(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @NonNull
    protected String buildMessage(@Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(X3.j.d);
            sb.append(obj);
            sb.append("] ");
        }
        if (str != null) {
            sb.append(str);
        } else if (lazyValue != null) {
            sb.append(lazyValue.get());
        }
        if (th != null) {
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(buildStackTraceString(th));
        }
        return sb.toString();
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(3, obj, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(6, obj, str, null, null);
    }

    protected boolean isLoggable(int i) {
        return true;
    }

    protected void log(int i, @NonNull String str) {
        if (str.length() <= 1000) {
            printLog(i, this.tag, str);
            return;
        }
        int length = (str.length() + 999) / 1000;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1000;
            printLog(i, this.tag, str.substring(i3, Math.min(str.length(), i4)));
            i2++;
            i3 = i4;
        }
    }

    protected void prepareAndLog(int i, @Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th) {
        if (isLoggable(i)) {
            log(i, buildMessage(obj, str, lazyValue, th));
        }
    }

    protected void printLog(int i, @NonNull String str, @NonNull String str2) {
        Log.println(i, str, str2);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(5, obj, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull String str) {
        prepareAndLog(3, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull String str) {
        prepareAndLog(6, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull String str) {
        prepareAndLog(5, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Throwable th) {
        prepareAndLog(6, null, null, null, th);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Object obj, @NonNull Throwable th) {
        prepareAndLog(5, obj, null, null, th);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Object obj, @NonNull Throwable th) {
        prepareAndLog(6, obj, null, null, th);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Throwable th) {
        prepareAndLog(5, null, null, null, th);
    }
}
