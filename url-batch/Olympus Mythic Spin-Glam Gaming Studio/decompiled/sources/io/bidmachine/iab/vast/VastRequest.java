package io.bidmachine.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.DefaultMediaPicker;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.processor.VastMediaPicker;
import io.bidmachine.iab.vast.processor.VastProcessor;
import io.bidmachine.iab.vast.processor.VastProcessorResult;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class VastRequest {

    @NonNull
    public static final String PARAMS_ERROR_CODE = "params_error_code";
    private Uri c;
    private VastAd d;
    private Bundle f;
    private VastMediaPicker g;
    private VastVideoLoadedListener h;
    private VastAdMeasurer i;
    private Float k;
    private float l;
    private boolean m;
    private int n;
    private boolean p;
    private static final VastUrlProcessorRegistry.OnUrlReadyCallback z = new k();
    private static int A = 5;
    private CacheControl b = CacheControl.FullLoad;
    private VideoType e = VideoType.NonRewarded;
    private float j = 3.0f;
    private int o = 0;
    private boolean q = false;
    private boolean r = true;
    private boolean s = true;
    private boolean t = false;
    private boolean u = false;
    private int v = -1;
    private float w = 5.0f;
    private final AtomicBoolean x = new AtomicBoolean(false);
    private final AtomicBoolean y = new AtomicBoolean(false);
    private final String a = UUID.randomUUID().toString();

    public class Builder {
        public Builder() {
        }

        public Builder addExtra(@NonNull String str, @Nullable String str2) {
            VastRequest.this.addExtra(str, str2);
            return this;
        }

        @NonNull
        public VastRequest build() {
            return VastRequest.this;
        }

        public Builder forceUseNativeCloseTime(boolean z) {
            VastRequest.this.m = z;
            return this;
        }

        public Builder setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
            VastRequest.this.i = vastAdMeasurer;
            return this;
        }

        public Builder setAutoClose(boolean z) {
            VastRequest.this.p = z;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            VastRequest.this.b = cacheControl;
            return this;
        }

        public Builder setCompanionCloseTime(int i) {
            VastRequest.this.l = i;
            return this;
        }

        public Builder setMaxDuration(int i) {
            VastRequest.this.n = i;
            return this;
        }

        public Builder setMediaFilePicker(@Nullable VastMediaPicker<MediaFileTag> vastMediaPicker) {
            VastRequest.this.g = vastMediaPicker;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            VastRequest.this.j = f;
            return this;
        }

        public Builder setPreloadCompanion(boolean z) {
            VastRequest.this.s = z;
            return this;
        }

        public Builder setUseScreenSizeForCompanionOrientation(boolean z) {
            VastRequest.this.r = z;
            return this;
        }

        public Builder setUseScreenSizeForVideoOrientation(boolean z) {
            VastRequest.this.q = z;
            return this;
        }

        public Builder setVideoCloseTime(int i) {
            VastRequest.this.k = Float.valueOf(i);
            return this;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class b extends Thread {
        final /* synthetic */ String a;
        final /* synthetic */ VastRequestListener b;
        final /* synthetic */ Context c;

        b(String str, VastRequestListener vastRequestListener, Context context) {
            this.a = str;
            this.b = vastRequestListener;
            this.c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            BufferedReader bufferedReader;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new URL(this.a).openStream()));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        stringBuffer.append(readLine);
                        stringBuffer.append(System.getProperty("line.separator"));
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                bufferedReader.close();
                VastRequest.this.loadVideoWithData(this.c, stringBuffer.toString(), this.b);
            } catch (Exception e2) {
                e = e2;
                bufferedReader2 = bufferedReader;
                VastLog.e("VastRequest", e);
                VastRequest.this.sendVastSpecError(VastSpecError.XML_PARSING);
                VastRequest.this.a(IabError.throwable("Exception during loading xml by url", e), this.b);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }

    class c extends Thread {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ VastRequestListener c;

        c(Context context, String str, VastRequestListener vastRequestListener) {
            this.a = context;
            this.b = str;
            this.c = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest.this.loadVideoWithDataSync(this.a, this.b, this.c);
        }
    }

    class d extends Thread {
        final /* synthetic */ Context a;
        final /* synthetic */ VastRequestListener b;

        d(Context context, VastRequestListener vastRequestListener) {
            this.a = context;
            this.b = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest vastRequest = VastRequest.this;
            vastRequest.a(this.a, vastRequest.d, this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ VastRequestListener a;

        e(VastRequestListener vastRequestListener) {
            this.a = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onVastLoaded(VastRequest.this);
        }
    }

    class f implements Runnable {
        final /* synthetic */ IabError a;
        final /* synthetic */ VastRequestListener b;

        f(IabError iabError, VastRequestListener vastRequestListener) {
            this.a = iabError;
            this.b = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.i != null) {
                VastRequest.this.i.onError(this.a);
            }
            if (this.b != null) {
                if (VastRequest.this.b != CacheControl.PartialLoad || !VastRequest.this.x.get() || VastRequest.this.y.get()) {
                    this.b.onVastLoadFailed(VastRequest.this, this.a);
                    return;
                }
                VastRequestListener vastRequestListener = this.b;
                VastRequest vastRequest = VastRequest.this;
                vastRequestListener.onVastLoadFailed(vastRequest, IabError.expired(String.format("%s load failed after display - %s", vastRequest.b, this.a)));
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ VastActivityListener a;
        final /* synthetic */ IabError b;

        g(VastActivityListener vastActivityListener, IabError iabError) {
            this.a = vastActivityListener;
            this.b = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastActivityListener vastActivityListener = this.a;
            if (vastActivityListener != null) {
                vastActivityListener.onVastShowFailed(VastRequest.this, this.b);
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ VastViewListener a;
        final /* synthetic */ VastView b;
        final /* synthetic */ IabError c;

        h(VastViewListener vastViewListener, VastView vastView, IabError iabError) {
            this.a = vastViewListener;
            this.b = vastView;
            this.c = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastViewListener vastViewListener = this.a;
            if (vastViewListener != null) {
                vastViewListener.onShowFailed(this.b, VastRequest.this, this.c);
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ VastAd a;

        i(VastAd vastAd) {
            this.a = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.h != null) {
                VastRequest.this.h.onSuccess(VastRequest.this, this.a);
            }
        }
    }

    class j implements Runnable {
        final /* synthetic */ IabError a;

        j(IabError iabError) {
            this.a = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.h != null) {
                VastRequest.this.h.onError(VastRequest.this, this.a);
            }
        }
    }

    static class k implements VastUrlProcessorRegistry.OnUrlReadyCallback {
        k() {
        }

        @Override // io.bidmachine.iab.vast.VastUrlProcessorRegistry.OnUrlReadyCallback
        public void onUrlReady(String str) {
            VastLog.d("VastRequest", "Fire url: %s", str);
            Utils.simpleTrackUrl(str);
        }
    }

    static class l implements Comparable {
        public long a;
        public File b;

        public l(File file) {
            this.b = file;
            this.a = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.a;
            long j2 = ((l) obj).a;
            if (j > j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    private VastRequest() {
    }

    public static Builder newBuilder() {
        return new VastRequest().new Builder();
    }

    public static void setCacheSize(int i2) {
        if (i2 > 0) {
            A = i2;
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f == null) {
            this.f = new Bundle();
        }
        this.f.putString(str, str2);
    }

    public boolean canDisplay() {
        return this.x.get() && (this.b != CacheControl.FullLoad || checkFile());
    }

    public boolean checkFile() {
        try {
            Uri uri = this.c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            return new File(this.c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void destroy() {
        this.h = null;
        VastRequestManager.a(this);
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener) {
        display(context, videoType, vastActivityListener, null, null, null);
    }

    public void fireErrorUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            VastUrlProcessorRegistry.processUrls(list, bundle2, z);
        } else {
            VastLog.d("VastRequest", "Url list is null", new Object[0]);
        }
    }

    @NonNull
    public CacheControl getCacheControl() {
        return this.b;
    }

    public float getCompanionCloseTime() {
        return this.l;
    }

    @Nullable
    public Uri getFileUri() {
        return this.c;
    }

    public int getForceOrientation() {
        return this.v;
    }

    public float getFusedVideoCloseTimeSec() {
        return this.w;
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    public int getMaxDurationMillis() {
        return this.n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.d;
        if (vastAd == null) {
            return 2;
        }
        MediaFileTag pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return Utils.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.o;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.d;
    }

    @Nullable
    public Float getVideoCloseTime() {
        return this.k;
    }

    @NonNull
    public VideoType getVideoType() {
        return this.e;
    }

    public boolean isAutoClose() {
        return this.p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.m;
    }

    public boolean isR1() {
        return this.t;
    }

    public boolean isR2() {
        return this.u;
    }

    public void loadVideoWithData(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        VastLog.d("VastRequest", "loadVideoWithData\n%s", str);
        this.d = null;
        if (!Utils.isNetworkAvailable(context)) {
            a(IabError.NO_NETWORK, vastRequestListener);
            return;
        }
        try {
            new c(context, str, vastRequestListener).start();
        } catch (Exception e2) {
            VastLog.e("VastRequest", e2);
            a(IabError.throwable("Exception during creating background thread", e2), vastRequestListener);
        }
    }

    public void loadVideoWithDataSync(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        String str2;
        VastMediaPicker vastMediaPicker = this.g;
        if (vastMediaPicker == null) {
            vastMediaPicker = new DefaultMediaPicker(context);
        }
        VastProcessorResult process = new VastProcessor(this, vastMediaPicker).process(str);
        VastAd vastAd = process.getVastAd();
        this.d = vastAd;
        if (vastAd == null) {
            VastSpecError vastSpecError = process.getVastSpecError();
            if (vastSpecError != null) {
                sendVastSpecError(vastSpecError);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(vastSpecError.getCode()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            a(IabError.badContent(str2), vastRequestListener);
            return;
        }
        vastAd.setVastRequest(this);
        AppodealExtensionTag appodealExtension = this.d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean isAutoRotate = appodealExtension.isAutoRotate();
            if (isAutoRotate != null) {
                if (isAutoRotate.booleanValue()) {
                    this.q = false;
                    this.r = false;
                } else {
                    this.q = true;
                    this.r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            this.t = appodealExtension.isR1();
            this.u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.v = forceOrientation.intValue();
            }
        }
        this.w = a(this.d, appodealExtension).floatValue();
        VastAdMeasurer vastAdMeasurer = this.i;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.onVastModelLoaded(this);
        }
        int i2 = a.a[this.b.ordinal()];
        if (i2 == 1) {
            a(context, this.d, vastRequestListener);
            return;
        }
        if (i2 == 2) {
            a(vastRequestListener);
        } else {
            if (i2 != 3) {
                return;
            }
            a(vastRequestListener);
            a(context, this.d, vastRequestListener);
        }
    }

    public void loadVideoWithUrl(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        VastLog.d("VastRequest", "loadVideoWithUrl - %s", str);
        this.d = null;
        if (!Utils.isNetworkAvailable(context)) {
            a(IabError.NO_NETWORK, vastRequestListener);
            return;
        }
        try {
            new b(str, vastRequestListener, context).start();
        } catch (Exception e2) {
            VastLog.e("VastRequest", e2);
            a(IabError.throwable("Exception during creating background thread", e2), vastRequestListener);
        }
    }

    public void performCache(@NonNull Context context, @Nullable VastRequestListener vastRequestListener) {
        if (this.d == null) {
            a(IabError.internal("VastAd is null during performCache"), vastRequestListener);
            return;
        }
        try {
            new d(context, vastRequestListener).start();
        } catch (Exception e2) {
            VastLog.e("VastRequest", e2);
            a(IabError.throwable("Exception during creating background thread", e2), vastRequestListener);
        }
    }

    public void sendVastSpecError(@NonNull VastSpecError vastSpecError) {
        VastLog.d("VastRequest", "sendVastSpecError - %s", vastSpecError);
        try {
            if (this.d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(PARAMS_ERROR_CODE, vastSpecError.getCode());
                fireErrorUrls(this.d.getErrorUrlList(), bundle);
            }
        } catch (Exception e2) {
            VastLog.e("VastRequest", e2);
        }
    }

    public synchronized void setVastVideoLoadedListener(@Nullable VastVideoLoadedListener vastVideoLoadedListener) {
        this.h = vastVideoLoadedListener;
    }

    public boolean shouldPreloadCompanion() {
        return this.s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.q;
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener, @Nullable VastView vastView, @Nullable VastPlaybackListener vastPlaybackListener, @Nullable MraidAdMeasurer mraidAdMeasurer) {
        VastLog.d("VastRequest", "display", new Object[0]);
        this.y.set(true);
        if (this.d == null) {
            a(IabError.internal("VastAd is null during display VastActivity"), vastActivityListener);
            return;
        }
        this.e = videoType;
        this.o = context.getResources().getConfiguration().orientation;
        IabError display = new VastActivity.Builder().setRequest(this).setListener(vastActivityListener).setVastView(vastView).setPlaybackListener(vastPlaybackListener).setAdMeasurer(this.i).setPostBannerAdMeasurer(mraidAdMeasurer).display(context);
        if (display != null) {
            a(display, vastActivityListener);
        }
    }

    private String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    private Float a(VastAd vastAd, VastExtension vastExtension) {
        Float closeTimeSec = vastExtension != null ? vastExtension.getCloseTimeSec() : null;
        if (isForceUseNativeCloseTime()) {
            closeTimeSec = Utils.max(closeTimeSec, getVideoCloseTime());
        }
        Float min = Utils.min(closeTimeSec, vastAd.getDurationSec());
        return min == null ? Float.valueOf(5.0f) : min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, VastAd vastAd, VastRequestListener vastRequestListener) {
        try {
            Uri a2 = a(context, vastAd.getPickedMediaFileTag().getText());
            if (a2 != null && !TextUtils.isEmpty(a2.getPath()) && new File(a2.getPath()).exists()) {
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a2.getPath(), 1);
                if (createVideoThumbnail != null) {
                    if (!createVideoThumbnail.equals(Bitmap.createBitmap(createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), createVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, a2);
                            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i2 = this.n;
                            if (i2 != 0 && parseLong > i2) {
                                sendVastSpecError(VastSpecError.DURATION);
                                a(IabError.badContent("Estimated duration does not match actual duration"), vastRequestListener);
                            }
                            this.c = a2;
                            a(vastAd);
                            a(vastRequestListener);
                        } catch (Exception e2) {
                            VastLog.e("VastRequest", e2);
                            sendVastSpecError(VastSpecError.BAD_FILE);
                            a(IabError.throwable("Exception during metadata retrieval", e2), vastRequestListener);
                        }
                    } else {
                        VastLog.d("VastRequest", "Empty thumbnail", new Object[0]);
                        sendVastSpecError(VastSpecError.BAD_FILE);
                        a(IabError.badContent("Thumbnail is empty"), vastRequestListener);
                    }
                } else {
                    VastLog.d("VastRequest", "Video file not supported", new Object[0]);
                    sendVastSpecError(VastSpecError.BAD_FILE);
                    a(IabError.badContent("Failed to get thumbnail by file URI"), vastRequestListener);
                }
                a(context);
                return;
            }
            VastLog.d("VastRequest", "fileUri is null", new Object[0]);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.badContent("Can't find video by local URI"), vastRequestListener);
        } catch (Exception e3) {
            VastLog.e("VastRequest", e3);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.throwable("Exception during caching media file", e3), vastRequestListener);
        }
    }

    public void display(@NonNull VastView vastView) {
        this.y.set(true);
        if (this.d == null) {
            a(IabError.internal("VastAd is null during display VastView"), vastView, vastView.getListener());
            return;
        }
        this.e = VideoType.NonRewarded;
        VastRequestManager.store(this);
        vastView.display(this, Boolean.FALSE);
    }

    private Uri a(Context context, String str) {
        String b2 = b(context);
        if (b2 != null) {
            File file = new File(b2);
            if (!file.exists()) {
                file.mkdirs();
            }
            int length = 230 - file.getPath().length();
            String str2 = "temp" + System.currentTimeMillis();
            String replace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(":", "");
            File file2 = new File(file, replace);
            if (file2.exists()) {
                return Uri.fromFile(file2);
            }
            File file3 = new File(file, str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream urlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            FileOutputStream fileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(file3);
            long contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (true) {
                int read = urlConnectionGetInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStreamCtor.write(bArr, 0, read);
                j2 += read;
            }
            fileOutputStreamCtor.close();
            if (contentLength == j2) {
                file3.renameTo(new File(file, replace));
                return Uri.fromFile(new File(file, replace));
            }
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        throw new FileNotFoundException("No dir for caching file");
    }

    private void a(Context context) {
        File[] listFiles;
        try {
            String b2 = b(context);
            if (b2 == null || (listFiles = new File(b2).listFiles()) == null || listFiles.length <= A) {
                return;
            }
            l[] lVarArr = new l[listFiles.length];
            for (int i2 = 0; i2 < listFiles.length; i2++) {
                lVarArr[i2] = new l(listFiles[i2]);
            }
            Arrays.sort(lVarArr);
            for (int i3 = 0; i3 < listFiles.length; i3++) {
                listFiles[i3] = lVarArr[i3].b;
            }
            for (int i4 = A; i4 < listFiles.length; i4++) {
                if (!Uri.fromFile(listFiles[i4]).equals(this.c)) {
                    listFiles[i4].delete();
                }
            }
        } catch (Exception e2) {
            VastLog.e("VastRequest", e2);
        }
    }

    private void a(VastRequestListener vastRequestListener) {
        if (this.x.getAndSet(true)) {
            return;
        }
        VastLog.d("VastRequest", "sendLoaded", new Object[0]);
        if (vastRequestListener != null) {
            Utils.onUiThread(new e(vastRequestListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError, VastRequestListener vastRequestListener) {
        VastLog.d("VastRequest", "sendLoadFailed - %s", iabError);
        a(iabError);
        Utils.onUiThread(new f(iabError, vastRequestListener));
    }

    private void a(IabError iabError, VastActivityListener vastActivityListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new g(vastActivityListener, iabError));
    }

    private void a(IabError iabError, VastView vastView, VastViewListener vastViewListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new h(vastViewListener, vastView, iabError));
    }

    private synchronized void a(VastAd vastAd) {
        if (this.h == null) {
            return;
        }
        Utils.onUiThread(new i(vastAd));
    }

    private synchronized void a(IabError iabError) {
        if (this.h == null) {
            return;
        }
        Utils.onUiThread(new j(iabError));
    }
}
