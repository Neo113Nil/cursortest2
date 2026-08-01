package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hp implements dl {
    public final /* synthetic */ g20 d;

    public hp(EmojiCompatInitializer emojiCompatInitializer, g20 g20Var) {
        this.d = g20Var;
    }

    @Override // defpackage.dl
    public final void e(o20 o20Var) {
        (Build.VERSION.SDK_INT >= 28 ? mi.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new kp(), 500L);
        this.d.b(this);
    }

    @Override // defpackage.dl
    public final void a(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void b(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void c(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void d(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void f(o20 o20Var) {
    }
}
