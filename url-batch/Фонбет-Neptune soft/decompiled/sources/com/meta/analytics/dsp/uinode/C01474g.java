package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01474g extends C8 {
    public static byte[] A05;
    public static String[] A06 = {"qvo0GMLMlCI9r2KvubgW", "xANfLU", "vfLxBByg2WxKhxozFOdEyd4oNWbI2yKZ", "M6AXkYe8VdVGq", "jqpt9kLQVEpjtzmdo0kCC28NolZOOofM", "wQfQ1ikODVE5", "8nxGlLt3aQnzE5X", "LzSrLgRmD2ZM4QoK2ANM"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{7, 81, 70, 67, 81, 37, Ascii.GS, 82, 80, 67, 80, 70, 81, 37, Ascii.GS, 82, 80, 67, 81, 37, Ascii.GS, 82, 80, 81, 70, 67, 67, 5, 37, 87, 80, 81, 37, Ascii.GS, 82, 80, 49, 108, 65, 73, 68, 71, 79, 93, 77, Ascii.DC2, 8, 67, 106, 119, 104, 100, 113, 63, 37, 76, 116, 118, 111, 111, 118, 113, 120, 63, 123, 118, 126, 115, 112, 120, 106, 122, 63, 115, 118, 113, 122, 63, 125, 122, 121, 112, 109, 122, 63, 124, 112, 114, 111, 115, 122, 107, 122, 63, 121, 112, 109, 114, 126, 107, 37, 63, 32, Ascii.CAN, Ascii.SUB, 3, 3, Ascii.SUB, Ascii.GS, Ascii.DC4, 83, Ascii.ETB, Ascii.SUB, Ascii.DC2, Ascii.US, Ascii.FS, Ascii.DC4, 6, Ascii.SYN, 83, Ascii.US, Ascii.SUB, Ascii.GS, Ascii.SYN, 83, 4, Ascii.SUB, 7, Ascii.ESC, 83, Ascii.NAK, Ascii.SYN, 4, Ascii.SYN, 1, 83, 16, Ascii.FS, Ascii.US, 6, Ascii.RS, Ascii.GS, 0, 83, 7, Ascii.ESC, Ascii.DC2, Ascii.GS, 83, Ascii.NAK, Ascii.FS, 1, Ascii.RS, Ascii.DC2, 7, 73, 83, 8, 48, 50, 43, 43, 50, 53, 60, 123, 50, 53, 45, 58, 55, 50, 63, 123, 47, 50, 54, 50, 53, 60, 97, 123, 65, 97, 115, 86, 119, 113, 125, 118, 119, 96, Ascii.SUB, 4, 55, 36, 47, 53, 50, Ascii.FS, 70, 70, 84, 90, 90, 104, 85, 114, 39, 35, 54, 85, 116, 110, 101, 111, 102, 97, 116, 103, 97, Ascii.DC2, 3, Ascii.RS, Ascii.DC2};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 77));
    }

    public C01474g() {
        this(null);
    }

    public C01474g(List<byte[]> list) {
        super(A02(Opcodes.INVOKEVIRTUAL, 10, 38));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0Q = IF.A0Q(list.get(0));
            String formatLine = A02(47, 8, 49);
            AbstractC0445Ha.A03(A0Q.startsWith(formatLine));
            A06(A0Q);
            A04(new C0470Hz(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.C8
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final WF A0b(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C0460Hp c0460Hp = new C0460Hp();
        C0470Hz c0470Hz = new C0470Hz(bArr, i);
        if (!this.A04) {
            A04(c0470Hz);
        }
        A05(c0470Hz, arrayList, c0460Hp);
        C0408Fn[] c0408FnArr = new C0408Fn[arrayList.size()];
        arrayList.toArray(c0408FnArr);
        return new WF(c0408FnArr, c0460Hp.A05());
    }

    private void A04(C0470Hz c0470Hz) {
        String A0P;
        do {
            A0P = c0470Hz.A0P();
            if (A0P == null) {
                return;
            }
        } while (!A0P.startsWith(A02(Opcodes.CHECKCAST, 8, 117)));
    }

    private void A05(C0470Hz c0470Hz, List<C0408Fn> list, C0460Hp c0460Hp) {
        while (true) {
            String A0P = c0470Hz.A0P();
            if (A0P != null) {
                if (!this.A04 && A0P.startsWith(A02(47, 8, 49))) {
                    A06(A0P);
                } else if (A0P.startsWith(A02(37, 10, 28))) {
                    A07(A0P, list, c0460Hp);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r6.equals(A02(216, 5, 33)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(String str) {
        String[] split = TextUtils.split(str.substring(A02(47, 8, 49).length()), A02(36, 1, 41));
        this.A01 = split.length;
        this.A02 = -1;
        this.A00 = -1;
        this.A03 = -1;
        int i = 0;
        while (true) {
            char c = 0;
            if (i >= this.A01) {
                if (this.A02 == -1 || this.A00 == -1 || this.A03 == -1) {
                    this.A01 = 0;
                    return;
                }
                return;
            }
            String A0M = IF.A0M(split[i].trim());
            switch (A0M.hashCode()) {
                case 100571:
                    if (A0M.equals(A02(213, 3, 63))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (A0M.equals(A02(221, 4, 82))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.A02 = i;
                    break;
                case 1:
                    this.A00 = i;
                    break;
                case 2:
                    this.A03 = i;
                    break;
            }
            i++;
        }
    }

    private void A07(String str, List<C0408Fn> list, C0460Hp c0460Hp) {
        int i = this.A01;
        String A02 = A02(Opcodes.INVOKEVIRTUAL, 10, 38);
        if (i == 0) {
            Log.w(A02, A02(55, 47, 43) + str);
            return;
        }
        String[] split = str.substring(A02(37, 10, 28).length()).split(A02(36, 1, 41), this.A01);
        if (split.length != this.A01) {
            Log.w(A02, A02(102, 55, 71) + str);
            return;
        }
        long startTimeUs = A00(split[this.A02]);
        String A022 = A02(157, 25, 111);
        if (startTimeUs == -9223372036854775807L) {
            Log.w(A02, A022 + str);
            return;
        }
        long j = -9223372036854775807L;
        String str2 = split[this.A00];
        if (!str2.trim().isEmpty()) {
            j = A00(str2);
            if (j == -9223372036854775807L) {
                Log.w(A02, A022 + str);
                return;
            }
        }
        String endTimeString = split[this.A03].replaceAll(A02(206, 7, 61), A02(0, 0, 97));
        String A023 = A02(200, 3, 46);
        String A024 = A02(0, 1, 57);
        list.add(new C0408Fn(endTimeString.replaceAll(A023, A024).replaceAll(A02(203, 3, 50), A024)));
        c0460Hp.A04(startTimeUs);
        if (j != -9223372036854775807L) {
            list.add(null);
            String[] strArr = A06;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "QluocDWeuHRDa";
            strArr2[6] = "JZgOBObbaiMn4tK";
            c0460Hp.A04(j);
        }
    }
}
