package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڏ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0658 extends AbstractC1100 implements InterfaceC0858, InterfaceC1077 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final InterfaceC0858 f1406;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object f1407;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Map f1408;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Collection f1409;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field f1410;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1405 = StringFog.decrypt("6ejGUX4czO3D5sh9cBjm\n", "poqsNB1oioQ=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1404 = StringFog.decrypt("Fh1Erb4OcHU=\n", "cXgw+99iBRA=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1403 = StringFog.decrypt("g8f5ccgQyt0=\n", "8KKNJ6l8v7g=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1402 = StringFog.decrypt("kKhILaWo6w==\n", "+dsORMDEj9s=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1401 = StringFog.decrypt("Z5vUnQVocL0=\n", "AP6g22wNHNk=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1400 = StringFog.decrypt("To5w5A8ugG1TlFzl\n", "J/0zi2NC5Q4=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1399 = StringFog.decrypt("z97HhhjJxOHLz9qqGQ==\n", "qLuzxXelqIQ=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1398 = StringFog.decrypt("fzjYSHU=\n", "FkuVKQV33A8=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1397 = StringFog.decrypt("sUyaxSiY\n", "1inuiEnoTRU=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1396 = StringFog.decrypt("fCFXZxAfd3Nv\n", "G0QjN3FtEh0=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1395 = StringFog.decrypt("egvQMCu00CBzDcE=\n", "HW6keUXHpEE=\n");

    public C0658(Field field, Object obj, InterfaceC0858 interfaceC0858) {
        this.f1410 = field;
        this.f1407 = obj;
        this.f1406 = interfaceC0858;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m4133() {
        Field field = this.f1410;
        if (field != null) {
            try {
                return field.get(this.f1407);
            } catch (Exception unused) {
                return null;
            }
        }
        if (this.f1409 == null && this.f1408 == null) {
            return null;
        }
        return this.f1407;
    }

    public C0658(Collection collection, Object obj, InterfaceC0858 interfaceC0858) {
        this.f1409 = collection;
        this.f1407 = obj;
        this.f1406 = interfaceC0858;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        boolean z;
        char c;
        try {
            z = true;
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(f1399)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1661939189:
                    if (str.equals(f1395)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1249356250:
                    if (str.equals(f1397)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 100472786:
                    if (str.equals(f1398)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 429960040:
                    if (str.equals(f1400)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 700591008:
                    if (str.equals(f1396)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1406685743:
                    if (str.equals(f1403)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953253188:
                    if (str.equals(f1401)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1967798203:
                    if (str.equals(f1404)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058833392:
                    if (str.equals(f1402)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC1293.m4543("pA==\n", "g8fwQxk0ajk=\n", AbstractC0446.m4006("fxJ9JSFzDmRTDGpqNiscb08UZiQ0czZuUAVsPhU6HGBeKWI6P3MXbU4JeS9zPhx4Ug9ranQ=\n", "OmAPSlNTeQw=\n", new StringBuilder(), str)), e, null);
        }
        switch (c) {
            case 0:
                return m4133();
            case 1:
                Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
                Field field = this.f1410;
                if (field != null) {
                    try {
                        field.set(this.f1407, m4401);
                    } catch (Exception unused) {
                    }
                }
                return null;
            case 2:
                if (this.f1410 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return this.f1410;
            case 4:
                if (this.f1409 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return this.f1409;
            case 6:
                if (this.f1408 == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return this.f1408;
            case '\b':
                return this.f1406;
            case '\t':
                return this.f1407;
            default:
                new C0789(c0880, c0785, f1405, str).m4002(c0880.m4231());
                return null;
        }
    }

    public C0658(Map map, Object obj, InterfaceC0858 interfaceC0858) {
        this.f1408 = map;
        this.f1407 = obj;
        this.f1406 = interfaceC0858;
    }
}
