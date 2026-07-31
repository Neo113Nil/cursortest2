package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class s02 extends Lambda implements Function0 {
    public final /* synthetic */ ri2 b;
    public final /* synthetic */ q31 c;
    public final /* synthetic */ t02 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s02(ri2 ri2Var, q31 q31Var, t02 t02Var) {
        super(0);
        this.b = ri2Var;
        this.c = q31Var;
        this.d = t02Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Bitmap a = this.b.a(this.c);
        if (a != null) {
            return new BitmapDrawable(this.d.a, a);
        }
        return null;
    }
}
