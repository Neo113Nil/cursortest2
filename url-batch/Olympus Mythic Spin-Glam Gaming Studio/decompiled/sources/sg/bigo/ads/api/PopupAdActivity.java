package sg.bigo.ads.api;

import android.view.Window;

/* loaded from: classes6.dex */
public class PopupAdActivity extends AdActivity {
    @Override // sg.bigo.ads.api.AdActivity
    protected final void a() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
    }
}
