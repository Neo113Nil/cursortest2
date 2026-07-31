package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.safedk.android.internal.partials.YandexFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes14.dex */
public final class fv0 {
    public static final byte[] d = {0, 1, 0, 0};
    public static final byte[] e;
    public final Context a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Lazy c = LazyKt.lazy(new cv0(this));

    static {
        byte[] bytes = "OTTO".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        e = bytes;
    }

    public fv0(Context context) {
        this.a = context;
    }

    public static final File a(fv0 fv0Var, byte[] bArr, qv0 qv0Var) {
        try {
            ((File) fv0Var.c.getValue()).mkdirs();
            File d2 = fv0Var.d(qv0Var);
            FileOutputStream fileOutputStreamCtor = YandexFilesBridge.fileOutputStreamCtor(d2);
            try {
                fileOutputStreamCtor.write(bArr);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamCtor, null);
                return d2;
            } finally {
            }
        } catch (Exception unused) {
            boolean z = ob1.a;
            try {
                fv0Var.d(qv0Var).delete();
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public final File b(qv0 qv0Var) {
        return new File((File) this.c.getValue(), r43.a(qv0Var.name() + ".ttf"));
    }

    public final File d(qv0 qv0Var) {
        return new File((File) this.c.getValue(), r43.a(qv0Var.name() + ".ttf.tmp"));
    }

    public final Mutex c(qv0 qv0Var) {
        ConcurrentHashMap concurrentHashMap = this.b;
        final dv0 dv0Var = dv0.b;
        return (Mutex) concurrentHashMap.computeIfAbsent(qv0Var, new Function() { // from class: yads.fv0$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fv0.a(Function1.this, obj);
            }
        });
    }

    public final Typeface a(qv0 qv0Var) {
        File b = b(qv0Var);
        if (b.exists() && a(b)) {
            try {
                return Typeface.createFromFile(b);
            } catch (Throwable unused) {
                boolean z = ob1.a;
                try {
                    b.delete();
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            }
        }
        try {
            b.delete();
        } catch (Exception unused3) {
        }
        return null;
    }

    public static final Mutex a(Function1 function1, Object obj) {
        return (Mutex) function1.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (java.util.Arrays.equals(r2, yads.fv0.e) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(File file) {
        boolean z;
        if (!file.isFile() || file.length() < 1024) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4];
                if (fileInputStream.read(bArr) == 4) {
                    if (!Arrays.equals(bArr, d)) {
                    }
                    z = true;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return z;
                }
                z = false;
                CloseableKt.closeFinally(fileInputStream, null);
                return z;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
