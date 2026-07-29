package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public abstract class PO {
    public static C1434lU a() {
        return new C1434lU(null);
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = d(file, inputStream);
                b(inputStream);
                return d;
            } catch (Throwable th) {
                th = th;
                b(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean d(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    b(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            b(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            b(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final String e(SW sw) {
        StringBuilder sb = new StringBuilder();
        f("type: " + sw, sb);
        f("hashCode: " + sw.hashCode(), sb);
        f("javaClass: " + sw.getClass().getCanonicalName(), sb);
        for (InterfaceC1118gg c = sw.c(); c != null; c = c.n()) {
            f("fqName: ".concat(C2304yh.c.w(c)), sb);
            f("javaClass: " + c.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final void f(String str, StringBuilder sb) {
        AbstractC0048Bt.n(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static File g(Context context) {
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

    public static PI h(V5 v5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new PI(AbstractC2094vV.c(v5));
        }
        TextPaint textPaint = new TextPaint(v5.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a = AbstractC1962tV.a(v5);
        int d = AbstractC1962tV.d(v5);
        if (v5.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (v5.getInputType() & 15) != 3) {
                boolean z = v5.getLayoutDirection() == 1;
                switch (v5.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC2094vV.b(AbstractC2028uV.a(v5.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new PI(textPaint, textDirectionHeuristic, a, d);
    }

    public static OQ i(InterfaceC2312yp interfaceC2312yp) {
        OQ oq = new OQ();
        oq.j = AbstractC1473m3.t(oq, oq, interfaceC2312yp);
        return oq;
    }

    public static MappedByteBuffer j(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
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
    }

    public static void m(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2094vV.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void n(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void o(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final void q() {
        throw new UnsupportedOperationException();
    }

    public static ActionMode.Callback r(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC2226xV) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC2226xV) callback).a;
    }

    public static ActionMode.Callback s(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC2226xV) || callback == null) ? callback : new ActionModeCallbackC2226xV(callback, textView);
    }

    public abstract void l(boolean z);

    public abstract MR p(RW rw, InterfaceC1266iy interfaceC1266iy);

    public void k(boolean z) {
    }
}
