package net.pubnative.lite.sdk.views;

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
import java.util.List;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.ContentInfo;
import net.pubnative.lite.sdk.models.ContentInfoDisplay;
import net.pubnative.lite.sdk.models.ContentInfoIconXPosition;
import net.pubnative.lite.sdk.utils.PNBitmapDownloader;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.utils.WrapperURLDigger;

/* loaded from: classes9.dex */
public class PNAPIContentInfoView extends FrameLayout {
    private static final int MAX_HEIGHT_DP = 30;
    private static final int MAX_WIDTH_DP = 120;
    private static final String TAG = "PNAPIContentInfoView";
    private List<String> clickTrackers;
    private ContentInfoIconXPosition contentInfoIconXPosition;
    private String iconClickURL;
    private boolean isIconDownloading;
    private final Runnable mCloseTask;
    private LinearLayout mContainerView;
    private ContentInfoDisplay mContentInfoDisplay;
    private ImageView mContentInfoIcon;
    private ContentInfoListener mContentInfoListener;
    private TextView mContentInfoText;
    private Handler mHandler;

    public interface ContentInfoListener {
        void onIconClicked(List<String> list);

        void onLinkClicked(String str);
    }

    public PNAPIContentInfoView(Context context, ContentInfoIconXPosition contentInfoIconXPosition) {
        super(context);
        this.iconClickURL = null;
        this.clickTrackers = null;
        this.isIconDownloading = false;
        this.mContentInfoDisplay = ContentInfoDisplay.SYSTEM_BROWSER;
        this.mCloseTask = new Runnable() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PNAPIContentInfoView.this.closeLayout();
            }
        };
        this.contentInfoIconXPosition = contentInfoIconXPosition;
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeLayout$1(View view) {
        openLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLayout$0(View view) {
        openLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIconClickUrl$2(View view) {
        openLink();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.C);
        p0.startActivity(p1);
    }

    public void closeLayout() {
        this.mContentInfoText.setVisibility(8);
        this.mContentInfoIcon.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PNAPIContentInfoView.this.lambda$closeLayout$1(view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.C, this, me);
        return super.dispatchTouchEvent(me);
    }

    public List<String> getIconClickTrackers() {
        return this.clickTrackers;
    }

    public String getIconClickURL() {
        return this.iconClickURL;
    }

    public void init(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.content_info_left_aligned_layout, (ViewGroup) this, false);
        this.mContainerView = linearLayout;
        this.mContentInfoIcon = (ImageView) linearLayout.findViewById(R.id.ic_context_icon);
        this.mContentInfoText = (TextView) this.mContainerView.findViewById(R.id.tv_context_text);
        addView(this.mContainerView);
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
        String str = this.iconClickURL;
        if (str != null && !TextUtils.isEmpty(str)) {
            this.mContentInfoText.setVisibility(0);
            this.mHandler.postDelayed(this.mCloseTask, 3000L);
            this.mContentInfoIcon.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PNAPIContentInfoView.this.lambda$openLayout$0(view);
                }
            });
        } else {
            ContentInfoListener contentInfoListener = this.mContentInfoListener;
            if (contentInfoListener == null || (list = this.clickTrackers) == null) {
                return;
            }
            contentInfoListener.onIconClicked(list);
        }
    }

    public void openLink() {
        List<String> list;
        if (this.mContentInfoListener != null && this.mContentInfoDisplay != ContentInfoDisplay.SYSTEM_BROWSER && (getContext() instanceof Activity) && !TextUtils.isEmpty(this.iconClickURL)) {
            this.mContentInfoListener.onLinkClicked(this.iconClickURL);
            return;
        }
        ContentInfoListener contentInfoListener = this.mContentInfoListener;
        if (contentInfoListener != null && (list = this.clickTrackers) != null) {
            contentInfoListener.onIconClicked(list);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(this.iconClickURL.trim()));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), intent);
        } catch (Exception e) {
            Log.e(TAG, "error on click content info text", e);
        }
    }

    public void setContentInfoDisplay(ContentInfoDisplay contentInfoDisplay) {
        if (contentInfoDisplay != null) {
            this.mContentInfoDisplay = contentInfoDisplay;
        }
    }

    public void setContentInfoListener(ContentInfoListener contentInfoListener) {
        if (contentInfoListener != null) {
            this.mContentInfoListener = contentInfoListener;
        }
    }

    public void setContextText(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.mContentInfoText.setText(str);
    }

    public void setDpDimensions(ContentInfo contentInfo) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mContentInfoIcon.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mContentInfoText.getLayoutParams();
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
        this.mContentInfoIcon.setLayoutParams(layoutParams);
        this.mContentInfoText.setLayoutParams(layoutParams2);
        this.mContentInfoText.setGravity(16);
    }

    public void setIconClickTrackers(List<String> list) {
        this.clickTrackers = list;
    }

    public void setIconClickUrl(String str) {
        this.iconClickURL = new WrapperURLDigger().getURL(str);
        this.mContentInfoText.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PNAPIContentInfoView.this.lambda$setIconClickUrl$2(view);
            }
        });
    }

    public void setIconId(int i) {
        ImageView imageView;
        if (i == -1 || (imageView = this.mContentInfoIcon) == null) {
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

    public void setIconUrl(String str, final boolean z, final boolean z2) {
        if (str == null || TextUtils.isEmpty(str) || this.isIconDownloading) {
            return;
        }
        this.isIconDownloading = true;
        new PNBitmapDownloader().download(new WrapperURLDigger().getURL(str).trim(), this.mContentInfoIcon.getWidth(), this.mContentInfoIcon.getHeight(), new PNBitmapDownloader.DownloadListener() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView.1
            @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
            public void onDownloadFailed(String str2, Exception exc) {
                PNAPIContentInfoView.this.isIconDownloading = false;
                if (z) {
                    return;
                }
                PNAPIContentInfoView.this.setIconUrl(Ad.CONTENT_INFO_ICON_URL, true);
                if (z2) {
                    return;
                }
                PNAPIContentInfoView.this.setIconClickUrl(Ad.CONTENT_INFO_LINK_URL);
            }

            @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
            public void onDownloadFinish(String str2, Bitmap bitmap) {
                PNAPIContentInfoView.this.isIconDownloading = false;
                if (bitmap != null) {
                    PNAPIContentInfoView.this.mContentInfoIcon.setImageBitmap(bitmap);
                } else {
                    if (z) {
                        return;
                    }
                    PNAPIContentInfoView.this.setIconUrl(Ad.CONTENT_INFO_ICON_URL, true);
                    if (z2) {
                        return;
                    }
                    PNAPIContentInfoView.this.setIconClickUrl(Ad.CONTENT_INFO_LINK_URL);
                }
            }
        });
    }

    public PNAPIContentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iconClickURL = null;
        this.clickTrackers = null;
        this.isIconDownloading = false;
        this.mContentInfoDisplay = ContentInfoDisplay.SYSTEM_BROWSER;
        this.mCloseTask = new Runnable() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PNAPIContentInfoView.this.closeLayout();
            }
        };
        init(context);
    }

    public PNAPIContentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconClickURL = null;
        this.clickTrackers = null;
        this.isIconDownloading = false;
        this.mContentInfoDisplay = ContentInfoDisplay.SYSTEM_BROWSER;
        this.mCloseTask = new Runnable() { // from class: net.pubnative.lite.sdk.views.PNAPIContentInfoView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PNAPIContentInfoView.this.closeLayout();
            }
        };
        init(context);
    }
}
