package o;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class M5 {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;

    public M5(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.c = bArr;
        this.b = 0;
        this.a = bArr.length;
    }

    public static int b(int i, int i2) {
        return d(i2) + i(i);
    }

    public static int c(int i, int i2) {
        return d(i2) + i(i);
    }

    public static int d(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int e(int i, E e) {
        return f(e) + i(i);
    }

    public static int f(E e) {
        int c = e.c();
        return g(c) + c;
    }

    public static int g(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int h(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int i(int i) {
        return g(i << 3);
    }

    public static M5 o(OutputStream outputStream, int i) {
        return new M5(outputStream, new byte[i]);
    }

    public void A(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.c;
        int i = this.b;
        int i2 = this.a;
        int i3 = i2 - i;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.b = i2;
        s();
        if (i4 > i2) {
            ((OutputStream) this.d).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.b = i4;
        }
    }

    public void B(int i) {
        y(i & 255);
        y((i >> 8) & 255);
        y((i >> 16) & 255);
        y((i >> 24) & 255);
    }

    public void C(long j) {
        y(((int) j) & 255);
        y(((int) (j >> 8)) & 255);
        y(((int) (j >> 16)) & 255);
        y(((int) (j >> 24)) & 255);
        y(((int) (j >> 32)) & 255);
        y(((int) (j >> 40)) & 255);
        y(((int) (j >> 48)) & 255);
        y(((int) (j >> 56)) & 255);
    }

    public void D(int i) {
        while ((i & (-128)) != 0) {
            y((i & 127) | 128);
            i >>>= 7;
        }
        y(i);
    }

    public void E(long j) {
        while (((-128) & j) != 0) {
            y((((int) j) & 127) | 128);
            j >>>= 7;
        }
        y((int) j);
    }

    public void F(int i, int i2) {
        D((i << 3) | i2);
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0749b2(i, this));
    }

    public void j() {
        if (((OutputStream) this.d) != null) {
            s();
        }
    }

    public Map k() {
        return C1384kk.h;
    }

    public int l() {
        return this.b;
    }

    public InterfaceC2114vp m() {
        return null;
    }

    public int n() {
        return this.a;
    }

    public void q(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Q5.a(typeface, i, (this.b & 2) != 0);
        }
        R5 r5 = (R5) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (r5.m) {
            r5.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new N5(textView, typeface, r5.j));
                } else {
                    textView.setTypeface(typeface, r5.j);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.ny, o.vp] */
    public void r() {
        ((AbstractC1596ny) this.c).invoke(((AbstractC1415lB) this.d).i);
    }

    public void s() {
        OutputStream outputStream = (OutputStream) this.d;
        if (outputStream == null) {
            throw new C0601Xb("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.c, 0, this.b);
        this.b = 0;
    }

    public void t(int i, int i2) {
        F(i, 0);
        v(i2);
    }

    public void u(int i, int i2) {
        F(i, 0);
        v(i2);
    }

    public void v(int i) {
        if (i >= 0) {
            D(i);
        } else {
            E(i);
        }
    }

    public void w(int i, E e) {
        F(i, 2);
        x(e);
    }

    public void x(E e) {
        D(e.c());
        e.f(this);
    }

    public void y(int i) {
        byte b = (byte) i;
        if (this.b == this.a) {
            s();
        }
        byte[] bArr = (byte[]) this.c;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = b;
    }

    public void z(AbstractC1281j9 abstractC1281j9) {
        int size = abstractC1281j9.size();
        byte[] bArr = (byte[]) this.c;
        int i = this.b;
        int i2 = this.a;
        int i3 = i2 - i;
        if (i3 >= size) {
            abstractC1281j9.l(0, i, size, bArr);
            this.b += size;
            return;
        }
        abstractC1281j9.l(0, i, i3, bArr);
        int i4 = size - i3;
        this.b = i2;
        s();
        if (i4 <= i2) {
            abstractC1281j9.l(i3, 0, i4, bArr);
            this.b = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.d;
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= abstractC1281j9.size()) {
            if (i4 > 0) {
                abstractC1281j9.w(outputStream, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M5(int i, int i2, InterfaceC2114vp interfaceC2114vp, AbstractC1415lB abstractC1415lB) {
        this.a = i;
        this.b = i2;
        this.c = (AbstractC1596ny) interfaceC2114vp;
        this.d = abstractC1415lB;
    }

    public M5(R5 r5, int i, int i2, WeakReference weakReference) {
        this.d = r5;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    public void p(int i) {
    }
}
