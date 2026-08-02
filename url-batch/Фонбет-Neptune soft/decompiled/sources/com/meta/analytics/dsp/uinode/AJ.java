package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class AJ {
    public static String[] A06 = {"rmgpPCWB7BYHQ3azE8yCiRChgWLX4K1O", "ESYL8WQp59BjyyK9DI9xkUBJ1yOk4QLd", "YweXfGig2PVNilG2mJZlv3ovQAOkP8UY", "CAftEyLXQvcAYYqOnK17yfwScyM6Y9GQ", "5ZUx", "CHSAxwc6W9B6bhcUywJKjVUar2kzl0Sb", "G9dVYOs473", "8VVZpCzafohaQpJb3SOOvVZNRfYg5osa"};
    public AK A01;
    public AK A02;
    public boolean A03;
    public final ArrayList<AK> A05 = new ArrayList<>();
    public final AF A04 = new AF();
    public AH A00 = AH.A01;

    private AK A00(AK ak, AH ah) {
        if (ah.A0E() || this.A00.A0E()) {
            return ak;
        }
        AH ah2 = this.A00;
        int i = ak.A01.A02;
        if (A06[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A06[3] = "6Z7kXvoTE0GMRlV8X7ahHWF28Ir1JA8U";
        Object uid = ah2.A0A(i, this.A04, true).A03;
        int newPeriodIndex = ah.A04(uid);
        if (newPeriodIndex == -1) {
            return ak;
        }
        int newWindowIndex = ah.A09(newPeriodIndex, this.A04).A00;
        return new AK(newWindowIndex, ak.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final AK A03() {
        return this.A01;
    }

    public final AK A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<AK> arrayList = this.A05;
        int size = arrayList.size() - 1;
        if (A06[3].charAt(28) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "IuVtQJyFuB";
        strArr[7] = "VEjGs0KHAo6Qkjlg0Fq6YAYYmbb9RMII";
        return arrayList.get(size);
    }

    public final AK A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final AK A06() {
        return this.A02;
    }

    public final C0385Eo A07(int i) {
        C0385Eo c0385Eo = null;
        AH ah = this.A00;
        if (ah != null) {
            int A00 = ah.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                AK mediaPeriod = this.A05.get(periodIndex);
                C0385Eo match = mediaPeriod.A01;
                int i2 = match.A02;
                if (i2 < A00 && this.A00.A09(i2, this.A04).A00 == i) {
                    if (c0385Eo != null) {
                        return null;
                    }
                    c0385Eo = mediaPeriod.A01;
                }
            }
        }
        return c0385Eo;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, C0385Eo c0385Eo) {
        this.A05.add(new AK(i, c0385Eo));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i, C0385Eo c0385Eo) {
        AK mediaPeriod;
        AK ak = new AK(i, c0385Eo);
        this.A05.remove(ak);
        AK mediaPeriod2 = this.A02;
        if (ak.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                AK mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i, C0385Eo c0385Eo) {
        this.A02 = new AK(i, c0385Eo);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0E(AH ah) {
        for (int i = 0; i < i; i++) {
            ArrayList<AK> arrayList = this.A05;
            arrayList.set(i, A00(arrayList.get(i), ah));
        }
        AK ak = this.A02;
        if (ak != null) {
            this.A02 = A00(ak, ah);
        }
        this.A00 = ah;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
