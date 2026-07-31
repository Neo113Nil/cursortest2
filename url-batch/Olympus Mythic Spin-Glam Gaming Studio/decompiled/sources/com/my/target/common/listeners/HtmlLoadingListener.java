package com.my.target.common.listeners;

import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public abstract class HtmlLoadingListener {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class CommonError implements Error {
        private final int a;
        private final String b;

        public static HttpError a(int i, String str) {
            return new HttpError(i, str);
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener.Error
        public int getCode() {
            return this.a;
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener.Error
        @NonNull
        public String getDescription() {
            return this.b;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface Error {
        int getCode();

        @NonNull
        String getDescription();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class HttpError implements Error {
        private final int a;
        private final String b;

        private HttpError(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public static HttpError a(int i, String str) {
            return new HttpError(i, str);
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener.Error
        public int getCode() {
            return this.a;
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener.Error
        @NonNull
        public String getDescription() {
            return this.b;
        }
    }

    public abstract void onError(@NonNull WebView webView, @NonNull Error error, @Nullable String str);

    public abstract void onPageFinished(@NonNull WebView webView, @NonNull String str);

    public abstract void onPageStarted(@NonNull WebView webView, @NonNull String str, @Nullable Bitmap bitmap);
}
