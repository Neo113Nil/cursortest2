package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.os.EnvironmentCompat;
import com.onevcat.uniwebview.R;
import com.onevcat.uniwebview.UniWebViewInterface;
import com.onevcat.uniwebview.UniWebViewProxyActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Z extends WebChromeClient {
    public final Activity a;
    public final C0092z b;
    public final C0063p0 c;
    public final FrameLayout d;
    public final boolean e;
    public boolean f;
    public FrameLayout g;
    public final LinkedHashSet h;
    public C0092z i;
    public boolean j;

    public Z(Activity activity, C0092z webView, C0063p0 containerView, FrameLayout videoView, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.a = activity;
        this.b = webView;
        this.c = containerView;
        this.d = videoView;
        this.e = z;
        this.h = new LinkedHashSet();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    public final void a(final PermissionRequest permissionRequest) {
        String str;
        C0058o c0058o = C0058o.b;
        String message = "Prepare capture permission prompt. URL: " + permissionRequest.getOrigin() + "; resources: " + permissionRequest.getResources();
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        final String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        ArrayList arrayList = new ArrayList(resources.length);
        int length = resources.length;
        int i = 0;
        while (true) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1660821873) {
                    if (hashCode != 968612586) {
                        if (hashCode != 1069496794) {
                            if (hashCode == 1233677653 && str2.equals("android.webkit.resource.MIDI_SYSEX")) {
                                str = "MIDI sysex";
                            }
                        } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "protected media ID";
                        }
                    } else if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        str = this.a.getResources().getString(R.string.MICROPHONE);
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = this.a.getResources().getString(R.string.CAMERA);
                }
            }
            arrayList.add(str);
            i++;
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        String host = permissionRequest.getOrigin().getHost();
        if (host != null) {
            str = host;
        }
        String string = this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST, str, joinToString$default);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…QUEST, host, permissions)");
        new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.MEDIA_CAPTURE_PERMISSION_REQUEST_TITLE)).setMessage(string).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Z.a(permissionRequest, resources, dialogInterface, i2);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Z.a(permissionRequest, dialogInterface, i2);
            }
        }).create().show();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        ViewParent parent = webView != null ? webView.getParent() : null;
        C0092z c0092z = parent instanceof C0092z ? (C0092z) parent : null;
        if (c0092z == null) {
            return;
        }
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("onCloseWindow...", "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o.a(enumC0054n, "onCloseWindow...");
        String message = "Get a parent view: " + c0092z;
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(enumC0054n, message);
        c0092z.removeView(webView);
        C0092z c0092z2 = c0092z.get_webChromeClient$uniwebview_release().i;
        if (c0092z2 != null) {
            c0092z.getMessageSender().a(c0092z.getName(), P2.MultipleWindowClosed, c0092z2.getName());
            c0092z.get_webChromeClient$uniwebview_release().i = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (!this.e) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage == null) {
            return super.onConsoleMessage(null);
        }
        C0058o c0058o = C0058o.b;
        String str = consoleMessage.message() + ", source: " + consoleMessage.sourceId() + " line: " + consoleMessage.lineNumber();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : W.a[messageLevel.ordinal()];
        if (i == -1) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (i == 1) {
            c0058o.getClass();
            C0058o.a(EnumC0054n.DEBUG, "🔵", "debug: " + str);
        } else if (i == 2) {
            c0058o.getClass();
            C0058o.a(EnumC0054n.INFO, "🟢", "log: " + str);
        } else if (i == 3) {
            c0058o.getClass();
            C0058o.a(EnumC0054n.WARNING, "🟡", "warning: " + str);
        } else if (i == 4) {
            c0058o.getClass();
            C0058o.a(EnumC0054n.CRITICAL, "🔴", "error: " + str);
        } else if (i == 5) {
            c0058o.getClass();
            C0058o.a(EnumC0054n.VERBOSE, "🔵", "tip: " + str);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("onCreateWindow...", "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o.a(enumC0054n, "onCreateWindow...");
        WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        String message2 = "Checking hitting result, url: " + extra;
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o.a(enumC0054n, message2);
        if (this.b.get_webClient$uniwebview_release().h.a(extra, false)) {
            return false;
        }
        if (!this.b.getSettings().supportMultipleWindows() || (!z2 && !this.j)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        Activity activity = this.a;
        C0063p0 c0063p0 = this.c;
        FrameLayout frameLayout = this.d;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        C0092z c0092z = new C0092z(activity, c0063p0, frameLayout, uuid, new Y(), new X());
        c0092z.getSettings().setUserAgentString(this.b.getSettings().getUserAgentString());
        c0092z.getSettings().setSupportMultipleWindows(true);
        c0092z.get_webChromeClient$uniwebview_release().j = this.j;
        c0092z.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (webView != null) {
            webView.addView(c0092z);
        }
        Object obj = message != null ? message.obj : null;
        if (obj instanceof WebView.WebViewTransport) {
            ((WebView.WebViewTransport) obj).setWebView(c0092z);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.i = c0092z;
        this.b.getMessageSender().a(this.b.getName(), P2.MultipleWindowOpened, c0092z.getName());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str, true, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f) {
            this.d.setVisibility(4);
            this.d.removeView(this.g);
            this.c.setVisibility(0);
            this.f = false;
            this.g = null;
            this.b.clearFocus();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Z.a(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Z.b(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Z.c(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        final EditText editText = new EditText(this.a);
        editText.setSingleLine();
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setCancelable(false);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …    .setCancelable(false)");
        AbstractC0002a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Z.a(editText, jsPromptResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.Z$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Z.a(jsPromptResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0058o c0058o = C0058o.b;
        String message = "UniWebViewChromeClient onPermissionRequest. URL: " + (permissionRequest != null ? permissionRequest.getOrigin() : null);
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.INFO;
        c0058o.a(enumC0054n, message);
        if (permissionRequest == null) {
            return;
        }
        S s = new S(this.b.getName(), permissionRequest);
        UniWebViewInterface.Companion.getClass();
        V a = y2.a(s);
        String message2 = "Getting result from 'RequestMediaCapturePermission' channel method: " + a;
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o.a(enumC0054n, message2);
        if (a != null) {
            String string = a.b.getString("result");
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(RESULT_KEY)");
            if (Intrinsics.areEqual(string, "grant")) {
                permissionRequest.grant(permissionRequest.getResources());
                return;
            } else if (Intrinsics.areEqual(string, "deny")) {
                permissionRequest.deny();
                return;
            } else {
                a(permissionRequest);
                return;
            }
        }
        if (this.h.isEmpty()) {
            a(permissionRequest);
            return;
        }
        String message3 = "No RequestMediaCapturePermission channel method but valid permissionTrustDomains. Compatible onPermissionRequest. URL: " + permissionRequest.getOrigin();
        Intrinsics.checkNotNullParameter(message3, "message");
        c0058o.a(enumC0054n, message3);
        try {
            String host = permissionRequest.getOrigin().getHost();
            if (host != null && this.h.contains(host)) {
                String message4 = "Permission domain '" + host + "' is contained in allow list. Granting...";
                Intrinsics.checkNotNullParameter(message4, "message");
                c0058o.a(enumC0054n, message4);
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
            String message5 = "Permission domain '" + host + "' is not contained in allow list. Deny this request.";
            Intrinsics.checkNotNullParameter(message5, "message");
            EnumC0054n enumC0054n2 = EnumC0054n.CRITICAL;
            c0058o.a(enumC0054n2, message5);
            Intrinsics.checkNotNullParameter("If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.", "message");
            c0058o.a(enumC0054n2, "If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.");
            permissionRequest.deny();
        } catch (Exception e) {
            C0058o c0058o2 = C0058o.b;
            String message6 = "onPermissionRequest failed due to exception: " + e.getMessage();
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            c0058o2.a(EnumC0054n.CRITICAL, message6);
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.b.getMessageSender().a(this.b.getName(), P2.PageProgressChanged, String.valueOf(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f = true;
            FrameLayout frameLayout = (FrameLayout) view;
            this.g = frameLayout;
            this.c.setVisibility(4);
            this.d.setVisibility(0);
            this.d.addView(this.g, new ViewGroup.LayoutParams(-1, -1));
            if (this.b.getSettings().getJavaScriptEnabled() && (frameLayout.getFocusedChild() instanceof SurfaceView)) {
                this.b.loadUrl("javascript:\n                    var _ytrp_html5_video_last;\n                    var _ytrp_html5_video = document.getElementsByTagName('video')[0];\n                    if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {\n                      _ytrp_html5_video_last = _ytrp_html5_video;\n                      function _ytrp_html5_video_ended() {\n                        window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                      }\n                      window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                    }");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C0047l0 handler = new C0047l0(valueCallback, fileChooserParams);
        Activity context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        B.a.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        String handlerId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
        A.b.put(handlerId, handler);
        handler.g = handlerId;
        handler.h = context;
        B2 b2 = UniWebViewProxyActivity.Companion;
        if (handlerId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            handlerId = null;
        }
        b2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intent intent = new Intent(context, (Class<?>) UniWebViewProxyActivity.class);
        intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
        context.startActivity(intent);
        return true;
    }

    public static final void a(PermissionRequest request, String[] strArr, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.grant(strArr);
    }

    public static final void a(PermissionRequest request, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.deny();
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void a(EditText input, JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(input, "$input");
        String obj = input.getText().toString();
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.confirm(obj);
        }
    }

    public static final void a(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }
}
