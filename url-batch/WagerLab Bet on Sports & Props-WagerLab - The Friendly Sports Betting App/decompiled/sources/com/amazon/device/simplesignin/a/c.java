package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* compiled from: SimpleSignInManager.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f703a = "c";
    private static final c b = new c();
    private static final IllegalStateException c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));
    private Context d;
    private ISimpleSignInResponseHandler e;
    private b f;

    public Context c() {
        return this.d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.e;
    }

    public b e() {
        return this.f;
    }

    private c() {
    }

    public static c a() {
        return b;
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.d = context;
        this.e = iSimpleSignInResponseHandler;
        this.f = a.a().a(context);
    }

    public String b() {
        if (!f()) {
            com.amazon.device.simplesignin.a.d.a.b(f703a, "Application context not initialized, SDK mode is unknown.");
            return com.amazon.device.simplesignin.a.b.a.UNKNOWN.name();
        }
        if (a.a().b(this.d)) {
            return com.amazon.device.simplesignin.a.b.a.SANDBOX.name();
        }
        return com.amazon.device.simplesignin.a.b.a.PRODUCTION.name();
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.z);
        RequestId requestId = new RequestId();
        this.f.a(requestId, str);
        return requestId;
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (map.isEmpty()) {
            throw new IllegalArgumentException("loginNames must not be empty");
        }
        RequestId requestId = new RequestId();
        this.f.a(requestId, map);
        return requestId;
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f.a(requestId, sSIEventRequest);
        Log.i(f703a, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    private boolean f() {
        return this.d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(f703a, "Simple Sign-In SDK not initialized.");
        throw c;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.A);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.z);
        f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    public void a(Context context, Intent intent) {
        this.f.a(context, intent);
    }
}
