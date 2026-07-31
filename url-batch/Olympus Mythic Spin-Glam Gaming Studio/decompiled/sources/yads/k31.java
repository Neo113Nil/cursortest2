package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes12.dex */
public final class k31 extends ro2 {
    public static final Object y = new Object();
    public final Object s;
    public a31 t;
    public final Bitmap.Config u;
    public final int v;
    public final int w;
    public final ImageView.ScaleType x;

    public k31(String str, a31 a31Var, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, b31 b31Var) {
        super(0, str, b31Var);
        this.s = new Object();
        this.o = new we0(2.0f, 1000, 2);
        this.t = a31Var;
        this.u = config;
        this.v = i;
        this.w = i2;
        this.x = scaleType;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        a31 a31Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.s) {
            a31Var = this.t;
        }
        if (a31Var != null) {
            a31Var.a(bitmap);
        }
    }

    public final xp2 b(u82 u82Var) {
        Bitmap decodeByteArray;
        byte[] bArr = u82Var.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.v == 0 && this.w == 0) {
            options.inPreferredConfig = this.u;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = a(this.v, this.w, i, i2, this.x);
            int a2 = a(this.w, this.v, i2, i, this.x);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(i / a, i2 / a2)) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > a || decodeByteArray.getHeight() > a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? new xp2(new ac2(u82Var)) : new xp2(decodeByteArray, b11.a(u82Var));
    }

    @Override // yads.ro2
    public final int f() {
        return 1;
    }

    public static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        xp2 b;
        synchronized (y) {
            try {
                try {
                    b = b(u82Var);
                } catch (OutOfMemoryError e) {
                    int length = u82Var.b.length;
                    boolean z = lm3.a;
                    boolean z2 = ob1.a;
                    return new xp2(new ac2(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // yads.ro2
    public final void a() {
        super.a();
        synchronized (this.s) {
            this.t = null;
        }
    }
}
