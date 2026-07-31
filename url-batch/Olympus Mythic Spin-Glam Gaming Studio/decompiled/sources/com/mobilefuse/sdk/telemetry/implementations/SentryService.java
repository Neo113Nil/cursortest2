package com.mobilefuse.sdk.telemetry.implementations;

import android.util.Log;
import com.ironsource.B5;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetryService;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryBreadcrumbs;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryDataModelToJsonKt;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryEvent;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryException;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpersKt;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryStackFrame;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: SentryService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/SentryService;", "Lcom/mobilefuse/sdk/telemetry/TelemetryService;", "()V", "host", "", "key", "projectId", "serviceSdkName", "serviceVersion", "captureException", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "sender", "breadcrumbs", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "modules", "", "variables", "getStackFrameForCulprit", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", TelemetryCategory.EXCEPTION, "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "culprit", "sendApiRequest", B5.r, "jsonContent", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class SentryService implements TelemetryService {
    private final String key = "24b4a64987c44acda8bf1f536d1a6ae8";
    private final String projectId = "6512411";
    private final String host = "o861477.ingest.sentry.io";
    private final String serviceSdkName = "sentry-mf-kotlin";
    private final String serviceVersion = "1.11.0";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0088 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0025, B:5:0x002f, B:8:0x003a, B:10:0x0088, B:11:0x008c), top: B:2:0x0025 }] */
    @Override // com.mobilefuse.sdk.telemetry.TelemetryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void captureException(@NotNull Throwable e, @NotNull String sender, @NotNull List<TelemetryBreadcrumb> breadcrumbs, @NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        String str;
        SentryStackFrame stackFrameForCulprit;
        String str2;
        String message;
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        try {
            stackFrameForCulprit = getStackFrameForCulprit(SentryHelpersKt.getSentryException(e), sender);
        } catch (Throwable th) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.toString();
            }
            str = message2;
        }
        if (stackFrameForCulprit != null) {
            str2 = stackFrameForCulprit.getFunction();
            if (str2 == null) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append(SentryHelpersKt.getSentryException(e).getType());
            sb.append(" in SDK ");
            sb.append(TelemetryManager.INSTANCE.getReleaseVersion());
            sb.append(" (");
            sb.append(sender);
            sb.append('.');
            sb.append(str2);
            sb.append(") ");
            sb.append("for '");
            sb.append(variables.get("app.bundle"));
            sb.append("': ");
            message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            sb.append(message);
            str = sb.toString();
            SentryEvent sentryEvent = new SentryEvent(str, SentryHelpersKt.getSentryException(e), modules, variables, TelemetryManager.INSTANCE.getReleaseVersion(), sender, new SentryBreadcrumbs(breadcrumbs), null, 0L, null, 896, null);
            String jSONObject = SentryDataModelToJsonKt.getJson(sentryEvent).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "event.json.toString()");
            Log.d("MobileFuse.Telemetry", "Transmitting exception with eventId " + sentryEvent.getEventId());
            Log.d("MobileFuse.Telemetry", jSONObject);
            sendApiRequest("store/", jSONObject);
        }
        str2 = "Unknown Function";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SentryHelpersKt.getSentryException(e).getType());
        sb2.append(" in SDK ");
        sb2.append(TelemetryManager.INSTANCE.getReleaseVersion());
        sb2.append(" (");
        sb2.append(sender);
        sb2.append('.');
        sb2.append(str2);
        sb2.append(") ");
        sb2.append("for '");
        sb2.append(variables.get("app.bundle"));
        sb2.append("': ");
        message = e.getMessage();
        if (message == null) {
        }
        sb2.append(message);
        str = sb2.toString();
        SentryEvent sentryEvent2 = new SentryEvent(str, SentryHelpersKt.getSentryException(e), modules, variables, TelemetryManager.INSTANCE.getReleaseVersion(), sender, new SentryBreadcrumbs(breadcrumbs), null, 0L, null, 896, null);
        String jSONObject2 = SentryDataModelToJsonKt.getJson(sentryEvent2).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "event.json.toString()");
        Log.d("MobileFuse.Telemetry", "Transmitting exception with eventId " + sentryEvent2.getEventId());
        Log.d("MobileFuse.Telemetry", jSONObject2);
        sendApiRequest("store/", jSONObject2);
    }

    private final SentryStackFrame getStackFrameForCulprit(SentryException exception, String culprit) {
        for (SentryStackFrame sentryStackFrame : exception.getStacktrace().getFrames()) {
            if (Intrinsics.areEqual(sentryStackFrame.getModule(), culprit)) {
                return sentryStackFrame;
            }
        }
        return null;
    }

    private final void sendApiRequest(final String endpoint, final String jsonContent) {
        new Thread(new Runnable() { // from class: com.mobilefuse.sdk.telemetry.implementations.SentryService$sendApiRequest$1
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                String str3;
                byte[] bytes;
                boolean z;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d.u);
                    str = SentryService.this.key;
                    sb.append(str);
                    sb.append('@');
                    str2 = SentryService.this.host;
                    sb.append(str2);
                    sb.append("/api/");
                    str3 = SentryService.this.projectId;
                    sb.append(str3);
                    sb.append('/');
                    sb.append(endpoint);
                    URL url = new URL(sb.toString());
                    try {
                        bytes = Gzip.toGzipByteArray(jsonContent);
                        z = true;
                    } catch (Throwable unused) {
                        bytes = jsonContent.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        z = false;
                    }
                    URLConnection openConnection = url.openConnection();
                    if (openConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setRequestMethod("POST");
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    StringBuilder sb2 = new StringBuilder();
                    str4 = SentryService.this.serviceSdkName;
                    sb2.append(str4);
                    sb2.append('/');
                    str5 = SentryService.this.serviceVersion;
                    sb2.append(str5);
                    httpURLConnection.setRequestProperty("User-Agent", sb2.toString());
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty(NetworkUtils.HEADER_CONTENT_LENGTH, String.valueOf(bytes.length));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Sentry sentry_version=7,sentry_timestamp=");
                    sb3.append(currentTimeMillis);
                    sb3.append(",sentry_key=");
                    str6 = SentryService.this.key;
                    sb3.append(str6);
                    sb3.append(",sentry_client=");
                    str7 = SentryService.this.serviceSdkName;
                    sb3.append(str7);
                    sb3.append('/');
                    str8 = SentryService.this.serviceVersion;
                    sb3.append(str8);
                    httpURLConnection.setRequestProperty("X-Sentry-Auth", sb3.toString());
                    if (z) {
                        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    }
                    httpURLConnection.connect();
                    OutputStream urlConnectionGetOutputStream = MobileFuseNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                    urlConnectionGetOutputStream.write(bytes);
                    urlConnectionGetOutputStream.flush();
                    Log.d("MobileFuse.Telemetry", "Server Response: [" + MobileFuseNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection) + '/' + httpURLConnection.getResponseMessage() + ']');
                } catch (Throwable unused2) {
                }
            }
        }).start();
    }
}
