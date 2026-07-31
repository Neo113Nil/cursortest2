package com.ironsource.adqualitysdk.sdk.i;

import android.util.Pair;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ỉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1065 {

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2697;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2698;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f2699;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2700;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2701;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2702;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2703;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2704;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2705;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2706;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2707;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2708;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2709;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final HashMap f2710;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final HashMap f2711;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public int f2714 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public int f2713 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    public byte f2712 = 0;

    static {
        StringFog.decrypt("B0Au6JkP\n", "VyFcm/x9DM8=\n");
        f2709 = StringFog.decrypt("Xx0=\n", "NntJobSiilI=\n");
        f2708 = StringFog.decrypt("w/1ZOg==\n", "ppEqX9Ya8m8=\n");
        f2707 = StringFog.decrypt("4MR2\n", "hqsEfhr55SQ=\n");
        f2706 = StringFog.decrypt("TXPbi4s=\n", "Ohuy5+6Paoc=\n");
        f2705 = StringFog.decrypt("0DH5DjP0\n", "olSNe0Ga4pw=\n");
        f2704 = StringFog.decrypt("GwbTdKk=\n", "eXS2FcJl3Z8=\n");
        f2703 = StringFog.decrypt("mVgSjTJ4fak=\n", "+jd8+VsWCMw=\n");
        f2702 = StringFog.decrypt("Tg==\n", "NQMIsDQ+juA=\n");
        f2701 = StringFog.decrypt("Zsg4\n", "ErpBn+/k0ZE=\n");
        f2700 = StringFog.decrypt("Fod79e8=\n", "deYPlofvbR0=\n");
        f2699 = StringFog.decrypt("dFhaBQ==\n", "Gi02aXp4IwM=\n");
        f2698 = StringFog.decrypt("Igt5Mks=\n", "UX4JVzk+mbw=\n");
        f2697 = StringFog.decrypt("jTdn\n", "+1YVQUs38k0=\n");
        f2711 = new HashMap();
        f2710 = new HashMap();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final AbstractC0544 m4342(List list) {
        char c;
        AbstractC0544 m4344 = m4344(list);
        if (this.f2714 >= list.size()) {
            return m4344;
        }
        String str = m4351(list).f2430;
        int hashCode = str.hashCode();
        if (hashCode == 43) {
            if (str.equals(StringFog.decrypt("zw==\n", "5EUq/hVoc+M=\n"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 45) {
            if (str.equals(StringFog.decrypt("fA==\n", "UafXsQxSQqM=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 1376) {
            if (hashCode == 1440 && str.equals(StringFog.decrypt("+1c=\n", "1nrJX9x0ZaQ=\n"))) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("hVM=\n", "rngBon65aEA=\n"))) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return m4340(new C1046(m4344, m4342(list)));
        }
        if (c == 1) {
            return m4340(new C1236(m4344, m4342(list)));
        }
        if (c == 2) {
            return m4340(new C0765((C0780) m4344));
        }
        if (c == 3) {
            return m4340(new C0638((C0780) m4344));
        }
        this.f2714--;
        return m4344;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final AbstractC0544 m4343(List list) {
        char c;
        AbstractC0544 m4346 = m4346(list);
        while (this.f2714 < list.size()) {
            String str = m4351(list).f2430;
            int hashCode = str.hashCode();
            if (hashCode != 46) {
                if (hashCode == 91 && str.equals(StringFog.decrypt("vQ==\n", "5jUaWtP+xjg=\n"))) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("cA==\n", "XqR7pT8sY7Q=\n"))) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                m4346 = m4350(m4346, list);
            } else {
                if (c != 1) {
                    this.f2714--;
                    return m4346;
                }
                AbstractC0544 m4345 = m4345(list);
                m4354(m4351(list), StringFog.decrypt("OA==\n", "Zeviefqkdlw=\n"), m4345, StringFog.decrypt("LMeBYo4+2tArkpB5gjnfxH/QhjGOINzTOtbDZoQ424B478Q=\n", "X7LjEe1Ms6A=\n"));
                if (m4351(list).f2430.equals(StringFog.decrypt("jw==\n", "sgT7VTzQEoQ=\n"))) {
                    m4346 = m4340(new C1190(m4346, m4345, m4345(list)));
                } else {
                    this.f2714--;
                    m4346 = m4340(new C1237(m4346, m4345));
                }
            }
        }
        return m4346;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC0544 m4344(List list) {
        char c;
        AbstractC0544 m4343 = m4343(list);
        if (this.f2714 >= list.size()) {
            return m4343;
        }
        String str = m4351(list).f2430;
        int hashCode = str.hashCode();
        if (hashCode == 37) {
            if (str.equals(StringFog.decrypt("Yg==\n", "Rysd0k3VQCc=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 42) {
            if (hashCode == 47 && str.equals(StringFog.decrypt("Tg==\n", "YRYzFViCeWo=\n"))) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("ig==\n", "oJhZb6Pf8Bo=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m4340(new C1127(m4343, m4344(list)));
        }
        if (c == 1) {
            return m4340(new C0599(m4343, m4344(list)));
        }
        if (c == 2) {
            return m4340(new C1214(m4343, m4344(list)));
        }
        this.f2714--;
        return m4343;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0544 m4345(List list) {
        char c;
        AbstractC0544 m4349 = m4349(list);
        if (this.f2714 >= list.size()) {
            return m4349;
        }
        String str = m4351(list).f2430;
        int hashCode = str.hashCode();
        if (hashCode != 1216) {
            if (hashCode == 3968 && str.equals(StringFog.decrypt("Etw=\n", "bqDaK8qJv58=\n"))) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("Q/A=\n", "Zda2b8szmSI=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m4340(new C0969(m4349, m4345(list)));
        }
        if (c == 1) {
            return m4340(new C1107(m4349, m4345(list)));
        }
        this.f2714--;
        return m4349;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0544 m4346(List list) {
        C1002 m4351 = m4351(list);
        EnumC1009 enumC1009 = m4351.f2431;
        char c = 65535;
        if (enumC1009 == EnumC1009.f2448) {
            String str = m4351.f2430;
            String str2 = m4351(list).f2430;
            int hashCode = str2.hashCode();
            if (hashCode != 40) {
                if (hashCode == 61 && str2.equals(StringFog.decrypt("Lw==\n", "Erz3dZohYtI=\n"))) {
                    c = 0;
                }
            } else if (str2.equals(StringFog.decrypt("mA==\n", "sLYxncHQ3sA=\n"))) {
                c = 1;
            }
            if (c == 0) {
                return m4340(new C0741((C0780) m4340(new C0780(str)), m4345(list)));
            }
            if (c == 1) {
                return m4340(new C1030(str, m4353(list, StringFog.decrypt("vg==\n", "l+DusUs236k=\n"), new C1073(this))));
            }
            this.f2714--;
            return m4340(new C0780(str));
        }
        if (enumC1009 == EnumC1009.f2446 || enumC1009 == EnumC1009.f2445 || enumC1009 == EnumC1009.f2444 || enumC1009 == EnumC1009.f2443) {
            if (enumC1009 == EnumC1009.f2445) {
                try {
                    try {
                        return m4340(new C0448(Integer.valueOf(Integer.parseInt(m4351.f2430))));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    return m4340(new C1140(Long.valueOf(Long.parseLong(m4351.f2430))));
                }
            } else {
                if (enumC1009 == EnumC1009.f2444) {
                    return m4340(new C0587(Double.valueOf(Double.parseDouble(m4351.f2430))));
                }
                if (enumC1009 == EnumC1009.f2443) {
                    return m4340(new C0631(Boolean.valueOf(Boolean.parseBoolean(m4351.f2430))));
                }
            }
            return m4340(new C1287(m4351.f2430));
        }
        if (enumC1009 == EnumC1009.f2442) {
            return m4340(new C1265(m4351.f2430));
        }
        if (enumC1009 == EnumC1009.f2449) {
            String str3 = m4351.f2430;
            int hashCode2 = str3.hashCode();
            if (hashCode2 != 3392903) {
                if (hashCode2 == 109801339 && str3.equals(f2698)) {
                    c = 1;
                }
            } else if (str3.equals(f2699)) {
                c = 0;
            }
            if (c == 0) {
                synchronized (C0863.class) {
                }
                return C0863.f2089;
            }
            if (c != 1) {
                return null;
            }
            m4354(m4351(list), StringFog.decrypt("lQ==\n", "u+zMEl3jCEk=\n"), m4351, StringFog.decrypt("eaWji13ET8Jlpb+KD4ZZimy/v4JAk1nOKrKqzk7EUc9+uLyKD41S3GWzsppGi1I=\n", "CtDT7i/kPKo=\n"));
            return m4350(m4340(new C0780(f2698)), list);
        }
        if (enumC1009 != EnumC1009.f2447) {
            m4355(StringFog.decrypt("xM0m8uvmDun0x2P+9OgI87E=\n", "kaNDipuDbZ0=\n") + m4351);
            throw null;
        }
        String str4 = m4351.f2430;
        int hashCode3 = str4.hashCode();
        if (hashCode3 != 33) {
            if (hashCode3 != 40) {
                if (hashCode3 != 45) {
                    if (hashCode3 != 91) {
                        if (hashCode3 == 123 && str4.equals(f2702)) {
                            c = 2;
                        }
                    } else if (str4.equals(StringFog.decrypt("dQ==\n", "LoPhSnqghY0=\n"))) {
                        c = 1;
                    }
                } else if (str4.equals(StringFog.decrypt("Ew==\n", "PutI+2noCJc=\n"))) {
                    c = 4;
                }
            } else if (str4.equals(StringFog.decrypt("wg==\n", "6ozjCxiaNBA=\n"))) {
                c = 0;
            }
        } else if (str4.equals(StringFog.decrypt("wQ==\n", "4IwtdFpdxvw=\n"))) {
            c = 3;
        }
        if (c == 0) {
            AbstractC0544 m4340 = m4340(new C1093(m4345(list)));
            m4354(m4351(list), StringFog.decrypt("yA==\n", "4cHcNN15VmQ=\n"), m4340, StringFog.decrypt("9SGyxJCXxZj7JK7EkJfFmL9h5g==\n", "mEjBt/n5org=\n"));
            return m4340;
        }
        if (c == 1) {
            return m4340(new C0743(m4353(list, StringFog.decrypt("WQ==\n", "BOUGAFwo1C4=\n"), new C1073(this))));
        }
        if (c == 2) {
            HashMap hashMap = new HashMap();
            Iterator it = m4353(list, StringFog.decrypt("7g==\n", "kzp1IKg6Ui4=\n"), new C1090(this)).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                hashMap.put((String) pair.first, (AbstractC0544) pair.second);
            }
            return m4340(new C0986(hashMap));
        }
        if (c == 3) {
            return m4340(new C0901(m4343(list)));
        }
        if (c == 4) {
            return m4340(new C1236(m4340(new C0448(0)), m4346(list)));
        }
        m4355(StringFog.decrypt("gw4sCBwLDq+zBGkfHAsfuqIPO1A=\n", "1mBJcGxubds=\n") + m4351.f2430);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0502 m4348(ArrayList arrayList) {
        char c;
        AbstractC0544 abstractC0544;
        String str = m4351((List) arrayList).f2430;
        switch (str.hashCode()) {
            case -934396624:
                if (str.equals(f2705)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -567202649:
                if (str.equals(f2703)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 59:
                if (str.equals(StringFog.decrypt("Kg==\n", "EfE3UuJt+Cg=\n"))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 123:
                if (str.equals(f2702)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3357:
                if (str.equals(f2709)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 101577:
                if (str.equals(f2707)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 115131:
                if (str.equals(f2701)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 116519:
                if (str.equals(f2697)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 94001407:
                if (str.equals(f2704)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 113101617:
                if (str.equals(f2706)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        AbstractC0502 abstractC0502 = null;
        AbstractC0544 abstractC05442 = null;
        abstractC0502 = null;
        switch (c) {
            case 0:
                return m4339(new C0633(null));
            case 1:
                m4356(arrayList, StringFog.decrypt("Kg==\n", "ApPTxF8gwXE=\n"), StringFog.decrypt("ByH7SL2zYeYDIrVP6aF97BsrvxurtzXlASu3VL63caMMPvta6fU9pA==\n", "bkfbO8nSFYM=\n"));
                AbstractC0544 m4345 = m4345(arrayList);
                m4354(m4351((List) arrayList), StringFog.decrypt("uQ==\n", "kLzxMX2YEyU=\n"), m4345, StringFog.decrypt("Pif7sEpQODU6JLW3HlIjPjMor6pRX2wjPy6ur1oRLjV3KLWwV1UpcHBp8uQ=\n", "V0Hbwz4xTFA=\n"));
                AbstractC0502 m4348 = m4348(arrayList);
                if (this.f2714 < arrayList.size()) {
                    if (m4347(arrayList).f2430.equals(f2708)) {
                        this.f2714++;
                        abstractC0502 = m4348(arrayList);
                    }
                }
                return m4339(new C0915(m4345, m4348, abstractC0502, this.f2712));
            case 2:
                m4356(arrayList, StringFog.decrypt("sg==\n", "mnPXIe8hrQI=\n"), StringFog.decrypt("n/LK5XXgb4Oc8N2rcrR9n5bo1KEm9mvXn/LUqWnja5PZ/8HlZ7Qp394=\n", "+Z24xQaUDvc=\n"));
                String decrypt = StringFog.decrypt("MQ==\n", "Ch+0nHOufmw=\n");
                if (m4347(arrayList).f2430.equals(decrypt)) {
                    abstractC0544 = null;
                } else {
                    abstractC0544 = m4345(arrayList);
                    m4354(m4351((List) arrayList), decrypt, abstractC0544, AbstractC0584.m4083("kVuitNxuHmLeTq6twWUMfZdEuP3AaBB7kk/2uN1kX3mXX779\n", "/ivW3bMAfw4=\n", new StringBuilder(), decrypt));
                }
                AbstractC0544 m43452 = m4345(arrayList);
                m4354(m4351((List) arrayList), StringFog.decrypt("Hg==\n", "JTMA3L7k4wQ=\n"), m43452, StringFog.decrypt("ZRTa5JkfbVpqD8GrlFBwVmwOxKDaFW1aIwzBsJJQJAUk\n", "A3uoxPpwAz4=\n"));
                String decrypt2 = StringFog.decrypt("fA==\n", "VUh3I9LqONM=\n");
                if (!m4347(arrayList).f2430.equals(decrypt2)) {
                    abstractC05442 = m4345(arrayList);
                    m4354(m4351((List) arrayList), decrypt2, abstractC05442, AbstractC0584.m4083("kVuitNxuHmLeTq6twWUMfZdEuP3AaBB7kk/2uN1kX3mXX779\n", "/ivW3bMAfw4=\n", new StringBuilder(), decrypt2));
                }
                return m4339(new C0889(abstractC0544, m43452, abstractC05442, m4348(arrayList)));
            case 3:
                m4356(arrayList, StringFog.decrypt("+w==\n", "020nJEwTOcM=\n"), StringFog.decrypt("Dcyxn5bPDc4b0L2eloEKmgnMt4afi17YH4S+nJ+DEc0fwPiRis8fml2M/w==\n", "eqTY8/Pvfro=\n"));
                AbstractC0544 m43453 = m4345(arrayList);
                m4356(arrayList, StringFog.decrypt("tQ==\n", "nL7X/hdzQ6g=\n"), StringFog.decrypt("Zugti+wZoi1w9CGK7FeleXLvKoPgTbg2f6A3j+ZMvT0x4iHH4FeiMHXlZMChEPY=\n", "EYBE54k50Vk=\n"));
                return m4339(new p(m43453, m4348(arrayList)));
            case 4:
                AbstractC0502 m4339 = m4347(arrayList).f2430.equals(StringFog.decrypt("QA==\n", "e+f0NYDZqgo=\n")) ? m4339(new C0946(null)) : m4339(new C0946(m4345(arrayList)));
                m4354(m4351((List) arrayList), StringFog.decrypt("zQ==\n", "9jbzOKGKrD4=\n"), m4339, StringFog.decrypt("SGA8Gt0tGuhOZDwKwiZU7xp2IADaL167X2ssT9gqTvMaInNI\n", "OgVIb69DOps=\n"));
                return m4339;
            case 5:
                m4356(arrayList, StringFog.decrypt("SA==\n", "c59wM/A6jhI=\n"), StringFog.decrypt("e0isMTZUgot4Tqw9OBqF32pSpiUxENGad17pJzQAmd8+Ae4=\n", "GTrJUF108f8=\n"));
                return m4339(new C0618());
            case 6:
                m4356(arrayList, StringFog.decrypt("ew==\n", "QEAXKSZfL+M=\n"), StringFog.decrypt("N+wHNnJbzUx08B0jb1DVTDr3STFzWs1FMKMMLH8Vz0Ag60llIBI=\n", "VINpQhs1uCk=\n"));
                return m4339(new C0692());
            case 7:
                return m4352(arrayList);
            case '\b':
                String str2 = f2702;
                m4356(arrayList, str2, StringFog.decrypt("X5FT5sNppSROjk+oxD2pJViXCqTVPac/RpNFs9555HhCjVmv1Hjkd1CeDe8=\n", "K+MqxrAdxFA=\n"));
                C1219 m4352 = m4352(arrayList);
                m4356(arrayList, f2700, StringFog.decrypt("NVn7ELwzSzkkRudeu2dZJS5e7lTvJU9tJ0TuXKAwTylhSfsQrmdJLDVI6hC8M0s5JEbnXrs=\n", "QSuCMM9HKk0=\n"));
                m4356(arrayList, StringFog.decrypt("+A==\n", "0O3uc8iyD9A=\n"), StringFog.decrypt("Dp9tapxlCJwUiXZ7kGUQkQKLdW3UJwbZC5F1ZZsyBp1NnGAplWVE0Uo=\n", "bf4ZCfRFY/k=\n"));
                C1002 m4351 = m4351((List) arrayList);
                EnumC1009 enumC1009 = EnumC1009.f2448;
                String decrypt3 = StringFog.decrypt("/uTnvhrWosLw7OCuG5izg+Hk9a8f3eWM8uDx\n", "k42UzXO4xeI=\n");
                if (!m4351.f2431.equals(enumC1009)) {
                    m4355(m4341(enumC1009.toString(), m4351.f2431.toString(), m4352, decrypt3));
                    throw null;
                }
                C0780 c0780 = (C0780) m4340(new C0780(m4351.f2430));
                m4356(arrayList, StringFog.decrypt("VA==\n", "ffTX44LQp+U=\n"), StringFog.decrypt("1DHc6xWFy2DFMcWoDs3UdNs0iOoYhd1u2zzH/xjBm2POcMmoWoyc\n", "t1CoiH2luwE=\n"));
                m4356(arrayList, str2, StringFog.decrypt("rffe1fp9bcWv4s/b9zNqkaPj2cKyP3uRrfnHxv0ocNXuvsPY4TR61O6x0cu1dA==\n", "zpaqtpJdHrE=\n"));
                return m4339(new C0766(m4352, m4352(arrayList), c0780));
            case '\t':
                return m4339(new C0680(m4353(arrayList, StringFog.decrypt("5Q==\n", "3oxij8meWOQ=\n"), new C1092(this))));
            default:
                this.f2714--;
                AbstractC0544 m43454 = m4345(arrayList);
                m4354(m4351((List) arrayList), StringFog.decrypt("Cg==\n", "MaQgWJReGc0=\n"), m43454, StringFog.decrypt("GrOG/K7w6btQ4dKvpuqu/hm+1eChvv3vFq6Q4qLw+g==\n", "d9r1j8eejps=\n"));
                return m4339(new C0633(m43454));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4354(C1002 c1002, String str, Object obj, String str2) {
        if (c1002.f2430.equals(str)) {
            return;
        }
        String m4543 = AbstractC1293.m4543("lg==\n", "sTvNkZUSVIw=\n", AbstractC0446.m4006("GA==\n", "P1ttL0dZ5H4=\n", new StringBuilder(), str));
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Hg==\n", "Oelb2NbEyo4=\n"));
        sb.append(c1002.f2430);
        m4355(m4341(m4543, AbstractC1293.m4543("OQ==\n", "HvCS0OuQzL8=\n", sb), obj, str2));
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1002 m4347(ArrayList arrayList) {
        try {
            if (this.f2714 < arrayList.size()) {
                return (C1002) arrayList.get(this.f2714);
            }
            return null;
        } catch (Exception e) {
            throw new C0911(this.f2713, StringFog.decrypt("ZbHpM/4yN8FO6f0+5yo7jlCs7z3nKDmOQb2qOOs+Ko5UpuEz4A==\n", "IMmKVo5GXq4=\n"), e);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 m4349(List list) {
        char c;
        AbstractC0544 m4342 = m4342(list);
        if (this.f2714 >= list.size()) {
            return m4342;
        }
        String str = m4351(list).f2430;
        int hashCode = str.hashCode();
        if (hashCode == 60) {
            if (str.equals(StringFog.decrypt("ng==\n", "oqfbNZe76c0=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 62) {
            if (str.equals(StringFog.decrypt("Zg==\n", "WFtj6DB1fQ8=\n"))) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 1084) {
            if (str.equals(StringFog.decrypt("C58=\n", "KqKAzns1u9w=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 1921) {
            if (str.equals(StringFog.decrypt("n+A=\n", "o91aZXqG8ew=\n"))) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 1952) {
            if (hashCode == 1983 && str.equals(StringFog.decrypt("7Q8=\n", "0zJE3wdhGXg=\n"))) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("FU8=\n", "KHLRTor415A=\n"))) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return m4340(new C0579(m4342, m4349(list)));
        }
        if (c == 1) {
            return m4340(new C0912(m4342, m4349(list)));
        }
        if (c == 2) {
            return m4340(new C0822(m4342, m4349(list)));
        }
        if (c == 3) {
            return m4340(new C0362(m4342, m4349(list)));
        }
        if (c == 4) {
            return m4340(new C0819(m4342, m4349(list)));
        }
        if (c != 5) {
            this.f2714--;
            return m4342;
        }
        return m4340(new C0358(m4342, m4349(list)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC0544 m4340(AbstractC0544 abstractC0544) {
        HashMap hashMap = f2711;
        AbstractC0544 abstractC05442 = (AbstractC0544) hashMap.get(abstractC0544);
        if (abstractC05442 != null) {
            return abstractC05442;
        }
        hashMap.put(abstractC0544, abstractC0544);
        return abstractC0544;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC0502 m4339(AbstractC0502 abstractC0502) {
        HashMap hashMap = f2710;
        AbstractC0502 abstractC05022 = (AbstractC0502) hashMap.get(abstractC0502);
        if (abstractC05022 != null) {
            return abstractC05022;
        }
        hashMap.put(abstractC0502, abstractC0502);
        return abstractC0502;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1219 m4352(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        byte b = (byte) (this.f2712 + 1);
        this.f2712 = b;
        C1002 m4347 = m4347(arrayList);
        while (!m4347.f2430.equals(StringFog.decrypt("wA==\n", "vd9LQbDzryI=\n"))) {
            this.f2713++;
            arrayList2.add(m4348(arrayList));
            m4347 = m4347(arrayList);
        }
        this.f2714++;
        this.f2713++;
        this.f2712 = (byte) (this.f2712 - 1);
        return (C1219) m4339(new C1219(arrayList2, b));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 m4350(AbstractC0544 abstractC0544, List list) {
        C1002 m4351 = m4351(list);
        ArrayList arrayList = null;
        if (m4351.f2431 == EnumC1009.f2448) {
            String str = m4351.f2430;
            C1002 m43512 = m4351(list);
            if (m43512.f2430.equals(StringFog.decrypt("mg==\n", "psWeOu4y47g=\n"))) {
                arrayList = m4353(list, StringFog.decrypt("Kg==\n", "FCgrh15LpHw=\n"), new C1089(this));
                m4354(m4351(list), StringFog.decrypt("eQ==\n", "UexPwtGJ/J0=\n"), arrayList, StringFog.decrypt("thcn2xdlpKGrHGHUHmeju+QcINoXdfC7rB002xYmsq3kFC7bHmmnraBSI85Sb76+qxEgwxtpvujj\nWm+ZXC/3\n", "xHJBt3IG0Mg=\n"));
            } else {
                if (!m43512.f2430.equals(StringFog.decrypt("kg==\n", "uiNpSaFpy14=\n"))) {
                    this.f2714--;
                    return m4340(new C0723(abstractC0544, str));
                }
            }
            return m4340(new C0552(abstractC0544, str, arrayList, m4353(list, StringFog.decrypt("BA==\n", "LTSmTNXpk5A=\n"), new C1073(this))));
        }
        throw new C0911(this.f2713, StringFog.decrypt("NwJASb9tum1SE1RJsm22bxsfQgy+bKspFRVEDA==\n", "cnowLNwZ3wk=\n") + m4351, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Pair m4338(C1065 c1065, List list) {
        C1002 m4351 = c1065.m4351(list);
        if (m4351.f2431 == EnumC1009.f2446) {
            String str = m4351.f2430;
            c1065.m4354(c1065.m4351(list), StringFog.decrypt("FQ==\n", "L/q/8zqnUCo=\n"), str, StringFog.decrypt("vAcT2QuKiQj2BxTYXo2IUbQRXNFEjYAeoREYl0mYzBD2Ah3bXoTMELAAGcULxtZW\n", "1nR8tyvh7HE=\n"));
            return new Pair(str, c1065.m4345(list));
        }
        throw new C0911(c1065.f2713, StringFog.decrypt("K+ieHEPPIN5Ow5oLSdUimgzlmllH1DGa\n", "bpDueSC7Rbo=\n") + m4351, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m4353(List list, String str, InterfaceC1072 interfaceC1072) {
        ArrayList arrayList = new ArrayList();
        if (!m4351(list).f2430.equals(str)) {
            this.f2714--;
            arrayList.add(interfaceC1072.mo4365(list));
            C1002 m4351 = m4351(list);
            while (m4351.f2430.equals(StringFog.decrypt("Mw==\n", "Hz/9xA9DIy0=\n"))) {
                arrayList.add(interfaceC1072.mo4365(list));
                m4351 = m4351(list);
            }
            m4354(m4351, str, arrayList, AbstractC1293.m4543("HA==\n", "Ow69A2D/8K8=\n", AbstractC0446.m4006("3ZWYHzdmxXHEkI9LcnvJPsaVnwM3Mg==\n", "sfzraxcVrR4=\n", new StringBuilder(), str)));
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1002 m4351(List list) {
        try {
            if (this.f2714 < list.size()) {
                int i = this.f2714;
                this.f2714 = i + 1;
                return (C1002) list.get(i);
            }
            throw new C0911(this.f2713, StringFog.decrypt("gcvBtstvO1KxwYSr1W54SbKF0KHQbzZV\n", "1KWkzrsKWCY=\n"), null);
        } catch (Exception e) {
            throw new C0911(this.f2713, StringFog.decrypt("sa9R6bj0Mvqa90Xkoew+tZOyRvih7jy1mrJK+Oj0NP6RuQ==\n", "9NcyjMiAW5U=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4356(ArrayList arrayList, String str, String str2) {
        m4354(m4351((List) arrayList), str, (Object) null, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4341(String str, String str2, Object obj, String str3) {
        String str4;
        if (obj != null) {
            str4 = StringFog.decrypt("k/Up4BAkHg==\n", "s5RPlHVWPiE=\n") + obj;
        } else {
            str4 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("F9y5TKuQfdxy\n", "UqTJKcjkGLg=\n"));
        sb.append(str);
        sb.append(str4);
        StringBuilder m4006 = AbstractC0446.m4006("lOGDZ6ZGxTHR6oB24hQ=\n", "tIP2E4Y0oFI=\n", sb, str2);
        m4006.append(str3 != null ? AbstractC0584.m4083("acuy\n", "SeaS17jrYnU=\n", new StringBuilder(), str3) : "");
        return m4006.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4355(String str) {
        throw new C0911(this.f2713, str, null);
    }
}
