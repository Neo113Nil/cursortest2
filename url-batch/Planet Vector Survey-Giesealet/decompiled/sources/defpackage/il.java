package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class il implements do0 {
    public final /* synthetic */ jl a;

    public il(jl jlVar) {
        this.a = jlVar;
    }

    @Override // defpackage.do0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        jl jlVar = this.a;
        float floatValue = ((Number) jlVar.a.c(Float.valueOf(f))).floatValue();
        jlVar.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        jlVar.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
