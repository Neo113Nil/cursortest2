package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: TextContent.kt */
/* loaded from: classes4.dex */
public final class TextContent extends OutgoingContent.ByteArrayContent {
    private final byte[] bytes;
    private final ContentType contentType;
    private final HttpStatusCode status;
    private final String text;

    public /* synthetic */ TextContent(String str, ContentType contentType, HttpStatusCode httpStatusCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contentType, (i & 4) != 0 ? null : httpStatusCode);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public TextContent(String text, ContentType contentType, HttpStatusCode httpStatusCode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.text = text;
        this.contentType = contentType;
        this.status = httpStatusCode;
        Charset charset = ContentTypesKt.charset(getContentType());
        this.bytes = StringsKt.toByteArray(text, charset == null ? Charsets.UTF_8 : charset);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(this.bytes.length);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    public byte[] bytes() {
        return this.bytes;
    }

    public String toString() {
        return "TextContent[" + getContentType() + "] \"" + kotlin.text.StringsKt.take(this.text, 30) + '\"';
    }
}
