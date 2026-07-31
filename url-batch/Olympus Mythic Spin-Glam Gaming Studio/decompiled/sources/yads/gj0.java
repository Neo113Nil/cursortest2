package yads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class gj0 extends Lambda implements Function0 {
    public final /* synthetic */ hj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(hj0 hj0Var) {
        super(0);
        this.b = hj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        vw2 vw2Var;
        Context context = this.b.a;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        String str = a != null ? a.Y : null;
        if (str == null) {
            return null;
        }
        try {
            xv0 valueOf = xv0.valueOf(str);
            if (yv0.a[valueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                typeface = ResourcesCompat.getFont(context, valueOf.b);
            } catch (Throwable unused) {
                typeface = null;
            }
            try {
                typeface2 = ResourcesCompat.getFont(context, valueOf.c);
            } catch (Throwable unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = ResourcesCompat.getFont(context, valueOf.d);
            } catch (Throwable unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = ResourcesCompat.getFont(context, valueOf.e);
            } catch (Throwable unused4) {
                typeface4 = null;
            }
            return new wv0(typeface, typeface2, typeface3, typeface4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
