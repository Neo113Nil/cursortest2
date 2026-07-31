package com.smaato.sdk.ng.views.shape.shader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.views.shape.SvgUtil;
import com.smaato.sdk.ng.views.shape.path.parser.PathInfo;

/* loaded from: classes6.dex */
public class SvgShader extends ShaderHelper {
    public static final int BORDER_TYPE_DEFAULT = 0;
    public static final int BORDER_TYPE_FILL = 1;
    public static final int STROKE_CAP_BUTT = 0;
    public static final int STROKE_CAP_DEFAULT = -1;
    public static final int STROKE_CAP_ROUND = 1;
    public static final int STROKE_CAP_SQUARE = 2;
    public static final int STROKE_JOIN_BEVEL = 0;
    public static final int STROKE_JOIN_DEFAULT = -1;
    public static final int STROKE_JOIN_MITER = 1;
    public static final int STROKE_JOIN_ROUND = 2;
    private final Path l;
    private final Path m;
    private final Matrix n;
    private final float[] o;
    private PathInfo p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    public SvgShader() {
        this.l = new Path();
        this.m = new Path();
        this.n = new Matrix();
        this.o = new float[2];
        this.q = -1;
        this.r = 0;
        this.s = -1;
        this.t = -1;
        this.u = 0;
    }

    @Override // com.smaato.sdk.ng.views.shape.shader.ShaderHelper
    public void calculate(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        this.l.reset();
        this.m.reset();
        this.o[0] = this.p.getWidth();
        this.o[1] = this.p.getHeight();
        this.n.reset();
        float[] fArr = this.o;
        float min = Math.min(f / fArr[0], f2 / fArr[1]);
        float round = Math.round((f - (this.o[0] * min)) * 0.5f);
        float round2 = Math.round((f2 - (this.o[1] * min)) * 0.5f);
        this.n.setScale(min, min);
        this.n.postTranslate(round, round2);
        this.p.transform(this.n, this.l);
        Path path = this.l;
        float f9 = this.g;
        path.offset(f9, f9);
        if (this.g > 0) {
            this.n.reset();
            if (this.r == 0) {
                int i3 = this.d;
                int i4 = this.g;
                f6 = i3 - i4;
                f7 = this.e - i4;
                f8 = i4 / 2.0f;
            } else {
                f6 = this.d;
                f7 = this.e;
                f8 = 0.0f;
            }
            float[] fArr2 = this.o;
            float min2 = Math.min(f6 / fArr2[0], f7 / fArr2[1]);
            float round3 = Math.round(((f6 - (this.o[0] * min2)) * 0.5f) + f8);
            float round4 = Math.round(((f7 - (this.o[1] * min2)) * 0.5f) + f8);
            this.n.setScale(min2, min2);
            this.n.postTranslate(round3, round4);
            this.p.transform(this.n, this.m);
        }
        this.n.reset();
        this.c.invert(this.n);
        this.l.transform(this.n);
    }

    @Override // com.smaato.sdk.ng.views.shape.shader.ShaderHelper
    public void draw(Canvas canvas, Paint paint, Paint paint2) {
        canvas.save();
        canvas.drawPath(this.m, paint2);
        canvas.concat(this.c);
        canvas.drawPath(this.l, paint);
        canvas.restore();
    }

    @Override // com.smaato.sdk.ng.views.shape.shader.ShaderHelper
    public void init(Context context, AttributeSet attributeSet, int i) {
        super.init(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShaderImageView, i, 0);
            this.q = obtainStyledAttributes.getResourceId(R.styleable.ShaderImageView_siShape, this.q);
            this.r = obtainStyledAttributes.getInt(R.styleable.ShaderImageView_siBorderType, this.r);
            this.s = obtainStyledAttributes.getInt(R.styleable.ShaderImageView_siStrokeCap, this.s);
            this.t = obtainStyledAttributes.getInt(R.styleable.ShaderImageView_siStrokeJoin, this.t);
            this.u = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShaderImageView_siStrokeMiter, this.u);
            obtainStyledAttributes.recycle();
        }
        setShapeResId(context, this.q);
        setBorderType(this.r);
        setStrokeCap(this.s);
        setStrokeJoin(this.t);
        setStrokeMiter(this.u);
    }

    @Override // com.smaato.sdk.ng.views.shape.shader.ShaderHelper
    public void reset() {
        this.l.reset();
        this.m.reset();
    }

    public void setBorderType(int i) {
        this.r = i;
        if (i != 1) {
            this.a.setStyle(Paint.Style.STROKE);
        } else {
            this.a.setStyle(Paint.Style.FILL);
        }
    }

    public void setShapeResId(Context context, int i) {
        if (i == -1) {
            throw new RuntimeException("No resource is defined as shape");
        }
        this.p = SvgUtil.readSvg(context, i);
    }

    public void setStrokeCap(int i) {
        this.s = i;
        if (i == 0) {
            this.a.setStrokeCap(Paint.Cap.BUTT);
        } else if (i == 1) {
            this.a.setStrokeCap(Paint.Cap.ROUND);
        } else {
            if (i != 2) {
                return;
            }
            this.a.setStrokeCap(Paint.Cap.SQUARE);
        }
    }

    public void setStrokeJoin(int i) {
        this.t = i;
        if (i == 0) {
            this.a.setStrokeJoin(Paint.Join.BEVEL);
        } else if (i == 1) {
            this.a.setStrokeJoin(Paint.Join.MITER);
        } else {
            if (i != 2) {
                return;
            }
            this.a.setStrokeJoin(Paint.Join.ROUND);
        }
    }

    public void setStrokeMiter(int i) {
        this.u = i;
        if (i > 0) {
            this.a.setStrokeMiter(i);
        }
    }

    public SvgShader(int i) {
        this.l = new Path();
        this.m = new Path();
        this.n = new Matrix();
        this.o = new float[2];
        this.r = 0;
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.q = i;
    }

    public SvgShader(int i, int i2) {
        this.l = new Path();
        this.m = new Path();
        this.n = new Matrix();
        this.o = new float[2];
        this.s = -1;
        this.t = -1;
        this.u = 0;
        this.q = i;
        this.r = i2;
    }
}
