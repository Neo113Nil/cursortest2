package com.my.target;

import android.content.Context;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class ib {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class a {
        static final boolean a;
        static final boolean b;

        static {
            boolean z;
            boolean z2 = true;
            try {
                Class.forName(s4.class.getName());
                z = true;
            } catch (Throwable unused) {
                mi.a("ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
                z = false;
            }
            try {
                int i = HlsMediaSource.Factory.$r8$clinit;
            } catch (Throwable unused2) {
                z2 = false;
            }
            a = z;
            b = z2;
        }
    }

    public static boolean a() {
        return a.a;
    }

    public static boolean b() {
        return a.b;
    }

    public static boolean a(c0 c0Var) {
        return c0Var instanceof s4;
    }

    private static float[] b(hb hbVar, float[] fArr, float f) {
        Arrays.sort(fArr);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        int i2 = 0;
        for (eb ebVar : hbVar.d()) {
            if (i2 >= fArr.length) {
                mi.a("MediaUtils: Midroll mediabanner missing - not enough user midPoints");
                ebVar.e(-1.0f);
            } else {
                float f2 = fArr[i2];
                if (f2 > f) {
                    mi.a("MediaUtils: Cannot set midPoint " + f2 + " - out of duration");
                    ebVar.e(-1.0f);
                } else {
                    ebVar.e(f2);
                    treeSet.add(Float.valueOf(f2));
                    if (!"statistics".equals(ebVar.M())) {
                        i2++;
                    }
                }
            }
        }
        for (y yVar : hbVar.g()) {
            if (i2 >= fArr.length) {
                mi.a("MediaUtils: Midroll service missing - not enough user midPoints");
                yVar.b(-1.0f);
            } else {
                float f3 = fArr[i2];
                if (f3 > f) {
                    mi.a("MediaUtils: Cannot set midPoint " + f3 + " - out of duration");
                    yVar.b(-1.0f);
                } else {
                    yVar.b(f3);
                    treeSet.add(Float.valueOf(f3));
                    i2++;
                }
            }
        }
        float[] fArr2 = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            fArr2[i] = ((Float) it.next()).floatValue();
            i++;
        }
        return fArr2;
    }

    public static c0 a(boolean z, Context context) {
        if (z) {
            try {
                if (a()) {
                    return s4.a(context);
                }
            } catch (Throwable th) {
                mi.b("MediaUtils error: exception occurred while creating ExoVideoPlayer: " + th.getMessage());
            }
        }
        return s3.a(context);
    }

    public static float[] a(float f, float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = (f / 100.0f) * fArr[i];
        }
        return fArr2;
    }

    public static float[] a(hb hbVar, float[] fArr, float f) {
        if (fArr != null && fArr.length != 0) {
            return b(hbVar, fArr, f);
        }
        return a(hbVar, f);
    }

    private static float[] a(hb hbVar, float f) {
        float A;
        TreeSet treeSet = new TreeSet();
        for (eb ebVar : hbVar.d()) {
            float f0 = ebVar.f0();
            float g0 = ebVar.g0();
            if (g0 >= 0.0f && g0 <= 100.0f) {
                f0 = f * (g0 / 100.0f);
            } else if (f0 < 0.0f || f0 > f) {
                if (f0 == -1.0f && g0 == -1.0f) {
                    f0 = f * 0.5f;
                } else {
                    mi.a("MediaUtils: Midroll banner " + ebVar.x() + " excluded, had point=" + f0 + ", pointP=" + g0 + ", content duration=" + f);
                }
            }
            float round = Math.round(f0 * 10.0f) / 10.0f;
            ebVar.e(round);
            treeSet.add(Float.valueOf(round));
        }
        for (y yVar : hbVar.g()) {
            float A2 = yVar.A();
            float B = yVar.B();
            if (B >= 0.0f && B <= 100.0f) {
                A = (B / 100.0f) * f;
            } else if (A2 >= 0.0f && A2 <= f) {
                A = yVar.A();
            } else {
                mi.a("MediaUtils: Midroll service " + yVar.u() + " excluded, had point=" + A2 + ", pointP=" + B + ", content duration=" + f);
            }
            float round2 = Math.round(A * 10.0f) / 10.0f;
            yVar.b(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Float) it.next()).floatValue();
            i++;
        }
        return fArr;
    }
}
