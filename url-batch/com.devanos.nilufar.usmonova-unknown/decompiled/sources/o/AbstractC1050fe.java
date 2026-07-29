package o;

import android.view.ViewStructure;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: o.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1050fe {
    public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }
}
