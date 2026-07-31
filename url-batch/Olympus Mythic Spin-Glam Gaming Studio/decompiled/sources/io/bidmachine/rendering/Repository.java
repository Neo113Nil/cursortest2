package io.bidmachine.rendering;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.MainThread;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.UrlMediaSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0017J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH&J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0001H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH&J&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\fH&J2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\tJ&\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0001H&ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lio/bidmachine/rendering/Repository;", "", "getImage", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "mediaSource", "Lio/bidmachine/rendering/model/MediaSource;", "mediaSourceHolder", "getImage-0E7RQCE", "(Lio/bidmachine/rendering/model/MediaSource;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "resultCallback", "Lio/bidmachine/rendering/Repository$ResultCallback;", "getImageUri", "Landroid/net/Uri;", "Lio/bidmachine/rendering/model/UrlMediaSource;", "getImageUri-0E7RQCE", "(Lio/bidmachine/rendering/model/UrlMediaSource;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "", "getVideo", "getVideo-0E7RQCE", "unholdMediaFiles", "ResultCallback", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface Repository {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H'J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H'¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/rendering/Repository$ResultCallback;", "SuccessType", "Lio/bidmachine/util/ResultCallback;", "Lio/bidmachine/rendering/model/Error;", "onError", "", "error", "onSuccess", "result", "(Ljava/lang/Object;)V", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ResultCallback<SuccessType> extends io.bidmachine.util.ResultCallback<SuccessType, Error> {
        @MainThread
        void onError(@NotNull Error error);

        @Override // io.bidmachine.util.ResultCallback
        @MainThread
        void onSuccess(SuccessType result);
    }

    void getImage(@NotNull MediaSource mediaSource, @NotNull Object mediaSourceHolder, @NotNull ResultCallback<Bitmap> resultCallback);

    @Nullable
    /* renamed from: getImage-0E7RQCE, reason: not valid java name */
    Object mo7894getImage0E7RQCE(@NotNull MediaSource mediaSource, @NotNull Object obj, @NotNull Continuation continuation);

    void getImageUri(@NotNull UrlMediaSource mediaSource, @NotNull Object mediaSourceHolder, @NotNull ResultCallback<Uri> resultCallback);

    @Nullable
    /* renamed from: getImageUri-0E7RQCE, reason: not valid java name */
    Object mo7895getImageUri0E7RQCE(@NotNull UrlMediaSource urlMediaSource, @NotNull Object obj, @NotNull Continuation continuation);

    void getString(@NotNull MediaSource mediaSource, @NotNull Object mediaSourceHolder, @NotNull ResultCallback<String> resultCallback);

    void getVideo(@NotNull MediaSource mediaSource, @NotNull Object mediaSourceHolder, @NotNull ResultCallback<Uri> resultCallback);

    @Nullable
    /* renamed from: getVideo-0E7RQCE, reason: not valid java name */
    Object mo7896getVideo0E7RQCE(@NotNull MediaSource mediaSource, @NotNull Object obj, @NotNull Continuation continuation);

    void unholdMediaFiles(@NotNull Object mediaSourceHolder);
}
