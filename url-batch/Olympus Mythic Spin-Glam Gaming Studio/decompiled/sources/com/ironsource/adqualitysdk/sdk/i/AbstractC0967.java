package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴦ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0967 {

    /* renamed from: טּ, reason: contains not printable characters */
    public static Field f2299;

    /* renamed from: סּ, reason: contains not printable characters */
    public static Field f2300;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static Field f2301;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static Field f2302;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static Object f2303;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static Class f2304;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2316 = StringFog.decrypt("DO/Bu5c8cww56Mm6\n", "TYGlyfhVF1k=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2315 = StringFog.decrypt("xR0kAzAPB8XkOzk0OQgB3A==\n", "qFJKQFxmZK4=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2314 = StringFog.decrypt("YMd1L+mHAftB4WgP45wH4Q==\n", "DYgbe4byYpM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2313 = StringFog.decrypt("YEz6sMBs\n", "DRqT1bcfkOQ=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2312 = StringFog.decrypt("DgzD8/LCnvoRCcTm6Q==\n", "Y0CqgIan8J8=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2311 = StringFog.decrypt("bNXeSpkQNBNl088=\n", "C7CqA/djQHI=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2310 = StringFog.decrypt("RF/g5iHpWU1PTg==\n", "IzqUokSPODg=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2309 = StringFog.decrypt("5IfHCdpVnN7gu90l2laB\n", "icipQLQz85I=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2308 = StringFog.decrypt("PbeMh8dY2Tw1jIurxnnAIySdjKHa\n", "UPjixKg1qVA=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2307 = StringFog.decrypt("vs1tcCxKlEah52dsN1yQQr3ncQ==\n", "04IDIF4v5Cc=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2306 = StringFog.decrypt("h7hUt0LJMveFmkqIQtg8+IOEToFJySs=\n", "6vc65CesWbQ=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2305 = StringFog.decrypt("F0qFqHdP83UbfoW+\n", "egfgzB4uoxk=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnTouchListener m4258(View view) {
        try {
            Object m4260 = m4260(view);
            if (m4260 == null) {
                return null;
            }
            Class<?> cls = m4260.getClass();
            synchronized (AbstractC0530.class) {
                try {
                    if (f2299 == null) {
                        f2299 = m4261(cls, f2314);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnTouchListener) f2299.get(m4260);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View.OnClickListener m4259(View view) {
        try {
            Object m4260 = m4260(view);
            if (m4260 == null) {
                return null;
            }
            Class<?> cls = m4260.getClass();
            synchronized (AbstractC0530.class) {
                try {
                    if (f2300 == null) {
                        f2300 = m4261(cls, f2315);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) f2300.get(m4260);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0026, B:9:0x002e, B:10:0x003a, B:12:0x0044, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:21:0x000b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0026, B:9:0x002e, B:10:0x003a, B:12:0x0044, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:21:0x000b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0026, B:9:0x002e, B:10:0x003a, B:12:0x0044, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:21:0x000b), top: B:1:0x0000 }] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4262() {
        Object obj;
        try {
            if (f2304 != null) {
                if (f2303 == null) {
                }
                Class cls = f2304;
                Object obj2 = f2303;
                if (f2302 == null) {
                    Field declaredField = cls.getDeclaredField(f2313);
                    f2302 = declaredField;
                    declaredField.setAccessible(true);
                }
                obj = f2302.get(obj2);
                if (!(obj instanceof List)) {
                    return new ArrayList((List) obj);
                }
                if (obj instanceof View[]) {
                    return new ArrayList(Arrays.asList((View[]) obj));
                }
                return new ArrayList();
            }
            Class<?> cls2 = Class.forName(StringFog.decrypt("OWzRF4lI3A8ua9ASyHbRTzxtwiiHT9lGPXDyCYlD2U0=\n", "WAK1ZeYhuCE=\n"));
            f2304 = cls2;
            f2303 = cls2.getMethod(f2311, null).invoke(null, null);
            Class cls3 = f2304;
            Object obj22 = f2303;
            if (f2302 == null) {
            }
            obj = f2302.get(obj22);
            if (!(obj instanceof List)) {
            }
        } catch (Throwable th) {
            AbstractC0580.m4073(f2316, StringFog.decrypt("LpqBrrVEwmQfnJqvoETyaAWMnLaKBctgDI2B4bENwHYY0tM=\n", "a+jzwcdkpQE=\n") + th.getLocalizedMessage());
            return new ArrayList();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4266(MediaPlayer mediaPlayer, InterfaceC1280 interfaceC1280) {
        try {
            Field m4261 = m4261(MediaPlayer.class, f2309);
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) m4261.get(mediaPlayer);
            if (onInfoListener instanceof C1263) {
                return;
            }
            m4261.set(mediaPlayer, new C1263(onInfoListener, interfaceC1280));
        } catch (Exception e) {
            AbstractC0577.m4068(f2316, StringFog.decrypt("g0ZweeUHJ8PGRmdm+0YtyKlaT3PzTi/kiFJtWv5UOsiIUXA=\n", "5jQCFpcnTq0=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4263(MediaPlayer mediaPlayer, InterfaceC0380 interfaceC0380) {
        try {
            Field m4261 = m4261(MediaPlayer.class, f2308);
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) m4261.get(mediaPlayer);
            if (onCompletionListener instanceof C1339) {
                return;
            }
            m4261.set(mediaPlayer, new C1339(onCompletionListener, interfaceC0380));
        } catch (Exception e) {
            AbstractC0577.m4068(f2316, StringFog.decrypt("VvymLLZq424T/LEzqCvpZXzgmSagI+tDXOOkL6E+429dwr0wsC/kZUE=\n", "M47UQ8RKigA=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4265(MediaPlayer mediaPlayer, InterfaceC1251 interfaceC1251) {
        try {
            Field m4261 = m4261(MediaPlayer.class, f2307);
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) m4261.get(mediaPlayer);
            if (onPreparedListener instanceof C1247) {
                return;
            }
            m4261.set(mediaPlayer, new C1247(onPreparedListener, interfaceC1251));
        } catch (Exception e) {
            AbstractC0577.m4068(f2316, StringFog.decrypt("tG4p9oIviMHxbj7pnG6Cyp5yFvyUZoD/o3kr+IJqheO4by/8nmqT\n", "0RxbmfAP4a8=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4264(MediaPlayer mediaPlayer, InterfaceC1210 interfaceC1210) {
        try {
            Field m4261 = m4261(MediaPlayer.class, f2306);
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m4261.get(mediaPlayer);
            if (onSeekCompleteListener instanceof C1198) {
                return;
            }
            m4261.set(mediaPlayer, new C1198(onSeekCompleteListener, interfaceC1210));
        } catch (Exception e) {
            AbstractC0577.m4068(f2316, StringFog.decrypt("XrRUVlLXUyobtENJTJZZIXSodVxFnHkrVrZKXFSSdi1IskNXRYU=\n", "O8YmOSD3OkQ=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4260(View view) {
        try {
            synchronized (AbstractC0530.class) {
                try {
                    if (f2301 == null) {
                        f2301 = m4261(View.class, f2312);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f2301.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m4261(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            AbstractC0577.m4068(f2316, StringFog.decrypt("lVHQlohDA2jQRMeNvgYJapFRx528Cg9qlA==\n", "8COi+fpjagY=\n"), (Throwable) e, false);
            return null;
        }
    }
}
