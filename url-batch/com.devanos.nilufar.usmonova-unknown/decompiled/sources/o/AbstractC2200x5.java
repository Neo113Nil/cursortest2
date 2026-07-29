package o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: o.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2200x5 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1312je interfaceC1312je;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC1312je = new Y1(clipData, 3);
            } else {
                C1378ke c1378ke = new C1378ke(0);
                c1378ke.i = clipData;
                c1378ke.j = 3;
                interfaceC1312je = c1378ke;
            }
            AZ.f(textView, interfaceC1312je.mo8build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1312je interfaceC1312je;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC1312je = new Y1(clipData, 3);
        } else {
            C1378ke c1378ke = new C1378ke(0);
            c1378ke.i = clipData;
            c1378ke.j = 3;
            interfaceC1312je = c1378ke;
        }
        AZ.f(view, interfaceC1312je.mo8build());
        return true;
    }
}
