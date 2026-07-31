package com.smaato.sdk.ng.views.shape.path.parser;

/* loaded from: classes6.dex */
class e {
    private static final double[] e = new double[128];
    private final CharSequence a;
    private final int b;
    public int c = 0;
    private char d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = e;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(10.0d, i);
            i++;
        }
    }

    public e(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
        this.d = charSequence.charAt(this.c);
    }

    private static float a(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i2 == 0) {
            return i;
        }
        if (i >= 67108864) {
            i++;
        }
        return (float) (i2 > 0 ? i * e[i2] : i / e[-i2]);
    }

    private char d() {
        int i = this.c;
        int i2 = this.b;
        if (i < i2) {
            this.c = i + 1;
        }
        int i3 = this.c;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.a.charAt(i3);
    }

    public float b() {
        f();
        float c = c();
        e();
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb A[PHI: r3
      0x00bb: PHI (r3v2 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:77:0x00b4, B:56:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[LOOP:0: B:9:0x0028->B:17:?, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    float c() {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        char c;
        char d;
        char d2;
        char c2 = this.d;
        int i4 = 0;
        boolean z3 = true;
        if (c2 == '+') {
            z = true;
        } else {
            if (c2 != '-') {
                z = true;
                switch (this.d) {
                    case '.':
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = false;
                        if (this.d == '.') {
                            char d3 = d();
                            this.d = d3;
                            switch (d3) {
                                case '0':
                                    if (i == 0) {
                                        while (true) {
                                            char d4 = d();
                                            this.d = d4;
                                            i2--;
                                            switch (d4) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                default:
                                                    if (!z2) {
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i < 9) {
                                            i++;
                                            i3 = (i3 * 10) + (this.d - '0');
                                            i2--;
                                        }
                                        char d5 = d();
                                        this.d = d5;
                                        switch (d5) {
                                        }
                                    }
                                    break;
                                default:
                                    if (!z2) {
                                        a(d3);
                                        break;
                                    }
                                    break;
                            }
                        }
                        c = this.d;
                        if (c != 'E' || c == 'e') {
                            d = d();
                            this.d = d;
                            if (d != '+') {
                                if (d != '-') {
                                    switch (d) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            switch (this.d) {
                                                case '0':
                                                    while (true) {
                                                        char d6 = d();
                                                        this.d = d6;
                                                        switch (d6) {
                                                        }
                                                    }
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i4 < 3) {
                                                            i4++;
                                                            i5 = (i5 * 10) + (this.d - '0');
                                                        }
                                                        char d7 = d();
                                                        this.d = d7;
                                                        switch (d7) {
                                                        }
                                                    }
                                                    break;
                                            }
                                        default:
                                            a(d);
                                            break;
                                    }
                                } else {
                                    z3 = false;
                                }
                            }
                            d2 = d();
                            this.d = d2;
                            switch (d2) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    a(d2);
                                    break;
                            }
                        }
                        if (!z3) {
                            i4 = -i4;
                        }
                        int i6 = i4 + i2;
                        if (!z) {
                            i3 = -i3;
                        }
                        break;
                    case '0':
                        while (true) {
                            char d8 = d();
                            this.d = d8;
                            if (d8 != '.' && d8 != 'E' && d8 != 'e') {
                                switch (d8) {
                                }
                            }
                        }
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = true;
                        if (this.d == '.') {
                        }
                        c = this.d;
                        if (c != 'E') {
                        }
                        d = d();
                        this.d = d;
                        if (d != '+') {
                        }
                        d2 = d();
                        this.d = d2;
                        switch (d2) {
                        }
                        if (!z3) {
                        }
                        int i62 = i4 + i2;
                        if (!z) {
                        }
                        break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        while (true) {
                            if (i < 9) {
                                i++;
                                i3 = (i3 * 10) + (this.d - '0');
                            } else {
                                i2++;
                            }
                            char d9 = d();
                            this.d = d9;
                            switch (d9) {
                            }
                            z2 = true;
                            if (this.d == '.') {
                            }
                            c = this.d;
                            if (c != 'E') {
                            }
                            d = d();
                            this.d = d;
                            if (d != '+') {
                            }
                            d2 = d();
                            this.d = d2;
                            switch (d2) {
                            }
                            if (!z3) {
                            }
                            int i622 = i4 + i2;
                            if (!z) {
                            }
                            break;
                        }
                        break;
                }
                return 0.0f;
            }
            z = false;
        }
        this.d = d();
        switch (this.d) {
        }
        return 0.0f;
    }

    void e() {
        while (true) {
            int i = this.c;
            if (i >= this.b) {
                return;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != ' ' && charAt != ',') {
                return;
            } else {
                a();
            }
        }
    }

    public void f() {
        while (true) {
            int i = this.c;
            if (i >= this.b || !Character.isWhitespace(this.a.charAt(i))) {
                return;
            } else {
                a();
            }
        }
    }

    public void a() {
        this.d = d();
    }

    private void a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }
}
