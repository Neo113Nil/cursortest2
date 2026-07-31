package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1085 extends AbstractC0629 implements InterfaceC1077 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1084 f2749 = new C1084();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2748 = StringFog.decrypt("0AGWZxYqUxveLJVdAChT\n", "sWXyM29aNk8=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2747 = StringFog.decrypt("mjOSFkCtySabE4sFQLHbMJkz\n", "6VbzZCPFj0k=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2746 = StringFog.decrypt("PgU6jmTZK5opHQ==\n", "TW5T/iKwTvY=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2745 = StringFog.decrypt("/a1QvG7+EYThjk2Gcw==\n", "jsgk6BeOdNA=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        char c;
        try {
            switch (str.hashCode()) {
                case -1347544616:
                    if (str.equals(f2747)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -923635536:
                    if (str.equals(f2745)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -216533736:
                    if (str.equals(f2746)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 94094958:
                    if (str.equals(StringFog.decrypt("tmZnwW0=\n", "1BMOrQmnQm8=\n"))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 108404047:
                    if (str.equals(StringFog.decrypt("NbluDY0=\n", "R9wdaPnVSRY=\n"))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 387034026:
                    if (str.equals(StringFog.decrypt("sFSBL/GjaHWQRJA44KhNerBC\n", "wzHgXZLLIRs=\n"))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 391966482:
                    if (str.equals(StringFog.decrypt("WcPht7CQYtVRwveJi5tC3VvL8J66\n", "OKeF+t/0C7M=\n"))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1067445448:
                    if (str.equals(f2748)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1423210564:
                    if (str.equals(StringFog.decrypt("EsbOOjlXpWYax9gEAlyJeBDO3xMz\n", "c6Kqd1YzzAA=\n"))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC1293.m4543("kA==\n", "twj9pGW3PRY=\n", AbstractC0446.m4006("yY90XASglZPlkWMTE/iHmPmJb10RoKSS6ZFidxPmi5XliW9cGKCMmviUcFZW7YeP5JJiE1E=\n", "jP0GM3aA4vs=\n", new StringBuilder(), str)), e, null);
        }
        switch (c) {
            case 0:
                this.f2749.f2744 = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                return this;
            case 1:
                this.f2749.f2743 = ((Integer) AbstractC1100.m4401(arrayList, 0, Integer.class)).intValue();
                return this;
            case 2:
                this.f2749.f2742 = ((Boolean) AbstractC1100.m4401(arrayList, 0, Boolean.class)).booleanValue();
                return this;
            case 3:
                int intValue = ((Integer) AbstractC1100.m4401(arrayList, 0, Integer.class)).intValue();
                C1084 c1084 = this.f2749;
                c1084.f1126 = intValue | c1084.f1126;
                return this;
            case 4:
                int intValue2 = ((Integer) AbstractC1100.m4401(arrayList, 0, Integer.class)).intValue();
                C1084 c10842 = this.f2749;
                c10842.f1125 = intValue2 | c10842.f1125;
                return this;
            case 5:
                boolean booleanValue = ((Boolean) AbstractC1100.m4401(arrayList, 0, Boolean.class)).booleanValue();
                int intValue3 = arrayList.size() > 1 ? ((Integer) AbstractC1100.m4401(arrayList, 1, Integer.class)).intValue() : -1;
                C1084 c10843 = this.f2749;
                c10843.f1128 = booleanValue;
                c10843.f1127 = intValue3;
                return this;
            case 6:
                this.f2749.f2741.add((Class) AbstractC1100.m4401(arrayList, 0, Class.class));
                return this;
            case 7:
                this.f2749.m4372();
                return this;
            case '\b':
                return this.f2749;
            default:
                new C0789(c0880, c0785, StringFog.decrypt("9rsfIdYEmYfZvBM52y+S\n", "sNJ6TbJA/OE=\n"), str).m4002(c0880.m4231());
                return null;
        }
    }
}
