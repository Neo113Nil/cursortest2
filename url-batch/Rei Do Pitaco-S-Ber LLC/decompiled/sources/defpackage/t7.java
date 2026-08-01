package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t7 {
    public static final String b;
    public static final String c;
    public static final t7 d;
    public static final t7 e;
    public final boolean a;

    static {
        c8 c8Var = q40.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new t7(false);
        e = new t7(true);
    }

    public t7(boolean z) {
        c8 c8Var = q40.a;
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        s7 s7Var = new s7(charSequence);
        s7Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = s7Var.c;
            if (i4 < s7Var.b && i == 0) {
                CharSequence charSequence2 = s7Var.a;
                char charAt = charSequence2.charAt(i4);
                s7Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = s7Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    s7Var.c = Character.charCount(codePointAt) + s7Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    s7Var.c = i5 + 1;
                    char c2 = s7Var.d;
                    directionality = c2 < 1792 ? s7.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        s7 s7Var = new s7(charSequence);
        s7Var.c = s7Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (s7Var.c > 0) {
                byte a = s7Var.a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        c8 c8Var = q40.c;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = c8Var.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b3 = (b2 ? q40.b : q40.a).b(charSequence, charSequence.length());
        String str = "";
        String str2 = c;
        String str3 = b;
        boolean z = this.a;
        spannableStringBuilder.append((CharSequence) ((z || !(b3 || a(charSequence) == 1)) ? (!z || (b3 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b2 != z) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b4 = (b2 ? q40.b : q40.a).b(charSequence, charSequence.length());
        if (!z && (b4 || b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!b4 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
