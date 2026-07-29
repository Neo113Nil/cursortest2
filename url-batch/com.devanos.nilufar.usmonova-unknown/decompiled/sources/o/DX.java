package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class DX extends AbstractC2219xO {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean u(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface v(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // o.AbstractC2219xO
    public final Typeface f(Context context, C1192ho c1192ho, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C1257io c1257io : c1192ho.a) {
                int i3 = c1257io.f;
                File g = PO.g(context);
                if (g != null) {
                    try {
                        if (PO.c(g, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(g);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && u(obj, mappedByteBuffer, c1257io.e, c1257io.b, c1257io.c)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        g.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return v(obj);
        }
        return null;
    }

    @Override // o.AbstractC2219xO
    public final Typeface g(Context context, C1718po[] c1718poArr, int i) {
        Object obj;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            GR gr = new GR(0);
            int length = c1718poArr.length;
            while (true) {
                if (i2 < length) {
                    C1718po c1718po = c1718poArr[i2];
                    Uri uri = c1718po.a;
                    ByteBuffer byteBuffer = (ByteBuffer) gr.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = PO.j(context, uri);
                        gr.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !u(obj, byteBuffer, c1718po.b, c1718po.c, c1718po.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface v = v(obj);
                    if (v != null) {
                        return Typeface.create(v, i);
                    }
                }
            }
        }
        return null;
    }
}
