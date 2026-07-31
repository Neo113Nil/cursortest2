package com.smaato.sdk.ng.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.ContentInfo;
import com.smaato.sdk.ng.models.ContentInfoDisplay;
import com.smaato.sdk.ng.models.ContentInfoIconXPosition;
import com.smaato.sdk.ng.utils.NGSDKBitmapDownloader;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.utils.WrapperURLDigger;
import java.util.List;

/* loaded from: classes9.dex */
public class NGSDKAPIContentInfoView extends FrameLayout {
    private static final String l = "NGSDKAPIContentInfoView";
    private ContentInfoIconXPosition a;
    private String b;
    private List<String> c;
    private boolean d;
    private LinearLayout e;
    private TextView f;
    private ImageView g;
    private ContentInfoListener h;
    private ContentInfoDisplay i;
    private Handler j;
    private final Runnable k;

    public interface ContentInfoListener {
        void onIconClicked(List<String> list);

        void onLinkClicked(String str);
    }

    class a implements NGSDKBitmapDownloader.DownloadListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;

        a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFailed(String str, Exception exc) {
            NGSDKAPIContentInfoView nGSDKAPIContentInfoView = NGSDKAPIContentInfoView.this;
            nGSDKAPIContentInfoView.d = false;
            if (this.a) {
                return;
            }
            nGSDKAPIContentInfoView.setIconUrl(Ad.CONTENT_INFO_ICON_URL, true);
            if (this.b) {
                return;
            }
            NGSDKAPIContentInfoView.this.setIconClickUrl(Ad.CONTENT_INFO_LINK_URL);
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFinish(String str, Bitmap bitmap) {
            NGSDKAPIContentInfoView nGSDKAPIContentInfoView = NGSDKAPIContentInfoView.this;
            nGSDKAPIContentInfoView.d = false;
            if (bitmap != null) {
                nGSDKAPIContentInfoView.g.setImageBitmap(bitmap);
            } else {
                if (this.a) {
                    return;
                }
                nGSDKAPIContentInfoView.setIconUrl(Ad.CONTENT_INFO_ICON_URL, true);
                if (this.b) {
                    return;
                }
                NGSDKAPIContentInfoView.this.setIconClickUrl(Ad.CONTENT_INFO_LINK_URL);
            }
        }
    }

    public NGSDKAPIContentInfoView(Context context, ContentInfoIconXPosition contentInfoIconXPosition) {
        super(context);
        this.b = null;
        this.c = null;
        this.d = false;
        this.i = ContentInfoDisplay.SYSTEM_BROWSER;
        this.k = new Runnable() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NGSDKAPIContentInfoView.this.closeLayout();
            }
        };
        this.a = contentInfoIconXPosition;
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        openLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        openLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        openLink();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    public void closeLayout() {
        this.f.setVisibility(8);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NGSDKAPIContentInfoView.this.a(view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public List<String> getIconClickTrackers() {
        return this.c;
    }

    public String getIconClickURL() {
        return this.b;
    }

    public void init(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.j = new Handler(Looper.getMainLooper());
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.content_info_left_aligned_layout, (ViewGroup) this, false);
        this.e = linearLayout;
        this.g = (ImageView) linearLayout.findViewById(R.id.ic_context_icon);
        this.f = (TextView) this.e.findViewById(R.id.tv_context_text);
        addView(this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void openLayout() {
        List<String> list;
        String str = this.b;
        if (str != null && !TextUtils.isEmpty(str)) {
            this.f.setVisibility(0);
            this.j.postDelayed(this.k, 3000L);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NGSDKAPIContentInfoView.this.b(view);
                }
            });
        } else {
            ContentInfoListener contentInfoListener = this.h;
            if (contentInfoListener == null || (list = this.c) == null) {
                return;
            }
            contentInfoListener.onIconClicked(list);
        }
    }

    public void openLink() {
        List<String> list;
        if (this.h != null && this.i != ContentInfoDisplay.SYSTEM_BROWSER && (getContext() instanceof Activity) && !TextUtils.isEmpty(this.b)) {
            this.h.onLinkClicked(this.b);
            return;
        }
        ContentInfoListener contentInfoListener = this.h;
        if (contentInfoListener != null && (list = this.c) != null) {
            contentInfoListener.onIconClicked(list);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(this.b.trim()));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), intent);
        } catch (Exception e) {
            Log.e(l, "error on click content info text", e);
        }
    }

    public void setContentInfoDisplay(ContentInfoDisplay contentInfoDisplay) {
        if (contentInfoDisplay != null) {
            this.i = contentInfoDisplay;
        }
    }

    public void setContentInfoListener(ContentInfoListener contentInfoListener) {
        if (contentInfoListener != null) {
            this.h = contentInfoListener;
        }
    }

    public void setContextText(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f.setText(str);
    }

    public void setDpDimensions(ContentInfo contentInfo) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        if (contentInfo.getWidth() != -1 && contentInfo.getHeight() != -1) {
            int width = contentInfo.getWidth();
            int height = contentInfo.getHeight();
            if (height > 30 || width > 120) {
                if (width / height == 1) {
                    height = 30;
                    width = 30;
                } else if (width <= height) {
                    width = (int) ((width / height) * 30.0f);
                    height = 30;
                } else if (width > 120) {
                    height = (int) ((height / width) * 120.0f);
                    width = 120;
                }
            }
            layoutParams.width = ViewUtils.asIntPixels(width, getContext());
            float f = height;
            layoutParams.height = ViewUtils.asIntPixels(f, getContext());
            layoutParams2.width = -2;
            layoutParams2.height = ViewUtils.asIntPixels(f, getContext());
        }
        this.g.setLayoutParams(layoutParams);
        this.f.setLayoutParams(layoutParams2);
        this.f.setGravity(16);
    }

    public void setIconClickTrackers(List<String> list) {
        this.c = list;
    }

    public void setIconClickUrl(String str) {
        this.b = new WrapperURLDigger().getURL(str);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NGSDKAPIContentInfoView.this.c(view);
            }
        });
    }

    public void setIconId(int i) {
        ImageView imageView;
        if (i == -1 || (imageView = this.g) == null) {
            return;
        }
        imageView.setId(i);
    }

    public void setIconUrl(String str) {
        setIconUrl(str, false);
    }

    public void setIconUrl(String str, boolean z) {
        setIconUrl(str, z, false);
    }

    public void setIconUrl(String str, boolean z, boolean z2) {
        if (str == null || TextUtils.isEmpty(str) || this.d) {
            return;
        }
        this.d = true;
        new NGSDKBitmapDownloader().download(new WrapperURLDigger().getURL(str).trim(), this.g.getWidth(), this.g.getHeight(), new a(z, z2));
    }

    public NGSDKAPIContentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.c = null;
        this.d = false;
        this.i = ContentInfoDisplay.SYSTEM_BROWSER;
        this.k = new Runnable() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NGSDKAPIContentInfoView.this.closeLayout();
            }
        };
        init(context);
    }

    public NGSDKAPIContentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.i = ContentInfoDisplay.SYSTEM_BROWSER;
        this.k = new Runnable() { // from class: com.smaato.sdk.ng.views.NGSDKAPIContentInfoView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NGSDKAPIContentInfoView.this.closeLayout();
            }
        };
        init(context);
    }
}
