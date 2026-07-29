package com.onevcat.uniwebview.internal.obfuscated;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.onevcat.uniwebview.R;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092z extends WebView {
    public static final /* synthetic */ int i = 0;
    public final Activity a;
    public final String b;
    public final O2 c;
    public final Z d;
    public final C0007b0 e;
    public final C0059o0 f;
    public boolean g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092z(Activity activity, C0063p0 containerView, FrameLayout videoView, String name, O2 messageSender, z2 loadingObserver) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.h = true;
        getSettings().setDatabaseEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setGeolocationEnabled(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(AbstractC0089y.d);
        getSettings().setMixedContentMode(2);
        getSettings().setJavaScriptEnabled(AbstractC0089y.c);
        getSettings().setMediaPlaybackRequiresUserGesture(!AbstractC0089y.a);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(AbstractC0089y.b);
        String path = getContext().getCacheDir().getPath();
        WebSettings settings = getSettings();
        if (settings != null && path != null && path.length() != 0 && Build.VERSION.SDK_INT < 33) {
            try {
                Class<?> cls = Class.forName("android.webkit.WebSettings");
                Method declaredMethod = cls.getDeclaredMethod("setAppCachePath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, path);
                Method declaredMethod2 = cls.getDeclaredMethod("setAppCacheEnabled", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
        Z z = new Z(this.a, this, containerView, videoView, AbstractC0089y.f);
        this.d = z;
        setWebChromeClient(z);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C0007b0 c0007b0 = new C0007b0(context, this, loadingObserver);
        this.e = c0007b0;
        setWebViewClient(c0007b0);
        C0059o0 c0059o0 = new C0059o0(this.a, this.b, this.c, new C0083w(this));
        this.f = c0059o0;
        c0059o0.a();
        a();
        Intrinsics.checkNotNullParameter(this, "webView");
        C0058o c0058o = C0058o.b;
        F messageProvider = new F(this);
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
        c0058o.a(EnumC0054n.DEBUG, messageProvider);
        Object l = new L(this);
        Object o = new O(this);
        addJavascriptInterface(l, "_UniWebViewChannelMessageHandler");
        addJavascriptInterface(o, "_UniWebViewSyncCall");
    }

    public static final boolean a(View view) {
        return true;
    }

    public static final void b(String str, String str2) {
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Finished fetching content: ", str, ". Result: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
    }

    public final void a(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Adding JavaScript string to web view. Requesting string: ", jsString, c0058o, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C0092z.a(identifier, this, (String) obj);
            }
        });
    }

    public final void c(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Evaluating JavaScript string within web view. Requesting string: ", jsString, c0058o, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C0092z.b(identifier, this, (String) obj);
            }
        });
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        C0059o0 c0059o0 = this.f;
        c0059o0.a.unregisterReceiver(c0059o0.h);
        Toast toast = c0059o0.f;
        if (toast != null) {
            toast.cancel();
        }
        c0059o0.f = null;
        super.destroy();
    }

    public final boolean getCalloutEnabled() {
        return this.h;
    }

    public final C0059o0 getDownloader$uniwebview_release() {
        return this.f;
    }

    public final O2 getMessageSender() {
        return this.c;
    }

    public final String getName() {
        return this.b;
    }

    public final boolean getSendDownloadEventForContextMenu() {
        return this.g;
    }

    public final String getUserAgent() {
        String userAgentString = getSettings().getUserAgentString();
        Intrinsics.checkNotNullExpressionValue(userAgentString, "settings.userAgentString");
        return userAgentString;
    }

    public final Z get_webChromeClient$uniwebview_release() {
        return this.d;
    }

    public final C0007b0 get_webClient$uniwebview_release() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C0058o c0058o = C0058o.b;
        String message = "UniWebView will load url: '" + url + "' with headers: " + this.e.g;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        C0007b0 c0007b0 = this.e;
        c0007b0.f = 200;
        c0007b0.d = true;
        c0007b0.c = false;
        c0007b0.e = false;
        if (c0007b0.h.a(url, true, true, this.b)) {
            return;
        }
        loadUrl(url, this.e.g);
    }

    @Override // android.view.View
    public final void onCreateContextMenu(ContextMenu contextMenu) {
        final String extra;
        if (this.h && contextMenu != null) {
            super.onCreateContextMenu(contextMenu);
            int type = getHitTestResult().getType();
            if ((type == 5 || type == 8) && (extra = getHitTestResult().getExtra()) != null) {
                String lowerCase = extra.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (StringsKt.startsWith$default(lowerCase, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "https://", false, 2, (Object) null)) {
                    contextMenu.setHeaderTitle(extra).add(0, 1, 0, getContext().getResources().getString(R.string.SAVE_IMAGE)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda2
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return C0092z.a(C0092z.this, extra, menuItem);
                        }
                    });
                }
            }
        }
    }

    public final void setAllowHTTPAuthPopUpWindow(boolean z) {
        this.e.l = z;
    }

    public final void setCalloutEnabled(boolean z) {
        this.h = z;
    }

    public final void setDefaultFontSize(int i2) {
        getSettings().setDefaultFontSize(MathKt.roundToInt(i2 / this.a.getResources().getConfiguration().fontScale));
    }

    public final void setDragInteractionEnabled(boolean z) {
        if (z) {
            setLongClickable(false);
            setOnLongClickListener(null);
        } else {
            setLongClickable(true);
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C0092z.a(view);
                }
            });
        }
    }

    public final void setOpenLinksInExternalBrowser(boolean z) {
        this.e.h.e = z;
    }

    public final void setSendDownloadEventForContextMenu(boolean z) {
        this.g = z;
    }

    public final void setUserAgent(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        getSettings().setUserAgentString(userAgent);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        this.e.c = true;
        super.stopLoading();
    }

    public static final void a(String identifier, C0092z this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Receive callback of adding JavaScript: ", it, c0058o, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, P2.AddJavaScriptFinished, new D2(identifier, "0", "", null));
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.c.a(this$0.b, P2.AddJavaScriptFinished, new D2(identifier, "-1", it, null));
        }
    }

    public final void c() {
        Object systemService = this.a.getSystemService("print");
        PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
        if (printManager == null) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Didn't find a valid print service in current activity. Abort printing...", "message");
            c0058o.a(EnumC0054n.CRITICAL, "Didn't find a valid print service in current activity. Abort printing...");
            return;
        }
        String url = getUrl();
        if (url == null) {
            C0058o c0058o2 = C0058o.b;
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter("The URL of page is null. Abort printing...", "message");
            c0058o2.a(EnumC0054n.CRITICAL, "The URL of page is null. Abort printing...");
            return;
        }
        PrintDocumentAdapter createPrintDocumentAdapter = createPrintDocumentAdapter(url);
        Intrinsics.checkNotNullExpressionValue(createPrintDocumentAdapter, "createPrintDocumentAdapter(targetUrl)");
        printManager.print("UniWebView Printing", createPrintDocumentAdapter, new PrintAttributes.Builder().build());
    }

    public final void a() {
        addJavascriptInterface(new E(this.f), "UniWebViewBlobHandler");
        setDownloadListener(new DownloadListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda4
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                C0092z.a(C0092z.this, str, str2, str3, str4, j);
            }
        });
    }

    public static final void a(C0092z this$0, final String url, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (StringsKt.startsWith$default(url, "blob:", false, 2, (Object) null)) {
            C0058o c0058o = C0058o.b;
            c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Detected a blob url. Start fetching content: ", url, c0058o, "message"));
            this$0.evaluateJavascript("\n                    function uv_downloadBlob(blobUrl, callback) {\n                      fetch(blobUrl)\n                        .then(response => response.blob())\n                        .then(blob => {\n                          const reader = new FileReader();\n                          reader.onloadend = () => {\n                            callback(reader.result);\n                          };\n                          reader.readAsDataURL(blob);\n                        }\n                      )\n                      .catch(error => console.error('Error fetching blob:', error));\n                    }\n                    \n                uv_downloadBlob('" + url + "', function(uri) { UniWebViewBlobHandler.handleDataURI(uri); });", new ValueCallback() { // from class: com.onevcat.uniwebview.internal.obfuscated.z$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C0092z.b(url, (String) obj);
                }
            });
            return;
        }
        this$0.f.a(url, str2, str3, true);
    }

    public static final void b(String identifier, C0092z this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Receive callback of evaluating JavaScript: ", it, c0058o, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, P2.EvalJavaScriptFinished, new D2(identifier, "0", "", null));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        String replace = new Regex("^\"|\"$").replace(it, "");
        Intrinsics.checkNotNullParameter(replace, "<this>");
        StringBuilder sb = new StringBuilder(replace.length());
        int i2 = 0;
        while (i2 < replace.length()) {
            char charAt = replace.charAt(i2);
            char c = '\\';
            if (charAt == '\\') {
                char charAt2 = i2 == replace.length() - 1 ? '\\' : replace.charAt(i2 + 1);
                if ('0' > charAt2 || charAt2 >= '8') {
                    if (charAt2 != '\\') {
                        if (charAt2 == 'b') {
                            charAt = '\b';
                        } else if (charAt2 == 'n') {
                            charAt = '\n';
                        } else if (charAt2 == 'r') {
                            charAt = '\r';
                        } else if (charAt2 == 't') {
                            charAt = '\t';
                        } else {
                            c = Typography.quote;
                            if (charAt2 != '\"') {
                                c = '\'';
                                if (charAt2 != '\'') {
                                    c = 'u';
                                    if (charAt2 == 'u') {
                                        if (i2 < replace.length() - 5) {
                                            sb.append(Character.toChars(Integer.parseInt("" + replace.charAt(i2 + 2) + replace.charAt(i2 + 3) + replace.charAt(i2 + 4) + replace.charAt(i2 + 5), CharsKt.checkRadix(16))));
                                            i2 += 6;
                                        }
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                    charAt = c;
                    i2++;
                } else {
                    String str = "" + charAt2;
                    int i3 = i2 + 1;
                    if (i3 < replace.length() - 1) {
                        int i4 = i2 + 2;
                        if (Intrinsics.compare((int) replace.charAt(i4), 48) >= 0 && Intrinsics.compare((int) replace.charAt(i4), 55) <= 0) {
                            str = str + replace.charAt(i4);
                            if (i4 < replace.length() - 1) {
                                i3 = i2 + 3;
                                if (Intrinsics.compare((int) replace.charAt(i3), 48) >= 0 && Intrinsics.compare((int) replace.charAt(i3), 55) <= 0) {
                                    str = str + replace.charAt(i3);
                                }
                            }
                            i3 = i4;
                        }
                    }
                    sb.append((char) Integer.parseInt(str, CharsKt.checkRadix(8)));
                    i2 = i3 + 1;
                }
            }
            sb.append(charAt);
            i2++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        this$0.c.a(this$0.b, P2.EvalJavaScriptFinished, new D2(identifier, "0", sb2, null));
    }

    public static final boolean a(C0092z this$0, String originalUrl, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalUrl, "$originalUrl");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f.a(originalUrl, null, MimeTypeMap.getFileExtensionFromUrl(originalUrl), this$0.g);
        return true;
    }

    public final void a(String identifier, boolean z) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        clearCache(true);
        clearHistory();
        clearFormData();
        if (z) {
            WebStorage.getInstance().deleteAllData();
        }
        this.c.a(this.b, P2.GeneralCallback, identifier);
    }

    public final void a(int i2, int i3, boolean z) {
        if (z) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", getScrollX(), i2);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "scrollY", getScrollY(), i3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofInt, ofInt2);
            animatorSet.setDuration(400L).start();
            return;
        }
        scrollTo(i2, i3);
    }

    public final void b() {
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Checking pop up web view in generalGoBack.", "message");
        EnumC0054n enumC0054n = EnumC0054n.VERBOSE;
        c0058o.a(enumC0054n, "Checking pop up web view in generalGoBack.");
        C0092z c0092z = this.d.i;
        if (c0092z != null) {
            if (c0092z.canGoBack()) {
                Intrinsics.checkNotNullParameter("popupWebView can go back. Performing going back.", "message");
                c0058o.a(enumC0054n, "popupWebView can go back. Performing going back.");
                c0092z.goBack();
                return;
            } else {
                Intrinsics.checkNotNullParameter("popupWebView cannot go back. Performing close.", "message");
                c0058o.a(enumC0054n, "popupWebView cannot go back. Performing close.");
                c0092z.evaluateJavascript("window.close()", null);
                return;
            }
        }
        Intrinsics.checkNotNullParameter("Checking main web view can go back...", "message");
        c0058o.a(enumC0054n, "Checking main web view can go back...");
        if (canGoBack()) {
            goBack();
        }
    }
}
