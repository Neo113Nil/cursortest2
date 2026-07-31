package com.vungle.ads.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes3.dex */
public final class w0 extends Lambda implements Function0 {
    public static final w0 a = new w0();

    public w0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return JsonKt.Json$default(null, v0.a, 1, null);
    }
}
