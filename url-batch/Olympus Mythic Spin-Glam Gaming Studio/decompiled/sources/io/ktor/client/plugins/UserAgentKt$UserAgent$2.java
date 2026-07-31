package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: UserAgent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class UserAgentKt$UserAgent$2 extends AdaptedFunctionReference implements Function0 {
    public static final UserAgentKt$UserAgent$2 INSTANCE = new UserAgentKt$UserAgent$2();

    UserAgentKt$UserAgent$2() {
        super(0, UserAgentConfig.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final UserAgentConfig mo4828invoke() {
        return new UserAgentConfig(null, 1, null);
    }
}
