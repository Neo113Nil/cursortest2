package l;

import K.C0004d;
import K.InterfaceC0003c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0211G {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0003c interfaceC0003c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0003c = new B0.d(clipData, 3);
            } else {
                C0004d c0004d = new C0004d();
                c0004d.f396b = clipData;
                c0004d.f397c = 3;
                interfaceC0003c = c0004d;
            }
            K.T.h(textView, interfaceC0003c.i());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0003c interfaceC0003c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0003c = new B0.d(clipData, 3);
        } else {
            C0004d c0004d = new C0004d();
            c0004d.f396b = clipData;
            c0004d.f397c = 3;
            interfaceC0003c = c0004d;
        }
        K.T.h(view, interfaceC0003c.i());
        return true;
    }
}
