package O0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f582c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f583e;

    public p(r rVar, float f2, float f3) {
        this.f582c = rVar;
        this.d = f2;
        this.f583e = f3;
    }

    @Override // O0.t
    public final void a(Matrix matrix, N0.a aVar, int i, Canvas canvas) {
        r rVar = this.f582c;
        float f2 = rVar.f590c;
        float f3 = this.f583e;
        float f4 = rVar.f589b;
        float f5 = this.d;
        RectF rectF = new RectF(RecyclerView.f1570A0, RecyclerView.f1570A0, (float) Math.hypot(f2 - f3, f4 - f5), RecyclerView.f1570A0);
        Matrix matrix2 = this.f593a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.f1570A0, -i);
        int[] iArr = N0.a.i;
        iArr[0] = aVar.f511f;
        iArr[1] = aVar.f510e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f509c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, N0.a.f504j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f582c;
        return (float) Math.toDegrees(Math.atan((rVar.f590c - this.f583e) / (rVar.f589b - this.d)));
    }
}
