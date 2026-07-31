package com.apollographql.apollo.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.exception.DefaultApolloException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.Source;
import okio.Timeout;
import org.apache.commons.io.IOUtils;

/* compiled from: MultipartReader.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0003\u001e\u001f B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader;", "Ljava/io/Closeable;", "Lokio/Closeable;", "source", "Lokio/BufferedSource;", "boundary", "", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "getBoundary", "()Ljava/lang/String;", "dashDashBoundary", "Lokio/ByteString;", "crlfDashDashBoundary", "partCount", "", "closed", "", "noMoreParts", "currentPart", "Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "nextPart", "Lcom/apollographql/apollo/internal/MultipartReader$Part;", "currentPartBytesRemaining", "", "maxResult", "afterBoundaryOptions", "Lokio/Options;", "close", "", "PartSource", "Part", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable {
    private static final Companion Companion = new Companion(null);
    private final Options afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final BufferedSource source;

    public MultipartReader(BufferedSource source, String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
        this.afterBoundaryOptions = Options.INSTANCE.of(ByteString.INSTANCE.encodeUtf8("\r\n--" + boundary + "--"), ByteString.INSTANCE.encodeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS), ByteString.INSTANCE.encodeUtf8("--"), ByteString.INSTANCE.encodeUtf8(" "), ByteString.INSTANCE.encodeUtf8("\t"));
    }

    public final String getBoundary() {
        return this.boundary;
    }

    public final Part nextPart() {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z = false;
        while (true) {
            int select = this.source.select(this.afterBoundaryOptions);
            if (select == -1) {
                if (this.source.exhausted()) {
                    throw new DefaultApolloException("premature end of multipart body", null, 2, null);
                }
                throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (select == 0) {
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (select == 1) {
                this.partCount++;
                List readHeaders = Companion.readHeaders(this.source);
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, Okio.buffer(partSource));
            }
            if (select == 2) {
                if (z) {
                    throw new DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.partCount == 0) {
                    throw new DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (select == 3 || select == 4) {
                z = true;
            }
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "Lokio/Source;", "<init>", "(Lcom/apollographql/apollo/internal/MultipartReader;)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class PartSource implements Source {
        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount >= 0) {
                if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                    long currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(byteCount);
                    if (currentPartBytesRemaining == 0) {
                        return -1L;
                    }
                    return MultipartReader.this.source.read(sink, currentPartBytesRemaining);
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return MultipartReader.this.source.getTimeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) {
        this.source.require(this.crlfDashDashBoundary.size());
        long indexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        if (indexOf == -1) {
            return Math.min(maxResult, (this.source.getBuffer().size() - this.crlfDashDashBoundary.size()) + 1);
        }
        return Math.min(maxResult, indexOf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokio/Closeable;", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "body", "Lokio/BufferedSource;", "<init>", "(Ljava/util/List;Lokio/BufferedSource;)V", "getHeaders", "()Ljava/util/List;", "getBody", "()Lokio/BufferedSource;", "close", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Part implements Closeable {
        private final BufferedSource body;
        private final List<HttpHeader> headers;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public Part(List<HttpHeader> headers, BufferedSource body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        public final List<HttpHeader> getHeaders() {
            return this.headers;
        }

        public final BufferedSource getBody() {
            return this.body;
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Companion;", "", "<init>", "()V", "readHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "source", "Lokio/BufferedSource;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HttpHeader> readHeaders(BufferedSource source) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readUtf8LineStrict = source.readUtf8LineStrict();
                String str = readUtf8LineStrict;
                if (str.length() == 0) {
                    return arrayList;
                }
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
                if (indexOf$default == -1) {
                    throw new IllegalStateException(("Unexpected header: " + readUtf8LineStrict).toString());
                }
                String substring = readUtf8LineStrict.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String obj = StringsKt.trim((CharSequence) substring).toString();
                String substring2 = readUtf8LineStrict.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                arrayList.add(new HttpHeader(obj, StringsKt.trim((CharSequence) substring2).toString()));
            }
        }
    }
}
