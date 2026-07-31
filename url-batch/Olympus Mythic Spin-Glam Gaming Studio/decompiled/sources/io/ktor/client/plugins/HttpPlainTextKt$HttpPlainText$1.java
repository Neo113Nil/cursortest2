package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HttpPlainText.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class HttpPlainTextKt$HttpPlainText$1 extends FunctionReferenceImpl implements Function0 {
    public static final HttpPlainTextKt$HttpPlainText$1 INSTANCE = new HttpPlainTextKt$HttpPlainText$1();

    HttpPlainTextKt$HttpPlainText$1() {
        super(0, HttpPlainTextConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final HttpPlainTextConfig mo4828invoke() {
        return new HttpPlainTextConfig();
    }
}
