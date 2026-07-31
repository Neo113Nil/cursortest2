package yads;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class r11 extends sz2 {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a = zt.c.newDecoder();
    public final CharsetDecoder b = zt.b.newDecoder();

    @Override // yads.sz2
    public final ht1 a(jt1 jt1Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new ht1(new v11(bArr, null, null));
        }
        Matcher matcher = c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String a = lh.a(group);
                a.getClass();
                if (a.equals("streamurl")) {
                    str3 = group2;
                } else if (a.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new ht1(new v11(bArr, str2, str3));
    }
}
