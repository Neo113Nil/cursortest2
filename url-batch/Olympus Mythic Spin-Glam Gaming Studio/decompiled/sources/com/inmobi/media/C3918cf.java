package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3918cf implements InterfaceC3892bf {
    public final int a;
    public final ByteString b;
    public final We c;

    public C3918cf(String resolvedUrl, int i, ByteString bodyBytes, We responseMetaData) {
        Intrinsics.checkNotNullParameter(resolvedUrl, "resolvedUrl");
        Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
        Intrinsics.checkNotNullParameter(responseMetaData, "responseMetaData");
        this.a = i;
        this.b = bodyBytes;
        this.c = responseMetaData;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final Object a() {
        Intrinsics.checkNotNullParameter(C4409v4.class, "clazz");
        Intrinsics.checkNotNullParameter(C4409v4.class, "type");
        JSONObject jsonObject = new JSONObject(this.b.string(Charsets.UTF_8));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(C4409v4.class, "type");
        return C4409v4.class.cast(AbstractC4494ya.a(jsonObject, C4409v4.class, null, null));
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final We b() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final int c() {
        return this.a;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.InterfaceC3892bf
    public final String e() {
        return null;
    }
}
