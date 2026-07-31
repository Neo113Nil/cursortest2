package com.my.target.instreamads.qrcta.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.my.target.b6;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.qrcta.Position;
import com.my.target.common.models.qrcta.QrCta;
import com.my.target.common.models.qrcta.QrIcon;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class QrCtaView extends FrameLayout {
    private final ImageView a;
    private final ImageView b;
    private final FrameLayout c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final LinearLayout g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a {
        static final int[] a = {-1, -1};
        static final int[] b = {-9187073, -12547358, -13405953};
        static final int[] c = {-7674395, -15551822};
        static final int[] d = {-9643650, -15551982};
        static final int[] e = {-10929, -1595134};
        static final int[] f = {-35453, -1757632};
        static final int[] g = {-32555, -1751631};
        static final int[] h = {-2906369, -7389216};
    }

    public QrCtaView(@NonNull Context context) {
        this(context, null);
    }

    private int[] a(int i) {
        switch (i) {
            case 1:
                return a.b;
            case 2:
                return a.c;
            case 3:
                return a.d;
            case 4:
                return a.e;
            case 5:
                return a.f;
            case 6:
                return a.g;
            case 7:
                return a.h;
            default:
                return a.a;
        }
    }

    private int b(int i) {
        return (i == 1 || i == 3 || i == 5 || i == 6 || i == 7) ? -1 : -16777216;
    }

    private void c(QrCta qrCta) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, a(qrCta.colorScheme));
        gradientDrawable.setCornerRadius(32.0f);
        this.g.setBackground(gradientDrawable);
    }

    private void d(QrCta qrCta) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qrCta.qrImage.getWidth(), qrCta.qrImage.getHeight());
        layoutParams.setMargins(90, 0, 90, 0);
        layoutParams.gravity = 17;
        this.c.setLayoutParams(layoutParams);
        a(qrCta.qrImage);
        a(qrCta.qrIcon);
    }

    private void e(QrCta qrCta) {
        int b = b(qrCta.colorScheme);
        this.d.setText(qrCta.title);
        this.d.setTextColor(b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setQrCta(@NonNull QrCta qrCta) {
        c(qrCta);
        a(qrCta);
        e(qrCta);
        a(this.f.getVisibility() == 0);
        d(qrCta);
        b(qrCta);
    }

    public QrCtaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(QrCta qrCta) {
        int b = b(qrCta.colorScheme);
        this.e.setText(qrCta.additionalText);
        this.e.setTextColor(b);
        a(this.e, 36, 20, 36, 40);
    }

    public void setQrCtaAdditionalTextStyle(@StyleRes int i) {
        this.e.setTextAppearance(i);
    }

    public void setQrCtaTitleTextStyle(@StyleRes int i) {
        this.d.setTextAppearance(i);
    }

    public QrCtaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        TextView textView = new TextView(context);
        this.d = textView;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        LinearLayout linearLayout = new LinearLayout(context);
        this.g = linearLayout;
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        textView.setTextSize(2, 24.0f);
        textView.setGravity(17);
        textView2.setTextSize(2, 18.0f);
        textView2.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.addView(imageView3);
        linearLayout.addView(textView);
        linearLayout.addView(frameLayout);
        linearLayout.addView(textView2);
        addView(linearLayout);
    }

    private void a(QrCta qrCta) {
        ImageData imageData = qrCta.additionalImage;
        if (imageData == null) {
            this.f.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageData.getWidth(), imageData.getHeight());
        layoutParams.gravity = 49;
        this.f.setLayoutParams(layoutParams);
        a(imageData, this.f, 32, 0);
        this.f.setVisibility(0);
    }

    private void a(boolean z) {
        a(this.d, 36, z ? 12 : 40, 36, 20);
    }

    private void a(ImageData imageData) {
        this.a.setLayoutParams(new FrameLayout.LayoutParams(imageData.getWidth(), imageData.getHeight()));
        a(imageData, this.a, 18, 18);
    }

    private void a(QrIcon qrIcon) {
        if (qrIcon == null) {
            this.b.setVisibility(8);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qrIcon.iconImage.getWidth(), qrIcon.iconImage.getHeight());
        layoutParams.setMargins(16, 16, 16, 16);
        layoutParams.gravity = a(qrIcon.position);
        this.b.setLayoutParams(layoutParams);
        a(qrIcon.iconImage, this.b, 16, 16);
        this.b.setVisibility(0);
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    private int a(Position position) {
        int i = position.verticalPosition;
        int i2 = i != 0 ? i != 2 ? 16 : 80 : 48;
        int i3 = position.horizontalPosition;
        return (i3 != 0 ? i3 != 2 ? 1 : 5 : 3) | i2;
    }

    private void a(final ImageData imageData, ImageView imageView, final int i, final int i2) {
        final WeakReference weakReference = new WeakReference(imageView);
        b6.b(imageData).b(new b6.b() { // from class: com.my.target.instreamads.qrcta.view.QrCtaView$$ExternalSyntheticLambda0
            @Override // com.my.target.b6.b
            public final void a(boolean z) {
                QrCtaView.this.a(imageData, i, i2, weakReference, z);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImageData imageData, int i, int i2, WeakReference weakReference, boolean z) {
        Bitmap bitmap = imageData.getBitmap();
        if (bitmap != null) {
            Bitmap a2 = a(bitmap, i, i2);
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                imageView.setImageBitmap(a2);
            }
        }
    }

    private Bitmap a(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = i;
        float f2 = i2;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f2, f2, f2, f2}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }
}
