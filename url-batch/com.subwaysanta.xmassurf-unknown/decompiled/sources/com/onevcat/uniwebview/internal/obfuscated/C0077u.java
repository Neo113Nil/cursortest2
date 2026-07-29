package com.onevcat.uniwebview.internal.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.onevcat.uniwebview.UniWebViewInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077u {
    public final Context a;
    public final C0092z b;
    public final C0058o c;
    public final Set d;
    public boolean e;

    public C0077u(Context context, C0092z delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = context;
        this.b = delegate;
        this.c = C0058o.b;
        this.d = SetsKt.mutableSetOf("uniwebview");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String url, boolean z, boolean z2, String str) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intrinsics.checkNotNullParameter(url, "url");
        if (str != null) {
            y2 y2Var = UniWebViewInterface.Companion;
            T t = new T(str, z, url);
            y2Var.getClass();
            V a = y2.a(t);
            if (a != null) {
                try {
                    if (!a.b.getBoolean("result")) {
                        return true;
                    }
                } catch (Exception e) {
                    C0058o c0058o = C0058o.b;
                    String message = "Exception during parsing result for `ShouldUniWebViewHandleRequest`: " + e + ". Result from managed code: " + a.a;
                    c0058o.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    c0058o.a(EnumC0054n.CRITICAL, message);
                }
            }
        }
        String url2 = url.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(url2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        Intent intent6 = null;
        if (StringsKt.startsWith$default(url2, "file:", false, 2, (Object) null)) {
            C0092z c0092z = this.b;
            if (c0092z.getSettings().getAllowFileAccess()) {
                C0058o c0058o2 = C0058o.b;
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter("Loading a local file. The local file loading will never be overridden.", "message");
                c0058o2.a(EnumC0054n.DEBUG, "Loading a local file. The local file loading will never be overridden.");
                return false;
            }
            C0058o c0058o3 = C0058o.b;
            c0058o3.getClass();
            Intrinsics.checkNotNullParameter("Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.", "message");
            c0058o3.a(EnumC0054n.INFO, "Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.");
            c0092z.c.a(c0092z.b, P2.PageErrorReceived, new D2("", "-1", "Local file loading is disabled.", null));
            return true;
        }
        if (StringsKt.startsWith$default(url2, "uniwebviewinternal://", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) url2, (CharSequence) "__uniwebview_internal_video_end", false, 2, (Object) null)) {
                this.b.d.onHideCustomView();
            }
            C0058o c0058o4 = this.c;
            c0058o4.getClass();
            Intrinsics.checkNotNullParameter("Url handled internally in UniWebView", "message");
            c0058o4.a(EnumC0054n.DEBUG, "Url handled internally in UniWebView");
            return true;
        }
        Intrinsics.checkNotNullParameter(url2, "url");
        C0058o c0058o5 = this.c;
        c0058o5.a(EnumC0054n.VERBOSE, AbstractC0018e.a("Checking url could match with a defined url scheme: ", url2, c0058o5, "message"));
        Set set = this.d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url2, ((String) it.next()) + "://", false, 2, (Object) null)) {
                    C0058o c0058o6 = this.c;
                    c0058o6.a(EnumC0054n.VERBOSE, AbstractC0018e.a("Found url matching scheme: ", url2, c0058o6, "message"));
                    C0058o c0058o7 = this.c;
                    String message2 = "Url handled by defined scheme. Redirected to Unity. ".concat(url);
                    c0058o7.getClass();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    c0058o7.a(EnumC0054n.DEBUG, message2);
                    C0092z c0092z2 = this.b;
                    Intrinsics.checkNotNullParameter(url, "url");
                    c0092z2.c.a(c0092z2.b, P2.MessageReceived, url);
                    return true;
                }
            }
        }
        C0058o c0058o8 = this.c;
        c0058o8.a(EnumC0054n.VERBOSE, AbstractC0018e.a("Did not find a matched scheme for: ", url2, c0058o8, "message"));
        if (StringsKt.startsWith$default(url2, "sms:", false, 2, (Object) null)) {
            C0058o c0058o9 = this.c;
            c0058o9.getClass();
            Intrinsics.checkNotNullParameter("Received sms url...", "message");
            c0058o9.a(EnumC0054n.DEBUG, "Received sms url...");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        if (!a(intent)) {
            if (StringsKt.startsWith$default(url2, "tel:", false, 2, (Object) null)) {
                C0058o c0058o10 = this.c;
                c0058o10.getClass();
                Intrinsics.checkNotNullParameter("Received tel url...", "message");
                c0058o10.a(EnumC0054n.DEBUG, "Received tel url...");
                intent2 = new Intent("android.intent.action.DIAL", Uri.parse(url));
            } else {
                intent2 = null;
            }
            if (!a(intent2)) {
                if (StringsKt.startsWith$default(url2, "mailto:", false, 2, (Object) null)) {
                    C0058o c0058o11 = this.c;
                    c0058o11.getClass();
                    Intrinsics.checkNotNullParameter("Received mailto url...", "message");
                    c0058o11.a(EnumC0054n.DEBUG, "Received mailto url...");
                    intent3 = new Intent("android.intent.action.SENDTO", Uri.parse(url));
                } else {
                    intent3 = null;
                }
                if (!a(intent3)) {
                    if (StringsKt.startsWith$default(url2, "intent:", false, 2, (Object) null)) {
                        C0058o c0058o12 = this.c;
                        c0058o12.getClass();
                        Intrinsics.checkNotNullParameter("Received intent url...", "message");
                        c0058o12.a(EnumC0054n.DEBUG, "Received intent url...");
                        try {
                            intent4 = Intent.parseUri(url, 1);
                            if (this.a.getPackageManager().resolveActivity(intent4, 65536) == null) {
                                String str2 = intent4.getPackage();
                                if (str2 != null) {
                                    Intent intent7 = new Intent("android.intent.action.VIEW");
                                    intent7.setData(Uri.parse("market://details?id=".concat(str2)));
                                    intent4 = intent7;
                                }
                            }
                        } catch (Exception e2) {
                            C0058o c0058o13 = this.c;
                            String message3 = "Parsing intent url error: " + e2 + ".message";
                            c0058o13.getClass();
                            Intrinsics.checkNotNullParameter(message3, "message");
                            c0058o13.a(EnumC0054n.CRITICAL, message3);
                        }
                        if (!a(intent4)) {
                            if (StringsKt.startsWith$default(url2, "market:", false, 2, (Object) null)) {
                                C0058o c0058o14 = this.c;
                                c0058o14.getClass();
                                Intrinsics.checkNotNullParameter("Received market url...", "message");
                                c0058o14.a(EnumC0054n.DEBUG, "Received market url...");
                                try {
                                    intent5 = Intent.parseUri(url, 1);
                                } catch (Exception e3) {
                                    C0058o c0058o15 = this.c;
                                    String message4 = "Parsing market url error. " + e3.getMessage();
                                    c0058o15.getClass();
                                    Intrinsics.checkNotNullParameter(message4, "message");
                                    c0058o15.a(EnumC0054n.CRITICAL, message4);
                                }
                                if (!a(intent5)) {
                                    if (a(url, z2)) {
                                        return true;
                                    }
                                    List listOf = CollectionsKt.listOf((Object[]) new String[]{"http:", "https:", "file:", "about:blank"});
                                    if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
                                        Iterator it2 = listOf.iterator();
                                        while (it2.hasNext()) {
                                            if (StringsKt.startsWith$default(url2, (String) it2.next(), false, 2, (Object) null)) {
                                                break;
                                            }
                                        }
                                    }
                                    C0058o c0058o16 = this.c;
                                    String message5 = "Trying to parse third party app url: ".concat(url);
                                    c0058o16.getClass();
                                    Intrinsics.checkNotNullParameter(message5, "message");
                                    EnumC0054n enumC0054n = EnumC0054n.DEBUG;
                                    c0058o16.a(enumC0054n, message5);
                                    Intent intent8 = new Intent("android.intent.action.VIEW", Uri.parse(url));
                                    List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent8, 0);
                                    Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                                    C0058o c0058o17 = this.c;
                                    String message6 = "Query for supported activity to run the intent with url: ".concat(url);
                                    c0058o17.getClass();
                                    Intrinsics.checkNotNullParameter(message6, "message");
                                    c0058o17.a(enumC0054n, message6);
                                    if (queryIntentActivities.isEmpty()) {
                                        C0058o c0058o18 = this.c;
                                        c0058o18.getClass();
                                        Intrinsics.checkNotNullParameter("No supported activity found to run the intent. Confirm you have enabled the package visibility if you think this is an error. https://developer.android.com/training/package-visibility", "message");
                                        c0058o18.a(enumC0054n, "No supported activity found to run the intent. Confirm you have enabled the package visibility if you think this is an error. https://developer.android.com/training/package-visibility");
                                    } else {
                                        C0058o c0058o19 = this.c;
                                        c0058o19.getClass();
                                        Intrinsics.checkNotNullParameter("Found supported activity, ready to run the intent.", "message");
                                        c0058o19.a(enumC0054n, "Found supported activity, ready to run the intent.");
                                        intent6 = intent8;
                                    }
                                    if (a(intent6)) {
                                        C0058o c0058o20 = this.c;
                                        String message7 = "Url handled by a third party app: ".concat(url);
                                        c0058o20.getClass();
                                        Intrinsics.checkNotNullParameter(message7, "message");
                                        c0058o20.a(EnumC0054n.DEBUG, message7);
                                        return true;
                                    }
                                    C0058o c0058o21 = this.c;
                                    String message8 = "Url is opening without overridden: ".concat(url);
                                    c0058o21.getClass();
                                    Intrinsics.checkNotNullParameter(message8, "message");
                                    c0058o21.a(EnumC0054n.DEBUG, message8);
                                    return false;
                                }
                            }
                            intent5 = null;
                            if (!a(intent5)) {
                            }
                        }
                    }
                    intent4 = null;
                    if (!a(intent4)) {
                    }
                }
            }
        }
        C0058o c0058o22 = this.c;
        c0058o22.getClass();
        Intrinsics.checkNotNullParameter("Url handled by intent.", "message");
        c0058o22.a(EnumC0054n.DEBUG, "Url handled by intent.");
        return true;
    }

    public final boolean a(String str, boolean z) {
        if (str == null || z || !this.e || this.b.getHitTestResult().getType() == 0) {
            return false;
        }
        C0058o c0058o = this.c;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("UniWebView is opening links in external browser.", "message");
        c0058o.a(EnumC0054n.DEBUG, "UniWebView is opening links in external browser.");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        a(intent);
        return true;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            this.a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            C0058o c0058o = this.c;
            String message = "No Activity found to handle Intent: " + intent.getData();
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
            return false;
        }
    }
}
