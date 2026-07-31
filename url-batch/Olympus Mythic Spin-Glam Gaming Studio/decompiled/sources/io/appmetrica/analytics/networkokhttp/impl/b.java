package io.appmetrica.analytics.networkokhttp.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes9.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ Response a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Response response) {
        super(0);
        this.a = response;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ResponseBody body = this.a.body();
        if (body != null) {
            return body.byteStream();
        }
        return null;
    }
}
