package com.ogury.ad.internal;

import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.network.NetworkClient;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.NetworkResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class z8 {
    public static z8 c;
    public final m3 a;
    public final NetworkClient b;

    public z8(m3 m3Var, NetworkClient networkClient) {
        this.a = m3Var;
        this.b = networkClient;
    }

    public final NetworkResponse a(JSONObject requestBody) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        String b = fi.b("inapp/config", "sac", com.moloco.sdk.internal.services.init.i.a);
        String jSONObject = requestBody.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        NetworkRequest networkRequest = new NetworkRequest(b, "POST", jSONObject, this.a.c);
        a("sendProfig", networkRequest);
        NetworkResponse execute = this.b.newCall(networkRequest).execute();
        a("sendProfig", networkRequest, execute);
        return execute;
    }

    public static void a(String str, NetworkRequest networkRequest) {
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        String url = networkRequest.getUrl();
        String method = networkRequest.getMethod();
        Map<String, String> loadHeaders = networkRequest.getHeaders().loadHeaders();
        ArrayList arrayList = new ArrayList(loadHeaders.size());
        for (Map.Entry<String, String> entry : loadHeaders.entrySet()) {
            arrayList.add("\n" + ((Object) entry.getKey()) + ":" + ((Object) entry.getValue()));
        }
        logger.d(logTag, sourceTag, "[Setup] " + str + " request :\nurl     : " + url + " \nmethod  : " + method + " \nheaders : " + arrayList + " \nbody    : " + new JSONObject(networkRequest.getBody()).toString(4));
    }

    public static void a(String str, NetworkRequest networkRequest, NetworkResponse networkResponse) {
        String responseBody;
        String str2;
        try {
            ArrayList arrayList = null;
            if (networkResponse instanceof NetworkResponse.Success) {
                Map<String, List<String>> responseHeaders = ((NetworkResponse.Success) networkResponse).getResponseHeaders();
                if (responseHeaders != null) {
                    arrayList = new ArrayList(responseHeaders.size());
                    for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
                        String key = entry.getKey();
                        arrayList.add("\n" + ((Object) key) + ":" + entry.getValue());
                    }
                }
                str2 = "headers : " + arrayList + " \nbody    : " + new JSONObject(((NetworkResponse.Success) networkResponse).getResponseBody()).toString(4);
            } else if (networkResponse instanceof NetworkResponse.Failure) {
                Map<String, List<String>> responseHeaders2 = ((NetworkResponse.Failure) networkResponse).getResponseHeaders();
                if (responseHeaders2 != null) {
                    arrayList = new ArrayList(responseHeaders2.size());
                    for (Map.Entry<String, List<String>> entry2 : responseHeaders2.entrySet()) {
                        String key2 = entry2.getKey();
                        arrayList.add("\n" + ((Object) key2) + ":" + entry2.getValue());
                    }
                }
                String responseBody2 = ((NetworkResponse.Failure) networkResponse).getResponseBody();
                Intrinsics.checkNotNullParameter(responseBody2, "<this>");
                try {
                    new JSONObject(responseBody2);
                    responseBody = new JSONObject(((NetworkResponse.Failure) networkResponse).getResponseBody()).toString(4);
                } catch (Exception unused) {
                    responseBody = ((NetworkResponse.Failure) networkResponse).getResponseBody();
                }
                str2 = "headers : " + arrayList + " \nbody    : " + responseBody + " \nexception    : " + ((NetworkResponse.Failure) networkResponse).getCom.mobilefuse.sdk.telemetry.TelemetryCategory.EXCEPTION java.lang.String() + " \n";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] " + str + " response :\nurl     : " + networkRequest.getUrl() + " \nmethod  : " + networkRequest.getMethod() + " \n" + str2 + " \n");
        } catch (Exception unused2) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, "[Setup] " + str + " response : Error when displaying response log");
        }
    }
}
