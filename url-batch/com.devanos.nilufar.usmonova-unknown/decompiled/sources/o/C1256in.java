package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: o.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1256in extends View implements InterfaceC1625oN {
    public ImageReader h;
    public Image i;
    public Bitmap j;
    public io.flutter.embedding.engine.renderer.e k;
    public final boolean l;
    public final int m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256in(Context context, int i, int i2, int i3) {
        super(context, null);
        ImageReader d = d(i, i2);
        this.l = false;
        this.n = false;
        this.h = d;
        this.m = i3;
        setAlpha(0.0f);
        this.l = AbstractC0022At.y(getContext());
    }

    public static ImageReader d(int i, int i2) {
        ImageReader newInstance;
        if (i <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i + ", set width=1");
            i = 1;
        }
        if (i2 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i2 + ", set height=1");
            i2 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i, i2, 1, 3);
        }
        newInstance = ImageReader.newInstance(i, i2, 1, 3, 768L);
        return newInstance;
    }

    @Override // o.InterfaceC1625oN
    public final void a() {
        if (this.n) {
            setAlpha(0.0f);
            c();
            this.j = null;
            Image image = this.i;
            if (image != null) {
                image.close();
                this.i = null;
            }
            invalidate();
            this.n = false;
        }
    }

    @Override // o.InterfaceC1625oN
    public final void b(io.flutter.embedding.engine.renderer.e eVar) {
        if (AbstractC1888sN.v(this.m) == 0) {
            Surface surface = this.h.getSurface();
            eVar.b = surface;
            eVar.a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.k = eVar;
        this.n = true;
    }

    public final boolean c() {
        if (!this.n) {
            return false;
        }
        Image acquireLatestImage = this.h.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.i;
            if (image != null) {
                image.close();
                this.i = null;
            }
            this.i = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void e(int i, int i2) {
        if (this.k == null) {
            return;
        }
        if (i == this.h.getWidth() && i2 == this.h.getHeight()) {
            return;
        }
        Image image = this.i;
        if (image != null) {
            image.close();
            this.i = null;
        }
        this.h.close();
        this.h = d(i, i2);
    }

    @Override // o.InterfaceC1625oN
    public io.flutter.embedding.engine.renderer.e getAttachedRenderer() {
        return this.k;
    }

    public ImageReader getImageReader() {
        return this.h;
    }

    public Surface getSurface() {
        return this.h.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.i;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.j = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.i.getHeight();
                    Bitmap bitmap = this.j;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.j.getHeight() != height) {
                        this.j = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.j.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.j;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.l) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.h.getWidth() && i2 == this.h.getHeight()) && this.m == 1 && this.n) {
            e(i, i2);
            io.flutter.embedding.engine.renderer.e eVar = this.k;
            Surface surface = this.h.getSurface();
            eVar.b = surface;
            eVar.a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // o.InterfaceC1625oN
    public final void pause() {
    }

    @Override // o.InterfaceC1625oN
    public final void resume() {
    }
}
