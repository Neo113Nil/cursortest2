package C;

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
import q1.l;

/* loaded from: classes.dex */
public class i extends l {
    public static Class h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f156j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f157k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f158l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f159a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f160b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f161c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f162e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f163f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f164g;

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
            method2 = l0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = m0(cls2);
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
        this.f159a = cls;
        this.f160b = constructor;
        this.f161c = method2;
        this.d = method3;
        this.f162e = method4;
        this.f163f = method5;
        this.f164g = method;
    }

    public static boolean f0(Object obj, String str, int i2, boolean z2) {
        i0();
        try {
            return ((Boolean) f156j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void i0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f158l) {
            return;
        }
        f158l = true;
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
        f156j = method2;
        f157k = method;
    }

    public static Method l0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void d0(Object obj) {
        try {
            this.f163f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean e0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f161c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface g0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f159a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f164g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean h0(Object obj) {
        try {
            return ((Boolean) this.f162e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean j0() {
        Method method = this.f161c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object k0() {
        try {
            return this.f160b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method m0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // q1.l
    public final Typeface q(Context context, B.g gVar, Resources resources, int i2) {
        if (j0()) {
            Object k02 = k0();
            if (k02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f20a) {
                if (!e0(context, k02, hVar.f21a, hVar.f24e, hVar.f22b, hVar.f23c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    d0(k02);
                    return null;
                }
            }
            if (h0(k02)) {
                return g0(k02);
            }
            return null;
        }
        i0();
        try {
            Object newInstance = i.newInstance(null);
            for (B.h hVar2 : gVar.f20a) {
                File O2 = q1.d.O(context);
                if (O2 == null) {
                    return null;
                }
                try {
                    if (q1.d.q(O2, resources, hVar2.f25f) && f0(newInstance, O2.getPath(), hVar2.f22b, hVar2.f23c)) {
                        O2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    O2.delete();
                    throw th;
                }
                O2.delete();
                return null;
            }
            i0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f157k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // q1.l
    public final Typeface r(Context context, H.k[] kVarArr, int i2) {
        Typeface g02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!j0()) {
            H.k u2 = u(i2, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u2.f229a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(u2.f231c).setItalic(u2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (H.k kVar : kVarArr) {
            if (kVar.f232e == 0) {
                Uri uri = kVar.f229a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, q1.d.a0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object k02 = k0();
        if (k02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            H.k kVar2 = kVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f229a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(k02, byteBuffer, Integer.valueOf(kVar2.f230b), null, Integer.valueOf(kVar2.f231c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    d0(k02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            d0(k02);
            return null;
        }
        if (h0(k02) && (g02 = g0(k02)) != null) {
            return Typeface.create(g02, i2);
        }
        return null;
    }

    @Override // q1.l
    public final Typeface s(Context context, Resources resources, int i2, String str, int i3) {
        if (!j0()) {
            return super.s(context, resources, i2, str, i3);
        }
        Object k02 = k0();
        if (k02 == null) {
            return null;
        }
        if (!e0(context, k02, str, 0, -1, -1, null)) {
            d0(k02);
            return null;
        }
        if (h0(k02)) {
            return g0(k02);
        }
        return null;
    }
}
