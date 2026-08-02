package com.meta.analytics.dsp.uinode;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class W9 implements InterfaceC0409Fo {
    public static byte[] A04;
    public final int A00;
    public final List<WA> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{19};
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W9(List<WA> list) {
        this.A01 = list;
        int size = list.size();
        this.A00 = size;
        this.A02 = new long[size * 2];
        for (int i = 0; i < cueIndex; i++) {
            WA wa = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = wa.A01;
            int arrayIndex = i2 + 1;
            this.A02[arrayIndex] = wa.A00;
        }
        long[] jArr = this.A02;
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        this.A03 = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final List<C0408Fn> A6Z(long j) {
        ArrayList arrayList = null;
        WA wa = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                WA wa2 = this.A01.get(i);
                if (wa2.A00()) {
                    if (wa == null) {
                        wa = wa2;
                    } else {
                        String A00 = A00(0, 1, 53);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(wa.A0C).append((CharSequence) A00).append(wa2.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(wa2.A0C);
                        }
                    }
                } else {
                    arrayList.add(wa2);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new WA(normalCueTextBuilder));
        } else if (wa != null) {
            arrayList.add(wa);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0445Ha.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        AbstractC0445Ha.A03(z);
        return this.A03[i];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A7T(long j) {
        int A0A = IF.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
