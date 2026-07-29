package com.onevcat.uniwebview.internal.obfuscated;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A2 extends AlertDialog {
    public TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(Context context, String message) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        a(context, message);
    }

    public final void a(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(30, 30, 30, 30);
        linearLayout.setGravity(16);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        linearLayout.addView(progressBar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(16.0f);
        this.a = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(30);
        linearLayout.addView(this.a, layoutParams);
        setView(linearLayout);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.A2$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return A2.a(dialogInterface, i, keyEvent);
            }
        });
    }

    public static final boolean a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }
}
