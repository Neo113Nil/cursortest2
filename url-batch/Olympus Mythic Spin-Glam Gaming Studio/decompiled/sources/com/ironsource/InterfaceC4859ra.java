package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC4859ra {

    /* renamed from: com.ironsource.ra$a */
    public static final class a implements InterfaceC4859ra {

        @Nullable
        private WebView a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webViewEvaluateJavaScript(webView, str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, "javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC4859ra
        public boolean a() {
            return this.a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC4859ra
        public void a(@NotNull String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                C4782n4.d().a(th);
                this.b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC4859ra
        public void a(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.a = webView;
        }
    }

    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();
}
