package io.bidmachine.iab.script;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidWebView;
import io.bidmachine.rendering.model.ScriptConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\u00020\u0001:\u0002\u000e*B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J%\u0010\u0017\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lio/bidmachine/iab/script/ScriptInjector;", "", "Lio/bidmachine/iab/mraid/MraidWebView;", "webView", "Lio/bidmachine/iab/script/ScriptInjector$MessageReceiver;", "messageReceiver", "<init>", "(Lio/bidmachine/iab/mraid/MraidWebView;Lio/bidmachine/iab/script/ScriptInjector$MessageReceiver;)V", "Landroid/webkit/WebView;", "", "handlerName", "", "allowedOriginRules", "", "a", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;)V", "baseUrl", "", "forMainFrameOnly", "(Ljava/lang/String;Z)Ljava/util/Set;", "", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptConfigs", "injectStart", "(Ljava/lang/String;Ljava/util/List;)Z", "script", "(Ljava/lang/String;Lio/bidmachine/rendering/model/ScriptConfig;)V", "injectAtRuntime", "(Ljava/lang/String;)V", "data", "modifyHtml", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "destroy", "()V", "Lio/bidmachine/iab/mraid/MraidWebView;", "b", "Lio/bidmachine/iab/script/ScriptInjector$MessageReceiver;", "", "c", "Ljava/util/Set;", "handlers", "d", "MessageReceiver", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class ScriptInjector {
    private static final a d = new a(null);
    private static final Object e = "ScriptInjector";

    /* renamed from: a, reason: from kotlin metadata */
    private final MraidWebView webView;

    /* renamed from: b, reason: from kotlin metadata */
    private final MessageReceiver messageReceiver;

    /* renamed from: c, reason: from kotlin metadata */
    private final Set handlers;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/iab/script/ScriptInjector$MessageReceiver;", "", "onMessage", "", "handlerName", "", "message", "Landroidx/webkit/WebMessageCompat;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface MessageReceiver {
        void onMessage(@NotNull String handlerName, @NotNull WebMessageCompat message);
    }

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "WEB_MESSAGE_LISTENER not supported, skipping";
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "unregistered message listener: " + this.a;
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "can't evaluate js: WebView is destroyed";
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "can't evaluate js: js is empty";
        }
    }

    static final class f extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "evaluating js (" + this.a.length() + " chars)";
        }
    }

    static final class g extends Lambda implements Function0 {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "evaluate js complete";
        }
    }

    static final class h extends Lambda implements Function0 {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "loading url via javascript:";
        }
    }

    static final class i extends Lambda implements Function0 {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "installed " + this.a.size() + " document-start scripts";
        }
    }

    static final class j extends Lambda implements Function0 {
        final /* synthetic */ ScriptConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ScriptConfig scriptConfig) {
            super(0);
            this.a = scriptConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "DOCUMENT_START_SCRIPT not supported, skipping: " + this.a.getScriptId();
        }
    }

    static final class k extends Lambda implements Function0 {
        final /* synthetic */ ScriptConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ScriptConfig scriptConfig) {
            super(0);
            this.a = scriptConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "injected document-start script: " + this.a.getScriptId();
        }
    }

    static final class m extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "WEB_MESSAGE_LISTENER not supported, skipping: " + this.a;
        }
    }

    static final class n extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "registered message listener: " + this.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScriptInjector(@NotNull MraidWebView webView) {
        this(webView, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str) {
        MraidLog.d(e, g.a);
    }

    @SuppressLint({"RequiresFeature"})
    public final void destroy() {
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            MraidLog.w(e, b.a);
            return;
        }
        for (String str : this.handlers) {
            try {
                WebViewCompat.removeWebMessageListener(this.webView, str);
                MraidLog.d(e, new c(str));
            } catch (Throwable th) {
                MraidLog.e(e, th);
            }
        }
        this.handlers.clear();
    }

    public final void injectAtRuntime(@Nullable String script) {
        if (this.webView.getIsDestroyed()) {
            MraidLog.d(e, d.a);
            return;
        }
        if (script == null || script.length() == 0) {
            MraidLog.d(e, e.a);
            return;
        }
        try {
            MraidLog.d(e, new f(script));
            this.webView.evaluateJavascript(script, new ValueCallback() { // from class: io.bidmachine.iab.script.ScriptInjector$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ScriptInjector.a((String) obj);
                }
            });
        } catch (Throwable th) {
            Object obj = e;
            MraidLog.e(obj, th);
            MraidLog.d(obj, h.a);
            BidMachineNetworkBridge.webviewLoadUrl(this.webView, "javascript:" + script);
        }
    }

    public final boolean injectStart(@Nullable String baseUrl, @NotNull List<ScriptConfig> scriptConfigs) {
        List a2;
        Intrinsics.checkNotNullParameter(scriptConfigs, "scriptConfigs");
        try {
            a2 = ScriptInjectorKt.a(scriptConfigs, ScriptConfig.Type.DocumentStart, ScriptConfig.Type.DocumentEnd);
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                injectStart(baseUrl, (ScriptConfig) it.next());
            }
            MraidLog.d(e, new i(a2));
            return true;
        } catch (Throwable th) {
            MraidLog.e(e, th);
            return false;
        }
    }

    @NotNull
    public final String modifyHtml(@NotNull String data, @NotNull List<ScriptConfig> scriptConfigs) {
        List a2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(scriptConfigs, "scriptConfigs");
        a2 = ScriptInjectorKt.a(scriptConfigs, ScriptConfig.Type.InlineTag);
        return CollectionsKt.joinToString$default(a2, "", null, null, 0, null, new PropertyReference1Impl() { // from class: io.bidmachine.iab.script.ScriptInjector.l
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ScriptConfig) obj).getSource();
            }
        }, 30, null) + data;
    }

    public ScriptInjector(@NotNull MraidWebView webView, @Nullable MessageReceiver messageReceiver) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.messageReceiver = messageReceiver;
        this.handlers = new LinkedHashSet();
    }

    private final void a(WebView webView, final String handlerName, Set allowedOriginRules) {
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            MraidLog.w(e, new m(handlerName));
            return;
        }
        try {
            WebViewCompat.addWebMessageListener(webView, handlerName, allowedOriginRules, new WebViewCompat.WebMessageListener() { // from class: io.bidmachine.iab.script.ScriptInjector$$ExternalSyntheticLambda1
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(WebView webView2, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
                    ScriptInjector.a(ScriptInjector.this, handlerName, webView2, webMessageCompat, uri, z, javaScriptReplyProxy);
                }
            });
            this.handlers.add(handlerName);
            MraidLog.d(e, new n(handlerName));
        } catch (Throwable th) {
            MraidLog.e(e, th);
        }
    }

    public /* synthetic */ ScriptInjector(MraidWebView mraidWebView, MessageReceiver messageReceiver, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mraidWebView, (i2 & 2) != 0 ? null : messageReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScriptInjector this$0, String handlerName, WebView webView, WebMessageCompat message, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(handlerName, "$handlerName");
        Intrinsics.checkNotNullParameter(webView, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(uri, "<anonymous parameter 2>");
        Intrinsics.checkNotNullParameter(javaScriptReplyProxy, "<anonymous parameter 4>");
        MessageReceiver messageReceiver = this$0.messageReceiver;
        if (messageReceiver != null) {
            messageReceiver.onMessage(handlerName, message);
        }
    }

    private final Set a(String baseUrl, boolean forMainFrameOnly) {
        if (baseUrl != null && forMainFrameOnly) {
            return SetsKt.setOf(baseUrl);
        }
        if (forMainFrameOnly) {
            return SetsKt.setOf(IabSettings.DEF_BASE_URL);
        }
        return SetsKt.setOf(Marker.ANY_MARKER);
    }

    @SuppressLint({"RequiresFeature"})
    public final void injectStart(@Nullable String baseUrl, @NotNull ScriptConfig script) {
        String a2;
        Intrinsics.checkNotNullParameter(script, "script");
        if (!WebViewFeature.isFeatureSupported("DOCUMENT_START_SCRIPT")) {
            MraidLog.w(e, new j(script));
            return;
        }
        Set a3 = a(baseUrl, script.getForMainFrameOnly());
        MraidWebView mraidWebView = this.webView;
        a2 = ScriptInjectorKt.a(script);
        WebViewCompat.addDocumentStartJavaScript(mraidWebView, a2, a3);
        MraidLog.d(e, new k(script));
        String messageHandler = script.getMessageHandler();
        if (messageHandler != null) {
            a(this.webView, messageHandler, a3);
        }
    }
}
