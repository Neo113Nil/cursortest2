package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｌ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1303 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3595 = StringFog.decrypt("FPzDbFvJPyAK\n", "c5m3LSu5dEU=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3594 = StringFog.decrypt("5jvznIFLxKLHP+Sui03eg+8t87uKXMI=\n", "gV6H2uQ/p8o=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3593 = StringFog.decrypt("1HfIJ1g8sTvDfdIVWSy9LPp2\n", "sxK8Zjxu1Eg=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3592 = StringFog.decrypt("dJz1ehmK1DZjlu9IGJHcNWGc8kgUt98QYZU=\n", "E/mBO33YsUU=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3591 = StringFog.decrypt("SkrDaHK6T5VdQNlac7pPiElKxUB4j2eHXQ==\n", "LS+3KRboKuY=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3590 = StringFog.decrypt("zBNhhR2cSG3bGXu3HJxIcM8TZ60XqW9rxRJ5oQ==\n", "q3YVxHnOLR4=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3589 = StringFog.decrypt("7ZIaqlF3AeLmgziHUHQP1u6EPItFZAXk/rQbnUB+DcfrhQ+DRw==\n", "ivdu7jQRYJc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3588 = StringFog.decrypt("A+mGviv6YsMU45yMKuljww==\n", "ZIzy/0+oB7A=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3587 = StringFog.decrypt("pHi/PFCVcNuzcqUOUZdnwaB4mxJdqWE=\n", "wx3LfTTHFag=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3586 = StringFog.decrypt("7af+i0NZxN/vkealU1/47M4=\n", "isKKyicKraU=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3585 = StringFog.decrypt("MlTUnCIcANkwcMSJPz8M\n", "VTGg3UZPaaM=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3584 = StringFog.decrypt("9pzHj7LJmDH0qcashf+FP/iX1L0=\n", "kfmzztaa8Us=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3583 = StringFog.decrypt("Mej5CbTUjoYR9cwIlc6Aiizy2QGm2Q==\n", "WJu4bee99OM=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3582 = StringFog.decrypt("Y4gKAtp7pMNGnxsAxliR4nSVHRrjf57gZ58dLs9u\n", "APpvY64e8IE=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3581 = StringFog.decrypt("AkzZ2c5zElkkRtnbz2IpaTJbzs7TdSM=\n", "YT68uLoWRhs=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3580 = StringFog.decrypt("ljwbF3rUEuKBNgEle8UF9JAtBiB7zxM=\n", "8VlvVh6Gd5E=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3579 = StringFog.decrypt("Stk/Otf5VBx53Bk23/4=\n", "C71tX7CQJ2g=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3578 = StringFog.decrypt("/4zlX84JSBnSrN4=\n", "u9inHq19IW8=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3577 = StringFog.decrypt("7H1bwQealurgfBiLA4Ge8+o8V4sV2bPEzVNVmw+BnuT2\n", "jxI272b395A=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3576 = StringFog.decrypt("5YCcCfefk6PSoLc08IqakMKgtzbwn48=\n", "odTeQJnr9tE=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3575 = StringFog.decrypt("KX3IExFB2eolfItZFVrR8y88xFkDAvzECFvLSRVey+QjZsxcHG3b5CNkzEkJ\n", "ShKlPXAsuJA=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3574 = StringFog.decrypt("eadSGjnH7QxUhXkvJA==\n", "PfMQW12Gjng=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3573 = StringFog.decrypt("evlgY7CVht12+CMptI6OxHy4bCmi1qPzW9dpDLKMjtFw4nQ=\n", "GZYNTdH456c=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3572 = StringFog.decrypt("9vq4bPjMkrzX3IlZ9fGVqd4=\n", "sq76LZyF/Mg=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3571 = StringFog.decrypt("IStknXgGIlABGlQ=\n", "ZX8m3BxKTTE=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3570 = StringFog.decrypt("roYNcABiAW6ftzxF\n", "6tJPMWQwZB8=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3569 = StringFog.decrypt("W0UXxNPJpT1vfjv20g==\n", "HxFVhbebwE4=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3568 = StringFog.decrypt("2x/X9OTmu/zo\n", "n0uVtYCw0pk=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3567 = StringFog.decrypt("T4VsOVIBA/pu\n", "C9EueDZSaoA=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3566 = StringFog.decrypt("aIzsS3ap7Blkja8BcrLkAG7N4AFk6sk3SaLlM36h+g==\n", "C+OBZRfEjWM=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3565 = StringFog.decrypt("KF2c87RYU3UbWqvCoGFIZC9lt9e+eg==\n", "bAnestAOOhA=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3564 = StringFog.decrypt("mLRpydOkXriagUj72aJE\n", "3OArj7bQPdA=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3563 = StringFog.decrypt("2W+qC1PodxnQWoYsUflm\n", "nTvoTTacFHE=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3562 = StringFog.decrypt("oea5Q0PAgKGX14k=\n", "5bL7ESau5MQ=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3561 = StringFog.decrypt("r2ddtzJzWg2FVm26P0JPBoVWbQ==\n", "6zMf9lYxO2M=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3560 = StringFog.decrypt("8kA2ZHlwSGXTVhVLc1dbWt9nAEBzV1s=\n", "thR0JR0yKRY=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3559 = StringFog.decrypt("N+oULvh+sdsW9zgb+U6j3BrKPw7wcLnbB9s4Cu4=\n", "c75Wb5w80Kg=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3558 = StringFog.decrypt("9mlEYAEOvBbeX2dCDg==\n", "sj0GIWVN3Xo=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3557 = StringFog.decrypt("ECmJpGKWles1E6+AYp+E6CAYpYB0\n", "VH3L5QbT7Zs=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3556 = StringFog.decrypt("nzcIXx5eca++ETlqE2N2urcvI20OcnG+qQ==\n", "22NKHnoXH9s=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3555 = StringFog.decrypt("eu1/Ls2hL6hK3FMK2w==\n", "Prk9b6ntRts=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3554 = StringFog.decrypt("Hoz/AIjPLDM4htMSjuMqJg==\n", "Ss6yYeauS1Y=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3553 = StringFog.decrypt("LvQNmkeV5Z4VxBuHUID5iR8=\n", "erZI4iL2kOo=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3552 = StringFog.decrypt("LWf88WfSlkIfY+bMYMefcQ9j5s5g0oo=\n", "bBePuAmm8zA=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3551 = StringFog.decrypt("9rJTLlVW95P6sxBhREi4iPGuEGFXT/+f/KlHLnVL5aD7qVtyR0//nfy8UkFXT/+f/KlH\n", "ld0+ADQ7luk=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3550 = StringFog.decrypt("tfqzeT+aiyKd/KlMIg==\n", "9IrAOFvb6FY=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3549 = StringFog.decrypt("kv6Qz2XIUG+e/9OAdNYfdJXi04Bn0VhjmOWEz0XVQlSV0J6VbdNYYYg=\n", "8ZH94QSlMRU=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3548 = StringFog.decrypt("e4WoovcRRP9N\n", "OvXb45NHLZo=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f3547 = StringFog.decrypt("sCxI\n", "8Vw7mtF6ZyM=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f3546 = StringFog.decrypt("xRWRDeI=\n", "hGXiTIZD4Gk=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f3545 = StringFog.decrypt("Y7N+bs8IqmJWsWJDxy63\n", "IsMNL6tLxQw=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f3544 = StringFog.decrypt("zVRbhkffVh/4QUaiUQ==\n", "jCQoxyOTP2w=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f3543 = StringFog.decrypt("ofQyfWf4+W2V4TJIT8PvaIXqJE4=\n", "4IRBPAOqnBw=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f3542 = StringFog.decrypt("Nn/hXEgeRakabuY=\n", "dw+SHSxYKts=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f3541 = StringFog.decrypt("TPO45xWjHDVo\n", "DYPLpnH3ZUU=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f3540 = StringFog.decrypt("qqNYkLCWKQOetlil\n", "69Mr0dTETHI=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3539 = StringFog.decrypt("GJJsngyjCmEtkmmqGaM/\n", "f/cY33zQSwU=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f3538 = StringFog.decrypt("uVywVMc3yca4Vg==\n", "3jnEFq5TgKg=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f3537 = StringFog.decrypt("bUeaMTC0HmZaTYcPNg==\n", "CiLuYULdfQM=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f3536 = StringFog.decrypt("oyPx6iUxSMexL+E=\n", "xEaFuUlePJI=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f3535 = StringFog.decrypt("xj7ZA45hONvnNN8vn2Y=\n", "oVutQv4Seb8=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f3534 = StringFog.decrypt("i9DwhGFSkT+I0PY=\n", "7LWExQUe/l4=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f3533 = StringFog.decrypt("D/iFopZkwxwf\n", "aJ3x4/Iyqnk=\n");

    public C1303(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        Matcher matcher = Pattern.compile(StringFog.decrypt("cseJ7ICeF1ABxo3q8Q==\n", "XO2kxNvCc34=\n")).matcher(AdRegistration.getVersion());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3595, new C0385(this));
        hashMap.put(f3594, new C1333(this));
        hashMap.put(f3593, new C1331(this));
        hashMap.put(f3580, new C1328(this));
        hashMap.put(f3592, new C1327(this));
        hashMap.put(f3591, new C1326(this));
        hashMap.put(f3590, new C1324(this));
        hashMap.put(f3589, new C1311(this));
        hashMap.put(f3588, new C1306(this));
        hashMap.put(f3587, new C0504(this));
        hashMap.put(f3586, new C0503(this));
        hashMap.put(f3585, new C0499(this));
        hashMap.put(f3584, new C0455(this));
        hashMap.put(f3583, new C0423(this));
        hashMap.put(f3582, new C0421(this));
        hashMap.put(f3581, new C0398(this));
        hashMap.put(f3539, new C0397(this));
        hashMap.put(f3538, new C0390(this));
        hashMap.put(f3537, new C0389(this));
        hashMap.put(f3536, new C0383(this));
        hashMap.put(f3535, new C0372(this));
        hashMap.put(f3534, new C1347(this));
        hashMap.put(f3533, new C1340(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final String mo4017() {
        return AdRegistration.getVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2137858584:
                if (str.equals(f3571)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -2133119933:
                if (str.equals(f3545)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1987686071:
                if (str.equals(f3555)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1885106463:
                if (str.equals(f3578)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1879113962:
                if (str.equals(f3567)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(f3568)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1554728876:
                if (str.equals(f3575)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1464660218:
                if (str.equals(f3559)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1358954558:
                if (str.equals(f3564)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1293925587:
                if (str.equals(f3576)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1291566264:
                if (str.equals(f3540)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1092884085:
                if (str.equals(f3573)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1090060454:
                if (str.equals(f3570)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -832298225:
                if (str.equals(f3554)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -791598050:
                if (str.equals(f3542)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -723985259:
                if (str.equals(f3562)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -696695160:
                if (str.equals(f3577)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -694845532:
                if (str.equals(f3574)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -466918522:
                if (str.equals(f3560)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -341719851:
                if (str.equals(f3561)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -300800492:
                if (str.equals(f3553)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -197992833:
                if (str.equals(f3552)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -27446238:
                if (str.equals(f3557)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 66052:
                if (str.equals(f3547)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 63478087:
                if (str.equals(f3546)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 355568411:
                if (str.equals(f3544)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 568188517:
                if (str.equals(f3563)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 620798166:
                if (str.equals(f3569)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 788901082:
                if (str.equals(f3558)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1036908700:
                if (str.equals(f3579)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1251356764:
                if (str.equals(f3549)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1306698049:
                if (str.equals(f3572)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1328085269:
                if (str.equals(f3556)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1340383521:
                if (str.equals(f3541)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1340427404:
                if (str.equals(f3548)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1600627740:
                if (str.equals(f3543)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1648408950:
                if (str.equals(f3550)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1713728997:
                if (str.equals(f3551)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(f3566)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2144664800:
                if (str.equals(f3565)) {
                    c = 14;
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
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case '\b':
                return DTBAdLoader.class;
            case '\t':
                return DTBAdRequest.class;
            case '\n':
                return DTBAdResponse.class;
            case 11:
            case '\f':
                return DTBAdView.class;
            case '\r':
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return C1304.class;
            case 26:
                return C1305.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case ' ':
                return Aps.class;
            case '!':
                return ApsAd.class;
            case '\"':
                return ApsAdController.class;
            case '#':
                return ApsAdListener.class;
            case '$':
                return ApsAdRequestListener.class;
            case '%':
                return ApsAdFormat.class;
            case '&':
                return ApsAdType.class;
            case '\'':
                return ApsAdRequest.class;
            default:
                return null;
        }
    }
}
