package yads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* loaded from: classes4.dex */
public final class la3 extends uz2 {
    public final xb2 m = new xb2();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public la3(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.o = 0;
            this.p = -1;
            this.q = "sans-serif";
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.o = bArr[24];
        this.p = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.q = "Serif".equals(sb3.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.n = z;
        if (z) {
            this.r = Math.max(0.0f, Math.min(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i, 0.95f));
        } else {
            this.r = 0.85f;
        }
    }

    @Override // yads.uz2
    public final c53 a(byte[] bArr, int i, boolean z) {
        String a;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        xb2 xb2Var = this.m;
        xb2Var.a = bArr;
        xb2Var.c = i;
        int i8 = 0;
        xb2Var.b = 0;
        int i9 = 2;
        if (i < 2) {
            throw new e53("Unexpected subtitle format.");
        }
        int p = xb2Var.p();
        if (p == 0) {
            a = "";
        } else {
            int i10 = xb2Var.c;
            int i11 = xb2Var.b;
            if (i10 - i11 >= 2) {
                byte[] bArr2 = xb2Var.a;
                char c = (char) ((bArr2[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
                if (c == 65279 || c == 65534) {
                    a = xb2Var.a(p, zt.d);
                }
            }
            a = xb2Var.a(p, zt.c);
        }
        if (a.isEmpty()) {
            return ma3.c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        a(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
        int i12 = this.p;
        int length = spannableStringBuilder.length();
        if (i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i12 >>> 8) | ((i12 & 255) << 24)), 0, length, 16711713);
        }
        String str = this.q;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f = this.r;
        while (true) {
            xb2 xb2Var2 = this.m;
            int i13 = xb2Var2.c;
            int i14 = xb2Var2.b;
            if (i13 - i14 < i7) {
                return new ma3(new s20(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
            }
            int a2 = xb2Var2.a();
            int a3 = this.m.a();
            if (a3 == 1937013100) {
                xb2 xb2Var3 = this.m;
                if (xb2Var3.c - xb2Var3.b < i9) {
                    throw new e53("Unexpected subtitle format.");
                }
                int p2 = xb2Var3.p();
                int i15 = i8;
                while (i15 < p2) {
                    xb2 xb2Var4 = this.m;
                    if (xb2Var4.c - xb2Var4.b < 12) {
                        throw new e53("Unexpected subtitle format.");
                    }
                    int p3 = xb2Var4.p();
                    int p4 = xb2Var4.p();
                    xb2Var4.e(xb2Var4.b + i9);
                    int k = xb2Var4.k();
                    xb2Var4.e(xb2Var4.b + 1);
                    int a4 = xb2Var4.a();
                    if (p4 > spannableStringBuilder.length()) {
                        gh1.d("Tx3gDecoder", "Truncating styl end (" + p4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        p4 = spannableStringBuilder.length();
                    }
                    int i16 = p4;
                    if (p3 >= i16) {
                        gh1.d("Tx3gDecoder", "Ignoring styl with start (" + p3 + ") >= end (" + i16 + ").");
                        i5 = i15;
                        i4 = p2;
                    } else {
                        i4 = p2;
                        i5 = i15;
                        a(spannableStringBuilder, k, this.o, p3, i16, 0);
                        if (a4 != this.p) {
                            i6 = 8;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((a4 >>> 8) | ((a4 & 255) << 24)), p3, i16, 33);
                            i15 = i5 + 1;
                            p2 = i4;
                            i7 = i6;
                            i9 = 2;
                        }
                    }
                    i6 = 8;
                    i15 = i5 + 1;
                    p2 = i4;
                    i7 = i6;
                    i9 = 2;
                }
                i2 = i7;
                i3 = i9;
            } else {
                i2 = i7;
                if (a3 == 1952608120 && this.n) {
                    xb2 xb2Var5 = this.m;
                    i3 = 2;
                    if (xb2Var5.c - xb2Var5.b < 2) {
                        throw new e53("Unexpected subtitle format.");
                    }
                    int i17 = sb3.a;
                    f = Math.max(0.0f, Math.min(xb2Var5.p() / this.s, 0.95f));
                } else {
                    i3 = 2;
                }
            }
            this.m.e(i14 + a2);
            i9 = i3;
            i7 = i2;
            i8 = 0;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }
}
