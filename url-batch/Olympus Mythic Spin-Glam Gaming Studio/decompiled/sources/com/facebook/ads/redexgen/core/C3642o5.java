package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.o5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3642o5 implements InterfaceC2173Bd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, 29, 29, 12, 4, 25, 29, 12, 13, 73, 29, 6, 73, 10, 27, 12, 8, 29, 12, 73, 13, 12, 10, 6, 13, 12, 27, 73, 15, 6, 27, 73, 28, 7, 26, 28, 25, 25, 6, 27, 29, 12, 13, 73, 36, 32, 36, 44, 73, 29, 16, 25, 12, 83, 73, 25, 8, 8, 20, 17, 27, 25, 12, 17, 23, 22, 87, 17, 28, 75, 19, 2, 2, 30, 27, 17, 19, 6, 27, 29, 28, 93, 10, 95, 23, 31, 1, 21, 5, 20, 20, 8, 13, 7, 5, 16, 13, 11, 10, 75, 28, 73, 13, 7, 29, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 35, 118, 40, 56, 47, 62, 104, 110};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2173Bd
    public final InterfaceC2344Hw A5J(C3778qI c3778qI) {
        char c;
        String str = c3778qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    String mimeType = A00(88, 17, 73);
                    if (str.equals(mimeType)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    String mimeType2 = A00(55, 15, 85);
                    if (str.equals(mimeType2)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    String mimeType3 = A00(70, 18, 95);
                    if (str.equals(mimeType3)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    String mimeType4 = A00(105, 20, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                    if (str.equals(mimeType4)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new C9U();
                case 1:
                    return new AbstractC3550mZ() { // from class: com.facebook.ads.redexgen.X.9d
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        private final EventMessage A00(C20254v c20254v) {
                            return new EventMessage((String) AbstractC20023y.A01(c20254v.A0U()), (String) AbstractC20023y.A01(c20254v.A0U()), c20254v.A0P(), c20254v.A0P(), Arrays.copyOfRange(c20254v.A0l(), c20254v.A09(), c20254v.A0A()));
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC3550mZ
                        public final Metadata A0R(C21329e c21329e, ByteBuffer byteBuffer) {
                            return new Metadata(A00(new C20254v(byteBuffer.array(), byteBuffer.limit())));
                        }
                    };
                case 2:
                    return new AbstractC3550mZ() { // from class: com.facebook.ads.redexgen.X.94
                        public static String[] A03 = {"LinnqKc1r0Ls5OIb", "1aWHF9GftncklZYsR1NJvylUpCZwYQhA", "WIGwItTSIaUh0S", "86hqVYxCYoyBTLzVv0XRyx6tGel5Hfof", "L8UaESXrw6FNBEuX", "ZSKLe1wjy7TzDmQANFt3bVwH52LTNoGA", "sWuUgP3CrL0lX60YF5iqvlGlBvq7Icsz", "4dV7lZySL5Inrb"};
                        public AnonymousClass53 A00;
                        public final C20254v A02 = new C20254v();
                        public final C20244u A01 = new C20244u();

                        @Override // com.facebook.ads.redexgen.core.AbstractC3550mZ
                        public final Metadata A0R(C21329e c21329e, ByteBuffer byteBuffer) {
                            if (this.A00 == null || c21329e.A00 != this.A00.A04()) {
                                this.A00 = new AnonymousClass53(c21329e.A01);
                                this.A00.A05(c21329e.A01 - c21329e.A00);
                            }
                            byte[] array = byteBuffer.array();
                            int size = byteBuffer.limit();
                            this.A02.A0j(array, size);
                            this.A01.A0E(array, size);
                            this.A01.A09(39);
                            long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
                            this.A01.A09(20);
                            int A042 = this.A01.A04(12);
                            int spliceCommandType = this.A01.A04(8);
                            Metadata.Entry entry = null;
                            this.A02.A0g(14);
                            switch (spliceCommandType) {
                                case 0:
                                    entry = new SpliceNullCommand();
                                    break;
                                case 4:
                                    entry = SpliceScheduleCommand.A00(this.A02);
                                    break;
                                case 5:
                                    C20254v c20254v = this.A02;
                                    String[] strArr = A03;
                                    if (strArr[0].length() == strArr[4].length()) {
                                        String[] strArr2 = A03;
                                        strArr2[0] = "3zG9Y3L3pcSl9hsO";
                                        strArr2[4] = "rzd7tnlstbcgZZIh";
                                        entry = SpliceInsertCommand.A00(c20254v, A04, this.A00);
                                        break;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                case 6:
                                    entry = TimeSignalCommand.A01(this.A02, A04, this.A00);
                                    break;
                                case 255:
                                    entry = PrivateCommand.A00(this.A02, A042, A04);
                                    break;
                            }
                            return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
                        }
                    };
                case 3:
                    return new AbstractC3550mZ() { // from class: com.facebook.ads.redexgen.X.9c
                        public static byte[] A02;
                        public static String[] A03 = {"Lh0eiN4oYILfPl4jy3dJZhwMArdhxg", "ZZdJzt9nksvE8tVcjKh5yb5LHp4DKBwy", "Dbw1S4FpTZ", "Q8KOrM0jMS", "", "1W", "E5bBazuIHkpw9TIkFnjV805WNgqTNchu", "VvZ"};
                        public static final Pattern A04;
                        public final CharsetDecoder A01 = AbstractC3415k9.A05.newDecoder();
                        public final CharsetDecoder A00 = AbstractC3415k9.A00.newDecoder();

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A02() {
                            byte[] bArr = {72, 78, 75, 95, 73, 93, 71, 72, 78, 74, 95, 73, 71, 91, 11, 12, 10, 29, 25, 21, 12, 17, 12, 20, 29, 17, 22, 16, 7, 3, 15, 23, 16, 14};
                            String[] strArr = A03;
                            if (strArr[3].length() != strArr[2].length()) {
                                throw new RuntimeException();
                            }
                            A03[7] = "K4Z";
                            A02 = bArr;
                        }

                        static {
                            A02();
                            A04 = Pattern.compile(A00(0, 14, 85), 32);
                        }

                        private String A01(ByteBuffer byteBuffer) {
                            try {
                                return this.A01.decode(byteBuffer).toString();
                            } catch (CharacterCodingException unused) {
                                try {
                                    String charBuffer = this.A00.decode(byteBuffer).toString();
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return charBuffer;
                                } catch (CharacterCodingException unused2) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return null;
                                } catch (Throwable th) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    throw th;
                                }
                            } finally {
                                this.A01.reset();
                                byteBuffer.rewind();
                            }
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // com.facebook.ads.redexgen.core.AbstractC3550mZ
                        public final Metadata A0R(C21329e c21329e, ByteBuffer byteBuffer) {
                            char c2;
                            String A01 = A01(byteBuffer);
                            byte[] bArr = new byte[byteBuffer.limit()];
                            byteBuffer.get(bArr);
                            if (A01 == null) {
                                return new Metadata(new IcyInfo(bArr, null, null));
                            }
                            String str2 = null;
                            String name = null;
                            Pattern pattern = A04;
                            String icyString = A03[7];
                            if (icyString.length() != 3) {
                                throw new RuntimeException();
                            }
                            A03[4] = "";
                            Matcher matcher = pattern.matcher(A01);
                            for (int i = 0; matcher.find(i); i = matcher.end()) {
                                String group = matcher.group(1);
                                String group2 = matcher.group(2);
                                if (group != null) {
                                    String key = AbstractC3413k7.A01(group);
                                    switch (key.hashCode()) {
                                        case -315603473:
                                            if (key.equals(A00(25, 9, 87))) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1646559960:
                                            if (key.equals(A00(14, 11, 77))) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            str2 = group2;
                                            break;
                                        case 1:
                                            name = group2;
                                            break;
                                    }
                                }
                            }
                            return new Metadata(new IcyInfo(bArr, str2, name));
                        }
                    };
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType5 = A00(0, 55, 68);
        throw new IllegalArgumentException(sb.append(mimeType5).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2173Bd
    public final boolean AKN(C3778qI c3778qI) {
        String str = c3778qI.A0W;
        String mimeType = A00(55, 15, 85);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(70, 18, 95);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(105, 20, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(88, 17, 73);
                    if (!mimeType4.equals(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
