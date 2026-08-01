package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class o60 {
    public static final m60 a;
    public static final sq b;
    public static Paint c;

    static {
        g8.f("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new s60();
        } else if (i >= 29) {
            a = new r60();
        } else if (i >= 28) {
            a = new q60();
        } else {
            a = new p60();
        }
        b = new sq(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, qj qjVar, Resources resources, int i, String str, int i2, int i3, oo ooVar, boolean z) {
        Typeface r;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = -3;
        if (qjVar instanceof tj) {
            tj tjVar = (tj) qjVar;
            String str2 = tjVar.d;
            r = null;
            int i5 = 1;
            int i6 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = tjVar.a;
                if (arrayList.size() == 1) {
                    build = c(((jj) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList.size()) {
                                        break;
                                    }
                                    jj jjVar = (jj) arrayList.get(i8);
                                    if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(jjVar.f)) {
                                        customFallbackBuilder.setSystemFallback(jjVar.e);
                                        break;
                                    }
                                    String str3 = jjVar.e;
                                    String str4 = jjVar.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + jjVar.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = z.w(d).build();
                                    } else {
                                        try {
                                            z.l();
                                            n60.k();
                                            fontVariationSettings = a8.g(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = z.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = z.e(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i8++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((jj) arrayList.get(i7)).e) == null) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (ooVar != null) {
                    new Handler(Looper.getMainLooper()).post(new l3(ooVar, build, 3));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            boolean z2 = !z ? ooVar != null : tjVar.c != 0;
            int i9 = z ? tjVar.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            uv uvVar = new uv();
            uvVar.f = ooVar;
            ArrayList arrayList2 = tjVar.a;
            pz pzVar = new pz(handler);
            o4 o4Var = new o4(uvVar, pzVar, 8);
            int i10 = 4;
            if (!z2) {
                String a2 = pj.a(arrayList2, i3);
                Typeface typeface = (Typeface) pj.a.f(a2);
                if (typeface != null) {
                    pzVar.execute(new g1(uvVar, typeface, i10));
                    r = typeface;
                } else {
                    nj njVar = new nj(i6, o4Var);
                    synchronized (pj.c) {
                        try {
                            e20 e20Var = pj.d;
                            ArrayList arrayList3 = (ArrayList) e20Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(njVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(njVar);
                                e20Var.put(a2, arrayList4);
                                mj mjVar = new mj(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = pj.b;
                                nj njVar2 = new nj(i5, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                qz qzVar = new qz();
                                qzVar.f = mjVar;
                                qzVar.g = njVar2;
                                qzVar.h = handler2;
                                threadPoolExecutor.execute(qzVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    l8.l("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                jj jjVar2 = (jj) arrayList2.get(0);
                sq sqVar = pj.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{jjVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = pj.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) pj.a.f(a3);
                if (typeface2 != null) {
                    pzVar.execute(new g1(uvVar, typeface2, i10));
                    r = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr = {jjVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    oj b2 = pj.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    o4Var.H(b2);
                    r = b2.a;
                } else {
                    try {
                        try {
                            try {
                                oj ojVar = (oj) pj.b.submit(new mj(a3, context, jjVar2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                o4Var.H(ojVar);
                                r = ojVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((pz) o4Var.h).execute(new w8(i4, i6, (uv) o4Var.g));
                    }
                }
            }
        } else {
            r = a.r(context, (rj) qjVar, resources, i3);
            if (ooVar != null) {
                if (r != null) {
                    new Handler(Looper.getMainLooper()).post(new l3(ooVar, r, 3));
                } else {
                    ooVar.f(-3);
                }
            }
        }
        if (r != null) {
            b.j(b(resources, i, str, i2, i3), r);
        }
        return r;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
