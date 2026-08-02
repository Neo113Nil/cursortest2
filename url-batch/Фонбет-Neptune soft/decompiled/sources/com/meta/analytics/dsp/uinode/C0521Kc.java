package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Kc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0521Kc {
    public static byte[] A05;
    public static String[] A06 = {"urwRhK0CK5UGRnO4iaICZFZb7qAlGy", "mzilr1wfe", "SZ9FDPGAkZBACw9tkVUtj7pHN9rS5abx", "dtKk7mnbAbd37arB17jMrf2UHdnm8GOF", "aS5", "gZFI9Tloea", "2aa2EaIeNK", "B3GaWiA9eOHa"};
    public static final Object A07;
    public static final Map<String, String> A08;
    public static final AtomicBoolean A09;
    public final SharedPreferences A00;
    public final C02177f A01;
    public final C8K A02;
    public final String A03;
    public final String A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A06;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A06[1] = "McQY2w52D3qLTV4IvOql";
        A05 = new byte[]{116, 114, 117, 99, 8, 92, 121, 119, 106, 121, 105, 80, 92, 94, Ascii.GS, 82, 93, 87, 65, 92, 90, 87, Ascii.GS, 69, 86, 93, 87, 90, 93, 84, 71, 87, 69, 84, 77, 82, 66, 93, 86, 82, 6, 4, Ascii.SI, 4, 19, 8, 2};
    }

    static {
        A04();
        A08 = new HashMap();
        A07 = new Object();
        A09 = new AtomicBoolean();
    }

    public C0521Kc(C02177f c02177f, String str) {
        this.A01 = c02177f;
        this.A03 = str;
        C8K c8k = new C8K(c02177f, str);
        this.A02 = c8k;
        this.A00 = KE.A00(c02177f);
        this.A04 = A01(1, 4, 27) + str + A01(0, 1, 103) + c8k.A06();
    }

    private final String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static String A02(C02177f c02177f, String str) {
        try {
            PackageManager packageManager = c02177f.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return LG.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A09.compareAndSet(false, true)) {
                c02177f.A07().A9a(A01(40, 7, 73), C8A.A1P, new C8B(e));
            }
            return null;
        }
    }

    public static String A03(String str) {
        String str2;
        synchronized (A07) {
            str2 = A08.get(str);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.equals(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A05() throws JSONException {
        String str = null;
        if (Build.VERSION.SDK_INT < 31) {
            String A01 = A01(5, 1, 39);
            String checksumApiFingerprint = Build.VERSION.CODENAME;
        }
        if (C0478Ih.A2G(this.A01)) {
            String A012 = A01(11, 19, 27);
            String checksumApiFingerprint2 = this.A02.A0B();
            if (A012.equals(checksumApiFingerprint2)) {
                C02177f c02177f = this.A01;
                String checksumApiFingerprint3 = this.A03;
                str = LG.A01(c02177f, checksumApiFingerprint3);
            }
        }
        if (str == null) {
            C02177f c02177f2 = this.A01;
            String checksumApiFingerprint4 = this.A03;
            str = A02(c02177f2, checksumApiFingerprint4);
        } else if (C0478Ih.A1I(this.A01)) {
            C02177f c02177f3 = this.A01;
            String checksumApiFingerprint5 = this.A03;
            String A02 = A02(c02177f3, checksumApiFingerprint5);
            String checksumApiFingerprint6 = A01(6, 5, 50);
            C8B c8b = new C8B(checksumApiFingerprint6);
            c8b.A05(1);
            c8b.A06(1);
            c8b.A0A(false);
            JSONObject checksumsJson = new JSONObject();
            String checksumApiFingerprint7 = A01(30, 5, 12);
            checksumsJson.put(checksumApiFingerprint7, str);
            String checksumApiFingerprint8 = A01(35, 5, 25);
            checksumsJson.put(checksumApiFingerprint8, A02);
            c8b.A07(checksumsJson);
            AnonymousClass89 A072 = this.A01.A07();
            String legacyMd5 = A01(40, 7, 73);
            A072.A9b(legacyMd5, C8A.A1I, c8b);
        }
        synchronized (A07) {
            Map<String, String> map = A08;
            String checksumApiFingerprint9 = this.A03;
            map.put(checksumApiFingerprint9, str);
        }
        SharedPreferences.Editor edit = this.A00.edit();
        String checksumApiFingerprint10 = this.A04;
        edit.putString(checksumApiFingerprint10, str).apply();
    }

    public final void A06() {
        String A00 = A00();
        synchronized (A07) {
            Map<String, String> map = A08;
            String storedFingerprint = this.A03;
            map.put(storedFingerprint, A00);
        }
    }
}
