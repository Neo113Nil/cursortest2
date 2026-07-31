package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import com.ironsource.mediationsdk.metadata.a;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionAnalyzer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\r\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/ExceptionAnalyzer;", "", "()V", "enabled", "", a.k, "", "execute", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "isDebug", "isDebug$facebook_core_release", "sendExceptionAnalysisReports", "sendExceptionAnalysisReports$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@RestrictTo
/* loaded from: classes9.dex */
public final class ExceptionAnalyzer {

    @NotNull
    public static final ExceptionAnalyzer INSTANCE = new ExceptionAnalyzer();
    private static boolean enabled;

    @VisibleForTesting
    public static final boolean isDebug$facebook_core_release() {
        return false;
    }

    private ExceptionAnalyzer() {
    }

    public static final void enable() {
        enabled = true;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            INSTANCE.sendExceptionAnalysisReports$facebook_core_release();
        }
    }

    public static final void execute(@Nullable Throwable e) {
        if (!enabled || isDebug$facebook_core_release() || e == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            FeatureManager featureManager = FeatureManager.INSTANCE;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            FeatureManager.Feature feature = FeatureManager.getFeature(className);
            if (feature != FeatureManager.Feature.Unknown) {
                FeatureManager.disableFeature(feature);
                hashSet.add(feature.toString());
            }
        }
        if (!FacebookSdk.getAutoLogAppEventsEnabled() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
        InstrumentData.Builder.build(new JSONArray((Collection) hashSet)).save();
    }

    @VisibleForTesting
    public final void sendExceptionAnalysisReports$facebook_core_release() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] listExceptionAnalysisReportFiles = InstrumentUtility.listExceptionAnalysisReportFiles();
        ArrayList arrayList = new ArrayList();
        int length = listExceptionAnalysisReportFiles.length;
        int i = 0;
        while (i < length) {
            File file = listExceptionAnalysisReportFiles[i];
            i++;
            final InstrumentData load = InstrumentData.Builder.load(file);
            if (load.isValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", load.toString());
                    GraphRequest.Companion companion = GraphRequest.INSTANCE;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(companion.newPostRequest(null, format, jSONObject, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.ExceptionAnalyzer$$ExternalSyntheticLambda0
                        @Override // com.facebook.GraphRequest.Callback
                        public final void onCompleted(GraphResponse graphResponse) {
                            ExceptionAnalyzer.m3453sendExceptionAnalysisReports$lambda1(InstrumentData.this, graphResponse);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new GraphRequestBatch(arrayList).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendExceptionAnalysisReports$lambda-1, reason: not valid java name */
    public static final void m3453sendExceptionAnalysisReports$lambda1(InstrumentData instrumentData, GraphResponse response) {
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getError() == null) {
                JSONObject jsonObject = response.getJsonObject();
                if (Intrinsics.areEqual(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.clear();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
