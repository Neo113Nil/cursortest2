package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ί, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0498 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f457 = StringFog.decrypt("bKP15KkRZYxso8jaqAB3g2ij\n", "C8aBtNt0Fu0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f456 = StringFog.decrypt("m/TS0e4LuQeb5c/s6R6wNon9yvrhHLc=\n", "6JGmmIB/3HU=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f455 = StringFog.decrypt("hxlASpJecJuiFVBgjWl4mZgeVWaJ\n", "9Hw0BeIqGfU=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f454 = StringFog.decrypt("l5zut36vlhGZlu6uYr6AAo2HqbNlq4let520on65kRmKmqGrTamRGYiatL4=\n", "/vPAxwzK5XA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f453 = StringFog.decrypt("JbgBIsv4VWwYvxQr+OhVbBq/AT4=\n", "bNZ1R7mLIQU=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f452 = StringFog.decrypt("eb7JMWACq553tMkofBO9jWOljjV7BrTRZbjJCHwTvY1jpY41ewa0vnOljjd7E6E=\n", "ENHnQRJn2P8=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f451 = StringFog.decrypt("jYBCuNur4dSsgH+/zqLSxKyAfb/btw==\n", "2OkL1q/Ok6c=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f450 = StringFog.decrypt("kLdLF7A=\n", "39A+Zcl7LaM=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f449 = StringFog.decrypt("vpHmdfH3dA==\n", "7uODBpCQEcs=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f448 = StringFog.decrypt("lMMkxOi7GPmg2g==\n", "xLFBt4ncfao=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f447 = StringFog.decrypt("kXfzRFVT0F6vcfNFR0DcY6hk+g==\n", "wQWWNzQ0tRc=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f446 = StringFog.decrypt("dqUgzGairbNIoyDNdLGhjk+2KfxmqaSYR7Qu\n", "JtdFvwfFyPo=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f445 = StringFog.decrypt("XtId8tHkBiF+1BHv5uoHC2E=\n", "DqB4gbCDY24=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f444 = StringFog.decrypt("0OxHgcaX5o7w6kuc8ZnnpO/dQ57LkuKi6w==\n", "gJ4i8qfwg8E=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f443 = StringFog.decrypt("tl17EkMVPDaBVQ==\n", "5DgMczFxdUI=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f442 = StringFog.decrypt("qpu24Vsu89g=\n", "6//1jjVImr8=\n");

    public C0498(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        String mo4017 = mo4017();
        if (mo4017 != null) {
            return mo4017.split(StringFog.decrypt("Vg==\n", "e/5+b2rGw/s=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f457, new C0539(this));
        hashMap.put(f456, new C0533(this));
        hashMap.put(f455, new C0532(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(f442)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1907784110:
                if (str.equals(f445)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1704786309:
                if (str.equals(f453)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -938422005:
                if (str.equals(f448)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -610604286:
                if (str.equals(f443)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -126768170:
                if (str.equals(f454)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                if (str.equals(f450)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 698887547:
                if (str.equals(f447)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1067648736:
                if (str.equals(f446)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1346371759:
                if (str.equals(f449)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1871097647:
                if (str.equals(f451)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2109755994:
                if (str.equals(f452)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2128976055:
                if (str.equals(f444)) {
                    c = '\n';
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
            case 1:
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case '\b':
                return PresageInterstitialCallback.class;
            case '\t':
                return PresageOptinVideo.class;
            case '\n':
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case '\f':
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final String mo4017() {
        try {
            try {
                return (String) Class.forName(StringFog.decrypt("E2zmIdKaw3UdZuYyz5LdexQtoTeOqdF3Ema6OM6bxXwbdrwVz4rSZzdspiXEsMI=\n", "egPIUaD/sBQ=\n")).getMethod(StringFog.decrypt("qw==\n", "yhn/ZOeKsHY=\n"), null).invoke(null, null);
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
