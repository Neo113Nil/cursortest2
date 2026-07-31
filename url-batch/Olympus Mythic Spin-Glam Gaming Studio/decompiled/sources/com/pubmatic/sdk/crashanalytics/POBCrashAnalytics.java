package com.pubmatic.sdk.crashanalytics;

import android.content.Context;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.POBCrashAnalysing;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalytics;", "Lcom/pubmatic/sdk/common/POBCrashAnalysing;", "()V", "crashHandler", "Lcom/pubmatic/sdk/crashanalytics/POBCrashHandler;", "isInitialized", "", "initialize", "", "context", "Landroid/content/Context;", "invalidate", "readCrash", "Companion", "POBCrashReporterListenerImpl", "crashanalytics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class POBCrashAnalytics implements POBCrashAnalysing {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "POBCrashAnalytics";

    @Nullable
    private POBCrashHandler crashHandler;
    private boolean isInitialized;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalytics$Companion;", "", "()V", "TAG", "", "crashanalytics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalytics$POBCrashReporterListenerImpl;", "Lcom/pubmatic/sdk/crashanalytics/POBCrashReporterListener;", "Landroid/content/Context;", "context", "Lorg/json/JSONArray;", "reqJSONArray", "<init>", "(Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalytics;Landroid/content/Context;Lorg/json/JSONArray;)V", "", "onSuccess", "()V", "onFailure", "a", "Landroid/content/Context;", "b", "Lorg/json/JSONArray;", "crashanalytics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class POBCrashReporterListenerImpl implements POBCrashReporterListener {

        /* renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: from kotlin metadata */
        private final JSONArray reqJSONArray;
        final /* synthetic */ POBCrashAnalytics c;

        public POBCrashReporterListenerImpl(@NotNull POBCrashAnalytics pOBCrashAnalytics, @NotNull Context context, JSONArray reqJSONArray) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(reqJSONArray, "reqJSONArray");
            this.c = pOBCrashAnalytics;
            this.context = context;
            this.reqJSONArray = reqJSONArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(POBCrashReporterListenerImpl this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.reqJSONArray.length() != 0) {
                while (this$0.reqJSONArray.length() > 10) {
                    this$0.reqJSONArray.remove(0);
                }
                Context context = this$0.context;
                String jSONArray = this$0.reqJSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "reqJSONArray.toString()");
                POBCrashAnalyticsUtils.writeToFile(context, POBCrashAnalyticsConstants.CRASH_DATA_FILE, jSONArray);
                POBCrashStorage.INSTANCE.setCrashJsonArray(this$0.reqJSONArray);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(POBCrashReporterListenerImpl this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            POBCrashAnalyticsUtils.writeToFile(this$0.context, POBCrashAnalyticsConstants.CRASH_DATA_FILE, "");
            POBCrashStorage.INSTANCE.clear();
        }

        @Override // com.pubmatic.sdk.crashanalytics.POBCrashReporterListener
        public void onFailure() {
            POBTaskHandler.INSTANCE.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.crashanalytics.POBCrashAnalytics$POBCrashReporterListenerImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    POBCrashAnalytics.POBCrashReporterListenerImpl.a(POBCrashAnalytics.POBCrashReporterListenerImpl.this);
                }
            });
        }

        @Override // com.pubmatic.sdk.crashanalytics.POBCrashReporterListener
        public void onSuccess() {
            POBTaskHandler.INSTANCE.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.crashanalytics.POBCrashAnalytics$POBCrashReporterListenerImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    POBCrashAnalytics.POBCrashReporterListenerImpl.b(POBCrashAnalytics.POBCrashReporterListenerImpl.this);
                }
            });
        }
    }

    private final void readCrash(final Context context) {
        POBUtils.runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.crashanalytics.POBCrashAnalytics$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                POBCrashAnalytics.m6457readCrash$lambda1(context, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readCrash$lambda-1, reason: not valid java name */
    public static final void m6457readCrash$lambda1(Context context, POBCrashAnalytics this$0) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JSONArray jSONArray = new JSONArray();
        String readFromFile = POBCrashAnalyticsUtils.readFromFile(context, POBCrashAnalyticsConstants.CRASH_DATA_FILE);
        if (readFromFile != null) {
            try {
                jSONArray = new JSONArray(readFromFile);
            } catch (JSONException e) {
                POBLog.debug(TAG, "Exception occurred while converting stringified jsonto JSONArray. Message -> " + e.getMessage() + '.', new Object[0]);
            }
        }
        POBCrashStorage.INSTANCE.setCrashJsonArray(jSONArray);
        JSONArray jsonArray = new POBANRReader(context).getJsonArray();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            jSONArray.put(jsonArray.getJSONObject(i));
        }
        if (jSONArray.length() == 0) {
            POBLog.debug(TAG, "No previously saved diagnostic data found.", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBCrashAnalyticsConstants.CRASHES_KEY, jSONArray);
        POBCrashReporter pOBCrashReporter = POBCrashReporter.INSTANCE;
        POBNetworkHandler networkHandlerWithBackgroundThreadDelivery = POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery();
        Intrinsics.checkNotNullExpressionValue(networkHandlerWithBackgroundThreadDelivery, "getNetworkHandlerWithBackgroundThreadDelivery()");
        pOBCrashReporter.reportCrash(networkHandlerWithBackgroundThreadDelivery, jSONObject, new POBCrashReporterListenerImpl(this$0, context, jSONArray));
    }

    @Override // com.pubmatic.sdk.common.POBCrashAnalysing
    public void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitialized) {
            return;
        }
        POBCrashHandler pOBCrashHandler = new POBCrashHandler(context, Thread.getDefaultUncaughtExceptionHandler());
        this.crashHandler = pOBCrashHandler;
        Thread.setDefaultUncaughtExceptionHandler(pOBCrashHandler);
        readCrash(context);
        this.isInitialized = true;
    }

    @Override // com.pubmatic.sdk.common.POBCrashAnalysing
    public void invalidate() {
        POBCrashStorage.INSTANCE.clear();
        if (this.isInitialized) {
            POBCrashHandler pOBCrashHandler = this.crashHandler;
            if (pOBCrashHandler != null) {
                pOBCrashHandler.destroy();
            }
            this.crashHandler = null;
            this.isInitialized = false;
        }
    }
}
