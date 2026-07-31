package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public final class i {

    @NonNull
    final Node a;

    public i(@NonNull Node node) {
        this.a = node;
    }

    public final String a() {
        return sg.bigo.ads.dg.a.e(this.a, "type");
    }

    public final String b() {
        return sg.bigo.ads.dg.a.b(this.a);
    }

    public final int c() {
        return sg.bigo.ads.dg.a.d(this.a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.dg.a.d(this.a, VastAttributes.BITRATE).intValue();
    }

    public final String e() {
        return sg.bigo.ads.dg.a.e(this.a, "md5");
    }
}
