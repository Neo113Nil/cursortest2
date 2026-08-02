package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0668Pw {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"Y0rICHp14ARSNu9MlXOQlrQKpJ7V2hwf", "9bmfgm9m8nITbmWk0ICcMAG3MrS", "cwEc0HiI6y8ZhWJ4MUGuUSsWKgKIPOUb", "CeguwAwwe", "1UN8Pz5pD", "KG5kSs2s3o8nfvSCZiVMOrQyfdZTA2DP", "BO8EwxINC4bfwl9QwPIiUjcYWt5Jq71N", "VnsxrIf3KddrD6MinhDJfsdqz9CBs5tu"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
            i4++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-1, 36, 46, 43, 39, Ascii.FS, 52, 8, 32, 47, 45, 36, Ascii.RS, 46, -37, 36, 46, -37, 41, 48, 39, 39, -23, 9, Ascii.FS, 42, 38, 44, 41, Ascii.SUB, Ascii.FS, 42, -41, 32, 42, -41, 37, 44, 35, 35, -27, -65, -54, -43, -46, -51, -54, -35, -46, -40, -41, -119, -49, -54, -46, -43, -50, -51, -105, -34, -32, -35};
    }

    static {
        A03();
        A00 = true;
    }

    public static BitmapDrawable A00(C0889Yn c0889Yn, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (overlayBm != null && (!A00 || A05(c0889Yn, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c0889Yn.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c0889Yn, A02(0, 23, 116));
                    }
                } else {
                    A04(c0889Yn, A02(23, 18, 112));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th) {
            c0889Yn.A07().A9a(A02(59, 3, 42), C8A.A1u, new C8B(th));
            return null;
        }
    }

    public static C0669Px A01(C0889Yn c0889Yn, String str) {
        BitmapDrawable A002;
        try {
            if (TextUtils.isEmpty(str) || (A002 = A00(c0889Yn, str)) == null) {
                return null;
            }
            C0669Px overlayView = new C0669Px(c0889Yn);
            if (Build.VERSION.SDK_INT >= 16) {
                overlayView.setBackground(A002);
            } else {
                overlayView.setBackgroundDrawable(A002);
            }
            overlayView.setClickable(false);
            overlayView.setFocusable(false);
            return overlayView;
        } catch (Throwable th) {
            c0889Yn.A07().A9a(A02(59, 3, 42), C8A.A1u, new C8B(th));
            return null;
        }
    }

    public static void A04(C0889Yn c0889Yn, String str) {
        c0889Yn.A07().A9a(A02(59, 3, 42), C8A.A1u, new C8B(str));
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A05(C0889Yn c0889Yn, Bitmap bitmap) {
        int i = 0;
        while (true) {
            int width = bitmap.getWidth();
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[2] = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61";
            if (i < width) {
                for (int pixel = 0; pixel < x; pixel++) {
                    int x = bitmap.getPixel(i, pixel);
                    if (Color.alpha(x) / 255.0f > 0.03f) {
                        A04(c0889Yn, A02(41, 18, 34));
                        return false;
                    }
                }
                i++;
            } else {
                return true;
            }
        }
    }
}
