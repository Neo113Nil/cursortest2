package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C3895bi extends WebChromeClient {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C3895bi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC4476xi.i1;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
        ((C4493y9) interfaceC4466x9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "jsAlert called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        Activity fullScreenActivity = this.a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.bi$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3895bi.a(result, dialogInterface, i);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "jsConfirm called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.bi$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3895bi.b(result, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.bi$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3895bi.c(result, dialogInterface, i);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).a(str, "jsPrompt called with: " + message + url);
        }
        if (!this.a.a(result)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.a.i;
        if (interfaceC4466x9 != null) {
            String str = GestureDetectorOnGestureListenerC4476xi.i1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C4493y9) interfaceC4466x9).c(str, "webview progress changed - " + i);
        }
        super.onProgressChanged(webView, i);
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, false, false);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.a.u.get() != null) {
            new AlertDialog.Builder((Context) this.a.u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.bi$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3895bi.a(callback, origin, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.bi$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C3895bi.b(callback, origin, dialogInterface, i);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }
}
