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

/* loaded from: classes.dex */
public class i extends A.c {

    /* renamed from: l, reason: collision with root package name */
    public static Class f102l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f103m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f104n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f105o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f106p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f107e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f108f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f109g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f110j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f111k;

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
            method2 = M0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = N0(cls2);
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
        this.f107e = cls;
        this.f108f = constructor;
        this.f109g = method2;
        this.h = method3;
        this.i = method4;
        this.f110j = method5;
        this.f111k = method;
    }

    public static boolean G0(Object obj, String str, int i, boolean z2) {
        J0();
        try {
            return ((Boolean) f104n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void J0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f106p) {
            return;
        }
        f106p = true;
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
        f103m = constructor;
        f102l = cls;
        f104n = method2;
        f105o = method;
    }

    public static Method M0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void E0(Object obj) {
        try {
            this.f110j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean F0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f109g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface H0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f107e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f111k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean I0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean K0() {
        Method method = this.f109g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object L0() {
        try {
            return this.f108f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method N0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // A.c
    public final Typeface u(Context context, B.g gVar, Resources resources, int i) {
        if (K0()) {
            Object L02 = L0();
            if (L02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f46a) {
                if (!F0(context, L02, hVar.f47a, hVar.f50e, hVar.f48b, hVar.f49c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    E0(L02);
                    return null;
                }
            }
            if (I0(L02)) {
                return H0(L02);
            }
            return null;
        }
        J0();
        try {
            Object newInstance = f103m.newInstance(null);
            for (B.h hVar2 : gVar.f46a) {
                File T2 = A.c.T(context);
                if (T2 == null) {
                    return null;
                }
                try {
                    if (A.c.r(T2, resources, hVar2.f51f) && G0(newInstance, T2.getPath(), hVar2.f48b, hVar2.f49c)) {
                        T2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    T2.delete();
                    throw th;
                }
                T2.delete();
                return null;
            }
            J0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f102l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f105o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // A.c
    public final Typeface v(Context context, H.k[] kVarArr, int i) {
        Typeface H02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!K0()) {
            H.k B2 = B(i, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(B2.f237a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(B2.f239c).setItalic(B2.d).build();
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
            if (kVar.f240e == 0) {
                Uri uri = kVar.f237a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, A.c.i0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object L02 = L0();
        if (L02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.k kVar2 = kVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f237a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(L02, byteBuffer, Integer.valueOf(kVar2.f238b), null, Integer.valueOf(kVar2.f239c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    E0(L02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            E0(L02);
            return null;
        }
        if (I0(L02) && (H02 = H0(L02)) != null) {
            return Typeface.create(H02, i);
        }
        return null;
    }

    @Override // A.c
    public final Typeface w(Context context, Resources resources, int i, String str, int i2) {
        if (!K0()) {
            return super.w(context, resources, i, str, i2);
        }
        Object L02 = L0();
        if (L02 == null) {
            return null;
        }
        if (!F0(context, L02, str, 0, -1, -1, null)) {
            E0(L02);
            return null;
        }
        if (I0(L02)) {
            return H0(L02);
        }
        return null;
    }
}
