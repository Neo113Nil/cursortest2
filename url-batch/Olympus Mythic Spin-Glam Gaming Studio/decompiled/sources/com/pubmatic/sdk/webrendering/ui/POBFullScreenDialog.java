package com.pubmatic.sdk.webrendering.ui;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import java.lang.ref.WeakReference;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes12.dex */
public class POBFullScreenDialog extends Dialog {
    private OnDialogCloseListener a;
    private WeakReference b;
    private boolean c;
    private Integer d;

    public interface OnDialogCloseListener {
        void onClose();
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBFullScreenDialog.this.dismiss();
        }
    }

    public POBFullScreenDialog(@NonNull Context context, @NonNull WebView webView, @NonNull OnDialogCloseListener onDialogCloseListener) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.b = new WeakReference(context);
        a(onDialogCloseListener);
        FrameLayout a2 = a(webView, -1, -1);
        if (Build.VERSION.SDK_INT >= 30) {
            POBUtils.setSystemFitWindowsForEdgeToEdge(a2);
        }
        setContentView(a2);
    }

    private void a(OnDialogCloseListener onDialogCloseListener) {
        this.a = onDialogCloseListener;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        OnDialogCloseListener onDialogCloseListener = this.a;
        if (onDialogCloseListener != null) {
            onDialogCloseListener.onClose();
        }
        if (this.c && this.d != null) {
            Context context = (Context) this.b.get();
            if (context instanceof Activity) {
                ((Activity) context).setRequestedOrientation(this.d.intValue());
            }
        }
        this.a = null;
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public void show(int i) {
        Activity ownerActivity;
        show();
        if (!this.c || (ownerActivity = getOwnerActivity()) == null) {
            return;
        }
        this.d = Integer.valueOf(ownerActivity.getRequestedOrientation());
        a(ownerActivity, i);
    }

    private FrameLayout a(View view, int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        frameLayout.addView(view, layoutParams);
        ImageButton createSkipButton = POBUIUtil.createSkipButton(view.getContext(), com.pubmatic.sdk.common.R.id.pob_close_btn, com.pubmatic.sdk.webrendering.R.drawable.pob_ic_close_black_24dp);
        frameLayout.addView(createSkipButton);
        createSkipButton.setOnClickListener(new a());
        return frameLayout;
    }

    private void a(Activity activity, int i) {
        if (i == 0) {
            activity.setRequestedOrientation(-1);
        } else if (i == 2) {
            activity.setRequestedOrientation(6);
        } else if (i == 1) {
            activity.setRequestedOrientation(7);
        }
    }
}
