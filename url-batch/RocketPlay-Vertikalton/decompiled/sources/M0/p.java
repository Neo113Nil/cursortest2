package M0;

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
    public final r f878c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f879e;

    public p(r rVar, float f2, float f3) {
        this.f878c = rVar;
        this.d = f2;
        this.f879e = f3;
    }

    @Override // M0.t
    public final void a(Matrix matrix, L0.a aVar, int i, Canvas canvas) {
        r rVar = this.f878c;
        float f2 = rVar.f886c;
        float f3 = this.f879e;
        float f4 = rVar.f885b;
        float f5 = this.d;
        RectF rectF = new RectF(RecyclerView.f1949A0, RecyclerView.f1949A0, (float) Math.hypot(f2 - f3, f4 - f5), RecyclerView.f1949A0);
        Matrix matrix2 = this.f889a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.f1949A0, -i);
        int[] iArr = L0.a.i;
        iArr[0] = aVar.f805f;
        iArr[1] = aVar.f804e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f803c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, L0.a.f798j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f878c;
        return (float) Math.toDegrees(Math.atan((rVar.f886c - this.f879e) / (rVar.f885b - this.d)));
    }
}
