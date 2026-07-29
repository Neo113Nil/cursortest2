package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: o.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479m9 implements InterfaceC1714pk {
    public static final String c;
    public static final Set d;
    public static final C1479m9 e;
    public static final C1479m9 f;
    public final String a;
    public final String b;

    static {
        String i = AbstractC1494mO.i("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = i;
        String i2 = AbstractC1494mO.i("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String i3 = AbstractC1494mO.i("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1845rk("proto"), new C1845rk("json"))));
        e = new C1479m9(i, null);
        f = new C1479m9(i2, i3);
    }

    public C1479m9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C1479m9 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C1479m9(str2, str3);
    }
}
