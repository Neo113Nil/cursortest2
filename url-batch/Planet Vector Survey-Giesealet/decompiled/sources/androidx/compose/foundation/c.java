package androidx.compose.foundation;

import defpackage.gh;
import defpackage.gi;
import defpackage.lt0;
import defpackage.r50;
import defpackage.r60;
import defpackage.rx;
import defpackage.u50;
import defpackage.vx;
import defpackage.xn;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class c {
    public static final lt0 a = new lt0(gi.m);

    public static final u50 a(r60 r60Var, rx rxVar) {
        return rxVar == null ? r50.a : rxVar instanceof vx ? new IndicationModifierElement(r60Var, (vx) rxVar) : new gh(new xn(1, rxVar, r60Var));
    }
}
