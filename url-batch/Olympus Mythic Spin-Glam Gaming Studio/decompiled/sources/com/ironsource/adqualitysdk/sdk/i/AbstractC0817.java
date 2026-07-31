package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒦ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public abstract class AbstractC0817 {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final List f2011;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2012;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2013;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final Pattern f2014;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Pattern f2015;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final Pattern f2016;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final Pattern f2017;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final Pattern f2018;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Pattern f2019;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Pattern f2020;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Pattern f2021;

    static {
        StringFog.decrypt("av8Vru8=\n", "Jppty53KTwQ=\n");
        f2013 = StringFog.decrypt("IqRFsA==\n", "VtYw1boUrso=\n");
        f2012 = StringFog.decrypt("ZBHUUvM=\n", "AnC4IZaqSGM=\n");
        f2021 = Pattern.compile(StringFog.decrypt("3MF27W8xN3CmxUqbdF1ga6/AJ+0sVEV3qA==\n", "gpoXwBVwGio=\n"));
        f2020 = Pattern.compile(StringFog.decrypt("TRxmMMAUF1FvZRAtp2FhUQ==\n", "Ez5OD/pIS3M=\n"));
        f2019 = Pattern.compile(StringFog.decrypt("uJ4yw1mzCZCa4kTbPsZ/kA==\n", "5rka/GPvVbc=\n"));
        f2018 = Pattern.compile(StringFog.decrypt("nhcMW5sW2QbuFwxbmxbZ\n", "wEw8dqJL8lo=\n"));
        f2017 = Pattern.compile(StringFog.decrypt("B6YYefzW1A==\n", "Wf0oVMWL/3I=\n"));
        f2016 = Pattern.compile(StringFog.decrypt("2xHGr/UH3iuhFfrZ7muJMKgQl6+2Yqxf2GD7rOwqkgL2\n", "hUqngo9G83E=\n"));
        f2015 = Pattern.compile(StringFog.decrypt("+ph1\n", "pL5TMx5SMv8=\n"));
        f2014 = Pattern.compile(StringFog.decrypt("+t1Ztec=\n", "pIEl6Zu6bm8=\n"));
        f2011 = Arrays.asList(StringFog.decrypt("Wus=\n", "M43O6QqI5Fw=\n"), StringFog.decrypt("NnzMtA==\n", "UxC/0f6CL04=\n"), StringFog.decrypt("oYfpgQ==\n", "z/KF7bDKtzw=\n"), StringFog.decrypt("hFSg3cJ4\n", "9jHUqLAWv+E=\n"), StringFog.decrypt("tVLPDf0=\n", "xie/aI+Szbg=\n"), StringFog.decrypt("f8oU\n", "C7htyJ74Ez0=\n"), StringFog.decrypt("zLWV0es=\n", "r9ThsoOixbQ=\n"));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0048. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x004b. Please report as an issue. */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m4216(String str, String str2, String str3) {
        int length;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str3.length()) {
            int i3 = i2 + 1;
            char charAt = i3 < str3.length() ? str3.charAt(i3) : (char) 0;
            char charAt2 = str3.charAt(i2);
            if (charAt2 != '\n') {
                if (charAt2 != '%' && charAt2 != '[' && charAt2 != ']' && charAt2 != '{' && charAt2 != '}') {
                    if (charAt2 != '!') {
                        if (charAt2 != '\"') {
                            switch (charAt2) {
                                case '\'':
                                    String m4215 = m4215(f2019, str3, i2);
                                    if (m4215 != null) {
                                        String substring = m4215.substring(1, m4215.length() - 1);
                                        if (substring.length() == 1) {
                                            arrayList.add(new C1002(EnumC1009.f2445, String.valueOf((int) substring.charAt(0))));
                                        } else {
                                            arrayList.add(new C1002(EnumC1009.f2446, substring));
                                        }
                                        length = substring.length();
                                        i = length + 2;
                                        i2 += i;
                                        break;
                                    } else {
                                        String m4083 = AbstractC0584.m4083("6njReXEo\n", "ph2pHAMH/48=\n", new StringBuilder(), str);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(StringFog.decrypt("o7WI7/RyUQ+UtJPu4XJSGpSulOemM1VOlqiJ6fI7TgDG\n", "5sf6gIZSIW4=\n"));
                                        sb.append(i2);
                                        AbstractC0844.m4219(m4083, AbstractC0584.m4083("474ebQ==\n", "w9dwTUkHAQo=\n", sb, str2), null, null);
                                        break;
                                    }
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                    break;
                                case '+':
                                    if (charAt != '+') {
                                        arrayList.add(new C1002(EnumC1009.f2447, "" + str3.charAt(i2)));
                                        break;
                                    } else {
                                        arrayList.add(new C1002(EnumC1009.f2447, StringFog.decrypt("3zI=\n", "9BktTwlU7/U=\n")));
                                        i2 += 2;
                                        break;
                                    }
                                case '-':
                                    if (charAt != '-') {
                                        break;
                                    } else {
                                        arrayList.add(new C1002(EnumC1009.f2447, StringFog.decrypt("ZWQ=\n", "SEm7Zs7DUU0=\n")));
                                        i2 += 2;
                                        break;
                                    }
                                case '/':
                                    arrayList.add(new C1002(EnumC1009.f2447, "" + str3.charAt(i2)));
                                    break;
                                default:
                                    switch (charAt2) {
                                        case ':':
                                        case ';':
                                        case '?':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i2))) {
                                                EnumC1009 enumC1009 = EnumC1009.f2442;
                                                String m42152 = m4215(f2016, str3, i2);
                                                if (TextUtils.isEmpty(m42152)) {
                                                    enumC1009 = EnumC1009.f2448;
                                                    m42152 = m4215(f2021, str3, i2);
                                                    if (!TextUtils.isEmpty(m42152)) {
                                                        if (m42152.equals(f2013) || m42152.equals(f2012)) {
                                                            enumC1009 = EnumC1009.f2443;
                                                        } else if (f2011.contains(m42152)) {
                                                            enumC1009 = EnumC1009.f2449;
                                                        }
                                                    }
                                                }
                                                if (TextUtils.isEmpty(m42152)) {
                                                    enumC1009 = EnumC1009.f2444;
                                                    m42152 = m4215(f2018, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m42152)) {
                                                    enumC1009 = EnumC1009.f2445;
                                                    m42152 = m4215(f2017, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m42152)) {
                                                    enumC1009 = EnumC1009.f2447;
                                                    m42152 = m4215(f2014, str3, i2);
                                                }
                                                if (TextUtils.isEmpty(m42152)) {
                                                    enumC1009 = EnumC1009.f2447;
                                                    m42152 = m4215(f2015, str3, i2);
                                                }
                                                if (!TextUtils.isEmpty(m42152)) {
                                                    arrayList.add(new C1002(enumC1009, m42152));
                                                    i = m42152.length();
                                                    i2 += i;
                                                    break;
                                                } else {
                                                    String m40832 = AbstractC0584.m4083("X9jhbLx2\n", "E72ZCc5ZPvs=\n", new StringBuilder(), str);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(StringFog.decrypt("watXOE7XabP9v0A5DdtmvObl\n", "lMUlXS24Dt0=\n"));
                                                    sb2.append(str3.charAt(i2));
                                                    sb2.append(StringFog.decrypt("g004GurKmbvXRSNUug==\n", "oyxMOpql6tI=\n"));
                                                    sb2.append(i2);
                                                    AbstractC0844.m4219(m40832, AbstractC0584.m4083("P/NtGw==\n", "H5oDO/ClrAk=\n", sb2, str2), null, null);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                    }
                            }
                        } else {
                            String m42153 = m4215(f2020, str3, i2);
                            if (m42153 == null) {
                                String m40833 = AbstractC0584.m4083("xjzjoePZ\n", "ilmbxJH2efM=\n", new StringBuilder(), str);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(StringFog.decrypt("CoxpNR0jh8o9jXI0CCOE3z2XdT1PYoOLP5FoMxtqmMVv\n", "T/4bWm8D96s=\n"));
                                sb3.append(i2);
                                AbstractC0844.m4219(m40833, AbstractC0584.m4083("BJO0bA==\n", "JPraTCe3Nrs=\n", sb3, str2), null, null);
                            } else {
                                String substring2 = m42153.substring(1, m42153.length() - 1);
                                arrayList.add(new C1002(EnumC1009.f2446, substring2));
                                length = substring2.length();
                                i = length + 2;
                                i2 += i;
                            }
                        }
                    }
                    if (charAt == '=') {
                        EnumC1009 enumC10092 = EnumC1009.f2447;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3.charAt(i2));
                        arrayList.add(new C1002(enumC10092, AbstractC1293.m4543("/g==\n", "w3PmTT/2Fw0=\n", sb4)));
                        i2 += 2;
                    } else {
                        arrayList.add(new C1002(EnumC1009.f2447, "" + str3.charAt(i2)));
                    }
                }
                arrayList.add(new C1002(EnumC1009.f2447, "" + str3.charAt(i2)));
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4215(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        matcher.region(i, str.length());
        if (matcher.find()) {
            return str.substring(matcher.start(), matcher.end());
        }
        return null;
    }
}
