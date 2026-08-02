package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FP {
    public static String[] A05 = {"uUgQSQgVsgHH0N1UsfY", "sl", "7AFLCGuL9JRzl", "SUkqvXm6rFeJNlyU4q2", "DM2QNBARzQjqq5KTyec", "OFwEtNlY3tfCjSjl1W0mAcBM0ytDkhEA", "Uou0zfuAqjYMYyC", "2ZbfYqEAzIBMf"};
    public static final FP A06 = new FP(new long[0]);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final FN[] A04;

    public FP(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = Arrays.copyOf(jArr, length);
        this.A04 = new FN[length];
        for (int i = 0; i < length; i++) {
            this.A04[i] = new FN();
        }
        this.A01 = 0L;
        this.A02 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r0 = r7.A03.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r3 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A00(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.A03;
            int index = jArr.length;
            if (i >= index) {
                break;
            }
            long j2 = jArr[i];
            if (j2 == Long.MIN_VALUE) {
                break;
            }
            if (A05[5].charAt(14) == 'w') {
                throw new RuntimeException();
            }
            A05[5] = "JOT1DKN2kTxJVBU4QbvAyq2E38ICiTh6";
            if (j < j2 && this.A04[i].A02()) {
                break;
            }
            i++;
        }
    }

    public final int A01(long j) {
        int length = this.A03.length - 1;
        while (length >= 0) {
            long j2 = this.A03[length];
            if (j2 != Long.MIN_VALUE && j2 <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.A04[length].A02()) {
            return -1;
        }
        return length;
    }
}
