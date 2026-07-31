package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.RadioButton;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes15.dex */
public final class b extends RadioButton {
    private Paint a;
    private Path b;
    private RectF c;

    public b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setAntiAlias(true);
        this.a.setStrokeJoin(Paint.Join.ROUND);
        this.a.setStrokeCap(Paint.Cap.ROUND);
        this.b = new Path();
        this.c = new RectF();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.c.set(0.0f, 0.0f, width, height);
        float a = f.a(getContext(), 4);
        this.b.addRoundRect(this.c, a, a, Path.Direction.CW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
        if (isChecked()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.a.setColor(-16736769);
            this.a.setStyle(Paint.Style.FILL);
            canvas.translate(width, height * 0.581f);
            canvas.rotate(51.0f);
            canvas.drawRect(this.c, this.a);
            int width2 = canvas.getWidth();
            int height2 = canvas.getHeight();
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeWidth(f.a(getContext(), 1));
            this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            canvas.save();
            float f = height2;
            canvas.translate(width2 * 0.018f, 0.378f * f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo((-0.094f) * f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, f * (-0.188f));
            canvas.drawPath(path, this.a);
            canvas.restore();
            this.a.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }
}
