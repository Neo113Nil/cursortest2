package com.yandex.div.core;

import android.net.Uri;
import com.yandex.div.core.images.LoadReference;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivRequestExecutor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0004\b\t\n\u000bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor;", "", "execute", "Lcom/yandex/div/core/images/LoadReference;", "request", "Lcom/yandex/div/core/DivRequestExecutor$Request;", "callback", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "Callback", "Companion", "Header", "Request", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DivRequestExecutor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Callback;", "", "onFail", "", "onSuccess", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void onFail();

        void onSuccess();
    }

    @NotNull
    LoadReference execute(@NotNull Request request, @Nullable Callback callback);

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Header {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Header(@NotNull String str, @NotNull String str2) {
            this.name = str;
            this.value = str2;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Request;", "", "url", "Landroid/net/Uri;", "method", "", "headers", "", "Lcom/yandex/div/core/DivRequestExecutor$Header;", "body", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/List;", "getMethod", "getUrl", "()Landroid/net/Uri;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request {

        @NotNull
        private final String body;

        @Nullable
        private final List<Header> headers;

        @NotNull
        private final String method;

        @NotNull
        private final Uri url;

        public Request(@NotNull Uri uri, @NotNull String str, @Nullable List<Header> list, @NotNull String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }

        @NotNull
        public final Uri getUrl() {
            return this.url;
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }

        @Nullable
        public final List<Header> getHeaders() {
            return this.headers;
        }

        @NotNull
        public final String getBody() {
            return this.body;
        }
    }

    /* compiled from: DivRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/DivRequestExecutor;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
