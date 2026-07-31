package yads;

import java.util.Collections;

/* loaded from: classes5.dex */
public final class xu0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final wu0 k;
    public final ht1 l;

    public xu0(byte[] bArr, int i) {
        int i2;
        wb2 wb2Var = new wb2(bArr);
        wb2Var.b(i * 8);
        this.a = wb2Var.a(16);
        this.b = wb2Var.a(16);
        this.c = wb2Var.a(24);
        this.d = wb2Var.a(24);
        int a = wb2Var.a(20);
        this.e = a;
        int i3 = 6;
        switch (a) {
            case 8000:
                i2 = 4;
                break;
            case 16000:
                i2 = 5;
                break;
            case 22050:
                i2 = 6;
                break;
            case 24000:
                i2 = 7;
                break;
            case 32000:
                i2 = 8;
                break;
            case 44100:
                i2 = 9;
                break;
            case 48000:
                i2 = 10;
                break;
            case 88200:
                i2 = 1;
                break;
            case 96000:
                i2 = 11;
                break;
            case 176400:
                i2 = 2;
                break;
            case 192000:
                i2 = 3;
                break;
            default:
                i2 = -1;
                break;
        }
        this.f = i2;
        this.g = wb2Var.a(3) + 1;
        int a2 = wb2Var.a(5) + 1;
        this.h = a2;
        if (a2 == 8) {
            i3 = 1;
        } else if (a2 == 12) {
            i3 = 2;
        } else if (a2 == 16) {
            i3 = 4;
        } else if (a2 == 20) {
            i3 = 5;
        } else if (a2 != 24) {
            i3 = -1;
        }
        this.i = i3;
        int a3 = wb2Var.a(4);
        int a4 = wb2Var.a(32);
        int i4 = sb3.a;
        this.j = ((a3 & 4294967295L) << 32) | (a4 & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public final long a(long j) {
        long j2 = (j * this.e) / 1000000;
        long j3 = this.j - 1;
        int i = sb3.a;
        return Math.max(0L, Math.min(j2, j3));
    }

    public final jw0 a(byte[] bArr, ht1 ht1Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        ht1 ht1Var2 = this.l;
        if (ht1Var2 != null) {
            if (ht1Var != null) {
                gt1[] gt1VarArr = ht1Var.b;
                if (gt1VarArr.length != 0) {
                    ht1Var = new ht1((gt1[]) sb3.a((Object[]) ht1Var2.b, (Object[]) gt1VarArr));
                }
            }
            ht1Var = ht1Var2;
        }
        iw0 iw0Var = new iw0();
        iw0Var.k = "audio/flac";
        iw0Var.l = i;
        iw0Var.x = this.g;
        iw0Var.y = this.e;
        iw0Var.m = Collections.singletonList(bArr);
        iw0Var.i = ht1Var;
        return new jw0(iw0Var);
    }

    public xu0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, wu0 wu0Var, ht1 ht1Var) {
        int i8;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        int i9 = 4;
        switch (i5) {
            case 8000:
                i8 = 4;
                break;
            case 16000:
                i8 = 5;
                break;
            case 22050:
                i8 = 6;
                break;
            case 24000:
                i8 = 7;
                break;
            case 32000:
                i8 = 8;
                break;
            case 44100:
                i8 = 9;
                break;
            case 48000:
                i8 = 10;
                break;
            case 88200:
                i8 = 1;
                break;
            case 96000:
                i8 = 11;
                break;
            case 176400:
                i8 = 2;
                break;
            case 192000:
                i8 = 3;
                break;
            default:
                i8 = -1;
                break;
        }
        this.f = i8;
        this.g = i6;
        this.h = i7;
        if (i7 == 8) {
            i9 = 1;
        } else if (i7 == 12) {
            i9 = 2;
        } else if (i7 != 16) {
            i9 = i7 != 20 ? i7 != 24 ? -1 : 6 : 5;
        }
        this.i = i9;
        this.j = j;
        this.k = wu0Var;
        this.l = ht1Var;
    }
}
