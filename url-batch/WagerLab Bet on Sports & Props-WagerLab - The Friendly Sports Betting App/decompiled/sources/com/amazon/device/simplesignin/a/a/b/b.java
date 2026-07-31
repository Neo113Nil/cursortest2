package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LinkUserAccountCommand.java */
/* loaded from: classes3.dex */
public class b extends c {
    private static final String d = "SSI_LinkUserAccount";
    private static final String e = "1.0";
    private static final String f = "b";

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b b;

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a c;

    b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f697a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.h, com.amazon.device.simplesignin.a.a.a.i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e2) {
            com.amazon.device.simplesignin.a.d.a.b(f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e2);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) throws RemoteException {
        Map b = jVar.b();
        if (b.containsKey(com.amazon.device.simplesignin.a.a.a.j) && b.get(com.amazon.device.simplesignin.a.a.a.j) != null) {
            a((Intent) b.get(com.amazon.device.simplesignin.a.a.a.j));
            return true;
        }
        return super.a(b);
    }

    private void a(final Intent intent) {
        this.b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity b = b.this.c.b();
                    if (b == null) {
                        b = b.this.c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f, "Consent activity is about to start: " + b);
                    b.startActivity(intent);
                } catch (Exception e2) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f, "Exception when starting consent activity: " + e2);
                }
            }
        });
    }
}
