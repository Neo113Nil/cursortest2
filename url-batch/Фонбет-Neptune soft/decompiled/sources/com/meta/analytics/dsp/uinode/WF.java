package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WF implements InterfaceC0409Fo {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final C0408Fn[] A01;

    public WF(C0408Fn[] c0408FnArr, long[] jArr) {
        this.A01 = c0408FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final List<C0408Fn> A6Z(long j) {
        int A0B = IF.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            C0408Fn[] c0408FnArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            C0408Fn c0408Fn = c0408FnArr[A0B];
            if (c0408Fn != null) {
                return Collections.singletonList(c0408Fn);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final long A70(int i) {
        boolean z = true;
        AbstractC0445Ha.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC0445Ha.A03(z);
        return this.A00[i];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A7T(long j) {
        int A0A = IF.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
