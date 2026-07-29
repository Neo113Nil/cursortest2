package o;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: o.Fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140Fh implements InterfaceC0920df, UL, InterfaceC0143Fk, OC, IE, InterfaceC1070fy, InterfaceC1752qI, InterfaceC2015uI, InterfaceC2346zJ, IS {
    public final /* synthetic */ int h;

    public /* synthetic */ C0140Fh(int i) {
        this.h = i;
    }

    public static boolean A(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && HY.p(str.charAt(i + 1)) != -1 && HY.p(str.charAt(i3)) != -1;
    }

    public static String B(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        AbstractC0048Bt.n(str, "<this>");
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                G8 g8 = new G8();
                g8.T(str, i, i5);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            g8.N(32);
                            i5++;
                        }
                        g8.U(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int p = HY.p(str.charAt(i5 + 1));
                        int p2 = HY.p(str.charAt(i4));
                        if (p != -1 && p2 != -1) {
                            g8.N((p << 4) + p2);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        g8.U(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return g8.F();
            }
            i5++;
        }
        String substring = str.substring(i, i2);
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList C(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int H = UT.H(str, '&', i, 4);
            if (H == -1) {
                H = str.length();
            }
            int H2 = UT.H(str, '=', i, 4);
            if (H2 == -1 || H2 > H) {
                String substring = str.substring(i, H);
                AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, H2);
                AbstractC0048Bt.m(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(H2 + 1, H);
                AbstractC0048Bt.m(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i = H + 1;
        }
        return arrayList;
    }

    public static /* synthetic */ void o(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final String p(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = HY.a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = HY.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC0048Bt.m(charset, "UTF_8");
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static final boolean q(CH ch) {
        CH ch2 = SN.e;
        return !AbstractC0778bU.v(ch.b(), ".class", true);
    }

    public static final void r(C0218Ih c0218Ih) {
        ET et;
        Object obj;
        WH wh;
        ET et2 = C0901dM.v;
        do {
            et = C0901dM.v;
            obj = (XH) et.getValue();
            wh = (WH) obj;
            NH nh = wh.j;
            C0758bA c0758bA = (C0758bA) nh.get(c0218Ih);
            if (c0758bA != null) {
                Object obj2 = c0758bA.a;
                Object obj3 = c0758bA.b;
                BW bw = nh.h;
                BW v = bw.v(c0218Ih != null ? c0218Ih.hashCode() : 0, 0, c0218Ih);
                if (bw != v) {
                    nh = v == null ? NH.j : new NH(v, nh.i - 1);
                }
                C0460Rq c0460Rq = C0460Rq.D;
                if (obj2 != c0460Rq) {
                    Object obj4 = nh.get(obj2);
                    AbstractC0048Bt.k(obj4);
                    nh = nh.a(obj2, new C0758bA(((C0758bA) obj4).a, obj3));
                }
                if (obj3 != c0460Rq) {
                    Object obj5 = nh.get(obj3);
                    AbstractC0048Bt.k(obj5);
                    nh = nh.a(obj3, new C0758bA(obj2, ((C0758bA) obj5).b));
                }
                Object obj6 = obj2 != c0460Rq ? wh.h : obj3;
                if (obj3 != c0460Rq) {
                    obj2 = wh.i;
                }
                wh = new WH(obj6, obj2, nh);
            }
            if (obj == wh) {
                return;
            }
            Object obj7 = AbstractC1052fg.e;
            if (obj == null) {
                obj = obj7;
            }
        } while (!et.f(obj, wh));
    }

    public static ArrayList s(List list) {
        AbstractC0048Bt.n(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1359kL) obj) != EnumC1359kL.i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1359kL) it.next()).h);
        }
        return arrayList2;
    }

    public static String t(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        AbstractC0048Bt.n(str, "<this>");
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 128;
            int i7 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || UT.D(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !A(str, i5, length)))) || (codePointAt == 43 && z3)))) {
                G8 g8 = new G8();
                g8.T(str, i4, i5);
                G8 g82 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            g8.S(z ? "+" : "%2B");
                        } else if (codePointAt2 < i7 || codePointAt2 == 127 || ((codePointAt2 >= i6 && !z4) || UT.D(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !A(str, i5, length)))))) {
                            if (g82 == null) {
                                g82 = new G8();
                            }
                            g82.U(codePointAt2);
                            while (!g82.m()) {
                                byte readByte = g82.readByte();
                                g8.N(37);
                                char[] cArr = C0932ds.k;
                                g8.N(cArr[((readByte & 255) >> 4) & 15]);
                                g8.N(cArr[readByte & 15]);
                            }
                        } else {
                            g8.U(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 128;
                    i7 = 32;
                }
                return g8.F();
            }
            i5 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i4, length);
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static byte[] u(List list) {
        AbstractC0048Bt.n(list, "protocols");
        G8 g8 = new G8();
        Iterator it = s(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            g8.N(str.length());
            g8.S(str);
        }
        return g8.B(g8.i);
    }

    public static Typeface w(String str, C1586no c1586no, int i) {
        if (i == 0 && AbstractC0048Bt.h(c1586no, C1586no.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int r = AbstractC1305jX.r(c1586no, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(r) : Typeface.create(str, r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y(C0427Qj c0427Qj, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                IX[] ixArr = (IX[]) editable.getSpans(selectionStart, min, IX.class);
                if (ixArr != null && ixArr.length > 0) {
                    for (IX ix : ixArr) {
                        int spanStart = editable.getSpanStart(ix);
                        int spanEnd = editable.getSpanEnd(ix);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    c0427Qj.beginBatchEdit();
                    editable.delete(max3, min2);
                    c0427Qj.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean z() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // o.IE
    public void a(TC tc) {
        while (tc != null) {
            if (tc instanceof X7) {
                AbstractC0048Bt.l(((X7) tc).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                throw new ClassCastException();
            }
            tc = null;
        }
    }

    @Override // o.IE
    public int b() {
        return 16;
    }

    @Override // o.UL
    public AbstractC1004ey c() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // o.IE
    public boolean d(C0027Ay c0027Ay) {
        return true;
    }

    @Override // o.InterfaceC0920df
    public Iterable e(Object obj) {
        InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
        Collection o2 = interfaceC2204x9 != null ? interfaceC2204x9.o() : null;
        return o2 == null ? C1318jk.h : o2;
    }

    @Override // o.InterfaceC1070fy
    public boolean g(SW sw, SW sw2) {
        if (sw == null) {
            o(0);
            throw null;
        }
        if (sw2 != null) {
            return sw.equals(sw2);
        }
        o(1);
        throw null;
    }

    @Override // o.InterfaceC2346zJ
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.InterfaceC2346zJ
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // o.InterfaceC2015uI
    public Typeface k(C1586no c1586no, int i) {
        return w(null, c1586no, i);
    }

    @Override // o.InterfaceC0143Fk
    public void l(InterfaceC2204x9 interfaceC2204x9) {
        if (interfaceC2204x9 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // o.InterfaceC2015uI
    public Typeface m(C2379zq c2379zq, C1586no c1586no, int i) {
        String str;
        c2379zq.getClass();
        int i2 = c1586no.h / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface w = w(str, c1586no, i);
            if (!AbstractC0048Bt.h(w, Typeface.create(Typeface.DEFAULT, AbstractC1305jX.r(c1586no, i))) && !AbstractC0048Bt.h(w, w(null, c1586no, i))) {
                typeface = w;
            }
        }
        return typeface == null ? w("sans-serif", c1586no, i) : typeface;
    }

    @Override // o.IE
    public void n(C0027Ay c0027Ay, long j, C2182wr c2182wr, boolean z, boolean z2) {
        c0027Ay.p(j, c2182wr, z, z2);
    }

    public String toString() {
        switch (this.h) {
            case 21:
                return "RectangleShape";
            case 27:
                return "NO_SOURCE";
            case 28:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
        nc.d(null);
    }

    public RG x(long j, EnumC2057uy enumC2057uy, InterfaceC1119gh interfaceC1119gh) {
        return new PG(AbstractC0022At.e(0L, j));
    }

    @Override // o.InterfaceC0143Fk
    public void i(InterfaceC1245ib interfaceC1245ib, ArrayList arrayList) {
    }
}
