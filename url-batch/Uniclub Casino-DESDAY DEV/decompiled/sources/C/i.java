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
public class i extends q1.d {

    /* renamed from: l, reason: collision with root package name */
    public static Class f65l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f66m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f67n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f68o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f69p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f70e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f71f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f72g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f73j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f74k;

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
            method2 = j0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = k0(cls2);
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
        this.f70e = cls;
        this.f71f = constructor;
        this.f72g = method2;
        this.h = method3;
        this.i = method4;
        this.f73j = method5;
        this.f74k = method;
    }

    public static boolean d0(Object obj, String str, int i, boolean z2) {
        g0();
        try {
            return ((Boolean) f67n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f69p) {
            return;
        }
        f69p = true;
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
        f66m = constructor;
        f65l = cls;
        f67n = method2;
        f68o = method;
    }

    public static Method j0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void b0(Object obj) {
        try {
            this.f73j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean c0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f72g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface e0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f70e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f74k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean f0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean h0() {
        Method method = this.f72g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // q1.d
    public final Typeface i(Context context, B.g gVar, Resources resources, int i) {
        if (h0()) {
            Object i02 = i0();
            if (i02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f18a) {
                if (!c0(context, i02, hVar.f19a, hVar.f22e, hVar.f20b, hVar.f21c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    b0(i02);
                    return null;
                }
            }
            if (f0(i02)) {
                return e0(i02);
            }
            return null;
        }
        g0();
        try {
            Object newInstance = f66m.newInstance(null);
            for (B.h hVar2 : gVar.f18a) {
                File P2 = l.P(context);
                if (P2 == null) {
                    return null;
                }
                try {
                    if (l.w(P2, resources, hVar2.f23f) && d0(newInstance, P2.getPath(), hVar2.f20b, hVar2.f21c)) {
                        P2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    P2.delete();
                    throw th;
                }
                P2.delete();
                return null;
            }
            g0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f65l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f68o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Object i0() {
        try {
            return this.f71f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // q1.d
    public final Typeface j(Context context, H.k[] kVarArr, int i) {
        Typeface e02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!h0()) {
            H.k o2 = o(i, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o2.f222a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o2.f224c).setItalic(o2.d).build();
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
            if (kVar.f225e == 0) {
                Uri uri = kVar.f222a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.a0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object i02 = i0();
        if (i02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.k kVar2 = kVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f222a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(i02, byteBuffer, Integer.valueOf(kVar2.f223b), null, Integer.valueOf(kVar2.f224c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    b0(i02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            b0(i02);
            return null;
        }
        if (f0(i02) && (e02 = e0(i02)) != null) {
            return Typeface.create(e02, i);
        }
        return null;
    }

    @Override // q1.d
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) {
        if (!h0()) {
            return super.k(context, resources, i, str, i2);
        }
        Object i02 = i0();
        if (i02 == null) {
            return null;
        }
        if (!c0(context, i02, str, 0, -1, -1, null)) {
            b0(i02);
            return null;
        }
        if (f0(i02)) {
            return e0(i02);
        }
        return null;
    }

    public Method k0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
