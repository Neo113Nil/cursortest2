package F1;

import E1.AbstractC0001b;
import K.C0019l;
import K.InterfaceC0018k;
import K.S;
import K.T;
import K.Y;
import K.e0;
import M0.u;
import U.v;
import a.y;
import a1.AbstractC0067d;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import z.AbstractC0386d;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f420a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f421b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f422c = false;
    public static Field d;

    public static float B(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Q.e.b(edgeEffect) : RecyclerView.f1949A0;
    }

    public static Drawable C(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable k2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (k2 = AbstractC0067d.k(context, resourceId)) == null) ? typedArray.getDrawable(i) : k2;
    }

    public static File K(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean O(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean Q(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static List T(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i1.f.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Typeface U(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, m(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static MappedByteBuffer V(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static float Y(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static K1.e a() {
        K1.e eVar = K1.e.f741l;
        i1.f.b(eVar);
        K1.e eVar2 = eVar.f743f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            K1.e.i.await(K1.e.f739j, TimeUnit.MILLISECONDS);
            K1.e eVar3 = K1.e.f741l;
            i1.f.b(eVar3);
            if (eVar3.f743f != null || System.nanoTime() - nanoTime < K1.e.f740k) {
                return null;
            }
            return K1.e.f741l;
        }
        long nanoTime2 = eVar2.f744g - System.nanoTime();
        if (nanoTime2 > 0) {
            K1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        K1.e eVar4 = K1.e.f741l;
        i1.f.b(eVar4);
        eVar4.f743f = eVar2.f743f;
        eVar2.f743f = null;
        return eVar2;
    }

    public static X0.c b(X0.c cVar) {
        cVar.f();
        cVar.f1299c = true;
        return cVar.f1298b > 0 ? cVar : X0.c.d;
    }

    public static X0.i c(X0.i iVar) {
        X0.f fVar = iVar.f1318a;
        fVar.b();
        return fVar.i > 0 ? iVar : X0.i.f1317b;
    }

    public static void d(long j2, K1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        K1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((K1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        K1.i iVar = (K1.i) arrayList.get(i2);
        K1.i iVar2 = (K1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            K1.i iVar3 = (K1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f746b / j3) + j2 + 2 + i12 + 1;
            fVar.O(-i12);
            fVar.O(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.O(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((K1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.O(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                K1.f fVar3 = new K1.f();
                fVar.O(((int) ((fVar3.f746b / j3) + j4)) * (-1));
                d(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.L(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((K1.i) arrayList.get(i16 - 1)).d(i8) != ((K1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f746b / j5) + j2 + 2 + (i15 * 2);
        fVar.O(i15);
        fVar.O(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d2 = ((K1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d2 != ((K1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.O(d2 & 255);
            }
        }
        K1.f fVar4 = new K1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d3 = ((K1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d3 != ((K1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((K1.i) arrayList.get(i18)).a()) {
                fVar.O(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.O(((int) ((fVar4.f746b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                d(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.L(fVar4);
    }

    public static final boolean d0(String str) {
        i1.f.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static Z0.i e0(Z0.i iVar, Z0.i iVar2) {
        i1.f.e(iVar2, "context");
        return iVar2 == Z0.j.f1558a ? iVar : (Z0.i) iVar2.q(iVar, Z0.b.d);
    }

    public static V.b f0(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    V.b bVar = new V.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f623a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f624b = i6;
                    bVar.f625c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void g(View view) {
        i1.f.e(view, "<this>");
        Y y2 = new Y(view, null);
        o1.e eVar = new o1.e();
        eVar.d = AbstractC0067d.e(eVar, eVar, y2);
        while (eVar.hasNext()) {
            View view2 = (View) eVar.next();
            R.a aVar = (R.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new R.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f1063a;
            int r0 = W0.k.r0(arrayList);
            if (-1 < r0) {
                arrayList.get(r0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static final void g0(View view, y yVar) {
        i1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j0(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            e0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void k(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC0001b.d(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static int l(Context context, String str) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = AbstractC0386d.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                c2 = AbstractC0386d.c((AppOpsManager) AbstractC0386d.a(context, AppOpsManager.class), d2, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = z.e.c(context);
                c2 = z.e.a(c3, d2, Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = z.e.a(c3, d2, myUid, z.e.b(context));
                }
            } else {
                c2 = AbstractC0386d.c((AppOpsManager) AbstractC0386d.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void l0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static int m(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final void n0(Object obj) {
        if (obj instanceof V0.e) {
            throw ((V0.e) obj).f1245a;
        }
    }

    public static int o0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] q(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static boolean r(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean s2 = s(file, inputStream);
                p(inputStream);
                return s2;
            } catch (Throwable th) {
                th = th;
                p(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean s(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final V0.e t(Throwable th) {
        i1.f.e(th, "exception");
        return new V0.e(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C.g[] u(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = q(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new C.g(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C.g(str.charAt(i3), new float[0]));
        }
        return (C.g[]) arrayList.toArray(new C.g[i]);
    }

    public static C.g[] v(C.g[] gVarArr) {
        C.g[] gVarArr2 = new C.g[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            gVarArr2[i] = new C.g(gVarArr[i]);
        }
        return gVarArr2;
    }

    public static boolean w(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = T.f633a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = S.d;
        S s2 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (s2 == null) {
            s2 = new S();
            s2.f630a = null;
            s2.f631b = null;
            s2.f632c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s2);
        }
        WeakReference weakReference2 = s2.f632c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        s2.f632c = new WeakReference(keyEvent);
        if (s2.f631b == null) {
            s2.f631b = new SparseArray();
        }
        SparseArray sparseArray = s2.f631b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(InterfaceC0018k interfaceC0018k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0018k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0018k.d(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f420a) {
                        try {
                            f421b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f420a = true;
                    }
                    Method method = f421b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z2 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (T.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && T.b(view, keyEvent)) || interfaceC0018k.d(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f422c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f422c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (T.b(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static ColorStateList y(Context context, C0019l c0019l, int i) {
        int resourceId;
        ColorStateList D2;
        TypedArray typedArray = (TypedArray) c0019l.f684b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = d.D(context, resourceId)) == null) ? c0019l.b(i) : D2;
    }

    public static ColorStateList z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList D2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = d.D(context, resourceId)) == null) ? typedArray.getColorStateList(i) : D2;
    }

    public abstract void A(u uVar, float f2, float f3);

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G();

    public abstract int H(View view);

    public abstract int I(CoordinatorLayout coordinatorLayout);

    public abstract int J();

    public int L(View view) {
        return 0;
    }

    public int M() {
        return 0;
    }

    public abstract void N();

    public abstract boolean P(float f2);

    public abstract boolean R(View view);

    public abstract boolean S(float f2, float f3);

    public abstract void W(Throwable th);

    public abstract void X(v vVar);

    public void Z(View view, int i) {
    }

    public abstract void a0(int i);

    public abstract void b0(View view, int i, int i2);

    public abstract void c0(View view, float f2, float f3);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i);

    public abstract void h0(boolean z2);

    public abstract void i0(boolean z2);

    public abstract void k0();

    public abstract boolean m0(View view, float f2);

    public abstract int n(View view, int i);

    public abstract int o(View view, int i);

    public abstract boolean p0(View view, int i);

    public abstract void q0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
