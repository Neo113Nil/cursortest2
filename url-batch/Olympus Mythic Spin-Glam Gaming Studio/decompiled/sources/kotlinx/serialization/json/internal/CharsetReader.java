package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CharsetReader.kt */
/* loaded from: classes3.dex */
public final class CharsetReader {
    private final ByteBuffer byteBuffer;
    private final Charset charset;
    private final CharsetDecoder decoder;
    private boolean hasLeftoverPotentiallySurrogateChar;
    private final InputStream inputStream;
    private char leftoverChar;

    public CharsetReader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.decoder = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        this.byteBuffer = wrap;
        wrap.flip();
    }

    public final int read(char[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= array.length || i2 < 0 || i + i2 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + array.length).toString());
        }
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[i] = this.leftoverChar;
            i++;
            i2--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        }
        if (i2 == 1) {
            int oneShotReadSlowPath = oneShotReadSlowPath();
            if (oneShotReadSlowPath != -1) {
                array[i] = (char) oneShotReadSlowPath;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        return doRead(array, i, i2) + i3;
    }

    private final int doRead(char[] cArr, int i, int i2) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult decode = this.decoder.decode(this.byteBuffer, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining()) {
                    break;
                }
                if (fillByteBuffer() < 0) {
                    if (wrap.position() == 0 && !this.byteBuffer.hasRemaining()) {
                        z = true;
                        break;
                    }
                    this.decoder.reset();
                    z = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    wrap.position();
                    break;
                }
                decode.throwException();
            }
        }
        if (z) {
            this.decoder.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int limit = this.byteBuffer.limit();
            int position = this.byteBuffer.position();
            int read = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.byteBuffer.flip();
            return this.byteBuffer.remaining();
        } finally {
            this.byteBuffer.flip();
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] cArr = new char[2];
        int read = read(cArr, 0, 2);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return cArr[0];
        }
        if (read == 2) {
            this.leftoverChar = cArr[1];
            this.hasLeftoverPotentiallySurrogateChar = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + read).toString());
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] array = this.byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        byteArrayPool8k.release(array);
    }
}
