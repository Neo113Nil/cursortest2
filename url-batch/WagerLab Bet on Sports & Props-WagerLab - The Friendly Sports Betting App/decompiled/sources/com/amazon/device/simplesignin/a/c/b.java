package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SandboxRequestHandler.java */
/* loaded from: classes3.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f705a = "b";
    private static final String b = "com.amazon.sdktestclient";
    private static final String c = "com.amazon.sdktestclient.command.CommandBroker";

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        Log.i(f705a, "Handling getUserAndLinks sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f697a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            c2.startService(a2);
        } catch (JSONException unused) {
            Log.e(f705a, "Error in preparing getUserAndLinksInput.");
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f705a, "Handling linkUserAccount sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f697a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.e, linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put(com.amazon.device.simplesignin.a.a.a.E, linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.g, jSONObject2.toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f, linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.simplesignin.linkUserAccount");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(f705a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f705a, "Handling showLoginSelection sandbox request.");
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", c2.getPackageName());
            jSONObject.put("sdkVersion", SimpleSignInService.SDK_VERSION);
            Intent a2 = a("com.amazon.testclient.simplesignin.showLoginSelection");
            a2.putExtra("showLoginSelectionInput", jSONObject.toString());
            a2.putExtra(com.amazon.device.simplesignin.a.a.a.o, new HashMap(map));
            a2.addFlags(268435456);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(f705a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context c2 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.t, sSIEventRequest.getEvent().toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.u, sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.v, sSIEventRequest.getFailureReason().toString());
            }
            Intent a2 = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            a2.addFlags(268435456);
            c2.startService(a2);
        } catch (JSONException e) {
            Log.e(f705a, "Error in preparing recordMetricEventInput for requestId: " + requestId, e);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        intent.setComponent(new ComponentName(b, c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                a(a(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                a(c(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                a(d(intent));
            } else if ("com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                a(b(intent));
            } else {
                Log.d(f705a, "Unknown response type received.");
            }
        } catch (Exception e) {
            Log.e(f705a, "Error handling response.", e);
        }
    }

    private GetUserAndLinksResponse a(Intent intent) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(valueOf);
            if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
                return getUserAndLinksResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.b);
            getUserAndLinksResponse.setAmazonUserId(string);
            getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(com.amazon.device.simplesignin.a.a.a.c)));
            return getUserAndLinksResponse;
        } catch (JSONException e) {
            Log.e(f705a, "Exception while parsing GetUserAndLinks response", e);
            return getUserAndLinksResponse;
        }
    }

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(valueOf);
            RequestStatus.SUCCESSFUL.equals(valueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e) {
            Log.e(f705a, "Exception while parsing RecordMetricsEvent response", e);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(f705a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(valueOf);
            if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
                return linkUserAccountResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.m);
            if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
                linkUserAccountResponse.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.k));
            }
            linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
            return linkUserAccountResponse;
        } catch (JSONException e) {
            Log.e(f705a, "Exception while parsing LinkUserAccount response", e);
            return linkUserAccountResponse;
        }
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(f705a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(valueOf);
            if (RequestStatus.SUCCESSFUL.equals(valueOf)) {
                if (!ShowLoginSelectionResponse.UserSelection.LoginSelected.name().equals(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.q))) {
                    showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
                    return showLoginSelectionResponse;
                }
                String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.r);
                if (string != null) {
                    showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.LoginSelected);
                    showLoginSelectionResponse.setLinkId(string);
                }
            }
            return showLoginSelectionResponse;
        } catch (JSONException e) {
            Log.e(f705a, "Exception while parsing LinkUserAccount response", e);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return showLoginSelectionResponse;
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(b, c));
        return intent;
    }

    private void a(final Object obj) {
        Context c2 = c.a().c();
        final ISimpleSignInResponseHandler d = c.a().d();
        if (c2 == null || obj == null) {
            Log.i(f705a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
        } else {
            new Handler(c2.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            d.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof LinkUserAccountResponse) {
                            d.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof ShowLoginSelectionResponse) {
                            d.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                        } else if (!(obj2 instanceof RecordMetricsEventResponse)) {
                            Log.e(b.f705a, "Unknown response type:" + obj.getClass().getName());
                        } else {
                            d.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj2);
                        }
                    } catch (Exception e) {
                        Log.e(b.f705a, "Error in sendResponse: " + e);
                    }
                }
            });
        }
    }
}
