package com.pubmatic.sdk.crashanalytics;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0007\u0010\u0011J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0007\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBANRReader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()V", "Landroid/app/ApplicationExitInfo;", "applicationExitInfo", "", "timeStamp", "(Landroid/app/ApplicationExitInfo;J)V", "Ljava/io/InputStream;", "inputStream", "", "(Ljava/io/InputStream;)Ljava/lang/String;", "data", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()J", "(J)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "tag", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "crashanalytics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@WorkerThread
/* loaded from: classes13.dex */
public final class POBANRReader {

    /* renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    private final String tag;

    /* renamed from: c, reason: from kotlin metadata */
    private final JSONArray jsonArray;

    public POBANRReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.tag = "POBANRReader";
        this.jsonArray = new JSONArray();
        if (Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            POBLog.debug("POBANRReader", "Cannot read ANRs as current OS version is below Android 11.", new Object[0]);
        }
    }

    private final void a() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        long b = b();
        try {
            Object systemService = this.context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(this.context.getPackageName(), 0, 10);
            Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "activityManager.getHisto…ntext.packageName, 0, 10)");
            Iterator it = historicalProcessExitReasons.iterator();
            long j = 0;
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfo = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(it.next());
                reason = applicationExitInfo.getReason();
                if (reason == 6) {
                    timestamp = applicationExitInfo.getTimestamp();
                    if (j == 0) {
                        j = timestamp;
                    }
                    if (b == 0) {
                        Intrinsics.checkNotNullExpressionValue(applicationExitInfo, "applicationExitInfo");
                        a(applicationExitInfo, timestamp);
                    } else if (timestamp > b) {
                        Intrinsics.checkNotNullExpressionValue(applicationExitInfo, "applicationExitInfo");
                        a(applicationExitInfo, timestamp);
                    }
                }
            }
            if (j != 0) {
                a(j);
            }
        } catch (Exception e) {
            POBLog.debug(this.tag, e.getClass().getName() + " caught while fetching the historical process exit reasons. Message -> " + e.getMessage() + '.', new Object[0]);
        }
    }

    private final long b() {
        String readFromFile = POBCrashAnalyticsUtils.readFromFile(this.context, POBCrashAnalyticsConstants.ANR_TIMESTAMP_FILE);
        if (readFromFile == null) {
            return 0L;
        }
        try {
            return new JSONObject(readFromFile).optLong(POBCrashAnalyticsConstants.ANR_TIMESTAMP_KEY, 0L);
        } catch (JSONException e) {
            POBLog.debug(this.tag, "JSONException caught while reading ANR timestamp from file. Message -> " + e.getMessage() + '.', new Object[0]);
            return 0L;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    private final void a(ApplicationExitInfo applicationExitInfo, long timeStamp) {
        InputStream traceInputStream;
        String a;
        traceInputStream = applicationExitInfo.getTraceInputStream();
        if (traceInputStream == null || (a = a(a(traceInputStream))) == null || !StringsKt.contains$default((CharSequence) a, (CharSequence) POBCrashAnalyticsConstants.OW_FILTER, false, 2, (Object) null)) {
            return;
        }
        this.jsonArray.put(new POBCrashHelper(POBCrashAnalyticsConstants.ANR_FULL_FORM, a, timeStamp).getCrashJson(this.context));
    }

    private final String a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
                    return sb2;
                }
            } finally {
            }
        }
    }

    private final String a(String data) {
        MatchResult find$default = Regex.find$default(new Regex("\"main\" prio=.*?(?=\n\n)", RegexOption.DOT_MATCHES_ALL), data, 0, 2, null);
        if (find$default != null) {
            return find$default.getValue();
        }
        return null;
    }

    private final void a(long timeStamp) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(POBCrashAnalyticsConstants.ANR_TIMESTAMP_KEY, timeStamp);
            Context context = this.context;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
            POBCrashAnalyticsUtils.writeToFile(context, POBCrashAnalyticsConstants.ANR_TIMESTAMP_FILE, jSONObject2);
        } catch (JSONException e) {
            POBLog.error(this.tag, "JSONException caught while putting timestamp in JSON. Message -> " + e.getMessage() + '.', new Object[0]);
        }
    }
}
