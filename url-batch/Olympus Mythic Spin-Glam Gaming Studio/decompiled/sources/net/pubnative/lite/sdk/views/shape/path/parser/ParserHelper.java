package net.pubnative.lite.sdk.views.shape.path.parser;

/* loaded from: classes3.dex */
class ParserHelper {
    private static final double[] pow10 = new double[128];
    private char current;
    private final int n;
    public int pos = 0;
    private final CharSequence s;

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(10.0d, i);
            i++;
        }
    }

    public ParserHelper(CharSequence charSequence) {
        this.s = charSequence;
        this.n = charSequence.length();
        this.current = charSequence.charAt(this.pos);
    }

    private static float buildFloat(int i, int i2) {
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
        return (float) (i2 > 0 ? i * pow10[i2] : i / pow10[-i2]);
    }

    private char read() {
        int i = this.pos;
        int i2 = this.n;
        if (i < i2) {
            this.pos = i + 1;
        }
        int i3 = this.pos;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.s.charAt(i3);
    }

    private void reportUnexpectedCharacterError(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public void advance() {
        this.current = read();
    }

    public float nextFloat() {
        skipWhitespace();
        float parseFloat = parseFloat();
        skipNumberSeparator();
        return parseFloat;
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
    float parseFloat() {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        char c;
        char read;
        char read2;
        char c2 = this.current;
        int i4 = 0;
        boolean z3 = true;
        if (c2 == '+') {
            z = true;
        } else {
            if (c2 != '-') {
                z = true;
                switch (this.current) {
                    case '.':
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = false;
                        if (this.current == '.') {
                            char read3 = read();
                            this.current = read3;
                            switch (read3) {
                                case '0':
                                    if (i == 0) {
                                        while (true) {
                                            char read4 = read();
                                            this.current = read4;
                                            i2--;
                                            switch (read4) {
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
                                            i3 = (i3 * 10) + (this.current - '0');
                                            i2--;
                                        }
                                        char read5 = read();
                                        this.current = read5;
                                        switch (read5) {
                                        }
                                    }
                                    break;
                                default:
                                    if (!z2) {
                                        reportUnexpectedCharacterError(read3);
                                        break;
                                    }
                                    break;
                            }
                        }
                        c = this.current;
                        if (c != 'E' || c == 'e') {
                            read = read();
                            this.current = read;
                            if (read != '+') {
                                if (read != '-') {
                                    switch (read) {
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
                                            switch (this.current) {
                                                case '0':
                                                    while (true) {
                                                        char read6 = read();
                                                        this.current = read6;
                                                        switch (read6) {
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
                                                            i5 = (i5 * 10) + (this.current - '0');
                                                        }
                                                        char read7 = read();
                                                        this.current = read7;
                                                        switch (read7) {
                                                        }
                                                    }
                                                    break;
                                            }
                                        default:
                                            reportUnexpectedCharacterError(read);
                                            break;
                                    }
                                } else {
                                    z3 = false;
                                }
                            }
                            read2 = read();
                            this.current = read2;
                            switch (read2) {
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
                                    reportUnexpectedCharacterError(read2);
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
                            char read8 = read();
                            this.current = read8;
                            if (read8 != '.' && read8 != 'E' && read8 != 'e') {
                                switch (read8) {
                                }
                            }
                        }
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = true;
                        if (this.current == '.') {
                        }
                        c = this.current;
                        if (c != 'E') {
                        }
                        read = read();
                        this.current = read;
                        if (read != '+') {
                        }
                        read2 = read();
                        this.current = read2;
                        switch (read2) {
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
                                i3 = (i3 * 10) + (this.current - '0');
                            } else {
                                i2++;
                            }
                            char read9 = read();
                            this.current = read9;
                            switch (read9) {
                            }
                            z2 = true;
                            if (this.current == '.') {
                            }
                            c = this.current;
                            if (c != 'E') {
                            }
                            read = read();
                            this.current = read;
                            if (read != '+') {
                            }
                            read2 = read();
                            this.current = read2;
                            switch (read2) {
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
        this.current = read();
        switch (this.current) {
        }
        return 0.0f;
    }

    void skipNumberSeparator() {
        while (true) {
            int i = this.pos;
            if (i >= this.n) {
                return;
            }
            char charAt = this.s.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != ' ' && charAt != ',') {
                return;
            } else {
                advance();
            }
        }
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.pos;
            if (i >= this.n || !Character.isWhitespace(this.s.charAt(i))) {
                return;
            } else {
                advance();
            }
        }
    }
}
