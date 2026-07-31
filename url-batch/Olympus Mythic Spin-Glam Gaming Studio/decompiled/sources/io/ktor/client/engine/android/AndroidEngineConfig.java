package io.ktor.client.engine.android;

import io.ktor.client.engine.HttpClientEngineConfig;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidEngineConfig.kt */
/* loaded from: classes3.dex */
public final class AndroidEngineConfig extends HttpClientEngineConfig {
    private int connectTimeout = 100000;
    private int socketTimeout = 100000;
    private Function1 sslManager = new Function1() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit sslManager$lambda$0;
            sslManager$lambda$0 = AndroidEngineConfig.sslManager$lambda$0((HttpsURLConnection) obj);
            return sslManager$lambda$0;
        }
    };
    private Function1 requestConfig = new Function1() { // from class: io.ktor.client.engine.android.AndroidEngineConfig$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit requestConfig$lambda$1;
            requestConfig$lambda$1 = AndroidEngineConfig.requestConfig$lambda$1((HttpURLConnection) obj);
            return requestConfig$lambda$1;
        }
    };

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getSocketTimeout() {
        return this.socketTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sslManager$lambda$0(HttpsURLConnection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1 getSslManager() {
        return this.sslManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestConfig$lambda$1(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        return Unit.INSTANCE;
    }

    public final Function1 getRequestConfig() {
        return this.requestConfig;
    }
}
