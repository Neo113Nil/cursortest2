package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0321Bm implements InterfaceC0818Vr {
    public static byte[] A0G;
    public static String[] A0H = {"75NS6XWtOFaqvUAv70pmXpUOnNLqFC62", "xNyAW7YuQe6", "JhVZQGcu6MYhTGFRaY9NVeSWQV9pZEhG", "Kya4laZJ5Yz4z7ubQErhqHVe", "a5xQ9UmIIc2iWER6a0yqQZDBwnw5LxXI", "JNGHth9iM2AZaEQIUYfWNR2mTS", "R", "WvGanvqVoE"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0444Gy A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final H5 A0A;
    public final H5 A0B = new H5();
    public final HG<? super C0321Bm> A0C;
    public final I1<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection A04(C0444Gy c0444Gy) throws IOException {
        URL url = new URL(c0444Gy.A04.toString());
        byte[] bArr = c0444Gy.A06;
        long j = c0444Gy.A03;
        long j2 = c0444Gy.A02;
        boolean A02 = c0444Gy.A02(1);
        if (!this.A0F) {
            return A05(url, bArr, j, j2, A02, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new NoRouteToHostException(A03(125, 20, 38) + i2);
            }
            HttpURLConnection A05 = A05(url, bArr, j, j2, A02, false);
            int responseCode = A05.getResponseCode();
            if (A0H[5].length() != 26) {
                throw new RuntimeException();
            }
            A0H[3] = "FxIBfHo5MrM4KwNe65t8Xtniv5kx6";
            if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                bArr = null;
                String headerField = A05.getHeaderField(A03(86, 8, 11));
                A05.disconnect();
                url = A06(url, headerField);
                i = i2;
            }
        }
    }

    public static void A09() {
        A0G = new byte[]{3, Ascii.DC2, 48, 48, 54, 35, 39, 126, Ascii.SYN, Base64.padSymbol, 48, 60, 55, 58, Base64.padSymbol, 52, 49, Ascii.GS, Ascii.FS, 6, Ascii.ETB, Ascii.FS, 6, 95, 62, Ascii.ETB, Ascii.FS, Ascii.NAK, 6, Ascii.SUB, 58, Ascii.SYN, Ascii.ETB, Ascii.CR, Ascii.FS, Ascii.ETB, Ascii.CR, 84, 43, Ascii.CAN, Ascii.ETB, Ascii.RS, Ascii.FS, 62, Ascii.US, Ascii.FS, Ascii.ESC, Ascii.SI, Ascii.SYN, Ascii.SO, 50, Ascii.SO, Ascii.SO, 10, 62, Ascii.ESC, Ascii.SO, Ascii.ESC, 41, Ascii.NAK, Ascii.SI, 8, Ascii.EM, Ascii.US, 117, 82, 95, 83, 82, 79, 85, 79, 72, 89, 82, 72, Ascii.FS, 84, 89, 93, 88, 89, 78, 79, Ascii.FS, 103, 126, 93, 81, 83, 70, 91, 93, 92, 73, 114, 107, 107, 39, 107, 104, 100, 102, 115, 110, 104, 105, 39, 117, 98, 99, 110, 117, 98, 100, 115, Ascii.SUB, 5, Ascii.EM, Ascii.RS, 110, 93, 82, 91, 89, 75, 112, 112, 63, 114, 126, 113, 102, 63, 109, 122, 123, 118, 109, 122, 124, 107, 108, 37, 63, 40, 19, Ascii.FS, Ascii.US, 17, Ascii.CAN, 93, 9, Ascii.DC2, 93, Ascii.RS, Ascii.DC2, 19, 19, Ascii.CAN, Ascii.RS, 9, 93, 9, Ascii.DC2, 93, 82, 105, 98, Byte.MAX_VALUE, 119, 98, 100, 115, 98, 99, 39, 68, 104, 105, 115, 98, 105, 115, 42, 75, 98, 105, 96, 115, 111, 39, 92, 106, 81, 90, 71, 79, 90, 92, 75, 90, 91, Ascii.US, 124, 80, 81, 75, 90, 81, 75, Ascii.DC2, 109, 94, 81, 88, 90, Ascii.US, 100, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 119, 96, 96, 125, 96, 50, 101, 122, 123, 126, 119, 50, 118, 123, 97, 113, 125, 124, 124, 119, 113, 102, 123, 124, 117, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, Ascii.NAK, 69, 71, 90, 65, 90, 86, 90, 89, Ascii.NAK, 71, 80, 81, 92, 71, 80, 86, 65, Ascii.SI, Ascii.NAK, 74, 108, 122, 109, 50, 94, 120, 122, 113, 107, 86, 104, Ascii.NAK, 110, 118, 74, 81, 92, 77, 91, 8, 0, 116, 76, 3, 1, 5, 0, 116, 76, 3, 1, 7, 0, 116, 76, 3, 1, Ascii.FF, 115, 104, 101, 116, 98, 44, Ascii.FS, 16, Ascii.DC2, 81, Ascii.RS, 17, Ascii.ESC, Ascii.CR, 16, Ascii.SYN, Ascii.ESC, 81, 16, Ascii.DC4, Ascii.ETB, Ascii.VT, Ascii.VT, Ascii.SI, 81, Ascii.SYN, 17, Ascii.VT, Ascii.SUB, Ascii.CR, 17, Ascii.RS, 19, 81, Ascii.ETB, Ascii.VT, Ascii.VT, Ascii.SI, 81, 55, Ascii.VT, Ascii.VT, Ascii.SI, 43, Ascii.CR, Ascii.RS, 17, Ascii.FF, Ascii.SI, 16, Ascii.CR, Ascii.VT, 91, 60, Ascii.ETB, 10, 17, Ascii.DC4, Ascii.SUB, Ascii.ESC, 54, 17, Ascii.SI, 10, Ascii.VT, 44, Ascii.VT, Ascii.CR, Ascii.SUB, Ascii.RS, Ascii.DC2, 77, 65, 67, 0, 79, 64, 74, 92, 65, 71, 74, 0, 65, 69, 70, 90, 90, 94, 0, 71, 64, 90, 75, 92, 64, 79, 66, 0, 70, 90, 90, 94, 0, 102, 90, 90, 94, 122, 92, 79, 64, 93, 94, 65, 92, 90, 10, 104, 71, 86, 75, 74, 98, 75, 64, 73, 90, 70, 103, 64, 94, 91, 90, 125, 90, 92, 75, 79, 67, 57, 37, 37, 33, 65, 93, 93, 89, 90, 98, 111, 110, 101, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 114, 124, 103, 108, 113, 121, 108, 106, 125, 108, 109, 76, 103, 109, 70, 111, 64, 103, 121, 124, 125};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 25, 17));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I1 != com.facebook.ads.internal.exoplayer2.thirdparty.util.Predicate<java.lang.String> */
    public C0321Bm(String str, I1<String> i1, HG<? super C0321Bm> hg, int i, int i2, boolean z, H5 h5) {
        this.A0E = AbstractC0445Ha.A02(str);
        this.A0D = i1;
        this.A0C = hg;
        this.A08 = i;
        this.A09 = i2;
        this.A0F = z;
        this.A0A = h5;
    }

    private int A00(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A02;
        if (j != -1) {
            long bytesRemaining = j - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, bytesRemaining);
        }
        int read = this.A05.read(bArr, i, i2);
        if (read == -1) {
            if (this.A02 == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.A00 += read;
        HG<? super C0321Bm> hg = this.A0C;
        if (hg != null) {
            hg.AB1(this, read);
        }
        return read;
    }

    private final long A01() {
        long j = this.A02;
        return j == -1 ? j : j - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) {
        long j = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 75));
        boolean isEmpty = TextUtils.isEmpty(headerField);
        String A03 = A03(296, 1, 50);
        String A032 = A03(43, 21, 67);
        if (!isEmpty) {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(A032, A03(Opcodes.IF_ACMPNE, 27, 62) + headerField + A03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 64));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (j < 0) {
                        return parseLong;
                    }
                    if (j != parseLong) {
                        Log.w(A032, A03(64, 22, 5) + headerField + A03(297, 3, 12) + headerField2 + A03);
                        j = Math.max(j, parseLong);
                        return j;
                    }
                    return j;
                } catch (NumberFormatException unused2) {
                    Log.e(A032, A03(Opcodes.INSTANCEOF, 26, 6) + headerField2 + A03);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        H5 h5 = this.A0A;
        if (h5 != null) {
            for (Map.Entry<String, String> entry : h5.A00().entrySet()) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                A0H[2] = "kwRG9UknWr0Wgg7Rclu7tRHvEyTV8TJk";
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = A03(325, 6, 40) + j + A03(0, 1, 23);
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty(A03(120, 5, 5), str);
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 38), this.A0E);
        if (!z) {
            httpURLConnection.setRequestProperty(A03(1, 15, 106), A03(474, 8, 50));
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 115));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A03(469, 5, 16).equals(protocol)) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "w50J2iwlOiToEn9H8bpLD3B1mxiX4OkW";
                strArr[4] = "U5WpLDBGoG2FZlKlieC8pMIdD1ZiOapt";
                if (!A03(465, 4, 104).equals(protocol)) {
                    String protocol2 = A03(255, 31, 12) + protocol;
                    throw new ProtocolException(protocol2);
                }
            }
            return url2;
        }
        throw new ProtocolException(A03(94, 22, 62));
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(A03(43, 21, 67), A03(219, 36, 43), e);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        byte[] andSet = A0I.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.A01;
            long j2 = this.A03;
            if (j != j2) {
                int readLength = (int) Math.min(j2 - j, andSet.length);
                int read = this.A05.read(andSet, 0, readLength);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.A01 += read;
                        HG<? super C0321Bm> hg = this.A0C;
                        if (hg != null) {
                            hg.AB1(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                A0I.set(andSet);
                return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j) {
        if (IF.A02 != 19) {
            int i = IF.A02;
            String[] strArr = A0H;
            if (strArr[6].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0H[5] = "h9vUSf3vBaluOAcyH2LsyeRcof";
            if (i != 20) {
                return;
            }
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 70).equals(name) || A03(396, 69, 23).equals(name)) {
                Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod(A03(482, 20, 48), new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws H4 {
        String A03 = A03(Opcodes.I2B, 21, 68);
        this.A04 = c0444Gy;
        long j = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        try {
            HttpURLConnection A04 = A04(c0444Gy);
            this.A06 = A04;
            try {
                int responseCode = A04.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.A06.getHeaderFields();
                    A07();
                    C0819Vs exception = new C0819Vs(responseCode, headerFields, c0444Gy);
                    if (responseCode == 416) {
                        exception.initCause(new C0441Gv(0));
                        throw exception;
                    }
                    throw exception;
                }
                String contentType = this.A06.getContentType();
                I1<String> i1 = this.A0D;
                if (i1 == null || i1.A5b(contentType)) {
                    if (responseCode == 200 && c0444Gy.A03 != 0) {
                        j = c0444Gy.A03;
                    }
                    this.A03 = j;
                    if (c0444Gy.A02(1)) {
                        long j2 = c0444Gy.A02;
                        String[] strArr = A0H;
                        String str = strArr[6];
                        String str2 = strArr[1];
                        int length = str.length();
                        int responseCode2 = str2.length();
                        if (length == responseCode2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0H;
                        strArr2[0] = "g5QduXiMfcr3WVIXoNOmeCAyNU6k9qpH";
                        strArr2[4] = "C5YWXMFtOzaHxpxnw5jthW3Xp7pagYAJ";
                        this.A02 = j2;
                    } else {
                        if (c0444Gy.A02 != -1) {
                            this.A02 = c0444Gy.A02;
                        } else {
                            long A02 = A02(this.A06);
                            this.A02 = A02 != -1 ? A02 - this.A03 : -1L;
                        }
                    }
                    try {
                        this.A05 = this.A06.getInputStream();
                        this.A07 = true;
                        HG<? super C0321Bm> hg = this.A0C;
                        if (hg != null) {
                            hg.ADP(this, c0444Gy);
                        }
                        return this.A02;
                    } catch (IOException e) {
                        A07();
                        throw new H4(e, c0444Gy, 1);
                    }
                }
                A07();
                throw new C0820Vt(contentType, c0444Gy);
            } catch (IOException e2) {
                A07();
                throw new H4(A03 + c0444Gy.A04.toString(), e2, c0444Gy, 1);
            }
        } catch (IOException e3) {
            throw new H4(A03 + c0444Gy.A04.toString(), e3, c0444Gy, 1);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws H4 {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e) {
                    throw new H4(e, this.A04, 3);
                }
            }
        } finally {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                HG<? super C0321Bm> hg = this.A0C;
                if (hg != null) {
                    hg.ADO(this);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws H4 {
        try {
            A08();
            return A00(bArr, i, i2);
        } catch (IOException e) {
            throw new H4(e, this.A04, 2);
        }
    }
}
