package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: o.Lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298Lj implements InterfaceC0061Cg {
    public final /* synthetic */ AbstractC0106Dz h;

    public C0298Lj(EmojiCompatInitializer emojiCompatInitializer, AbstractC0106Dz abstractC0106Dz) {
        this.h = abstractC0106Dz;
    }

    @Override // o.InterfaceC0061Cg
    public final void c(InterfaceC0365Nz interfaceC0365Nz) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0058Cd.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0349Nj(), 500L);
        this.h.b(this);
    }
}
