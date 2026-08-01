package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class r4 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        yc ycVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                ycVar = new j0(clipData, 3);
            } else {
                zc zcVar = new zc();
                zcVar.g = clipData;
                zcVar.h = 3;
                ycVar = zcVar;
            }
            f80.i(textView, ycVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        yc ycVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            ycVar = new j0(clipData, 3);
        } else {
            zc zcVar = new zc();
            zcVar.g = clipData;
            zcVar.h = 3;
            ycVar = zcVar;
        }
        f80.i(view, ycVar.build());
        return true;
    }
}
