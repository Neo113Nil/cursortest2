package C;

import F1.l;
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
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends F1.d {
    public static Class h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f240j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f241k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f242l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f243a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f244b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f245c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f246e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f247f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f248g;

    public i() {
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
            method2 = z0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = A0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f243a = cls;
        this.f244b = constructor;
        this.f245c = method2;
        this.d = method3;
        this.f246e = method4;
        this.f247f = method5;
        this.f248g = method;
    }

    public static boolean t0(Object obj, String str, int i2, boolean z2) {
        w0();
        try {
            return ((Boolean) f240j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void w0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f242l) {
            return;
        }
        f242l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        f240j = method2;
        f241k = method;
    }

    public static Method z0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method A0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final void r0(Object obj) {
        try {
            this.f247f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean s0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f245c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface u0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f243a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f248g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // F1.d
    public final Typeface v(Context context, B.g gVar, Resources resources, int i2) {
        if (x0()) {
            Object y02 = y0();
            if (y02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f62a) {
                if (!s0(context, y02, hVar.f63a, hVar.f66e, hVar.f64b, hVar.f65c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    r0(y02);
                    return null;
                }
            }
            if (v0(y02)) {
                return u0(y02);
            }
            return null;
        }
        w0();
        try {
            Object newInstance = i.newInstance(null);
            for (B.h hVar2 : gVar.f62a) {
                File K2 = l.K(context);
                if (K2 == null) {
                    return null;
                }
                try {
                    if (l.r(K2, resources, hVar2.f67f) && t0(newInstance, K2.getPath(), hVar2.f64b, hVar2.f65c)) {
                        K2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    K2.delete();
                    throw th;
                }
                K2.delete();
                return null;
            }
            w0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f241k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final boolean v0(Object obj) {
        try {
            return ((Boolean) this.f246e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // F1.d
    public final Typeface w(Context context, H.j[] jVarArr, int i2) {
        Typeface u02;
        boolean z2;
        if (jVarArr.length < 1) {
            return null;
        }
        if (!x0()) {
            H.j y2 = y(i2, jVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(y2.f561a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(y2.f563c).setItalic(y2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (H.j jVar : jVarArr) {
            if (jVar.f564e == 0) {
                Uri uri = jVar.f561a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.V(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object y02 = y0();
        if (y02 == null) {
            return null;
        }
        int length = jVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            H.j jVar2 = jVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f561a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(y02, byteBuffer, Integer.valueOf(jVar2.f562b), null, Integer.valueOf(jVar2.f563c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    r0(y02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            r0(y02);
            return null;
        }
        if (v0(y02) && (u02 = u0(y02)) != null) {
            return Typeface.create(u02, i2);
        }
        return null;
    }

    @Override // F1.d
    public final Typeface x(Context context, Resources resources, int i2, String str, int i3) {
        if (!x0()) {
            return super.x(context, resources, i2, str, i3);
        }
        Object y02 = y0();
        if (y02 == null) {
            return null;
        }
        if (!s0(context, y02, str, 0, -1, -1, null)) {
            r0(y02);
            return null;
        }
        if (v0(y02)) {
            return u0(y02);
        }
        return null;
    }

    public final boolean x0() {
        Method method = this.f245c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object y0() {
        try {
            return this.f244b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
