package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ն, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0593 extends AbstractC1100 implements InterfaceC1077 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f991;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f992;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f993;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Map f994;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f990 = StringFog.decrypt("saTKWZcumjqmquh6kDGfBqw=\n", "wsG+H+JC9mk=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f989 = StringFog.decrypt("34fIOqJaXKXdous9vV9gr+WR+g==\n", "tvSOT842D8E=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f988 = StringFog.decrypt("MWatJUjJIS8=\n", "VgPZZiSoUlw=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f987 = StringFog.decrypt("Xj5P\n", "N1A7VUHCyHM=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f986 = StringFog.decrypt("ZXJLyA==\n", "CR0lr/eLk1I=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f985 = StringFog.decrypt("r4pWY57i\n", "y+UjAfKH890=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f984 = StringFog.decrypt("qsxPsAc=\n", "zKAg0XMy5UE=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f983 = StringFog.decrypt("mrIZ/A==\n", "+N12kIVOLlw=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f982 = StringFog.decrypt("vKO8eg==\n", "38vdCGbArew=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f981 = StringFog.decrypt("nsvUBQ==\n", "/LKgYHvyu3g=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f980 = StringFog.decrypt("qMaxig==\n", "3qnY7n4fj3A=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f979 = StringFog.decrypt("vfhM7IA=\n", "zpAjnvSN3FI=\n");

    public AbstractC0593(String str) {
        this.f993 = str;
    }

    /* renamed from: ﻏ */
    public boolean mo4039() {
        return this instanceof C0549;
    }

    /* renamed from: ﻐ */
    public boolean mo4038() {
        return this instanceof C0565;
    }

    /* renamed from: ﻛ */
    public abstract String mo3939();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m4101() {
        try {
            if (!TextUtils.isEmpty(this.f991)) {
                if (this.f991.equals(StringFog.decrypt("4HKM6Jwwog==\n", "pTzNqtB15qE=\n"))) {
                }
            }
            this.f991 = mo3939();
        } catch (Throwable th) {
            throw th;
        }
        return this.f991;
    }

    /* renamed from: ﾇ */
    public abstract HashMap mo3940();

    /* renamed from: ﾒ */
    public abstract Class mo3941(String str);

    /* renamed from: ﾒ */
    public String mo4017() {
        String str = this.f992;
        return str != null ? str : m4101();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        InterfaceC0595 interfaceC0595 = (InterfaceC0595) this.f994.get(str);
        try {
        } catch (Exception e) {
            String str2 = this.f993;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("NUjzS2qLCYMZVuQEfdMbiAVO6Ep/iw==\n", "cDqBJBirfus=\n"));
            sb.append(this.f993);
            AbstractC0844.m4219(str2, AbstractC1293.m4543("JA==\n", "AxD1uUGHN6c=\n", AbstractC0446.m4006("qco=\n", "ie26f/PiOpA=\n", sb, str)), e, null);
        }
        if (interfaceC0595 != null) {
            return interfaceC0595.mo3938(arrayList, c1189);
        }
        new C0789(c0880, c0785, this.f993, str).m4002(this.f993);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ironsource.adqualitysdk.sdk.i.ɾ, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class m4102(String str, boolean z) {
        char c;
        ?? r0 = 0;
        r0 = 0;
        try {
            if (str.contains(StringFog.decrypt("OQ==\n", "F0yTO06bN08=\n"))) {
                String str2 = AbstractC1226.f3226;
                try {
                    r0 = Class.forName(str);
                    return r0;
                } catch (Throwable th) {
                    if (!z) {
                        return null;
                    }
                    AbstractC0844.m4219(AbstractC1226.f3226, StringFog.decrypt("T5vdSAiy\n", "DPe8O3uSeN8=\n") + str + StringFog.decrypt("Osk3YPMxZEd0ww==\n", "GqdYFNNXCzI=\n"), th, null);
                    return null;
                }
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(f985)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str.equals(f987)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029738:
                    if (str.equals(f983)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3039496:
                    if (str.equals(f981)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3052374:
                    if (str.equals(f982)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (str.equals(f986)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3625364:
                    if (str.equals(f980)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 97526364:
                    if (str.equals(f984)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109413500:
                    if (str.equals(f979)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    return Float.TYPE;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    return Void.TYPE;
                case '\b':
                    return Short.TYPE;
                default:
                    return mo3941(str);
            }
        } catch (Throwable th2) {
            if (z) {
                AbstractC0844.m4219(this.f993, AbstractC1293.m4543("1+39GQBpgRSZ5w==\n", "94OSbSAP7mE=\n", AbstractC0446.m4006("HpL94YZp\n", "Xf6ckvVJ/6k=\n", new StringBuilder(), str)), th2, r0);
            }
            return r0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4103(InterfaceC1111 interfaceC1111, C1189 c1189, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC1111);
            C0880.m4228(c1189.f3085, str, true, false, arrayList);
            C0880 c0880 = c1189.f3085;
            C1195 c1195 = new C1195(c1189, str, false, arrayList);
            c0880.getClass();
            try {
                AbstractC1026.m4316(c1195);
            } catch (Throwable unused) {
            }
            C0880 c08802 = c1189.f3085;
            C1195 c11952 = new C1195(c1189, str, true, arrayList);
            c08802.getClass();
            try {
                AbstractC1026.m4314(new C1152(c11952));
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            AbstractC0844.m4219(this.f993, StringFog.decrypt("EmrGQculyk13\n", "Vxi0LrmFoyM=\n") + this, th, null);
        }
    }
}
