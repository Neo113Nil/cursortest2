package io.bidmachine.util.log;

import android.util.Log;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultLoggerInstance.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0004J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0012\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J \u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0004J8\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0004J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0004J \u0010\u001c\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/bidmachine/util/log/DefaultLoggerInstance;", "Lio/bidmachine/util/log/LoggerInstance;", "tag", "", "(Ljava/lang/String;)V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "buildMessage", "subTag", "", "messageBuilder", "Lkotlin/Function0;", "throwable", "", "buildStackTraceString", "d", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "isLoggable", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", CreativeInfo.f, "message", "prepareAndLog", "printLog", "w", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class DefaultLoggerInstance implements LoggerInstance {
    private static final int MAX_CHAR_PER_LINE_COUNT = 1000;
    private boolean isEnabled;

    @NotNull
    private final String tag;

    public DefaultLoggerInstance(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.isEnabled = true;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void d(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        prepareAndLog$default(this, 3, subTag, messageBuilder, null, 8, null);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        prepareAndLog$default(this, 5, subTag, messageBuilder, null, 8, null);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        prepareAndLog$default(this, 5, subTag, null, throwable, 4, null);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        prepareAndLog$default(this, 6, subTag, messageBuilder, null, 8, null);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        prepareAndLog$default(this, 6, subTag, null, throwable, 4, null);
    }

    public boolean isLoggable(int priority) {
        return this.isEnabled;
    }

    public static /* synthetic */ void prepareAndLog$default(DefaultLoggerInstance defaultLoggerInstance, int i, Object obj, Function0 function0, Throwable th, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndLog");
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        defaultLoggerInstance.prepareAndLog(i, obj, function0, th);
    }

    protected final void prepareAndLog(int priority, @Nullable Object subTag, @Nullable Function0 messageBuilder, @Nullable Throwable throwable) {
        if (isLoggable(priority)) {
            log(priority, buildMessage(subTag, messageBuilder, throwable));
        }
    }

    protected final void log(int priority, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() > 1000) {
            int length = (message.length() + 999) / 1000;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = this.tag;
                int i3 = i2 + 1000;
                String substring = message.substring(i2, Math.min(message.length(), i3));
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                printLog(priority, str, substring);
                i++;
                i2 = i3;
            }
            return;
        }
        printLog(priority, this.tag, message);
    }

    protected final void printLog(int priority, @NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.println(priority, tag, message);
    }

    @NotNull
    protected final String buildMessage(@Nullable Object subTag, @Nullable Function0 messageBuilder, @Nullable Throwable throwable) {
        StringBuilder sb = new StringBuilder();
        if (subTag != null) {
            sb.append('[' + subTag + "] ");
        }
        if (messageBuilder != null) {
            sb.append((String) messageBuilder.mo4828invoke());
        }
        if (throwable != null) {
            if (!StringsKt.isBlank(sb)) {
                sb.append("\n");
            }
            sb.append(buildStackTraceString(throwable));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    private final String buildStackTraceString(Throwable throwable) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        throwable.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
