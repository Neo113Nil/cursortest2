package io.ktor.http.cio;

import io.ktor.http.HttpHeaders;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.MutableRange;
import io.ktor.http.cio.internals.TokenizerKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.LineEndingMode;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpParser.kt */
/* loaded from: classes10.dex */
public abstract class HttpParserKt {
    private static final Set hostForbiddenSymbols = SetsKt.setOf((Object[]) new Character[]{'/', '?', '#', '@'});
    private static final int httpLineEndings;
    private static final AsciiCharTree versions;

    static {
        LineEndingMode.Companion companion = LineEndingMode.Companion;
        httpLineEndings = LineEndingMode.m8016plus1TerO4(companion.m8020getCRLFf0jXZW8(), companion.m8021getLFf0jXZW8());
        versions = AsciiCharTree.Companion.build(CollectionsKt.listOf((Object[]) new String[]{"HTTP/1.0", "HTTP/1.1"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:14:0x006c, B:16:0x0074, B:19:0x007c, B:22:0x0090, B:33:0x00b0, B:34:0x00b7, B:35:0x00b8, B:37:0x00c4), top: B:13:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:14:0x006c, B:16:0x0074, B:19:0x007c, B:22:0x0090, B:33:0x00b0, B:34:0x00b7, B:35:0x00b8, B:37:0x00c4), top: B:13:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:13:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parseHeaders(ByteReadChannel byteReadChannel, CharArrayBuilder charArrayBuilder, MutableRange mutableRange, Continuation continuation) {
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$2;
        int i;
        HttpHeadersMap httpHeadersMap;
        Throwable th;
        Object m8007readUTF8LineToRRvyBJ8;
        HttpHeadersMap httpHeadersMap2;
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$22;
        if (continuation instanceof HttpParserKt$parseHeaders$2) {
            httpParserKt$parseHeaders$2 = (HttpParserKt$parseHeaders$2) continuation;
            int i2 = httpParserKt$parseHeaders$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$2.label = i2 - Integer.MIN_VALUE;
                Object obj = httpParserKt$parseHeaders$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpParserKt$parseHeaders$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    httpHeadersMap = new HttpHeadersMap(charArrayBuilder);
                    int i3 = httpLineEndings;
                    httpParserKt$parseHeaders$2.L$0 = byteReadChannel;
                    httpParserKt$parseHeaders$2.L$1 = charArrayBuilder;
                    httpParserKt$parseHeaders$2.L$2 = mutableRange;
                    httpParserKt$parseHeaders$2.L$3 = httpHeadersMap;
                    httpParserKt$parseHeaders$2.label = 1;
                    m8007readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8007readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i3, httpParserKt$parseHeaders$2);
                    if (m8007readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    HttpHeadersMap httpHeadersMap3 = (HttpHeadersMap) httpParserKt$parseHeaders$2.L$3;
                    MutableRange mutableRange2 = (MutableRange) httpParserKt$parseHeaders$2.L$2;
                    CharArrayBuilder charArrayBuilder2 = (CharArrayBuilder) httpParserKt$parseHeaders$2.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) httpParserKt$parseHeaders$2.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$23 = httpParserKt$parseHeaders$2;
                        httpHeadersMap2 = httpHeadersMap3;
                        byteReadChannel = byteReadChannel2;
                        httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$23;
                        mutableRange = mutableRange2;
                        charArrayBuilder = charArrayBuilder2;
                    } catch (Throwable th2) {
                        th = th2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                    try {
                        if (((Boolean) obj).booleanValue()) {
                            httpHeadersMap2.release();
                            return null;
                        }
                        mutableRange.setEnd(charArrayBuilder.length());
                        int end = mutableRange.getEnd() - mutableRange.getStart();
                        if (end == 0) {
                            CharSequence charSequence = httpHeadersMap2.get(HttpHeaders.INSTANCE.getHost());
                            if (charSequence != null) {
                                validateHostHeader(charSequence);
                            }
                            return httpHeadersMap2;
                        }
                        if (end >= 8192) {
                            throw new IllegalStateException("Header line length limit exceeded");
                        }
                        int start = mutableRange.getStart();
                        int parseHeaderName = parseHeaderName(charArrayBuilder, mutableRange);
                        int end2 = mutableRange.getEnd();
                        parseHeaderValue(charArrayBuilder, mutableRange);
                        int start2 = mutableRange.getStart();
                        int end3 = mutableRange.getEnd();
                        mutableRange.setStart(end2);
                        httpHeadersMap2.put(start, parseHeaderName, start2, end3);
                        httpHeadersMap = httpHeadersMap2;
                        httpParserKt$parseHeaders$2 = httpParserKt$parseHeaders$22;
                        try {
                            int i32 = httpLineEndings;
                            httpParserKt$parseHeaders$2.L$0 = byteReadChannel;
                            httpParserKt$parseHeaders$2.L$1 = charArrayBuilder;
                            httpParserKt$parseHeaders$2.L$2 = mutableRange;
                            httpParserKt$parseHeaders$2.L$3 = httpHeadersMap;
                            httpParserKt$parseHeaders$2.label = 1;
                            m8007readUTF8LineToRRvyBJ8 = ByteReadChannelOperationsKt.m8007readUTF8LineToRRvyBJ8(byteReadChannel, charArrayBuilder, 8192, i32, httpParserKt$parseHeaders$2);
                            if (m8007readUTF8LineToRRvyBJ8 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$24 = httpParserKt$parseHeaders$2;
                            httpHeadersMap2 = httpHeadersMap;
                            obj = m8007readUTF8LineToRRvyBJ8;
                            httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$24;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            httpHeadersMap3 = httpHeadersMap;
                            httpHeadersMap3.release();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpHeadersMap3 = httpHeadersMap2;
                        httpHeadersMap3.release();
                        throw th;
                    }
                }
            }
        }
        httpParserKt$parseHeaders$2 = new HttpParserKt$parseHeaders$2(continuation);
        Object obj2 = httpParserKt$parseHeaders$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpParserKt$parseHeaders$2.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object parseHeaders$default(ByteReadChannel byteReadChannel, CharArrayBuilder charArrayBuilder, MutableRange mutableRange, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            mutableRange = new MutableRange(0, 0);
        }
        return parseHeaders(byteReadChannel, charArrayBuilder, mutableRange, continuation);
    }

    private static final void validateHostHeader(CharSequence charSequence) {
        if (StringsKt.endsWith$default(charSequence, (CharSequence) ":", false, 2, (Object) null)) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Set set = hostForbiddenSymbols;
            if (set.contains(Character.valueOf(charAt))) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }

    public static final int parseHeaderName(CharArrayBuilder text, MutableRange range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int end = range.getEnd();
        for (int start = range.getStart(); start < end; start++) {
            char charAt = text.charAt(start);
            if (charAt == ':' && start != range.getStart()) {
                range.setStart(start + 1);
                return start;
            }
            if (isDelimiter(charAt)) {
                parseHeaderNameFailed(text, start, range.getStart(), charAt);
                throw new KotlinNothingValueException();
            }
        }
        noColonFound(text, range);
        throw new KotlinNothingValueException();
    }

    private static final Void parseHeaderNameFailed(CharArrayBuilder charArrayBuilder, int i, int i2, char c) {
        if (c == ':') {
            throw new ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i == i2) {
            throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        characterIsNotAllowed(charArrayBuilder, c);
        throw new KotlinNothingValueException();
    }

    public static final void parseHeaderValue(CharArrayBuilder text, MutableRange range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int start = range.getStart();
        int end = range.getEnd();
        int skipSpacesAndHorizontalTabs = TokenizerKt.skipSpacesAndHorizontalTabs(text, start, end);
        if (skipSpacesAndHorizontalTabs >= end) {
            range.setStart(end);
            return;
        }
        int i = skipSpacesAndHorizontalTabs;
        int i2 = i;
        while (i < end) {
            char charAt = text.charAt(i);
            if (charAt != '\t') {
                if (charAt == '\n' || charAt == '\r') {
                    characterIsNotAllowed(text, charAt);
                    throw new KotlinNothingValueException();
                }
                if (charAt != ' ') {
                    i2 = i;
                }
            }
            i++;
        }
        range.setStart(skipSpacesAndHorizontalTabs);
        range.setEnd(i2 + 1);
    }

    private static final Void noColonFound(CharSequence charSequence, MutableRange mutableRange) {
        throw new ParserException("No colon in HTTP header in " + charSequence.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    private static final Void characterIsNotAllowed(CharSequence charSequence, char c) {
        throw new ParserException("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    private static final boolean isDelimiter(char c) {
        return Intrinsics.compare((int) c, 32) <= 0 || StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (Object) null);
    }
}
