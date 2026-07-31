package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import com.ironsource.mediationsdk.metadata.a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportHandler;", "", "()V", "MAX_ERROR_REPORT_NUM", "", a.k, "", "listErrorReportFiles", "", "Ljava/io/File;", "()[Ljava/io/File;", "save", "msg", "", "sendErrorReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@RestrictTo
/* loaded from: classes8.dex */
public final class ErrorReportHandler {

    @NotNull
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    public static final void save(@Nullable String msg) {
        try {
            new ErrorReportData(msg).save();
        } catch (Exception unused) {
        }
    }

    public static final void enable() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    public static final void sendErrorReports() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] listErrorReportFiles = listErrorReportFiles();
        final ArrayList arrayList = new ArrayList();
        int length = listErrorReportFiles.length;
        int i = 0;
        while (i < length) {
            File file = listErrorReportFiles[i];
            i++;
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m3468sendErrorReports$lambda0;
                m3468sendErrorReports$lambda0 = ErrorReportHandler.m3468sendErrorReports$lambda0((ErrorReportData) obj, (ErrorReportData) obj2);
                return m3468sendErrorReports$lambda0;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.sendReports("error_reports", jSONArray, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda2
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                ErrorReportHandler.m3469sendErrorReports$lambda2(arrayList, graphResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-0, reason: not valid java name */
    public static final int m3468sendErrorReports$lambda0(ErrorReportData errorReportData, ErrorReportData o2) {
        Intrinsics.checkNotNullExpressionValue(o2, "o2");
        return errorReportData.compareTo(o2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-2, reason: not valid java name */
    public static final void m3469sendErrorReports$lambda2(ArrayList validReports, GraphResponse response) {
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getError() == null) {
                JSONObject jsonObject = response.getJsonObject();
                if (Intrinsics.areEqual(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((ErrorReportData) it.next()).clear();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    @NotNull
    public static final File[] listErrorReportFiles() {
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m3467listErrorReportFiles$lambda3;
                m3467listErrorReportFiles$lambda3 = ErrorReportHandler.m3467listErrorReportFiles$lambda3(file, str);
                return m3467listErrorReportFiles$lambda3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: listErrorReportFiles$lambda-3, reason: not valid java name */
    public static final boolean m3467listErrorReportFiles$lambda3(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).matches(name);
    }
}
