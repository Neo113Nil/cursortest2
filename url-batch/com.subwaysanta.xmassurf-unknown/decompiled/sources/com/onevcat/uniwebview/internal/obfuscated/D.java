package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.onevcat.uniwebview.UniWebViewProxyActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements B {
    public final Activity b;
    public final String c;
    public final String d;
    public final String e;
    public final C0034i f;
    public String g;
    public UniWebViewProxyActivity h;
    public boolean i;
    public boolean j;

    public D(Activity activity, String name, String url, String callbackURLScheme, C0034i messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callbackURLScheme, "callbackURLScheme");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.b = activity;
        this.c = name;
        this.d = url;
        this.e = callbackURLScheme;
        this.f = messageSender;
        C0014d c0014d = C0014d.b;
        c0014d.getClass();
        Intrinsics.checkNotNullParameter(this, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Adding auth session to manager: ", name, c0058o, "message"));
        c0014d.a.put(name, this);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.B
    public final void a(UniWebViewProxyActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C0058o c0058o = C0058o.b;
        String message = "UniWebViewAuthenticationSession.onCreate. Proxy activity: " + activity;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.DEBUG;
        c0058o.a(enumC0054n, message);
        this.h = activity;
        Intrinsics.checkNotNullParameter("UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...", "message");
        c0058o.a(enumC0054n, "UniWebViewAuthenticationSession.startAuthSession. Trying to build custom tab intent...");
        List list = K2.j;
        ResolveInfo a = H2.a(this.b);
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        if (a != null) {
            build.intent.setPackage(a.serviceInfo.packageName);
            String message2 = "AuthenticationSession using browser: " + a.serviceInfo.packageName;
            Intrinsics.checkNotNullParameter(message2, "message");
            c0058o.a(enumC0054n, message2);
        } else {
            Intrinsics.checkNotNullParameter("No preferred browser found, using system default", "message");
            c0058o.a(enumC0054n, "No preferred browser found, using system default");
        }
        if (this.i) {
            build.intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        build.intent.setData(Uri.parse(this.d));
        String message3 = "UniWebViewAuthenticationSession.startAuthSession. startActivityForResult, Tab Intent: " + build + ", Internal Intent: " + build.intent + ", Uri: " + build.intent.getData();
        Intrinsics.checkNotNullParameter(message3, "message");
        c0058o.a(enumC0054n, message3);
        UniWebViewProxyActivity uniWebViewProxyActivity = this.h;
        if (uniWebViewProxyActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("proxyActivity");
            uniWebViewProxyActivity = null;
        }
        uniWebViewProxyActivity.startActivityForResult(build.intent, 12947761);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.B
    public final void b() {
        A a = B.a;
        String id = this.g;
        if (id == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            id = null;
        }
        a.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        A.b.remove(id);
        C0014d c0014d = C0014d.b;
        String name = this.c;
        c0014d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Removing auth session from manager: ", name, c0058o, "message"));
        c0014d.a.remove(name);
        if (this.j) {
            return;
        }
        Intrinsics.checkNotNullParameter("Seems that user cancelled the auth task.", "message");
        c0058o.a(EnumC0054n.INFO, "Seems that user cancelled the auth task.");
        this.f.a(this.c, P2.AuthErrorReceived, new D2("", "-999", "user cancelled", null));
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.B
    public final void a(UniWebViewProxyActivity activity, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finish();
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.B
    public final void a(Intent intent) {
        if (this.j) {
            C0058o c0058o = C0058o.b;
            String message = "An intent is already handled. Ignore this one..." + intent;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
            return;
        }
        this.j = true;
        if (intent == null) {
            C0058o c0058o2 = C0058o.b;
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter("Auth session receives null intent.", "message");
            c0058o2.a(EnumC0054n.CRITICAL, "Auth session receives null intent.");
            this.f.a(this.c, P2.AuthErrorReceived, new D2("", "1001", "null intent", null));
            return;
        }
        C0058o c0058o3 = C0058o.b;
        String message2 = "Auth session receives intent: " + intent + ". data: " + intent.getData();
        c0058o3.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        EnumC0054n enumC0054n = EnumC0054n.INFO;
        c0058o3.a(enumC0054n, message2);
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        if (!Intrinsics.areEqual(this.e, "intent") && !Intrinsics.areEqual(data.getScheme(), this.e)) {
            String message3 = "Auth session receives uri " + data + ". But its scheme does not match the expected one: " + this.e;
            Intrinsics.checkNotNullParameter(message3, "message");
            c0058o3.a(EnumC0054n.CRITICAL, message3);
            this.f.a(this.c, P2.AuthErrorReceived, new D2("", "1002", String.valueOf(data), null));
            return;
        }
        String message4 = "Auth session got result from service provider. " + intent.getDataString();
        Intrinsics.checkNotNullParameter(message4, "message");
        c0058o3.a(enumC0054n, message4);
        C0034i c0034i = this.f;
        String str = this.c;
        P2 p2 = P2.AuthFinished;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = String.valueOf(data);
        }
        Intrinsics.checkNotNullExpressionValue(dataString, "intent.dataString ?: \"$uri\"");
        c0034i.a(str, p2, dataString);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.B
    public final void a() {
        Activity activity = this.b;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(603979776);
        this.b.startActivity(intent);
    }
}
