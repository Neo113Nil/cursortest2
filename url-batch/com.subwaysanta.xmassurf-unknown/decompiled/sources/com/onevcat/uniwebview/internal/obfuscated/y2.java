package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.ValueCallback;
import com.onevcat.uniwebview.UniWebViewInterface;
import com.onevcat.uniwebview.UniWebViewNativeChannel;
import com.unity3d.player.UnityPlayer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class y2 {
    public static void a(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface clearCookiesAsync", "message");
        c0058o.a(EnumC0054n.INFO, "Interface clearCookiesAsync");
        AbstractC0035i0.a(new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.y2$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                y2.a(identifier, (Unit) obj);
            }
        });
    }

    public static final void b(String name, Function1 runner) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(runner, "$runner");
        C0026g c0026g = C0026g.b;
        c0026g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0031h0 c0031h0 = (C0031h0) c0026g.a.get(name);
        if (c0031h0 != null) {
            runner.invoke(c0031h0);
            return;
        }
        C0058o c0058o = C0058o.b;
        String message = "Did not find the correct web view container for name: " + name + ". Has it been already destroyed or not yet added?";
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.CRITICAL, message);
    }

    public static Object c(Function0 function0) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(new C0048l1(objectRef, function0, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C0058o c0058o = C0058o.b;
            String message = "Exception detected: " + e.getMessage();
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static void a(String url, String cookie, final String identifier) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        String message = "setCookieAsync: " + cookie + " | to url: " + url + ", identifier: " + identifier;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        AbstractC0035i0.a(url, cookie, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.y2$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                y2.b(identifier, (Unit) obj);
            }
        });
    }

    public static Object c(String str, Function1 function1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(str, new C0052m1(objectRef, function1, countDownLatch));
        try {
            countDownLatch.await(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            C0058o c0058o = C0058o.b;
            String message = "Exception detected: " + e.getMessage();
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c0058o.a(EnumC0054n.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static final void b(String identifier, Unit unit) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Q q = new Q(new D2(identifier, "0", "", null));
        UniWebViewInterface.Companion.getClass();
        a(q);
    }

    public static final void b(Function0 runner) {
        Intrinsics.checkNotNullParameter(runner, "$runner");
        runner.invoke();
    }

    public static V a(U params) {
        UniWebViewNativeChannel uniWebViewNativeChannel;
        Intrinsics.checkNotNullParameter(params, "params");
        uniWebViewNativeChannel = UniWebViewInterface.channel;
        if (uniWebViewNativeChannel == null) {
            C0058o c0058o = C0058o.b;
            W0 messageProvider = new W0(params);
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            c0058o.a(EnumC0054n.CRITICAL, messageProvider);
            return null;
        }
        C0058o.b.a("invokeChannelMethod: " + params.a + ", " + params.b + ", %s", params.c);
        String invokeChannelMethod = uniWebViewNativeChannel.invokeChannelMethod(params.a, params.b, params.c);
        if (invokeChannelMethod == null) {
            return null;
        }
        return new V(invokeChannelMethod);
    }

    public static final void a(String identifier, Unit unit) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Q q = new Q(new D2(identifier, "0", "", null));
        UniWebViewInterface.Companion.getClass();
        a(q);
    }

    public static void a(final Function0 function0) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.y2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                y2.b(Function0.this);
            }
        });
    }

    public static void a(final String str, final Function1 function1) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.onevcat.uniwebview.internal.obfuscated.y2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                y2.b(str, function1);
            }
        });
    }
}
