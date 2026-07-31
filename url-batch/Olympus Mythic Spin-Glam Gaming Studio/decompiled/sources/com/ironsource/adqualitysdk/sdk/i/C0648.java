package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٻ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0648 extends AbstractC0593 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1375 = StringFog.decrypt("n3ZF2MJ5Z7uZanD4xg==\n", "+BMxnKsKF9c=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1374 = StringFog.decrypt("xTXdTgOQAcjjNMQ=\n", "olCpGGr0ZKc=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1373 = StringFog.decrypt("j7GRsllv73GBug==\n", "6NTl8z0AghA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1372 = StringFog.decrypt("eta37CfDev10xabmMQ==\n", "HbPDr1WmG4k=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1371 = StringFog.decrypt("yEUn8dF2XXDK\n", "ryBTs6QYORw=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1370 = StringFog.decrypt("w2VxjMeIfk7FeQ==\n", "pAAFyK77DiI=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1369 = StringFog.decrypt("zzbaVO3RU3DJKuxx6sxGbg==\n", "qFOuEISiIxw=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1368 = StringFog.decrypt("0lDju5dxMe/HcO+Npm0w/tp5/oqC\n", "tTWX+fYfX4o=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1367 = StringFog.decrypt("vCjyNtg9bk8=\n", "202GYLFZCyA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1366 = StringFog.decrypt("+u6Ucr2zRxHy/497rLRj\n", "nYvgN8XHF2M=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1365 = StringFog.decrypt("Jy2nSPYe3Mo0Orpk6A==\n", "QEjTCo9quZk=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1364 = StringFog.decrypt("4+jMa8uRylHv9uxhy5HKUe/2\n", "gZG4DpjluDg=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1363 = StringFog.decrypt("OHQ8YYsET2gydCZFrgE=\n", "XxFIMedlLA0=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1362 = StringFog.decrypt("LxEMeu7gVxYt\n", "SHR4O4q0LmY=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1361 = StringFog.decrypt("Urr/BwbQMZNHlu8=\n", "Nd+LVGO8XfY=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1360 = StringFog.decrypt("NWTcuiatzAE1dcGHIbjFPy9y3JYmvNs=\n", "RgGo80jZqXM=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1359 = StringFog.decrypt("71cHVeKB7xj4VxdL7oX6D/JXAQ==\n", "nDJzB4f2jmo=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1358 = StringFog.decrypt("I0y7wuRQIekiZabz8Vsh6SI=\n", "UCnPgIU+T4w=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1357 = StringFog.decrypt("XWlXYcrH7LBoWW1+wQ==\n", "HA0UDqSzid4=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1356 = StringFog.decrypt("bMKcUZLehUZU\n", "LabYOOGu6Sc=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1355 = StringFog.decrypt("X7x6+wBqfQ==\n", "HtgskmQPEkk=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1354 = StringFog.decrypt("brW4wt6d3WJdtJvZ/pj9dUq/m8U=\n", "L9H+t7LxjgE=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1353 = StringFog.decrypt("N7PxronTpy0TpQ==\n", "dte9x/qnwkM=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1352 = StringFog.decrypt("Kka+0eiv9+Ef\n", "ayLstJnakpI=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1351 = StringFog.decrypt("z8f7jFGH0m7688ibQZ/SaevR2g==\n", "jqOp6SDytx0=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1350 = StringFog.decrypt("o8sB8NdfHA==\n", "4q9ypK4vec4=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1349 = StringFog.decrypt("0sOnHQ+o\n", "k6fxdGrfNSk=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1348 = StringFog.decrypt("zxyK/3PaXmb+CYH/c9o=\n", "jX3kkRaoEg8=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1347 = StringFog.decrypt("Vxl7cH+0bHdwDw==\n", "FXgVHhrGOh4=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1346 = StringFog.decrypt("ypxWLGzQU6bAmxEgYJpcps2dHTwr9l+pzZYKGGzRSQ==\n", "o/N4TgW0Psc=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1345 = StringFog.decrypt("maFUiUUECUK1rQ==\n", "28gwxCRnYSs=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1344 = StringFog.decrypt("tMsJquNQ7/mYxyyD\n", "9qJt54Izh5A=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1343 = StringFog.decrypt("FT7tVYM4yO8QI/pZliU=\n", "VkyINPdRvoo=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1342 = StringFog.decrypt("7xwNao7rsXPH\n", "pnFsDeuv0Ac=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1341 = StringFog.decrypt("tXIF5kZn7MWIdRDvdXA=\n", "/BxxgzQUmKw=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1340 = StringFog.decrypt("RSnxc/58exZ4LuR6wGZ8C2kp4GQ=\n", "DEeFFowPD38=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1339 = StringFog.decrypt("Ni6qWQsdve8VNYdR\n", "cFvGNVh+z4o=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1338 = StringFog.decrypt("pNOtIw59I5qMwp0zH1k=\n", "6bbJSm88UOk=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1337 = StringFog.decrypt("Pxd4qSWMqFUF\n", "cnIcwETawTA=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1336 = StringFog.decrypt("KNwnLNBpATki22Ag3CMCOTXafyvYaUIuKNZ+YPRoCDEg5WArzg==\n", "QbMJTrkNbFg=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1335 = StringFog.decrypt("Kq7j2t1me9I=\n", "ZM+Xs6sDOrY=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1334 = StringFog.decrypt("LXjqEeSvCAIQbfsW97g=\n", "YxmeeJLKRGs=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1333 = StringFog.decrypt("6kFpzMh+mW/ASXzz136j\n", "pCAdpb4b1Ao=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1332 = StringFog.decrypt("YoTium0eYz9xhQ==\n", "MOGV2x96Bls=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1331 = StringFog.decrypt("eMIv03T007FmzivGY/7Tpw==\n", "KqdYsgaQttU=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1330 = StringFog.decrypt("k7ZJwFHukVOgk0PbaO6bX7M=\n", "wd8qqByL9To=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1329 = StringFog.decrypt("N6TV8BtbANIEm9/9IQ==\n", "Zc22mFY+ZLs=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1328 = StringFog.decrypt("I7P3kfciWawptLCd+2hGpCm0tJb6L1XjGLW6m9MjUKQrirCW6Q==\n", "StzZ855GNM0=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f1327 = StringFog.decrypt("iwTdMlARaEWkCMsWXDVtUrQZwA==\n", "3W25Vz9BBCQ=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f1326 = StringFog.decrypt("QE766UJRqalKSb3lThuqqV1Iou5KUeq+QESjpX1coK1GcbjqUlC2iUpVvf1CQb0=\n", "KSHUiys1xMg=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f1325 = StringFog.decrypt("jvUK+v6S92Gk5B7h6IjsSg==\n", "3JB7j5vhgyQ=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f1324 = StringFog.decrypt("wjQ=\n", "g1CjYoyhc9I=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f1323 = StringFog.decrypt("fR6l07O6Tl1ZGq3Org==\n", "MGzEutf7LSk=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f1322 = StringFog.decrypt("2ziEW18cTlfXJYwGTgVdUJY+iBcUCUxa0TPHOEgFV1/5NJ0cTA1KQg==\n", "uFfpdTpkPjs=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f1321 = StringFog.decrypt("k6JYxH1NOnmyv17sen06brekQA==\n", "3tA5rRkJUxg=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f1320 = StringFog.decrypt("Q8vLhy/oWQFP1sPaPvFKBg7Nx8tk/VsMScCI5DjxQAlkzcfFJfdoDlTN0MA+6Q==\n", "IKSmqUqQKW0=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1319 = StringFog.decrypt("Ay9HHh1nd1QrL1UDEFpwQSI=\n", "Tl0md3kuGSA=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f1318 = StringFog.decrypt("qHIZ7ClXuqKAcgvxJGq9t4lMEfY5e7qzlw==\n", "5QB4hU0e1NY=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f1317 = StringFog.decrypt("StI64j/iaR9w\n", "B6Bbi1u0AHo=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f1316 = StringFog.decrypt("DHM0WZE/+GoAbjwEgCbrbUF1OBXaKvpnBnh3OoYm4WI5dTwA\n", "bxxZd/RHiAY=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f1315 = StringFog.decrypt("IF+milS0TkkaYa6QRIdJSR8=\n", "bS3H4zDiJyw=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f1314 = StringFog.decrypt("uJVcq2vFadyYnVum\n", "7vQv3yqmHbU=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f1313 = StringFog.decrypt("mTvVZwnkPM2VJt06GP0vytQ92StC6i3SjnrZKhj1OsiOLZYfDe844Jkg0T8F6DU=\n", "+lS4SWycTKE=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f1312 = StringFog.decrypt("rdsvvovA2yM=\n", "+7pcyt2pvlQ=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f1311 = StringFog.decrypt("E/sz/MOHlCcf5juh0p6HIF79P7CIiYU4BLo/sdKWkiIE7XCEx4yQHRnxKQ==\n", "cJRe0qb/5Es=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f1310 = StringFog.decrypt("fkHjD0nnpXVaVvU=\n", "MzOCZi2mwSM=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f1309 = StringFog.decrypt("fuj123s7laZy9f2GaiKGoTPu+ZcwLperdOO2uGwijK5c486cezQ=\n", "HYeY9R5D5co=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f1308 = StringFog.decrypt("12wn/q6pU4vNZCf+na5Tjg==\n", "gQ1UivjANvw=\n");

    public C0648(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﻛ */
    public final String mo3939() {
        try {
            C0568 c0568 = C0860.m4221().f2085;
            String decrypt = StringFog.decrypt("UskpHrgwG5QnySlh\n", "DJVNReRUNck=\n");
            c0568.getClass();
            return C0568.m4057((Object) null, BidMachine.class, decrypt);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾇ */
    public final HashMap mo3940() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1375, new C0710(this));
        hashMap.put(f1374, new C0708(this));
        hashMap.put(f1371, new C0705(this));
        hashMap.put(f1370, new C0701(this));
        hashMap.put(f1369, new C0695(this));
        hashMap.put(f1368, new C0693(this));
        hashMap.put(f1367, new C0682(this));
        hashMap.put(f1373, new C0671(this));
        hashMap.put(f1372, new C0662(this));
        hashMap.put(f1363, new C0732(this));
        hashMap.put(f1362, new C0731(this));
        hashMap.put(f1361, new C0726(this));
        hashMap.put(f1360, new C0725(this));
        hashMap.put(f1359, new C0720(this));
        hashMap.put(f1358, new C0717(this));
        hashMap.put(f1366, new C0714(this));
        hashMap.put(f1365, new C0713(this));
        hashMap.put(f1364, new C0711(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0593
    /* renamed from: ﾒ */
    public final Class mo3941(String str) {
        char c;
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(f1330)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -2032115546:
                if (str.equals(f1343)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1921270373:
                if (str.equals(f1314)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1798479256:
                if (str.equals(f1313)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1683121555:
                if (str.equals(f1344)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1628534628:
                if (str.equals(f1317)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f1348)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1518365947:
                if (str.equals(f1308)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1507727624:
                if (str.equals(f1336)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1371195010:
                if (str.equals(f1339)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1246480821:
                if (str.equals(f1327)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1146475727:
                if (str.equals(f1312)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -1087582685:
                if (str.equals(f1319)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1011229113:
                if (str.equals(f1320)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -838844802:
                if (str.equals(f1311)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -642689680:
                if (str.equals(f1315)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f1332)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -589219056:
                if (str.equals(f1357)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f1352)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -475472046:
                if (str.equals(f1354)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -211807062:
                if (str.equals(f1345)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -150492023:
                if (str.equals(f1337)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1324)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1282165:
                if (str.equals(f1316)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 3368703:
                if (str.equals(f1356)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 141091039:
                if (str.equals(f1322)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f1341)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 503762424:
                if (str.equals(f1355)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 529939434:
                if (str.equals(f1350)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 625873720:
                if (str.equals(f1309)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 713768498:
                if (str.equals(f1333)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 737636858:
                if (str.equals(f1326)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 742497451:
                if (str.equals(f1328)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(f1334)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f1347)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1125320581:
                if (str.equals(f1342)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f1353)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f1331)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f1340)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1387614166:
                if (str.equals(f1351)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1395486086:
                if (str.equals(f1323)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1444286894:
                if (str.equals(f1321)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1461955341:
                if (str.equals(f1329)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1494941328:
                if (str.equals(f1325)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1917129446:
                if (str.equals(f1338)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f1349)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2034998687:
                if (str.equals(f1310)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f1335)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2112955383:
                if (str.equals(f1318)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 2136410007:
                if (str.equals(f1346)) {
                    c = 11;
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
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case '\b':
                return AdView.class;
            case '\t':
                return BannerListener.class;
            case '\n':
            case 11:
                return BannerView.class;
            case '\f':
                return BidMachine.class;
            case '\r':
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case ' ':
                return Ad.class;
            case '!':
            case '\"':
                return MraidActivity.class;
            case '#':
            case '$':
                return MraidDialogActivity.class;
            case '%':
                return MraidInterstitial.class;
            case '&':
                return MraidInterstitialListener.class;
            case '\'':
            case '(':
                return MraidView.class;
            case ')':
                return MraidViewListener.class;
            case '*':
            case '+':
                return VastActivity.class;
            case ',':
            case '-':
                return VastView.class;
            case '.':
            case '/':
                return MraidAdView.class;
            case '0':
                return VastViewListener.class;
            case '1':
                return RequestExtension.class;
            default:
                return null;
        }
    }
}
