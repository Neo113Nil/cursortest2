package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SaveBody.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
/* synthetic */ class DoubleReceivePluginKt$SaveBodyPlugin$1 extends FunctionReferenceImpl implements Function0 {
    public static final DoubleReceivePluginKt$SaveBodyPlugin$1 INSTANCE = new DoubleReceivePluginKt$SaveBodyPlugin$1();

    DoubleReceivePluginKt$SaveBodyPlugin$1() {
        super(0, SaveBodyPluginConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final SaveBodyPluginConfig mo4828invoke() {
        return new SaveBodyPluginConfig();
    }
}
