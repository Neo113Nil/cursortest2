package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: HttpTimeout.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class HttpTimeoutKt$HttpTimeout$2 extends AdaptedFunctionReference implements Function0 {
    public static final HttpTimeoutKt$HttpTimeout$2 INSTANCE = new HttpTimeoutKt$HttpTimeout$2();

    HttpTimeoutKt$HttpTimeout$2() {
        super(0, HttpTimeoutConfig.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final HttpTimeoutConfig mo4828invoke() {
        return new HttpTimeoutConfig(null, null, null, 7, null);
    }
}
