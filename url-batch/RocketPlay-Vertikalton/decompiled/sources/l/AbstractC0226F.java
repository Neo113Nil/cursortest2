package l;

import K.C0011d;
import K.InterfaceC0009c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0226F {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0009c interfaceC0009c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0009c = new A1.d(clipData, 3);
            } else {
                C0011d c0011d = new C0011d();
                c0011d.f654b = clipData;
                c0011d.f655c = 3;
                interfaceC0009c = c0011d;
            }
            K.T.h(textView, interfaceC0009c.h());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0009c interfaceC0009c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0009c = new A1.d(clipData, 3);
        } else {
            C0011d c0011d = new C0011d();
            c0011d.f654b = clipData;
            c0011d.f655c = 3;
            interfaceC0009c = c0011d;
        }
        K.T.h(view, interfaceC0009c.h());
        return true;
    }
}
