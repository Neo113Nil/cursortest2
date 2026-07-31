package sg.bigo.ads.ab;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes8.dex */
public final class b {
    ImageView a;
    sg.bigo.ads.y.b b;

    public b(@NonNull sg.bigo.ads.y.b bVar) {
        ImageView imageView;
        Context context;
        this.b = bVar;
        if (bVar == null || (context = bVar.b.f) == null) {
            imageView = null;
        } else {
            imageView = new ImageView(context);
            int a = f.a(context, 38);
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(a, a));
            imageView.setVisibility(8);
        }
        this.a = imageView;
    }

    public final void a() {
        ImageView imageView = this.a;
        if (imageView != null) {
            v.b(imageView);
            this.a = null;
        }
        sg.bigo.ads.y.b bVar = this.b;
        if (bVar != null) {
            bVar.destroy();
            this.b = null;
        }
    }
}
