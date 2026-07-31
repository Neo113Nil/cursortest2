package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import io.bidmachine.rendering.utils.BaseWebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J?\u0010\u0017\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/bidmachine/iab/mraid/MraidWebChromeClient;", "Lio/bidmachine/rendering/utils/BaseWebChromeClient;", "<init>", "()V", "Landroid/webkit/JsResult;", "result", "", "a", "(Landroid/webkit/JsResult;)Z", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/webkit/WebView;", "view", "", "url", "message", "onJsAlert", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "onJsConfirm", "defaultValue", "Landroid/webkit/JsPromptResult;", "onJsPrompt", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MraidWebChromeClient extends BaseWebChromeClient {

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ ConsoleMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConsoleMessage consoleMessage) {
            super(0);
            this.a = str;
            this.b = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            String str;
            String str2 = this.a;
            if (str2 == null || str2.length() == 0) {
                str = "";
            } else {
                str = " at " + this.a;
            }
            return this.b.message() + str + ':' + this.b.lineNumber();
        }
    }

    static final class b extends Lambda implements Function0 {
        final /* synthetic */ ConsoleMessage a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ConsoleMessage consoleMessage) {
            super(0);
            this.a = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            String message = this.a.message();
            Intrinsics.checkNotNullExpressionValue(message, "consoleMessage.message()");
            return StringsKt.replace$default(message, "AppodealAlert:", "", false, 4, (Object) null);
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
            return String.valueOf(this.a);
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return String.valueOf(this.a);
        }
    }

    static final class e extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return String.valueOf(this.a);
        }
    }

    private final boolean a(JsResult result) {
        result.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"DefaultLocale"})
    public boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.message() == null) {
            return false;
        }
        MraidLog mraidLog = MraidLog.INSTANCE;
        if (mraidLog.canSendDLog()) {
            String message = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(message, "consoleMessage.message()");
            if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "Uncaught ReferenceError", false, 2, (Object) null)) {
                MraidLog.d("JS console", new a(consoleMessage.sourceId(), consoleMessage));
            }
        }
        if (!mraidLog.canSendELog()) {
            return true;
        }
        String message2 = consoleMessage.message();
        Intrinsics.checkNotNullExpressionValue(message2, "consoleMessage.message()");
        if (!StringsKt.contains$default((CharSequence) message2, (CharSequence) "AppodealAlert", false, 2, (Object) null)) {
            return true;
        }
        MraidLog.e("Appodeal", new b(consoleMessage));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(@Nullable WebView view, @Nullable String url, @Nullable String message, @NotNull JsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        MraidLog.d("JS alert", new c(message));
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(@Nullable WebView view, @Nullable String url, @Nullable String message, @NotNull JsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        MraidLog.d("JS confirm", new d(message));
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(@Nullable WebView view, @Nullable String url, @Nullable String message, @Nullable String defaultValue, @NotNull JsPromptResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        MraidLog.d("JS prompt", new e(message));
        return a(result);
    }
}
