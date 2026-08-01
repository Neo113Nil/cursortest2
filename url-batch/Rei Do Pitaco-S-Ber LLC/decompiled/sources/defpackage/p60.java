package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class p60 extends m60 {
    public static Class B = null;
    public static Constructor C = null;
    public static Method D = null;
    public static Method E = null;
    public static boolean F = false;
    public final Method A;
    public final Class u;
    public final Constructor v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;

    public p60() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = j0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = k0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.u = cls;
        this.v = constructor;
        this.w = method2;
        this.x = method3;
        this.y = method4;
        this.z = method5;
        this.A = method;
    }

    public static boolean f0(Object obj, String str, int i, boolean z) {
        i0();
        try {
            return ((Boolean) D.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void i0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (F) {
            return;
        }
        F = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        C = constructor;
        B = cls;
        D = method2;
        E = method;
    }

    public static Method j0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean e0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.w.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface g0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.u, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean h0(Object obj) {
        try {
            return ((Boolean) this.y.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method k0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.m60
    public final Typeface r(Context context, rj rjVar, Resources resources, int i) {
        Object obj;
        InputStream inputStream;
        sj[] sjVarArr = rjVar.a;
        Method method = this.w;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            i0();
            try {
                Object newInstance = C.newInstance(null);
                for (sj sjVar : sjVarArr) {
                    File M = g8.M(context);
                    if (M != null) {
                        try {
                            try {
                                inputStream = resources.openRawResource(sjVar.f);
                                try {
                                    boolean s = g8.s(M, inputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!s) {
                                        M.delete();
                                        return null;
                                    }
                                    if (!f0(newInstance, M.getPath(), sjVar.b, sjVar.c)) {
                                        M.delete();
                                        return null;
                                    }
                                    M.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStream == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (RuntimeException unused3) {
                            M.delete();
                            return null;
                        } catch (Throwable th4) {
                            M.delete();
                            throw th4;
                        }
                    }
                }
                i0();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) B, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) E.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.v.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            obj = null;
        }
        if (obj != null) {
            int length = sjVarArr.length;
            while (true) {
                if (i2 < length) {
                    sj sjVar2 = sjVarArr[i2];
                    p60 p60Var = this;
                    Context context2 = context;
                    if (p60Var.e0(context2, obj, sjVar2.a, sjVar2.e, sjVar2.b, sjVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(sjVar2.d))) {
                        i2++;
                        this = p60Var;
                        context = context2;
                    } else {
                        try {
                            p60Var.z.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    p60 p60Var2 = this;
                    if (p60Var2.h0(obj)) {
                        return p60Var2.g0(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.m60
    public final Typeface s(Context context, uj[] ujVarArr, int i) {
        Object obj;
        Typeface g0;
        boolean z;
        if (ujVarArr.length >= 1) {
            Method method = this.w;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (uj ujVar : ujVarArr) {
                        if (ujVar.f == 0) {
                            Uri uri = ujVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, g8.Y(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.v.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = ujVarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.z;
                            if (i2 < length) {
                                uj ujVar2 = ujVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(ujVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.x.invoke(obj, byteBuffer, Integer.valueOf(ujVar2.b), null, Integer.valueOf(ujVar2.c), Integer.valueOf(ujVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (h0(obj) && (g0 = g0(obj)) != null) {
                                return Typeface.create(g0, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z3 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    uj ujVar3 = null;
                    for (uj ujVar4 : ujVarArr) {
                        int abs = (Math.abs(ujVar4.c - i3) * 2) + (ujVar4.d == z3 ? 0 : 1);
                        if (ujVar3 == null || i4 > abs) {
                            ujVar3 = ujVar4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(ujVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(ujVar3.c).setItalic(ujVar3.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.m60
    public final Typeface u(Context context, Resources resources, int i, String str) {
        Object obj;
        InputStream inputStream;
        Method method = this.w;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.v.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!e0(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.z.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (h0(obj)) {
                    return g0(obj);
                }
            }
        } else {
            File M = g8.M(context);
            try {
                if (M != null) {
                    try {
                        inputStream = resources.openRawResource(i);
                        try {
                            boolean s = g8.s(M, inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!s) {
                                M.delete();
                                return null;
                            }
                            Typeface createFromFile = Typeface.createFromFile(M.getPath());
                            M.delete();
                            return createFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStream == null) {
                                throw th2;
                            }
                            try {
                                inputStream.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                }
            } catch (RuntimeException unused5) {
                M.delete();
                return null;
            } catch (Throwable th4) {
                M.delete();
                throw th4;
            }
        }
        return null;
    }
}
