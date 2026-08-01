package O0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends A.c {
    @Override // A.c
    public final void I(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(RecyclerView.f1570A0, RecyclerView.f1570A0, f4, f4);
        qVar.f587f = 180.0f;
        qVar.f588g = 90.0f;
        uVar.f598f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f599g.add(oVar);
        uVar.d = 270.0f;
        float f5 = (RecyclerView.f1570A0 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.f1570A0) / 2.0f;
        double d = 270.0f;
        uVar.f595b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        uVar.f596c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
